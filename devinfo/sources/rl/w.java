package rl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f33189c;

    public w(int i4, byte[] bArr) {
        this.f33188b = i4;
        this.f33189c = bArr;
    }

    @Override // rl.x
    public final long a() {
        return this.f33188b;
    }

    @Override // rl.x
    public final p b() {
        return null;
    }

    @Override // rl.x
    public final void d(hm.f fVar) {
        fVar.x(this.f33188b, this.f33189c);
    }
}
