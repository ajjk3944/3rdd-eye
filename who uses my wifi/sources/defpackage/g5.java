package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g5 implements ys0 {
    public final /* synthetic */ int a;
    public final Object b;

    public g5(vq2 vq2Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        vq2Var.q("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.ys0
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((i5) this.b).m().getClass();
                return bundle;
            default:
                Bundle bundleB = uk2.b((gk0[]) Arrays.copyOf(new gk0[0], 0));
                List listO0 = yf.o0((LinkedHashSet) this.b);
                bundleB.putStringArrayList("classes_to_restore", listO0 instanceof ArrayList ? (ArrayList) listO0 : new ArrayList<>(listO0));
                return bundleB;
        }
    }

    public g5(i5 i5Var) {
        this.a = 0;
        this.b = i5Var;
    }
}
