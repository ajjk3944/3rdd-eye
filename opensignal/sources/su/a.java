package su;

import bc.p;
import com.survicate.surveys.infrastructure.network.URLRequest;
import java.io.IOException;
import ou.c0;
import ou.u;
import ou.x;

/* loaded from: classes.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22306a = new a();

    @Override // ou.u
    public final c0 a(tu.f fVar) throws IOException {
        i iVar = fVar.f23014a;
        synchronized (iVar) {
            try {
                if (!iVar.I) {
                    throw new IllegalStateException("released");
                }
                if (iVar.H) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.G) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e eVar = iVar.D;
        br.l.b(eVar);
        x xVar = iVar.f22335a;
        try {
            p pVar = new p(iVar, iVar.f22338r, eVar, eVar.a(fVar.f23019f, fVar.f23020g, fVar.f23021h, xVar.f20009y, !br.l.a(fVar.f23018e.f19861b, URLRequest.METHOD_GET)).j(xVar, fVar));
            iVar.F = pVar;
            iVar.K = pVar;
            synchronized (iVar) {
                iVar.G = true;
                iVar.H = true;
            }
            if (iVar.J) {
                throw new IOException("Canceled");
            }
            return tu.f.a(fVar, 0, pVar, null, 61).b(fVar.f23018e);
        } catch (IOException e4) {
            eVar.c(e4);
            throw new m(e4);
        } catch (m e10) {
            eVar.c(e10.f22362d);
            throw e10;
        }
    }
}
