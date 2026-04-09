package androidx.appcompat.widget;

import D0.a;
import L0.AbstractC0771b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;
import n.AbstractC5342d;
import n.InterfaceC5344f;
import o.AbstractViewOnTouchListenerC5378F;
import o.a0;

/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
public final class a extends androidx.appcompat.view.menu.a {

    /* renamed from: j, reason: collision with root package name */
    public d f14760j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f14761k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14762l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14763m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14764n;

    /* renamed from: o, reason: collision with root package name */
    public int f14765o;

    /* renamed from: p, reason: collision with root package name */
    public int f14766p;

    /* renamed from: q, reason: collision with root package name */
    public int f14767q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14768r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f14769s;

    /* renamed from: t, reason: collision with root package name */
    public e f14770t;

    /* renamed from: u, reason: collision with root package name */
    public C0228a f14771u;

    /* renamed from: v, reason: collision with root package name */
    public c f14772v;

    /* renamed from: w, reason: collision with root package name */
    public b f14773w;

    /* renamed from: x, reason: collision with root package name */
    public final f f14774x;

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0228a extends i {
        public C0228a(Context context, m mVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, mVar, false);
            if ((mVar.f14517A.f14482x & 32) != 32) {
                View view2 = a.this.f14760j;
                this.f14490e = view2 == null ? (View) a.this.i : view2;
            }
            f fVar = a.this.f14774x;
            this.f14493h = fVar;
            AbstractC5342d abstractC5342d = this.i;
            if (abstractC5342d != null) {
                abstractC5342d.d(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            aVar.f14771u = null;
            aVar.getClass();
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final e f14777b;

        public c(e eVar) {
            this.f14777b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            a aVar2 = a.this;
            androidx.appcompat.view.menu.f fVar = aVar2.f14377d;
            if (fVar != null && (aVar = fVar.f14435e) != null) {
                aVar.b(fVar);
            }
            View view = (View) aVar2.i;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f14777b;
                if (eVar.b()) {
                    aVar2.f14770t = eVar;
                } else if (eVar.f14490e != null) {
                    eVar.e(0, 0, false, false);
                    aVar2.f14770t = eVar;
                }
            }
            aVar2.f14772v = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0229a extends AbstractViewOnTouchListenerC5378F {
            public C0229a(d dVar) {
                super(dVar);
            }

            @Override // o.AbstractViewOnTouchListenerC5378F
            public final InterfaceC5344f b() {
                e eVar = a.this.f14770t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // o.AbstractViewOnTouchListenerC5378F
            public final boolean c() {
                a.this.l();
                return true;
            }

            @Override // o.AbstractViewOnTouchListenerC5378F
            public final boolean d() {
                a aVar = a.this;
                if (aVar.f14772v != null) {
                    return false;
                }
                aVar.h();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            a0.a(this, getContentDescription());
            setOnTouchListener(new C0229a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean f() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i10, int i11, int i12) {
            boolean frame = super.setFrame(i, i10, i11, i12);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.C0009a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(R.attr.actionOverflowMenuStyle, context, view, fVar, true);
            this.f14491f = 8388613;
            f fVar2 = a.this.f14774x;
            this.f14493h = fVar2;
            AbstractC5342d abstractC5342d = this.i;
            if (abstractC5342d != null) {
                abstractC5342d.d(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a aVar = a.this;
            androidx.appcompat.view.menu.f fVar = aVar.f14377d;
            if (fVar != null) {
                fVar.c(true);
            }
            aVar.f14770t = null;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof m) {
                ((m) fVar).f14518z.k().c(false);
            }
            j.a aVar = a.this.f14379f;
            if (aVar != null) {
                aVar.b(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            a aVar = a.this;
            if (fVar == aVar.f14377d) {
                return false;
            }
            ((m) fVar).f14517A.getClass();
            aVar.getClass();
            j.a aVar2 = aVar.f14379f;
            if (aVar2 != null) {
                return aVar2.c(fVar);
            }
            return false;
        }
    }

    public a(Context context) {
        this.f14375b = context;
        this.f14378e = LayoutInflater.from(context);
        this.f14380g = R.layout.abc_action_menu_layout;
        this.f14381h = R.layout.abc_action_menu_item_layout;
        this.f14769s = new SparseBooleanArray();
        this.f14774x = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.k$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.a ? (k.a) view : (k.a) this.f14378e.inflate(this.f14381h, viewGroup, false);
            actionMenuItemView.i(hVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.i);
            if (this.f14773w == null) {
                this.f14773w = new b();
            }
            actionMenuItemView2.setPopupCallback(this.f14773w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(hVar.f14459C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(androidx.appcompat.view.menu.f fVar, boolean z10) {
        h();
        C0228a c0228a = this.f14771u;
        if (c0228a != null && c0228a.b()) {
            c0228a.i.dismiss();
        }
        j.a aVar = this.f14379f;
        if (aVar != null) {
            aVar.b(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        int size;
        ArrayList<h> arrayListL;
        int i;
        boolean z10;
        a aVar = this;
        androidx.appcompat.view.menu.f fVar = aVar.f14377d;
        if (fVar != null) {
            arrayListL = fVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i10 = aVar.f14767q;
        int i11 = aVar.f14766p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.i;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i = 2;
            z10 = true;
            if (i12 >= size) {
                break;
            }
            h hVar = arrayListL.get(i12);
            int i15 = hVar.f14483y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z11 = true;
            }
            if (aVar.f14768r && hVar.f14459C) {
                i10 = 0;
            }
            i12++;
        }
        if (aVar.f14763m && (z11 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = aVar.f14769s;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            h hVar2 = arrayListL.get(i17);
            int i19 = hVar2.f14483y;
            boolean z12 = (i19 & 2) == i ? z10 : false;
            int i20 = hVar2.f14461b;
            if (z12) {
                View viewA = aVar.a(hVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z10);
                }
                hVar2.f(z10);
            } else if ((i19 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i20);
                boolean z14 = ((i16 > 0 || z13) && i11 > 0) ? z10 : false;
                if (z14) {
                    View viewA2 = aVar.a(hVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z14 &= i11 + i18 > 0;
                }
                if (z14 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z13) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        h hVar3 = arrayListL.get(i21);
                        if (hVar3.f14461b == i20) {
                            if ((hVar3.f14482x & 32) == 32) {
                                i16++;
                            }
                            hVar3.f(false);
                        }
                    }
                }
                if (z14) {
                    i16--;
                }
                hVar2.f(z14);
            } else {
                hVar2.f(false);
                i17++;
                i = 2;
                aVar = this;
                z10 = true;
            }
            i17++;
            i = 2;
            aVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f14376c = context;
        LayoutInflater.from(context);
        this.f14377d = fVar;
        Resources resources = context.getResources();
        if (!this.f14764n) {
            this.f14763m = true;
        }
        int i = 2;
        this.f14765o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i = 4;
        } else if (i10 >= 360) {
            i = 3;
        }
        this.f14767q = i;
        int measuredWidth = this.f14765o;
        if (this.f14763m) {
            if (this.f14760j == null) {
                d dVar = new d(this.f14375b);
                this.f14760j = dVar;
                if (this.f14762l) {
                    dVar.setImageDrawable(this.f14761k);
                    this.f14761k = null;
                    this.f14762l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14760j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f14760j.getMeasuredWidth();
        } else {
            this.f14760j = null;
        }
        this.f14766p = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.i;
        ArrayList<h> arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f14377d;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> arrayListL = this.f14377d.l();
                int size = arrayListL.size();
                i = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = arrayListL.get(i10);
                    if ((hVar.f14482x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View viewA = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.i).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f14760j) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f14377d;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AbstractC0771b abstractC0771b = arrayList2.get(i11).f14457A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f14377d;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f14439j;
        }
        if (this.f14763m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !arrayList.get(0).f14459C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f14760j == null) {
                this.f14760j = new d(this.f14375b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f14760j.getParent();
            if (viewGroup3 != this.i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f14760j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                d dVar = this.f14760j;
                actionMenuView.getClass();
                ActionMenuView.c cVarL = ActionMenuView.l();
                cVarL.f14586a = true;
                actionMenuView.addView(dVar, cVarL);
            }
        } else {
            d dVar2 = this.f14760j;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f14760j);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.f14763m);
    }

    public final boolean h() {
        Object obj;
        c cVar = this.f14772v;
        if (cVar != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f14772v = null;
            return true;
        }
        e eVar = this.f14770t;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean i(m mVar) {
        boolean z10 = false;
        if (mVar.hasVisibleItems()) {
            m mVar2 = mVar;
            while (true) {
                androidx.appcompat.view.menu.f fVar = mVar2.f14518z;
                if (fVar == this.f14377d) {
                    break;
                }
                mVar2 = (m) fVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.i;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == mVar2.f14517A) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                mVar.f14517A.getClass();
                int size = mVar.f14436f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    MenuItem item = mVar.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                C0228a c0228a = new C0228a(this.f14376c, mVar, view);
                this.f14771u = c0228a;
                c0228a.f14492g = z10;
                AbstractC5342d abstractC5342d = c0228a.i;
                if (abstractC5342d != null) {
                    abstractC5342d.n(z10);
                }
                this.f14771u.d();
                j.a aVar = this.f14379f;
                if (aVar != null) {
                    aVar.c(mVar);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        e eVar = this.f14770t;
        return eVar != null && eVar.b();
    }

    public final boolean l() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f14763m || k() || (fVar = this.f14377d) == null || this.i == null || this.f14772v != null) {
            return false;
        }
        fVar.i();
        if (fVar.f14439j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f14376c, this.f14377d, this.f14760j));
        this.f14772v = cVar;
        ((View) this.i).post(cVar);
        return true;
    }
}
