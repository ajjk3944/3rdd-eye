package U9;

import java.io.IOException;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class C extends D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f12558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f12560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12561d;

    public C(v vVar, byte[] bArr, int i, int i10) {
        this.f12558a = vVar;
        this.f12559b = i;
        this.f12560c = bArr;
        this.f12561d = i10;
    }

    @Override // U9.D
    public final long contentLength() {
        return this.f12559b;
    }

    @Override // U9.D
    public final v contentType() {
        return this.f12558a;
    }

    @Override // U9.D
    public final void writeTo(ia.f sink) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        sink.A0(this.f12561d, this.f12559b, this.f12560c);
    }
}
