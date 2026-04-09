package kotlin.io;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnErrorAction {

    /* renamed from: a, reason: collision with root package name */
    public static final OnErrorAction f21999a = new OnErrorAction("SKIP", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final OnErrorAction f22000b = new OnErrorAction("TERMINATE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ OnErrorAction[] f22001c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f22002d;

    static {
        OnErrorAction[] onErrorActionArrD = d();
        f22001c = onErrorActionArrD;
        f22002d = kotlin.enums.a.a(onErrorActionArrD);
    }

    public OnErrorAction(String str, int i10) {
    }

    public static final /* synthetic */ OnErrorAction[] d() {
        return new OnErrorAction[]{f21999a, f22000b};
    }

    public static OnErrorAction valueOf(String str) {
        return (OnErrorAction) Enum.valueOf(OnErrorAction.class, str);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[]) f22001c.clone();
    }
}
