package d8;

import ar.k;
import ba.l;
import br.n;
import cg.j;
import cv.d0;
import cv.m;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7172d = 1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7173g;

    /* renamed from: r, reason: collision with root package name */
    public final lq.e f7174r;

    public g(d0 d0Var, j jVar) {
        super(d0Var);
        this.f7174r = jVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ar.k, br.n] */
    @Override // cv.m, cv.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws l {
        switch (this.f7172d) {
            case 0:
                try {
                    super.close();
                    break;
                } catch (IOException e4) {
                    this.f7173g = true;
                    ((j) this.f7174r).a(e4);
                    return;
                }
            default:
                if (!this.f7173g) {
                    try {
                        super.close();
                        break;
                    } catch (IOException e10) {
                        this.f7173g = true;
                        ((n) this.f7174r).a(e10);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [ar.k, br.n] */
    @Override // cv.m, cv.d0
    public final void d0(cv.g gVar, long j) throws l, EOFException {
        switch (this.f7172d) {
            case 0:
                if (this.f7173g) {
                    gVar.skip(j);
                    break;
                } else {
                    try {
                        super.d0(gVar, j);
                        break;
                    } catch (IOException e4) {
                        this.f7173g = true;
                        ((j) this.f7174r).a(e4);
                        return;
                    }
                }
            default:
                br.l.e(gVar, "source");
                if (this.f7173g) {
                    gVar.skip(j);
                    break;
                } else {
                    try {
                        super.d0(gVar, j);
                        break;
                    } catch (IOException e10) {
                        this.f7173g = true;
                        ((n) this.f7174r).a(e10);
                    }
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ar.k, br.n] */
    @Override // cv.m, cv.d0, java.io.Flushable
    public final void flush() throws l {
        switch (this.f7172d) {
            case 0:
                try {
                    super.flush();
                    break;
                } catch (IOException e4) {
                    this.f7173g = true;
                    ((j) this.f7174r).a(e4);
                    return;
                }
            default:
                if (!this.f7173g) {
                    try {
                        super.flush();
                        break;
                    } catch (IOException e10) {
                        this.f7173g = true;
                        ((n) this.f7174r).a(e10);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(cv.b bVar, k kVar) {
        super(bVar);
        this.f7174r = (n) kVar;
    }
}
