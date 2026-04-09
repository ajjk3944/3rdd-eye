package I2;

import I2.n;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final d f8478a;

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final d f8479a;

        public a(d dVar) {
            this.f8479a = dVar;
        }

        @Override // I2.o
        public final n d(r rVar) {
            return new g(this.f8479a);
        }
    }

    public static class b extends a {

        class a implements d {
            a() {
            }

            @Override // I2.g.d
            public Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // I2.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // I2.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY);
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final File f8480a;

        /* renamed from: b, reason: collision with root package name */
        private final d f8481b;

        /* renamed from: c, reason: collision with root package name */
        private Object f8482c;

        c(File file, d dVar) {
            this.f8480a = file;
            this.f8481b = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f8481b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f8482c;
            if (obj != null) {
                try {
                    this.f8481b.b(obj);
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
                Object objC = this.f8481b.c(this.f8480a);
                this.f8482c = objC;
                aVar.f(objC);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public interface d {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    public static class e extends a {

        class a implements d {
            a() {
            }

            @Override // I2.g.d
            public Class a() {
                return InputStream.class;
            }

            @Override // I2.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // I2.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d dVar) {
        this.f8478a = dVar;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(File file, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(file), new c(file, this.f8478a));
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
