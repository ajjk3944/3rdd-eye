package kotlinx.coroutines.channels;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@ObsoleteCoroutinesApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TickerMode {

    /* renamed from: a, reason: collision with root package name */
    public static final TickerMode f22284a = new TickerMode("FIXED_PERIOD", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final TickerMode f22285b = new TickerMode("FIXED_DELAY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TickerMode[] f22286c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e9.a f22287d;

    static {
        TickerMode[] tickerModeArrD = d();
        f22286c = tickerModeArrD;
        f22287d = kotlin.enums.a.a(tickerModeArrD);
    }

    public TickerMode(String str, int i10) {
    }

    public static final /* synthetic */ TickerMode[] d() {
        return new TickerMode[]{f22284a, f22285b};
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) f22286c.clone();
    }
}
