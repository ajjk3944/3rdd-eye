package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class RewardData implements Serializable {
    private static final long serialVersionUID = -6264212909606201882L;
    private String mCurrency;
    private int mQuantity;
    private String mUserID;

    public RewardData(String str, String str2) {
        this(str, str2, 0);
    }

    public String getCurrency() {
        return this.mCurrency;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public String getUserID() {
        return this.mUserID;
    }

    public RewardData(String str, String str2, int i4) {
        this.mUserID = str;
        this.mCurrency = str2;
        this.mQuantity = i4;
    }
}
