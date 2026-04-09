package com.vungle.ads.internal.downloader;

import N7.B8;
import a6.C1652a;
import a6.C1653b;
import com.vungle.ads.C4055m;
import com.vungle.ads.f0;
import com.vungle.ads.internal.g;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;

/* compiled from: DownloadRequest.kt */
/* loaded from: classes2.dex */
public final class c {
    private final C1652a asset;
    private final AtomicBoolean cancelled;
    private final String creativeId;
    private f0 downloadDuration;
    private final String eventId;
    private final String placementId;
    private final a priority;

    /* compiled from: DownloadRequest.kt */
    public enum a {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        a(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public c(a priority, C1652a asset, String str, String str2, String str3) {
        l.f(priority, "priority");
        l.f(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.placementId = str;
        this.creativeId = str2;
        this.eventId = str3;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final C1652a getAsset() {
        return this.asset;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: getPriority, reason: collision with other method in class */
    public final a m41getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isHtmlTemplate() {
        return l.b(this.asset.getAdIdentifier(), C1653b.KEY_VM);
    }

    public final boolean isMainVideo() {
        return l.b(this.asset.getAdIdentifier(), g.KEY_MAIN_VIDEO);
    }

    public final boolean isTemplate() {
        return this.asset.getFileType() == C1652a.EnumC0211a.ZIP || isHtmlTemplate();
    }

    public final void startRecord() {
        f0 f0Var = new f0(Sdk$SDKMetric.b.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = f0Var;
        f0Var.markStart();
    }

    public final void stopRecord() {
        f0 f0Var = this.downloadDuration;
        if (f0Var != null) {
            f0Var.markEnd();
            C4055m.INSTANCE.logMetric$vungle_ads_release(f0Var, this.placementId, this.creativeId, this.eventId, this.asset.getServerPath());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadRequest{, priority=");
        sb.append(this.priority);
        sb.append(", url='");
        sb.append(this.asset.getServerPath());
        sb.append("', path='");
        sb.append(this.asset.getLocalPath());
        sb.append("', cancelled=");
        sb.append(this.cancelled);
        sb.append(", placementId=");
        sb.append(this.placementId);
        sb.append(", creativeId=");
        sb.append(this.creativeId);
        sb.append(", eventId=");
        return B8.j(sb, this.eventId, '}');
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ c(a aVar, C1652a c1652a, String str, String str2, String str3, int i, kotlin.jvm.internal.g gVar) {
        this(aVar, c1652a, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
