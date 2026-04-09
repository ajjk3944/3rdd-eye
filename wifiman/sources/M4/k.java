package M4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final List f12537a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f12538b;

    public k(int i10) {
        this.f12538b = i10;
    }

    public List a() {
        List listB = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listB.size(); i10++) {
            arrayList.add(((j) listB.get(i10)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f12537a));
    }

    public synchronized boolean c(List list) {
        this.f12537a.clear();
        if (list.size() <= this.f12538b) {
            return this.f12537a.addAll(list);
        }
        I4.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f12538b);
        return this.f12537a.addAll(list.subList(0, this.f12538b));
    }
}
