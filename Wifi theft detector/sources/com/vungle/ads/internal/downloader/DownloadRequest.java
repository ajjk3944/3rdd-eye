package com.vungle.ads.internal.downloader;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.z;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class DownloadRequest {

    @NotNull
    private final AdAsset asset;

    @NotNull
    private final AtomicBoolean cancelled;

    @Nullable
    private z downloadTemplateDuration;

    @Nullable
    private final o logEntry;

    @Nullable
    private z partialDownloadDurationMetric;

    @NotNull
    private final Priority priority;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;II)V", "getPriority", "()I", "CRITICAL", "HIGHEST", "HIGH", "LOWEST", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Priority {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        Priority(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadRequest(@NotNull Priority priority, @NotNull AdAsset asset, @Nullable o oVar) {
        p.e(priority, "priority");
        p.e(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.logEntry = oVar;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    @NotNull
    public final AdAsset getAsset() {
        return this.asset;
    }

    @Nullable
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @NotNull
    /* renamed from: getPriority, reason: collision with other method in class */
    public final Priority m309getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final void startPartialDownloadRecord() {
        z zVar = new z(Sdk$SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.partialDownloadDurationMetric = zVar;
        zVar.markStart();
    }

    public final void startTemplateRecord() {
        z zVar = new z(Sdk$SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadTemplateDuration = zVar;
        zVar.markStart();
    }

    public final void stopPartialDownloadRecord() throws Throwable {
        z zVar = this.partialDownloadDurationMetric;
        if (zVar != null) {
            zVar.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(zVar, this.logEntry, "percentage=" + this.asset.getPercentage() + " url=" + this.asset.getServerPath());
        }
    }

    public final void stopTemplateRecord() throws Throwable {
        z zVar = this.downloadTemplateDuration;
        if (zVar != null) {
            zVar.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(zVar, this.logEntry, this.asset.getServerPath());
        }
    }

    @NotNull
    public String toString() {
        return "DownloadRequest{, priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + "', cancelled=" + this.cancelled + ", logEntry=" + this.logEntry + '}';
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ DownloadRequest(Priority priority, AdAsset adAsset, o oVar, int i10, i iVar) {
        this(priority, adAsset, (i10 & 4) != 0 ? null : oVar);
    }
}
