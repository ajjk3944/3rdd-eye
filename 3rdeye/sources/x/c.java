package x;

import C.C;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x.b;

/* compiled from: DynamicRangesCompatApi33Impl.java */
/* loaded from: classes.dex */
public final class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f47600a;

    public c(Object obj) {
        this.f47600a = (DynamicRangeProfiles) obj;
    }

    public static Set<C> d(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Long l5 : set) {
            long jLongValue = l5.longValue();
            C c10 = (C) C5753a.f47597a.get(l5);
            A2.l.p(c10, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(c10);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // x.b.a
    public final Set<C> a() {
        return d(this.f47600a.getSupportedProfiles());
    }

    @Override // x.b.a
    public final DynamicRangeProfiles b() {
        return this.f47600a;
    }

    @Override // x.b.a
    public final Set<C> c(C c10) {
        Long lA = C5753a.a(c10, this.f47600a);
        A2.l.k("DynamicRange is not supported: " + c10, lA != null);
        return d(this.f47600a.getProfileCaptureRequestConstraints(lA.longValue()));
    }
}
