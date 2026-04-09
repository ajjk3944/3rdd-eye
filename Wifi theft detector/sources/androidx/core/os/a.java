package androidx.core.os;

import android.os.OutcomeReceiver;
import c9.c;
import n0.q;

/* loaded from: classes.dex */
public abstract class a {
    public static final OutcomeReceiver a(c cVar) {
        return q.a(new ContinuationOutcomeReceiver(cVar));
    }
}
