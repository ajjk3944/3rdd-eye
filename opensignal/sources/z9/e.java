package z9;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f26794a;

    /* renamed from: b, reason: collision with root package name */
    public final Format f26795b;

    /* renamed from: c, reason: collision with root package name */
    public final Format f26796c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26797d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26798e;

    public e(String str, Format format, Format format2, int i10, int i11) {
        qb.b.g(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f26794a = str;
        format.getClass();
        this.f26795b = format;
        format2.getClass();
        this.f26796c = format2;
        this.f26797d = i10;
        this.f26798e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f26797d == eVar.f26797d && this.f26798e == eVar.f26798e && this.f26794a.equals(eVar.f26794a) && this.f26795b.equals(eVar.f26795b) && this.f26796c.equals(eVar.f26796c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26796c.hashCode() + ((this.f26795b.hashCode() + c7.a.g(this.f26794a, (((527 + this.f26797d) * 31) + this.f26798e) * 31, 31)) * 31);
    }
}
