package ei;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ei.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5469a implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5469a other) {
        AbstractC6492s.i(other, "other");
        int iCompareTo = b().compareTo(other.b());
        if (iCompareTo == 0 && !c() && other.c()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract EnumC5470b b();

    public abstract boolean c();
}
