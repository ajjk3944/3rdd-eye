package ma;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: MonthDay.java */
/* loaded from: classes3.dex */
public final class i extends I9.g implements qa.f, Comparable<i>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44117d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f44118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44119c;

    /* compiled from: MonthDay.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44120a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44120a = iArr;
            try {
                iArr[qa.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44120a[qa.a.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        oa.b bVar = new oa.b();
        bVar.d("--");
        bVar.h(qa.a.MONTH_OF_YEAR, 2);
        bVar.c('-');
        bVar.h(qa.a.DAY_OF_MONTH, 2);
        bVar.l(Locale.getDefault());
    }

    public i(int i, int i10) {
        this.f44118b = i;
        this.f44119c = i10;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 64, this);
    }

    @Override // qa.f
    public final qa.d adjustInto(qa.d dVar) {
        if (!na.g.f(dVar).equals(na.l.f44466d)) {
            throw new ma.a("Adjustment only supported on ISO date-time");
        }
        qa.d dVarP0 = dVar.r0(this.f44118b, qa.a.MONTH_OF_YEAR);
        qa.a aVar = qa.a.DAY_OF_MONTH;
        return dVarP0.r0(Math.min(dVarP0.range(aVar).f45485e, this.f44119c), aVar);
    }

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        i iVar2 = iVar;
        int i = this.f44118b - iVar2.f44118b;
        return i == 0 ? this.f44119c - iVar2.f44119c : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f44118b == iVar.f44118b && this.f44119c == iVar.f44119c) {
                return true;
            }
        }
        return false;
    }

    @Override // I9.g, qa.e
    public final int get(qa.h hVar) {
        return range(hVar).a(getLong(hVar), hVar);
    }

    @Override // qa.e
    public final long getLong(qa.h hVar) {
        int i;
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i10 = a.f44120a[((qa.a) hVar).ordinal()];
        if (i10 == 1) {
            i = this.f44119c;
        } else {
            if (i10 != 2) {
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
            }
            i = this.f44118b;
        }
        return i;
    }

    public final int hashCode() {
        return (this.f44118b << 6) + this.f44119c;
    }

    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.MONTH_OF_YEAR || hVar == qa.a.DAY_OF_MONTH : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        return jVar == qa.i.f45476b ? (R) na.l.f44466d : (R) super.query(jVar);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        if (hVar == qa.a.MONTH_OF_YEAR) {
            return hVar.range();
        }
        if (hVar != qa.a.DAY_OF_MONTH) {
            return super.range(hVar);
        }
        int i = this.f44118b;
        return qa.m.d(1L, 1L, h.of(i).minLength(), h.of(i).maxLength());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.f44118b;
        sb.append(i < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
        sb.append(i);
        int i10 = this.f44119c;
        sb.append(i10 < 10 ? "-0" : "-");
        sb.append(i10);
        return sb.toString();
    }
}
