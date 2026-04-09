package W;

import W.C1626n;
import android.util.Range;
import java.util.Arrays;

/* compiled from: VideoSpec.java */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f13235a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final Range<Integer> f13236b = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final A f13237c;

    /* compiled from: VideoSpec.java */
    public static abstract class a {
    }

    static {
        C1622j c1622j = C1635x.f13309c;
        f13237c = A.a(Arrays.asList(c1622j, C1635x.f13308b, C1635x.f13307a), new C1617e(c1622j, 1));
    }

    public static C1626n.a a() {
        C1626n.a aVar = new C1626n.a();
        A a10 = f13237c;
        if (a10 == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        aVar.f13289a = a10;
        Range<Integer> range = f13235a;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        aVar.f13290b = range;
        Range<Integer> range2 = f13236b;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        aVar.f13291c = range2;
        aVar.f13292d = -1;
        return aVar;
    }

    public abstract int b();

    public abstract Range<Integer> c();

    public abstract Range<Integer> d();

    public abstract A e();

    public abstract C1626n.a f();
}
