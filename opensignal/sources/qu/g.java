package qu;

import br.l;
import cv.h0;
import cv.u;
import cv.y;
import cv.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import tt.k;
import tt.s;
import xu.n;

/* loaded from: classes.dex */
public final class g implements Closeable, Flushable {
    public static final k O = new k("[a-z0-9_-]{1,120}");
    public static final String P = "CLEAN";
    public static final String Q = "DIRTY";
    public static final String R = "REMOVE";
    public static final String S = "READ";
    public y B;
    public final LinkedHashMap D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public final ru.b M;
    public final f N;

    /* renamed from: a, reason: collision with root package name */
    public final File f21086a;

    /* renamed from: d, reason: collision with root package name */
    public final long f21087d;

    /* renamed from: g, reason: collision with root package name */
    public final File f21088g;

    /* renamed from: r, reason: collision with root package name */
    public final File f21089r;

    /* renamed from: x, reason: collision with root package name */
    public final File f21090x;

    /* renamed from: y, reason: collision with root package name */
    public long f21091y;

    public g(File file, long j, ru.c cVar) {
        l.e(cVar, "taskRunner");
        this.f21086a = file;
        this.f21087d = j;
        this.D = new LinkedHashMap(0, 0.75f, true);
        this.M = cVar.e();
        this.N = new f(this, w.g.j(new StringBuilder(), pu.b.f20651g, " Cache"), 0);
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f21088g = new File(file, "journal");
        this.f21089r = new File(file, "journal.tmp");
        this.f21090x = new File(file, "journal.bkp");
    }

