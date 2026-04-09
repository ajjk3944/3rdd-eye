package x9;

import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final q f25209a;

    /* renamed from: b, reason: collision with root package name */
    public final Format f25210b;

    public w(q qVar, Format format) {
        this.f25209a = qVar;
        this.f25210b = format;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            Format format = wVar.f25210b;
            if (!this.f25209a.equals(wVar.f25209a)) {
                return false;
            }
            Format format2 = this.f25210b;
            if (format2 != null) {
                return format2.equals(format);
            }
            if (format == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f25209a.hashCode() * 31;
        Format format = this.f25210b;
        return iHashCode + (format != null ? format.hashCode() : 0);
    }
}
