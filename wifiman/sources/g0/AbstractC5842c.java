package g0;

import Yg.r;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5842c {
    public static final void a(C5840a c5840a, SparseArray sparseArray) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            f fVar = f.f47370a;
            if (fVar.d(autofillValue)) {
                c5840a.d().b(iKeyAt, fVar.i(autofillValue).toString());
            } else {
                if (fVar.b(autofillValue)) {
                    throw new r("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (fVar.c(autofillValue)) {
                    throw new r("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (fVar.e(autofillValue)) {
                    throw new r("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(C5840a c5840a, ViewStructure viewStructure) {
        int iA = e.f47369a.a(viewStructure, c5840a.d().a().size());
        for (Map.Entry entry : c5840a.d().a().entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            h hVar = (h) entry.getValue();
            e eVar = e.f47369a;
            ViewStructure viewStructureB = eVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                f fVar = f.f47370a;
                AutofillId autofillIdA = fVar.a(viewStructure);
                AbstractC6492s.f(autofillIdA);
                fVar.g(viewStructureB, autofillIdA, iIntValue);
                eVar.d(viewStructureB, iIntValue, c5840a.e().getContext().getPackageName(), null, null);
                fVar.h(viewStructureB, k.f47380a.a());
                List listC = hVar.c();
                ArrayList arrayList = new ArrayList(listC.size());
                int size = listC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(AbstractC5841b.a((j) listC.get(i10)));
                }
                fVar.f(viewStructureB, (String[]) arrayList.toArray(new String[0]));
                C6533i c6533iD = hVar.d();
                if (c6533iD == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iRound = Math.round(c6533iD.k());
                    int iRound2 = Math.round(c6533iD.n());
                    int iRound3 = Math.round(c6533iD.l());
                    e.f47369a.c(viewStructureB, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(c6533iD.e()) - iRound2);
                }
            }
            iA++;
        }
    }
}
