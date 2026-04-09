package G1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6821a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final u f6822a;

        a(u uVar) {
            this.f6822a = uVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            t tVarB = this.f6822a.b(i10);
            if (tVarB == null) {
                return null;
            }
            return tVarB.U0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List listC = this.f6822a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((t) listC.get(i11)).U0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            t tVarD = this.f6822a.d(i10);
            if (tVarD == null) {
                return null;
            }
            return tVarD.U0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f6822a.f(i10, i11, bundle);
        }
    }

    static class b extends a {
        b(u uVar) {
            super(uVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f6822a.a(i10, t.V0(accessibilityNodeInfo), str, bundle);
        }
    }

    public u() {
        this.f6821a = new b(this);
    }

    public void a(int i10, t tVar, String str, Bundle bundle) {
    }

    public t b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public t d(int i10) {
        return null;
    }

    public Object e() {
        return this.f6821a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public u(Object obj) {
        this.f6821a = obj;
    }
}
