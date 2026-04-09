package com.vungle.ads.internal.model;

import androidx.privacysandbox.ads.adservices.topics.a;
import com.vungle.ads.internal.b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes3.dex */
public final class AdAsset {

    @NotNull
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;

    @NotNull
    private final String localPath;

    @NotNull
    private String mimeType;

    @Nullable
    private final Integer percentage;

    @Nullable
    private Long rangeEnd;
    private long rangeStart;

    @NotNull
    private final String serverPath;

    @NotNull
    private Status status;

    @NotNull
    private final Object waitLock;

    @NotNull
    private final AtomicBoolean waitingForDownload;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset$Status;", "", "(Ljava/lang/String;I)V", "NEW", "DOWNLOAD_RUNNING", "DOWNLOAD_FAILED", "DOWNLOAD_SUCCESS", "PROCESSED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(@NotNull String adIdentifier, @NotNull String serverPath, @NotNull String localPath, boolean z10, @Nullable Integer num) {
        p.e(adIdentifier, "adIdentifier");
        p.e(serverPath, "serverPath");
        p.e(localPath, "localPath");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.isRequired = z10;
        this.percentage = num;
        this.status = Status.NEW;
        this.mimeType = "application/octet-stream";
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.a(AdAsset.class, obj.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) obj;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && p.a(this.adIdentifier, adAsset.adIdentifier) && p.a(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && p.a(this.percentage, adAsset.percentage)) {
            return p.a(this.localPath, adAsset.localPath);
        }
        return false;
    }

    @NotNull
    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final Integer getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    @NotNull
    public final String getServerPath() {
        return this.serverPath;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31;
        long j10 = this.fileSize;
        int iA = (((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + a.a(this.isRequired)) * 31;
        long j11 = this.contentLength;
        int i10 = (iA + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isHtmlTemplate() {
        return p.a(this.adIdentifier, q7.a.KEY_VM);
    }

    public final boolean isMainVideo() {
        return p.a(this.adIdentifier, b.KEY_MAIN_VIDEO);
    }

    public final boolean isPrivacyIcon() {
        return p.a(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
                s sVar = s.f25199a;
            }
        }
    }

    public final void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public final void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public final void setMimeType(@NotNull String str) {
        p.e(str, "<set-?>");
        this.mimeType = str;
    }

    public final void setRangeEnd(@Nullable Long l10) {
        this.rangeEnd = l10;
    }

    public final void setRangeStart(long j10) {
        this.rangeStart = j10;
    }

    public final void setStatus(@NotNull Status status) {
        p.e(status, "<set-?>");
        this.status = status;
    }

    @NotNull
    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0022, B:10:0x0028, B:7:0x0018, B:4:0x0009), top: B:18:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void waitForDownload() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.waitingForDownload
            r1 = 1
            r0.set(r1)
            java.lang.Object r0 = r6.waitLock
            monitor-enter(r0)
            kotlin.Result$a r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r6.waitLock     // Catch: java.lang.Throwable -> L17
            r1.wait()     // Catch: java.lang.Throwable -> L17
            y8.s r1 = y8.s.f25199a     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = kotlin.Result.b(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            kotlin.Result$a r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = kotlin.c.a(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = kotlin.Result.b(r1)     // Catch: java.lang.Throwable -> L41
        L22:
            java.lang.Throwable r1 = kotlin.Result.e(r1)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L43
            com.vungle.ads.internal.util.p$a r2 = com.vungle.ads.internal.util.p.Companion     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "AdAsset"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "Interrupted while waiting for file download: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L41
            r4.append(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L41
            r2.e(r3, r4, r1)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r1 = move-exception
            goto L45
        L43:
            monitor-exit(r0)
            return
        L45:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.AdAsset.waitForDownload():void");
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z10, Integer num, int i10, i iVar) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : num);
    }
}
