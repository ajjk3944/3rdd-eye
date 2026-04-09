package zc;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26850a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26851d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f26852g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f26853r;

    public /* synthetic */ a(r rVar, String str, long j, int i10) {
        this.f26850a = i10;
        this.f26851d = str;
        this.f26852g = j;
        this.f26853r = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f26850a) {
            case 0:
                r rVar = this.f26853r;
                rVar.s1();
                String str = this.f26851d;
                cc.s.e(str);
                u.e eVar = rVar.f27119r;
                boolean zIsEmpty = eVar.isEmpty();
                long j = this.f26852g;
                if (zIsEmpty) {
                    rVar.f27120x = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num == null) {
                    if (eVar.f23077g < 100) {
                        eVar.put(str, 1);
                        rVar.f27118g.put(str, Long.valueOf(j));
                        break;
                    } else {
                        j0 j0Var = ((c1) rVar.f1504d).f26889y;
                        c1.g(j0Var);
                        j0Var.F.b("Too many ads visible");
                        break;
                    }
                } else {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                r rVar2 = this.f26853r;
                c1 c1Var = (c1) rVar2.f1504d;
                rVar2.s1();
                String str2 = this.f26851d;
                cc.s.e(str2);
                u.e eVar2 = rVar2.f27119r;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    j0 j0Var2 = c1Var.f26889y;
                    c1.g(j0Var2);
                    j0Var2.B.c(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    o2 o2Var = c1Var.H;
                    j0 j0Var3 = c1Var.f26889y;
                    c1.f(o2Var);
                    l2 l2VarY1 = o2Var.y1(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        eVar2.remove(str2);
                        u.e eVar3 = rVar2.f27118g;
                        Long l10 = (Long) eVar3.get(str2);
                        long j7 = this.f26852g;
                        if (l10 == null) {
                            c1.g(j0Var3);
                            j0Var3.B.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j7 - l10.longValue();
                            eVar3.remove(str2);
                            rVar2.x1(str2, jLongValue, l2VarY1);
                        }
                        if (eVar2.isEmpty()) {
                            long j10 = rVar2.f27120x;
                            if (j10 != 0) {
                                rVar2.w1(j7 - j10, l2VarY1);
                                rVar2.f27120x = 0L;
                                break;
                            } else {
                                c1.g(j0Var3);
                                j0Var3.B.b("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
