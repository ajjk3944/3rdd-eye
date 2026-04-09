package R2;

import R2.q;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import g3.C4389b;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* renamed from: R2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563a<Data> implements q<Uri, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f11638a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11639b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: R2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0151a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: R2.a$b */
    public static class b implements r<Uri, AssetFileDescriptor>, InterfaceC0151a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f11640a;

        public b(AssetManager assetManager) {
            this.f11640a = assetManager;
        }

        @Override // R2.C1563a.InterfaceC0151a
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // R2.r
        public final q<Uri, AssetFileDescriptor> c(u uVar) {
            return new C1563a(this.f11640a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: R2.a$c */
    public static class c implements r<Uri, InputStream>, InterfaceC0151a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f11641a;

        public c(AssetManager assetManager) {
            this.f11641a = assetManager;
        }

        @Override // R2.C1563a.InterfaceC0151a
        public final com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // R2.r
        public final q<Uri, InputStream> c(u uVar) {
            return new C1563a(this.f11641a, this);
        }
    }

    public C1563a(AssetManager assetManager, InterfaceC0151a<Data> interfaceC0151a) {
        this.f11638a = assetManager;
        this.f11639b = interfaceC0151a;
    }

    @Override // R2.q
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [R2.a$a, java.lang.Object] */
    @Override // R2.q
    public final q.a b(Uri uri, int i, int i10, L2.h hVar) {
        Uri uri2 = uri;
        return new q.a(new C4389b(uri2), this.f11639b.a(this.f11638a, uri2.toString().substring(22)));
    }
}
