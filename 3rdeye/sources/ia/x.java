package ia;

import c9.C2088i;

/* compiled from: Segment.kt */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f38688a;

    /* renamed from: b, reason: collision with root package name */
    public int f38689b;

    /* renamed from: c, reason: collision with root package name */
    public int f38690c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38691d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38692e;

    /* renamed from: f, reason: collision with root package name */
    public x f38693f;

    /* renamed from: g, reason: collision with root package name */
    public x f38694g;

    public x() {
        this.f38688a = new byte[8192];
        this.f38692e = true;
        this.f38691d = false;
    }

    public final x a() {
        x xVar = this.f38693f;
        if (xVar == this) {
            xVar = null;
        }
        x xVar2 = this.f38694g;
        kotlin.jvm.internal.l.c(xVar2);
        xVar2.f38693f = this.f38693f;
        x xVar3 = this.f38693f;
        kotlin.jvm.internal.l.c(xVar3);
        xVar3.f38694g = this.f38694g;
        this.f38693f = null;
        this.f38694g = null;
        return xVar;
    }

    public final void b(x segment) {
        kotlin.jvm.internal.l.f(segment, "segment");
        segment.f38694g = this;
        segment.f38693f = this.f38693f;
        x xVar = this.f38693f;
        kotlin.jvm.internal.l.c(xVar);
        xVar.f38694g = segment;
        this.f38693f = segment;
    }

    public final x c() {
        this.f38691d = true;
        return new x(this.f38688a, this.f38689b, this.f38690c, true);
    }

    public final void d(x sink, int i) {
        kotlin.jvm.internal.l.f(sink, "sink");
        if (!sink.f38692e) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.f38690c;
        int i11 = i10 + i;
        byte[] bArr = sink.f38688a;
        if (i11 > 8192) {
            if (sink.f38691d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f38689b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            C2088i.d(bArr, 0, bArr, i12, i10);
            sink.f38690c -= sink.f38689b;
            sink.f38689b = 0;
        }
        int i13 = sink.f38690c;
        int i14 = this.f38689b;
        C2088i.d(this.f38688a, i13, bArr, i14, i14 + i);
        sink.f38690c += i;
        this.f38689b += i;
    }

    public x(byte[] data, int i, int i10, boolean z10) {
        kotlin.jvm.internal.l.f(data, "data");
        this.f38688a = data;
        this.f38689b = i;
        this.f38690c = i10;
        this.f38691d = z10;
        this.f38692e = false;
    }
}
