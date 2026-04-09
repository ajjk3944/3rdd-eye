package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;

/* loaded from: classes.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f20193a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxMediatedNetworkInfo f20194b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f20195c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20196d;

    /* renamed from: e, reason: collision with root package name */
    private final long f20197e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20198f;

    /* renamed from: g, reason: collision with root package name */
    private final MaxError f20199g;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20200a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f20200a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20200a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z10, long j4, String str, MaxError maxError) {
        this.f20193a = adLoadState;
        this.f20194b = maxMediatedNetworkInfo;
        this.f20195c = bundle;
        this.f20196d = z10;
        this.f20197e = j4;
        this.f20198f = str;
        this.f20199g = maxError;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MaxNetworkResponseInfoImpl)) {
            return false;
        }
        MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        Bundle credentials = getCredentials();
        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        String bCode = getBCode();
        String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        MaxError error = getError();
        MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f20193a;
    }

    public String getBCode() {
        return this.f20198f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f20195c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxError getError() {
        return this.f20199g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f20197e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f20194b;
    }

    public int hashCode() {
        int i = isBidding() ? 79 : 97;
        long latencyMillis = getLatencyMillis();
        int i10 = ((i + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int iHashCode = (i10 * 59) + (adLoadState == null ? 43 : adLoadState.hashCode());
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int iHashCode2 = (iHashCode * 59) + (mediatedNetwork == null ? 43 : mediatedNetwork.hashCode());
        Bundle credentials = getCredentials();
        int iHashCode3 = (iHashCode2 * 59) + (credentials == null ? 43 : credentials.hashCode());
        String bCode = getBCode();
        int iHashCode4 = (iHashCode3 * 59) + (bCode == null ? 43 : bCode.hashCode());
        MaxError error = getError();
        return (iHashCode4 * 59) + (error != null ? error.hashCode() : 43);
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f20196d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxResponseInfo{adLoadState=" + this.f20193a + ", mediatedNetwork=" + this.f20194b + ", credentials=" + this.f20195c + ", isBidding=" + this.f20196d);
        int i = a.f20200a[this.f20193a.ordinal()];
        if (i != 1) {
            if (i == 2) {
            }
            sb.append("}");
            return sb.toString();
        }
        sb.append(", error=");
        sb.append(this.f20199g);
        sb.append(", latencyMillis=");
        sb.append(this.f20197e);
        sb.append("}");
        return sb.toString();
    }
}
