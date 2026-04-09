package l5;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f14767a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14768b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14769c;

    public u(String str, boolean z10, boolean z11) {
        this.f14767a = str;
        this.f14768b = z10;
        this.f14769c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != u.class) {
            return false;
        }
        u uVar = (u) obj;
        return TextUtils.equals(this.f14767a, uVar.f14767a) && this.f14768b == uVar.f14768b && this.f14769c == uVar.f14769c;
    }

    public final int hashCode() {
        return ((c7.a.g(this.f14767a, 31, 31) + (this.f14768b ? 1231 : 1237)) * 31) + (this.f14769c ? 1231 : 1237);
    }
}
