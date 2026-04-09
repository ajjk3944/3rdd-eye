package t4;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import o4.InterfaceC7070e;
import o4.v;
import o4.w;
import o4.x;
import v4.f;
import v4.g;
import y4.b;

/* renamed from: t4.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8029c implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f61720a = Logger.getLogger(C8029c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C8029c f61721b = new C8029c();

    /* renamed from: t4.c$a */
    private static class a implements InterfaceC7070e {

        /* renamed from: a, reason: collision with root package name */
        private final v f61722a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f61723b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f61724c;

        public a(v vVar) {
            this.f61722a = vVar;
            if (!vVar.i()) {
                b.a aVar = f.f63434a;
                this.f61723b = aVar;
                this.f61724c = aVar;
            } else {
                y4.b bVarA = g.b().a();
                y4.c cVarA = f.a(vVar);
                this.f61723b = bVarA.a(cVarA, "daead", "encrypt");
                this.f61724c = bVarA.a(cVarA, "daead", "decrypt");
            }
        }

        @Override // o4.InterfaceC7070e
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrA = B4.f.a(this.f61722a.e().b(), ((InterfaceC7070e) this.f61722a.e().g()).a(bArr, bArr2));
                this.f61723b.b(this.f61722a.e().d(), bArr.length);
                return bArrA;
            } catch (GeneralSecurityException e10) {
                this.f61723b.a();
                throw e10;
            }
        }

        @Override // o4.InterfaceC7070e
        public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f61722a.f(bArrCopyOf)) {
                    try {
                        byte[] bArrB = ((InterfaceC7070e) cVar.g()).b(bArrCopyOfRange, bArr2);
                        this.f61724c.b(cVar.d(), bArrCopyOfRange.length);
                        return bArrB;
                    } catch (GeneralSecurityException e10) {
                        C8029c.f61720a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c cVar2 : this.f61722a.h()) {
                try {
                    byte[] bArrB2 = ((InterfaceC7070e) cVar2.g()).b(bArr, bArr2);
                    this.f61724c.b(cVar2.d(), bArr.length);
                    return bArrB2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f61724c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    C8029c() {
    }

    public static void e() {
        x.n(f61721b);
    }

    @Override // o4.w
    public Class a() {
        return InterfaceC7070e.class;
    }

    @Override // o4.w
    public Class b() {
        return InterfaceC7070e.class;
    }

    @Override // o4.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC7070e c(v vVar) {
        return new a(vVar);
    }
}
