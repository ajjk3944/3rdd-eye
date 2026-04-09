package androidx.emoji2.text;

import J0.a;
import J0.b;
import J2.i;
import android.content.Context;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.InterfaceC0298u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import f0.j;
import f0.k;
import f0.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // J0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // J0.b
    public final Object b(Context context) {
        r rVar = new r(new i(context, 4));
        rVar.f20014b = 1;
        if (j.f19988k == null) {
            synchronized (j.f19987j) {
                try {
                    if (j.f19988k == null) {
                        j.f19988k = new j(rVar);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f2032e) {
            try {
                objB = aVarC.f2033a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0300w c0300wJ = ((InterfaceC0298u) objB).j();
        c0300wJ.a(new k(this, c0300wJ));
    }
}
