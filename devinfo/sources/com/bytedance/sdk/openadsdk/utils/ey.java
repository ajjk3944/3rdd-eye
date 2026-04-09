package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ey {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: lh, reason: collision with root package name */
        final /* synthetic */ boolean f8695lh;
        View ouw = null;
        final /* synthetic */ ViewGroup vt;

        public ouw(ViewGroup viewGroup, boolean z3) {
            this.vt = viewGroup;
            this.f8695lh = z3;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            try {
                vt vtVar = (vt) this.vt.getTag(520093765);
                if (this.ouw == null) {
                    ViewGroup viewGroup = this.vt;
                    ey.ouw(viewGroup, vtVar, (Integer) viewGroup.getTag(520093766), this.f8695lh);
                    return;
                }
                Rect rect = new Rect();
                this.ouw.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.vt.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (vtVar != null) {
                        vtVar.ouw(this.vt, false);
                    }
                    this.vt.setTag(520093763, Boolean.FALSE);
                } else {
                    if (vtVar != null) {
                        vtVar.ouw(this.vt, true);
                    }
                    this.vt.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e2) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.vt.getTag(520093765), "ViewUtils", e2);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw();

        void ouw(View view, boolean z3);

        void ouw(boolean z3);

        void vt();
    }

    public static void ouw(final ViewGroup viewGroup, boolean z3, int i4, final boolean z10, vt vtVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, vtVar);
        viewGroup.setTag(520093766, Integer.valueOf(i4));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final ouw ouwVar = new ouw(viewGroup, z10);
        if (list != null && list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.get(i10).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public final void onChildViewAdded(View view, View view2) {
                        ouwVar.ouw = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public final void onChildViewRemoved(View view, View view2) {
                        ouwVar.ouw = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(ouwVar);
        if (z3) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    try {
                        vt vtVar2 = (vt) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        ey.ouw(viewGroup2, vtVar2, (Integer) viewGroup2.getTag(520093766), z10);
                    } catch (Exception e2) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e2);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z11) {
                try {
                    vt vtVar2 = (vt) viewGroup.getTag(520093765);
                    if (vtVar2 != null) {
                        vtVar2.ouw(z11);
                        ViewGroup viewGroup2 = viewGroup;
                        ey.ouw(viewGroup2, vtVar2, (Integer) viewGroup2.getTag(520093766), z10);
                    }
                } catch (Exception e2) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e2);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.4
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                vt vtVar2 = (vt) viewGroup.getTag(520093765);
                if (vtVar2 != null) {
                    vtVar2.ouw();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                vt vtVar2 = (vt) viewGroup.getTag(520093765);
                if (vtVar2 != null) {
                    vtVar2.vt();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    public static ArrayList<View> ouw(View view, int i4) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i4 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i4 > 1 && parent != null) {
                arrayList.addAll(ouw((View) parent, i4 - 1));
            }
        }
        return arrayList;
    }

    public static View ouw(View view, Class<? extends View> cls) {
        Object parent;
        while (view != null && (parent = view.getParent()) != null) {
            if (cls.isInstance(parent)) {
                return (View) parent;
            }
            view = (View) parent;
        }
        return null;
    }

    public static /* synthetic */ void ouw(View view, vt vtVar, Integer num, boolean z3) {
        if (vtVar != null) {
            if (num == null) {
                num = 0;
            }
            vtVar.ouw(view, com.bytedance.sdk.openadsdk.core.fak.ouw(view, 20, num.intValue(), z3));
        }
    }
}
