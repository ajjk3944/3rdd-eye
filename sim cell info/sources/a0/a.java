package a0;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b0.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f176c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f177a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f178b;

    /* renamed from: a0.a$a, reason: collision with other inner class name */
    static final class C0000a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f179a;

        C0000a(a aVar) {
            this.f179a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f179a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            b0.d dVarB = this.f179a.b(view);
            if (dVarB != null) {
                return (AccessibilityNodeProvider) dVarB.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f179a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            b0.c cVarR = b0.c.R(accessibilityNodeInfo);
            cVarR.O(s.E(view));
            cVarR.M(s.B(view));
            cVarR.N(s.l(view));
            this.f179a.g(view, cVarR);
            cVarR.d(accessibilityNodeInfo.getText(), view);
            List<c.a> listC = a.c(view);
            for (int i2 = 0; i2 < listC.size(); i2++) {
                cVarR.b(listC.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f179a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f179a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f179a.j(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f179a.l(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f179a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f176c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f177a = accessibilityDelegate;
        this.f178b = new C0000a(this);
    }

    static List<c.a> c(View view) {
        List<c.a> list = (List) view.getTag(p.b.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM = b0.c.m(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; clickableSpanArrM != null && i2 < clickableSpanArrM.length; i2++) {
                if (clickableSpan.equals(clickableSpanArrM[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(p.b.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
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
        return this.f177a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public b0.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f177a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new b0.d(accessibilityNodeProvider);
    }

    View.AccessibilityDelegate d() {
        return this.f178b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f177a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, b0.c cVar) {
        this.f177a.onInitializeAccessibilityNodeInfo(view, cVar.Q());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f177a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f177a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i2, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<c.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i3 = 0;
        while (true) {
            if (i3 >= listC.size()) {
                break;
            }
            c.a aVar = listC.get(i3);
            if (aVar.a() == i2) {
                zPerformAccessibilityAction = aVar.c(view, bundle);
                break;
            }
            i3++;
        }
        if (!zPerformAccessibilityAction && Build.VERSION.SDK_INT >= 16) {
            zPerformAccessibilityAction = this.f177a.performAccessibilityAction(view, i2, bundle);
        }
        return (zPerformAccessibilityAction || i2 != p.b.f3058a) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i2) {
        this.f177a.sendAccessibilityEvent(view, i2);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f177a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
