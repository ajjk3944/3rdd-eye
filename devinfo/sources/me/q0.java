package me;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q0 extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f29283a;

    /* renamed from: b, reason: collision with root package name */
    public final List f29284b;

    /* renamed from: c, reason: collision with root package name */
    public final List f29285c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f29286d;

    /* renamed from: e, reason: collision with root package name */
    public final c2 f29287e;

    /* renamed from: f, reason: collision with root package name */
    public final List f29288f;
    public final int g;

    public q0(r0 r0Var, List list, List list2, Boolean bool, c2 c2Var, List list3, int i4) {
        this.f29283a = r0Var;
        this.f29284b = list;
        this.f29285c = list2;
        this.f29286d = bool;
        this.f29287e = c2Var;
        this.f29288f = list3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        q0 q0Var = (q0) ((d2) obj);
        List list = q0Var.f29288f;
        c2 c2Var = q0Var.f29287e;
        Boolean bool = q0Var.f29286d;
        List list2 = q0Var.f29285c;
        List list3 = q0Var.f29284b;
        if (!this.f29283a.equals(q0Var.f29283a)) {
            return false;
        }
        List list4 = this.f29284b;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.f29285c;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.f29286d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        c2 c2Var2 = this.f29287e;
        if (c2Var2 == null) {
            if (c2Var != null) {
                return false;
            }
        } else if (!c2Var2.equals(c2Var)) {
            return false;
        }
        List list6 = this.f29288f;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.g == q0Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.f29283a.hashCode() ^ 1000003) * 1000003;
        List list = this.f29284b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f29285c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f29286d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        c2 c2Var = this.f29287e;
        int iHashCode5 = (iHashCode4 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        List list3 = this.f29288f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f29283a);
        sb2.append(", customAttributes=");
        sb2.append(this.f29284b);
        sb2.append(", internalKeys=");
        sb2.append(this.f29285c);
        sb2.append(", background=");
        sb2.append(this.f29286d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f29287e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f29288f);
        sb2.append(", uiOrientation=");
        return r5.c.j(this.g, "}", sb2);
    }
}
