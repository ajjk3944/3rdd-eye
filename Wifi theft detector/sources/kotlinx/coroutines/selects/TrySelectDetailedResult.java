package kotlinx.coroutines.selects;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrySelectDetailedResult {

    /* renamed from: a, reason: collision with root package name */
    public static final TrySelectDetailedResult f22654a = new TrySelectDetailedResult("SUCCESSFUL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final TrySelectDetailedResult f22655b = new TrySelectDetailedResult("REREGISTER", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final TrySelectDetailedResult f22656c = new TrySelectDetailedResult("CANCELLED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final TrySelectDetailedResult f22657d = new TrySelectDetailedResult("ALREADY_SELECTED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TrySelectDetailedResult[] f22658e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e9.a f22659f;

    static {
        TrySelectDetailedResult[] trySelectDetailedResultArrD = d();
        f22658e = trySelectDetailedResultArrD;
        f22659f = kotlin.enums.a.a(trySelectDetailedResultArrD);
    }

    public TrySelectDetailedResult(String str, int i10) {
    }

    public static final /* synthetic */ TrySelectDetailedResult[] d() {
        return new TrySelectDetailedResult[]{f22654a, f22655b, f22656c, f22657d};
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f22658e.clone();
    }
}
