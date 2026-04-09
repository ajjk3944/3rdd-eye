package dv;

import as.x;
import cv.d0;
import cv.f0;
import cv.l;
import cv.r;
import cv.s;
import cv.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import lq.q;
import mq.o;
import mq.p;
import mq.t;

/* loaded from: classes.dex */
public final class f extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final w f7602e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f7603b;

    /* renamed from: c, reason: collision with root package name */
    public final l f7604c;

    /* renamed from: d, reason: collision with root package name */
    public final q f7605d;

    static {
        String str = w.f6742d;
        f7602e = cg.e.q("/");
    }

    public f(ClassLoader classLoader) {
        s sVar = l.f6722a;
        br.l.e(sVar, "systemFileSystem");
        this.f7603b = classLoader;
        this.f7604c = sVar;
        this.f7605d = kc.f.F(new x(13, this));
    }

    @Override // cv.l
    public final d0 a(w wVar) throws IOException {
        br.l.e(wVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // cv.l
    public final void b(w wVar, w wVar2) throws IOException {
        br.l.e(wVar, "source");
        br.l.e(wVar2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // cv.l
    public final void c(w wVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // cv.l
    public final void d(w wVar) throws IOException {
        br.l.e(wVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // cv.l
    public final List g(w wVar) throws FileNotFoundException {
        w wVar2 = f7602e;
        wVar2.getClass();
        String strQ = c.b(wVar2, wVar, true).c(wVar2).f6743a.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (lq.l lVar : (List) this.f7605d.getValue()) {
            l lVar2 = (l) lVar.f15571a;
            w wVar3 = (w) lVar.f15572d;
            try {
                List listG = lVar2.g(wVar3.d(strQ));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (sm.f.C((w) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w wVar4 = (w) it.next();
                    br.l.e(wVar4, "<this>");
                    arrayList2.add(wVar2.d(tt.s.k0(tt.l.J0(wVar4.f6743a.q(), wVar3.f6743a.q()), '\\', '/')));
                }
                t.d0(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return o.Q0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // cv.l
    public final a3.e i(w wVar) {
        br.l.e(wVar, "path");
        if (!sm.f.C(wVar)) {
            return null;
        }
        w wVar2 = f7602e;
        wVar2.getClass();
        String strQ = c.b(wVar2, wVar, true).c(wVar2).f6743a.q();
        for (lq.l lVar : (List) this.f7605d.getValue()) {
            a3.e eVarI = ((l) lVar.f15571a).i(((w) lVar.f15572d).d(strQ));
            if (eVarI != null) {
                return eVarI;
            }
        }
        return null;
    }

    @Override // cv.l
    public final r j(w wVar) throws FileNotFoundException {
        if (!sm.f.C(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        w wVar2 = f7602e;
        wVar2.getClass();
        String strQ = c.b(wVar2, wVar, true).c(wVar2).f6743a.q();
        for (lq.l lVar : (List) this.f7605d.getValue()) {
            try {
                return ((l) lVar.f15571a).j(((w) lVar.f15572d).d(strQ));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // cv.l
    public final d0 k(w wVar) throws IOException {
        br.l.e(wVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // cv.l
    public final f0 l(w wVar) throws IOException {
        br.l.e(wVar, "file");
        if (!sm.f.C(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        w wVar2 = f7602e;
        wVar2.getClass();
        URL resource = this.f7603b.getResource(c.b(wVar2, wVar, false).c(wVar2).f6743a.q());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        br.l.d(inputStream, "getInputStream(...)");
        return a.a.E(inputStream);
    }
}
