package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v {

    @NotNull
    public static final v INSTANCE = new v();

    @NotNull
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    @Nullable
    private static Executor uiExecutor;

    private v() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-0, reason: not valid java name */
    public static final void m386runOnUiThread$lambda0(l9.a tmp0) {
        kotlin.jvm.internal.p.e(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runOnUiThread$lambda-1, reason: not valid java name */
    public static final void m387runOnUiThread$lambda1(l9.a tmp0) {
        kotlin.jvm.internal.p.e(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Nullable
    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }

    public final void runOnUiThread(@NotNull final l9.a block) {
        kotlin.jvm.internal.p.e(block, "block");
        if (isMainThread()) {
            block.invoke();
            return;
        }
        Executor executor = uiExecutor;
        if (executor == null) {
            UI_HANDLER.post(new Runnable() { // from class: com.vungle.ads.internal.util.u
                @Override // java.lang.Runnable
                public final void run() {
                    v.m387runOnUiThread$lambda1(block);
                }
            });
        } else if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.t
                @Override // java.lang.Runnable
                public final void run() {
                    v.m386runOnUiThread$lambda0(block);
                }
            });
        }
    }

    public final void setUiExecutor$vungle_ads_release(@Nullable Executor executor) {
        uiExecutor = executor;
    }
}
