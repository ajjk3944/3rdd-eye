package androidx.compose.foundation;

import android.view.KeyEvent;
import com.google.android.gms.internal.measurement.b4;
import g1.i0;
import z0.m;

/* loaded from: classes.dex */
public abstract class a {
    public static final m a(m mVar, long j, i0 i0Var) {
        return mVar.c(new BackgroundElement(j, i0Var));
    }

    public static m b(m mVar, ar.a aVar) {
        return mVar.c(new ClickableElement(null, null, true, true, aVar));
    }

    public static final boolean c(KeyEvent keyEvent) {
        long jB = b4.b(keyEvent.getKeyCode());
        return q1.a.a(jB, q1.a.f20664h) || q1.a.a(jB, q1.a.k) || q1.a.a(jB, q1.a.f20669o) || q1.a.a(jB, q1.a.j);
    }
}
