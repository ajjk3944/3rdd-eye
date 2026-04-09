package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ra {

    public class emc implements ViewTreeObserver.OnGlobalLayoutListener {
        View emc = null;
        final /* synthetic */ boolean xq;
        final /* synthetic */ ViewGroup ypw;

        public emc(ViewGroup viewGroup, boolean z10) {
            this.ypw = viewGroup;
            this.xq = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                ypw ypwVar = (ypw) this.ypw.getTag(520093765);
                if (this.emc == null) {
                    ViewGroup viewGroup = this.ypw;
                    ra.ypw(viewGroup, ypwVar, (Integer) viewGroup.getTag(520093766), this.xq);
                    return;
                }
                Rect rect = new Rect();
                this.emc.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.ypw.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (ypwVar != null) {
                        ypwVar.emc(this.ypw, false);
                    }
                    this.ypw.setTag(520093763, Boolean.FALSE);
                } else {
                    if (ypwVar != null) {
                        ypwVar.emc(this.ypw, true);
                    }
                    this.ypw.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.ypw.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    public interface ypw {
        void emc();

        void emc(View view, boolean z10);

        void emc(boolean z10);

        void ypw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(View view, ypw ypwVar, Integer num, boolean z10) {
        if (ypwVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        ypwVar.emc(view, emc(view, num.intValue(), z10));
    }

    public static void emc(final ViewGroup viewGroup, boolean z10, int i10, final boolean z11, ypw ypwVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, ypwVar);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final emc emcVar = new emc(viewGroup, z11);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ra.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        emcVar.emc = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        emcVar.emc = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(emcVar);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.ra.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        ypw ypwVar2 = (ypw) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        ra.ypw(viewGroup2, ypwVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ra.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z12) {
                try {
                    ypw ypwVar2 = (ypw) viewGroup.getTag(520093765);
                    if (ypwVar2 != null) {
                        ypwVar2.emc(z12);
                        ViewGroup viewGroup2 = viewGroup;
                        ra.ypw(viewGroup2, ypwVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ra.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ypw ypwVar2 = (ypw) viewGroup.getTag(520093765);
                if (ypwVar2 != null) {
                    ypwVar2.emc();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ypw ypwVar2 = (ypw) viewGroup.getTag(520093765);
                if (ypwVar2 != null) {
                    ypwVar2.ypw();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean emc(View view, int i10, boolean z10) {
        return com.bytedance.sdk.openadsdk.core.mkp.emc(view, 20, i10, z10);
    }

    public static ArrayList<View> emc(View view, int i10) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i10 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i10 > 1 && parent != null) {
                arrayList.addAll(emc((View) parent, i10 - 1));
            }
        }
        return arrayList;
    }

    public static View emc(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return emc((View) parent, cls);
    }
}
