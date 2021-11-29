fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var result: Int = 0;
    var cnt: Int = 0;
    for(item in path) {
        if(item == 'U') {
            cnt++
        } 
        if(item == 'D'){
            cnt--
        }
        
      if(cnt == 0 && item == 'U')
            result++
    }
    return result
}
