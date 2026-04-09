package br;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d implements ir.c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient ir.c f2903a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2904d;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2905g;

    /* renamed from: r, reason: collision with root package name */
    public final String f2906r;

    /* renamed from: x, reason: collision with root package name */
    public final String f2907x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2908y;

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f2904d = obj;
        this.f2905g = cls;
        this.f2906r = str;
        this.f2907x = str2;
        this.f2908y = z10;
    }

    public abstract ir.c A();

    public String B() {
        return this.f2907x;
    }

    @Override // ir.b
    public final List e() {
        return A().e();
    }

    public ir.c g() {
        ir.c cVar = this.f2903a;
        if (cVar != null) {
            return cVar;
        }
        ir.c cVarJ = j();
        this.f2903a = cVarJ;
        return cVarJ;
    }

    @Override // ir.c
    public String getName() {
        return this.f2906r;
    }

    @Override // ir.c
    public final m i() {
        return A().i();
    }

    public abstract ir.c j();

    @Override // ir.c
    public final List o() {
        return A().o();
    }

    @Override // ir.c
    public final Object s(Object... objArr) {
        return A().s(objArr);
    }

    @Override // ir.c
    public final Object t(pk.b bVar) {
        return A().t(bVar);
    }

    public ir.f z() {
        Class cls = this.f2905g;
        if (cls == null) {
            return null;
        }
        return this.f2908y ? x.f2918a.c(cls, "") : x.f2918a.b(cls);
    }
}
