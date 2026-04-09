package e2;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import l5.y;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7763a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7764d;

    public /* synthetic */ t(int i10, Object obj) {
        this.f7763a = i10;
        this.f7764d = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iA;
        int iA2;
        switch (this.f7763a) {
            case 0:
                return ((Number) ((ar.n) this.f7764d).w(obj, obj2)).intValue();
            case 1:
                y yVar = (y) this.f7764d;
                iA = yVar.a(obj2);
                iA2 = yVar.a(obj);
                break;
            case 2:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f7764d;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.K).compareTo(Boolean.valueOf(materialButton2.K));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            case 3:
                oa.j jVar = (oa.j) this.f7764d;
                iA = jVar.a(obj2);
                iA2 = jVar.a(obj);
                break;
            default:
                for (ar.k kVar : (ar.k[]) this.f7764d) {
                    int iN = se.b.n((Comparable) kVar.a(obj), (Comparable) kVar.a(obj2));
                    if (iN != 0) {
                        return iN;
                    }
                }
                return 0;
        }
        return iA - iA2;
    }
}
