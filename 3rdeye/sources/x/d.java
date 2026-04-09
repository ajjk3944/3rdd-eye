package x;

import C.C;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import x.b;

/* compiled from: DynamicRangesCompatBaseImpl.java */
/* loaded from: classes.dex */
public final class d implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f47601a = new b(new d());

    /* renamed from: b, reason: collision with root package name */
    public static final Set<C> f47602b = Collections.singleton(C.f616d);

    @Override // x.b.a
    public final Set<C> a() {
        return f47602b;
    }

    @Override // x.b.a
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // x.b.a
    public final Set<C> c(C c10) {
        A2.l.k("DynamicRange is not supported: " + c10, C.f616d.equals(c10));
        return f47602b;
    }
}
