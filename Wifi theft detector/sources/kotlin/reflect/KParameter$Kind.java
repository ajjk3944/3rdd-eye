package kotlin.reflect;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"kotlin/reflect/KParameter$Kind", "", "Lkotlin/reflect/KParameter$Kind;", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KParameter$Kind {

    /* renamed from: a, reason: collision with root package name */
    public static final KParameter$Kind f22063a = new KParameter$Kind("INSTANCE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final KParameter$Kind f22064b = new KParameter$Kind("EXTENSION_RECEIVER", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final KParameter$Kind f22065c = new KParameter$Kind("VALUE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KParameter$Kind[] f22066d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f22067e;

    static {
        KParameter$Kind[] kParameter$KindArrD = d();
        f22066d = kParameter$KindArrD;
        f22067e = kotlin.enums.a.a(kParameter$KindArrD);
    }

    public KParameter$Kind(String str, int i10) {
    }

    public static final /* synthetic */ KParameter$Kind[] d() {
        return new KParameter$Kind[]{f22063a, f22064b, f22065c};
    }

    public static KParameter$Kind valueOf(String str) {
        return (KParameter$Kind) Enum.valueOf(KParameter$Kind.class, str);
    }

    public static KParameter$Kind[] values() {
        return (KParameter$Kind[]) f22066d.clone();
    }
}
