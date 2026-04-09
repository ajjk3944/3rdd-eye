package a6;

import android.os.Bundle;
import i.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import yb.i;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f203b;

    public a(i iVar) {
        this.f202a = 0;
        this.f203b = new LinkedHashSet();
        iVar.P("androidx.savedstate.Restarter", this);
    }

    @Override // a6.d
    public final Bundle a() {
        switch (this.f202a) {
            case 0:
                Bundle bundleD = com.bumptech.glide.d.d((yj.i[]) Arrays.copyOf(new yj.i[0], 0));
                List listR0 = n.r0((LinkedHashSet) this.f203b);
                bundleD.putStringArrayList("classes_to_restore", listR0 instanceof ArrayList ? (ArrayList) listR0 : new ArrayList<>(listR0));
                return bundleD;
            default:
                Bundle bundle = new Bundle();
                ((g) this.f203b).q().getClass();
                return bundle;
        }
    }

    public a(g gVar) {
        this.f202a = 1;
        this.f203b = gVar;
    }
}
