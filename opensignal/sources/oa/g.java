package oa;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f19208a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19209b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19210c;

    public g(String str, boolean z10, boolean z11) {
        this.f19208a = str;
        this.f19209b = z10;
        this.f19210c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != g.class) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f19208a, gVar.f19208a) && this.f19209b == gVar.f19209b && this.f19210c == gVar.f19210c;
    }

    public final int hashCode() {
        return ((c7.a.g(this.f19208a, 31, 31) + (this.f19209b ? 1231 : 1237)) * 31) + (this.f19210c ? 1231 : 1237);
    }
}
