package B;

import C0.U;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class y implements x, androidx.compose.ui.layout.m {

    /* renamed from: a, reason: collision with root package name */
    private final r f1035a;

    /* renamed from: b, reason: collision with root package name */
    private final U f1036b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2455t f1037c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f1038d = new HashMap();

    public y(r rVar, U u10) {
        this.f1035a = rVar;
        this.f1036b = u10;
        this.f1037c = (InterfaceC2455t) rVar.d().invoke();
    }

    @Override // Y0.d
    public long F0(float f10) {
        return this.f1036b.F0(f10);
    }

    @Override // Y0.d
    public long K1(long j10) {
        return this.f1036b.K1(j10);
    }

    @Override // B.x
    public List M0(int i10, long j10) {
        List list = (List) this.f1038d.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        Object objB = this.f1037c.b(i10);
        List listQ1 = this.f1036b.Q1(objB, this.f1035a.b(i10, objB, this.f1037c.d(i10)));
        int size = listQ1.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((C0.B) listQ1.get(i11)).T(j10));
        }
        this.f1038d.put(Integer.valueOf(i10), arrayList);
        return arrayList;
    }

    @Override // Y0.d
    public float N0(float f10) {
        return this.f1036b.N0(f10);
    }

    @Override // Y0.d
    public float N1(long j10) {
        return this.f1036b.N1(j10);
    }

    @Override // C0.InterfaceC2535o
    public boolean a1() {
        return this.f1036b.a1();
    }

    @Override // Y0.d
    public float d1(float f10) {
        return this.f1036b.d1(f10);
    }

    @Override // Y0.l
    public long e0(float f10) {
        return this.f1036b.e0(f10);
    }

    @Override // Y0.d
    public long f0(long j10) {
        return this.f1036b.f0(j10);
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f1036b.getDensity();
    }

    @Override // C0.InterfaceC2535o
    public Y0.t getLayoutDirection() {
        return this.f1036b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.m
    public C0.D i1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        return this.f1036b.i1(i10, i11, map, interfaceC6835l, interfaceC6835l2);
    }

    @Override // Y0.l
    public float n0(long j10) {
        return this.f1036b.n0(j10);
    }

    @Override // androidx.compose.ui.layout.m
    public C0.D v1(int i10, int i11, Map map, InterfaceC6835l interfaceC6835l) {
        return this.f1036b.v1(i10, i11, map, interfaceC6835l);
    }

    @Override // B.x, Y0.d
    public float x(int i10) {
        return this.f1036b.x(i10);
    }

    @Override // Y0.d
    public int x1(float f10) {
        return this.f1036b.x1(f10);
    }

    @Override // Y0.l
    public float y() {
        return this.f1036b.y();
    }
}
