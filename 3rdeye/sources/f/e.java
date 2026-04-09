package f;

import android.content.Context;
import android.content.Intent;
import e.C4290a;
import e.C4299j;
import kotlin.jvm.internal.l;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class e extends AbstractC4328a<C4299j, C4290a> {
    @Override // f.AbstractC4328a
    public final Intent a(Context context, C4299j c4299j) {
        C4299j input = c4299j;
        l.f(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        l.e(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // f.AbstractC4328a
    public final C4290a c(int i, Intent intent) {
        return new C4290a(i, intent);
    }
}