    public static void f0(String str) {
        if (!O.a(str)) {
            throw new IllegalArgumentException(h0.b.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final void G() {
        File file = this.f21089r;
        wu.a aVar = wu.a.f24680a;
        aVar.a(file);
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            l.d(next, "i.next()");
            d dVar = (d) next;
            int i10 = 0;
            if (dVar.f21077g == null) {
                while (i10 < 2) {
                    this.f21091y += dVar.f21072b[i10];
                    i10++;
                }
            } else {
                dVar.f21077g = null;
                while (i10 < 2) {
                    aVar.a((File) dVar.f21073c.get(i10));
                    aVar.a((File) dVar.f21074d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void L() throws IOException {
        File file = this.f21088g;
        l.e(file, "file");
        Logger logger = u.f6739a;
        z zVarE = a.a.e(new cv.c(xu.d.j(file, new FileInputStream(file)), h0.f6707d));
        try {
            String strZ = zVarE.z(Long.MAX_VALUE);
            String strZ2 = zVarE.z(Long.MAX_VALUE);
            String strZ3 = zVarE.z(Long.MAX_VALUE);
            String strZ4 = zVarE.z(Long.MAX_VALUE);
            String strZ5 = zVarE.z(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strZ) || !"1".equals(strZ2) || !l.a(String.valueOf(201105), strZ3) || !l.a(String.valueOf(2), strZ4) || strZ5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strZ + ", " + strZ2 + ", " + strZ4 + ", " + strZ5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    R(zVarE.z(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.E = i10 - this.D.size();
                    if (zVarE.b()) {
                        this.B = y();
                    } else {
                        V();
                    }
                    zVarE.close();
                    return;
                }
            }
        } finally {
        }
    }

    public final void R(String str) throws IOException {
        String strSubstring;
        int iA0 = tt.l.A0(str, ' ', 0, 6);
        if (iA0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iA0 + 1;
        int iA02 = tt.l.A0(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.D;
        if (iA02 == -1) {
            strSubstring = str.substring(i10);
            l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = R;
            if (iA0 == str2.length() && s.n0(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iA02);
            l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        d dVar = (d) linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(this, strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iA02 != -1) {
            String str3 = P;
            if (iA0 == str3.length() && s.n0(str, str3, false)) {
                String strSubstring2 = str.substring(iA02 + 1);
                l.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listO0 = tt.l.O0(strSubstring2, new char[]{' '});
                dVar.f21075e = true;
                dVar.f21077g = null;
                int size = listO0.size();
                dVar.j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listO0);
                }
                try {
                    int size2 = listO0.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        dVar.f21072b[i11] = Long.parseLong((String) listO0.get(i11));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listO0);
                }
            }
        }
        if (iA02 == -1) {
            String str4 = Q;
            if (iA0 == str4.length() && s.n0(str, str4, false)) {
                dVar.f21077g = new d8.a(this, dVar);
                return;
            }
        }
        if (iA02 == -1) {
            String str5 = S;
            if (iA0 == str5.length() && s.n0(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void V() {
        cv.b bVar;
        try {
            y yVar = this.B;
            if (yVar != null) {
                yVar.close();
            }
            File file = this.f21089r;
            l.e(file, "file");
            try {
                Logger logger = u.f6739a;
                bVar = new cv.b(xu.l.j(file, new FileOutputStream(file, false), false), new h0());
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = u.f6739a;
                bVar = new cv.b(xu.l.j(file, new FileOutputStream(file, false), false), new h0());
            }
            y yVarD = a.a.d(bVar);
            try {
                yVarD.H("libcore.io.DiskLruCache");
                yVarD.writeByte(10);
                yVarD.H("1");
                yVarD.writeByte(10);
                yVarD.h0(201105);
                yVarD.writeByte(10);
                yVarD.h0(2);
                yVarD.writeByte(10);
                yVarD.writeByte(10);
                for (d dVar : this.D.values()) {
                    if (dVar.f21077g != null) {
                        yVarD.H(Q);
                        yVarD.writeByte(32);
                        yVarD.H(dVar.f21071a);
                        yVarD.writeByte(10);
                    } else {
                        yVarD.H(P);
                        yVarD.writeByte(32);
                        yVarD.H(dVar.f21071a);
                        for (long j : dVar.f21072b) {
                            yVarD.writeByte(32);
                            yVarD.h0(j);
                        }
                        yVarD.writeByte(10);
                    }
                }
                yVarD.close();
                wu.a aVar = wu.a.f24680a;
                if (aVar.c(this.f21088g)) {
                    aVar.d(this.f21088g, this.f21090x);
                }
                aVar.d(this.f21089r, this.f21088g);
                aVar.a(this.f21090x);
                this.B = y();
                this.F = false;
                this.K = false;
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void Y(d dVar) {
        y yVar;
        String str = dVar.f21071a;
        if (!this.G) {
            if (dVar.f21078h > 0 && (yVar = this.B) != null) {
                yVar.H(Q);
                yVar.writeByte(32);
                yVar.H(str);
                yVar.writeByte(10);
                yVar.flush();
            }
            if (dVar.f21078h > 0 || dVar.f21077g != null) {
                dVar.f21076f = true;
                return;
            }
        }
        d8.a aVar = dVar.f21077g;
        if (aVar != null) {
            aVar.e();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            File file = (File) dVar.f21073c.get(i10);
            l.e(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
            long j = this.f21091y;
            long[] jArr = dVar.f21072b;
            this.f21091y = j - jArr[i10];
            jArr[i10] = 0;
        }
        this.E++;
        y yVar2 = this.B;
        if (yVar2 != null) {
            yVar2.H(R);
            yVar2.writeByte(32);
            yVar2.H(str);
            yVar2.writeByte(10);
        }
        this.D.remove(str);
        if (w()) {
            this.M.c(this.N, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        Y(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f21091y
            long r2 = r4.f21087d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.D
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            qu.d r1 = (qu.d) r1
            boolean r2 = r1.f21076f
            if (r2 != 0) goto L12
            r4.Y(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.g.Z():void");
    }

    public final synchronized void b() {
        if (this.I) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.H && !this.I) {
                Collection collectionValues = this.D.values();
                l.d(collectionValues, "lruEntries.values");
                for (d dVar : (d[]) collectionValues.toArray(new d[0])) {
                    d8.a aVar = dVar.f21077g;
                    if (aVar != null) {
                        aVar.e();
                    }
                }
                Z();
                y yVar = this.B;
                l.b(yVar);
                yVar.close();
                this.B = null;
                this.I = true;
                return;
            }
            this.I = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(d8.a aVar, boolean z10) {
        d dVar = (d) aVar.f7149c;
        if (!l.a(dVar.f21077g, aVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !dVar.f21075e) {
            for (int i10 = 0; i10 < 2; i10++) {
                boolean[] zArr = (boolean[]) aVar.f7147a;
                l.b(zArr);
                if (!zArr[i10]) {
                    aVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                File file = (File) dVar.f21074d.get(i10);
                l.e(file, "file");
                if (!file.exists()) {
                    aVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            File file2 = (File) dVar.f21074d.get(i11);
            if (!z10 || dVar.f21076f) {
                l.e(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException("failed to delete " + file2);
                }
            } else {
                wu.a aVar2 = wu.a.f24680a;
                if (aVar2.c(file2)) {
                    File file3 = (File) dVar.f21073c.get(i11);
                    aVar2.d(file2, file3);
                    long j = dVar.f21072b[i11];
                    long length = file3.length();
                    dVar.f21072b[i11] = length;
                    this.f21091y = (this.f21091y - j) + length;
                }
            }
        }
        dVar.f21077g = null;
        if (dVar.f21076f) {
            Y(dVar);
            return;
        }
        this.E++;
        y yVar = this.B;
        l.b(yVar);
        if (dVar.f21075e || z10) {
            dVar.f21075e = true;
            yVar.H(P);
            yVar.writeByte(32);
            yVar.H(dVar.f21071a);
            for (long j7 : dVar.f21072b) {
                yVar.writeByte(32);
                yVar.h0(j7);
            }
            yVar.writeByte(10);
            if (z10) {
                long j10 = this.L;
                this.L = 1 + j10;
                dVar.f21079i = j10;
            }
        } else {
            this.D.remove(dVar.f21071a);
            yVar.H(R);
            yVar.writeByte(32);
            yVar.H(dVar.f21071a);
            yVar.writeByte(10);
        }
        yVar.flush();
        if (this.f21091y > this.f21087d || w()) {
            this.M.c(this.N, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.H) {
            b();
            Z();
            y yVar = this.B;
            l.b(yVar);
            yVar.flush();
        }
    }

    public final synchronized d8.a h(long j, String str) {
        l.e(str, "key");
        q();
        b();
        f0(str);
        d dVar = (d) this.D.get(str);
        if (j != -1 && (dVar == null || dVar.f21079i != j)) {
            return null;
        }
        if ((dVar != null ? dVar.f21077g : null) != null) {
            return null;
        }
        if (dVar != null && dVar.f21078h != 0) {
            return null;
        }
        if (!this.J && !this.K) {
            y yVar = this.B;
            l.b(yVar);
            yVar.H(Q);
            yVar.writeByte(32);
            yVar.H(str);
            yVar.writeByte(10);
            yVar.flush();
            if (this.F) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(this, str);
                this.D.put(str, dVar);
            }
            d8.a aVar = new d8.a(this, dVar);
            dVar.f21077g = aVar;
            return aVar;
        }
        this.M.c(this.N, 0L);
        return null;
    }

    public final synchronized e i(String str) {
        l.e(str, "key");
        q();
        b();
        f0(str);
        d dVar = (d) this.D.get(str);
        if (dVar == null) {
            return null;
        }
        e eVarA = dVar.a();
        if (eVarA == null) {
            return null;
        }
        this.E++;
        y yVar = this.B;
        l.b(yVar);
        yVar.H(S);
        yVar.writeByte(32);
        yVar.H(str);
        yVar.writeByte(10);
        if (w()) {
            this.M.c(this.N, 0L);
        }
        return eVarA;
    }

    public final synchronized void q() {
        boolean z10;
        try {
            byte[] bArr = pu.b.f20645a;
            if (this.H) {
                return;
            }
            wu.a aVar = wu.a.f24680a;
            if (aVar.c(this.f21090x)) {
                if (aVar.c(this.f21088g)) {
                    aVar.a(this.f21090x);
                } else {
                    aVar.d(this.f21090x, this.f21088g);
                }
            }
            File file = this.f21090x;
            l.e(file, "file");
            cv.b bVarE = aVar.e(file);
            try {
                aVar.a(file);
                bVarE.close();
                z10 = true;
            } catch (IOException unused) {
                bVarE.close();
                aVar.a(file);
                z10 = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ic.a.g(bVarE, th2);
                    throw th3;
                }
            }
            this.G = z10;
            File file2 = this.f21088g;
            l.e(file2, "file");
            if (file2.exists()) {
                try {
                    L();
                    G();
                    this.H = true;
                    return;
                } catch (IOException e4) {
                    n nVar = n.f25563a;
                    n nVar2 = n.f25563a;
                    String str = "DiskLruCache " + this.f21086a + " is corrupt: " + e4.getMessage() + ", removing";
                    nVar2.getClass();
                    n.i(str, 5, e4);
                    try {
                        close();
                        wu.a.f24680a.b(this.f21086a);
                        this.I = false;
                    } catch (Throwable th4) {
                        this.I = false;
                        throw th4;
                    }
                }
            }
            V();
            this.H = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean w() {
        int i10 = this.E;
        return i10 >= 2000 && i10 >= this.D.size();
    }

    public final y y() {
        cv.b bVar;
        File file = this.f21088g;
        l.e(file, "file");
        try {
            Logger logger = u.f6739a;
            bVar = new cv.b(xu.l.j(file, new FileOutputStream(file, true), true), new h0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = u.f6739a;
            bVar = new cv.b(xu.l.j(file, new FileOutputStream(file, true), true), new h0());
        }
        return a.a.d(new d8.g(bVar, new j1.a(7, this)));
    }
}
