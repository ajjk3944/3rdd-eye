package c2;

import H6.I;
import androidx.work.impl.WorkDatabase;
import b2.C1823d;
import i2.C4453m;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: c2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2060j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18421b;

    public /* synthetic */ CallableC2060j(Object obj, int i) {
        this.f18420a = i;
        this.f18421b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18420a) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((I) this.f18421b).f2053c;
                Long lA = workDatabase.t().a("next_alarm_manager_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                workDatabase.t().b(new C1823d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            default:
                return C4453m.c((ByteArrayInputStream) this.f18421b, null);
        }
    }
}
