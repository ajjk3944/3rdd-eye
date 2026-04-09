package kotlin.io.encoding;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"kotlin/io/encoding/Base64$PaddingOption", "", "Lkotlin/io/encoding/Base64$PaddingOption;", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Base64$PaddingOption {

    /* renamed from: a, reason: collision with root package name */
    public static final Base64$PaddingOption f22003a = new Base64$PaddingOption("PRESENT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Base64$PaddingOption f22004b = new Base64$PaddingOption("ABSENT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final Base64$PaddingOption f22005c = new Base64$PaddingOption("PRESENT_OPTIONAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Base64$PaddingOption f22006d = new Base64$PaddingOption("ABSENT_OPTIONAL", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Base64$PaddingOption[] f22007e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f22008f;

    static {
        Base64$PaddingOption[] base64$PaddingOptionArrD = d();
        f22007e = base64$PaddingOptionArrD;
        f22008f = kotlin.enums.a.a(base64$PaddingOptionArrD);
    }

    public Base64$PaddingOption(String str, int i10) {
    }

    public static final /* synthetic */ Base64$PaddingOption[] d() {
        return new Base64$PaddingOption[]{f22003a, f22004b, f22005c, f22006d};
    }

    public static Base64$PaddingOption valueOf(String str) {
        return (Base64$PaddingOption) Enum.valueOf(Base64$PaddingOption.class, str);
    }

    public static Base64$PaddingOption[] values() {
        return (Base64$PaddingOption[]) f22007e.clone();
    }
}
