package v4;

import A4.I;
import A4.y;
import java.security.GeneralSecurityException;
import o4.AbstractC7072g;

/* loaded from: classes3.dex */
public final class e extends AbstractC7072g {

    /* renamed from: a, reason: collision with root package name */
    private final o f63431a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63432a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f63433b;

        static {
            int[] iArr = new int[y.c.values().length];
            f63433b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63433b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[I.values().length];
            f63432a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63432a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63432a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63432a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(o oVar, o4.y yVar) throws GeneralSecurityException {
        a(oVar, yVar);
        this.f63431a = oVar;
    }

    private static void a(o oVar, o4.y yVar) throws GeneralSecurityException {
        int i10 = a.f63433b[oVar.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            o4.y.b(yVar);
        }
    }
}
