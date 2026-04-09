package p4;

import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;
import p4.C7215A;
import v4.AbstractC8191b;

/* renamed from: p4.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC7217C {

    /* renamed from: a, reason: collision with root package name */
    private static final C4.a f57546a;

    /* renamed from: b, reason: collision with root package name */
    private static final v4.k f57547b;

    /* renamed from: c, reason: collision with root package name */
    private static final v4.j f57548c;

    /* renamed from: d, reason: collision with root package name */
    private static final v4.c f57549d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8191b f57550e;

    /* renamed from: p4.C$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57551a;

        static {
            int[] iArr = new int[A4.I.values().length];
            f57551a = iArr;
            try {
                iArr[A4.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57551a[A4.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57551a[A4.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57551a[A4.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4.a aVarE = v4.s.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f57546a = aVarE;
        f57547b = v4.k.a(new C7227j(), C7215A.class, v4.p.class);
        f57548c = v4.j.a(new C7228k(), aVarE, v4.p.class);
        f57549d = v4.c.a(new l(), y.class, v4.o.class);
        f57550e = AbstractC8191b.a(new AbstractC8191b.InterfaceC2246b() { // from class: p4.B
            @Override // v4.AbstractC8191b.InterfaceC2246b
            public final AbstractC7072g a(v4.q qVar, o4.y yVar) {
                return AbstractC7217C.b((v4.o) qVar, yVar);
            }
        }, aVarE, v4.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y b(v4.o oVar, o4.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            A4.r rVarZ = A4.r.Z(oVar.g(), C5088o.b());
            if (rVarZ.X() == 0) {
                return y.a(e(oVar.e()), C4.b.a(rVarZ.W().N0(), o4.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(v4.i.a());
    }

    public static void d(v4.i iVar) {
        iVar.h(f57547b);
        iVar.g(f57548c);
        iVar.f(f57549d);
        iVar.e(f57550e);
    }

    private static C7215A.a e(A4.I i10) throws GeneralSecurityException {
        int i11 = a.f57551a[i10.ordinal()];
        if (i11 == 1) {
            return C7215A.a.f57542b;
        }
        if (i11 == 2 || i11 == 3) {
            return C7215A.a.f57543c;
        }
        if (i11 == 4) {
            return C7215A.a.f57544d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
