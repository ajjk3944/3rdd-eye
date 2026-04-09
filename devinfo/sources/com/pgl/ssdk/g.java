package com.pgl.ssdk;

import com.pgl.ssdk.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class g {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return h.b(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) throws com.pgl.ssdk.a {
        return h.c(byteBuffer);
    }

    public static i a(q qVar, c.a aVar, int i4) throws IOException, a {
        try {
            return h.a(qVar, aVar, i4);
        } catch (j e2) {
            throw new a(e2.getMessage());
        }
    }
}
