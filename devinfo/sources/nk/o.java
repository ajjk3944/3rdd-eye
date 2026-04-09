package nk;

import com.google.android.gms.internal.ads.l81;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o extends p implements tk.c, mk.e {
    @Override // nk.c
    public final tk.a c() {
        v.f29987a.getClass();
        return this;
    }

    public final void f() {
        if (this.g) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        tk.a aVarE = e();
        if (aVarE == this) {
            throw new l81("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((o) ((tk.c) aVarE)).f();
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        f();
        throw null;
    }
}
