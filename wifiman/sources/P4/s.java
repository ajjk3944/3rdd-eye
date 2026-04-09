package p4;

import A4.C2408l;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;
import p4.q;
import v4.AbstractC8191b;

/* loaded from: classes3.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final C4.a f57637a;

    /* renamed from: b, reason: collision with root package name */
    private static final v4.k f57638b;

    /* renamed from: c, reason: collision with root package name */
    private static final v4.j f57639c;

    /* renamed from: d, reason: collision with root package name */
    private static final v4.c f57640d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC8191b f57641e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57642a;

        static {
            int[] iArr = new int[A4.I.values().length];
            f57642a = iArr;
            try {
                iArr[A4.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57642a[A4.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57642a[A4.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57642a[A4.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4.a aVarE = v4.s.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f57637a = aVarE;
        f57638b = v4.k.a(new C7227j(), q.class, v4.p.class);
        f57639c = v4.j.a(new C7228k(), aVarE, v4.p.class);
        f57640d = v4.c.a(new l(), o.class, v4.o.class);
        f57641e = AbstractC8191b.a(new AbstractC8191b.InterfaceC2246b() { // from class: p4.r
            @Override // v4.AbstractC8191b.InterfaceC2246b
            public final AbstractC7072g a(v4.q qVar, o4.y yVar) {
                return s.b((v4.o) qVar, yVar);
            }
        }, aVarE, v4.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o b(v4.o oVar, o4.y yVar) throws GeneralSecurityException {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            C2408l c2408lZ = C2408l.Z(oVar.g(), C5088o.b());
            if (c2408lZ.X() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return o.a().e(q.a().c(c2408lZ.W().size()).b(12).d(16).e(e(oVar.e())).a()).d(C4.b.a(c2408lZ.W().N0(), o4.y.b(yVar))).c(oVar.c()).a();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(v4.i.a());
    }

    public static void d(v4.i iVar) {
        iVar.h(f57638b);
        iVar.g(f57639c);
        iVar.f(f57640d);
        iVar.e(f57641e);
    }

    private static q.c e(A4.I i10) throws GeneralSecurityException {
        int i11 = a.f57642a[i10.ordinal()];
        if (i11 == 1) {
            return q.c.f57633b;
        }
        if (i11 == 2 || i11 == 3) {
            return q.c.f57634c;
        }
        if (i11 == 4) {
            return q.c.f57635d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
