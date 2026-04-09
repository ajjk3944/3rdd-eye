package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pa0 extends mz0 implements hy {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa0(Object obj, oj ojVar, int i) {
        super(2, ojVar);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) throws UnknownHostException {
        switch (this.j) {
            case 0:
                pa0 pa0Var = (pa0) h((oj) obj2, (qk) obj);
                z31 z31Var = z31.a;
                pa0Var.m(z31Var);
                return z31Var;
            case 1:
                pa0 pa0Var2 = (pa0) h((oj) obj2, (qk) obj);
                z31 z31Var2 = z31.a;
                pa0Var2.m(z31Var2);
                return z31Var2;
            case 2:
                pa0 pa0Var3 = (pa0) h((oj) obj2, (qk) obj);
                z31 z31Var3 = z31.a;
                pa0Var3.m(z31Var3);
                return z31Var3;
            case 3:
                return ((pa0) h((oj) obj2, (yx0) obj)).m(z31.a);
            case 4:
                return ((pa0) h((oj) obj2, (te3) obj)).m(z31.a);
            default:
                return ((pa0) h((oj) obj2, (te3) obj)).m(z31.a);
        }
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        switch (this.j) {
            case 0:
                return new pa0((m) this.l, this.k, ojVar, 0);
            case 1:
                return new pa0((ha0) this.l, this.k, ojVar, 1);
            case 2:
                return new pa0((d10) this.l, (MainActivity) this.k, ojVar, 2);
            case 3:
                pa0 pa0Var = new pa0((yx0) this.l, ojVar, 3);
                pa0Var.k = obj;
                return pa0Var;
            case 4:
                pa0 pa0Var2 = new pa0((String) this.l, ojVar, 4);
                pa0Var2.k = obj;
                return pa0Var2;
            default:
                pa0 pa0Var3 = new pa0((qe3) this.l, ojVar, 5);
                pa0Var3.k = obj;
                return pa0Var3;
        }
    }

    @Override // defpackage.s9
    public final Object m(Object obj) throws UnknownHostException {
        ro roVar;
        int i = this.j;
        z31 z31Var = z31.a;
        boolean z = false;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                bd2.x(obj);
                ((m) obj2).g(this.k);
                return z31Var;
            case 1:
                bd2.x(obj);
                ((ha0) obj2).g(this.k);
                return z31Var;
            case 2:
                bd2.x(obj);
                d10 d10Var = (d10) obj2;
                ql0 ql0VarA = ql0.a(d10Var.b);
                MainActivity mainActivity = (MainActivity) this.k;
                ArrayList arrayList = mainActivity.b0;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    ql0.b(((Integer) obj3).intValue());
                }
                ql0VarA.e = arrayList;
                ql0VarA.c = 120;
                gw3 gw3Var = new gw3(d10Var, mainActivity, 10, z);
                ql0VarA.g = gw3Var;
                ql0VarA.f.clear();
                ql0VarA.d = false;
                new Thread(new jq3(ql0VarA, gw3Var, 13, z)).start();
                if (d10Var.f == R.drawable.ic_baseline_host) {
                    String strJ = um.j(d10Var.c, d10Var.e);
                    List listJ0 = zf.j0("iphone", "macbook", "mac", "-mbp", "ipad", "apple");
                    List listJ02 = zf.j0("windows", "-pc", "_pc", "pc-", "pc-", "desktop");
                    List listO = zt0.o("dishwasher");
                    Iterator it = listJ0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = listJ02.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = listO.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            roVar = ro.j;
                                        } else if (sy0.y(strJ, (String) it3.next(), true)) {
                                            roVar = ro.q;
                                        }
                                    }
                                } else if (sy0.y(strJ, (String) it2.next(), true)) {
                                    roVar = ro.m;
                                }
                            }
                        } else if (sy0.y(strJ, (String) it.next(), true)) {
                            roVar = ro.l;
                        }
                    }
                    d10Var.a = roVar;
                    d10Var.f = roVar.f;
                    if (d10Var.c.length() == 0) {
                        String string = mainActivity.getString(R.string.txt_generic);
                        i30.l(string, "getString(...)");
                        d10Var.c = string;
                    }
                }
                return z31Var;
            case 3:
                bd2.x(obj);
                yx0 yx0Var = (yx0) obj2;
                return Boolean.valueOf(((yx0Var instanceof jm) || (yx0Var instanceof mu) || ((yx0) this.k) != yx0Var) ? false : true);
            case 4:
                bd2.x(obj);
                re3 re3Var = (re3) ((te3) this.k).s();
                i30.l(Collections.unmodifiableMap(((te3) re3Var.g).B()), "getQueryIdToAdQualityDataMapMap(...)");
                String str = (String) obj2;
                i30.m(str, "key");
                re3Var.b();
                ((te3) re3Var.g).E().remove(str);
                return (te3) re3Var.d();
            default:
                bd2.x(obj);
                re3 re3Var2 = (re3) ((te3) this.k).s();
                i30.l(Collections.unmodifiableMap(((te3) re3Var2.g).B()), "getQueryIdToAdQualityDataMapMap(...)");
                qe3 qe3Var = (qe3) obj2;
                String strD = qe3Var.D();
                i30.l(strD, "getGwsQueryId(...)");
                re3Var2.b();
                ((te3) re3Var2.g).E().put(strD, qe3Var);
                return (te3) re3Var2.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa0(Object obj, Object obj2, oj ojVar, int i) {
        super(2, ojVar);
        this.j = i;
        this.l = obj;
        this.k = obj2;
    }
}
