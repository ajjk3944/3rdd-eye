package Z3;

import C0.k;
import U0.j;
import a4.l;
import a4.q;
import a4.r;
import a4.s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b4.C0340e;
import b4.C0344i;
import b4.InterfaceC0341f;
import d5.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f4523e = new AtomicReference(null);

    /* renamed from: a, reason: collision with root package name */
    public final c f4524a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4525b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f4526c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final j f4527d;

    public a(Context context) {
        try {
            c cVar = new c();
            cVar.f4531b = context;
            cVar.f4530a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            this.f4524a = cVar;
            this.f4527d = new j(22, cVar);
            this.f4525b = new l(context);
        } catch (PackageManager.NameNotFoundException e6) {
            throw new J0.c("Failed to initialize FileStorage", e6);
        }
    }

    public static boolean d(Context context, boolean z6) {
        AtomicReference atomicReference;
        boolean z7;
        a aVar = new a(context);
        while (true) {
            atomicReference = f4523e;
            if (!atomicReference.compareAndSet(null, aVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z7 = false;
                    break;
                }
            } else {
                z7 = true;
                break;
            }
        }
        a aVar2 = (a) atomicReference.get();
        if (z7) {
            q qVar = q.f4715a;
            q.f4716b.set(new C0340e(context, y.t(), new c1.g(context, aVar2.f4524a), aVar2.f4524a));
            h hVar = new h(aVar2);
            AtomicReference atomicReference2 = r.f4718a;
            while (!atomicReference2.compareAndSet(null, hVar) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            y.t().execute(new k(16, context));
        }
        try {
            aVar2.c(context, z6);
            return true;
        } catch (Exception e6) {
            Log.e("SplitCompat", "Error installing additional splits", e6);
            return false;
        }
    }

    public final HashSet a() {
        HashSet hashSet;
        synchronized (this.f4526c) {
            hashSet = new HashSet(this.f4526c);
        }
        return hashSet;
    }

    public final void b(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c cVar = this.f4524a;
            cVar.getClass();
            File file = new File(cVar.i(), "verified-splits");
            c.g(file);
            c.e(c.f(file, String.valueOf(str).concat(".apk")));
        }
        l lVar = this.f4525b;
        lVar.getClass();
        synchronized (l.class) {
            lVar.f4709a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final synchronized void c(Context context, boolean z6) {
        InterfaceC0341f rVar;
        IOException iOException;
        ZipFile zipFile;
        try {
            if (z6) {
                this.f4524a.d();
            } else {
                y.t().execute(new k(17, this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet hashSetC = this.f4524a.c();
                Set setA = this.f4525b.a();
                HashSet hashSet = new HashSet();
                Iterator it = hashSetC.iterator();
                while (it.hasNext()) {
                    String str = ((b) it.next()).f4529b;
                    if (!arrayList.contains(str)) {
                        X3.e eVar = s.f4719c;
                        if (setA.contains(str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet.add(str);
                    it.remove();
                }
                if (z6) {
                    b(hashSet);
                } else if (!hashSet.isEmpty()) {
                    y.t().execute(new A1.d(this, 20, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSetC.iterator();
                while (it2.hasNext()) {
                    String str2 = ((b) it2.next()).f4529b;
                    if (!s.b(str2)) {
                        hashSet2.add(str2);
                    }
                }
                for (String str3 : arrayList) {
                    if (!s.b(str3)) {
                        hashSet2.add(str3);
                    }
                }
                HashSet hashSet3 = new HashSet(hashSetC.size());
                Iterator it3 = hashSetC.iterator();
                while (it3.hasNext()) {
                    b bVar = (b) it3.next();
                    String str4 = bVar.f4529b;
                    X3.e eVar2 = s.f4719c;
                    if (!str4.startsWith("config.")) {
                        String str5 = bVar.f4529b;
                        if (hashSet2.contains(str5.startsWith("config.") ? "" : str5.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet3.add(bVar);
                }
                g gVar = new g(this.f4524a);
                int i = 1;
                switch (Build.VERSION.SDK_INT) {
                    case 23:
                        rVar = new S4.r(23);
                        break;
                    case 24:
                        rVar = new S4.r(24);
                        break;
                    case 25:
                        rVar = new S4.r(25);
                        break;
                    case 26:
                        rVar = new S4.r(28);
                        break;
                    case 27:
                        if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                            rVar = new S4.r(29);
                            break;
                        } else {
                            rVar = new C0344i(i);
                            break;
                        }
                    default:
                        rVar = new C0344i(i);
                        break;
                }
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile2 = null;
                if (z6) {
                    rVar.j(classLoader, gVar.a());
                } else {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        b bVar2 = (b) it4.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        g.b(bVar2, new c1.g((Object) gVar, (Object) bVar2, (Cloneable) hashSet4, (Object) atomicBoolean, 12));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it4.remove();
                        } else {
                            rVar.j(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    b bVar3 = (b) it5.next();
                    try {
                        zipFile = new ZipFile(bVar3.f4528a);
                    } catch (IOException e6) {
                        iOException = e6;
                    }
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry != null) {
                            c cVar = this.f4524a;
                            String str6 = bVar3.f4529b;
                            cVar.getClass();
                            File file = new File(cVar.i(), "dex");
                            c.g(file);
                            File fileF = c.f(file, str6);
                            c.g(fileF);
                            if (!rVar.f(classLoader, fileF, bVar3.f4528a, z6)) {
                                Log.w("SplitCompat", "split was not installed ".concat(bVar3.f4528a.toString()));
                            }
                        }
                        hashSet5.add(bVar3.f4528a);
                    } catch (IOException e7) {
                        iOException = e7;
                        zipFile2 = zipFile;
                        if (zipFile2 == null) {
                            throw iOException;
                        }
                        try {
                            zipFile2.close();
                            throw iOException;
                        } catch (IOException e8) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(iOException, e8);
                                throw iOException;
                            } catch (Exception unused) {
                                throw iOException;
                            }
                        }
                    }
                }
                this.f4527d.s(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    b bVar4 = (b) it6.next();
                    if (hashSet5.contains(bVar4.f4528a)) {
                        Log.d("SplitCompat", "Split '" + bVar4.f4529b + "' installation emulated");
                        hashSet6.add(bVar4.f4529b);
                    } else {
                        Log.d("SplitCompat", "Split '" + bVar4.f4529b + "' installation not emulated.");
                    }
                }
                synchronized (this.f4526c) {
                    this.f4526c.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e9) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e9);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
