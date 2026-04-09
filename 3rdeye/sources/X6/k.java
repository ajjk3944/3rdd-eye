package X6;

import X6.j;
import android.view.View;
import android.view.ViewGroup;
import c9.C2097r;
import c9.C2099t;
import java.util.ArrayList;
import java.util.List;
import p9.InterfaceC5480a;
import r7.AbstractC5534e;
import r7.C5533d;

/* compiled from: GridContainer.kt */
/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends j.a>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j.c f13614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j.c cVar) {
        super(0);
        this.f13614g = cVar;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends j.a> invoke() {
        Integer numValueOf;
        int i;
        int i10 = 1;
        j.c cVar = this.f13614g;
        O6.k kVar = cVar.f13606g;
        if (kVar.getChildCount() == 0) {
            return C2099t.f18581b;
        }
        int i11 = cVar.f13600a;
        ArrayList arrayList = new ArrayList(kVar.getChildCount());
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int childCount = kVar.getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            numValueOf = null;
            if (i13 >= childCount) {
                break;
            }
            View childAt = kVar.getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                if (i11 != 0) {
                    int i14 = iArr2[0];
                    int i15 = i11 - 1;
                    if (i10 <= i15) {
                        int i16 = i10;
                        while (true) {
                            int i17 = iArr2[i16];
                            if (i14 > i17) {
                                i14 = i17;
                            }
                            if (i16 == i15) {
                                break;
                            }
                            i16 += i10;
                        }
                    }
                    numValueOf = Integer.valueOf(i14);
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                int i18 = 0;
                while (true) {
                    if (i18 >= i11) {
                        i18 = -1;
                        break;
                    }
                    if (iIntValue == iArr2[i18]) {
                        break;
                    }
                    i18 += i10;
                }
                int i19 = i12 + iIntValue;
                v9.g gVarO = v9.h.O(0, i11);
                int i20 = gVarO.f47096b;
                int i21 = gVarO.f47097c;
                if (i20 <= i21) {
                    while (true) {
                        i = i10;
                        iArr2[i20] = Math.max(0, iArr2[i20] - iIntValue);
                        if (i20 == i21) {
                            break;
                        }
                        i20++;
                        i10 = i;
                    }
                } else {
                    i = i10;
                }
                int i22 = AbstractC5534e.f45766c;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                C5533d c5533d = (C5533d) layoutParams;
                int iMin = Math.min(c5533d.a(), i11 - i18);
                int iC = c5533d.c();
                int i23 = i18;
                arrayList.add(new j.a(i13, i23, i19, iMin, iC));
                int i24 = iMin + i23;
                while (i23 < i24) {
                    if (iArr2[i23] > 0) {
                        Object obj = arrayList.get(iArr[i23]);
                        kotlin.jvm.internal.l.e(obj, "cells[cellIndices[i]]");
                        j.a aVar = (j.a) obj;
                        int i25 = aVar.f13593d;
                        int i26 = aVar.f13591b;
                        int i27 = i25 + i26;
                        while (i26 < i27) {
                            int i28 = iArr2[i26];
                            iArr2[i26] = 0;
                            i26++;
                        }
                        aVar.f13594e = i19 - aVar.f13592c;
                    }
                    iArr[i23] = i13;
                    iArr2[i23] = iC;
                    i23++;
                }
                i12 = i19;
            } else {
                i = i10;
            }
            i13++;
            i10 = i;
        }
        int i29 = i10;
        if (i11 != 0) {
            int i30 = iArr2[0];
            int i31 = i11 - 1;
            if (i31 == 0) {
                numValueOf = Integer.valueOf(i30);
            } else {
                int i32 = i29;
                int iMax = Math.max(i32, i30);
                v9.f it = new v9.g(i32, i31, i32).iterator();
                while (it.f47101d) {
                    int i33 = iArr2[it.a()];
                    int iMax2 = Math.max(i32, i33);
                    if (iMax > iMax2) {
                        i30 = i33;
                        iMax = iMax2;
                    }
                    i32 = 1;
                }
                numValueOf = Integer.valueOf(i30);
            }
        }
        int iIntValue2 = ((j.a) C2097r.v0(arrayList)).f13592c + (numValueOf != null ? numValueOf.intValue() : 1);
        int size = arrayList.size();
        for (int i34 = 0; i34 < size; i34++) {
            j.a aVar2 = (j.a) arrayList.get(i34);
            int i35 = aVar2.f13592c;
            if (aVar2.f13594e + i35 > iIntValue2) {
                aVar2.f13594e = iIntValue2 - i35;
            }
        }
        return arrayList;
    }
}
