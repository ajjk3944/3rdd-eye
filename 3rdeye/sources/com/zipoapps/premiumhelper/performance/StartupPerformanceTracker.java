package com.zipoapps.premiumhelper.performance;

import B4.g;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.work.s;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import com.zipoapps.premiumhelper.e;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import t8.d;
import t8.e;

/* compiled from: StartupPerformanceTracker.kt */
/* loaded from: classes3.dex */
public final class StartupPerformanceTracker extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37057b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static StartupPerformanceTracker f37058c;

    /* renamed from: a, reason: collision with root package name */
    public StartupData f37059a;

    /* compiled from: StartupPerformanceTracker.kt */
    @Keep
    public static final class StartupData extends d {
        private long adManagerEndTimeStamp;
        private long adManagerStartTimestamp;
        private String adProvider;
        private long analyticsEndTimestamp;
        private long analyticsStartTimestamp;
        private long applicationStartTimestamp;
        private long interstitialTimeout;
        private boolean isLaunchedByUser;
        private boolean isSplashScreenShown;
        private long phEndTimestamp;
        private long phStartTimestamp;
        private long premiumHelperTimeout;
        private long purchasesEndTimestamp;
        private long purchasesStartTimestamp;
        private long remoteConfigEndTimestamp;
        private String remoteConfigResult;
        private long remoteConfigStartTimestamp;
        private long testyEndTimestamp;
        private long testyStartTimestamp;
        private boolean totoConfigCapped;
        private long totoConfigEndTimestamp;
        private String totoConfigResult;
        private long totoConfigStartTimestamp;

        public StartupData() {
            this(0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, null, null, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, 8388607, null);
        }

        public static /* synthetic */ StartupData copy$default(StartupData startupData, long j4, long j10, long j11, long j12, long j13, long j14, long j15, String str, long j16, long j17, long j18, long j19, String str2, String str3, long j20, long j21, long j22, long j23, long j24, long j25, boolean z10, boolean z11, boolean z12, int i, Object obj) {
            boolean z13;
            boolean z14;
            long j26;
            String str4;
            long j27;
            long j28;
            long j29;
            long j30;
            long j31;
            long j32;
            boolean z15;
            String str5;
            long j33;
            long j34;
            long j35;
            long j36;
            String str6;
            long j37;
            long j38;
            long j39;
            StartupData startupData2;
            long j40;
            long j41;
            long j42 = (i & 1) != 0 ? startupData.phStartTimestamp : j4;
            long j43 = (i & 2) != 0 ? startupData.adManagerStartTimestamp : j10;
            long j44 = (i & 4) != 0 ? startupData.adManagerEndTimeStamp : j11;
            long j45 = (i & 8) != 0 ? startupData.remoteConfigStartTimestamp : j12;
            long j46 = (i & 16) != 0 ? startupData.remoteConfigEndTimestamp : j13;
            long j47 = (i & 32) != 0 ? startupData.totoConfigStartTimestamp : j14;
            long j48 = (i & 64) != 0 ? startupData.totoConfigEndTimestamp : j15;
            long j49 = j42;
            String str7 = (i & 128) != 0 ? startupData.adProvider : str;
            long j50 = (i & 256) != 0 ? startupData.applicationStartTimestamp : j16;
            long j51 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? startupData.phEndTimestamp : j17;
            long j52 = (i & 1024) != 0 ? startupData.interstitialTimeout : j18;
            long j53 = (i & 2048) != 0 ? startupData.premiumHelperTimeout : j19;
            String str8 = (i & 4096) != 0 ? startupData.remoteConfigResult : str2;
            String str9 = (i & 8192) != 0 ? startupData.totoConfigResult : str3;
            String str10 = str8;
            long j54 = (i & 16384) != 0 ? startupData.analyticsStartTimestamp : j20;
            long j55 = (i & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0 ? startupData.analyticsEndTimestamp : j21;
            long j56 = (i & 65536) != 0 ? startupData.purchasesStartTimestamp : j22;
            long j57 = (i & 131072) != 0 ? startupData.purchasesEndTimestamp : j23;
            long j58 = (i & 262144) != 0 ? startupData.testyStartTimestamp : j24;
            long j59 = (i & 524288) != 0 ? startupData.testyEndTimestamp : j25;
            boolean z16 = (i & 1048576) != 0 ? startupData.totoConfigCapped : z10;
            boolean z17 = (i & 2097152) != 0 ? startupData.isSplashScreenShown : z11;
            if ((i & 4194304) != 0) {
                z14 = z16;
                z13 = startupData.isLaunchedByUser;
                str4 = str10;
                j27 = j54;
                j28 = j55;
                j29 = j56;
                j30 = j57;
                j31 = j58;
                j32 = j59;
                z15 = z17;
                str5 = str9;
                j34 = j46;
                j35 = j47;
                j36 = j48;
                str6 = str7;
                j37 = j50;
                j38 = j51;
                j39 = j52;
                j26 = j53;
                startupData2 = startupData;
                j40 = j43;
                j41 = j44;
                j33 = j45;
            } else {
                z13 = z12;
                z14 = z16;
                j26 = j53;
                str4 = str10;
                j27 = j54;
                j28 = j55;
                j29 = j56;
                j30 = j57;
                j31 = j58;
                j32 = j59;
                z15 = z17;
                str5 = str9;
                j33 = j45;
                j34 = j46;
                j35 = j47;
                j36 = j48;
                str6 = str7;
                j37 = j50;
                j38 = j51;
                j39 = j52;
                startupData2 = startupData;
                j40 = j43;
                j41 = j44;
            }
            return startupData2.copy(j49, j40, j41, j33, j34, j35, j36, str6, j37, j38, j39, j26, str4, str5, j27, j28, j29, j30, j31, j32, z14, z15, z13);
        }

        public final long component1() {
            return this.phStartTimestamp;
        }

        public final long component10() {
            return this.phEndTimestamp;
        }

        public final long component11() {
            return this.interstitialTimeout;
        }

        public final long component12() {
            return this.premiumHelperTimeout;
        }

        public final String component13() {
            return this.remoteConfigResult;
        }

        public final String component14() {
            return this.totoConfigResult;
        }

        public final long component15() {
            return this.analyticsStartTimestamp;
        }

        public final long component16() {
            return this.analyticsEndTimestamp;
        }

        public final long component17() {
            return this.purchasesStartTimestamp;
        }

        public final long component18() {
            return this.purchasesEndTimestamp;
        }

        public final long component19() {
            return this.testyStartTimestamp;
        }

        public final long component2() {
            return this.adManagerStartTimestamp;
        }

        public final long component20() {
            return this.testyEndTimestamp;
        }

        public final boolean component21() {
            return this.totoConfigCapped;
        }

        public final boolean component22() {
            return this.isSplashScreenShown;
        }

        public final boolean component23() {
            return this.isLaunchedByUser;
        }

        public final long component3() {
            return this.adManagerEndTimeStamp;
        }

        public final long component4() {
            return this.remoteConfigStartTimestamp;
        }

        public final long component5() {
            return this.remoteConfigEndTimestamp;
        }

        public final long component6() {
            return this.totoConfigStartTimestamp;
        }

        public final long component7() {
            return this.totoConfigEndTimestamp;
        }

        public final String component8() {
            return this.adProvider;
        }

        public final long component9() {
            return this.applicationStartTimestamp;
        }

        public final StartupData copy(long j4, long j10, long j11, long j12, long j13, long j14, long j15, String adProvider, long j16, long j17, long j18, long j19, String remoteConfigResult, String totoConfigResult, long j20, long j21, long j22, long j23, long j24, long j25, boolean z10, boolean z11, boolean z12) {
            l.f(adProvider, "adProvider");
            l.f(remoteConfigResult, "remoteConfigResult");
            l.f(totoConfigResult, "totoConfigResult");
            return new StartupData(j4, j10, j11, j12, j13, j14, j15, adProvider, j16, j17, j18, j19, remoteConfigResult, totoConfigResult, j20, j21, j22, j23, j24, j25, z10, z11, z12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartupData)) {
                return false;
            }
            StartupData startupData = (StartupData) obj;
            return this.phStartTimestamp == startupData.phStartTimestamp && this.adManagerStartTimestamp == startupData.adManagerStartTimestamp && this.adManagerEndTimeStamp == startupData.adManagerEndTimeStamp && this.remoteConfigStartTimestamp == startupData.remoteConfigStartTimestamp && this.remoteConfigEndTimestamp == startupData.remoteConfigEndTimestamp && this.totoConfigStartTimestamp == startupData.totoConfigStartTimestamp && this.totoConfigEndTimestamp == startupData.totoConfigEndTimestamp && l.b(this.adProvider, startupData.adProvider) && this.applicationStartTimestamp == startupData.applicationStartTimestamp && this.phEndTimestamp == startupData.phEndTimestamp && this.interstitialTimeout == startupData.interstitialTimeout && this.premiumHelperTimeout == startupData.premiumHelperTimeout && l.b(this.remoteConfigResult, startupData.remoteConfigResult) && l.b(this.totoConfigResult, startupData.totoConfigResult) && this.analyticsStartTimestamp == startupData.analyticsStartTimestamp && this.analyticsEndTimestamp == startupData.analyticsEndTimestamp && this.purchasesStartTimestamp == startupData.purchasesStartTimestamp && this.purchasesEndTimestamp == startupData.purchasesEndTimestamp && this.testyStartTimestamp == startupData.testyStartTimestamp && this.testyEndTimestamp == startupData.testyEndTimestamp && this.totoConfigCapped == startupData.totoConfigCapped && this.isSplashScreenShown == startupData.isSplashScreenShown && this.isLaunchedByUser == startupData.isLaunchedByUser;
        }

        public final long getAdManagerEndTimeStamp() {
            return this.adManagerEndTimeStamp;
        }

        public final long getAdManagerStartTimestamp() {
            return this.adManagerStartTimestamp;
        }

        public final String getAdProvider() {
            return this.adProvider;
        }

        public final long getAnalyticsEndTimestamp() {
            return this.analyticsEndTimestamp;
        }

        public final long getAnalyticsStartTimestamp() {
            return this.analyticsStartTimestamp;
        }

        public final long getApplicationStartTimestamp() {
            return this.applicationStartTimestamp;
        }

        public final long getInterstitialTimeout() {
            return this.interstitialTimeout;
        }

        public final long getPhEndTimestamp() {
            return this.phEndTimestamp;
        }

        public final long getPhStartTimestamp() {
            return this.phStartTimestamp;
        }

        public final long getPremiumHelperTimeout() {
            return this.premiumHelperTimeout;
        }

        public final long getPurchasesEndTimestamp() {
            return this.purchasesEndTimestamp;
        }

        public final long getPurchasesStartTimestamp() {
            return this.purchasesStartTimestamp;
        }

        public final long getRemoteConfigEndTimestamp() {
            return this.remoteConfigEndTimestamp;
        }

        public final String getRemoteConfigResult() {
            return this.remoteConfigResult;
        }

        public final long getRemoteConfigStartTimestamp() {
            return this.remoteConfigStartTimestamp;
        }

        public final long getTestyEndTimestamp() {
            return this.testyEndTimestamp;
        }

        public final long getTestyStartTimestamp() {
            return this.testyStartTimestamp;
        }

        public final boolean getTotoConfigCapped() {
            return this.totoConfigCapped;
        }

        public final long getTotoConfigEndTimestamp() {
            return this.totoConfigEndTimestamp;
        }

        public final String getTotoConfigResult() {
            return this.totoConfigResult;
        }

        public final long getTotoConfigStartTimestamp() {
            return this.totoConfigStartTimestamp;
        }

        public int hashCode() {
            long j4 = this.phStartTimestamp;
            long j10 = this.adManagerStartTimestamp;
            int i = ((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.adManagerEndTimeStamp;
            int i10 = (i + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.remoteConfigStartTimestamp;
            int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.remoteConfigEndTimestamp;
            int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.totoConfigStartTimestamp;
            int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.totoConfigEndTimestamp;
            int iN = g.n((i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31, 31, this.adProvider);
            long j16 = this.applicationStartTimestamp;
            int i14 = (iN + ((int) (j16 ^ (j16 >>> 32)))) * 31;
            long j17 = this.phEndTimestamp;
            int i15 = (i14 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
            long j18 = this.interstitialTimeout;
            int i16 = (i15 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
            long j19 = this.premiumHelperTimeout;
            int iN2 = g.n(g.n((i16 + ((int) (j19 ^ (j19 >>> 32)))) * 31, 31, this.remoteConfigResult), 31, this.totoConfigResult);
            long j20 = this.analyticsStartTimestamp;
            int i17 = (iN2 + ((int) (j20 ^ (j20 >>> 32)))) * 31;
            long j21 = this.analyticsEndTimestamp;
            int i18 = (i17 + ((int) (j21 ^ (j21 >>> 32)))) * 31;
            long j22 = this.purchasesStartTimestamp;
            int i19 = (i18 + ((int) (j22 ^ (j22 >>> 32)))) * 31;
            long j23 = this.purchasesEndTimestamp;
            int i20 = (i19 + ((int) (j23 ^ (j23 >>> 32)))) * 31;
            long j24 = this.testyStartTimestamp;
            int i21 = (i20 + ((int) (j24 ^ (j24 >>> 32)))) * 31;
            long j25 = this.testyEndTimestamp;
            return ((((((i21 + ((int) (j25 ^ (j25 >>> 32)))) * 31) + (this.totoConfigCapped ? 1231 : 1237)) * 31) + (this.isSplashScreenShown ? 1231 : 1237)) * 31) + (this.isLaunchedByUser ? 1231 : 1237);
        }

        public final boolean isCollectedDataValid() {
            return ((this.totoConfigEndTimestamp - this.totoConfigStartTimestamp == 0 && !this.totoConfigCapped) || this.phStartTimestamp == 0 || this.phEndTimestamp == 0 || this.adManagerStartTimestamp == 0 || this.adManagerEndTimeStamp == 0 || this.remoteConfigStartTimestamp == 0 || this.remoteConfigEndTimestamp == 0 || this.applicationStartTimestamp == 0 || this.analyticsStartTimestamp == 0 || this.analyticsEndTimestamp == 0 || this.purchasesStartTimestamp == 0 || this.purchasesEndTimestamp == 0 || System.currentTimeMillis() - this.applicationStartTimestamp > TimeUnit.MINUTES.toMillis(3L)) ? false : true;
        }

        public final boolean isLaunchedByUser() {
            return this.isLaunchedByUser;
        }

        public final boolean isSplashScreenShown() {
            return this.isSplashScreenShown;
        }

        public final void setAdManagerEndTimeStamp(long j4) {
            this.adManagerEndTimeStamp = j4;
        }

        public final void setAdManagerStartTimestamp(long j4) {
            this.adManagerStartTimestamp = j4;
        }

        public final void setAdProvider(String str) {
            l.f(str, "<set-?>");
            this.adProvider = str;
        }

        public final void setAnalyticsEndTimestamp(long j4) {
            this.analyticsEndTimestamp = j4;
        }

        public final void setAnalyticsStartTimestamp(long j4) {
            this.analyticsStartTimestamp = j4;
        }

        public final void setApplicationStartTimestamp(long j4) {
            this.applicationStartTimestamp = j4;
        }

        public final void setInterstitialTimeout(long j4) {
            this.interstitialTimeout = j4;
        }

        public final void setLaunchedByUser(boolean z10) {
            this.isLaunchedByUser = z10;
        }

        public final void setPhEndTimestamp(long j4) {
            this.phEndTimestamp = j4;
        }

        public final void setPhStartTimestamp(long j4) {
            this.phStartTimestamp = j4;
        }

        public final void setPremiumHelperTimeout(long j4) {
            this.premiumHelperTimeout = j4;
        }

        public final void setPurchasesEndTimestamp(long j4) {
            this.purchasesEndTimestamp = j4;
        }

        public final void setPurchasesStartTimestamp(long j4) {
            this.purchasesStartTimestamp = j4;
        }

        public final void setRemoteConfigEndTimestamp(long j4) {
            this.remoteConfigEndTimestamp = j4;
        }

        public final void setRemoteConfigResult(String str) {
            l.f(str, "<set-?>");
            this.remoteConfigResult = str;
        }

        public final void setRemoteConfigStartTimestamp(long j4) {
            this.remoteConfigStartTimestamp = j4;
        }

        public final void setSplashScreenShown(boolean z10) {
            this.isSplashScreenShown = z10;
        }

        public final void setTestyEndTimestamp(long j4) {
            this.testyEndTimestamp = j4;
        }

        public final void setTestyStartTimestamp(long j4) {
            this.testyStartTimestamp = j4;
        }

        public final void setTotoConfigCapped(boolean z10) {
            this.totoConfigCapped = z10;
        }

        public final void setTotoConfigEndTimestamp(long j4) {
            this.totoConfigEndTimestamp = j4;
        }

        public final void setTotoConfigResult(String str) {
            l.f(str, "<set-?>");
            this.totoConfigResult = str;
        }

        public final void setTotoConfigStartTimestamp(long j4) {
            this.totoConfigStartTimestamp = j4;
        }

        public final Bundle toBundle() {
            b9.l lVar;
            long jCalculateDuration;
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            l8.d<Boolean> PH_PREVENT_AD_FRAUD = i8.d.f38533M;
            l.e(PH_PREVENT_AD_FRAUD, "PH_PREVENT_AD_FRAUD");
            Boolean bool = (Boolean) eVarA.f37020j.h(PH_PREVENT_AD_FRAUD);
            b9.l lVar2 = new b9.l("premium_helper_time", Long.valueOf(calculateDuration(this.phEndTimestamp, this.phStartTimestamp)));
            b9.l lVar3 = new b9.l("total_loading_time", Long.valueOf(calculateDuration(jCurrentTimeMillis, this.applicationStartTimestamp)));
            b9.l lVar4 = new b9.l("premium_helper_version", "5.0.3");
            b9.l lVar5 = new b9.l("ads_provider", this.adProvider);
            b9.l lVar6 = new b9.l("ad_manager_time", Long.valueOf(calculateDuration(this.adManagerEndTimeStamp, this.adManagerStartTimestamp)));
            b9.l lVar7 = new b9.l("remote_config_time", Long.valueOf(calculateDuration(this.remoteConfigEndTimestamp, this.remoteConfigStartTimestamp)));
            b9.l lVar8 = new b9.l("toto_config_time", Long.valueOf(calculateDuration(this.totoConfigEndTimestamp, this.totoConfigStartTimestamp)));
            b9.l lVar9 = new b9.l("toto_config_capped", booleanToString(this.totoConfigCapped));
            b9.l lVar10 = new b9.l("premium_helper_timeout", Long.valueOf(this.premiumHelperTimeout));
            b9.l lVar11 = new b9.l("remote_config_result", this.remoteConfigResult);
            b9.l lVar12 = new b9.l("toto_config_result", this.totoConfigResult);
            if (bool.booleanValue()) {
                lVar = lVar2;
                jCalculateDuration = calculateDuration(jCurrentTimeMillis, this.phEndTimestamp);
            } else {
                lVar = lVar2;
                jCalculateDuration = 0;
            }
            return G0.d.a(lVar, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, new b9.l("wait_for_ad_time", Long.valueOf(jCalculateDuration)), new b9.l(i8.d.f38534N.f43924a, Long.valueOf(this.interstitialTimeout)), new b9.l(PH_PREVENT_AD_FRAUD.f43924a, booleanToString(bool.booleanValue())), new b9.l("blytics_time", Long.valueOf(calculateDuration(this.analyticsEndTimestamp, this.analyticsStartTimestamp))), new b9.l("get_active_purchases_time", Long.valueOf(calculateDuration(this.purchasesEndTimestamp, this.purchasesStartTimestamp))), new b9.l("launched_by_user", booleanToString(this.isLaunchedByUser)), new b9.l("consent_form_shown", Boolean.valueOf(e.a.a().f37034x.c().f10828e)));
        }

        public String toString() {
            long j4 = this.phStartTimestamp;
            long j10 = this.adManagerStartTimestamp;
            long j11 = this.adManagerEndTimeStamp;
            long j12 = this.remoteConfigStartTimestamp;
            long j13 = this.remoteConfigEndTimestamp;
            long j14 = this.totoConfigStartTimestamp;
            long j15 = this.totoConfigEndTimestamp;
            String str = this.adProvider;
            long j16 = this.applicationStartTimestamp;
            long j17 = this.phEndTimestamp;
            long j18 = this.interstitialTimeout;
            long j19 = this.premiumHelperTimeout;
            String str2 = this.remoteConfigResult;
            String str3 = this.totoConfigResult;
            long j20 = this.analyticsStartTimestamp;
            long j21 = this.analyticsEndTimestamp;
            long j22 = this.purchasesStartTimestamp;
            long j23 = this.purchasesEndTimestamp;
            long j24 = this.testyStartTimestamp;
            long j25 = this.testyEndTimestamp;
            boolean z10 = this.totoConfigCapped;
            boolean z11 = this.isSplashScreenShown;
            boolean z12 = this.isLaunchedByUser;
            StringBuilder sbJ = s.j("StartupData(phStartTimestamp=", ", adManagerStartTimestamp=", j4);
            sbJ.append(j10);
            sbJ.append(", adManagerEndTimeStamp=");
            sbJ.append(j11);
            sbJ.append(", remoteConfigStartTimestamp=");
            sbJ.append(j12);
            sbJ.append(", remoteConfigEndTimestamp=");
            sbJ.append(j13);
            sbJ.append(", totoConfigStartTimestamp=");
            sbJ.append(j14);
            sbJ.append(", totoConfigEndTimestamp=");
            sbJ.append(j15);
            sbJ.append(", adProvider=");
            sbJ.append(str);
            sbJ.append(", applicationStartTimestamp=");
            sbJ.append(j16);
            sbJ.append(", phEndTimestamp=");
            sbJ.append(j17);
            sbJ.append(", interstitialTimeout=");
            sbJ.append(j18);
            sbJ.append(", premiumHelperTimeout=");
            sbJ.append(j19);
            sbJ.append(", remoteConfigResult=");
            com.google.android.gms.measurement.internal.a.l(sbJ, str2, ", totoConfigResult=", str3, ", analyticsStartTimestamp=");
            sbJ.append(j20);
            sbJ.append(", analyticsEndTimestamp=");
            sbJ.append(j21);
            sbJ.append(", purchasesStartTimestamp=");
            sbJ.append(j22);
            sbJ.append(", purchasesEndTimestamp=");
            sbJ.append(j23);
            sbJ.append(", testyStartTimestamp=");
            sbJ.append(j24);
            sbJ.append(", testyEndTimestamp=");
            sbJ.append(j25);
            sbJ.append(", totoConfigCapped=");
            sbJ.append(z10);
            sbJ.append(", isSplashScreenShown=");
            sbJ.append(z11);
            sbJ.append(", isLaunchedByUser=");
            return s.h(sbJ, z12, ")");
        }

        public /* synthetic */ StartupData(long j4, long j10, long j11, long j12, long j13, long j14, long j15, String str, long j16, long j17, long j18, long j19, String str2, String str3, long j20, long j21, long j22, long j23, long j24, long j25, boolean z10, boolean z11, boolean z12, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? 0L : j4, (i & 2) != 0 ? 0L : j10, (i & 4) != 0 ? 0L : j11, (i & 8) != 0 ? 0L : j12, (i & 16) != 0 ? 0L : j13, (i & 32) != 0 ? 0L : j14, (i & 64) != 0 ? 0L : j15, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? 0L : j16, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 0L : j17, (i & 1024) != 0 ? 0L : j18, (i & 2048) != 0 ? 0L : j19, (i & 4096) != 0 ? "" : str2, (i & 8192) == 0 ? str3 : "", (i & 16384) != 0 ? 0L : j20, (32768 & i) != 0 ? 0L : j21, (65536 & i) != 0 ? 0L : j22, (131072 & i) != 0 ? 0L : j23, (262144 & i) != 0 ? 0L : j24, (524288 & i) != 0 ? 0L : j25, (1048576 & i) != 0 ? false : z10, (i & 2097152) != 0 ? false : z11, (i & 4194304) != 0 ? false : z12);
        }

        public StartupData(long j4, long j10, long j11, long j12, long j13, long j14, long j15, String adProvider, long j16, long j17, long j18, long j19, String remoteConfigResult, String totoConfigResult, long j20, long j21, long j22, long j23, long j24, long j25, boolean z10, boolean z11, boolean z12) {
            l.f(adProvider, "adProvider");
            l.f(remoteConfigResult, "remoteConfigResult");
            l.f(totoConfigResult, "totoConfigResult");
            this.phStartTimestamp = j4;
            this.adManagerStartTimestamp = j10;
            this.adManagerEndTimeStamp = j11;
            this.remoteConfigStartTimestamp = j12;
            this.remoteConfigEndTimestamp = j13;
            this.totoConfigStartTimestamp = j14;
            this.totoConfigEndTimestamp = j15;
            this.adProvider = adProvider;
            this.applicationStartTimestamp = j16;
            this.phEndTimestamp = j17;
            this.interstitialTimeout = j18;
            this.premiumHelperTimeout = j19;
            this.remoteConfigResult = remoteConfigResult;
            this.totoConfigResult = totoConfigResult;
            this.analyticsStartTimestamp = j20;
            this.analyticsEndTimestamp = j21;
            this.purchasesStartTimestamp = j22;
            this.purchasesEndTimestamp = j23;
            this.testyStartTimestamp = j24;
            this.testyEndTimestamp = j25;
            this.totoConfigCapped = z10;
            this.isSplashScreenShown = z11;
            this.isLaunchedByUser = z12;
        }
    }

    /* compiled from: StartupPerformanceTracker.kt */
    public static final class a {
        public static StartupPerformanceTracker a() {
            StartupPerformanceTracker startupPerformanceTracker = StartupPerformanceTracker.f37058c;
            if (startupPerformanceTracker != null) {
                return startupPerformanceTracker;
            }
            StartupPerformanceTracker startupPerformanceTracker2 = new StartupPerformanceTracker();
            StartupPerformanceTracker.f37058c = startupPerformanceTracker2;
            return startupPerformanceTracker2;
        }
    }

    public final void b(String totoResult) throws NumberFormatException {
        l.f(totoResult, "totoResult");
        if (!TextUtils.isDigitsOnly(totoResult)) {
            StartupData startupData = this.f37059a;
            if (startupData != null) {
                startupData.setTotoConfigResult(totoResult);
                return;
            }
            return;
        }
        try {
            int i = Integer.parseInt(totoResult);
            totoResult = i / 100 == 2 ? "success" : String.valueOf(i);
        } catch (NumberFormatException unused) {
        }
        StartupData startupData2 = this.f37059a;
        if (startupData2 != null) {
            startupData2.setTotoConfigResult(totoResult);
        }
    }
}
