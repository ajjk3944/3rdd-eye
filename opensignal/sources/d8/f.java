package d8;

import cg.j;
import cv.l;
import cv.w;
import cv.y;
import cv.z;
import ir.f0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import tt.k;
import tt.s;
import wt.q;

/* loaded from: classes.dex */
public final class f implements Closeable, Flushable {
    public static final k M = new k("[a-z0-9_-]{1,120}");
    public final bu.c B;
    public long D;
    public int E;
    public y F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final d L;

    /* renamed from: a, reason: collision with root package name */
    public final w f7166a;

    /* renamed from: d, reason: collision with root package name */
    public final long f7167d;

    /* renamed from: g, reason: collision with root package name */
    public final w f7168g;

    /* renamed from: r, reason: collision with root package name */
    public final w f7169r;

    /* renamed from: x, reason: collision with root package name */
    public final w f7170x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f7171y;

    public f(long j, l lVar, w wVar, q qVar) {
        this.f7166a = wVar;
        this.f7167d = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f7168g = wVar.d("journal");
        this.f7169r = wVar.d("journal.tmp");
        this.f7170x = wVar.d("journal.bkp");
        this.f7171y = new LinkedHashMap(0, 0.75f, true);
        this.B = wt.w.b(se.b.M(wt.w.c(), qVar.q0(1)));
        this.L = new d(lVar);
    }

