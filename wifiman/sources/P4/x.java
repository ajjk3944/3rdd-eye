package p4;

import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;
import p4.v;
import v4.AbstractC8191b;

/* loaded from: classes3.dex */
abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static final C4.a f57659a;

    /* renamed from: b, reason: collision with root package name */
    private static final v4.k f57660b;

    /* renamed from: c, reason: collision with root package name */
    private static final v4.j f57661c;

    /* renamed from: d, reason: collision with root package name */
    private static final v4.c f57662d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8191b f57663e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57664a;

        static {
            int[] iArr = new int[A4.I.values().length];
            f57664a = iArr;
            try {
                iArr[A4.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57664a[A4.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57664a[A4.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57664a[A4.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4.a aVarE = v4.s.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f57659a = aVarE;
        f57660b = v4.k.a(new C7227j(), v.class, v4.p.class);
        f57661c = v4.j.a(new C7228k(), aVarE, v4.p.class);
        f57662d = v4.c.a(new l(), t.class, v4.o.class);
        f57663e = AbstractC8191b.a(new AbstractC8191b.InterfaceC2246b() { // from class: p4.w
            @Override // v4.AbstractC8191b.InterfaceC2246b
            public final AbstractC7072g a(v4.q qVar, o4.y yVar) {
                return x.b((v4.o) qVar, yVar);
            }
        }, aVarE, v4.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t b(v4.o oVar, o4.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            A4.n nVarZ = A4.n.Z(oVar.g(), C5088o.b());
            if (nVarZ.X() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return t.a().e(v.a().b(nVarZ.W().size()).c(e(oVar.e())).a()).d(C4.b.a(nVarZ.W().N0(), o4.y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        d(v4.i.a());
    }

    public static void d(v4.i iVar) {
        iVar.h(f57660b);
        iVar.g(f57661c);
        iVar.f(f57662d);
        iVar.e(f57663e);
    }

    private static v.c e(A4.I i10) throws GeneralSecurityException {
        int i11 = a.f57664a[i10.ordinal()];
        if (i11 == 1) {
            return v.c.f57655b;
        }
        if (i11 == 2 || i11 == 3) {
            return v.c.f57656c;
        }
        if (i11 == 4) {
            return v.c.f57657d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
