package a3;

import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class a implements t2.b {

    /* renamed from: a, reason: collision with root package name */
    public String f102a = "video_reward_full";

    /* renamed from: b, reason: collision with root package name */
    public String f103b = "video_brand";

    /* renamed from: c, reason: collision with root package name */
    public String f104c = "video_splash";

    /* renamed from: d, reason: collision with root package name */
    public String f105d = "video_default";

    /* renamed from: e, reason: collision with root package name */
    public String f106e = null;

    /* renamed from: f, reason: collision with root package name */
    public String f107f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f108g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f109h = null;

    /* renamed from: i, reason: collision with root package name */
    public String f110i = null;

    /* renamed from: a3.a$a, reason: collision with other inner class name */
    public static class C0000a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file2.lastModified() - file.lastModified();
            if (jLastModified == 0) {
                return 0;
            }
            return jLastModified < 0 ? -1 : 1;
        }
    }

    public static void c(File[] fileArr, int i10, Set set) {
        if (i10 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i10) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new C0000a());
                    while (i10 < listAsList.size()) {
                        File file = (File) listAsList.get(i10);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i10)).delete();
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // t2.b
    public long a(xq xqVar) {
        if (TextUtils.isEmpty(xqVar.bw()) || TextUtils.isEmpty(xqVar.aa())) {
            return 0L;
        }
        return y2.b.a(xqVar.bw(), xqVar.aa());
    }

    public String b() {
        if (this.f108g == null) {
            this.f108g = this.f106e + File.separator + this.f103b;
            File file = new File(this.f108g);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f108g;
    }

    public final Set d() {
        HashSet hashSet = new HashSet();
        for (z2.a aVar : z2.a.f25317e.values()) {
            if (aVar != null && aVar.d() != null) {
                xq xqVarD = aVar.d();
                hashSet.add(y2.b.d(xqVarD.bw(), xqVarD.aa()).getAbsolutePath());
                hashSet.add(y2.b.c(xqVarD.bw(), xqVarD.aa()).getAbsolutePath());
            }
        }
        for (b3.c cVar : b3.b.f4581a.values()) {
            if (cVar != null && cVar.e() != null) {
                xq xqVarE = cVar.e();
                hashSet.add(y2.b.d(xqVarE.bw(), xqVarE.aa()).getAbsolutePath());
                hashSet.add(y2.b.c(xqVarE.bw(), xqVarE.aa()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    @Override // t2.b
    public synchronized void dg() {
        try {
            Set setD = null;
            for (t2.a aVar : e()) {
                File[] fileArrA = aVar.a();
                if (fileArrA != null && fileArrA.length >= aVar.b()) {
                    if (setD == null) {
                        setD = d();
                    }
                    int iB = aVar.b() - 2;
                    if (iB < 0) {
                        iB = 0;
                    }
                    c(aVar.a(), iB, setD);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t2.a(new File(emc()).listFiles(), x2.a.h()));
        arrayList.add(new t2.a(new File(ypw()).listFiles(), x2.a.j()));
        arrayList.add(new t2.a(new File(b()).listFiles(), x2.a.b()));
        arrayList.add(new t2.a(new File(xq()).listFiles(), x2.a.a()));
        return arrayList;
    }

    @Override // t2.b
    public void emc(String str) {
        this.f106e = str;
    }

    @Override // t2.b
    public String xq() {
        if (this.f110i == null) {
            this.f110i = this.f106e + File.separator + this.f105d;
            File file = new File(this.f110i);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f110i;
    }

    @Override // t2.b
    public String ypw() {
        if (this.f109h == null) {
            this.f109h = this.f106e + File.separator + this.f104c;
            File file = new File(this.f109h);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f109h;
    }

    @Override // t2.b
    public String emc() {
        if (this.f107f == null) {
            this.f107f = this.f106e + File.separator + this.f102a;
            File file = new File(this.f107f);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f107f;
    }

    @Override // t2.b
    public boolean emc(xq xqVar) {
        if (TextUtils.isEmpty(xqVar.bw()) || TextUtils.isEmpty(xqVar.aa())) {
            return false;
        }
        return new File(xqVar.bw(), xqVar.aa()).exists();
    }
}
