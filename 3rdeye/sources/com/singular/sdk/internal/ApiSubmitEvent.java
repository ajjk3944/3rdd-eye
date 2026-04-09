package com.singular.sdk.internal;

import androidx.work.s;
import com.singular.sdk.SingularConfig;
import com.singular.sdk.internal.Api;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ApiSubmitEvent extends BaseApi {
    private static final SingularLog logger = SingularLog.getLogger("ApiSubmitEvent");
    static final String path = "/event";

    public class OnEventSubmitCallback implements Api.OnApiCallback {
        public OnEventSubmitCallback() {
        }

        @Override // com.singular.sdk.internal.Api.OnApiCallback
        public boolean handle(SingularInstance singularInstance, int i, String str) {
            if (i == 413) {
                return true;
            }
            if (i != 200) {
                return false;
            }
            try {
            } catch (JSONException e4) {
                ApiSubmitEvent.logger.error("error in handle()", e4);
            }
            return new JSONObject(str).optString("status", "").equalsIgnoreCase("ok");
        }
    }

    public static class Params extends SingularParamsBase {
        private Params() {
        }

        public static Params build(RawEvent rawEvent, SingularInstance singularInstance) {
            return new Params().withName(rawEvent.name).withExtra(rawEvent.extra).withSecondsIntoSession((rawEvent.timestamp - r0) * 0.001d).withSession(singularInstance.getSessionManager().getSessionId()).withSequence(singularInstance.getSessionManager().getNextSequenceNumber()).withSingularConfig(singularInstance.getSingularConfig()).withDeviceInfo(singularInstance.getDeviceInfo());
        }

        private Params withExtra(String str) {
            try {
                if (Utils.isEmptyOrNull(str)) {
                    str = new JSONObject().put(Constants.IS_REVENUE_EVENT_KEY, false).toString();
                } else {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.optBoolean(Constants.IS_REVENUE_EVENT_KEY, false)) {
                        str = jSONObject.put(Constants.IS_REVENUE_EVENT_KEY, false).toString();
                    }
                }
                put(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, str);
                return this;
            } catch (JSONException e4) {
                ApiSubmitEvent.logger.error("Error in JSON serialization", e4);
                return this;
            }
        }

        private Params withName(String str) {
            put("n", str);
            return this;
        }

        private Params withSecondsIntoSession(double d10) {
            put("t", String.valueOf(d10));
            return this;
        }

        private Params withSequence(long j4) {
            put("seq", String.valueOf(j4));
            return this;
        }

        private Params withSession(long j4) {
            put("s", String.valueOf(j4));
            return this;
        }

        private Params withSingularConfig(SingularConfig singularConfig) {
            put("a", singularConfig.apiKey);
            return this;
        }

        @Override // com.singular.sdk.internal.SingularParamsBase
        public Params withDeviceInfo(DeviceInfo deviceInfo) {
            super.withDeviceInfo(deviceInfo);
            put("av", deviceInfo.appVersion);
            put("sdk", Utils.getSdkVersion());
            put(Constants.CUSTOM_USER_ID_KEY, deviceInfo.customUserId);
            return this;
        }
    }

    public static class RawEvent {
        final String extra;
        final String name;
        final long timestamp;

        public RawEvent(String str, String str2) {
            this.name = str.replace("\\n", "");
            this.extra = !Utils.isEmptyOrNull(str2) ? str2.replace("\\n", "") : null;
            this.timestamp = Utils.getCurrentTimeMillis();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RawEvent{name='");
            sb.append(this.name);
            sb.append("', extra='");
            sb.append(this.extra);
            sb.append("', timestamp=");
            return s.f(sb, this.timestamp, '}');
        }
    }

    public ApiSubmitEvent(long j4) {
        super(Constants.API_TYPE_EVENT, j4);
    }

    @Override // com.singular.sdk.internal.Api
    public Api.OnApiCallback getOnApiCallback() {
        return new OnEventSubmitCallback();
    }

    @Override // com.singular.sdk.internal.Api
    public String getPath() {
        return path;
    }

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ long getTimestamp() {
        return super.getTimestamp();
    }

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ String getType() {
        return super.getType();
    }

    @Override // com.singular.sdk.internal.BaseApi
    public /* bridge */ /* synthetic */ String getUrl() {
        return super.getUrl();
    }

    @Override // com.singular.sdk.internal.BaseApi
    public /* bridge */ /* synthetic */ boolean isAdmonEvent() {
        return super.isAdmonEvent();
    }

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ boolean makeRequest(SingularInstance singularInstance) throws IOException {
        return super.makeRequest(singularInstance);
    }

    @Override // com.singular.sdk.internal.BaseApi, com.singular.sdk.internal.Api
    public /* bridge */ /* synthetic */ String toJsonAsString() {
        return super.toJsonAsString();
    }
}
