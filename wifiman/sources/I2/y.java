package I2;

import I2.n;
import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class y implements n {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f8555b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final n f8556a;

    public static class a implements o {
        @Override // I2.o
        public n d(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }
    }

    public y(n nVar) {
        this.f8556a = nVar;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        return this.f8556a.a(new h(uri.toString()), i10, i11, gVar);
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f8555b.contains(uri.getScheme());
    }
}
