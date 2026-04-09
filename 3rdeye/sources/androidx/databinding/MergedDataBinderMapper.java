package androidx.databinding;

import W0.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f15535a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f15536b = new CopyOnWriteArrayList();

    public MergedDataBinderMapper() {
        new CopyOnWriteArrayList();
    }

    public final void b(a aVar) {
        if (this.f15535a.add(aVar.getClass())) {
            this.f15536b.add(aVar);
            Iterator<a> it = aVar.a().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
    }
}
