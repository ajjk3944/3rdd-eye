package M0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f4137a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final h f4138a;

        public a(h hVar) {
            this.f4138a = hVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            g gVarA = this.f4138a.a(i);
            if (gVarA == null) {
                return null;
            }
            return gVarA.f4122a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f4138a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            g gVarB = this.f4138a.b(i);
            if (gVarB == null) {
                return null;
            }
            return gVarB.f4122a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i10, Bundle bundle) {
            return this.f4138a.c(i, i10, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f4138a.getClass();
        }
    }

    public h() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4137a = new b(this);
        } else {
            this.f4137a = new a(this);
        }
    }

    public g a(int i) {
        return null;
    }

    public g b(int i) {
        return null;
    }

    public boolean c(int i, int i10, Bundle bundle) {
        return false;
    }

    public h(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f4137a = accessibilityNodeProvider;
    }
}
