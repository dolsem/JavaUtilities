package com.dolsem.util;


public class MathUtil {

    private MathUtil() {};

    public static int binlog(int bits) {
        int log = 0;
        if ( (bits & 0xffff0000) != 0 ) { bits >>>= 16; log = 16; }
        if ( bits >= 256 ) { bits >>>= 8; log += 8; }
        if ( bits >= 16  ) { bits >>>= 4; log += 4; }
        if ( bits >= 4   ) { bits >>>= 2; log += 2; }
        return log + ( bits >>> 1 );
    }

    public static int binlog(long bits) {
        int log = 0;
        if ( (bits & 0xffffffff00000000L) != 0 ) { bits >>>= 32; log = 32; }
        return log + binlog((int) bits);
    }
}