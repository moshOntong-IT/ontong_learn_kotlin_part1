fun main() {
    var a = true
    var b = false
    var c = true
    var d = false
  
    if (a || b) {
      println("Hoorah!")
    }
    
    // This expression could also use ||
    if (!b && c) {
      println("Woohoo!")
    }
  
    if (a || d) {
      println("Yay!")
    }
  
    if (!(!d && b)) {
      println("Wow!")
    }
  
  
  }