package com.vungle.ads.internal.load;

import a6.C1656e;
import a6.C1661j;
import com.vungle.ads.i0;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* compiled from: AdRequest.kt */
/* loaded from: classes2.dex */
public final class b implements Serializable {
    private final C1656e adMarkup;
    private final C1661j placement;
    private final i0 requestAdSize;

    public b(C1661j placement, C1656e c1656e, i0 i0Var) {
        l.f(placement, "placement");
        this.placement = placement;
        this.adMarkup = c1656e;
        this.requestAdSize = i0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class.equals(obj.getClass())) {
            b bVar = (b) obj;
            if (!l.b(this.placement.getReferenceId(), bVar.placement.getReferenceId()) || !l.b(this.requestAdSize, bVar.requestAdSize)) {
                return false;
            }
            C1656e c1656e = this.adMarkup;
            C1656e c1656e2 = bVar.adMarkup;
            if (c1656e != null) {
                return l.b(c1656e, c1656e2);
            }
            if (c1656e2 == null) {
                return true;
            }
        }
        return false;
    }

    public final C1656e getAdMarkup() {
        return this.adMarkup;
    }

    public final C1661j getPlacement() {
        return this.placement;
    }

    public final i0 getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int iHashCode = this.placement.getReferenceId().hashCode() * 31;
        i0 i0Var = this.requestAdSize;
        int iHashCode2 = (iHashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
        C1656e c1656e = this.adMarkup;
        return iHashCode2 + (c1656e != null ? c1656e.hashCode() : 0);
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + '}';
    }
}
