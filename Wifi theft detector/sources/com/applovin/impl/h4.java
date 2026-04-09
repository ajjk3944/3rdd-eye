package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class h4 {

    /* renamed from: a, reason: collision with root package name */
    private final View f6129a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f6130b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6131c;

    public h4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f6129a = view;
        this.f6130b = friendlyObstructionPurpose;
        this.f6131c = str;
    }

    public String a() {
        return this.f6131c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f6130b;
    }

    public View c() {
        return this.f6129a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h4 h4Var = (h4) obj;
            View view = this.f6129a;
            if (view == null ? h4Var.f6129a != null : !view.equals(h4Var.f6129a)) {
                return false;
            }
            if (this.f6130b != h4Var.f6130b) {
                return false;
            }
            String str = this.f6131c;
            String str2 = h4Var.f6131c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f6129a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f6130b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f6131c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
