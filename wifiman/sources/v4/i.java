package v4;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import o4.AbstractC7072g;
import o4.y;
import v4.r;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f63441b = new i();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f63442a = new AtomicReference(new r.b().e());

    public static i a() {
        return f63441b;
    }

    public boolean b(q qVar) {
        return ((r) this.f63442a.get()).e(qVar);
    }

    public AbstractC7072g c(q qVar, y yVar) {
        return ((r) this.f63442a.get()).f(qVar, yVar);
    }

    public AbstractC7072g d(o oVar, y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, yVar);
        }
        try {
            return new e(oVar, yVar);
        } catch (GeneralSecurityException e10) {
            throw new TinkBugException("Creating a LegacyProtoKey failed", e10);
        }
    }

    public synchronized void e(AbstractC8191b abstractC8191b) {
        this.f63442a.set(new r.b((r) this.f63442a.get()).f(abstractC8191b).e());
    }

    public synchronized void f(c cVar) {
        this.f63442a.set(new r.b((r) this.f63442a.get()).g(cVar).e());
    }

    public synchronized void g(j jVar) {
        this.f63442a.set(new r.b((r) this.f63442a.get()).h(jVar).e());
    }

    public synchronized void h(k kVar) {
        this.f63442a.set(new r.b((r) this.f63442a.get()).i(kVar).e());
    }
}
