package u8;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class n extends d {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f23474i;
    public final PointF j;
    public final h k;

    /* renamed from: l, reason: collision with root package name */
    public final h f23475l;

    /* renamed from: m, reason: collision with root package name */
    public bm.e f23476m;

    /* renamed from: n, reason: collision with root package name */
    public bm.e f23477n;

    public n(h hVar, h hVar2) {
        super(Collections.EMPTY_LIST);
        this.f23474i = new PointF();
        this.j = new PointF();
        this.k = hVar;
        this.f23475l = hVar2;
        j(this.f23450d);
    }

    @Override // u8.d
    public final Object f() {
        return m();
    }

    @Override // u8.d
    public final /* bridge */ /* synthetic */ Object g(f9.a aVar, float f10) {
        return m();
    }

    @Override // u8.d
    public final void j(float f10) {
        h hVar = this.k;
        hVar.j(f10);
        h hVar2 = this.f23475l;
        hVar2.j(f10);
        this.f23474i.set(((Float) hVar.f()).floatValue(), ((Float) hVar2.f()).floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23447a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).a();
            i10++;
        }
    }

    public final PointF m() {
        Float f10;
        h hVar;
        f9.a aVarB;
        h hVar2;
        f9.a aVarB2;
        Float f11 = null;
        if (this.f23476m == null || (aVarB2 = (hVar2 = this.k).b()) == null) {
            f10 = null;
        } else {
            Float f12 = aVarB2.f8711h;
            bm.e eVar = this.f23476m;
            float f13 = aVarB2.f8710g;
            f10 = (Float) eVar.B(f13, f12 == null ? f13 : f12.floatValue(), (Float) aVarB2.f8705b, (Float) aVarB2.f8706c, hVar2.d(), hVar2.e(), hVar2.f23450d);
        }
        if (this.f23477n != null && (aVarB = (hVar = this.f23475l).b()) != null) {
            Float f14 = aVarB.f8711h;
            bm.e eVar2 = this.f23477n;
            float f15 = aVarB.f8710g;
            f11 = (Float) eVar2.B(f15, f14 == null ? f15 : f14.floatValue(), (Float) aVarB.f8705b, (Float) aVarB.f8706c, hVar.d(), hVar.e(), hVar.f23450d);
        }
        PointF pointF = this.f23474i;
        PointF pointF2 = this.j;
        if (f10 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f10.floatValue(), 0.0f);
        }
        if (f11 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f11.floatValue());
        return pointF2;
    }
}
