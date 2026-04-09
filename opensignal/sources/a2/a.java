package a2;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class a implements o9.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f28a;

    public /* synthetic */ a(Object obj) {
        this.f28a = obj;
    }

    public static a a(int i10, int i11, int i12) {
        return new a(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
    }

    @Override // kq.a
    public Object get() {
        return this.f28a;
    }
}
