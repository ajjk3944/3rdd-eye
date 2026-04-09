package kotlinx.coroutines.channels;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BufferOverflow {

    /* renamed from: a, reason: collision with root package name */
    public static final BufferOverflow f22240a = new BufferOverflow("SUSPEND", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final BufferOverflow f22241b = new BufferOverflow("DROP_OLDEST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final BufferOverflow f22242c = new BufferOverflow("DROP_LATEST", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BufferOverflow[] f22243d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e9.a f22244e;

    static {
        BufferOverflow[] bufferOverflowArrD = d();
        f22243d = bufferOverflowArrD;
        f22244e = kotlin.enums.a.a(bufferOverflowArrD);
    }

    public BufferOverflow(String str, int i10) {
    }

    public static final /* synthetic */ BufferOverflow[] d() {
        return new BufferOverflow[]{f22240a, f22241b, f22242c};
    }

    public static BufferOverflow valueOf(String str) {
        return (BufferOverflow) Enum.valueOf(BufferOverflow.class, str);
    }

    public static BufferOverflow[] values() {
        return (BufferOverflow[]) f22243d.clone();
    }
}
