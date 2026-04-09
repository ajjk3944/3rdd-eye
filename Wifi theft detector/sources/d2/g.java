package d2;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.m;
import androidx.work.q;
import androidx.work.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends q {

    /* renamed from: j, reason: collision with root package name */
    public static final String f20678j = androidx.work.k.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final j f20679a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20680b;

    /* renamed from: c, reason: collision with root package name */
    public final ExistingWorkPolicy f20681c;

    /* renamed from: d, reason: collision with root package name */
    public final List f20682d;

    /* renamed from: e, reason: collision with root package name */
    public final List f20683e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20684f;

    /* renamed from: g, reason: collision with root package name */
    public final List f20685g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20686h;

    /* renamed from: i, reason: collision with root package name */
    public m f20687i;

    public g(j jVar, List list) {
        this(jVar, null, ExistingWorkPolicy.KEEP, list, null);
    }

    public static boolean i(g gVar, Set set) {
        set.addAll(gVar.c());
        Set setL = l(gVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set l(g gVar) {
        HashSet hashSet = new HashSet();
        List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((g) it.next()).c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (this.f20686h) {
            androidx.work.k.c().h(f20678j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f20683e)), new Throwable[0]);
        } else {
            m2.b bVar = new m2.b(this);
            this.f20679a.p().b(bVar);
            this.f20687i = bVar.d();
        }
        return this.f20687i;
    }

    public ExistingWorkPolicy b() {
        return this.f20681c;
    }

    public List c() {
        return this.f20683e;
    }

    public String d() {
        return this.f20680b;
    }

    public List e() {
        return this.f20685g;
    }

    public List f() {
        return this.f20682d;
    }

    public j g() {
        return this.f20679a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f20686h;
    }

    public void k() {
        this.f20686h = true;
    }

    public g(j jVar, String str, ExistingWorkPolicy existingWorkPolicy, List list, List list2) {
        this.f20679a = jVar;
        this.f20680b = str;
        this.f20681c = existingWorkPolicy;
        this.f20682d = list;
        this.f20685g = list2;
        this.f20683e = new ArrayList(list.size());
        this.f20684f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f20684f.addAll(((g) it.next()).f20684f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strA = ((s) list.get(i10)).a();
            this.f20683e.add(strA);
            this.f20684f.add(strA);
        }
    }
}
