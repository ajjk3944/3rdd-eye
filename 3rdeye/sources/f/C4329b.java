package f;

import android.content.Context;
import android.content.Intent;
import c9.C2077A;
import c9.C2078B;
import c9.C2091l;
import c9.C2097r;
import c9.C2100u;
import f.AbstractC4328a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;
import z0.C5848a;

/* compiled from: ActivityResultContracts.kt */
/* renamed from: f.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4329b extends AbstractC4328a<String[], Map<String, Boolean>> {
    @Override // f.AbstractC4328a
    public final Intent a(Context context, String[] strArr) {
        String[] input = strArr;
        l.f(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        l.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // f.AbstractC4328a
    public final AbstractC4328a.C0451a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] input = strArr;
        l.f(input, "input");
        if (input.length == 0) {
            return new AbstractC4328a.C0451a<>(C2100u.f18582b);
        }
        for (String str : input) {
            if (C5848a.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int iL = C2077A.l(input.length);
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new AbstractC4328a.C0451a<>(linkedHashMap);
    }

    @Override // f.AbstractC4328a
    public final Map<String, Boolean> c(int i, Intent intent) {
        C2100u c2100u = C2100u.f18582b;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i10 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i10 == 0));
                }
                return C2078B.s(C2097r.M0(arrayList, C2091l.l(stringArrayExtra)));
            }
        }
        return c2100u;
    }
}
