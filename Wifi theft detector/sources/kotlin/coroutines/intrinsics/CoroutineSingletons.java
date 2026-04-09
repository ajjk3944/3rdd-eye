package kotlin.coroutines.intrinsics;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
/* loaded from: classes4.dex */
public final class CoroutineSingletons {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineSingletons f21983a = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineSingletons f21984b = new CoroutineSingletons("UNDECIDED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final CoroutineSingletons f21985c = new CoroutineSingletons("RESUMED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CoroutineSingletons[] f21986d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e9.a f21987e;

    static {
        CoroutineSingletons[] coroutineSingletonsArrD = d();
        f21986d = coroutineSingletonsArrD;
        f21987e = kotlin.enums.a.a(coroutineSingletonsArrD);
    }

    public CoroutineSingletons(String str, int i10) {
    }

    public static final /* synthetic */ CoroutineSingletons[] d() {
        return new CoroutineSingletons[]{f21983a, f21984b, f21985c};
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f21986d.clone();
    }
}
