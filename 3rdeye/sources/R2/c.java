package R2;

import R2.q;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import g3.C4389b;
import h3.C4412a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes.dex */
public final class c implements q<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    public static class b implements r<File, ByteBuffer> {
        @Override // R2.r
        public final q<File, ByteBuffer> c(u uVar) {
            return new c();
        }
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // R2.q
    public final q.a<ByteBuffer> b(File file, int i, int i10, L2.h hVar) {
        File file2 = file;
        return new q.a<>(new C4389b(file2), new a(file2));
    }

    /* compiled from: ByteBufferFileLoader.java */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: b, reason: collision with root package name */
        public final File f11645b;

        public a(File file) {
            this.f11645b = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(C4412a.a(this.f11645b));
            } catch (IOException e4) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e4);
                }
                aVar.c(e4);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
