package kotlinx.coroutines.flow;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SharingCommand {

    /* renamed from: a, reason: collision with root package name */
    public static final SharingCommand f22425a = new SharingCommand("START", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final SharingCommand f22426b = new SharingCommand("STOP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final SharingCommand f22427c = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SharingCommand[] f22428d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e9.a f22429e;

    static {
        SharingCommand[] sharingCommandArrD = d();
        f22428d = sharingCommandArrD;
        f22429e = kotlin.enums.a.a(sharingCommandArrD);
    }

    public SharingCommand(String str, int i10) {
    }

    public static final /* synthetic */ SharingCommand[] d() {
        return new SharingCommand[]{f22425a, f22426b, f22427c};
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) f22428d.clone();
    }
}
