package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import n.AbstractC5342d;
import o.C5376D;
import o.C5382J;
import o.InterfaceC5381I;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class b extends AbstractC5342d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f14382A;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14383c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14384d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14385e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14386f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f14387g;

    /* renamed from: o, reason: collision with root package name */
    public View f14394o;

    /* renamed from: p, reason: collision with root package name */
    public View f14395p;

    /* renamed from: q, reason: collision with root package name */
    public int f14396q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14397r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14398s;

    /* renamed from: t, reason: collision with root package name */
    public int f14399t;

    /* renamed from: u, reason: collision with root package name */
    public int f14400u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14402w;

    /* renamed from: x, reason: collision with root package name */
    public j.a f14403x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f14404y;

    /* renamed from: z, reason: collision with root package name */
    public i.a f14405z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f14388h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final a f14389j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0227b f14390k = new ViewOnAttachStateChangeListenerC0227b();

    /* renamed from: l, reason: collision with root package name */
    public final c f14391l = new c();

    /* renamed from: m, reason: collision with root package name */
    public int f14392m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f14393n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14401v = false;

    /* compiled from: CascadingMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.a()) {
                ArrayList arrayList = bVar.i;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f14409a.f44555z) {
                    return;
                }
                View view = bVar.f14395p;
                if (view == null || !view.isShown()) {
                    bVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f14409a.show();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    public class c implements InterfaceC5381I {
        public c() {
        }

        @Override // o.InterfaceC5381I
        public final void d(f fVar, h hVar) {
            b bVar = b.this;
            bVar.f14387g.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i)).f14410b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i10 = i + 1;
            bVar.f14387g.postAtTime(new androidx.appcompat.view.menu.c(this, i10 < arrayList.size() ? (d) arrayList.get(i10) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // o.InterfaceC5381I
        public final void n(f fVar, h hVar) {
            b.this.f14387g.removeCallbacksAndMessages(fVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final C5382J f14409a;

        /* renamed from: b, reason: collision with root package name */
        public final f f14410b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14411c;

        public d(C5382J c5382j, f fVar, int i) {
            this.f14409a = c5382j;
            this.f14410b = fVar;
            this.f14411c = i;
        }
    }

    public b(Context context, View view, int i, boolean z10) {
        this.f14383c = context;
        this.f14394o = view;
        this.f14385e = i;
        this.f14386f = z10;
        this.f14396q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f14384d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f14387g = new Handler();
    }

    @Override // n.InterfaceC5344f
    public final boolean a() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f14409a.f44531A.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(f fVar, boolean z10) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i)).f14410b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i10 = i + 1;
        if (i10 < arrayList.size()) {
            ((d) arrayList.get(i10)).f14410b.c(false);
        }
        d dVar = (d) arrayList.remove(i);
        dVar.f14410b.r(this);
        boolean z11 = this.f14382A;
        C5382J c5382j = dVar.f14409a;
        if (z11) {
            C5382J.a.b(c5382j.f44531A, null);
            c5382j.f44531A.setAnimationStyle(0);
        }
        c5382j.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f14396q = ((d) arrayList.get(size2 - 1)).f14411c;
        } else {
            this.f14396q = this.f14394o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f14410b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f14403x;
        if (aVar != null) {
            aVar.b(fVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f14404y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f14404y.removeGlobalOnLayoutListener(this.f14389j);
            }
            this.f14404y = null;
        }
        this.f14395p.removeOnAttachStateChangeListener(this.f14390k);
        this.f14405z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.f14403x = aVar;
    }

    @Override // n.InterfaceC5344f
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f14409a.f44531A.isShowing()) {
                    dVar.f14409a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f14409a.f44534d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // n.InterfaceC5344f
    public final C5376D h() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f14409a.f44534d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean i(m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f14410b) {
                dVar.f14409a.f44534d.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        k(mVar);
        j.a aVar = this.f14403x;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // n.AbstractC5342d
    public final void k(f fVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fVar.b(this, this.f14383c);
        if (a()) {
            u(fVar);
        } else {
            this.f14388h.add(fVar);
        }
    }

    @Override // n.AbstractC5342d
    public final void m(View view) {
        if (this.f14394o != view) {
            this.f14394o = view;
            this.f14393n = Gravity.getAbsoluteGravity(this.f14392m, view.getLayoutDirection());
        }
    }

    @Override // n.AbstractC5342d
    public final void n(boolean z10) {
        this.f14401v = z10;
    }

    @Override // n.AbstractC5342d
    public final void o(int i) {
        if (this.f14392m != i) {
            this.f14392m = i;
            this.f14393n = Gravity.getAbsoluteGravity(i, this.f14394o.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i);
            if (!dVar.f14409a.f44531A.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f14410b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // n.AbstractC5342d
    public final void p(int i) {
        this.f14397r = true;
        this.f14399t = i;
    }

    @Override // n.AbstractC5342d
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f14405z = (i.a) onDismissListener;
    }

    @Override // n.AbstractC5342d
    public final void r(boolean z10) {
        this.f14402w = z10;
    }

    @Override // n.AbstractC5342d
    public final void s(int i) {
        this.f14398s = true;
        this.f14400u = i;
    }

    @Override // n.InterfaceC5344f
    public final void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f14388h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((f) it.next());
        }
        arrayList.clear();
        View view = this.f14394o;
        this.f14395p = view;
        if (view != null) {
            boolean z10 = this.f14404y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f14404y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14389j);
            }
            this.f14395p.addOnAttachStateChangeListener(this.f14390k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(androidx.appcompat.view.menu.f r20) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.u(androidx.appcompat.view.menu.f):void");
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0227b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0227b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.f14404y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.f14404y = view.getViewTreeObserver();
                }
                bVar.f14404y.removeGlobalOnLayoutListener(bVar.f14389j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
