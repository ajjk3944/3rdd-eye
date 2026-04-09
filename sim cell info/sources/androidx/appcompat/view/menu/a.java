package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: b, reason: collision with root package name */
    protected Context f532b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f533c;

    /* renamed from: d, reason: collision with root package name */
    protected e f534d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f535e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f536f;

    /* renamed from: g, reason: collision with root package name */
    private j.a f537g;

    /* renamed from: h, reason: collision with root package name */
    private int f538h;

    /* renamed from: i, reason: collision with root package name */
    private int f539i;

    /* renamed from: j, reason: collision with root package name */
    protected k f540j;

    /* renamed from: k, reason: collision with root package name */
    private int f541k;

    public a(Context context, int i2, int i3) {
        this.f532b = context;
        this.f535e = LayoutInflater.from(context);
        this.f538h = i2;
        this.f539i = i3;
    }

    protected void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f540j).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        j.a aVar = this.f537g;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f537g = aVar;
    }

    public abstract void e(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        j.a aVar = this.f537g;
        if (aVar != null) {
            return aVar.c(mVar);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void h(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f540j;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f534d;
        int i2 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f534d.E();
            int size = arrayListE.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                g gVar = arrayListE.get(i4);
                if (q(i3, gVar)) {
                    View childAt = viewGroup.getChildAt(i3);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i2)) {
                i2++;
            }
        }
    }

    public k.a i(ViewGroup viewGroup) {
        return (k.a) this.f535e.inflate(this.f539i, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Context context, e eVar) {
        this.f533c = context;
        this.f536f = LayoutInflater.from(context);
        this.f534d = eVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(e eVar, g gVar) {
        return false;
    }

    protected boolean l(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public j.a m() {
        return this.f537g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarI = view instanceof k.a ? (k.a) view : i(viewGroup);
        e(gVar, aVarI);
        return (View) aVarI;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f540j == null) {
            k kVar = (k) this.f535e.inflate(this.f538h, viewGroup, false);
            this.f540j = kVar;
            kVar.c(this.f534d);
            h(true);
        }
        return this.f540j;
    }

    public void p(int i2) {
        this.f541k = i2;
    }

    public abstract boolean q(int i2, g gVar);
}
