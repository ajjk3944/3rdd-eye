package kotlin.io;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileWalkDirection {

    /* renamed from: a, reason: collision with root package name */
    public static final FileWalkDirection f21995a = new FileWalkDirection("TOP_DOWN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final FileWalkDirection f21996b = new FileWalkDirection("BOTTOM_UP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f21997c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f21998d;

    static {
        FileWalkDirection[] fileWalkDirectionArrD = d();
        f21997c = fileWalkDirectionArrD;
        f21998d = kotlin.enums.a.a(fileWalkDirectionArrD);
    }

    public FileWalkDirection(String str, int i10) {
    }

    public static final /* synthetic */ FileWalkDirection[] d() {
        return new FileWalkDirection[]{f21995a, f21996b};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f21997c.clone();
    }
}
