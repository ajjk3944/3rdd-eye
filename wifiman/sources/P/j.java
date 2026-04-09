package P;

import Zg.AbstractC3689v;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final int f17931a;

    /* renamed from: b, reason: collision with root package name */
    private final List f17932b;

    /* renamed from: c, reason: collision with root package name */
    private final List f17933c;

    /* renamed from: d, reason: collision with root package name */
    private final l f17934d;

    /* renamed from: e, reason: collision with root package name */
    private int f17935e;

    public j(Context context) {
        super(context);
        this.f17931a = 5;
        ArrayList arrayList = new ArrayList();
        this.f17932b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f17933c = arrayList2;
        this.f17934d = new l();
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.f17935e = 1;
        setTag(f0.h.f46609J, Boolean.TRUE);
    }

    public final void a(k kVar) {
        kVar.E0();
        n nVarB = this.f17934d.b(kVar);
        if (nVarB != null) {
            nVarB.d();
            this.f17934d.c(kVar);
            this.f17933c.add(nVarB);
        }
    }

    public final n b(k kVar) {
        n nVarB = this.f17934d.b(kVar);
        if (nVarB != null) {
            return nVarB;
        }
        n nVar = (n) AbstractC3689v.M(this.f17933c);
        if (nVar == null) {
            if (this.f17935e > AbstractC3689v.n(this.f17932b)) {
                nVar = new n(getContext());
                addView(nVar);
                this.f17932b.add(nVar);
            } else {
                nVar = (n) this.f17932b.get(this.f17935e);
                k kVarA = this.f17934d.a(nVar);
                if (kVarA != null) {
                    kVarA.E0();
                    this.f17934d.c(kVarA);
                    nVar.d();
                }
            }
            int i10 = this.f17935e;
            if (i10 < this.f17931a - 1) {
                this.f17935e = i10 + 1;
            } else {
                this.f17935e = 0;
            }
        }
        this.f17934d.d(kVar, nVar);
        return nVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }
}
