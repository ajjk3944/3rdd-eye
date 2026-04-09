package R2;

import R2.q;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.applovin.sdk.AppLovinEventTypes;
import g3.C4389b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes.dex */
public final class z<Data> implements q<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f11724b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", AppLovinEventTypes.USER_VIEWED_CONTENT, "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f11725a;

    /* compiled from: UriLoader.java */
    public static final class a implements r<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f11726a;

        public a(ContentResolver contentResolver) {
            this.f11726a = contentResolver;
        }

        @Override // R2.z.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f11726a, uri);
        }

        @Override // R2.r
        public final q<Uri, AssetFileDescriptor> c(u uVar) {
            return new z(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements r<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f11727a;

        public b(ContentResolver contentResolver) {
            this.f11727a = contentResolver;
        }

        @Override // R2.z.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f11727a, uri);
        }

        @Override // R2.r
        public final q<Uri, ParcelFileDescriptor> c(u uVar) {
            return new z(this);
        }
    }

    /* compiled from: UriLoader.java */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements r<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f11728a;

        public d(ContentResolver contentResolver) {
            this.f11728a = contentResolver;
        }

        @Override // R2.z.c
        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f11728a, uri);
        }

        @Override // R2.r
        public final q<Uri, InputStream> c(u uVar) {
            return new z(this);
        }
    }

    public z(c<Data> cVar) {
        this.f11725a = cVar;
    }

    @Override // R2.q
    public final boolean a(Uri uri) {
        return f11724b.contains(uri.getScheme());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [R2.z$c, java.lang.Object] */
    @Override // R2.q
    public final q.a b(Uri uri, int i, int i10, L2.h hVar) {
        Uri uri2 = uri;
        return new q.a(new C4389b(uri2), this.f11725a.a(uri2));
    }
}
