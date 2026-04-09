package com.unity3d.ads.core.log;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/log/UnityLogger;", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "()V", "", "targetLogLevel", "", "canLog", "(I)Z", "", PglCryptUtils.KEY_MESSAGE, "Ly8/s;", "info", "(Ljava/lang/String;)V", "debug", "", "e", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "trace", "Lcom/unity3d/ads/core/log/LogLevel;", "logLevel", "Lcom/unity3d/ads/core/log/LogLevel;", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevel;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevel;)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnityLogger implements Logger {

    @NotNull
    private static final String LOG_TAG = "UnityAds";

    @NotNull
    private LogLevel logLevel = LogLevel.INFO;

    private final boolean canLog(int targetLogLevel) {
        return Log.isLoggable(LOG_TAG, targetLogLevel) && targetLogLevel >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull String message) {
        p.e(message, "message");
        if (canLog(3)) {
            Log.d(LOG_TAG, message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(@NotNull String message, @Nullable Throwable e10) {
        p.e(message, "message");
        if (canLog(6)) {
            Log.e(LOG_TAG, message, e10);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    @NotNull
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(@NotNull String message) {
        p.e(message, "message");
        if (canLog(4)) {
            Log.i(LOG_TAG, message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(@NotNull LogLevel logLevel) {
        p.e(logLevel, "<set-?>");
        this.logLevel = logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull String message, @Nullable Throwable e10) {
        p.e(message, "message");
        if (canLog(2)) {
            Log.v(LOG_TAG, message, e10);
        }
    }
}
