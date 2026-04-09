package hm;

import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25206a;

    /* renamed from: b, reason: collision with root package name */
    public int f25207b;

    /* renamed from: c, reason: collision with root package name */
    public int f25208c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25209d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25210e;

    /* renamed from: f, reason: collision with root package name */
    public r f25211f;
    public r g;

    public r() {
        this.f25206a = new byte[Segment.SIZE];
        this.f25210e = true;
        this.f25209d = false;
    }

    public final r a() {
        r rVar = this.f25211f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.g;
        nk.k.b(rVar2);
        rVar2.f25211f = this.f25211f;
        r rVar3 = this.f25211f;
        nk.k.b(rVar3);
        rVar3.g = this.g;
        this.f25211f = null;
        this.g = null;
        return rVar;
    }

    public final void b(r rVar) {
        nk.k.e(rVar, "segment");
        rVar.g = this;
        rVar.f25211f = this.f25211f;
        r rVar2 = this.f25211f;
        nk.k.b(rVar2);
        rVar2.g = rVar;
        this.f25211f = rVar;
    }

    public final r c() {
        this.f25209d = true;
        return new r(this.f25206a, this.f25207b, this.f25208c, true);
    }

    public final void d(r rVar, int i4) {
        nk.k.e(rVar, "sink");
        byte[] bArr = rVar.f25206a;
        if (!rVar.f25210e) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = rVar.f25208c;
        int i11 = i10 + i4;
        if (i11 > 8192) {
            if (rVar.f25209d) {
                throw new IllegalArgumentException();
            }
            int i12 = rVar.f25207b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            zj.m.O(bArr, 0, bArr, i12, i10);
            rVar.f25208c -= rVar.f25207b;
            rVar.f25207b = 0;
        }
        int i13 = rVar.f25208c;
        int i14 = this.f25207b;
        zj.m.O(this.f25206a, i13, bArr, i14, i14 + i4);
        rVar.f25208c += i4;
        this.f25207b += i4;
    }

    public r(byte[] bArr, int i4, int i10, boolean z3) {
        nk.k.e(bArr, "data");
        this.f25206a = bArr;
        this.f25207b = i4;
        this.f25208c = i10;
        this.f25209d = z3;
        this.f25210e = false;
    }
}
