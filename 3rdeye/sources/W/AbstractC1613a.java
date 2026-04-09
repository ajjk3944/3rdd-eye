package W;

import W.C1615c;
import android.util.Range;

/* compiled from: AudioSpec.java */
/* renamed from: W.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1613a {

    /* renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f13230a = new Range<>(0, Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final Range<Integer> f13231b = new Range<>(0, Integer.MAX_VALUE);

    /* compiled from: AudioSpec.java */
    /* renamed from: W.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0187a {
    }

    static {
        C1615c.a aVarA = a();
        aVarA.f13247e = 0;
        aVarA.a();
    }

    public static C1615c.a a() {
        C1615c.a aVar = new C1615c.a();
        aVar.f13244b = -1;
        aVar.f13245c = -1;
        aVar.f13247e = -1;
        Range<Integer> range = f13230a;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        aVar.f13243a = range;
        Range<Integer> range2 = f13231b;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        aVar.f13246d = range2;
        return aVar;
    }

    public abstract Range<Integer> b();

    public abstract int c();

    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();
}
