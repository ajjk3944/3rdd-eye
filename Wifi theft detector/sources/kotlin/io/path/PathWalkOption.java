package kotlin.io.path;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "2.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "<init>", "(Ljava/lang/String;I)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalPathApi.class})
/* loaded from: classes4.dex */
public final class PathWalkOption {

    /* renamed from: a, reason: collision with root package name */
    public static final PathWalkOption f22018a = new PathWalkOption("INCLUDE_DIRECTORIES", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final PathWalkOption f22019b = new PathWalkOption("BREADTH_FIRST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final PathWalkOption f22020c = new PathWalkOption("FOLLOW_LINKS", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PathWalkOption[] f22021d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f22022e;

    static {
        PathWalkOption[] pathWalkOptionArrD = d();
        f22021d = pathWalkOptionArrD;
        f22022e = kotlin.enums.a.a(pathWalkOptionArrD);
    }

    public PathWalkOption(String str, int i10) {
    }

    public static final /* synthetic */ PathWalkOption[] d() {
        return new PathWalkOption[]{f22018a, f22019b, f22020c};
    }

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) f22021d.clone();
    }
}
