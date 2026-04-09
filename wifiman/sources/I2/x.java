package I2;

import I2.n;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class x implements n {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f8550b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final c f8551a;

    public static final class a implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f8552a;

        public a(ContentResolver contentResolver) {
            this.f8552a = contentResolver;
        }

        @Override // I2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f8552a, uri);
        }

        @Override // I2.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public static class b implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f8553a;

        public b(ContentResolver contentResolver) {
            this.f8553a = contentResolver;
        }

        @Override // I2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f8553a, uri);
        }

        @Override // I2.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public static class d implements o, c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f8554a;

        public d(ContentResolver contentResolver) {
            this.f8554a = contentResolver;
        }

        @Override // I2.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f8554a, uri);
        }

        @Override // I2.o
        public n d(r rVar) {
            return new x(this);
        }
    }

    public x(c cVar) {
        this.f8551a = cVar;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(uri), this.f8551a.a(uri));
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f8550b.contains(uri.getScheme());
    }
}
