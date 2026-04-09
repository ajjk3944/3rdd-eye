package W9;

import K6.C0749p;
import androidx.work.s;
import b9.C1992A;
import da.h;
import ia.A;
import ia.C;
import ia.C4467c;
import ia.D;
import ia.p;
import ia.q;
import ia.r;
import ia.t;
import ia.v;
import ia.w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import p9.l;
import y9.C5826h;
import y9.n;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: t, reason: collision with root package name */
    public static final C5826h f13367t = new C5826h("[a-z0-9_-]{1,120}");

    /* renamed from: u, reason: collision with root package name */
    public static final String f13368u = "CLEAN";

    /* renamed from: v, reason: collision with root package name */
    public static final String f13369v = "DIRTY";

    /* renamed from: w, reason: collision with root package name */
    public static final String f13370w = "REMOVE";

    /* renamed from: x, reason: collision with root package name */
    public static final String f13371x = "READ";

    /* renamed from: b, reason: collision with root package name */
    public final File f13372b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13373c;

    /* renamed from: d, reason: collision with root package name */
    public final File f13374d;

    /* renamed from: e, reason: collision with root package name */
    public final File f13375e;

    /* renamed from: f, reason: collision with root package name */
    public final File f13376f;

    /* renamed from: g, reason: collision with root package name */
    public long f13377g;

    /* renamed from: h, reason: collision with root package name */
    public v f13378h;
    public final LinkedHashMap<String, b> i;

    /* renamed from: j, reason: collision with root package name */
    public int f13379j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13380k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13381l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13382m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13383n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13384o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13385p;

    /* renamed from: q, reason: collision with root package name */
    public long f13386q;

    /* renamed from: r, reason: collision with root package name */
    public final X9.c f13387r;

    /* renamed from: s, reason: collision with root package name */
    public final f f13388s;

    /* compiled from: DiskLruCache.kt */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final b f13389a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f13390b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13391c;

        /* compiled from: DiskLruCache.kt */
        /* renamed from: W9.d$a$a, reason: collision with other inner class name */
        public static final class C0193a extends m implements l<IOException, C1992A> {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ d f13393g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ a f13394h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0193a(d dVar, a aVar) {
                super(1);
                this.f13393g = dVar;
                this.f13394h = aVar;
            }

            @Override // p9.l
            public final C1992A invoke(IOException iOException) {
                IOException it = iOException;
                kotlin.jvm.internal.l.f(it, "it");
                d dVar = this.f13393g;
                a aVar = this.f13394h;
                synchronized (dVar) {
                    aVar.c();
                }
                return C1992A.f18074a;
            }
        }

        public a(b bVar) {
            boolean[] zArr;
            this.f13389a = bVar;
            if (bVar.f13399e) {
                zArr = null;
            } else {
                d.this.getClass();
                zArr = new boolean[2];
            }
            this.f13390b = zArr;
        }

        public final void a() throws IOException {
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    if (this.f13391c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (kotlin.jvm.internal.l.b(this.f13389a.f13401g, this)) {
                        dVar.c(this, false);
                    }
                    this.f13391c = true;
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() throws IOException {
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    if (this.f13391c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (kotlin.jvm.internal.l.b(this.f13389a.f13401g, this)) {
                        dVar.c(this, true);
                    }
                    this.f13391c = true;
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() throws IOException {
            b bVar = this.f13389a;
            if (kotlin.jvm.internal.l.b(bVar.f13401g, this)) {
                d dVar = d.this;
                if (dVar.f13381l) {
                    dVar.c(this, false);
                } else {
                    bVar.f13400f = true;
                }
            }
        }

        public final A d(int i) {
            t tVarF;
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    if (this.f13391c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!kotlin.jvm.internal.l.b(this.f13389a.f13401g, this)) {
                        return new C4467c();
                    }
                    if (!this.f13389a.f13399e) {
                        boolean[] zArr = this.f13390b;
                        kotlin.jvm.internal.l.c(zArr);
                        zArr[i] = true;
                    }
                    File file = (File) this.f13389a.f13398d.get(i);
                    try {
                        kotlin.jvm.internal.l.f(file, "file");
                        try {
                            tVarF = q.f(file);
                        } catch (FileNotFoundException unused) {
                            file.getParentFile().mkdirs();
                            tVarF = q.f(file);
                        }
                        return new g(tVarF, new C0193a(dVar, this));
                    } catch (FileNotFoundException unused2) {
                        return new C4467c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f13395a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f13396b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f13397c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f13398d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13399e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f13400f;

        /* renamed from: g, reason: collision with root package name */
        public a f13401g;

        /* renamed from: h, reason: collision with root package name */
        public int f13402h;
        public long i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f13403j;

        public b(d dVar, String key) {
            kotlin.jvm.internal.l.f(key, "key");
            this.f13403j = dVar;
            this.f13395a = key;
            dVar.getClass();
            this.f13396b = new long[2];
            this.f13397c = new ArrayList();
            this.f13398d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.f13397c.add(new File(this.f13403j.f13372b, sb.toString()));
                sb.append(".tmp");
                this.f13398d.add(new File(this.f13403j.f13372b, sb.toString()));
                sb.setLength(length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [W9.e] */
        public final c a() throws IOException {
            byte[] bArr = V9.b.f13053a;
            if (!this.f13399e) {
                return null;
            }
            d dVar = this.f13403j;
            if (!dVar.f13381l && (this.f13401g != null || this.f13400f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f13396b.clone();
            for (int i = 0; i < 2; i++) {
                try {
                    File file = (File) this.f13397c.get(i);
                    kotlin.jvm.internal.l.f(file, "file");
                    Logger logger = r.f38670a;
                    p pVar = new p(new FileInputStream(file), D.NONE);
                    if (!dVar.f13381l) {
                        this.f13402h++;
                        pVar = new e(pVar, dVar, this);
                    }
                    arrayList.add(pVar);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        V9.b.c((C) it.next());
                    }
                    try {
                        dVar.F(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new c(this.f13403j, this.f13395a, this.i, arrayList, jArr);
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final String f13404b;

        /* renamed from: c, reason: collision with root package name */
        public final long f13405c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f13406d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f13407e;

        public c(d dVar, String key, long j4, ArrayList arrayList, long[] lengths) {
            kotlin.jvm.internal.l.f(key, "key");
            kotlin.jvm.internal.l.f(lengths, "lengths");
            this.f13407e = dVar;
            this.f13404b = key;
            this.f13405c = j4;
            this.f13406d = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Iterator it = this.f13406d.iterator();
            while (it.hasNext()) {
                V9.b.c((C) it.next());
            }
        }
    }

    public d(File directory, long j4, X9.d taskRunner) {
        kotlin.jvm.internal.l.f(directory, "directory");
        kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
        this.f13372b = directory;
        this.f13373c = j4;
        this.i = new LinkedHashMap<>(0, 0.75f, true);
        this.f13387r = taskRunner.e();
        this.f13388s = new f(this, B4.f.c(new StringBuilder(), V9.b.f13059g, " Cache"));
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f13374d = new File(directory, "journal");
        this.f13375e = new File(directory, "journal.tmp");
        this.f13376f = new File(directory, "journal.bkp");
    }

    public static void k0(String str) {
        if (!f13367t.a(str)) {
            throw new IllegalArgumentException(s.e("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
        }
    }

    public final void A() throws IOException {
        t tVarA;
        File file = this.f13374d;
        kotlin.jvm.internal.l.f(file, "file");
        Logger logger = r.f38670a;
        w wVarC = q.c(new p(new FileInputStream(file), D.NONE));
        try {
            String strS = wVarC.S(Long.MAX_VALUE);
            String strS2 = wVarC.S(Long.MAX_VALUE);
            String strS3 = wVarC.S(Long.MAX_VALUE);
            String strS4 = wVarC.S(Long.MAX_VALUE);
            String strS5 = wVarC.S(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strS) || !"1".equals(strS2) || !kotlin.jvm.internal.l.b(String.valueOf(201105), strS3) || !kotlin.jvm.internal.l.b(String.valueOf(2), strS4) || strS5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strS + ", " + strS2 + ", " + strS4 + ", " + strS5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    B(wVarC.S(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f13379j = i - this.i.size();
                    if (wVarC.K()) {
                        kotlin.jvm.internal.l.f(file, "file");
                        try {
                            tVarA = q.a(file);
                        } catch (FileNotFoundException unused2) {
                            file.getParentFile().mkdirs();
                            tVarA = q.a(file);
                        }
                        this.f13378h = q.b(new g(tVarA, new C0749p(this, 6)));
                    } else {
                        D();
                    }
                    C1992A c1992a = C1992A.f18074a;
                    wVarC.close();
                    return;
                }
            }
        } finally {
        }
    }

    public final void B(String str) throws IOException {
        String strSubstring;
        int iF0 = y9.q.f0(str, ' ', 0, 6);
        if (iF0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iF0 + 1;
        int iF02 = y9.q.f0(str, ' ', i, 4);
        LinkedHashMap<String, b> linkedHashMap = this.i;
        if (iF02 == -1) {
            strSubstring = str.substring(i);
            kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f13370w;
            if (iF0 == str2.length() && n.a0(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iF02);
            kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        b bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iF02 != -1) {
            String str3 = f13368u;
            if (iF0 == str3.length() && n.a0(str, str3, false)) {
                String strSubstring2 = str.substring(iF02 + 1);
                kotlin.jvm.internal.l.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listQ0 = y9.q.q0(strSubstring2, new char[]{' '});
                bVar.f13399e = true;
                bVar.f13401g = null;
                int size = listQ0.size();
                bVar.f13403j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listQ0);
                }
                try {
                    int size2 = listQ0.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        bVar.f13396b[i10] = Long.parseLong((String) listQ0.get(i10));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listQ0);
                }
            }
        }
        if (iF02 == -1) {
            String str4 = f13369v;
            if (iF0 == str4.length() && n.a0(str, str4, false)) {
                bVar.f13401g = new a(bVar);
                return;
            }
        }
        if (iF02 == -1) {
            String str5 = f13371x;
            if (iF0 == str5.length() && n.a0(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void D() throws IOException {
        t tVarF;
        t tVarA;
        try {
            v vVar = this.f13378h;
            if (vVar != null) {
                vVar.close();
            }
            File file = this.f13375e;
            kotlin.jvm.internal.l.f(file, "file");
            try {
                tVarF = q.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                tVarF = q.f(file);
            }
            v vVarB = q.b(tVarF);
            try {
                vVarB.c0("libcore.io.DiskLruCache");
                vVarB.L(10);
                vVarB.c0("1");
                vVarB.L(10);
                vVarB.H0(201105);
                vVarB.L(10);
                vVarB.H0(2);
                vVarB.L(10);
                vVarB.L(10);
                Iterator<b> it = this.i.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    if (next.f13401g != null) {
                        vVarB.c0(f13369v);
                        vVarB.L(32);
                        vVarB.c0(next.f13395a);
                        vVarB.L(10);
                    } else {
                        vVarB.c0(f13368u);
                        vVarB.L(32);
                        vVarB.c0(next.f13395a);
                        for (long j4 : next.f13396b) {
                            vVarB.L(32);
                            vVarB.H0(j4);
                        }
                        vVarB.L(10);
                    }
                }
                C1992A c1992a = C1992A.f18074a;
                vVarB.close();
                ca.a aVar = ca.a.f18589a;
                if (aVar.c(this.f13374d)) {
                    aVar.d(this.f13374d, this.f13376f);
                }
                aVar.d(this.f13375e, this.f13374d);
                aVar.a(this.f13376f);
                File file2 = this.f13374d;
                kotlin.jvm.internal.l.f(file2, "file");
                try {
                    tVarA = q.a(file2);
                } catch (FileNotFoundException unused2) {
                    file2.getParentFile().mkdirs();
                    tVarA = q.a(file2);
                }
                this.f13378h = q.b(new g(tVarA, new C0749p(this, 6)));
                this.f13380k = false;
                this.f13385p = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void F(b entry) throws IOException {
        v vVar;
        kotlin.jvm.internal.l.f(entry, "entry");
        boolean z10 = this.f13381l;
        String str = entry.f13395a;
        if (!z10) {
            if (entry.f13402h > 0 && (vVar = this.f13378h) != null) {
                vVar.c0(f13369v);
                vVar.L(32);
                vVar.c0(str);
                vVar.L(10);
                vVar.flush();
            }
            if (entry.f13402h > 0 || entry.f13401g != null) {
                entry.f13400f = true;
                return;
            }
        }
        a aVar = entry.f13401g;
        if (aVar != null) {
            aVar.c();
        }
        for (int i = 0; i < 2; i++) {
            File file = (File) entry.f13397c.get(i);
            kotlin.jvm.internal.l.f(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
            long j4 = this.f13377g;
            long[] jArr = entry.f13396b;
            this.f13377g = j4 - jArr[i];
            jArr[i] = 0;
        }
        this.f13379j++;
        v vVar2 = this.f13378h;
        if (vVar2 != null) {
            vVar2.c0(f13370w);
            vVar2.L(32);
            vVar2.c0(str);
            vVar2.L(10);
        }
        this.i.remove(str);
        if (l()) {
            this.f13387r.c(this.f13388s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        F(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            long r0 = r4.f13377g
            long r2 = r4.f13373c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap<java.lang.String, W9.d$b> r0 = r4.i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            W9.d$b r1 = (W9.d.b) r1
            boolean r2 = r1.f13400f
            if (r2 != 0) goto L12
            r4.F(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f13384o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W9.d.W():void");
    }

    public final synchronized void a() {
        if (this.f13383n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c(a editor, boolean z10) throws IOException {
        kotlin.jvm.internal.l.f(editor, "editor");
        b bVar = editor.f13389a;
        if (!kotlin.jvm.internal.l.b(bVar.f13401g, editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !bVar.f13399e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = editor.f13390b;
                kotlin.jvm.internal.l.c(zArr);
                if (!zArr[i]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                File file = (File) bVar.f13398d.get(i);
                kotlin.jvm.internal.l.f(file, "file");
                if (!file.exists()) {
                    editor.a();
                    return;
                }
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            File file2 = (File) bVar.f13398d.get(i10);
            if (!z10 || bVar.f13400f) {
                kotlin.jvm.internal.l.f(file2, "file");
                if (!file2.delete() && file2.exists()) {
                    throw new IOException("failed to delete " + file2);
                }
            } else {
                ca.a aVar = ca.a.f18589a;
                if (aVar.c(file2)) {
                    File file3 = (File) bVar.f13397c.get(i10);
                    aVar.d(file2, file3);
                    long j4 = bVar.f13396b[i10];
                    long length = file3.length();
                    bVar.f13396b[i10] = length;
                    this.f13377g = (this.f13377g - j4) + length;
                }
            }
        }
        bVar.f13401g = null;
        if (bVar.f13400f) {
            F(bVar);
            return;
        }
        this.f13379j++;
        v vVar = this.f13378h;
        kotlin.jvm.internal.l.c(vVar);
        if (bVar.f13399e || z10) {
            bVar.f13399e = true;
            vVar.c0(f13368u);
            vVar.L(32);
            vVar.c0(bVar.f13395a);
            for (long j10 : bVar.f13396b) {
                vVar.L(32);
                vVar.H0(j10);
            }
            vVar.L(10);
            if (z10) {
                long j11 = this.f13386q;
                this.f13386q = 1 + j11;
                bVar.i = j11;
            }
        } else {
            this.i.remove(bVar.f13395a);
            vVar.c0(f13370w);
            vVar.L(32);
            vVar.c0(bVar.f13395a);
            vVar.L(10);
        }
        vVar.flush();
        if (this.f13377g > this.f13373c || l()) {
            this.f13387r.c(this.f13388s, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.f13382m && !this.f13383n) {
                Collection<b> collectionValues = this.i.values();
                kotlin.jvm.internal.l.e(collectionValues, "lruEntries.values");
                for (b bVar : (b[]) collectionValues.toArray(new b[0])) {
                    a aVar = bVar.f13401g;
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                W();
                v vVar = this.f13378h;
                kotlin.jvm.internal.l.c(vVar);
                vVar.close();
                this.f13378h = null;
                this.f13383n = true;
                return;
            }
            this.f13383n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized a d(long j4, String key) throws IOException {
        try {
            kotlin.jvm.internal.l.f(key, "key");
            k();
            a();
            k0(key);
            b bVar = this.i.get(key);
            if (j4 != -1 && (bVar == null || bVar.i != j4)) {
                return null;
            }
            if ((bVar != null ? bVar.f13401g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.f13402h != 0) {
                return null;
            }
            if (!this.f13384o && !this.f13385p) {
                v vVar = this.f13378h;
                kotlin.jvm.internal.l.c(vVar);
                vVar.c0(f13369v);
                vVar.L(32);
                vVar.c0(key);
                vVar.L(10);
                vVar.flush();
                if (this.f13380k) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(this, key);
                    this.i.put(key, bVar);
                }
                a aVar = new a(bVar);
                bVar.f13401g = aVar;
                return aVar;
            }
            this.f13387r.c(this.f13388s, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized c e(String key) throws IOException {
        kotlin.jvm.internal.l.f(key, "key");
        k();
        a();
        k0(key);
        b bVar = this.i.get(key);
        if (bVar == null) {
            return null;
        }
        c cVarA = bVar.a();
        if (cVarA == null) {
            return null;
        }
        this.f13379j++;
        v vVar = this.f13378h;
        kotlin.jvm.internal.l.c(vVar);
        vVar.c0(f13371x);
        vVar.L(32);
        vVar.c0(key);
        vVar.L(10);
        if (l()) {
            this.f13387r.c(this.f13388s, 0L);
        }
        return cVarA;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (this.f13382m) {
            a();
            W();
            v vVar = this.f13378h;
            kotlin.jvm.internal.l.c(vVar);
            vVar.flush();
        }
    }

    public final synchronized void k() throws IOException {
        t tVarF;
        boolean z10;
        try {
            byte[] bArr = V9.b.f13053a;
            if (this.f13382m) {
                return;
            }
            ca.a aVar = ca.a.f18589a;
            if (aVar.c(this.f13376f)) {
                if (aVar.c(this.f13374d)) {
                    aVar.a(this.f13376f);
                } else {
                    aVar.d(this.f13376f, this.f13374d);
                }
            }
            File file = this.f13376f;
            kotlin.jvm.internal.l.f(file, "file");
            aVar.getClass();
            kotlin.jvm.internal.l.f(file, "file");
            try {
                tVarF = q.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                tVarF = q.f(file);
            }
            try {
                try {
                    aVar.a(file);
                    tVarF.close();
                    z10 = true;
                } finally {
                }
            } catch (IOException unused2) {
                C1992A c1992a = C1992A.f18074a;
                tVarF.close();
                aVar.a(file);
                z10 = false;
            }
            this.f13381l = z10;
            File file2 = this.f13374d;
            kotlin.jvm.internal.l.f(file2, "file");
            if (file2.exists()) {
                try {
                    A();
                    n();
                    this.f13382m = true;
                    return;
                } catch (IOException e4) {
                    h hVar = h.f37600a;
                    h hVar2 = h.f37600a;
                    String str = "DiskLruCache " + this.f13372b + " is corrupt: " + e4.getMessage() + ", removing";
                    hVar2.getClass();
                    h.i(5, str, e4);
                    try {
                        close();
                        ca.a.f18589a.b(this.f13372b);
                        this.f13383n = false;
                    } catch (Throwable th) {
                        this.f13383n = false;
                        throw th;
                    }
                }
            }
            D();
            this.f13382m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean l() {
        int i = this.f13379j;
        return i >= 2000 && i >= this.i.size();
    }

    public final void n() throws IOException {
        File file = this.f13375e;
        ca.a aVar = ca.a.f18589a;
        aVar.a(file);
        Iterator<b> it = this.i.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            kotlin.jvm.internal.l.e(next, "i.next()");
            b bVar = next;
            int i = 0;
            if (bVar.f13401g == null) {
                while (i < 2) {
                    this.f13377g += bVar.f13396b[i];
                    i++;
                }
            } else {
                bVar.f13401g = null;
                while (i < 2) {
                    aVar.a((File) bVar.f13397c.get(i));
                    aVar.a((File) bVar.f13398d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }
}
