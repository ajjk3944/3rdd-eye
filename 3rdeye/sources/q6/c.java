package Q6;

import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: ErrorCollector.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11317a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11318b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public List<? extends Throwable> f11319c = C2099t.f18581b;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11320d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11321e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f11322f = true;

    public final void a(Throwable e4) {
        kotlin.jvm.internal.l.f(e4, "e");
        this.f11318b.add(e4);
        b();
    }

    public final void b() {
        this.f11322f = false;
        LinkedHashSet linkedHashSet = this.f11317a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        c();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((p9.p) it.next()).invoke(this.f11321e, this.f11320d);
        }
    }

    public final void c() {
        if (this.f11322f) {
            return;
        }
        ArrayList arrayList = this.f11321e;
        arrayList.clear();
        arrayList.addAll(this.f11319c);
        arrayList.addAll(this.f11318b);
        this.f11322f = true;
    }
}
