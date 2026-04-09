package kotlin.reflect;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KVariance;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KVariance {

    /* renamed from: a, reason: collision with root package name */
    public static final KVariance f22068a = new KVariance("INVARIANT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final KVariance f22069b = new KVariance("IN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final KVariance f22070c = new KVariance("OUT", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KVariance[] f22071d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f22072e;

    static {
        KVariance[] kVarianceArrD = d();
        f22071d = kVarianceArrD;
        f22072e = kotlin.enums.a.a(kVarianceArrD);
    }

    public KVariance(String str, int i10) {
    }

    public static final /* synthetic */ KVariance[] d() {
        return new KVariance[]{f22068a, f22069b, f22070c};
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) f22071d.clone();
    }
}
