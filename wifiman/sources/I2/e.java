package I2;

import I2.n;
import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    private final a f8462a;

    public interface a {
        Class a();

        void b(Object obj);

        Object c(String str);
    }

    private static final class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final String f8463a;

        /* renamed from: b, reason: collision with root package name */
        private final a f8464b;

        /* renamed from: c, reason: collision with root package name */
        private Object f8465c;

        b(String str, a aVar) {
            this.f8463a = str;
            this.f8464b = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f8464b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f8464b.b(this.f8465c);
            } catch (IOException unused) {
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
                Object objC = this.f8464b.c(this.f8463a);
                this.f8465c = objC;
                aVar.f(objC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c implements o {

        /* renamed from: a, reason: collision with root package name */
        private final a f8466a = new a();

        class a implements a {
            a() {
            }

            @Override // I2.e.a
            public Class a() {
                return InputStream.class;
            }

            @Override // I2.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // I2.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // I2.o
        public n d(r rVar) {
            return new e(this.f8466a);
        }
    }

    public e(a aVar) {
        this.f8462a = aVar;
    }

    @Override // I2.n
    public n.a a(Object obj, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(obj), new b(obj.toString(), this.f8462a));
    }

    @Override // I2.n
    public boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
