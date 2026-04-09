package com.pgl.ssdk;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    public static class a extends t {
        public a(long j6, long j7, int i, long j8, ByteBuffer byteBuffer) {
            super(j6, j7, i, j8, byteBuffer);
        }
    }

    public static a a(q qVar) throws s {
        t tVarA = d.a(qVar);
        return new a(tVarA.a(), tVarA.c(), tVarA.b(), tVarA.e(), tVarA.d());
    }
}
