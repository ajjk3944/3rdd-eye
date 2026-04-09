package p4;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import o4.InterfaceC7066a;
import o4.v;
import y4.b;

/* renamed from: p4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7221d implements o4.w {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f57584a = Logger.getLogger(C7221d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C7221d f57585b = new C7221d();

    /* renamed from: p4.d$b */
    private static class b implements InterfaceC7066a {

        /* renamed from: a, reason: collision with root package name */
        private final o4.v f57586a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f57587b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f57588c;

        @Override // o4.InterfaceC7066a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = B4.f.a(this.f57586a.e().b(), ((InterfaceC7066a) this.f57586a.e().g()).a(bArr, bArr2));
                this.f57587b.b(this.f57586a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f57587b.a();
                throw e10;
            }
        }

        @Override // o4.InterfaceC7066a
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f57586a.f(bArrCopyOf)) {
                    try {
                        byte[] bArrB = ((InterfaceC7066a) cVar.g()).b(bArrCopyOfRange, bArr2);
                        this.f57588c.b(cVar.d(), bArrCopyOfRange.length);
                        return bArrB;
                    } catch (GeneralSecurityException e10) {
                        C7221d.f57584a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c cVar2 : this.f57586a.h()) {
                try {
                    byte[] bArrB2 = ((InterfaceC7066a) cVar2.g()).b(bArr, bArr2);
                    this.f57588c.b(cVar2.d(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f57588c.a();
            throw new GeneralSecurityException("decryption failed");
        }

        private b(o4.v vVar) {
            this.f57586a = vVar;
            if (!vVar.i()) {
                b.a aVar = v4.f.f63434a;
                this.f57587b = aVar;
                this.f57588c = aVar;
            } else {
                y4.b bVarA = v4.g.b().a();
                y4.c cVarA = v4.f.a(vVar);
                this.f57587b = bVarA.a(cVarA, "aead", "encrypt");
                this.f57588c = bVarA.a(cVarA, "aead", "decrypt");
            }
        }
    }

    C7221d() {
    }

    public static void e() {
        o4.x.n(f57585b);
    }

    @Override // o4.w
    public Class a() {
        return InterfaceC7066a.class;
    }

    @Override // o4.w
    public Class b() {
        return InterfaceC7066a.class;
    }

    @Override // o4.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC7066a c(o4.v vVar) {
        return new b(vVar);
    }
}
