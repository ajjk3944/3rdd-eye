package com.google.firebase;

import A9.A;
import A9.C0575f;
import I4.a;
import I4.i;
import I4.s;
import I4.t;
import androidx.annotation.Keep;
import c9.C2092m;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;

/* compiled from: Firebase.kt */
@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    public static final class a<T> implements I4.d {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f23238b = new a<>();

        @Override // I4.d
        public final Object g(t tVar) {
            Object objB = tVar.b(new s<>(H4.a.class, Executor.class));
            l.e(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0575f.c((Executor) objB);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class b<T> implements I4.d {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f23239b = new b<>();

        @Override // I4.d
        public final Object g(t tVar) {
            Object objB = tVar.b(new s<>(H4.c.class, Executor.class));
            l.e(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0575f.c((Executor) objB);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class c<T> implements I4.d {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f23240b = new c<>();

        @Override // I4.d
        public final Object g(t tVar) {
            Object objB = tVar.b(new s<>(H4.b.class, Executor.class));
            l.e(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0575f.c((Executor) objB);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class d<T> implements I4.d {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f23241b = new d<>();

        @Override // I4.d
        public final Object g(t tVar) {
            Object objB = tVar.b(new s<>(H4.d.class, Executor.class));
            l.e(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C0575f.c((Executor) objB);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I4.a<?>> getComponents() {
        a.C0043a c0043aA = I4.a.a(new s(H4.a.class, A.class));
        c0043aA.a(new i((s<?>) new s(H4.a.class, Executor.class), 1, 0));
        c0043aA.f2445f = a.f23238b;
        I4.a aVarB = c0043aA.b();
        a.C0043a c0043aA2 = I4.a.a(new s(H4.c.class, A.class));
        c0043aA2.a(new i((s<?>) new s(H4.c.class, Executor.class), 1, 0));
        c0043aA2.f2445f = b.f23239b;
        I4.a aVarB2 = c0043aA2.b();
        a.C0043a c0043aA3 = I4.a.a(new s(H4.b.class, A.class));
        c0043aA3.a(new i((s<?>) new s(H4.b.class, Executor.class), 1, 0));
        c0043aA3.f2445f = c.f23240b;
        I4.a aVarB3 = c0043aA3.b();
        a.C0043a c0043aA4 = I4.a.a(new s(H4.d.class, A.class));
        c0043aA4.a(new i((s<?>) new s(H4.d.class, Executor.class), 1, 0));
        c0043aA4.f2445f = d.f23241b;
        return C2092m.W(aVarB, aVarB2, aVarB3, c0043aA4.b());
    }
}
