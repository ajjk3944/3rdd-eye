package X6;

import X6.j;
import android.view.View;
import android.view.ViewGroup;
import c9.C2095p;
import java.util.ArrayList;
import java.util.List;
import p9.InterfaceC5480a;
import r7.AbstractC5534e;
import r7.C5533d;

/* compiled from: GridContainer.kt */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends j.d>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j.c f13615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j.c cVar) {
        super(0);
        this.f13615g = cVar;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends j.d> invoke() {
        O6.k kVar;
        float f10;
        int i;
        float f11;
        int i10;
        int i11;
        j.c cVar = this.f13615g;
        int i12 = cVar.f13600a;
        List list = (List) cVar.f13601b.f();
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(new j.d());
        }
        int size = list.size();
        int i14 = 0;
        while (true) {
            kVar = cVar.f13606g;
            if (i14 >= size) {
                break;
            }
            j.a aVar = (j.a) list.get(i14);
            View child = kVar.getChildAt(aVar.f13590a);
            kotlin.jvm.internal.l.e(child, "child");
            int i15 = AbstractC5534e.f45766c;
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            C5533d c5533d = (C5533d) layoutParams;
            int measuredWidth = child.getMeasuredWidth();
            int i16 = ((ViewGroup.MarginLayoutParams) c5533d).leftMargin;
            int i17 = ((ViewGroup.MarginLayoutParams) c5533d).rightMargin;
            float f12 = c5533d.f45761d;
            int i18 = aVar.f13593d;
            int i19 = aVar.f13591b;
            if (i18 == 1) {
                ((j.d) arrayList.get(i19)).a(f12, measuredWidth, i16 + measuredWidth + i17);
            } else {
                int i20 = i18 - 1;
                float f13 = f12 / i18;
                if (i20 >= 0) {
                    while (true) {
                        j.d.b((j.d) arrayList.get(i19 + i11), 0, 0, f13, 3);
                        i11 = i11 != i20 ? i11 + 1 : 0;
                    }
                }
            }
            i14++;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = list.size();
        for (int i21 = 0; i21 < size2; i21++) {
            j.a aVar2 = (j.a) list.get(i21);
            View child2 = kVar.getChildAt(aVar2.f13590a);
            kotlin.jvm.internal.l.e(child2, "child");
            int i22 = AbstractC5534e.f45766c;
            ViewGroup.LayoutParams layoutParams2 = child2.getLayoutParams();
            kotlin.jvm.internal.l.d(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            C5533d c5533d2 = (C5533d) layoutParams2;
            int measuredWidth2 = child2.getMeasuredWidth();
            int i23 = ((ViewGroup.MarginLayoutParams) c5533d2).leftMargin;
            int i24 = ((ViewGroup.MarginLayoutParams) c5533d2).rightMargin;
            float f14 = c5533d2.f45761d;
            int i25 = aVar2.f13593d;
            j.b bVar = new j.b(aVar2.f13591b, measuredWidth2, i23, i24, f14, i25);
            if (i25 > 1) {
                arrayList2.add(bVar);
            }
        }
        C2095p.i0(arrayList2, j.f.f13613b);
        int size3 = arrayList2.size();
        for (int i26 = 0; i26 < size3; i26++) {
            j.b bVar2 = (j.b) arrayList2.get(i26);
            int i27 = bVar2.f13595a;
            int i28 = bVar2.f13599e;
            int i29 = (i27 + i28) - 1;
            int i30 = bVar2.f13596b + bVar2.f13597c + bVar2.f13598d;
            if (i27 <= i29) {
                int i31 = i27;
                i = i30;
                f11 = 0.0f;
                i10 = 0;
                while (true) {
                    j.d dVar = (j.d) arrayList.get(i31);
                    f10 = 0.0f;
                    i30 -= dVar.f13609c;
                    if (dVar.c()) {
                        f11 += dVar.f13610d;
                    } else {
                        if (dVar.f13608b == 0) {
                            i10++;
                        }
                        i -= dVar.f13609c;
                    }
                    if (i31 == i29) {
                        break;
                    }
                    i31++;
                }
            } else {
                f10 = 0.0f;
                i = i30;
                f11 = 0.0f;
                i10 = 0;
            }
            if (f11 > f10) {
                if (i27 <= i29) {
                    while (true) {
                        j.d dVar2 = (j.d) arrayList.get(i27);
                        if (dVar2.c()) {
                            int iCeil = (int) Math.ceil((dVar2.f13610d / f11) * i);
                            j.d.b(dVar2, iCeil - (dVar2.f13609c - dVar2.f13608b), iCeil, f10, 4);
                        }
                        if (i27 == i29) {
                            break;
                        }
                        i27++;
                        f10 = 0.0f;
                    }
                }
            } else if (i30 > 0 && i27 <= i29) {
                while (true) {
                    j.d dVar3 = (j.d) arrayList.get(i27);
                    if (i10 <= 0) {
                        int i32 = i30 / i28;
                        j.d.b(dVar3, dVar3.f13608b + i32, dVar3.f13609c + i32, 0.0f, 4);
                    } else if (dVar3.f13608b == 0 && !dVar3.c()) {
                        int i33 = i30 / i10;
                        j.d.b(dVar3, dVar3.f13608b + i33, dVar3.f13609c + i33, 0.0f, 4);
                    }
                    if (i27 == i29) {
                        break;
                    }
                    i27++;
                }
            }
        }
        j.c.a(arrayList, cVar.f13604e);
        int size4 = arrayList.size();
        int i34 = 0;
        for (int i35 = 0; i35 < size4; i35++) {
            j.d dVar4 = (j.d) arrayList.get(i35);
            dVar4.f13607a = i34;
            i34 += dVar4.f13609c;
        }
        return arrayList;
    }
}
