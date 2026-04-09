package U9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class A extends D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f12554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f12555b;

    public A(v vVar, File file) {
        this.f12554a = vVar;
        this.f12555b = file;
    }

    @Override // U9.D
    public final long contentLength() {
        return this.f12555b.length();
    }

    @Override // U9.D
    public final v contentType() {
        return this.f12554a;
    }

    @Override // U9.D
    public final void writeTo(ia.f sink) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        Logger logger = ia.r.f38670a;
        File file = this.f12555b;
        kotlin.jvm.internal.l.f(file, "<this>");
        ia.p pVar = new ia.p(new FileInputStream(file), ia.D.NONE);
        try {
            sink.X(pVar);
            pVar.close();
        } finally {
        }
    }
}
