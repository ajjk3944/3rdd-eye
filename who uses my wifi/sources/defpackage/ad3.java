package defpackage;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ad3 extends AsyncTask {
    public t83 a;
    public final lv2 b;

    public ad3(lv2 lv2Var) {
        this.b = lv2Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        t83 t83Var = this.a;
        if (t83Var != null) {
            t83Var.i = null;
            ad3 ad3Var = (ad3) ((ArrayDeque) t83Var.h).poll();
            t83Var.i = ad3Var;
            if (ad3Var != null) {
                ad3Var.executeOnExecutor((ThreadPoolExecutor) t83Var.g, new Object[0]);
            }
        }
    }
}
