package dg;

import ag.InterfaceC3843a;
import java.util.Comparator;
import java.util.Spliterator;

/* renamed from: dg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5371a extends Spliterator {
    InterfaceC3843a a();

    @Override // java.util.Spliterator
    default Comparator getComparator() {
        return null;
    }
}
