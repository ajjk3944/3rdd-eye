package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class NumberTypeAdapter extends w {

    /* renamed from: b, reason: collision with root package name */
    public static final x f20769b = d(v.f20896b);

    /* renamed from: a, reason: collision with root package name */
    public final v f20770a;

    public NumberTypeAdapter(v vVar) {
        this.f20770a = vVar;
    }

    public static x d(v vVar) {
        return new x() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.x
            public final w a(j jVar, xf.a aVar) {
                if (aVar.f37087a == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        int iZ = bVar.Z();
        int iC = i3.e.c(iZ);
        if (iC == 5 || iC == 6) {
            return this.f20770a.a(bVar);
        }
        if (iC == 8) {
            bVar.V();
            return null;
        }
        throw new q("Expecting number, got: " + r5.c.v(iZ) + "; at path " + bVar.y(false));
    }

    @Override // com.google.gson.w
    public final void c(yf.c cVar, Object obj) throws IOException {
        cVar.T((Number) obj);
    }
}
