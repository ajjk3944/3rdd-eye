package j1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {
    public static AutofillValue a(String str) {
        return AutofillValue.forText(str);
    }

    public static AutofillValue b(boolean z3) {
        return AutofillValue.forToggle(z3);
    }

    public static void c(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void d(ViewStructure viewStructure, AutofillId autofillId, int i4) {
        viewStructure.setAutofillId(autofillId, i4);
    }

    public static void e(ViewStructure viewStructure, int i4) {
        viewStructure.setAutofillType(i4);
    }

    public static void f(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void g(ViewStructure viewStructure, boolean z3) {
        viewStructure.setDataIsSensitive(z3);
    }

    public static void h(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }
}
