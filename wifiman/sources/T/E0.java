package T;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f20844a;

    public E0(List list) {
        this.f20844a = list;
    }

    public final void a(int i10) {
        if (!this.f20844a.isEmpty()) {
            if (((Number) this.f20844a.get(0)).intValue() == i10) {
                return;
            }
            if (((Number) this.f20844a.get(r0.size() - 1)).intValue() == i10) {
                return;
            }
        }
        int size = this.f20844a.size();
        this.f20844a.add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int iIntValue = ((Number) this.f20844a.get(i11)).intValue();
            if (i10 <= iIntValue) {
                break;
            }
            this.f20844a.set(size, Integer.valueOf(iIntValue));
            size = i11;
        }
        this.f20844a.set(size, Integer.valueOf(i10));
    }

    public final boolean b() {
        return !this.f20844a.isEmpty();
    }

    public final int c() {
        return ((Number) AbstractC3689v.q0(this.f20844a)).intValue();
    }

    public final int d() {
        int iIntValue;
        if (!(this.f20844a.size() > 0)) {
            AbstractC3546o.r("Set is empty");
        }
        int iIntValue2 = ((Number) this.f20844a.get(0)).intValue();
        while (!this.f20844a.isEmpty() && ((Number) this.f20844a.get(0)).intValue() == iIntValue2) {
            List list = this.f20844a;
            list.set(0, AbstractC3689v.B0(list));
            List list2 = this.f20844a;
            list2.remove(list2.size() - 1);
            int size = this.f20844a.size();
            int size2 = this.f20844a.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = ((Number) this.f20844a.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = ((Number) this.f20844a.get(i12)).intValue();
                if (i11 >= size || (iIntValue = ((Number) this.f20844a.get(i11)).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.f20844a.set(i10, Integer.valueOf(iIntValue4));
                        this.f20844a.set(i12, Integer.valueOf(iIntValue3));
                        i10 = i12;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.f20844a.set(i10, Integer.valueOf(iIntValue));
                    this.f20844a.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                }
            }
        }
        return iIntValue2;
    }

    public /* synthetic */ E0(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list);
    }
}
