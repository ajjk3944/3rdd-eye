package c8;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c extends cv.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3321d = 0;

    /* renamed from: g, reason: collision with root package name */
    public Object f3322g;

    public /* synthetic */ c(cv.f0 f0Var) {
        super(f0Var);
    }

    @Override // cv.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f3321d) {
            case 1:
                ((ou.c) this.f3322g).f19880a.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // cv.n, cv.f0
    public long u(cv.g gVar, long j) throws Exception {
        switch (this.f3321d) {
            case 0:
                try {
                    return super.u(gVar, j);
                } catch (Exception e4) {
                    this.f3322g = e4;
                    throw e4;
                }
            default:
                return super.u(gVar, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cv.f0 f0Var, ou.c cVar) {
        super(f0Var);
        this.f3322g = cVar;
    }
}
