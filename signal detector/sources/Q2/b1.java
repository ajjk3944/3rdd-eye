package q2;

import j2.C2560p;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b1 f23181a = new b1();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = C2560p.f21352b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
