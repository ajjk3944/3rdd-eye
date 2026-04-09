package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\t2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "<init>", "(Ljava/lang/String;I)V", "R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lc9/c;", "", "Lkotlin/ExtensionFunctionType;", "block", "receiver", "completion", "Ly8/s;", "f", "(Ll9/p;Ljava/lang/Object;Lc9/c;)V", "", "g", "()Z", "isLazy$annotations", "()V", "isLazy", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoroutineStart {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineStart f22205a = new CoroutineStart("DEFAULT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineStart f22206b = new CoroutineStart("LAZY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final CoroutineStart f22207c = new CoroutineStart("ATOMIC", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final CoroutineStart f22208d = new CoroutineStart("UNDISPATCHED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CoroutineStart[] f22209e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e9.a f22210f;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22211a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.f22205a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.f22207c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.f22208d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.f22206b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22211a = iArr;
        }
    }

    static {
        CoroutineStart[] coroutineStartArrD = d();
        f22209e = coroutineStartArrD;
        f22210f = kotlin.enums.a.a(coroutineStartArrD);
    }

    public CoroutineStart(String str, int i10) {
    }

    public static final /* synthetic */ CoroutineStart[] d() {
        return new CoroutineStart[]{f22205a, f22206b, f22207c, f22208d};
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) f22209e.clone();
    }

    public final void f(l9.p block, Object receiver, c9.c completion) throws Throwable {
        int i10 = a.f22211a[ordinal()];
        if (i10 == 1) {
            v9.a.d(block, receiver, completion, null, 4, null);
            return;
        }
        if (i10 == 2) {
            c9.d.a(block, receiver, completion);
        } else if (i10 == 3) {
            v9.b.a(block, receiver, completion);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean g() {
        return this == f22206b;
    }
}
