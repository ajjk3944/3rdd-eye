package com.singular.sdk.internal;

import com.singular.sdk.internal.ConfigManagerRepo;
import com.singular.sdk.internal.GeneralHttpServiceBase;
import com.singular.sdk.internal.SingularParamsBase;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigManagerRepoNetwork extends ConfigManagerRepo {
    private static final SingularLog logger = SingularLog.getLogger("ConfigManagerRepoNetwork");
    private GeneralHttpServiceBase httpService;

    private ConfigManagerRepoNetwork() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void waitAndRetry(final ConfigManagerRepo.CompletionHandler completionHandler, final int i, String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        if (i > 0) {
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new Runnable() { // from class: com.singular.sdk.internal.ConfigManagerRepoNetwork.1
                @Override // java.lang.Runnable
                public void run() {
                    ConfigManagerRepoNetwork.this.getConfig(completionHandler, i - 1);
                }
            }, 3000L, TimeUnit.MILLISECONDS);
        } else if (completionHandler != null) {
            completionHandler.onError();
        }
    }

    @Override // com.singular.sdk.internal.ConfigManagerRepo
    public void getConfig(ConfigManagerRepo.CompletionHandler completionHandler) {
        getConfig(completionHandler, 3);
    }

    public ConfigManagerRepoNetwork(GeneralHttpServiceBase generalHttpServiceBase) {
        this.httpService = generalHttpServiceBase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getConfig(final ConfigManagerRepo.CompletionHandler completionHandler, final int i) {
        HashMap map = new HashMap();
        map.put("sdk", Utils.getSdkVersion());
        DeviceInfo deviceInfo = SingularInstance.getInstance().getDeviceInfo();
        if (deviceInfo != null) {
            map.put(SingularParamsBase.Constants.PLATFORM_KEY, deviceInfo.platform);
            map.put("n", deviceInfo.appName);
            map.put(SingularParamsBase.Constants.PACKAGE_NAME_KEY, deviceInfo.packageName);
            map.put("v", deviceInfo.osVersion);
        }
        this.httpService.sendRequest("/config", map, null, new GeneralHttpServiceBase.CompletionHandler() { // from class: com.singular.sdk.internal.ConfigManagerRepoNetwork.2
            @Override // com.singular.sdk.internal.GeneralHttpServiceBase.CompletionHandler
            public void onFailure(String str) {
                ConfigManagerRepoNetwork.this.waitAndRetry(completionHandler, i, str);
            }

            @Override // com.singular.sdk.internal.GeneralHttpServiceBase.CompletionHandler
            public void onSuccess(String str, int i10) {
                if (i10 != 200 || str == null) {
                    ConfigManagerRepoNetwork.this.waitAndRetry(completionHandler, i, "get config failed with code = " + i10);
                    return;
                }
                try {
                    SLRemoteConfiguration sLRemoteConfigurationFromJson = SLRemoteConfiguration.fromJson(new JSONObject(str));
                    ConfigManagerRepo.CompletionHandler completionHandler2 = completionHandler;
                    if (completionHandler2 != null) {
                        completionHandler2.onCompleted(sLRemoteConfigurationFromJson);
                    }
                } catch (JSONException e4) {
                    ConfigManagerRepoNetwork.logger.error(Utils.formatException(e4));
                    ConfigManagerRepoNetwork.this.waitAndRetry(completionHandler, i, e4.getMessage());
                }
            }
        });
    }

    @Override // com.singular.sdk.internal.ConfigManagerRepo
    public void saveConfig(SLRemoteConfiguration sLRemoteConfiguration, ConfigManagerRepo.CompletionHandler completionHandler) {
    }
}
