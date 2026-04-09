package U9;

import java.io.IOException;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class B extends D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f12556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia.h f12557b;

    public B(v vVar, ia.h hVar) {
        this.f12556a = vVar;
        this.f12557b = hVar;
    }

    @Override // U9.D
    public final long contentLength() {
        return this.f12557b.c();
    }

    @Override // U9.D
    public final v contentType() {
        return this.f12556a;
    }

    @Override // U9.D
    public final void writeTo(ia.f sink) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        sink.P(this.f12557b);
    }
}
