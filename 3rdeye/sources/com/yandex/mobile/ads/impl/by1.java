package com.yandex.mobile.ads.impl;

import N7.G8;
import android.os.ConditionVariable;
import com.yandex.mobile.ads.impl.mm;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class by1 implements mm {

    /* renamed from: j, reason: collision with root package name */
    private static final HashSet<File> f25464j = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private final File f25465a;

    /* renamed from: b, reason: collision with root package name */
    private final tm f25466b;

    /* renamed from: c, reason: collision with root package name */
    private final en f25467c;

    /* renamed from: d, reason: collision with root package name */
    private final vm f25468d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<mm.b>> f25469e;

    /* renamed from: f, reason: collision with root package name */
    private final Random f25470f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f25471g;

    /* renamed from: h, reason: collision with root package name */
    private long f25472h;
    private mm.a i;

    public by1(File file, br0 br0Var, en enVar, vm vmVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f25465a = file;
        this.f25466b = br0Var;
        this.f25467c = enVar;
        this.f25468d = vmVar;
        this.f25469e = new HashMap<>();
        this.f25470f = new Random();
        this.f25471g = true;
        this.f25472h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new ay1(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized TreeSet c(String str) {
        dn dnVarA;
        try {
            dnVarA = this.f25467c.a(str);
        } catch (Throwable th) {
            throw th;
        }
        return (dnVarA == null || dnVarA.c()) ? new TreeSet() : new TreeSet((Collection) dnVarA.b());
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized long d(String str, long j4, long j10) {
        dn dnVarA;
        if (j10 == -1) {
            j10 = Long.MAX_VALUE;
        }
        dnVarA = this.f25467c.a(str);
        return dnVarA != null ? dnVarA.a(j4, j10) : -j10;
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized zm e(String str, long j4, long j10) throws Throwable {
        try {
            try {
                a();
                while (true) {
                    zm zmVarC = c(str, j4, j10);
                    long j11 = j10;
                    long j12 = j4;
                    String str2 = str;
                    if (zmVarC != null) {
                        return zmVarC;
                    }
                    wait();
                    str = str2;
                    j4 = j12;
                    j10 = j11;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void a(dy1 dy1Var) {
        this.f25467c.c(dy1Var.f36546b).a(dy1Var);
        ArrayList<mm.b> arrayList = this.f25469e.get(dy1Var.f36546b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, dy1Var);
            }
        }
        this.f25466b.a(this, dy1Var);
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized long b(String str, long j4, long j10) {
        long j11;
        long j12 = j10 == -1 ? Long.MAX_VALUE : j4 + j10;
        long j13 = j12 >= 0 ? j12 : Long.MAX_VALUE;
        long j14 = j4;
        j11 = 0;
        while (j14 < j13) {
            long jD = d(str, j14, j13 - j14);
            if (jD > 0) {
                j11 += jD;
            } else {
                jD = -jD;
            }
            j14 += jD;
        }
        return j11;
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized iz b(String str) {
        return this.f25467c.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() throws NumberFormatException {
        long j4;
        if (!this.f25465a.exists()) {
            try {
                a(this.f25465a);
            } catch (mm.a e4) {
                this.i = e4;
                return;
            }
        }
        File[] fileArrListFiles = this.f25465a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f25465a;
            rs0.b("SimpleCache", str);
            this.i = new mm.a(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j4 = -1;
                break;
            }
            File file = fileArrListFiles[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j4 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    rs0.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i++;
        }
        this.f25472h = j4;
        if (j4 == -1) {
            try {
                this.f25472h = b(this.f25465a);
            } catch (IOException e10) {
                String str2 = "Failed to create cache UID: " + this.f25465a;
                rs0.a("SimpleCache", str2, e10);
                this.i = new mm.a(str2, e10);
                return;
            }
        }
        try {
            this.f25467c.a(this.f25472h);
            vm vmVar = this.f25468d;
            if (vmVar != null) {
                vmVar.a(this.f25472h);
                HashMap mapA = this.f25468d.a();
                a(this.f25465a, true, fileArrListFiles, mapA);
                this.f25468d.a(mapA.keySet());
            } else {
                a(this.f25465a, true, fileArrListFiles, null);
            }
            this.f25467c.b();
            try {
                this.f25467c.c();
            } catch (Throwable th) {
                rs0.a("SimpleCache", "Storing index file failed", th);
            }
        } catch (Throwable th2) {
            String str3 = "Failed to initialize cache indices: " + this.f25465a;
            rs0.a("SimpleCache", str3, th2);
            this.i = new mm.a(str3, th2);
        }
    }

    private void c(zm zmVar) {
        dn dnVarA = this.f25467c.a(zmVar.f36546b);
        if (dnVarA == null || !dnVarA.a(zmVar)) {
            return;
        }
        if (this.f25468d != null) {
            String name = zmVar.f36550f.getName();
            try {
                this.f25468d.a(name);
            } catch (IOException unused) {
                fv0.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f25467c.d(dnVarA.f26271b);
        ArrayList<mm.b> arrayList = this.f25469e.get(zmVar.f36546b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(zmVar);
            }
        }
        this.f25466b.a(zmVar);
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized void a(String str, yr yrVar) throws mm.a {
        mm.a aVar;
        a();
        this.f25467c.a(str, yrVar);
        try {
            this.f25467c.c();
        } finally {
        }
    }

    public final synchronized void a() throws mm.a {
        mm.a aVar = this.i;
        if (aVar != null) {
            throw aVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized void a(File file, long j4) throws mm.a {
        if (file.exists()) {
            if (j4 == 0) {
                file.delete();
                return;
            }
            dy1 dy1VarA = dy1.a(file, j4, -9223372036854775807L, this.f25467c);
            dy1VarA.getClass();
            dn dnVarA = this.f25467c.a(dy1VarA.f36546b);
            dnVarA.getClass();
            if (dnVarA.c(dy1VarA.f36547c, dy1VarA.f36548d)) {
                long jB = dnVarA.a().b();
                if (jB != -1 && dy1VarA.f36547c + dy1VarA.f36548d > jB) {
                    throw new IllegalStateException();
                }
                if (this.f25468d != null) {
                    try {
                        this.f25468d.a(file.getName(), dy1VarA.f36548d, dy1VarA.f36551g);
                        a(dy1VarA);
                        try {
                            this.f25467c.c();
                            notifyAll();
                            return;
                        } finally {
                            mm.a aVar = new mm.a(e);
                        }
                    } catch (IOException e4) {
                        throw new mm.a(e4);
                    }
                }
                a(dy1VarA);
                this.f25467c.c();
                notifyAll();
                return;
            }
            throw new IllegalStateException();
        }
    }

    public by1(File file, br0 br0Var, f60 f60Var) {
        this(file, br0Var, new en(f60Var, file), new vm(f60Var));
    }

    private void c() {
        ArrayList arrayList = new ArrayList();
        Iterator<dn> it = this.f25467c.a().iterator();
        while (it.hasNext()) {
            Iterator<dy1> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                dy1 next = it2.next();
                if (next.f36550f.length() != next.f36548d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            c((zm) arrayList.get(i));
        }
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized zm c(String str, long j4, long j10) throws mm.a {
        dy1 dy1VarB;
        dy1 dy1VarA;
        boolean z10;
        try {
            a();
            dn dnVarA = this.f25467c.a(str);
            if (dnVarA == null) {
                dy1VarA = dy1.a(str, j4, j10);
            } else {
                while (true) {
                    dy1VarB = dnVarA.b(j4, j10);
                    if (!dy1VarB.f36549e || dy1VarB.f36550f.length() == dy1VarB.f36548d) {
                        break;
                    }
                    c();
                }
                dy1VarA = dy1VarB;
            }
            if (dy1VarA.f36549e) {
                if (this.f25471g) {
                    File file = dy1VarA.f36550f;
                    file.getClass();
                    String name = file.getName();
                    long j11 = dy1VarA.f36548d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    vm vmVar = this.f25468d;
                    if (vmVar != null) {
                        try {
                            vmVar.a(name, j11, jCurrentTimeMillis);
                        } catch (IOException unused) {
                            rs0.d("SimpleCache", "Failed to update index with new touch timestamp.");
                        }
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    dy1 dy1VarA2 = this.f25467c.a(str).a(dy1VarA, jCurrentTimeMillis, z10);
                    ArrayList<mm.b> arrayList = this.f25469e.get(dy1VarA.f36546b);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            arrayList.get(size).a(this, dy1VarA, dy1VarA2);
                        }
                    }
                    this.f25466b.a(this, dy1VarA, dy1VarA2);
                    dy1VarA = dy1VarA2;
                }
                return dy1VarA;
            }
            if (this.f25467c.c(str).d(j4, dy1VarA.f36548d)) {
                return dy1VarA;
            }
            return null;
        } finally {
        }
    }

    private static void a(File file) throws mm.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        rs0.b("SimpleCache", str);
        throw new mm.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized void b(zm zmVar) {
        dn dnVarA = this.f25467c.a(zmVar.f36546b);
        dnVarA.getClass();
        dnVarA.a(zmVar.f36547c);
        this.f25467c.d(dnVarA.f26271b);
        notifyAll();
    }

    private void a(File file, boolean z10, File[] fileArr, HashMap map) throws NumberFormatException {
        long j4;
        long j10;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                um umVar = map != null ? (um) map.remove(name) : null;
                if (umVar != null) {
                    j4 = umVar.f34085a;
                    j10 = umVar.f34086b;
                } else {
                    j4 = -1;
                    j10 = -9223372036854775807L;
                }
                dy1 dy1VarA = dy1.a(file2, j4, j10, this.f25467c);
                if (dy1VarA != null) {
                    a(dy1VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, G8.s(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private static synchronized boolean c(File file) {
        return f25464j.add(file.getAbsoluteFile());
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized void a(String str) {
        Iterator it = c(str).iterator();
        while (it.hasNext()) {
            c((zm) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized void a(zm zmVar) {
        c(zmVar);
    }

    @Override // com.yandex.mobile.ads.impl.mm
    public final synchronized File a(String str, long j4, long j10) throws mm.a {
        File file;
        long jCurrentTimeMillis;
        int i;
        try {
            a();
            dn dnVarA = this.f25467c.a(str);
            dnVarA.getClass();
            if (dnVarA.c(j4, j10)) {
                if (!this.f25465a.exists()) {
                    a(this.f25465a);
                    c();
                }
                this.f25466b.a(this, j10);
                file = new File(this.f25465a, Integer.toString(this.f25470f.nextInt(10)));
                if (!file.exists()) {
                    a(file);
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                i = dnVarA.f26270a;
                int i10 = dy1.f26555k;
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th) {
            throw th;
        }
        return new File(file, i + "." + j4 + "." + jCurrentTimeMillis + ".v3.exo");
    }
}
