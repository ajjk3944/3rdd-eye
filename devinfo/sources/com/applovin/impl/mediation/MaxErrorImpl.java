package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxErrorImpl implements MaxError {
    private String adLoadFailureInfo;
    private final int errorCode;
    private final String errorMessage;
    private String loadTag;
    private final int mediatedNetworkErrorCode;
    private final String mediatedNetworkErrorMessage;
    private long requestLatencyMillis;
    private MaxAdWaterfallInfo waterfall;

    public MaxErrorImpl(int i4) {
        this(i4, "");
    }

    @Override // com.applovin.mediation.MaxError
    public String getAdLoadFailureInfo() {
        return this.adLoadFailureInfo;
    }

    @Override // com.applovin.mediation.MaxError
    public int getCode() {
        return this.errorCode;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getLoadTag() {
        return this.loadTag;
    }

    @Override // com.applovin.mediation.MaxError
    public int getMediatedNetworkErrorCode() {
        return this.mediatedNetworkErrorCode;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMediatedNetworkErrorMessage() {
        return this.mediatedNetworkErrorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public String getMessage() {
        return this.errorMessage;
    }

    @Override // com.applovin.mediation.MaxError
    public long getRequestLatencyMillis() {
        return this.requestLatencyMillis;
    }

    @Override // com.applovin.mediation.MaxError
    public MaxAdWaterfallInfo getWaterfall() {
        return this.waterfall;
    }

    public void setAdLoadFailureInfo(String str) {
        this.adLoadFailureInfo = str;
    }

    public void setLoadTag(String str) {
        this.loadTag = str;
    }

    public void setRequestLatencyMillis(long j) {
        this.requestLatencyMillis = j;
    }

    public void setWaterfall(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.waterfall = maxAdWaterfallInfo;
    }

    public String toString() {
        return "MaxError{code=" + getCode() + ", message=\"" + getMessage() + "\", mediatedNetworkErrorCode=" + getMediatedNetworkErrorCode() + ", mediatedNetworkErrorMessage=\"" + getMediatedNetworkErrorMessage() + "\"}";
    }

    public MaxErrorImpl(String str) {
        this(-1, str);
    }

    public MaxErrorImpl(int i4, String str) {
        this(i4, str, -1, "");
    }

    public MaxErrorImpl(int i4, String str, int i10, String str2) {
        this.errorCode = i4;
        this.errorMessage = StringUtils.emptyIfNull(str);
        this.mediatedNetworkErrorCode = i10;
        this.mediatedNetworkErrorMessage = StringUtils.emptyIfNull(str2);
    }
}
