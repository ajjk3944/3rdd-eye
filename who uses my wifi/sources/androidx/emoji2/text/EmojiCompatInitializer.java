package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.b60;
import defpackage.d60;
import defpackage.mv;
import defpackage.nc3;
import defpackage.rr;
import defpackage.sr;
import defpackage.t20;
import defpackage.t83;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements t20 {
    @Override // defpackage.t20
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.t20
    public final Object b(Context context) {
        Object objA;
        nc3 nc3Var = new nc3();
        nc3Var.f = context.getApplicationContext();
        mv mvVar = new mv(nc3Var);
        mvVar.a = 1;
        if (rr.k == null) {
            synchronized (rr.j) {
                try {
                    if (rr.k == null) {
                        rr.k = new rr(mvVar);
                    }
                } finally {
                }
            }
        }
        t83 t83VarD = t83.D(context);
        t83VarD.getClass();
        synchronized (t83.l) {
            try {
                objA = ((HashMap) t83VarD.h).get(ProcessLifecycleInitializer.class);
                if (objA == null) {
                    objA = t83VarD.A(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        d60 d60VarE = ((b60) objA).e();
        d60VarE.a(new sr(this, d60VarE));
        return Boolean.TRUE;
    }
}
