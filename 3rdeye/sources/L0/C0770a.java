package L0;

import L0.I;
import M0.g;
import M0.i;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: L0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0770a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3882c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3883a;

    /* renamed from: b, reason: collision with root package name */
    public final C0068a f3884b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: L0.a$a, reason: collision with other inner class name */
    public static final class C0068a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final C0770a f3885a;

        public C0068a(C0770a c0770a) {
            this.f3885a = c0770a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3885a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            M0.h hVarB = this.f3885a.b(view);
            if (hVarB != null) {
                return hVarB.f4137a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3885a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object tag2;
            Object tag3;
            int iKeyAt;
            M0.g gVar = new M0.g(accessibilityNodeInfo);
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (Build.VERSION.SDK_INT >= 28) {
                tag = Boolean.valueOf(I.g.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            int i = 0;
            boolean z10 = bool != null && bool.booleanValue();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z10);
            } else {
                gVar.h(1, z10);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                tag2 = Boolean.valueOf(I.g.c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            boolean z11 = bool2 != null && bool2.booleanValue();
            if (i10 >= 28) {
                accessibilityNodeInfo.setHeading(z11);
            } else {
                gVar.h(2, z11);
            }
            CharSequence charSequenceF = I.f(view);
            if (i10 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceF);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceF);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                tag3 = I.i.b(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i10 >= 30) {
                g.b.c(accessibilityNodeInfo, charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f3885a.d(view, gVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i10 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        if (((WeakReference) sparseArray.valueAt(i11)).get() == null) {
                            arrayList.add(Integer.valueOf(i11));
                        }
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sparseArray.remove(((Integer) arrayList.get(i12)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i13 = 0;
                    while (i13 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i13];
                        int i14 = i;
                        while (true) {
                            if (i14 >= sparseArray2.size()) {
                                iKeyAt = M0.g.f4121c;
                                M0.g.f4121c = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i14)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i14);
                                    break;
                                }
                                i14++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i13]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i13];
                        Spanned spanned = (Spanned) text;
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                        i13++;
                        i = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (int i15 = 0; i15 < list.size(); i15++) {
                gVar.b((g.a) list.get(i15));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3885a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3885a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3885a.g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.f3885a.h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3885a.i(view, accessibilityEvent);
        }
    }

    public C0770a() {
        this(f3882c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3883a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public M0.h b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3883a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new M0.h(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3883a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, M0.g gVar) {
        this.f3883a.onInitializeAccessibilityNodeInfo(view, gVar.f4122a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3883a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3883a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            g.a aVar = (g.a) list.get(i10);
            if (aVar.a() == i) {
                M0.i iVar = aVar.f4135d;
                if (iVar != null) {
                    Class<? extends i.a> cls = aVar.f4134c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e4) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e4);
                        }
                    }
                    zPerformAccessibilityAction = iVar.a(view);
                }
            } else {
                i10++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f3883a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i12 = 0;
            while (true) {
                if (clickableSpanArr == null || i12 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                }
                i12++;
            }
        }
        return z10;
    }

    public void h(View view, int i) {
        this.f3883a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3883a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0770a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3883a = accessibilityDelegate;
        this.f3884b = new C0068a(this);
    }
}
