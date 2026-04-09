package com.vungle.ads.internal.downloader;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface Downloader {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0086\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/downloader/Downloader$NetworkType;", "", "<init>", "()V", "Companion", "a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface NetworkType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* renamed from: com.vungle.ads.internal.downloader.Downloader$NetworkType$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static int CELLULAR = 1;
            private static int WIFI = 2;
            private static int ANY = 1 | 2;

            private Companion() {
            }

            public final int getANY() {
                return ANY;
            }

            public final int getCELLULAR() {
                return CELLULAR;
            }

            public final int getWIFI() {
                return WIFI;
            }

            public final void setANY(int i10) {
                ANY = i10;
            }

            public final void setCELLULAR(int i10) {
                CELLULAR = i10;
            }

            public final void setWIFI(int i10) {
                WIFI = i10;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/downloader/Downloader$RequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RequestException extends Exception {
        public RequestException(@Nullable String str) {
            super(str);
        }
    }

    void cancel(@Nullable DownloadRequest downloadRequest);

    void cancelAll();

    void download(@Nullable DownloadRequest downloadRequest, @Nullable AssetDownloadListener assetDownloadListener);
}
