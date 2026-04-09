package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public Context f684a;

    /* renamed from: b, reason: collision with root package name */
    public Context f685b;

    /* renamed from: c, reason: collision with root package name */
    public d f686c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f687d;

    /* renamed from: e, reason: collision with root package name */
    public LayoutInflater f688e;

    /* renamed from: f, reason: collision with root package name */
    public h.a f689f;

    /* renamed from: g, reason: collision with root package name */
    public int f690g;

    /* renamed from: h, reason: collision with root package name */
    public int f691h;

    /* renamed from: i, reason: collision with root package name */
    public i f692i;

    /* renamed from: j, reason: collision with root package name */
    public int f693j;

    public a(Context context, int i10, int i11) {
        this.f684a = context;
        this.f687d = LayoutInflater.from(context);
        this.f690g = i10;
        this.f691h = i11;
    }

    public void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f692i).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void b(d dVar, boolean z10) {
        h.a aVar = this.f689f;
        if (aVar != null) {
            aVar.b(dVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean c(d dVar, f fVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void d(h.a aVar) {
        this.f689f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.d] */
    @Override // androidx.appcompat.view.menu.h
    public boolean f(k kVar) {
        h.a aVar = this.f689f;
        k kVar2 = kVar;
        if (aVar == null) {
            return false;
        }
        if (kVar == null) {
            kVar2 = this.f686c;
        }
        return aVar.c(kVar2);
    }

    @Override // androidx.appcompat.view.menu.h
    public int getId() {
        return this.f693j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.h
    public void h(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f692i;
        if (viewGroup == null) {
            return;
        }
        d dVar = this.f686c;
        int i10 = 0;
        if (dVar != null) {
            dVar.t();
            ArrayList arrayListG = this.f686c.G();
            int size = arrayListG.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                f fVar = (f) arrayListG.get(i12);
                if (s(i11, fVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    f itemData = childAt instanceof i.a ? ((i.a) childAt).getItemData() : null;
                    View viewP = p(fVar, childAt, viewGroup);
                    if (fVar != itemData) {
                        viewP.setPressed(false);
                        viewP.jumpDrawablesToCurrentState();
                    }
                    if (viewP != childAt) {
                        a(viewP, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!n(viewGroup, i10)) {
                i10++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean j(d dVar, f fVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void k(Context context, d dVar) {
        this.f685b = context;
        this.f688e = LayoutInflater.from(context);
        this.f686c = dVar;
    }

    public abstract void l(f fVar, i.a aVar);

    public i.a m(ViewGroup viewGroup) {
        return (i.a) this.f687d.inflate(this.f691h, viewGroup, false);
    }

    public boolean n(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public h.a o() {
        return this.f689f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(f fVar, View view, ViewGroup viewGroup) {
        i.a aVarM = view instanceof i.a ? (i.a) view : m(viewGroup);
        l(fVar, aVarM);
        return (View) aVarM;
    }

    public i q(ViewGroup viewGroup) {
        if (this.f692i == null) {
            i iVar = (i) this.f687d.inflate(this.f690g, viewGroup, false);
            this.f692i = iVar;
            iVar.a(this.f686c);
            h(true);
        }
        return this.f692i;
    }

    public void r(int i10) {
        this.f693j = i10;
    }

    public abstract boolean s(int i10, f fVar);
}
