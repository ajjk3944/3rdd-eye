package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import d8.h;
import h6.a;
import h6.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import jg.n;
import w4.i;
import w4.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // h6.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final void b(Context context) {
        Object objB;
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f24882e) {
            try {
                objB = aVarC.f24883a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c0 c0VarJ = ((a0) objB).j();
        c0VarJ.a(new n(this, c0VarJ));
    }

    @Override // h6.b
    public final Object create(Context context) {
        o oVar = new o(new h(context, 5));
        oVar.f34287a = 1;
        if (i.f36431k == null) {
            synchronized (i.j) {
                try {
                    if (i.f36431k == null) {
                        i.f36431k = new i(oVar);
                    }
                } finally {
                }
            }
        }
        b(context);
        return Boolean.TRUE;
    }
}
