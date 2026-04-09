package kotlin.text;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/text/RegexOption;", "", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "mask", "<init>", "(Ljava/lang/String;III)V", "I", "getValue", "()I", "getMask", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "g", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RegexOption {

    /* renamed from: a, reason: collision with root package name */
    public static final RegexOption f22179a = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);

    /* renamed from: b, reason: collision with root package name */
    public static final RegexOption f22180b = new RegexOption("MULTILINE", 1, 8, 0, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public static final RegexOption f22181c = new RegexOption("LITERAL", 2, 16, 0, 2, null);

    /* renamed from: d, reason: collision with root package name */
    public static final RegexOption f22182d = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public static final RegexOption f22183e = new RegexOption("COMMENTS", 4, 4, 0, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public static final RegexOption f22184f = new RegexOption("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* renamed from: g, reason: collision with root package name */
    public static final RegexOption f22185g = new RegexOption("CANON_EQ", 6, 128, 0, 2, null);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ RegexOption[] f22186h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e9.a f22187i;
    private final int mask;
    private final int value;

    static {
        RegexOption[] regexOptionArrD = d();
        f22186h = regexOptionArrD;
        f22187i = kotlin.enums.a.a(regexOptionArrD);
    }

    public RegexOption(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    public static final /* synthetic */ RegexOption[] d() {
        return new RegexOption[]{f22179a, f22180b, f22181c, f22182d, f22183e, f22184f, f22185g};
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f22186h.clone();
    }

    public /* synthetic */ RegexOption(String str, int i10, int i11, int i12, int i13, i iVar) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
