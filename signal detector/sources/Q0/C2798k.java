package q0;

import c5.C0412i;
import d5.C2280h;

/* renamed from: q0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2798k extends q5.j implements p5.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q5.l f22986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q5.l f22987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f22988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2280h f22990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2798k(q5.l lVar, q5.l lVar2, z zVar, boolean z6, C2280h c2280h) {
        super(1);
        this.f22986b = lVar;
        this.f22987c = lVar2;
        this.f22988d = zVar;
        this.f22989e = z6;
        this.f22990f = c2280h;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        C2794g c2794g = (C2794g) obj;
        q5.i.e(c2794g, "entry");
        this.f22986b.f23296a = true;
        this.f22987c.f23296a = true;
        this.f22988d.o(c2794g, this.f22989e, this.f22990f);
        return C0412i.f5929a;
    }
}
