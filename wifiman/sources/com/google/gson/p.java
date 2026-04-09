package com.google.gson;

import java.io.IOException;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public abstract class p {

    class a extends p {
        a() {
        }

        @Override // com.google.gson.p
        public Object b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return p.this.b(c8268a);
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        public void d(C8270c c8270c, Object obj) throws IOException {
            if (obj == null) {
                c8270c.b0();
            } else {
                p.this.d(c8270c, obj);
            }
        }
    }

    public final p a() {
        return new a();
    }

    public abstract Object b(C8268a c8268a);

    public final g c(Object obj) {
        try {
            com.google.gson.internal.bind.e eVar = new com.google.gson.internal.bind.e();
            d(eVar, obj);
            return eVar.A0();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public abstract void d(C8270c c8270c, Object obj);
}
