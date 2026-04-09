package A8;

import android.app.Activity;
import b9.C1992A;
import g2.AbstractC4381e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f116b;

    public /* synthetic */ d(int i) {
        this.f116b = i;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f116b) {
            case 0:
                Activity it = (Activity) obj;
                kotlin.jvm.internal.l.f(it, "it");
                I8.b.a(it);
                return C1992A.f18074a;
            case 1:
                AbstractC4381e it2 = (AbstractC4381e) obj;
                kotlin.jvm.internal.l.f(it2, "it");
                it2.b();
                return C1992A.f18074a;
            case 2:
                return obj;
            case 3:
                return t8.d.listToCsv$lambda$0((String) obj);
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
