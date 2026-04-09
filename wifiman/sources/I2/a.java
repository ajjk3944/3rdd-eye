package I2;

import I2.n;
import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: classes.dex */
public class a implements n {

    /* renamed from: c, reason: collision with root package name */
    private static final int f8451c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f8452a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0347a f8453b;

    /* renamed from: I2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0347a {
        com.bumptech.glide.load.data.d a(AssetManager assetManager, String str);
    }

    public static class b implements o, InterfaceC0347a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f8454a;

        public b(AssetManager assetManager) {
            this.f8454a = assetManager;
        }

        @Override // I2.a.InterfaceC0347a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // I2.o
        public n d(r rVar) {
            return new a(this.f8454a, this);
        }
    }

    public static class c implements o, InterfaceC0347a {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f8455a;

        public c(AssetManager assetManager) {
            this.f8455a = assetManager;
        }

        @Override // I2.a.InterfaceC0347a
        public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // I2.o
        public n d(r rVar) {
            return new a(this.f8455a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0347a interfaceC0347a) {
        this.f8452a = assetManager;
        this.f8453b = interfaceC0347a;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(uri), this.f8453b.a(this.f8452a, uri.toString().substring(f8451c)));
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
