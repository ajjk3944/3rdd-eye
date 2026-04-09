package h9;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10457a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f10458b = 0;

    public final void a() {
        this.f10458b += 1000;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f10457a.iterator();
        while (it.hasNext()) {
            sb2.append((r) it.next());
            sb2.append(' ');
        }
        sb2.append('[');
        return c7.a.q(sb2, this.f10458b, ']');
    }
}
