package Q4;

import androidx.lifecycle.D;
import androidx.lifecycle.X;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v extends X {

    /* renamed from: b, reason: collision with root package name */
    public final D f3243b;

    /* renamed from: c, reason: collision with root package name */
    public final D f3244c;

    /* renamed from: d, reason: collision with root package name */
    public final D f3245d;

    /* renamed from: e, reason: collision with root package name */
    public final D f3246e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3247f;

    /* renamed from: g, reason: collision with root package name */
    public final D f3248g;

    /* renamed from: h, reason: collision with root package name */
    public final D f3249h;
    public final D i;

    /* renamed from: j, reason: collision with root package name */
    public final D f3250j;

    public v() {
        new D();
        D d6 = new D();
        this.f3243b = d6;
        this.f3244c = d6;
        D d7 = new D();
        this.f3245d = d7;
        this.f3246e = d7;
        this.f3247f = new ArrayList();
        D d8 = new D();
        this.f3248g = d8;
        this.f3249h = d8;
        D d9 = new D();
        this.i = d9;
        this.f3250j = d9;
    }

    public final void e(m mVar) {
        Object obj;
        ArrayList arrayList = this.f3247f;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (q5.i.a(((m) obj).f3217d, mVar.f3217d)) {
                break;
            }
        }
        m mVar2 = (m) obj;
        if (mVar2 == null) {
            arrayList.add(mVar);
        } else {
            mVar2.f3216c = mVar.f3216c;
        }
        if (arrayList.size() > 1) {
            d5.o.Q(arrayList, new E.h(1));
        }
        this.f3245d.j(arrayList);
    }
}
