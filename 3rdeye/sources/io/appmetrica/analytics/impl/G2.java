package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

@DoNotInline
@TargetApi(28)
/* loaded from: classes3.dex */
public final class G2 {

    /* renamed from: a, reason: collision with root package name */
    public static final G2 f39470a = new G2();

    private G2() {
    }

    public static final J2 a(Context context, C4679i2 c4679i2) {
        return new J2((I2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new D7.c(c4679i2, 15)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new N7.H7(29)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I2 a(C4679i2 c4679i2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c4679i2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return I2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return I2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return I2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return I2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return I2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return I2.RARE;
        }
        return I2.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
