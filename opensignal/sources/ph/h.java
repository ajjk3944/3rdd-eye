package ph;

import android.util.Pair;
import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class h implements oh.l {

    /* renamed from: a, reason: collision with root package name */
    public final Format f20571a;

    public h(Format format) {
        this.f20571a = format;
    }

    @Override // oh.l
    public final Integer c() {
        Format format = this.f20571a;
        if (format != null) {
            return Integer.valueOf(format.N);
        }
        return null;
    }

    @Override // oh.l
    public final String e() {
        Format format = this.f20571a;
        if (format != null) {
            return format.E;
        }
        return null;
    }

    @Override // oh.l
    public final String f() {
        Format format = this.f20571a;
        if (format != null) {
            return format.G;
        }
        return null;
    }

    @Override // oh.l
    public final Float g() {
        Format format = this.f20571a;
        if (format != null) {
            return Float.valueOf(format.Q);
        }
        return null;
    }

    @Override // oh.l
    public final Integer i() {
        Format format = this.f20571a;
        if (format != null) {
            return Integer.valueOf(format.M);
        }
        return null;
    }

    @Override // oh.l
    public final oh.k k() {
        Pair pairC;
        Format format = this.f20571a;
        if (format == null || (pairC = oa.k.c(format)) == null) {
            return null;
        }
        Object obj = pairC.first;
        br.l.d(obj, "first");
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = pairC.second;
        br.l.d(obj2, "second");
        return new oh.k(iIntValue, ((Number) obj2).intValue());
    }

    @Override // oh.l
    public final Integer l() {
        Format format = this.f20571a;
        if (format != null) {
            return Integer.valueOf(format.V);
        }
        return null;
    }

    @Override // oh.l
    public final Float n() {
        Format format = this.f20571a;
        if (format != null) {
            return Float.valueOf(format.O);
        }
        return null;
    }

    @Override // oh.l
    public final Integer t() {
        Format format = this.f20571a;
        if (format != null) {
            return Integer.valueOf(format.D);
        }
        return null;
    }

    @Override // oh.l
    public final String u() {
        Format format = this.f20571a;
        if (format != null) {
            return format.H;
        }
        return null;
    }
}
