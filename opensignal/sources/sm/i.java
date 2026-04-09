package sm;

import android.view.View;
import com.opensignal.sdk.domain.model.TaskInfo;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i f22133d = new i(10);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22134a;

    public /* synthetic */ i(int i10) {
        this.f22134a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22134a) {
            case 0:
                float f10 = ((k) obj).f22142g;
                float f11 = ((k) obj2).f22142g;
                if (f10 > f11) {
                    return -1;
                }
                return f10 < f11 ? 1 : 0;
            case 1:
                float f12 = ((k) obj).f22142g;
                float f13 = ((k) obj2).f22142g;
                if (f12 > f13) {
                    return 1;
                }
                return f12 < f13 ? -1 : 0;
            case 2:
                return ((x2.f) obj).f25012d - ((x2.f) obj2).f25012d;
            case 3:
                return ((x7.c) obj).f25060b - ((x7.c) obj2).f25060b;
            case 4:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return se.b.n(Long.valueOf(((TaskInfo) obj).f5865r), Long.valueOf(((TaskInfo) obj2).f5865r));
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return se.b.n(Long.valueOf(((TaskInfo) obj).f5865r), Long.valueOf(((TaskInfo) obj2).f5865r));
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return se.b.n(Long.valueOf(((TaskInfo) obj2).f5865r), Long.valueOf(((TaskInfo) obj).f5865r));
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return se.b.n(Long.valueOf(((vj.c) obj).b()), Long.valueOf(((vj.c) obj2).b()));
            case 9:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
