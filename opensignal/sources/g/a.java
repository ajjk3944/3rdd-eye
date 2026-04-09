package g;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9121a;

    public /* synthetic */ a(Object obj) {
        this.f9121a = obj;
    }

    public static a a(boolean z10, int i10, int i11, int i12, int i13) {
        return new a(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
    }
}
