package com.google.gson;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class w {
    public final w a() {
        return !(this instanceof TypeAdapter$NullSafeTypeAdapter) ? new w() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                if (bVar.Z() != 9) {
                    return this.f20729a.b(bVar);
                }
                bVar.V();
                return null;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                if (obj == null) {
                    cVar.A();
                } else {
                    this.f20729a.c(cVar, obj);
                }
            }

            public final String toString() {
                return "NullSafeTypeAdapter[" + this.f20729a + "]";
            }
        } : this;
    }

    public abstract Object b(yf.b bVar);

    public abstract void c(yf.c cVar, Object obj);
}
