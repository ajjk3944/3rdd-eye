package d8;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f22021b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final v f22022a;

    public h0(v vVar) {
        this.f22022a = vVar;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, x7.h hVar) {
        return this.f22022a.a(new l(((Uri) obj).toString()), i4, i10, hVar);
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        return f22021b.contains(((Uri) obj).getScheme());
    }
}
