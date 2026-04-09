package o4;

import A4.C;
import A4.D;
import A4.I;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.C5088o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o4.v;
import y4.C8610a;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final C f55283a;

    /* renamed from: b, reason: collision with root package name */
    private final List f55284b;

    /* renamed from: c, reason: collision with root package name */
    private final C8610a f55285c = C8610a.f66361b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55286a;

        static {
            int[] iArr = new int[A4.z.values().length];
            f55286a = iArr;
            try {
                iArr[A4.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55286a[A4.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55286a[A4.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC7072g f55287a;

        /* renamed from: b, reason: collision with root package name */
        private final k f55288b;

        /* renamed from: c, reason: collision with root package name */
        private final int f55289c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f55290d;

        /* synthetic */ b(AbstractC7072g abstractC7072g, k kVar, int i10, boolean z10, a aVar) {
            this(abstractC7072g, kVar, i10, z10);
        }

        public AbstractC7072g a() {
            return this.f55287a;
        }

        private b(AbstractC7072g abstractC7072g, k kVar, int i10, boolean z10) {
            this.f55287a = abstractC7072g;
            this.f55288b = kVar;
            this.f55289c = i10;
            this.f55290d = z10;
        }
    }

    private n(C c10, List list) {
        this.f55283a = c10;
        this.f55284b = list;
    }

    private static void a(A4.t tVar) throws GeneralSecurityException {
        if (tVar == null || tVar.W().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void b(C c10) throws GeneralSecurityException {
        if (c10 == null || c10.Z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static C c(A4.t tVar, InterfaceC7066a interfaceC7066a, byte[] bArr) throws GeneralSecurityException {
        try {
            C cE0 = C.e0(interfaceC7066a.b(tVar.W().N0(), bArr), C5088o.b());
            b(cE0);
            return cE0;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static A4.t d(C c10, InterfaceC7066a interfaceC7066a, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrA = interfaceC7066a.a(c10.toByteArray(), bArr);
        try {
            if (C.e0(interfaceC7066a.b(bArrA, bArr), C5088o.b()).equals(c10)) {
                return (A4.t) A4.t.X().t(AbstractC5081h.s(bArrA)).u(z.b(c10)).i();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final n e(C c10) throws GeneralSecurityException {
        b(c10);
        return new n(c10, f(c10));
    }

    private static List f(C c10) {
        ArrayList arrayList = new ArrayList(c10.Z());
        for (C.c cVar : c10.a0()) {
            int iZ = cVar.Z();
            try {
                arrayList.add(new b(v4.i.a().d(q(cVar), AbstractC7071f.a()), m(cVar.b0()), iZ, iZ == c10.b0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private Object g(AbstractC7072g abstractC7072g, Class cls) {
        try {
            return x.c(abstractC7072g, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static Object j(C.c cVar, Class cls) throws GeneralSecurityException {
        try {
            return x.e(cVar.Y(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private Object l(Class cls, Class cls2) throws GeneralSecurityException {
        z.d(this.f55283a);
        v.b bVarJ = v.j(cls2);
        bVarJ.e(this.f55285c);
        for (int i10 = 0; i10 < p(); i10++) {
            C.c cVarY = this.f55283a.Y(i10);
            if (cVarY.b0().equals(A4.z.ENABLED)) {
                Object objJ = j(cVarY, cls2);
                Object objG = this.f55284b.get(i10) != null ? g(((b) this.f55284b.get(i10)).a(), cls2) : null;
                if (cVarY.Z() == this.f55283a.b0()) {
                    bVarJ.b(objG, objJ, cVarY);
                } else {
                    bVarJ.a(objG, objJ, cVarY);
                }
            }
        }
        return x.o(bVarJ.d(), cls);
    }

    private static k m(A4.z zVar) throws GeneralSecurityException {
        int i10 = a.f55286a[zVar.ordinal()];
        if (i10 == 1) {
            return k.f55276b;
        }
        if (i10 == 2) {
            return k.f55277c;
        }
        if (i10 == 3) {
            return k.f55278d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final n n(p pVar, InterfaceC7066a interfaceC7066a) {
        return o(pVar, interfaceC7066a, new byte[0]);
    }

    public static final n o(p pVar, InterfaceC7066a interfaceC7066a, byte[] bArr) throws GeneralSecurityException {
        A4.t tVarA = pVar.a();
        a(tVarA);
        return e(c(tVarA, interfaceC7066a, bArr));
    }

    private static v4.o q(C.c cVar) {
        try {
            return v4.o.b(cVar.Y().Z(), cVar.Y().a0(), cVar.Y().Y(), cVar.a0(), cVar.a0() == I.RAW ? null : Integer.valueOf(cVar.Z()));
        } catch (GeneralSecurityException e10) {
            throw new TinkBugException("Creating a protokey serialization failed", e10);
        }
    }

    C h() {
        return this.f55283a;
    }

    public D i() {
        return z.b(this.f55283a);
    }

    public Object k(Class cls) throws GeneralSecurityException {
        Class clsD = x.d(cls);
        if (clsD != null) {
            return l(cls, clsD);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public int p() {
        return this.f55283a.Z();
    }

    public void r(q qVar, InterfaceC7066a interfaceC7066a) {
        s(qVar, interfaceC7066a, new byte[0]);
    }

    public void s(q qVar, InterfaceC7066a interfaceC7066a, byte[] bArr) {
        qVar.b(d(this.f55283a, interfaceC7066a, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
