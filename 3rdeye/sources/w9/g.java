package W9;

import b9.C1992A;
import ia.A;
import ia.C4468d;
import ia.j;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes3.dex */
public final class g extends j {

    /* renamed from: f, reason: collision with root package name */
    public final m f13411f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(A delegate, l<? super IOException, C1992A> lVar) {
        super(delegate);
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.f13411f = (m) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // ia.j, ia.A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13412g) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.f13412g = true;
            this.f13411f.invoke(e4);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // ia.j, ia.A, java.io.Flushable
    public final void flush() {
        if (this.f13412g) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.f13412g = true;
            this.f13411f.invoke(e4);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // ia.j, ia.A
    public final void write(C4468d source, long j4) throws EOFException {
        kotlin.jvm.internal.l.f(source, "source");
        if (this.f13412g) {
            source.skip(j4);
            return;
        }
        try {
            super.write(source, j4);
        } catch (IOException e4) {
            this.f13412g = true;
            this.f13411f.invoke(e4);
        }
    }
}
