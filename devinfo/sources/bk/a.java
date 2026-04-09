package bk;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import mk.c;
import th.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2272b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f2271a = i4;
        this.f2272b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2271a) {
            case 0:
                for (c cVar : (c[]) this.f2272b) {
                    int iF = pk.a.f((Comparable) cVar.invoke(obj), (Comparable) cVar.invoke(obj2));
                    if (iF != 0) {
                        break;
                    }
                }
                break;
            case 2:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f2272b;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f20390o).compareTo(Boolean.valueOf(materialButton2.f20390o));
                if (iCompareTo == 0) {
                    int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (iCompareTo2 == 0) {
                        break;
                    }
                }
                break;
        }
        return ((Number) ((o) this.f2272b).invoke(obj, obj2)).intValue();
    }
}
