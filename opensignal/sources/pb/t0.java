package pb;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class t0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f20430a;

    /* renamed from: d, reason: collision with root package name */
    public long f20431d;

    /* renamed from: g, reason: collision with root package name */
    public Uri f20432g;

    public t0(n nVar) {
        nVar.getClass();
        this.f20430a = nVar;
        this.f20432g = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // pb.n
    public final void close() {
        this.f20430a.close();
    }

    @Override // pb.n
    public final Map k() {
        return this.f20430a.k();
    }

    @Override // pb.n
    public final Uri o() {
        return this.f20430a.o();
    }

    @Override // pb.n
    public final long q(na.c cVar) {
        this.f20432g = (Uri) cVar.f17422f;
        Map map = Collections.EMPTY_MAP;
        n nVar = this.f20430a;
        long jQ = nVar.q(cVar);
        Uri uriO = nVar.o();
        uriO.getClass();
        this.f20432g = uriO;
        nVar.k();
        return jQ;
    }

    @Override // pb.k
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f20430a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f20431d += i12;
        }
        return i12;
    }

    @Override // pb.n
    public final void s(u0 u0Var) {
        u0Var.getClass();
        this.f20430a.s(u0Var);
    }
}
