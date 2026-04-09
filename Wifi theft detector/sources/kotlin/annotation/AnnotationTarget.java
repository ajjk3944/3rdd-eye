package kotlin.annotation;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e9.a;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "g", "h", "i", "j", CampaignEx.JSON_KEY_AD_K, "l", "m", "n", "o", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnnotationTarget {

    /* renamed from: a, reason: collision with root package name */
    public static final AnnotationTarget f21925a = new AnnotationTarget("CLASS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationTarget f21926b = new AnnotationTarget("ANNOTATION_CLASS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationTarget f21927c = new AnnotationTarget("TYPE_PARAMETER", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotationTarget f21928d = new AnnotationTarget("PROPERTY", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotationTarget f21929e = new AnnotationTarget("FIELD", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationTarget f21930f = new AnnotationTarget("LOCAL_VARIABLE", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationTarget f21931g = new AnnotationTarget("VALUE_PARAMETER", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final AnnotationTarget f21932h = new AnnotationTarget("CONSTRUCTOR", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final AnnotationTarget f21933i = new AnnotationTarget("FUNCTION", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final AnnotationTarget f21934j = new AnnotationTarget("PROPERTY_GETTER", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final AnnotationTarget f21935k = new AnnotationTarget("PROPERTY_SETTER", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final AnnotationTarget f21936l = new AnnotationTarget("TYPE", 11);

    /* renamed from: m, reason: collision with root package name */
    public static final AnnotationTarget f21937m = new AnnotationTarget("EXPRESSION", 12);

    /* renamed from: n, reason: collision with root package name */
    public static final AnnotationTarget f21938n = new AnnotationTarget("FILE", 13);

    /* renamed from: o, reason: collision with root package name */
    public static final AnnotationTarget f21939o = new AnnotationTarget("TYPEALIAS", 14);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AnnotationTarget[] f21940p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a f21941q;

    static {
        AnnotationTarget[] annotationTargetArrD = d();
        f21940p = annotationTargetArrD;
        f21941q = kotlin.enums.a.a(annotationTargetArrD);
    }

    public AnnotationTarget(String str, int i10) {
    }

    public static final /* synthetic */ AnnotationTarget[] d() {
        return new AnnotationTarget[]{f21925a, f21926b, f21927c, f21928d, f21929e, f21930f, f21931g, f21932h, f21933i, f21934j, f21935k, f21936l, f21937m, f21938n, f21939o};
    }

    public static AnnotationTarget valueOf(String str) {
        return (AnnotationTarget) Enum.valueOf(AnnotationTarget.class, str);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[]) f21940p.clone();
    }
}
