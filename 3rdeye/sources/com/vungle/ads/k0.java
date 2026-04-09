package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import g0.C4356c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public abstract class k0 extends Exception {
    public static final int AD_ALREADY_FAILED = 206;
    public static final int AD_ALREADY_LOADED = 204;
    public static final int AD_CLOSED_MISSING_HEARTBEAT = 318;
    public static final int AD_CLOSED_TEMPLATE_ERROR = 317;
    public static final int AD_CONSUMED = 202;
    public static final int AD_EXPIRED = 304;
    public static final int AD_EXPIRED_ON_PLAY = 307;
    public static final int AD_FAILED_TO_DOWNLOAD = 10011;
    public static final int AD_HTML_FAILED_TO_LOAD = 310;
    public static final int AD_IS_LOADING = 203;
    public static final int AD_IS_PLAYING = 205;
    public static final int AD_LOAD_FAIL_RETRY_AFTER = 221;
    public static final int AD_MARKUP_INVALID = 10040;
    public static final int AD_NOT_LOADED = 210;
    public static final int AD_RENDER_NETWORK_ERROR = 10038;
    public static final int AD_RESPONSE_EMPTY = 215;
    public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE = 216;
    public static final int AD_RESPONSE_RETRY_AFTER = 220;
    public static final int AD_RESPONSE_TIMED_OUT = 217;
    public static final int AD_UNABLE_TO_PLAY = 10010;
    public static final int AD_WIN_NOTIFICATION_ERROR = 308;
    public static final int ALREADY_INITIALIZED = 4;
    public static final int ALREADY_PLAYING_ANOTHER_AD = 10015;
    public static final int API_FAILED_STATUS_CODE = 104;
    public static final int API_REQUEST_ERROR = 101;
    public static final int API_RESPONSE_DATA_ERROR = 102;
    public static final int API_RESPONSE_DECODE_ERROR = 103;
    public static final int ASSET_DOWNLOAD_ERROR = 10024;
    public static final int ASSET_FAILED_INSUFFICIENT_SPACE = 126;
    public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED = 127;
    public static final int ASSET_FAILED_STATUS_CODE = 117;
    public static final int ASSET_FAILED_TO_DELETE = 309;
    public static final int ASSET_REQUEST_ERROR = 112;
    public static final int ASSET_RESPONSE_DATA_ERROR = 113;
    public static final int ASSET_WRITE_ERROR = 114;
    public static final int BANNER_VIEW_INVALID_SIZE = 500;
    public static final int CONCURRENT_PLAYBACK_UNSUPPORTED = 400;
    public static final int CONFIGURATION_ERROR = 10003;
    public static final int CREATIVE_ERROR = 10041;
    public static final int CURRENTLY_INITIALIZING = 3;
    public static final a Companion = new a(null);
    public static final int DEEPLINK_OPEN_FAILED = 312;
    public static final int DEFAULT = 10000;
    public static final int EMPTY_TPAT_ERROR = 129;
    public static final int EVALUATE_JAVASCRIPT_FAILED = 313;
    private static final Map<Integer, String> EXCEPTION_CODE_TO_MESSAGE_MAP;
    public static final int GENERATE_JSON_DATA_ERROR = 316;
    public static final int GZIP_ENCODE_ERROR = 116;
    public static final int HEARTBEAT_ERROR = 10043;
    public static final int INVALID_ADS_ENDPOINT = 122;
    public static final int INVALID_ADUNIT_BID_PAYLOAD = 213;
    public static final int INVALID_AD_STATE = 10042;
    public static final int INVALID_APP_ID = 2;
    public static final int INVALID_ASSET_URL = 111;
    public static final int INVALID_BID_PAYLOAD = 208;
    public static final int INVALID_CONFIG_RESPONSE = 135;
    public static final int INVALID_CTA_URL = 110;
    public static final int INVALID_EVENT_ID_ERROR = 200;
    public static final int INVALID_GZIP_BID_PAYLOAD = 214;
    public static final int INVALID_IFA_STATUS = 302;
    public static final int INVALID_INDEX_URL = 115;
    public static final int INVALID_JSON_BID_PAYLOAD = 209;
    public static final int INVALID_LOG_ERROR_ENDPOINT = 124;
    public static final int INVALID_METRICS_ENDPOINT = 125;
    public static final int INVALID_PLACEMENT_ID = 201;
    public static final int INVALID_REQUEST_BUILDER_ERROR = 106;
    public static final int INVALID_RI_ENDPOINT = 123;
    public static final int INVALID_SIZE = 10028;
    public static final int INVALID_TEMPLATE_URL = 105;
    public static final int INVALID_TPAT_KEY = 128;
    public static final int INVALID_WATERFALL_PLACEMENT = 222;
    public static final int JSON_ENCODE_ERROR = 119;
    public static final int JSON_PARAMS_ENCODE_ERROR = 315;
    public static final int LINK_COMMAND_OPEN_FAILED = 314;
    public static final int MRAID_BRIDGE_ERROR = 305;
    public static final int MRAID_DOWNLOAD_JS_ERROR = 130;
    public static final int MRAID_ERROR = 301;
    public static final int MRAID_JS_CALL_EMPTY = 311;
    public static final int MRAID_JS_COPY_FAILED = 219;
    public static final int MRAID_JS_DOES_NOT_EXIST = 218;
    public static final int MRAID_JS_WRITE_FAILED = 131;
    public static final int NATIVE_ASSET_ERROR = 600;
    public static final int NETWORK_ERROR = 10020;
    public static final int NETWORK_PERMISSIONS_NOT_GRANTED = 10034;
    public static final int NETWORK_TIMEOUT = 10047;
    public static final int NETWORK_UNREACHABLE = 10033;
    public static final int NO_SERVE = 10001;
    public static final int NO_SPACE_TO_DOWNLOAD_ASSETS = 10019;
    public static final int OMSDK_COPY_ERROR = 2003;
    public static final int OMSDK_DOWNLOAD_JS_ERROR = 132;
    public static final int OMSDK_JS_WRITE_FAILED = 133;
    public static final int OUT_OF_MEMORY = 3001;
    public static final int PLACEMENT_AD_TYPE_MISMATCH = 207;
    public static final int PLACEMENT_NOT_FOUND = 10013;
    public static final int PLACEMENT_SLEEP = 212;
    public static final int PRIVACY_URL_ERROR = 136;
    public static final int PROTOBUF_SERIALIZATION_ERROR = 118;
    public static final int REACHABILITY_INITIALIZATION_FAILED = 2005;
    public static final int SDK_NOT_INITIALIZED = 6;
    public static final int SDK_VERSION_BELOW_REQUIRED_VERSION = 10035;
    public static final int SERVER_RETRY_ERROR = 10014;
    public static final int STORE_KIT_LOAD_ERROR = 2002;
    public static final int STORE_OVERLAY_LOAD_ERROR = 2004;
    public static final int STORE_REGION_CODE_ERROR = 134;
    public static final int TEMPLATE_UNZIP_ERROR = 109;
    public static final int TPAT_ERROR = 121;
    public static final int TPAT_RETRY_FAILED = 137;
    public static final int UNKNOWN_ERROR = 0;
    public static final int UNKNOWN_EXCEPTION_CODE = 10048;
    public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY = 2006;
    public static final int UNRECOGNIZED = -1;
    public static final int USER_AGENT_ERROR = 7;
    public static final int WEBVIEW_RENDER_UNRESPONSIVE = 10032;
    public static final int WEB_CRASH = 10031;
    public static final int WEB_VIEW_FAILED_NAVIGATION = 2001;
    public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE = 2000;
    private final int code;
    private String creativeId;
    private final String errorMessage;
    private String eventId;
    private final Sdk$SDKError.b loggableReason;
    private String placementId;

    /* compiled from: VungleError.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Sdk$SDKError.b codeToLoggableReason(int i) {
            Sdk$SDKError.b bVarForNumber = Sdk$SDKError.b.forNumber(i);
            kotlin.jvm.internal.l.e(bVarForNumber, "forNumber(errorCode)");
            return bVarForNumber;
        }

        public final String getLocalizedMessage(int i) {
            String str = (String) k0.EXCEPTION_CODE_TO_MESSAGE_MAP.get(Integer.valueOf(i));
            if (str == null) {
                new h0(C4356c.h(i, "No adequate description for exceptionCode=")).logErrorNoReturnValue$vungle_ads_release();
            }
            return str == null ? C4356c.h(i, "Unknown Exception Code: ") : str;
        }

        private a() {
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(10000, "");
        map.put(Integer.valueOf(CONFIGURATION_ERROR), "Configuration Error Occurred. Please check your appID and placementIDs, and try again when network connectivity is available.");
        map.put(10001, "No advertisements are available for your current bid. Please try again later.");
        map.put(0, "Unknown Error Occurred.");
        map.put(304, "The advertisement in the cache has expired and can no longer be played. Please load another ad");
        map.put(3, "There is already an ongoing operation for the action you requested. Please wait until the operation finished before starting another.");
        map.put(6, "Vungle is not initialized/no longer initialized. Please call Vungle.init() to reinitialize.");
        map.put(Integer.valueOf(AD_UNABLE_TO_PLAY), "Unable to play advertisement");
        map.put(Integer.valueOf(AD_FAILED_TO_DOWNLOAD), "Advertisement failed to download");
        map.put(Integer.valueOf(PLACEMENT_NOT_FOUND), "Placement is not valid");
        map.put(Integer.valueOf(SERVER_RETRY_ERROR), "Remote Server responded with http Retry-After, SDK will retry this request.");
        map.put(Integer.valueOf(ALREADY_PLAYING_ANOTHER_AD), "Vungle is already playing different ad.");
        map.put(Integer.valueOf(NO_SPACE_TO_DOWNLOAD_ASSETS), "There is not enough file system size on a device to download assets for an ad.");
        map.put(Integer.valueOf(NETWORK_ERROR), "Network error. Try again later");
        map.put(Integer.valueOf(ASSET_DOWNLOAD_ERROR), "Assets download failed.");
        map.put(Integer.valueOf(INVALID_SIZE), "Ad size is invalid");
        map.put(Integer.valueOf(WEB_CRASH), "Android web view has crashed");
        map.put(Integer.valueOf(WEBVIEW_RENDER_UNRESPONSIVE), "Android web view render became unresponsive, please clean-up your Webview process if any");
        map.put(Integer.valueOf(NETWORK_UNREACHABLE), "Network error. Please check if network is available and permission for network access is granted.");
        map.put(Integer.valueOf(NETWORK_PERMISSIONS_NOT_GRANTED), "Network permissions not granted. Please check manifest for android.permission.INTERNET and android.permission.ACCESS_NETWORK_STATE");
        map.put(Integer.valueOf(SDK_VERSION_BELOW_REQUIRED_VERSION), "The SDK minimum version should not be overridden. Will not work as expected.");
        map.put(Integer.valueOf(AD_RENDER_NETWORK_ERROR), "Ad rendering failed due to network connectivity issue");
        map.put(3001, "Out of memory");
        map.put(Integer.valueOf(AD_MARKUP_INVALID), "Invalid ad markup");
        map.put(Integer.valueOf(CREATIVE_ERROR), "Creative error occurred");
        map.put(Integer.valueOf(INVALID_AD_STATE), "Invalid ad state ");
        map.put(Integer.valueOf(HEARTBEAT_ERROR), "Heartbeat not received within a valid time window");
        map.put(2, "App id is invalid.");
        map.put(207, "Ad type does not match with placement type.");
        map.put(400, "Concurrent playback not supported");
        map.put(Integer.valueOf(NETWORK_TIMEOUT), "Request timeout.");
        map.put(137, "Pinging Tpat did not succeed during all allowed reries.");
        map.put(130, "Failed to download mraid js.");
        map.put(113, "Server returned an unexpected response object or failed to load the downloaded data.");
        map.put(222, "Placement header bidding type does not match with loadAd call.");
        map.put(136, "Failed to open privacy url");
        EXCEPTION_CODE_TO_MESSAGE_MAP = map;
    }

    public /* synthetic */ k0(Integer num, Sdk$SDKError.b bVar, String str, String str2, String str3, String str4, kotlin.jvm.internal.g gVar) {
        this(num, bVar, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d(obj, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        k0 k0Var = (k0) obj;
        return this.code == k0Var.code && this.loggableReason == k0Var.loggableReason && kotlin.jvm.internal.l.b(this.errorMessage, k0Var.errorMessage) && kotlin.jvm.internal.l.b(this.placementId, k0Var.placementId) && kotlin.jvm.internal.l.b(this.creativeId, k0Var.creativeId) && kotlin.jvm.internal.l.b(this.eventId, k0Var.eventId);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getEventId() {
        return this.eventId;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public final Sdk$SDKError.b getLoggableReason() {
        return this.loggableReason;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        int i = this.code * 31;
        Sdk$SDKError.b bVar = this.loggableReason;
        int iN = B4.g.n((i + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.errorMessage);
        String str = this.placementId;
        int iHashCode = (iN + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.creativeId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.eventId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final k0 logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        Sdk$SDKError.b bVar = this.loggableReason;
        if (bVar != null) {
            C4055m.INSTANCE.logError$vungle_ads_release(bVar, this.errorMessage, this.placementId, this.creativeId, this.eventId);
        }
    }

    public final void setCreativeId(String str) {
        this.creativeId = str;
    }

    public final k0 setCreativeId$vungle_ads_release(String str) {
        this.creativeId = str;
        return this;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final k0 setEventId$vungle_ads_release(String str) {
        this.eventId = str;
        return this;
    }

    public final void setPlacementId(String str) {
        this.placementId = str;
    }

    public final k0 setPlacementId$vungle_ads_release(String str) {
        this.placementId = str;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k0(Integer num, Sdk$SDKError.b bVar, String str, String str2, String str3, String str4, int i, kotlin.jvm.internal.g gVar) {
        Integer num2 = (i & 1) != 0 ? null : num;
        Sdk$SDKError.b bVar2 = (i & 2) != 0 ? null : bVar;
        String str5 = (i & 4) != 0 ? null : str;
        String str6 = (i & 8) != 0 ? null : str2;
        String str7 = (i & 16) != 0 ? null : str3;
        this(num2, bVar2, str5, str6, str7, (i & 32) == 0 ? str4 : null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private k0(Integer num, Sdk$SDKError.b bVar, String str, String str2, String str3, String str4) {
        String localizedMessage;
        int number;
        if (str == null) {
            localizedMessage = Companion.getLocalizedMessage(num != null ? num.intValue() : 10000);
        } else {
            localizedMessage = str;
        }
        super(localizedMessage);
        this.loggableReason = bVar;
        this.placementId = str2;
        this.creativeId = str3;
        this.eventId = str4;
        if (num != null) {
            number = num.intValue();
        } else {
            kotlin.jvm.internal.l.c(bVar);
            number = bVar.getNumber();
        }
        this.code = number;
        if (str == null) {
            str = Companion.getLocalizedMessage(num != null ? num.intValue() : 10000);
        }
        this.errorMessage = str;
    }
}
