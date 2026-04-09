package R;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.apm.insight.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: R.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0175b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3301c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3302a;

    /* renamed from: b, reason: collision with root package name */
    public final C0174a f3303b;

    public C0175b() {
        this(f3301c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3302a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A0.e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3302a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A0.e(12, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3302a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, S.d dVar) {
        this.f3302a.onInitializeAccessibilityNodeInfo(view, dVar.f3446a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3302a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3302a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                break;
            }
            S.c cVar = (S.c) list.get(i3);
            if (cVar.a() == i) {
                Class cls = cVar.f3443c;
                S.n nVar = cVar.f3444d;
                if (nVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e6) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e6);
                        }
                    }
                    zPerformAccessibilityAction = nVar.e(view);
                }
            } else {
                i3++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f3302a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i7 = 0;
            while (true) {
                if (clickableSpanArr == null || i7 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z6 = true;
                    break;
                }
                i7++;
            }
        }
        return z6;
    }

    public void h(View view, int i) {
        this.f3302a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3302a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0175b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3302a = accessibilityDelegate;
        this.f3303b = new C0174a(this);
    }
}
