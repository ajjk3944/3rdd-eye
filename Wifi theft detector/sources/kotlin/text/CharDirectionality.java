package kotlin.text;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharDirectionality;
import q9.e;
import y8.h;
import z8.h0;
import z8.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "a", "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "g", "h", "i", "j", CampaignEx.JSON_KEY_AD_K, "l", "m", "n", "o", TtmlNode.TAG_P, CampaignEx.JSON_KEY_AD_Q, "r", "s", "t", "u", "v", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1202#2,2:125\n1230#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
/* loaded from: classes4.dex */
public final class CharDirectionality {

    /* renamed from: b, reason: collision with root package name */
    public static final h f22154b;

    /* renamed from: c, reason: collision with root package name */
    public static final CharDirectionality f22155c = new CharDirectionality("UNDEFINED", 0, -1);

    /* renamed from: d, reason: collision with root package name */
    public static final CharDirectionality f22156d = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final CharDirectionality f22157e = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final CharDirectionality f22158f = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);

    /* renamed from: g, reason: collision with root package name */
    public static final CharDirectionality f22159g = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);

    /* renamed from: h, reason: collision with root package name */
    public static final CharDirectionality f22160h = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final CharDirectionality f22161i = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);

    /* renamed from: j, reason: collision with root package name */
    public static final CharDirectionality f22162j = new CharDirectionality("ARABIC_NUMBER", 7, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final CharDirectionality f22163k = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final CharDirectionality f22164l = new CharDirectionality("NONSPACING_MARK", 9, 8);

    /* renamed from: m, reason: collision with root package name */
    public static final CharDirectionality f22165m = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);

    /* renamed from: n, reason: collision with root package name */
    public static final CharDirectionality f22166n = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);

    /* renamed from: o, reason: collision with root package name */
    public static final CharDirectionality f22167o = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);

    /* renamed from: p, reason: collision with root package name */
    public static final CharDirectionality f22168p = new CharDirectionality("WHITESPACE", 13, 12);

    /* renamed from: q, reason: collision with root package name */
    public static final CharDirectionality f22169q = new CharDirectionality("OTHER_NEUTRALS", 14, 13);

    /* renamed from: r, reason: collision with root package name */
    public static final CharDirectionality f22170r = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);

    /* renamed from: s, reason: collision with root package name */
    public static final CharDirectionality f22171s = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);

    /* renamed from: t, reason: collision with root package name */
    public static final CharDirectionality f22172t = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);

    /* renamed from: u, reason: collision with root package name */
    public static final CharDirectionality f22173u = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);

    /* renamed from: v, reason: collision with root package name */
    public static final CharDirectionality f22174v = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ CharDirectionality[] f22175w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e9.a f22176x;
    private final int value;

    static {
        CharDirectionality[] charDirectionalityArrG = g();
        f22175w = charDirectionalityArrG;
        f22176x = kotlin.enums.a.a(charDirectionalityArrG);
        INSTANCE = new Companion(null);
        f22154b = b.b(new l9.a() { // from class: s9.a
            @Override // l9.a
            public final Object invoke() {
                return CharDirectionality.h();
            }
        });
    }

    public CharDirectionality(String str, int i10, int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ CharDirectionality[] g() {
        return new CharDirectionality[]{f22155c, f22156d, f22157e, f22158f, f22159g, f22160h, f22161i, f22162j, f22163k, f22164l, f22165m, f22166n, f22167o, f22168p, f22169q, f22170r, f22171s, f22172t, f22173u, f22174v};
    }

    public static final Map h() {
        e9.a aVarI = i();
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.b(h0.e(s.s(aVarI, 10)), 16));
        for (Object obj : aVarI) {
            linkedHashMap.put(Integer.valueOf(((CharDirectionality) obj).value), obj);
        }
        return linkedHashMap;
    }

    public static e9.a i() {
        return f22176x;
    }

    public static CharDirectionality valueOf(String str) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, str);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) f22175w.clone();
    }
}
