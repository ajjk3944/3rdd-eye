package com.pgl.ssdk;

import com.pgl.ssdk.c;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        return h.b(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) {
        return h.c(byteBuffer);
    }

    public static i a(q qVar, c.a aVar, int i) throws a {
        try {
            return h.a(qVar, aVar, i);
        } catch (j e6) {
            throw new a(e6.getMessage());
        }
    }
}
