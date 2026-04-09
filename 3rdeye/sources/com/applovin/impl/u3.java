package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes.dex */
public class u3 {

    /* renamed from: a, reason: collision with root package name */
    private final View f21537a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21538b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21539c;

    public u3(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21537a = view;
        this.f21538b = friendlyObstructionPurpose;
        this.f21539c = str;
    }

    public String a() {
        return this.f21539c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21538b;
    }

    public View c() {
        return this.f21537a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u3 u3Var = (u3) obj;
            View view = this.f21537a;
            if (view == null ? u3Var.f21537a != null : !view.equals(u3Var.f21537a)) {
                return false;
            }
            if (this.f21538b != u3Var.f21538b) {
                return false;
            }
            String str = this.f21539c;
            String str2 = u3Var.f21539c;
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
        View view = this.f21537a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f21538b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f21539c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