    public static void Y(String str) {
        if (!M.a(str)) {
            throw new IllegalArgumentException(h0.b.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:26:0x005c, B:28:0x006c, B:37:0x00aa, B:39:0x00b1, B:42:0x00b6, B:44:0x00c7, B:47:0x00cc, B:52:0x0107, B:54:0x0112, B:58:0x011b, B:48:0x00e4, B:50:0x00f9, B:51:0x0104, B:36:0x009a, B:61:0x0120, B:62:0x0127), top: B:65:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(d8.f r9, d8.a r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.f.b(d8.f, d8.a, boolean):void");
    }

    public final void G() throws Throwable {
        z zVarE = a.a.e(this.L.l(this.f7168g));
        try {
            String strZ = zVarE.z(Long.MAX_VALUE);
            String strZ2 = zVarE.z(Long.MAX_VALUE);
            String strZ3 = zVarE.z(Long.MAX_VALUE);
            String strZ4 = zVarE.z(Long.MAX_VALUE);
            String strZ5 = zVarE.z(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strZ) || !"1".equals(strZ2) || !br.l.a(String.valueOf(1), strZ3) || !br.l.a(String.valueOf(2), strZ4) || strZ5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strZ + ", " + strZ2 + ", " + strZ3 + ", " + strZ4 + ", " + strZ5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    L(zVarE.z(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.E = i10 - this.f7171y.size();
                    if (zVarE.b()) {
                        this.F = w();
                    } else {
                        Z();
                    }
                    try {
                        zVarE.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                zVarE.close();
            } catch (Throwable th4) {
                f0.c(th, th4);
            }
        }
    }

    public final void L(String str) throws IOException {
        String strSubstring;
        int iA0 = tt.l.A0(str, ' ', 0, 6);
        if (iA0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iA0 + 1;
        int iA02 = tt.l.A0(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.f7171y;
        if (iA02 == -1) {
            strSubstring = str.substring(i10);
            br.l.d(strSubstring, "substring(...)");
            if (iA0 == 6 && s.n0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iA02);
            br.l.d(strSubstring, "substring(...)");
        }
        Object bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = (b) bVar;
        if (iA02 == -1 || iA0 != 5 || !s.n0(str, "CLEAN", false)) {
            if (iA02 == -1 && iA0 == 5 && s.n0(str, "DIRTY", false)) {
                bVar2.f7157g = new a(this, bVar2);
                return;
            } else {
                if (iA02 != -1 || iA0 != 4 || !s.n0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iA02 + 1);
        br.l.d(strSubstring2, "substring(...)");
        List listO0 = tt.l.O0(strSubstring2, new char[]{' '});
        bVar2.f7155e = true;
        bVar2.f7157g = null;
        if (listO0.size() != 2) {
            throw new IOException("unexpected journal line: " + listO0);
        }
        try {
            int size = listO0.size();
            for (int i11 = 0; i11 < size; i11++) {
                bVar2.f7152b[i11] = Long.parseLong((String) listO0.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listO0);
        }
    }

    public final void R(b bVar) {
        y yVar;
        int i10 = bVar.f7158h;
        String str = bVar.f7151a;
        if (i10 > 0 && (yVar = this.F) != null) {
            yVar.H("DIRTY");
            yVar.writeByte(32);
            yVar.H(str);
            yVar.writeByte(10);
            yVar.flush();
        }
        if (bVar.f7158h > 0 || bVar.f7157g != null) {
            bVar.f7156f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.L.e((w) bVar.f7153c.get(i11));
            long j = this.D;
            long[] jArr = bVar.f7152b;
            this.D = j - jArr[i11];
            jArr[i11] = 0;
        }
        this.E++;
        y yVar2 = this.F;
        if (yVar2 != null) {
            yVar2.H("REMOVE");
            yVar2.writeByte(32);
            yVar2.H(str);
            yVar2.writeByte(10);
        }
        this.f7171y.remove(str);
        if (this.E >= 2000) {
            q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        R(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V() {
        /*
            r4 = this;
        L0:
            long r0 = r4.D
            long r2 = r4.f7167d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f7171y
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            d8.b r1 = (d8.b) r1
            boolean r2 = r1.f7156f
            if (r2 != 0) goto L12
            r4.R(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.f.V():void");
    }

    public final synchronized void Z() {
        Throwable th2;
        try {
            y yVar = this.F;
            if (yVar != null) {
                yVar.close();
            }
            y yVarD = a.a.d(this.L.k(this.f7169r));
            try {
                yVarD.H("libcore.io.DiskLruCache");
                yVarD.writeByte(10);
                yVarD.H("1");
                yVarD.writeByte(10);
                yVarD.h0(1);
                yVarD.writeByte(10);
                yVarD.h0(2);
                yVarD.writeByte(10);
                yVarD.writeByte(10);
                for (b bVar : this.f7171y.values()) {
                    if (bVar.f7157g != null) {
                        yVarD.H("DIRTY");
                        yVarD.writeByte(32);
                        yVarD.H(bVar.f7151a);
                        yVarD.writeByte(10);
                    } else {
                        yVarD.H("CLEAN");
                        yVarD.writeByte(32);
                        yVarD.H(bVar.f7151a);
                        for (long j : bVar.f7152b) {
                            yVarD.writeByte(32);
                            yVarD.h0(j);
                        }
                        yVarD.writeByte(10);
                    }
                }
                try {
                    yVarD.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    yVarD.close();
                } catch (Throwable th5) {
                    f0.c(th4, th5);
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.L.f(this.f7168g)) {
                this.L.b(this.f7168g, this.f7170x);
                this.L.b(this.f7169r, this.f7168g);
                this.L.e(this.f7170x);
            } else {
                this.L.b(this.f7169r, this.f7168g);
            }
            this.F = w();
            this.E = 0;
            this.G = false;
            this.K = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.H && !this.I) {
                for (b bVar : (b[]) this.f7171y.values().toArray(new b[0])) {
                    a aVar = bVar.f7157g;
                    if (aVar != null) {
                        b bVar2 = (b) aVar.f7149c;
                        if (br.l.a(bVar2.f7157g, aVar)) {
                            bVar2.f7156f = true;
                        }
                    }
                }
                V();
                wt.w.f(this.B, null);
                y yVar = this.F;
                br.l.b(yVar);
                yVar.close();
                this.F = null;
                this.I = true;
                return;
            }
            this.I = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized a f(String str) {
        if (this.I) {
            throw new IllegalStateException("cache is closed");
        }
        Y(str);
        i();
        b bVar = (b) this.f7171y.get(str);
        if ((bVar != null ? bVar.f7157g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.f7158h != 0) {
            return null;
        }
        if (!this.J && !this.K) {
            y yVar = this.F;
            br.l.b(yVar);
            yVar.H("DIRTY");
            yVar.writeByte(32);
            yVar.H(str);
            yVar.writeByte(10);
            yVar.flush();
            if (this.G) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, str);
                this.f7171y.put(str, bVar);
            }
            a aVar = new a(this, bVar);
            bVar.f7157g = aVar;
            return aVar;
        }
        q();
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.H) {
            if (this.I) {
                throw new IllegalStateException("cache is closed");
            }
            V();
            y yVar = this.F;
            br.l.b(yVar);
            yVar.flush();
        }
    }

    public final synchronized c h(String str) {
        c cVarA;
        if (this.I) {
            throw new IllegalStateException("cache is closed");
        }
        Y(str);
        i();
        b bVar = (b) this.f7171y.get(str);
        if (bVar != null && (cVarA = bVar.a()) != null) {
            boolean z10 = true;
            this.E++;
            y yVar = this.F;
            br.l.b(yVar);
            yVar.H("READ");
            yVar.writeByte(32);
            yVar.H(str);
            yVar.writeByte(10);
            if (this.E < 2000) {
                z10 = false;
            }
            if (z10) {
                q();
            }
            return cVarA;
        }
        return null;
    }

    public final synchronized void i() {
        try {
            if (this.H) {
                return;
            }
            this.L.e(this.f7169r);
            if (this.L.f(this.f7170x)) {
                if (this.L.f(this.f7168g)) {
                    this.L.e(this.f7170x);
                } else {
                    this.L.b(this.f7170x, this.f7168g);
                }
            }
            if (this.L.f(this.f7168g)) {
                try {
                    G();
                    y();
                    this.H = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        dr.a.l(this.L, this.f7166a);
                        this.I = false;
                    } catch (Throwable th2) {
                        this.I = false;
                        throw th2;
                    }
                }
            }
            Z();
            this.H = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void q() {
        wt.w.s(this.B, null, null, new e(this, null, 0), 3);
    }

    public final y w() {
        d dVar = this.L;
        dVar.getClass();
        w wVar = this.f7168g;
        br.l.e(wVar, "file");
        return a.a.d(new g(dVar.a(wVar), new j(1, this)));
    }

    public final void y() {
        Iterator it = this.f7171y.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i10 = 0;
            if (bVar.f7157g == null) {
                while (i10 < 2) {
                    j += bVar.f7152b[i10];
                    i10++;
                }
            } else {
                bVar.f7157g = null;
                while (i10 < 2) {
                    w wVar = (w) bVar.f7153c.get(i10);
                    d dVar = this.L;
                    dVar.e(wVar);
                    dVar.e((w) bVar.f7154d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.D = j;
    }
}
