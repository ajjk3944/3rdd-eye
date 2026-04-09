package kotlin.text;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006-"}, d2 = {"Lkotlin/text/CharCategory;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "code", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "I", "getValue", "()I", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "g", "h", "i", "j", CampaignEx.JSON_KEY_AD_K, "l", "m", "n", "o", TtmlNode.TAG_P, CampaignEx.JSON_KEY_AD_Q, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CharCategory {
    public static final /* synthetic */ CharCategory[] F;
    public static final /* synthetic */ e9.a G;

    @NotNull
    private final String code;
    private final int value;

    /* renamed from: b, reason: collision with root package name */
    public static final CharCategory f22128b = new CharCategory("UNASSIGNED", 0, 0, "Cn");

    /* renamed from: c, reason: collision with root package name */
    public static final CharCategory f22129c = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");

    /* renamed from: d, reason: collision with root package name */
    public static final CharCategory f22130d = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");

    /* renamed from: e, reason: collision with root package name */
    public static final CharCategory f22131e = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");

    /* renamed from: f, reason: collision with root package name */
    public static final CharCategory f22132f = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");

    /* renamed from: g, reason: collision with root package name */
    public static final CharCategory f22133g = new CharCategory("OTHER_LETTER", 5, 5, "Lo");

    /* renamed from: h, reason: collision with root package name */
    public static final CharCategory f22134h = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");

    /* renamed from: i, reason: collision with root package name */
    public static final CharCategory f22135i = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");

    /* renamed from: j, reason: collision with root package name */
    public static final CharCategory f22136j = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");

    /* renamed from: k, reason: collision with root package name */
    public static final CharCategory f22137k = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");

    /* renamed from: l, reason: collision with root package name */
    public static final CharCategory f22138l = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");

    /* renamed from: m, reason: collision with root package name */
    public static final CharCategory f22139m = new CharCategory("OTHER_NUMBER", 11, 11, "No");

    /* renamed from: n, reason: collision with root package name */
    public static final CharCategory f22140n = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");

    /* renamed from: o, reason: collision with root package name */
    public static final CharCategory f22141o = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");

    /* renamed from: p, reason: collision with root package name */
    public static final CharCategory f22142p = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");

    /* renamed from: q, reason: collision with root package name */
    public static final CharCategory f22143q = new CharCategory("CONTROL", 15, 15, "Cc");

    /* renamed from: r, reason: collision with root package name */
    public static final CharCategory f22144r = new CharCategory("FORMAT", 16, 16, "Cf");

    /* renamed from: s, reason: collision with root package name */
    public static final CharCategory f22145s = new CharCategory("PRIVATE_USE", 17, 18, "Co");

    /* renamed from: t, reason: collision with root package name */
    public static final CharCategory f22146t = new CharCategory("SURROGATE", 18, 19, "Cs");

    /* renamed from: u, reason: collision with root package name */
    public static final CharCategory f22147u = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");

    /* renamed from: v, reason: collision with root package name */
    public static final CharCategory f22148v = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");

    /* renamed from: w, reason: collision with root package name */
    public static final CharCategory f22149w = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");

    /* renamed from: x, reason: collision with root package name */
    public static final CharCategory f22150x = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");

    /* renamed from: y, reason: collision with root package name */
    public static final CharCategory f22151y = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");

    /* renamed from: z, reason: collision with root package name */
    public static final CharCategory f22152z = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");
    public static final CharCategory A = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final CharCategory B = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final CharCategory C = new CharCategory("OTHER_SYMBOL", 27, 28, "So");
    public static final CharCategory D = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final CharCategory E = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    static {
        CharCategory[] charCategoryArrD = d();
        F = charCategoryArrD;
        G = kotlin.enums.a.a(charCategoryArrD);
        INSTANCE = new Companion(null);
    }

    public CharCategory(String str, int i10, int i11, String str2) {
        this.value = i11;
        this.code = str2;
    }

    public static final /* synthetic */ CharCategory[] d() {
        return new CharCategory[]{f22128b, f22129c, f22130d, f22131e, f22132f, f22133g, f22134h, f22135i, f22136j, f22137k, f22138l, f22139m, f22140n, f22141o, f22142p, f22143q, f22144r, f22145s, f22146t, f22147u, f22148v, f22149w, f22150x, f22151y, f22152z, A, B, C, D, E};
    }

    public static CharCategory valueOf(String str) {
        return (CharCategory) Enum.valueOf(CharCategory.class, str);
    }

    public static CharCategory[] values() {
        return (CharCategory[]) F.clone();
    }
}
