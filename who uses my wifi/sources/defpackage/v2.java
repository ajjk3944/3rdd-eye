package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v2 {
    public final Context a;
    public final a62 b;

    public v2(Context context, a62 a62Var) {
        this.a = context;
        this.b = a62Var;
    }

    public final void a(b3 b3Var) {
        e13 e13Var = b3Var.a;
        Context context = this.a;
        mz1.a(context);
        if (((Boolean) q02.c.w()).booleanValue()) {
            if (((Boolean) tw1.e.c.a(mz1.Wb)).booleanValue()) {
                uu1.b.execute(new jq3(this, e13Var, 19));
                return;
            }
        }
        try {
            this.b.Z(fr.o(context, e13Var));
        } catch (RemoteException e) {
            gi2.c0("Failed to load ad.", e);
        }
    }
}
