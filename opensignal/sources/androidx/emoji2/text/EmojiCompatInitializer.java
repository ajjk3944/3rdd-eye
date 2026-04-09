package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import j4.h;
import j4.i;
import j4.k;
import j4.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import r7.a;
import r7.b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // r7.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // r7.b
    public final Object b(Context context) {
        Object objB;
        q qVar = new q(new k(context, 0));
        qVar.f10098a = 1;
        if (h.k == null) {
            synchronized (h.j) {
                try {
                    if (h.k == null) {
                        h.k = new h(qVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f21300e) {
            try {
                objB = aVarC.f21301a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        o oVarH = ((v) objB).h();
        oVarH.V0(new i(this, oVarH));
        return Boolean.TRUE;
    }
}
