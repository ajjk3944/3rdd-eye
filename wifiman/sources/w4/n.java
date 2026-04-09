package w4;

import A4.I;
import A4.u;
import A4.v;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;
import o4.y;
import p4.C7227j;
import p4.C7228k;
import v4.AbstractC8191b;
import v4.s;
import w4.C8267l;

/* loaded from: classes3.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final C4.a f64424a;

    /* renamed from: b, reason: collision with root package name */
    private static final v4.k f64425b;

    /* renamed from: c, reason: collision with root package name */
    private static final v4.j f64426c;

    /* renamed from: d, reason: collision with root package name */
    private static final v4.c f64427d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8191b f64428e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64429a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64430b;

        static {
            int[] iArr = new int[I.values().length];
            f64430b = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64430b[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64430b[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64430b[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f64429a = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64429a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64429a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64429a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f64429a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        C4.a aVarE = s.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f64424a = aVarE;
        f64425b = v4.k.a(new C7227j(), C8267l.class, v4.p.class);
        f64426c = v4.j.a(new C7228k(), aVarE, v4.p.class);
        f64427d = v4.c.a(new p4.l(), C8264i.class, v4.o.class);
        f64428e = AbstractC8191b.a(new AbstractC8191b.InterfaceC2246b() { // from class: w4.m
            @Override // v4.AbstractC8191b.InterfaceC2246b
            public final AbstractC7072g a(v4.q qVar, y yVar) {
                return n.b((v4.o) qVar, yVar);
            }
        }, aVarE, v4.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C8264i b(v4.o oVar, y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v vVarC0 = v.c0(oVar.g(), C5088o.b());
            if (vVarC0.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C8264i.c().e(C8267l.a().c(vVarC0.Y().size()).d(vVarC0.Z().Y()).b(e(vVarC0.Z().X())).e(f(oVar.e())).a()).d(C4.b.a(vVarC0.Y().N0(), y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(v4.i.a());
    }

    public static void d(v4.i iVar) {
        iVar.h(f64425b);
        iVar.g(f64426c);
        iVar.f(f64427d);
        iVar.e(f64428e);
    }

    private static C8267l.c e(u uVar) throws GeneralSecurityException {
        int i10 = a.f64429a[uVar.ordinal()];
        if (i10 == 1) {
            return C8267l.c.f64413b;
        }
        if (i10 == 2) {
            return C8267l.c.f64414c;
        }
        if (i10 == 3) {
            return C8267l.c.f64415d;
        }
        if (i10 == 4) {
            return C8267l.c.f64416e;
        }
        if (i10 == 5) {
            return C8267l.c.f64417f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.getNumber());
    }

    private static C8267l.d f(I i10) throws GeneralSecurityException {
        int i11 = a.f64430b[i10.ordinal()];
        if (i11 == 1) {
            return C8267l.d.f64419b;
        }
        if (i11 == 2) {
            return C8267l.d.f64420c;
        }
        if (i11 == 3) {
            return C8267l.d.f64421d;
        }
        if (i11 == 4) {
            return C8267l.d.f64422e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
