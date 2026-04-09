package R2;

import R2.q;
import android.util.Base64;
import com.bumptech.glide.load.data.d;
import g3.C4389b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes.dex */
public final class d<Model, Data> implements q<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final b.a f11646a;

    /* compiled from: DataUrlLoader.java */
    public static final class b<Model> implements r<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final a f11650a = new a();

        /* compiled from: DataUrlLoader.java */
        public class a {
            public final ByteArrayInputStream a(String str) throws IllegalArgumentException {
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

        @Override // R2.r
        public final q<Model, InputStream> c(u uVar) {
            return new d(this.f11650a);
        }
    }

    public d(b.a aVar) {
        this.f11646a = aVar;
    }

    @Override // R2.q
    public final boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // R2.q
    public final q.a<Data> b(Model model, int i, int i10, L2.h hVar) {
        return new q.a<>(new C4389b(model), new a(model.toString(), this.f11646a));
    }

    /* compiled from: DataUrlLoader.java */
    public static final class a<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final String f11647b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f11648c;

        /* renamed from: d, reason: collision with root package name */
        public ByteArrayInputStream f11649d;

        public a(String str, b.a aVar) {
            this.f11647b = str;
            this.f11648c = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() throws IOException {
            try {
                this.f11649d.close();
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamA = this.f11648c.a(this.f11647b);
                this.f11649d = byteArrayInputStreamA;
                aVar.f(byteArrayInputStreamA);
            } catch (IllegalArgumentException e4) {
                aVar.c(e4);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
