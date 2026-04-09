package j4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f13221a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f13222b;

    /* renamed from: c, reason: collision with root package name */
    public r f13223c;

    /* renamed from: d, reason: collision with root package name */
    public r f13224d;

    /* renamed from: e, reason: collision with root package name */
    public int f13225e;

    /* renamed from: f, reason: collision with root package name */
    public int f13226f;

    public n(r rVar) {
        this.f13222b = rVar;
        this.f13223c = rVar;
    }

    public final void a() {
        this.f13221a = 1;
        this.f13223c = this.f13222b;
        this.f13226f = 0;
    }

    public final boolean b() {
        k4.a aVarB = this.f13223c.f13239b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f14040r).get(iA + aVarB.f14037a) == 0) || this.f13225e == 65039;
    }
}
