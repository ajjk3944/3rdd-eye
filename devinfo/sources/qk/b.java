package qk;

import com.google.android.gms.internal.ads.wa;
import java.util.Random;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final wa f32442b = new wa(8);

    @Override // qk.a
    public final Random c() {
        Object obj = this.f32442b.get();
        k.d(obj, "get(...)");
        return (Random) obj;
    }
}
