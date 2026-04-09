package i;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements l7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11052a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11053b;

    public h(io.sentry.t tVar) {
        this.f11052a = 1;
        this.f11053b = new LinkedHashSet();
        tVar.H("androidx.savedstate.Restarter", this);
    }

    @Override // l7.d
    public final Bundle a() {
        switch (this.f11052a) {
            case 0:
                Bundle bundle = new Bundle();
                ((j) this.f11053b).m().getClass();
                return bundle;
            default:
                Bundle bundleM = e5.m((lq.l[]) Arrays.copyOf(new lq.l[0], 0));
                List listQ0 = mq.o.Q0((LinkedHashSet) this.f11053b);
                bundleM.putStringArrayList("classes_to_restore", listQ0 instanceof ArrayList ? (ArrayList) listQ0 : new ArrayList<>(listQ0));
                return bundleM;
        }
    }

    public h(j jVar) {
        this.f11052a = 0;
        this.f11053b = jVar;
    }
}
