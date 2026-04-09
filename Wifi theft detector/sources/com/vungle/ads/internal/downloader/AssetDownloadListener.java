package com.vungle.ads.internal.downloader;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface AssetDownloadListener {

    public static final class DownloadError {

        @NotNull
        public static final a Companion = new a(null);
        public static final int DEFAULT_SERVER_CODE = -1;

        @NotNull
        private final Throwable cause;

        @ErrorReason
        private final int reason;
        private final int serverCode;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0086\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError$ErrorReason;", "", "<init>", "()V", "Companion", "a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ErrorReason {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            /* renamed from: com.vungle.ads.internal.downloader.AssetDownloadListener$DownloadError$ErrorReason$a, reason: from kotlin metadata */
            public static final class Companion {
                private static int CONNECTION_ERROR;
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int REQUEST_ERROR = 1;
                private static int DISK_ERROR = 2;
                private static int FILE_NOT_FOUND_ERROR = 3;
                private static int INTERNAL_ERROR = 4;

                private Companion() {
                }

                public final int getCONNECTION_ERROR() {
                    return CONNECTION_ERROR;
                }

                public final int getDISK_ERROR() {
                    return DISK_ERROR;
                }

                public final int getFILE_NOT_FOUND_ERROR() {
                    return FILE_NOT_FOUND_ERROR;
                }

                public final int getINTERNAL_ERROR() {
                    return INTERNAL_ERROR;
                }

                public final int getREQUEST_ERROR() {
                    return REQUEST_ERROR;
                }

                public final void setCONNECTION_ERROR(int i10) {
                    CONNECTION_ERROR = i10;
                }

                public final void setDISK_ERROR(int i10) {
                    DISK_ERROR = i10;
                }

                public final void setFILE_NOT_FOUND_ERROR(int i10) {
                    FILE_NOT_FOUND_ERROR = i10;
                }

                public final void setINTERNAL_ERROR(int i10) {
                    INTERNAL_ERROR = i10;
                }

                public final void setREQUEST_ERROR(int i10) {
                    REQUEST_ERROR = i10;
                }
            }
        }

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            private a() {
            }
        }

        public DownloadError(int i10, @NotNull Throwable cause, int i11) {
            p.e(cause, "cause");
            this.serverCode = i10;
            this.cause = cause;
            this.reason = i11;
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }

        @NotNull
        public String toString() {
            return "DownloadError(serverCode=" + this.serverCode + ", reason=" + this.reason + ", cause=" + this.cause + ')';
        }
    }

    public static final class Progress {
        private int progressPercent;
        private long readBytes;
        private long sizeBytes;
        private int status;
        private long timestampDownloadStart;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0086\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress$ProgressStatus;", "", "<init>", "()V", "Companion", "a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface ProgressStatus {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            /* renamed from: com.vungle.ads.internal.downloader.AssetDownloadListener$Progress$ProgressStatus$a, reason: from kotlin metadata */
            public static final class Companion {
                private static int STARTED;
                static final /* synthetic */ Companion $$INSTANCE = new Companion();
                private static int IN_PROGRESS = 1;
                private static int PAUSED = 2;
                private static int CANCELLED = 3;
                private static int DONE = 4;
                private static int LOST_CONNECTION = 5;
                private static int STATE_CHANGED = 6;
                private static int ERROR = 7;

                private Companion() {
                }

                public final int getCANCELLED() {
                    return CANCELLED;
                }

                public final int getDONE() {
                    return DONE;
                }

                public final int getERROR() {
                    return ERROR;
                }

                public final int getIN_PROGRESS() {
                    return IN_PROGRESS;
                }

                public final int getLOST_CONNECTION() {
                    return LOST_CONNECTION;
                }

                public final int getPAUSED() {
                    return PAUSED;
                }

                public final int getSTARTED() {
                    return STARTED;
                }

                public final int getSTATE_CHANGED() {
                    return STATE_CHANGED;
                }

                public final void setCANCELLED(int i10) {
                    CANCELLED = i10;
                }

                public final void setDONE(int i10) {
                    DONE = i10;
                }

                public final void setERROR(int i10) {
                    ERROR = i10;
                }

                public final void setIN_PROGRESS(int i10) {
                    IN_PROGRESS = i10;
                }

                public final void setLOST_CONNECTION(int i10) {
                    LOST_CONNECTION = i10;
                }

                public final void setPAUSED(int i10) {
                    PAUSED = i10;
                }

                public final void setSTARTED(int i10) {
                    STARTED = i10;
                }

                public final void setSTATE_CHANGED(int i10) {
                    STATE_CHANGED = i10;
                }
            }
        }

        @ProgressStatus
        public static /* synthetic */ void getStatus$annotations() {
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final long getReadBytes() {
            return this.readBytes;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public final int getStatus() {
            return this.status;
        }

        public final long getTimestampDownloadStart() {
            return this.timestampDownloadStart;
        }

        public final void setProgressPercent(int i10) {
            this.progressPercent = i10;
        }

        public final void setReadBytes(long j10) {
            this.readBytes = j10;
        }

        public final void setSizeBytes(long j10) {
            this.sizeBytes = j10;
        }

        public final void setStatus(int i10) {
            this.status = i10;
        }

        public final void setTimestampDownloadStart(long j10) {
            this.timestampDownloadStart = j10;
        }

        @NotNull
        public String toString() {
            return "Progress(status=" + this.status + ", percent=" + this.progressPercent + ", startAt=" + this.timestampDownloadStart + ", readed=" + this.readBytes + ", total=" + this.sizeBytes + ')';
        }
    }

    void onError(@Nullable DownloadError downloadError, @NotNull DownloadRequest downloadRequest);

    void onProgress(@NotNull Progress progress, @NotNull DownloadRequest downloadRequest);

    void onStart(@NotNull DownloadRequest downloadRequest);

    void onSuccess(@NotNull File file, @NotNull DownloadRequest downloadRequest);
}
