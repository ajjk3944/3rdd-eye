package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.b;
import androidx.work.l;
import androidx.work.r;
import androidx.work.s;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/work/BackgroundWorker;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;", "universalRequestWorkerData", "Ly8/s;", "invoke", "(Lcom/unity3d/ads/core/domain/work/UniversalRequestWorkerData;)V", "Landroidx/work/r;", "workManager", "Landroidx/work/r;", "getWorkManager", "()Landroidx/work/r;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackgroundWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundWorker.kt\ncom/unity3d/ads/core/domain/work/BackgroundWorker\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,34:1\n29#2:35\n*S KotlinDebug\n*F\n+ 1 BackgroundWorker.kt\ncom/unity3d/ads/core/domain/work/BackgroundWorker\n*L\n23#1:35\n*E\n"})
/* loaded from: classes3.dex */
public final class BackgroundWorker {

    @NotNull
    public static final String TAG = "UnityAdsBackgroundWorker";

    @NotNull
    private final r workManager;

    public BackgroundWorker(@NotNull Context applicationContext) {
        p.e(applicationContext, "applicationContext");
        r rVarD = r.d(applicationContext);
        p.d(rVarD, "getInstance(applicationContext)");
        this.workManager = rVarD;
    }

    @NotNull
    public final r getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        p.e(universalRequestWorkerData, "universalRequestWorkerData");
        b bVarA = new b.a().b(NetworkType.CONNECTED).a();
        p.d(bVarA, "Builder()\n            .s…TED)\n            .build()");
        p.j(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        s sVarB = ((l.a) ((l.a) ((l.a) new l.a(ListenableWorker.class).e(bVarA)).f(universalRequestWorkerData.invoke())).a(TAG)).b();
        p.d(sVarB, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
        getWorkManager().b((l) sVarB);
    }
}
