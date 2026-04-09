package Z8;

import Yg.H;
import com.ui.btle.v2.f;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c extends Z8.a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25195a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteBuffer f25196b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f25197c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f25198a;

        private /* synthetic */ a(byte[] bArr) {
            this.f25198a = bArr;
        }

        public static final /* synthetic */ a a(byte[] bArr) {
            return new a(bArr);
        }

        public static byte[] b(byte[] key) {
            AbstractC6492s.i(key, "key");
            return key;
        }

        public static boolean c(byte[] bArr, Object obj) {
            return (obj instanceof a) && AbstractC6492s.d(bArr, ((a) obj).f());
        }

        public static int d(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        public static String e(byte[] bArr) {
            return "SharedKey(key=" + Arrays.toString(bArr) + ")";
        }

        public boolean equals(Object obj) {
            return c(this.f25198a, obj);
        }

        public final /* synthetic */ byte[] f() {
            return this.f25198a;
        }

        public int hashCode() {
            return d(this.f25198a);
        }

        public String toString() {
            return e(this.f25198a);
        }
    }

    public static final class b implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f25200b;

        public b(byte[] bArr) {
            this.f25200b = bArr;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            byte[] bArrB;
            try {
                synchronized (c.this.f25197c) {
                    byte[] decryptedData = new xj.a(c.this.f25195a).a(c.this.f25197c.array(), this.f25200b);
                    c cVar = c.this;
                    cVar.h(cVar.f25197c);
                    AbstractC6492s.h(decryptedData, "decryptedData");
                    bArrB = f.b(decryptedData);
                }
                interfaceC5910A.onSuccess(f.a(bArrB));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: Z8.c$c, reason: collision with other inner class name */
    public static final class C0969c implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f25202b;

        public C0969c(byte[] bArr) {
            this.f25202b = bArr;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            byte[] bArrB;
            try {
                synchronized (c.this.f25196b) {
                    byte[] encryptedData = new xj.a(c.this.f25195a).b(c.this.f25196b.array(), this.f25202b);
                    c cVar = c.this;
                    cVar.h(cVar.f25196b);
                    AbstractC6492s.h(encryptedData, "encryptedData");
                    bArrB = f.b(encryptedData);
                }
                interfaceC5910A.onSuccess(f.a(bArrB));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public /* synthetic */ c(byte[] bArr, short s10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, s10);
    }

    private final ByteBuffer g(short s10) {
        ByteBuffer nonce = ByteBuffer.allocate(24);
        nonce.putShort(s10);
        AbstractC6492s.h(nonce, "nonce");
        return nonce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byteBuffer.putShort(0, H.b((short) (H.b(byteBuffer.getShort()) + 1)));
    }

    @Override // Z8.a
    public z a(byte[] frame) {
        AbstractC6492s.i(frame, "frame");
        z zVarI = z.i(new b(frame));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    @Override // Z8.a
    public z b(byte[] frame) {
        AbstractC6492s.i(frame, "frame");
        z zVarI = z.i(new C0969c(frame));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private c(byte[] encryptionKey, short s10) {
        super(null);
        AbstractC6492s.i(encryptionKey, "encryptionKey");
        this.f25195a = encryptionKey;
        this.f25196b = g(s10);
        this.f25197c = g(s10);
    }
}
