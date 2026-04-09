package C0;

import e5.C2313i;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f1046a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1047b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f1048c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1049d;

    public i(h hVar, int[] iArr, String[] strArr) {
        Set setSingleton;
        this.f1046a = hVar;
        this.f1047b = iArr;
        this.f1048c = strArr;
        if (strArr.length == 0) {
            setSingleton = d5.u.f19826a;
        } else {
            setSingleton = Collections.singleton(strArr[0]);
            q5.i.d(setSingleton, "singleton(...)");
        }
        this.f1049d = setSingleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set set) {
        q5.i.e(set, "invalidatedTablesIds");
        int[] iArr = this.f1047b;
        int length = iArr.length;
        Set setB = d5.u.f19826a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                C2313i c2313i = new C2313i();
                int length2 = iArr.length;
                int i3 = 0;
                while (i < length2) {
                    int i6 = i3 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        c2313i.add(this.f1048c[i3]);
                    }
                    i++;
                    i3 = i6;
                }
                setB = d5.y.b(c2313i);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setB = this.f1049d;
            }
        }
        if (setB.isEmpty()) {
            return;
        }
        this.f1046a.a(setB);
    }
}
