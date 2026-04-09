package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h4 {

    /* renamed from: a, reason: collision with root package name */
    private final View f4212a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f4213b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4214c;

    public h4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f4212a = view;
        this.f4213b = friendlyObstructionPurpose;
        this.f4214c = str;
    }

    public String a() {
        return this.f4214c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f4213b;
    }

    public View c() {
        return this.f4212a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h4 h4Var = (h4) obj;
            View view = this.f4212a;
            if (view == null ? h4Var.f4212a != null : !view.equals(h4Var.f4212a)) {
                return false;
            }
            if (this.f4213b != h4Var.f4213b) {
                return false;
            }
            String str = this.f4214c;
            String str2 = h4Var.f4214c;
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
        View view = this.f4212a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f4213b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f4214c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
