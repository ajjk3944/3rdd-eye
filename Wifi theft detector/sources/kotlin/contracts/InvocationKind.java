package kotlin.contracts;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "1.3")
@ContractsDsl
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalContracts
/* loaded from: classes4.dex */
public final class InvocationKind {

    /* renamed from: a, reason: collision with root package name */
    public static final InvocationKind f21972a = new InvocationKind("AT_MOST_ONCE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final InvocationKind f21973b = new InvocationKind("AT_LEAST_ONCE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final InvocationKind f21974c = new InvocationKind("EXACTLY_ONCE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final InvocationKind f21975d = new InvocationKind("UNKNOWN", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InvocationKind[] f21976e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f21977f;

    static {
        InvocationKind[] invocationKindArrD = d();
        f21976e = invocationKindArrD;
        f21977f = kotlin.enums.a.a(invocationKindArrD);
    }

    public InvocationKind(String str, int i10) {
    }

    public static final /* synthetic */ InvocationKind[] d() {
        return new InvocationKind[]{f21972a, f21973b, f21974c, f21975d};
    }

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) f21976e.clone();
    }
}
