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

    /* renamed from: a, reason: collision with root package name */
    protected Context f26777a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f26778b;

    /* renamed from: c, reason: collision with root package name */
    protected e f26779c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f26780d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f26781e;

    /* renamed from: f, reason: collision with root package name */
    private j.a f26782f;

    /* renamed from: g, reason: collision with root package name */
    private int f26783g;

    /* renamed from: h, reason: collision with root package name */
    private int f26784h;

    /* renamed from: i, reason: collision with root package name */
    protected k f26785i;

    /* renamed from: j, reason: collision with root package name */
    private int f26786j;

    public a(Context context, int i10, int i11) {
        this.f26777a = context;
        this.f26780d = LayoutInflater.from(context);
        this.f26783g = i10;
        this.f26784h = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f26785i).addView(view, i10);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z10) {
        j.a aVar = this.f26782f;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f26785i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f26779c;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList arrayListE = this.f26779c.E();
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) arrayListE.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f26782f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        this.f26778b = context;
        this.f26781e = LayoutInflater.from(context);
        this.f26779c = eVar;
    }

    public k.a j(ViewGroup viewGroup) {
        return (k.a) this.f26780d.inflate(this.f26784h, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        j.a aVar = this.f26782f;
        m mVar2 = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            mVar2 = this.f26779c;
        }
        return aVar.d(mVar2);
    }

    protected boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f26782f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarJ = view instanceof k.a ? (k.a) view : j(viewGroup);
        b(gVar, aVarJ);
        return (View) aVarJ;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f26785i == null) {
            k kVar = (k) this.f26780d.inflate(this.f26783g, viewGroup, false);
            this.f26785i = kVar;
            kVar.b(this.f26779c);
            d(true);
        }
        return this.f26785i;
    }

    public void p(int i10) {
        this.f26786j = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
