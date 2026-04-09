package com.google.gson;

import b5.e1;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class l {
    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            yf.c cVar = new yf.c(new e1(2, sb2));
            cVar.f37610h = 1;
            com.google.gson.internal.bind.e.f20833z.c(cVar, this);
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
