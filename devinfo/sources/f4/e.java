package f4;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements ga.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23649a;

    public /* synthetic */ e(Object obj) {
        this.f23649a = obj;
    }

    public static e a(int i4, int i10, int i11, int i12, boolean z3) {
        return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i10, i11, i12, false, z3));
    }

    @Override // xj.a
    public Object get() {
        return this.f23649a;
    }
}
