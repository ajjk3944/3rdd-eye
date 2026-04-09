package cv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class i0 extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final w f6711e;

    /* renamed from: b, reason: collision with root package name */
    public final w f6712b;

    /* renamed from: c, reason: collision with root package name */
    public final l f6713c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6714d;

    static {
        String str = w.f6742d;
        f6711e = cg.e.q("/");
    }

    public i0(w wVar, l lVar, LinkedHashMap linkedHashMap) {
        this.f6712b = wVar;
        this.f6713c = lVar;
        this.f6714d = linkedHashMap;
    }

    @Override // cv.l
    public final d0 a(w wVar) throws IOException {
        br.l.e(wVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // cv.l
    public final void b(w wVar, w wVar2) throws IOException {
        br.l.e(wVar, "source");
        br.l.e(wVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // cv.l
    public final void c(w wVar) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // cv.l
    public final void d(w wVar) throws IOException {
        br.l.e(wVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // cv.l
    public final List g(w wVar) throws IOException {
        w wVar2 = f6711e;
        wVar2.getClass();
        dv.g gVar = (dv.g) this.f6714d.get(dv.c.b(wVar2, wVar, true));
        if (gVar != null) {
            return mq.o.Q0(gVar.f7620q);
        }
        throw new IOException("not a directory: " + wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // cv.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a3.e i(cv.w r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.i0.i(cv.w):a3.e");
    }

    @Override // cv.l
    public final r j(w wVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // cv.l
    public final d0 k(w wVar) throws IOException {
        br.l.e(wVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // cv.l
    public final f0 l(w wVar) throws Throwable {
        Throwable th2;
        z zVarE;
        br.l.e(wVar, "file");
        w wVar2 = f6711e;
        wVar2.getClass();
        dv.g gVar = (dv.g) this.f6714d.get(dv.c.b(wVar2, wVar, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + wVar);
        }
        long j = gVar.f7611f;
        r rVarJ = this.f6713c.j(this.f6712b);
        try {
            zVarE = a.a.e(rVarJ.b(gVar.f7613h));
            try {
                rVarJ.close();
                th2 = null;
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (rVarJ != null) {
                try {
                    rVarJ.close();
                } catch (Throwable th5) {
                    ir.f0.c(th4, th5);
                }
            }
            th2 = th4;
            zVarE = null;
        }
        if (th2 != null) {
            throw th2;
        }
        br.l.e(zVarE, "<this>");
        dv.b.f(zVarE, null);
        if (gVar.f7612g == 0) {
            return new dv.e(zVarE, j, true);
        }
        return new dv.e(new q(a.a.e(new dv.e(zVarE, gVar.f7610e, true)), new Inflater(true)), j, false);
    }
}
