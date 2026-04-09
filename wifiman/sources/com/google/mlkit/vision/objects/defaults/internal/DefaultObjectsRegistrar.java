package com.google.mlkit.vision.objects.defaults.internal;

import A5.d;
import A5.h;
import F3.C2789e;
import F4.g;
import F4.q;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;

/* loaded from: classes3.dex */
public class DefaultObjectsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C2789e c2789e = new C2789e();
        c2789e.b(F4.c.e(F5.a.class).b(q.j(h.class)).e(new g() { // from class: F5.c
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new a((h) dVar.a(h.class));
            }
        }).c());
        c2789e.b(F4.c.e(a.class).b(q.j(F5.a.class)).b(q.j(d.class)).e(new g() { // from class: com.google.mlkit.vision.objects.defaults.internal.b
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new a((F5.a) dVar.a(F5.a.class), (d) dVar.a(d.class));
            }
        }).c());
        c2789e.b(F4.c.m(a.C1227a.class).b(q.l(a.class)).e(new g() { // from class: com.google.mlkit.vision.objects.defaults.internal.c
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new a.C1227a(E5.a.class, dVar.e(a.class));
            }
        }).c());
        return c2789e.c();
    }
}
