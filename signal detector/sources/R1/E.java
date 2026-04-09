package r1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class E implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f23334b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final r f23335a;

    public E(r rVar) {
        this.f23335a = rVar;
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, l1.h hVar) {
        return this.f23335a.a(new h(((Uri) obj).toString()), i, i3, hVar);
    }

    @Override // r1.r
    public final boolean b(Object obj) {
        return f23334b.contains(((Uri) obj).getScheme());
    }
}
