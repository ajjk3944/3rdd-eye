package y7;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import h7.C4422c;
import y7.c;
import y7.x;

/* compiled from: BaseCardHeightCalculator.java */
/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5817b implements x.a {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f48200a;

    /* renamed from: b, reason: collision with root package name */
    public final B.f f48201b;

    /* renamed from: c, reason: collision with root package name */
    public final B.f f48202c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<q> f48203d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public int f48204e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f48205f = 0.0f;

    public AbstractC5817b(ViewGroup viewGroup, B.f fVar, B.f fVar2) {
        this.f48200a = viewGroup;
        this.f48201b = fVar;
        this.f48202c = fVar2;
    }

    @Override // y7.x.a
    public final void a(float f10, int i) {
        int i10 = C4422c.f38270a;
        C7.a aVar = C7.a.ERROR;
        this.f48204e = i;
        this.f48205f = f10;
    }

    @Override // y7.x.a
    public int b(int i, int i10) {
        SparseArray<q> sparseArray = this.f48203d;
        q qVar = sparseArray.get(i);
        if (qVar == null) {
            c.f<TAB_DATA> fVar = ((c) this.f48202c.f317c).f48216l;
            int size = fVar == 0 ? 0 : fVar.a().size();
            if (size == 0) {
                return 0;
            }
            q qVar2 = new q(size, new C5816a(this, View.MeasureSpec.getSize(i), i10));
            sparseArray.put(i, qVar2);
            qVar = qVar2;
        }
        int iE = e(qVar, this.f48204e, this.f48205f);
        int i11 = C4422c.f38270a;
        C7.a aVar = C7.a.ERROR;
        return iE;
    }

    @Override // y7.x.a
    public final void d() {
        int i = C4422c.f38270a;
        C7.a aVar = C7.a.ERROR;
        this.f48203d.clear();
    }

    public abstract int e(q qVar, int i, float f10);
}
