package com.github.lcafebabe

import org.scalatra._

class MainServlet extends ScalatraServlet {

  get("/test1") {
    views.html.hello("Hello123654")
  }

  get("/test2") {
    <html>
      <body>
        <h1>Is JRebel working? </h1>
      </body>
    </html>
  }

}
