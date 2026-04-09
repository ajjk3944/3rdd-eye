package d8;

import android.net.Uri;
import com.applovin.sdk.AppLovinEventTypes;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f22017b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", AppLovinEventTypes.USER_VIEWED_CONTENT, "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f22018a;

    public g0(f0 f0Var) {
        this.f22018a = f0Var;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, x7.h hVar) {
        com.bumptech.glide.load.data.d aVar;
        Uri uri = (Uri) obj;
        s8.d dVar = new s8.d(uri);
        f0 f0Var = (f0) this.f22018a;
        switch (f0Var.f22012a) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(f0Var.f22013b, uri, f0Var.f22014c, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(f0Var.f22013b, uri, f0Var.f22014c, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.n(f0Var.f22013b, uri, f0Var.f22014c);
                break;
        }
        return new u(dVar, aVar);
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        return f22017b.contains(((Uri) obj).getScheme());
    }
}
