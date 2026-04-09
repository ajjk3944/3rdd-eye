package f;

import android.content.Context;
import android.content.Intent;
import e.C4290a;
import kotlin.jvm.internal.l;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: classes.dex */
public final class d extends AbstractC4328a<Intent, C4290a> {
    @Override // f.AbstractC4328a
    public final Intent a(Context context, Intent intent) {
        Intent input = intent;
        l.f(input, "input");
        return input;
    }

    @Override // f.AbstractC4328a
    public final C4290a c(int i, Intent intent) {
        return new C4290a(i, intent);
    }
}
