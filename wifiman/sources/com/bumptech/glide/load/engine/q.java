package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Class f34468a;

    /* renamed from: b, reason: collision with root package name */
    private final E1.e f34469b;

    /* renamed from: c, reason: collision with root package name */
    private final List f34470c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34471d;

    public q(Class cls, Class cls2, Class cls3, List list, E1.e eVar) {
        this.f34468a = cls;
        this.f34469b = eVar;
        this.f34470c = (List) W2.k.c(list);
        this.f34471d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private E2.c b(com.bumptech.glide.load.data.e eVar, C2.g gVar, int i10, int i11, i.a aVar, List list) throws GlideException {
        int size = this.f34470c.size();
        E2.c cVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                cVarA = ((i) this.f34470c.get(i12)).a(eVar, i10, i11, gVar, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (cVarA != null) {
                break;
            }
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new GlideException(this.f34471d, new ArrayList(list));
    }

    public E2.c a(com.bumptech.glide.load.data.e eVar, C2.g gVar, int i10, int i11, i.a aVar) {
        List list = (List) W2.k.d(this.f34469b.b());
        try {
            return b(eVar, gVar, i10, i11, aVar, list);
        } finally {
            this.f34469b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f34470c.toArray()) + '}';
    }
}
