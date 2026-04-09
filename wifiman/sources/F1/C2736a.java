package F1;

import G1.t;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import r1.AbstractC7556b;

/* renamed from: F1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2736a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f5698c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f5699a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f5700b;

    /* renamed from: F1.a$a, reason: collision with other inner class name */
    static final class C0234a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final C2736a f5701a;

        C0234a(C2736a c2736a) {
            this.f5701a = c2736a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f5701a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            G1.u uVarB = this.f5701a.b(view);
            if (uVarB != null) {
                return (AccessibilityNodeProvider) uVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5701a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            G1.t tVarV0 = G1.t.V0(accessibilityNodeInfo);
            tVarV0.G0(W.T(view));
            tVarV0.r0(W.O(view));
            tVarV0.A0(W.o(view));
            tVarV0.L0(W.G(view));
            this.f5701a.g(view, tVarV0);
            tVarV0.e(accessibilityNodeInfo.getText(), view);
            List listC = C2736a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                tVarV0.b((t.a) listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f5701a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f5701a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f5701a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f5701a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f5701a.m(view, accessibilityEvent);
        }
    }

    public C2736a() {
        this(f5698c);
    }

    static List c(View view) {
        List list = (List) view.getTag(AbstractC7556b.f59965H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = G1.t.p(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrP != null && i10 < clickableSpanArrP.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrP[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC7556b.f59966I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5699a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public G1.u b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f5699a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new G1.u(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f5700b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f5699a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, G1.t tVar) {
        this.f5699a.onInitializeAccessibilityNodeInfo(view, tVar.U0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f5699a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5699a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            t.a aVar = (t.a) listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f5699a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != AbstractC7556b.f59977a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f5699a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f5699a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2736a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5699a = accessibilityDelegate;
        this.f5700b = new C0234a(this);
    }
}
