package I2;

import I2.n;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8468a;

    /* renamed from: b, reason: collision with root package name */
    private final e f8469b;

    private static final class a implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8470a;

        a(Context context) {
            this.f8470a = context;
        }

        @Override // I2.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new f(this.f8470a, this);
        }

        @Override // I2.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // I2.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    private static final class b implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8471a;

        b(Context context) {
            this.f8471a = context;
        }

        @Override // I2.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new f(this.f8471a, this);
        }

        @Override // I2.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }

        @Override // I2.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return M2.i.a(this.f8471a, i10, theme);
        }
    }

    private static final class c implements o, e {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8472a;

        c(Context context) {
            this.f8472a = context;
        }

        @Override // I2.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new f(this.f8472a, this);
        }

        @Override // I2.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // I2.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    private static final class d implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final Resources.Theme f8473a;

        /* renamed from: b, reason: collision with root package name */
        private final Resources f8474b;

        /* renamed from: c, reason: collision with root package name */
        private final e f8475c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8476d;

        /* renamed from: e, reason: collision with root package name */
        private Object f8477e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f8473a = theme;
            this.f8474b = resources;
            this.f8475c = eVar;
            this.f8476d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f8475c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f8477e;
            if (obj != null) {
                try {
                    this.f8475c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public C2.a d() {
            return C2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                Object objC = this.f8475c.c(this.f8473a, this.f8474b, this.f8476d);
                this.f8477e = objC;
                aVar.f(objC);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    private interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e eVar) {
        this.f8468a = context.getApplicationContext();
        this.f8469b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a a(Integer num, int i10, int i11, C2.g gVar) {
        Resources.Theme theme = (Resources.Theme) gVar.c(M2.l.f12467b);
        return new n.a(new V2.b(num), new d(theme, theme != null ? theme.getResources() : this.f8468a.getResources(), this.f8469b, num.intValue()));
    }

    @Override // I2.n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
