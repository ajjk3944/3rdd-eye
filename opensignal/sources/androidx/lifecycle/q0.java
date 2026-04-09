package androidx.lifecycle;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.e5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 implements l7.d {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.t f1516a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1517b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1518c;

    /* renamed from: d, reason: collision with root package name */
    public final lq.q f1519d;

    public q0(io.sentry.t tVar, w0 w0Var) {
        br.l.e(tVar, "savedStateRegistry");
        this.f1516a = tVar;
        this.f1519d = kc.f.F(new p0(0, w0Var));
    }

    @Override // l7.d
    public final Bundle a() {
        Bundle bundleM = e5.m((lq.l[]) Arrays.copyOf(new lq.l[0], 0));
        Bundle bundle = this.f1518c;
        if (bundle != null) {
            bundleM.putAll(bundle);
        }
        Iterator it = ((r0) this.f1519d.getValue()).f1520b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1517b = false;
            return bundleM;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((l0) entry.getValue()).getClass();
        throw null;
    }
}
