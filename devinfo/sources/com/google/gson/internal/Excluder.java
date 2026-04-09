package com.google.gson.internal;

import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import je.u;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class Excluder implements x, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final Excluder f20736c = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    public final List f20737a;

    /* renamed from: b, reason: collision with root package name */
    public final List f20738b;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f20737a = list;
        this.f20738b = list;
    }

    @Override // com.google.gson.x
    public final w a(final com.google.gson.j jVar, final xf.a aVar) {
        Class cls = aVar.f37087a;
        final boolean zB = b(cls, true);
        final boolean zB2 = b(cls, false);
        if (zB || zB2) {
            return new w() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public volatile w f20739a;

                @Override // com.google.gson.w
                public final Object b(yf.b bVar) throws IOException {
                    if (zB2) {
                        bVar.f0();
                        return null;
                    }
                    w wVarE = this.f20739a;
                    if (wVarE == null) {
                        wVarE = jVar.e(Excluder.this, aVar);
                        this.f20739a = wVarE;
                    }
                    return wVarE.b(bVar);
                }

                @Override // com.google.gson.w
                public final void c(yf.c cVar, Object obj) throws IOException {
                    if (zB) {
                        cVar.A();
                        return;
                    }
                    w wVarE = this.f20739a;
                    if (wVarE == null) {
                        wVarE = jVar.e(Excluder.this, aVar);
                        this.f20739a = wVarE;
                    }
                    wVarE.c(cVar, obj);
                }
            };
        }
        return null;
    }

    public final boolean b(Class cls, boolean z3) {
        if (!z3 && !Enum.class.isAssignableFrom(cls)) {
            t1 t1Var = wf.c.f36639a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z3 ? this.f20737a : this.f20738b).iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
