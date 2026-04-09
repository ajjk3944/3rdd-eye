package com.singular.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.singular.sdk.internal.GeneralHttpServiceBase;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SLSingularDeviceIdentifier {
    private static final SingularLog logger = SingularLog.getLogger("SLSingularDeviceIdentifier");
    private String sdidValue;

    public boolean exists() {
        return !Utils.isEmptyOrNull(this.sdidValue);
    }

    public String getValue() {
        return this.sdidValue;
    }

    public void loadSdidFromPrefs(Context context) {
        this.sdidValue = context.getSharedPreferences(Constants.PREF_SESSION, 0).getString(Constants.PREF_SINGULAR_DEVICE_ID_KEY, null);
    }

    public void saveSdidToPrefs(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_SESSION, 0).edit();
        editorEdit.putString(Constants.PREF_SINGULAR_DEVICE_ID_KEY, str);
        editorEdit.commit();
    }

    public void sendResolveRequestIfNeeded(DeviceInfo deviceInfo, final Context context) {
        if (exists()) {
            return;
        }
        new GeneralHttpService().sendSynchronousRequest("/resolve", new SingularParamsBase().withDeviceInfo(deviceInfo), null, new GeneralHttpServiceBase.CompletionHandler() { // from class: com.singular.sdk.internal.SLSingularDeviceIdentifier.1
            @Override // com.singular.sdk.internal.GeneralHttpServiceBase.CompletionHandler
            public void onFailure(String str) {
                SLSingularDeviceIdentifier.logger.error("failed to /resolve SDID with error: %s", str);
            }

            @Override // com.singular.sdk.internal.GeneralHttpServiceBase.CompletionHandler
            public void onSuccess(String str, int i) throws JSONException {
                if (i != 200 || Utils.isEmptyOrNull(str)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has(Constants.SDID_KEY)) {
                        SLSingularDeviceIdentifier.logger.debug("SDID not found in response");
                        return;
                    }
                    String string = jSONObject.getString(Constants.SDID_KEY);
                    if (Utils.isEmptyOrNull(string)) {
                        return;
                    }
                    SLSingularDeviceIdentifier.logger.debug("SDID resolved successfully: %s", string);
                    SLSingularDeviceIdentifier.this.saveSdidToPrefs(context, string);
                    SLSingularDeviceIdentifier.this.loadSdidFromPrefs(context);
                } catch (JSONException e4) {
                    SLSingularDeviceIdentifier.logger.error("failed to resolve SDID with error: %s", Utils.formatException(e4));
                }
            }
        });
    }
}
