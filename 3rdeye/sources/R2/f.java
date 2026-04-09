package R2;

import R2.q;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import g3.C4389b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public final class f<Data> implements q<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final d<Data> f11661a;

    /* compiled from: FileLoader.java */
    public static class a<Data> implements r<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final d<Data> f11662a;

        public a(d<Data> dVar) {
            this.f11662a = dVar;
        }

        @Override // R2.r
        public final q<File, Data> c(u uVar) {
            return new f(this.f11662a);
        }
    }

    /* compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {
    }

    /* compiled from: FileLoader.java */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    public static class e extends a<InputStream> {
    }

    public f(d<Data> dVar) {
        this.f11661a = dVar;
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // R2.q
    public final q.a b(File file, int i, int i10, L2.h hVar) {
        File file2 = file;
        return new q.a(new C4389b(file2), new c(file2, this.f11661a));
    }

    /* compiled from: FileLoader.java */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final File f11663b;

        /* renamed from: c, reason: collision with root package name */
        public final d<Data> f11664c;

        /* renamed from: d, reason: collision with root package name */
        public Data f11665d;

        public c(File file, d<Data> dVar) {
            this.f11663b = file;
            this.f11664c = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f11664c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            Data data = this.f11665d;
            if (data != null) {
                try {
                    this.f11664c.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f11664c.c(this.f11663b);
                this.f11665d = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e4) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e4);
                }
                aVar.c(e4);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
