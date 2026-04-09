package p4;

import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;
import p4.I;
import v4.AbstractC8191b;

/* loaded from: classes3.dex */
abstract class K {

    /* renamed from: a, reason: collision with root package name */
    private static final C4.a f57567a;

    /* renamed from: b, reason: collision with root package name */
    private static final v4.k f57568b;

    /* renamed from: c, reason: collision with root package name */
    private static final v4.j f57569c;

    /* renamed from: d, reason: collision with root package name */
    private static final v4.c f57570d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8191b f57571e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57572a;

        static {
            int[] iArr = new int[A4.I.values().length];
            f57572a = iArr;
            try {
                iArr[A4.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57572a[A4.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57572a[A4.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57572a[A4.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4.a aVarE = v4.s.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f57567a = aVarE;
        f57568b = v4.k.a(new C7227j(), I.class, v4.p.class);
        f57569c = v4.j.a(new C7228k(), aVarE, v4.p.class);
        f57570d = v4.c.a(new l(), G.class, v4.o.class);
        f57571e = AbstractC8191b.a(new AbstractC8191b.InterfaceC2246b() { // from class: p4.J
            @Override // v4.AbstractC8191b.InterfaceC2246b
            public final AbstractC7072g a(v4.q qVar, o4.y yVar) {
                return K.b((v4.o) qVar, yVar);
            }
        }, aVarE, v4.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static G b(v4.o oVar, o4.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            A4.K kZ = A4.K.Z(oVar.g(), C5088o.b());
            if (kZ.X() == 0) {
                return G.a(e(oVar.e()), C4.b.a(kZ.W().N0(), o4.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(v4.i.a());
    }

    public static void d(v4.i iVar) {
        iVar.h(f57568b);
        iVar.g(f57569c);
        iVar.f(f57570d);
        iVar.e(f57571e);
    }

    private static I.a e(A4.I i10) throws GeneralSecurityException {
        int i11 = a.f57572a[i10.ordinal()];
        if (i11 == 1) {
            return I.a.f57563b;
        }
        if (i11 == 2 || i11 == 3) {
            return I.a.f57564c;
        }
        if (i11 == 4) {
            return I.a.f57565d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
