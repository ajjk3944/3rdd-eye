package f6;

import android.content.Context;
import java.io.IOException;
import nk.k;
import t7.m;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements e6.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23681a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23682b;

    /* renamed from: c, reason: collision with root package name */
    public final m f23683c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23684d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23685e;

    /* renamed from: f, reason: collision with root package name */
    public final n f23686f;
    public boolean g;

    public h(Context context, String str, m mVar, boolean z3, boolean z10) {
        k.e(context, "context");
        k.e(mVar, "callback");
        this.f23681a = context;
        this.f23682b = str;
        this.f23683c = mVar;
        this.f23684d = z3;
        this.f23685e = z10;
        this.f23686f = a.a.u(new a6.e(10, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        n nVar = this.f23686f;
        if (nVar.a()) {
            ((g) nVar.getValue()).close();
        }
    }

    @Override // e6.c
    public final String getDatabaseName() {
        return this.f23682b;
    }

    @Override // e6.c
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        n nVar = this.f23686f;
        if (nVar.a()) {
            ((g) nVar.getValue()).setWriteAheadLoggingEnabled(z3);
        }
        this.g = z3;
    }

    @Override // e6.c
    public final e6.a z() {
        return ((g) this.f23686f.getValue()).c(true);
    }
}
