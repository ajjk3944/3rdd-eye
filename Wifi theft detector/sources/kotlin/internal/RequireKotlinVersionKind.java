package kotlin.internal;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "1.2")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequireKotlinVersionKind {

    /* renamed from: a, reason: collision with root package name */
    public static final RequireKotlinVersionKind f21990a = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final RequireKotlinVersionKind f21991b = new RequireKotlinVersionKind("COMPILER_VERSION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final RequireKotlinVersionKind f21992c = new RequireKotlinVersionKind("API_VERSION", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ RequireKotlinVersionKind[] f21993d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f21994e;

    static {
        RequireKotlinVersionKind[] requireKotlinVersionKindArrD = d();
        f21993d = requireKotlinVersionKindArrD;
        f21994e = kotlin.enums.a.a(requireKotlinVersionKindArrD);
    }

    public RequireKotlinVersionKind(String str, int i10) {
    }

    public static final /* synthetic */ RequireKotlinVersionKind[] d() {
        return new RequireKotlinVersionKind[]{f21990a, f21991b, f21992c};
    }

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) f21993d.clone();
    }
}
