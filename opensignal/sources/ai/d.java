package ai;

import android.content.Context;
import br.l;
import io.sentry.hints.i;
import xj.h;

/* loaded from: classes.dex */
public final class d extends vj.b {
    public final bm.d F;
    public final df.c G;
    public final Context H;
    public final h I;
    public final String J;
    public e K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bm.d dVar, df.c cVar, Context context, h hVar, i iVar, String str) {
        super(iVar, str);
        l.e(dVar, "assistant");
        l.e(hVar, "assistantJobToBroadcastMapper");
        l.e(str, "taskName");
        this.F = dVar;
        this.G = cVar;
        this.H = context;
        this.I = hVar;
        this.J = "CONNECTIVITY_ASSISTANT";
    }

    @Override // vj.b
    public final String f() {
        return this.J;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0391 A[SYNTHETIC] */
    @Override // vj.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r33, boolean r34, long r35) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.d.k(java.lang.String, boolean, long):void");
    }
}
