package R2;

import R2.q;
import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes.dex */
public final class A<Data> implements q<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f11636b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final q<i, Data> f11637a;

    /* compiled from: UrlUriLoader.java */
    public static class a implements r<Uri, InputStream> {
        @Override // R2.r
        public final q<Uri, InputStream> c(u uVar) {
            return new A(uVar.b(i.class, InputStream.class));
        }
    }

    public A(q<i, Data> qVar) {
        this.f11637a = qVar;
    }

    @Override // R2.q
    public final boolean a(Uri uri) {
        return f11636b.contains(uri.getScheme());
    }

    @Override // R2.q
    public final q.a b(Uri uri, int i, int i10, L2.h hVar) {
        return this.f11637a.b(new i(uri.toString()), i, i10, hVar);
    }
}
