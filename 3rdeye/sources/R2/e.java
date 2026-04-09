package R2;

import R2.q;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import g3.C4389b;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DirectResourceLoader.java */
/* loaded from: classes.dex */
public final class e<DataT> implements q<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11651a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11652b;

    /* compiled from: DirectResourceLoader.java */
    public static final class a implements r<Integer, AssetFileDescriptor>, InterfaceC0154e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11653a;

        public a(Context context) {
            this.f11653a = context;
        }

        @Override // R2.e.InterfaceC0154e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // R2.e.InterfaceC0154e
        public final void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // R2.r
        public final q<Integer, AssetFileDescriptor> c(u uVar) {
            return new e(this.f11653a, this);
        }

        @Override // R2.e.InterfaceC0154e
        public final Object d(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResourceFd(i);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    public static final class b implements r<Integer, Drawable>, InterfaceC0154e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11654a;

        public b(Context context) {
            this.f11654a = context;
        }

        @Override // R2.e.InterfaceC0154e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // R2.e.InterfaceC0154e
        public final /* bridge */ /* synthetic */ void b(Drawable drawable) throws IOException {
        }

        @Override // R2.r
        public final q<Integer, Drawable> c(u uVar) {
            return new e(this.f11654a, this);
        }

        @Override // R2.e.InterfaceC0154e
        public final Object d(Resources resources, int i, Resources.Theme theme) {
            Context context = this.f11654a;
            return W2.b.a(context, context, i, theme);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    public static final class c implements r<Integer, InputStream>, InterfaceC0154e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11655a;

        public c(Context context) {
            this.f11655a = context;
        }

        @Override // R2.e.InterfaceC0154e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // R2.e.InterfaceC0154e
        public final void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // R2.r
        public final q<Integer, InputStream> c(u uVar) {
            return new e(this.f11655a, this);
        }

        @Override // R2.e.InterfaceC0154e
        public final Object d(Resources resources, int i, Resources.Theme theme) {
            return resources.openRawResource(i);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    /* renamed from: R2.e$e, reason: collision with other inner class name */
    public interface InterfaceC0154e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        Object d(Resources resources, int i, Resources.Theme theme);
    }

    public e(Context context, InterfaceC0154e<DataT> interfaceC0154e) {
        this.f11651a = context.getApplicationContext();
        this.f11652b = interfaceC0154e;
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [R2.e$e, java.lang.Object] */
    @Override // R2.q
    public final q.a b(Integer num, int i, int i10, L2.h hVar) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) hVar.c(W2.e.f13336b);
        return new q.a(new C4389b(num2), new d(theme, theme != null ? theme.getResources() : this.f11651a.getResources(), this.f11652b, num2.intValue()));
    }

    /* compiled from: DirectResourceLoader.java */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: b, reason: collision with root package name */
        public final Resources.Theme f11656b;

        /* renamed from: c, reason: collision with root package name */
        public final Resources f11657c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f11658d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11659e;

        /* renamed from: f, reason: collision with root package name */
        public DataT f11660f;

        public d(Resources.Theme theme, Resources resources, InterfaceC0154e<DataT> interfaceC0154e, int i) {
            this.f11656b = theme;
            this.f11657c = resources;
            this.f11658d = interfaceC0154e;
            this.f11659e = i;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [R2.e$e, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f11658d.a();
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [R2.e$e, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            DataT datat = this.f11660f;
            if (datat != null) {
                try {
                    this.f11658d.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [R2.e$e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super DataT> aVar) {
            try {
                ?? r42 = (DataT) this.f11658d.d(this.f11657c, this.f11659e, this.f11656b);
                this.f11660f = r42;
                aVar.f(r42);
            } catch (Resources.NotFoundException e4) {
                aVar.c(e4);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
