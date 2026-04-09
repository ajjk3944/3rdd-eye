package w4;

import A4.C2397a;
import A4.I;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;
import o4.y;
import p4.C7227j;
import p4.C7228k;
import v4.AbstractC8191b;
import v4.s;
import w4.C8259d;

/* renamed from: w4.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC8261f {

    /* renamed from: a, reason: collision with root package name */
    private static final C4.a f64387a;

    /* renamed from: b, reason: collision with root package name */
    private static final v4.k f64388b;

    /* renamed from: c, reason: collision with root package name */
    private static final v4.j f64389c;

    /* renamed from: d, reason: collision with root package name */
    private static final v4.c f64390d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8191b f64391e;

    /* renamed from: w4.f$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64392a;

        static {
            int[] iArr = new int[I.values().length];
            f64392a = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64392a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64392a[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64392a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4.a aVarE = s.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f64387a = aVarE;
        f64388b = v4.k.a(new C7227j(), C8259d.class, v4.p.class);
        f64389c = v4.j.a(new C7228k(), aVarE, v4.p.class);
        f64390d = v4.c.a(new p4.l(), C8256a.class, v4.o.class);
        f64391e = AbstractC8191b.a(new AbstractC8191b.InterfaceC2246b() { // from class: w4.e
            @Override // v4.AbstractC8191b.InterfaceC2246b
            public final AbstractC7072g a(v4.q qVar, y yVar) {
                return AbstractC8261f.b((v4.o) qVar, yVar);
            }
        }, aVarE, v4.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C8256a b(v4.o oVar, y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            C2397a c2397aB0 = C2397a.b0(oVar.g(), C5088o.b());
            if (c2397aB0.Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C8256a.c().e(C8259d.a().b(c2397aB0.X().size()).c(c2397aB0.Y().W()).d(e(oVar.e())).a()).c(C4.b.a(c2397aB0.X().N0(), y.b(yVar))).d(oVar.c()).a();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(v4.i.a());
    }

    public static void d(v4.i iVar) {
        iVar.h(f64388b);
        iVar.g(f64389c);
        iVar.f(f64390d);
        iVar.e(f64391e);
    }

    private static C8259d.c e(I i10) throws GeneralSecurityException {
        int i11 = a.f64392a[i10.ordinal()];
        if (i11 == 1) {
            return C8259d.c.f64382b;
        }
        if (i11 == 2) {
            return C8259d.c.f64383c;
        }
        if (i11 == 3) {
            return C8259d.c.f64384d;
        }
        if (i11 == 4) {
            return C8259d.c.f64385e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
