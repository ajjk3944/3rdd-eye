package na;

import java.io.Serializable;
import na.b;

/* compiled from: ChronoDateImpl.java */
/* loaded from: classes3.dex */
public abstract class a<D extends b> extends b implements Serializable {

    /* compiled from: ChronoDateImpl.java */
    /* renamed from: na.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0503a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44424a;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44424a = iArr;
            try {
                iArr[qa.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44424a[qa.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44424a[qa.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44424a[qa.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44424a[qa.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44424a[qa.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44424a[qa.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // na.b
    public c<?> i0(ma.g gVar) {
        return new d(this, gVar);
    }

    @Override // na.b, qa.d
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public a<D> q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (a) k0().b(kVar.addTo(this, j4));
        }
        switch (C0503a.f44424a[((qa.b) kVar).ordinal()]) {
            case 1:
                return s0(j4);
            case 2:
                return s0(com.google.gson.internal.c.D(7, j4));
            case 3:
                return t0(j4);
            case 4:
                return u0(j4);
            case 5:
                return u0(com.google.gson.internal.c.D(10, j4));
            case 6:
                return u0(com.google.gson.internal.c.D(100, j4));
            case 7:
                return u0(com.google.gson.internal.c.D(1000, j4));
            default:
                throw new ma.a(kVar + " not valid for chronology " + k0().h());
        }
    }

    public abstract a<D> s0(long j4);

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        b bVarA = k0().a(dVar);
        return androidx.work.s.n(bVar) ? ma.e.t0(this).t(bVarA, bVar) : bVar.between(this, bVarA);
    }

    public abstract a<D> t0(long j4);

    public abstract a<D> u0(long j4);
}
