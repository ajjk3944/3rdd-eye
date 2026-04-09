package H6;

import J6.b;
import L0.C0770a;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: AccessibilityListDelegate.kt */
/* renamed from: H6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668e extends androidx.recyclerview.widget.D {

    /* renamed from: f, reason: collision with root package name */
    public final J6.a f2133f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<d> f2134g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0667d f2135h;
    public c i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2136j;

    /* compiled from: AccessibilityListDelegate.kt */
    /* renamed from: H6.e$a */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            kotlin.jvm.internal.l.f(view, "view");
            C0668e c0668e = C0668e.this;
            c0668e.f2133f.getViewTreeObserver().addOnGlobalLayoutListener(c0668e.f2135h);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            kotlin.jvm.internal.l.f(view, "view");
            C0668e c0668e = C0668e.this;
            c0668e.f2133f.getViewTreeObserver().removeOnGlobalLayoutListener(c0668e.f2135h);
            c0668e.k();
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    /* renamed from: H6.e$b */
    public static final class b implements b.a {
        public b() {
        }

        @Override // J6.b.a
        public final boolean a() {
            C0668e c0668e = C0668e.this;
            if (!c0668e.f2136j) {
                return false;
            }
            J6.a aVar = c0668e.f2133f;
            kotlin.jvm.internal.l.f(aVar, "<this>");
            aVar.performAccessibilityAction(64, null);
            aVar.sendAccessibilityEvent(1);
            c0668e.k();
            return true;
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    /* renamed from: H6.e$c */
    public final class c extends D.a {
        public c() {
            super(C0668e.this);
        }

        @Override // androidx.recyclerview.widget.D.a, L0.C0770a
        public final void d(View host, M0.g gVar) {
            kotlin.jvm.internal.l.f(host, "host");
            super.d(host, gVar);
            gVar.j(kotlin.jvm.internal.x.a(Button.class).a());
            host.setImportantForAccessibility(C0668e.this.f2136j ? 1 : 4);
        }
    }

    /* compiled from: AccessibilityListDelegate.kt */
    /* renamed from: H6.e$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<View> f2140a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2141b;

        public d(WeakReference<View> weakReference, int i) {
            this.f2140a = weakReference;
            this.f2141b = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [H6.d, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
    public C0668e(J6.a recyclerView) {
        super(recyclerView);
        kotlin.jvm.internal.l.f(recyclerView, "recyclerView");
        this.f2133f = recyclerView;
        this.f2134g = new ArrayList<>();
        ?? r02 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: H6.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0668e this$0 = this.f2132b;
                kotlin.jvm.internal.l.f(this$0, "this$0");
                if (!this$0.f2136j || this$0.f2133f.getVisibility() == 0) {
                    return;
                }
                this$0.k();
            }
        };
        this.f2135h = r02;
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(r02);
        }
        recyclerView.addOnAttachStateChangeListener(new a());
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            recyclerView.getChildAt(i).setImportantForAccessibility(this.f2136j ? 1 : 4);
        }
        this.f2133f.setOnBackClickListener(new b());
    }

    @Override // androidx.recyclerview.widget.D, L0.C0770a
    public final void d(View host, M0.g gVar) {
        kotlin.jvm.internal.l.f(host, "host");
        super.d(host, gVar);
        gVar.j(this.f2136j ? kotlin.jvm.internal.x.a(RecyclerView.class).a() : kotlin.jvm.internal.x.a(Button.class).a());
        gVar.a(16);
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
        accessibilityNodeInfo.setClickable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            accessibilityNodeInfo.setImportantForAccessibility(true);
        }
        if (i >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(true);
        } else {
            gVar.h(1, true);
        }
        J6.a aVar = this.f2133f;
        int childCount = aVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            aVar.getChildAt(i10).setImportantForAccessibility(this.f2136j ? 1 : 4);
        }
    }

    @Override // androidx.recyclerview.widget.D, L0.C0770a
    public final boolean g(View host, int i, Bundle bundle) {
        boolean z10;
        View childAt;
        int iG;
        View child;
        kotlin.jvm.internal.l.f(host, "host");
        if (i == 16) {
            boolean z11 = this.f2136j;
            J6.a aVar = this.f2133f;
            if (!z11) {
                this.f2136j = true;
                int childCount = aVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    aVar.getChildAt(i10).setImportantForAccessibility(this.f2136j ? 1 : 4);
                }
            }
            l(aVar);
            p9.l[] lVarArr = {C0669f.f2142b, C0670g.f2143b};
            if (aVar.getChildCount() > 0) {
                childAt = aVar.getChildAt(0);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                int i11 = 1;
                while (i11 < aVar.getChildCount()) {
                    int i12 = i11 + 1;
                    View childAt2 = aVar.getChildAt(i11);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 2) {
                            iG = 0;
                            break;
                        }
                        p9.l lVar = lVarArr[i13];
                        iG = com.google.gson.internal.c.g((Comparable) lVar.invoke(childAt), (Comparable) lVar.invoke(childAt2));
                        if (iG != 0) {
                            break;
                        }
                        i13++;
                    }
                    if (iG > 0) {
                        childAt = childAt2;
                    }
                    i11 = i12;
                }
            } else {
                childAt = null;
            }
            if (childAt == null) {
                childAt = null;
            } else if ((childAt instanceof X6.g) && (child = ((X6.g) childAt).getChild()) != null) {
                childAt = child;
            }
            if (childAt != null) {
                childAt.performAccessibilityAction(64, null);
                childAt.sendAccessibilityEvent(1);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return super.g(host, i, bundle) || z10;
    }

    @Override // androidx.recyclerview.widget.D
    public final C0770a j() {
        c cVar = this.i;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.i = cVar2;
        return cVar2;
    }

    public final void k() {
        if (this.f2136j) {
            this.f2136j = false;
            J6.a aVar = this.f2133f;
            int childCount = aVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                aVar.getChildAt(i).setImportantForAccessibility(this.f2136j ? 1 : 4);
            }
        }
        ArrayList<d> arrayList = this.f2134g;
        Iterator<d> it = arrayList.iterator();
        while (it.hasNext()) {
            d next = it.next();
            View view = next.f2140a.get();
            if (view != null) {
                view.setImportantForAccessibility(next.f2141b);
            }
        }
        arrayList.clear();
    }

    public final void l(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || viewGroup.equals(viewGroup2.getRootView())) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < viewGroup2.getChildCount())) {
                l(viewGroup2);
                return;
            }
            int i10 = i + 1;
            View childAt = viewGroup2.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (!childAt.equals(viewGroup) && childAt.getImportantForAccessibility() != 4) {
                this.f2134g.add(new d(new WeakReference(childAt), childAt.getImportantForAccessibility()));
                childAt.setImportantForAccessibility(4);
            }
            i = i10;
        }
    }
}
