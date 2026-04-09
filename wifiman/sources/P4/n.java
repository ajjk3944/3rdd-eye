package p4;

import A4.C2405i;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;
import p4.C7226i;
import v4.AbstractC8191b;

/* loaded from: classes3.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final C4.a f57611a;

    /* renamed from: b, reason: collision with root package name */
    private static final v4.k f57612b;

    /* renamed from: c, reason: collision with root package name */
    private static final v4.j f57613c;

    /* renamed from: d, reason: collision with root package name */
    private static final v4.c f57614d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8191b f57615e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57616a;

        static {
            int[] iArr = new int[A4.I.values().length];
            f57616a = iArr;
            try {
                iArr[A4.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57616a[A4.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57616a[A4.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57616a[A4.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4.a aVarE = v4.s.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f57611a = aVarE;
        f57612b = v4.k.a(new C7227j(), C7226i.class, v4.p.class);
        f57613c = v4.j.a(new C7228k(), aVarE, v4.p.class);
        f57614d = v4.c.a(new l(), C7224g.class, v4.o.class);
        f57615e = AbstractC8191b.a(new AbstractC8191b.InterfaceC2246b() { // from class: p4.m
            @Override // v4.AbstractC8191b.InterfaceC2246b
            public final AbstractC7072g a(v4.q qVar, o4.y yVar) {
                return n.b((v4.o) qVar, yVar);
            }
        }, aVarE, v4.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C7224g b(v4.o oVar, o4.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            C2405i c2405iB0 = C2405i.b0(oVar.g(), C5088o.b());
            if (c2405iB0.Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C7224g.a().e(C7226i.a().c(c2405iB0.X().size()).b(c2405iB0.Y().W()).d(16).e(e(oVar.e())).a()).d(C4.b.a(c2405iB0.X().N0(), o4.y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        d(v4.i.a());
    }

    public static void d(v4.i iVar) {
        iVar.h(f57612b);
        iVar.g(f57613c);
        iVar.f(f57614d);
        iVar.e(f57615e);
    }

    private static C7226i.c e(A4.I i10) throws GeneralSecurityException {
        int i11 = a.f57616a[i10.ordinal()];
        if (i11 == 1) {
            return C7226i.c.f57607b;
        }
        if (i11 == 2 || i11 == 3) {
            return C7226i.c.f57608c;
        }
        if (i11 == 4) {
            return C7226i.c.f57609d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
