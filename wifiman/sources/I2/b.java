package I2;

import I2.n;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0349b f8456a;

    public static class a implements o {

        /* renamed from: I2.b$a$a, reason: collision with other inner class name */
        class C0348a implements InterfaceC0349b {
            C0348a() {
            }

            @Override // I2.b.InterfaceC0349b
            public Class a() {
                return ByteBuffer.class;
            }

            @Override // I2.b.InterfaceC0349b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // I2.o
        public n d(r rVar) {
            return new b(new C0348a());
        }
    }

    /* renamed from: I2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0349b {
        Class a();

        Object b(byte[] bArr);
    }

    private static class c implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f8458a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0349b f8459b;

        c(byte[] bArr, InterfaceC0349b interfaceC0349b) {
            this.f8458a = bArr;
            this.f8459b = interfaceC0349b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f8459b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
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
            aVar.f(this.f8459b.b(this.f8458a));
        }
    }

    public static class d implements o {

        class a implements InterfaceC0349b {
            a() {
            }

            @Override // I2.b.InterfaceC0349b
            public Class a() {
                return InputStream.class;
            }

            @Override // I2.b.InterfaceC0349b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // I2.o
        public n d(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0349b interfaceC0349b) {
        this.f8456a = interfaceC0349b;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(byte[] bArr, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(bArr), new c(bArr, this.f8456a));
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }
}
