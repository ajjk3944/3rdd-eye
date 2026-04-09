package e8;

import A8.i;
import I2.g;
import I2.h;
import b9.C1992A;
import e.AbstractC4292c;
import x2.AbstractActivityC5757a;
import y0.C5788a;

/* compiled from: PermissionRequester.kt */
/* loaded from: classes3.dex */
public final class d extends AbstractC4324a {

    /* renamed from: d, reason: collision with root package name */
    public final String f37770d;

    /* renamed from: e, reason: collision with root package name */
    public g f37771e;

    /* renamed from: f, reason: collision with root package name */
    public A2.f f37772f;

    /* renamed from: g, reason: collision with root package name */
    public i f37773g;

    /* renamed from: h, reason: collision with root package name */
    public h f37774h;
    public final AbstractC4292c<String> i;

    public d(AbstractActivityC5757a abstractActivityC5757a, String str) {
        super(abstractActivityC5757a);
        this.f37770d = str;
        this.i = abstractActivityC5757a.registerForActivityResult(new f.c(), new B.f(this, 14));
    }

    @Override // e8.AbstractC4324a
    public final AbstractC4292c<?> a() {
        return this.i;
    }

    @Override // e8.AbstractC4324a
    public final void b() {
        i iVar;
        AbstractActivityC5757a abstractActivityC5757a = this.f37760b;
        String str = this.f37770d;
        if (f.a(abstractActivityC5757a, str)) {
            g gVar = this.f37771e;
            if (gVar != null) {
                gVar.invoke(this);
                return;
            }
            return;
        }
        if (C5788a.b(abstractActivityC5757a, str) && !this.f37761c && (iVar = this.f37773g) != null) {
            this.f37761c = true;
            iVar.invoke(this);
            return;
        }
        try {
            this.i.b(str);
            C1992A c1992a = C1992A.f18074a;
        } catch (Throwable th) {
            va.a.f47104a.d(th);
            A2.f fVar = this.f37772f;
            if (fVar != null) {
                fVar.invoke(this);
                C1992A c1992a2 = C1992A.f18074a;
            }
        }
    }
}
