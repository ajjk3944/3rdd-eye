package f;

import android.content.Context;
import android.content.Intent;
import f.AbstractC4328a;
import kotlin.jvm.internal.l;
import z0.C5848a;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class c extends AbstractC4328a<String, Boolean> {
    @Override // f.AbstractC4328a
    public final Intent a(Context context, String str) {
        String input = str;
        l.f(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input});
        l.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // f.AbstractC4328a
    public final AbstractC4328a.C0451a<Boolean> b(Context context, String str) {
        String input = str;
        l.f(input, "input");
        if (C5848a.checkSelfPermission(context, input) == 0) {
            return new AbstractC4328a.C0451a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // f.AbstractC4328a
    public final Boolean c(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (intArrayExtra[i10] == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }
}
