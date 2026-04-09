package com.zipoapps.premiumhelper.toto;

/* compiled from: TotoApiResponse.kt */
/* loaded from: classes3.dex */
public final class TotoApiResponseInfo {
    private final int responseCode;
    private final long responseTime;

    public TotoApiResponseInfo(int i, long j4) {
        this.responseCode = i;
        this.responseTime = j4;
    }

    public static /* synthetic */ TotoApiResponseInfo copy$default(TotoApiResponseInfo totoApiResponseInfo, int i, long j4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = totoApiResponseInfo.responseCode;
        }
        if ((i10 & 2) != 0) {
            j4 = totoApiResponseInfo.responseTime;
        }
        return totoApiResponseInfo.copy(i, j4);
    }

    public final int component1() {
        return this.responseCode;
    }

    public final long component2() {
        return this.responseTime;
    }

    public final TotoApiResponseInfo copy(int i, long j4) {
        return new TotoApiResponseInfo(i, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotoApiResponseInfo)) {
            return false;
        }
        TotoApiResponseInfo totoApiResponseInfo = (TotoApiResponseInfo) obj;
        return this.responseCode == totoApiResponseInfo.responseCode && this.responseTime == totoApiResponseInfo.responseTime;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final long getResponseTime() {
        return this.responseTime;
    }

    public int hashCode() {
        int i = this.responseCode * 31;
        long j4 = this.responseTime;
        return i + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "TotoApiResponseInfo(responseCode=" + this.responseCode + ", responseTime=" + this.responseTime + ")";
    }
}
