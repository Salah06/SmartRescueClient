//
// gosimpleserv.go  -- A simple server
//
//           Author: Erick Gallesio [eg@unice.fr]
//    Creation date: 17-Oct-2016 14:42 (eg)
// Last file update: 17-Oct-2016 15:50 (eg)
//
// +++
package main

import (
    "net"
    "bufio"
    "log"
    "fmt"
    "gopkg.in/zabawaba99/firego.v1"
)


// +slide
func handleConnection(conn net.Conn) {
    defer conn.Close()

    reader := bufio.NewReader(conn)
    for {
        line,err := reader.ReadString('\n')
        if err != nil {
            log.Println(err)
            return
        }
        fmt.Fprintf(conn, "You said => %s", line);
    }
}

func CheckError(err error) {
    if err  != nil {
        fmt.Println("Error: " , err)
    }
}

func main() {
    f := firego.New("https://smartrescue-6e8ce.firebaseio.com", client)
    f.Auth("AIzaSyAtsc7v1IEUIPsD3dHkIev3B8ysHvunLd0")
    f.Unauth()

    var v map[string]interface{}
    if err := f.Value(&v); err != nil {
        log.Fatal(err)
    
    fmt.Printf("%s\n", v)

}

    /*
    ServerAddr,err := net.ResolveUDPAddr("udp",":2345")
    CheckError(err)


    ServerConn, err := net.ListenUDP("udp", ServerAddr)
    defer ServerConn.Close()
    CheckError(err)

    buf := make([]byte, 1024)

    for {
        n,addr,err := ServerConn.ReadFromUDP(buf)
        fmt.Println("Received ",string(buf[0:n]), " from ",addr)

        if err != nil {
            fmt.Println("Error: ",err)
        } 
        ServerConn.WriteToUDP([]byte("ack"), addr)
    }
}
// ---
// Local Variables:
// compile-command: "go run *.go"
// End:

// pour tester : nc localhost 1234

// on met go pour lancer une fonction en arriere plan (goroutine)