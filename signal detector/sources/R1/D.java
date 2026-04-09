package r1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class D implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f23332b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f23333a;

    public D(C c6) {
        this.f23333a = c6;
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, l1.h hVar) {
        com.bumptech.glide.load.data.d aVar;
        Uri uri = (Uri) obj;
        G1.b bVar = new G1.b(uri);
        C c6 = (C) this.f23333a;
        switch (c6.f23329a) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(c6.f23330b, uri, c6.f23331c, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(c6.f23330b, uri, c6.f23331c, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.n(c6.f23330b, uri, c6.f23331c);
                break;
        }
        return new q(bVar, aVar);
    }

    @Override // r1.r
    public final boolean b(Object obj) {
        return f23332b.contains(((Uri) obj).getScheme());
    }
}
