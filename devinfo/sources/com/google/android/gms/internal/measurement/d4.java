package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19659a;

    /* renamed from: b, reason: collision with root package name */
    public final td.d f19660b;

    public d4(Context context, td.d dVar) {
        this.f19659a = context;
        this.f19660b = dVar;
    }

    public final boolean equals(Object obj) {
        td.d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d4) {
            d4 d4Var = (d4) obj;
            td.d dVar2 = d4Var.f19660b;
            if (this.f19659a.equals(d4Var.f19659a) && ((dVar = this.f19660b) != null ? dVar.equals(dVar2) : dVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f19659a.hashCode() ^ 1000003;
        td.d dVar = this.f19660b;
        return (iHashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        String string = this.f19659a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f19660b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        je.u.B(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
