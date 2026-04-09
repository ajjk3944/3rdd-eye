package kotlin.time;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e9.a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lkotlin/time/DurationUnit;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "Ljava/util/concurrent/TimeUnit;", "g", "()Ljava/util/concurrent/TimeUnit;", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "e", "f", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes4.dex */
public final class DurationUnit {

    /* renamed from: a, reason: collision with root package name */
    public static final DurationUnit f22188a = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: b, reason: collision with root package name */
    public static final DurationUnit f22189b = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: c, reason: collision with root package name */
    public static final DurationUnit f22190c = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: d, reason: collision with root package name */
    public static final DurationUnit f22191d = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: e, reason: collision with root package name */
    public static final DurationUnit f22192e = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: f, reason: collision with root package name */
    public static final DurationUnit f22193f = new DurationUnit("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: g, reason: collision with root package name */
    public static final DurationUnit f22194g = new DurationUnit("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ DurationUnit[] f22195h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a f22196i;

    @NotNull
    private final TimeUnit timeUnit;

    static {
        DurationUnit[] durationUnitArrD = d();
        f22195h = durationUnitArrD;
        f22196i = kotlin.enums.a.a(durationUnitArrD);
    }

    public DurationUnit(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static final /* synthetic */ DurationUnit[] d() {
        return new DurationUnit[]{f22188a, f22189b, f22190c, f22191d, f22192e, f22193f, f22194g};
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f22195h.clone();
    }

    /* renamed from: g, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
}
