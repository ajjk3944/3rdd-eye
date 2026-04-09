package com.google.mlkit.common.internal;

import A5.b;
import A5.d;
import A5.h;
import A5.i;
import A5.k;
import B5.a;
import D3.AbstractC2564e;
import F4.c;
import F4.g;
import F4.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import y5.C8611a;
import z5.AbstractC8711a;
import z5.c;

/* loaded from: classes3.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC2564e.y(k.f337b, c.e(a.class).b(q.j(h.class)).e(new g() { // from class: x5.a
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new B5.a((A5.h) dVar.a(A5.h.class));
            }
        }).c(), c.e(i.class).e(new g() { // from class: x5.b
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new i();
            }
        }).c(), c.e(z5.c.class).b(q.m(c.a.class)).e(new g() { // from class: x5.c
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new z5.c(dVar.g(c.a.class));
            }
        }).c(), F4.c.e(d.class).b(q.l(i.class)).e(new g() { // from class: x5.d
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new A5.d(dVar.e(i.class));
            }
        }).c(), F4.c.e(A5.a.class).e(new g() { // from class: x5.e
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return A5.a.a();
            }
        }).c(), F4.c.e(b.class).b(q.j(A5.a.class)).e(new g() { // from class: x5.f
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new A5.b((A5.a) dVar.a(A5.a.class));
            }
        }).c(), F4.c.e(C8611a.class).b(q.j(h.class)).e(new g() { // from class: x5.g
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new C8611a((A5.h) dVar.a(A5.h.class));
            }
        }).c(), F4.c.m(c.a.class).b(q.l(C8611a.class)).e(new g() { // from class: x5.h
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return new c.a(AbstractC8711a.class, dVar.e(C8611a.class));
            }
        }).c());
    }
}
