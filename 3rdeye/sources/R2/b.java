package R2;

import R2.q;
import com.bumptech.glide.load.data.d;
import g3.C4389b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public final class b<Data> implements q<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0153b<Data> f11642a;

    /* compiled from: ByteArrayLoader.java */
    public static class a implements r<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: R2.b$a$a, reason: collision with other inner class name */
        public class C0152a implements InterfaceC0153b<ByteBuffer> {
            @Override // R2.b.InterfaceC0153b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // R2.b.InterfaceC0153b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // R2.r
        public final q<byte[], ByteBuffer> c(u uVar) {
            return new b(new C0152a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: R2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0153b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    public static class d implements r<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        public class a implements InterfaceC0153b<InputStream> {
            @Override // R2.b.InterfaceC0153b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // R2.b.InterfaceC0153b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // R2.r
        public final q<byte[], InputStream> c(u uVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0153b<Data> interfaceC0153b) {
        this.f11642a = interfaceC0153b;
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // R2.q
    public final q.a b(byte[] bArr, int i, int i10, L2.h hVar) {
        byte[] bArr2 = bArr;
        return new q.a(new C4389b(bArr2), new c(bArr2, this.f11642a));
    }

    /* compiled from: ByteArrayLoader.java */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f11643b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC0153b<Data> f11644c;

        public c(byte[] bArr, InterfaceC0153b<Data> interfaceC0153b) {
            this.f11643b = bArr;
            this.f11644c = interfaceC0153b;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return this.f11644c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            aVar.f(this.f11644c.b(this.f11643b));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
