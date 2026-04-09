package androidx.recyclerview.widget;

import R.C0175b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h0 extends C0175b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5485d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5486e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5487f;

    public h0(i0 i0Var) {
        this.f5485d = 0;
        this.f5487f = new WeakHashMap();
        this.f5486e = i0Var;
    }

    @Override // R.C0175b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        int i = this.f5485d;
        View.AccessibilityDelegate accessibilityDelegate = this.f3302a;
        Object obj = this.f5487f;
        switch (i) {
            case 0:
                C0175b c0175b = (C0175b) ((WeakHashMap) obj).get(view);
                if (c0175b == null) {
                    break;
                } else {
                    break;
                }
            default:
                DrawerLayout drawerLayout = (DrawerLayout) obj;
                if (accessibilityEvent.getEventType() != 32) {
                    break;
                } else {
                    accessibilityEvent.getText();
                    View viewE = drawerLayout.e();
                    if (viewE != null) {
                        int iG = drawerLayout.g(viewE);
                        drawerLayout.getClass();
                        WeakHashMap weakHashMap = R.O.f3270a;
                        Gravity.getAbsoluteGravity(iG, drawerLayout.getLayoutDirection());
                        break;
                    }
                }
                break;
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // R.C0175b
    public A0.e b(View view) {
        switch (this.f5485d) {
            case 0:
                C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(view);
                if (c0175b == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.b(view);
    }

    @Override // R.C0175b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f5485d) {
            case 0:
                C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(view);
                if (c0175b == null) {
                    super.c(view, accessibilityEvent);
                    break;
                } else {
                    c0175b.c(view, accessibilityEvent);
                    break;
                }
            default:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
        }
    }

    @Override // R.C0175b
    public final void d(View view, S.d dVar) {
        int i = this.f5485d;
        Object obj = this.f5486e;
        View.AccessibilityDelegate accessibilityDelegate = this.f3302a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3446a;
                i0 i0Var = (i0) obj;
                RecyclerView recyclerView = i0Var.f5493d;
                RecyclerView recyclerView2 = i0Var.f5493d;
                if (!recyclerView.M() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, dVar);
                    C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(view);
                    if (c0175b != null) {
                        c0175b.d(view, dVar);
                        break;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        break;
                    }
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f3446a;
                if (DrawerLayout.f5136T) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo2);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                    dVar.f3447b = -1;
                    accessibilityNodeInfo2.setSource(view);
                    WeakHashMap weakHashMap = R.O.f3270a;
                    Object parentForAccessibility = view.getParentForAccessibility();
                    if (parentForAccessibility instanceof View) {
                        accessibilityNodeInfo2.setParent((View) parentForAccessibility);
                    }
                    Rect rect = (Rect) obj;
                    accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                    accessibilityNodeInfo2.setBoundsInScreen(rect);
                    accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                    accessibilityNodeInfo2.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                    dVar.i(accessibilityNodeInfoObtain.getClassName());
                    accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
                    accessibilityNodeInfo2.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                    accessibilityNodeInfo2.setFocused(accessibilityNodeInfoObtain.isFocused());
                    accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
                    accessibilityNodeInfo2.setSelected(accessibilityNodeInfoObtain.isSelected());
                    dVar.a(accessibilityNodeInfoObtain.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (DrawerLayout.i(childAt)) {
                            accessibilityNodeInfo2.addChild(childAt);
                        }
                    }
                }
                dVar.i("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo2.setFocusable(false);
                accessibilityNodeInfo2.setFocused(false);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) S.c.f3431e.f3441a);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) S.c.f3432f.f3441a);
                break;
        }
    }

    @Override // R.C0175b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f5485d) {
            case 0:
                C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(view);
                if (c0175b == null) {
                    super.e(view, accessibilityEvent);
                    break;
                } else {
                    c0175b.e(view, accessibilityEvent);
                    break;
                }
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // R.C0175b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f5485d) {
            case 0:
                C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(viewGroup);
                if (c0175b == null) {
                    break;
                } else {
                    break;
                }
            default:
                if (DrawerLayout.f5136T || DrawerLayout.i(view)) {
                    break;
                }
                break;
        }
        return this.f3302a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // R.C0175b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f5485d) {
            case 0:
                i0 i0Var = (i0) this.f5486e;
                RecyclerView recyclerView = i0Var.f5493d;
                RecyclerView recyclerView2 = i0Var.f5493d;
                if (!recyclerView.M() && recyclerView2.getLayoutManager() != null) {
                    C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(view);
                    if (c0175b == null ? !super.g(view, i, bundle) : !c0175b.g(view, i, bundle)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return super.g(view, i, bundle);
    }

    @Override // R.C0175b
    public void h(View view, int i) {
        switch (this.f5485d) {
            case 0:
                C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(view);
                if (c0175b == null) {
                    super.h(view, i);
                    break;
                } else {
                    c0175b.h(view, i);
                    break;
                }
            default:
                super.h(view, i);
                break;
        }
    }

    @Override // R.C0175b
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f5485d) {
            case 0:
                C0175b c0175b = (C0175b) ((WeakHashMap) this.f5487f).get(view);
                if (c0175b == null) {
                    super.i(view, accessibilityEvent);
                    break;
                } else {
                    c0175b.i(view, accessibilityEvent);
                    break;
                }
            default:
                super.i(view, accessibilityEvent);
                break;
        }
    }

    public h0(DrawerLayout drawerLayout) {
        this.f5485d = 1;
        this.f5487f = drawerLayout;
        this.f5486e = new Rect();
    }
}
