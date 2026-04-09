package com.google.firebase.crashlytics;

import E4.b;
import E4.c;
import F4.A;
import F4.d;
import F4.q;
import I4.g;
import L4.f;
import android.content.res.Resources;
import com.google.firebase.components.ComponentRegistrar;
import g5.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import m5.h;
import n5.InterfaceC6871a;
import p5.C7229a;
import p5.b;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private final A f38683a = A.a(E4.a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final A f38684b = A.a(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    private final A f38685c = A.a(c.class, ExecutorService.class);

    static {
        C7229a.a(b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(d dVar) throws Resources.NotFoundException {
        f.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVarC = a.c((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (e) dVar.a(e.class), dVar.i(I4.a.class), dVar.i(D4.a.class), dVar.i(InterfaceC6871a.class), (ExecutorService) dVar.f(this.f38683a), (ExecutorService) dVar.f(this.f38684b), (ExecutorService) dVar.f(this.f38685c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return aVarC;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(F4.c.e(a.class).g("fire-cls").b(q.j(com.google.firebase.f.class)).b(q.j(e.class)).b(q.i(this.f38683a)).b(q.i(this.f38684b)).b(q.i(this.f38685c)).b(q.a(I4.a.class)).b(q.a(D4.a.class)).b(q.a(InterfaceC6871a.class)).e(new F4.g() { // from class: H4.f
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return this.f7622a.b(dVar);
            }
        }).d().c(), h.b("fire-cls", "19.4.1"));
    }
}
