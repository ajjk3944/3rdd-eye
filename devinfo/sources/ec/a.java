package ec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f22535d;

    public /* synthetic */ a(w wVar, String str, long j, int i4) {
        this.f22532a = i4;
        this.f22533b = str;
        this.f22534c = j;
        this.f22535d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22532a) {
            case 0:
                w wVar = this.f22535d;
                wVar.B();
                String str = this.f22533b;
                pb.y.e(str);
                x.e eVar = wVar.f23105d;
                boolean zIsEmpty = eVar.isEmpty();
                long j = this.f22534c;
                if (zIsEmpty) {
                    wVar.f23106e = j;
                }
                Integer num = (Integer) eVar.get(str);
                if (num == null) {
                    if (eVar.f36920c < 100) {
                        eVar.put(str, 1);
                        wVar.f23104c.put(str, Long.valueOf(j));
                        break;
                    } else {
                        s0 s0Var = ((o1) wVar.f218b).f22954f;
                        o1.m(s0Var);
                        s0Var.j.d("Too many ads visible");
                        break;
                    }
                } else {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                w wVar2 = this.f22535d;
                o1 o1Var = (o1) wVar2.f218b;
                wVar2.B();
                String str2 = this.f22533b;
                pb.y.e(str2);
                x.e eVar2 = wVar2.f23105d;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    s0 s0Var2 = o1Var.f22954f;
                    o1.m(s0Var2);
                    s0Var2.g.e(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    b3 b3Var = o1Var.f22958l;
                    s0 s0Var3 = o1Var.f22954f;
                    o1.l(b3Var);
                    y2 y2VarH = b3Var.H(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        eVar2.remove(str2);
                        x.e eVar3 = wVar2.f23104c;
                        Long l10 = (Long) eVar3.get(str2);
                        long j8 = this.f22534c;
                        if (l10 == null) {
                            o1.m(s0Var3);
                            s0Var3.g.d("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j8 - l10.longValue();
                            eVar3.remove(str2);
                            wVar2.G(str2, jLongValue, y2VarH);
                        }
                        if (eVar2.isEmpty()) {
                            long j9 = wVar2.f23106e;
                            if (j9 != 0) {
                                wVar2.F(j8 - j9, y2VarH);
                                wVar2.f23106e = 0L;
                                break;
                            } else {
                                o1.m(s0Var3);
                                s0Var3.g.d("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
