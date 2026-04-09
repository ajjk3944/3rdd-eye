package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Class f34386a;

    /* renamed from: b, reason: collision with root package name */
    private final List f34387b;

    /* renamed from: c, reason: collision with root package name */
    private final P2.e f34388c;

    /* renamed from: d, reason: collision with root package name */
    private final E1.e f34389d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34390e;

    interface a {
        E2.c a(E2.c cVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, P2.e eVar, E1.e eVar2) {
        this.f34386a = cls;
        this.f34387b = list;
        this.f34388c = eVar;
        this.f34389d = eVar2;
        this.f34390e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private E2.c b(com.bumptech.glide.load.data.e eVar, int i10, int i11, C2.g gVar) {
        List list = (List) W2.k.d(this.f34389d.b());
        try {
            return c(eVar, i10, i11, gVar, list);
        } finally {
            this.f34389d.a(list);
        }
    }

    private E2.c c(com.bumptech.glide.load.data.e eVar, int i10, int i11, C2.g gVar, List list) throws GlideException {
        int size = this.f34387b.size();
        E2.c cVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            C2.i iVar = (C2.i) this.f34387b.get(i12);
            try {
                if (iVar.a(eVar.a(), gVar)) {
                    cVarB = iVar.b(eVar.a(), i10, i11, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iVar, e10);
                }
                list.add(e10);
            }
            if (cVarB != null) {
                break;
            }
        }
        if (cVarB != null) {
            return cVarB;
        }
        throw new GlideException(this.f34390e, new ArrayList(list));
    }

    public E2.c a(com.bumptech.glide.load.data.e eVar, int i10, int i11, C2.g gVar, a aVar) {
        return this.f34388c.a(aVar.a(b(eVar, i10, i11, gVar)), gVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f34386a + ", decoders=" + this.f34387b + ", transcoder=" + this.f34388c + '}';
    }
}
