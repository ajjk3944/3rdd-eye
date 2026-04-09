package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f15091c;

    /* renamed from: a, reason: collision with root package name */
    private final b f15092a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f15093b = new ArrayList<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public File f15094a;

        /* renamed from: b, reason: collision with root package name */
        public c f15095b;

        public a(c cVar, File file) {
            this.f15095b = cVar;
            this.f15094a = file;
        }
    }

    private e(b bVar) {
        this.f15092a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().f15093b == null || b().f15093b.isEmpty()) {
                return null;
            }
            ArrayList<a> arrayList = b().f15093b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                a aVar = arrayList.get(i10);
                i10++;
                a aVar2 = aVar;
                if (aVar2.f15095b.equals(cVar)) {
                    return aVar2.f15094a;
                }
            }
            return null;
        } catch (Throwable th) {
            q0.b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (f15091c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                t0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15091c;
    }

    public static synchronized void a(b bVar) {
        if (f15091c == null) {
            f15091c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f15092a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f15093b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
