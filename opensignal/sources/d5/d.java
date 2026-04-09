package d5;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f6949a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.r f6950b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.r f6951c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6952d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6953e;

    public d(String str, androidx.media3.common.r rVar, androidx.media3.common.r rVar2, int i10, int i11) {
        a5.a.e(i10 == 0 || i11 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f6949a = str;
        rVar.getClass();
        this.f6950b = rVar;
        rVar2.getClass();
        this.f6951c = rVar2;
        this.f6952d = i10;
        this.f6953e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f6952d == dVar.f6952d && this.f6953e == dVar.f6953e && this.f6949a.equals(dVar.f6949a) && this.f6950b.equals(dVar.f6950b) && this.f6951c.equals(dVar.f6951c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6951c.hashCode() + ((this.f6950b.hashCode() + c7.a.g(this.f6949a, (((527 + this.f6952d) * 31) + this.f6953e) * 31, 31)) * 31);
    }
}
