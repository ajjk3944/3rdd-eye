package kotlin.reflect;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "1.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KVisibility {

    /* renamed from: a, reason: collision with root package name */
    public static final KVisibility f22073a = new KVisibility("PUBLIC", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final KVisibility f22074b = new KVisibility("PROTECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final KVisibility f22075c = new KVisibility("INTERNAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final KVisibility f22076d = new KVisibility("PRIVATE", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KVisibility[] f22077e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f22078f;

    static {
        KVisibility[] kVisibilityArrD = d();
        f22077e = kVisibilityArrD;
        f22078f = kotlin.enums.a.a(kVisibilityArrD);
    }

    public KVisibility(String str, int i10) {
    }

    public static final /* synthetic */ KVisibility[] d() {
        return new KVisibility[]{f22073a, f22074b, f22075c, f22076d};
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f22077e.clone();
    }
}
