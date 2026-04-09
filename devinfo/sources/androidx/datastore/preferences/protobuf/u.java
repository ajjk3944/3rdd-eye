package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final w f1069a;

    /* renamed from: b, reason: collision with root package name */
    public w f1070b;

    public u(w wVar) {
        this.f1069a = wVar;
        if (wVar.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1070b = wVar.i();
    }

    public final w a() {
        w wVarB = b();
        wVarB.getClass();
        if (w.f(wVarB, true)) {
            return wVarB;
        }
        throw new d1();
    }

    public final w b() {
        if (!this.f1070b.g()) {
            return this.f1070b;
        }
        w wVar = this.f1070b;
        wVar.getClass();
        u0 u0Var = u0.f1071c;
        u0Var.getClass();
        u0Var.a(wVar.getClass()).c(wVar);
        wVar.h();
        return this.f1070b;
    }

    public final Object clone() {
        u uVar = (u) this.f1069a.c(5);
        uVar.f1070b = b();
        return uVar;
    }

    public final void d() {
        if (this.f1070b.g()) {
            return;
        }
        w wVarI = this.f1069a.i();
        w wVar = this.f1070b;
        u0 u0Var = u0.f1071c;
        u0Var.getClass();
        u0Var.a(wVarI.getClass()).a(wVarI, wVar);
        this.f1070b = wVarI;
    }
}
