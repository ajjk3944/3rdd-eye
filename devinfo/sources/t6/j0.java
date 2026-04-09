package t6;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f34372a;

    /* renamed from: b, reason: collision with root package name */
    public final b7.r f34373b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f34374c;

    public j0(UUID uuid, b7.r rVar, LinkedHashSet linkedHashSet) {
        nk.k.e(uuid, FacebookMediationAdapter.KEY_ID);
        nk.k.e(rVar, "workSpec");
        nk.k.e(linkedHashSet, "tags");
        this.f34372a = uuid;
        this.f34373b = rVar;
        this.f34374c = linkedHashSet;
    }
}
