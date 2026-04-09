package T1;

import android.text.TextUtils;
import c2.RunnableC2058h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public final class s extends I9.g {

    /* renamed from: k, reason: collision with root package name */
    public static final String f12211k = androidx.work.m.g("WorkContinuationImpl");

    /* renamed from: b, reason: collision with root package name */
    public final z f12212b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12213c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.g f12214d;

    /* renamed from: e, reason: collision with root package name */
    public final List<? extends androidx.work.w> f12215e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12216f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12217g;

    /* renamed from: h, reason: collision with root package name */
    public final List<s> f12218h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C1598j f12219j;

    public s() {
        throw null;
    }

    public s(z zVar, String str, androidx.work.g gVar, List<? extends androidx.work.w> list, List<s> list2) {
        this.f12212b = zVar;
        this.f12213c = str;
        this.f12214d = gVar;
        this.f12215e = list;
        this.f12218h = list2;
        this.f12216f = new ArrayList(list.size());
        this.f12217g = new ArrayList();
        if (list2 != null) {
            Iterator<s> it = list2.iterator();
            while (it.hasNext()) {
                this.f12217g.addAll(it.next().f12217g);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (gVar == androidx.work.g.REPLACE && list.get(i).f17043b.f17157u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strA = list.get(i).a();
            this.f12216f.add(strA);
            this.f12217g.add(strA);
        }
    }

    public static boolean j0(s sVar, HashSet hashSet) {
        hashSet.addAll(sVar.f12216f);
        HashSet hashSetK0 = k0(sVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetK0.contains((String) it.next())) {
                return true;
            }
        }
        List<s> list = sVar.f12218h;
        if (list != null && !list.isEmpty()) {
            Iterator<s> it2 = list.iterator();
            while (it2.hasNext()) {
                if (j0(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(sVar.f12216f);
        return false;
    }

    public static HashSet k0(s sVar) {
        HashSet hashSet = new HashSet();
        List<s> list = sVar.f12218h;
        if (list != null && !list.isEmpty()) {
            Iterator<s> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f12216f);
            }
        }
        return hashSet;
    }

    public final androidx.work.q i0() {
        if (this.i) {
            androidx.work.m.e().h(f12211k, "Already enqueued work ids (" + TextUtils.join(", ", this.f12216f) + ")");
        } else {
            C1598j c1598j = new C1598j();
            this.f12212b.f12233d.d(new RunnableC2058h(this, c1598j));
            this.f12219j = c1598j;
        }
        return this.f12219j;
    }
}
