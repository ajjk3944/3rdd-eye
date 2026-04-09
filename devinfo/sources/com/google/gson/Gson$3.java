package com.google.gson;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class Gson$3 extends w {
    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        if (bVar.Z() != 9) {
            return Long.valueOf(bVar.O());
        }
        bVar.V();
        return null;
    }

    @Override // com.google.gson.w
    public final void c(yf.c cVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            cVar.A();
        } else {
            cVar.U(number.toString());
        }
    }
}
