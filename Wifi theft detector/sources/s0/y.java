package s0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24224a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final y f24225a;

        public a(y yVar) {
            this.f24225a = yVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            x xVarB = this.f24225a.b(i10);
            if (xVarB == null) {
                return null;
            }
            return xVarB.Q0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f24225a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((x) listC.get(i11)).Q0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            x xVarD = this.f24225a.d(i10);
            if (xVarD == null) {
                return null;
            }
            return xVarD.Q0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f24225a.f(i10, i11, bundle);
        }
    }

    public static class b extends a {
        public b(y yVar) {
            super(yVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f24225a.a(i10, x.R0(accessibilityNodeInfo), str, bundle);
        }
    }

    public y() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f24224a = new b(this);
        } else {
            this.f24224a = new a(this);
        }
    }

    public x b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public x d(int i10) {
        return null;
    }

    public Object e() {
        return this.f24224a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public y(Object obj) {
        this.f24224a = obj;
    }

    public void a(int i10, x xVar, String str, Bundle bundle) {
    }
}
