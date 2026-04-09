package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bm2 implements ca4 {
    public final /* synthetic */ int a = 7;
    public final ga4 b;
    public final ga4 c;
    public final ga4 d;
    public final ga4 e;
    public final ga4 f;
    public final ga4 g;
    public final ga4 h;

    public bm2(hh2 hh2Var, ba4 ba4Var, qh2 qh2Var, qm2 qm2Var, ba4 ba4Var2, ga4 ga4Var, ba4 ba4Var3) {
        this.b = hh2Var;
        this.c = ba4Var;
        this.d = qh2Var;
        this.h = qm2Var;
        this.g = ba4Var2;
        this.e = ga4Var;
        this.f = ba4Var3;
    }

    public o03 a() {
        return new o03((bi2) ((da4) this.c).a, (Context) ((ba4) this.d).d(), (Executor) this.b.d(), (pu2) ((ba4) this.e).d(), ((qm2) this.h).a(), (zk3) ((ba4) this.f).d(), (jv2) ((ba4) this.g).d());
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new am2(((hh2) this.b).a(), ((qm2) this.h).a(), ((ph2) this.c).a(), ((fh2) this.d).d(), (mw2) this.e.d(), (ea3) this.f.d(), (zw2) this.g.d());
            case 1:
                return new gv2(((hh2) this.b).a(), (s83) this.c.d(), (mv2) this.d.d(), ((ll2) this.f).b(), ((ll2) this.g).a(), (jz2) this.e.d(), (String) ((ca4) this.h).d());
            case 2:
                return new jv2(((hh2) this.b).a(), (pv2) this.c.d(), ((qh2) this.d).d(), ((qm2) this.h).a(), (String) ((ba4) this.g).d(), (String) this.e.d(), (vs1) this.f.d());
            case 3:
                return a();
            case 4:
                sh2 sh2Var = (sh2) ((da4) this.d).a;
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new c13(sh2Var, ld2Var, ((wb2) this.e).b(), (v83) this.b.d(), (du2) ((ba4) this.f).d(), (jv2) ((ba4) this.g).d(), ((ph2) this.c).a(), (Context) ((ba4) this.h).d(), new us0());
            case 5:
                return new y63((th2) this.b.d(), (Context) ((da4) this.e).a, (String) ((da4) this.f).a, (t63) ((ba4) this.g).d(), (s63) ((ba4) this.h).d(), ((ph2) this.c).a(), (mv2) this.d.d());
            case 6:
                return new z63((Context) ((da4) this.d).a, (Executor) this.b.d(), (xe4) ((da4) this.e).a, (th2) this.c.d(), (s23) ((ba4) this.f).d(), (u23) ((ba4) this.g).d(), new k83(), (wo2) ((ba4) this.h).d());
            case 7:
                return new ph3((ExecutorService) this.b.d(), ba4.b((ba4) this.f), ba4.b(this.c), (xj3) this.d.d(), ba4.b((ba4) this.g), (wf3) this.h, (vf3) this.e.d());
            case 8:
                Context context = (Context) this.b.d();
                ExecutorService executorService = (ExecutorService) this.c.d();
                wh3 wh3Var = (wh3) this.d.d();
                fi3 fi3Var = (fi3) ((ba4) this.h).d();
                File file = (File) this.e.d();
                gk3 gk3Var = (gk3) this.f.d();
                vf3 vf3Var = (vf3) this.g.d();
                dn3 dn3VarH = dn3.h(new hi3("BhNDAdNbKVCXLou3UwS6SQycA6O/T9ZMbr2NWffNFtsRs3WScUuYHsaYRJ0jHvCA", "oaC5CLMjwUmi/i48MFPdrATPzdM8HcSPBi81Io4IqyU=", Context.class), new hi3("dFQH+5qiD2PRdi0XHMSOoNm+a3fekCOGUzmH+eYRmk9bJvOb468Cs8O4aRQ5LdYP", "cV7R50f2/HQumOgCDB4L1ZcSwVOfPPdtbjhx11w36hE=", new Class[0]), new hi3("xLMBD0ZYDeFbDZVCzCownSP8NNmORP0EKF5jeEnOGlb2W22XICiCfQYSI28gi51p", "CL6HTaJ4+bHVCQXLR1XCftwOp39gWYfgPib+AnvHUWA=", NetworkCapabilities.class, Long.class, Long.class), new hi3("By5K9EmVfikEcCFMOZQd1jxZLLuKkdFWcNBLbmtQ/cGwaIFZzYRhON9QKnCD3h+X", "jO4sZLvDsqH0XT1pMychedS7fP8lDaqZlRwqYI2S90Y=", String.class), new hi3("71irZxeyztMVPxtkZNjCXCWzc9uBzzqfxPgw1LkoaIGD1YWtoRaLj8ZtqyMHro2I", "sazFFsabItlse3qDY43b32ZnLCjQJ0+CJQYLaEeKmSw=", View.class, Activity.class), new hi3("P6F0ZRwWAQfQFwxv0Pq3Kr7GsgVJK2iuMjcPK+Aq3kgEIqqz95IgzklzBsNVE1/z", "noWWhxc3WlXlb4cqOg7NtD3uZWHj+L+uVXJvY7XilyA=", DisplayMetrics.class, View.class), new hi3("lJ67yAwBUtoZhasVqN11g6g6opAmTxjVxzUKxhl0fOhTr4nQH4cVWV7NJy0RD49z", "0isRm8IoYsyXMQyBCJPbREn4r5FwCMP2Q3k9zoXRqyk=", Long[].class, Integer.class), new hi3("Zh6cd+aDndZV+YUcVHG1KoZXWtL97j2QmZXbwOqvXvMv7NRw9MmD/Gx8wRyupV8R", "kj+4OypsnIcMTfpnmlGzqqY0pqeQ7F3FRQZTzB0M60E=", new Class[0]), new hi3("zRITP136LTX4rFLknKK5s+BdzyKXJ24gjaP1ECV594x04Hyj3q+IVU95/J2vSCm1", "E6K+C1ogZN29OFWU2j1wUPRhMI7Lv3qBcqHzi1vCWW4=", Context.class, Integer.class), new hi3("3U4DEAJT9Pq66npH/ZEsiPizUaU6oaGuzbq27Rp3Iz/R6ssq6OsViFqc+1XsG+SQ", "oHImj5OTIs8LNvX9EwNQkQ3bSJ9XioOM1m8VTLsnF8I=", Integer.class, Context.class, Boolean.class), new hi3("yl2V2fIFd/+gtM2i3wtw7rRydnC7INCVtpRFdnYEC9BkEYS1KI4o6evRDqm9gjRN", "/ngo8an629JW3IpM1KyGjEthGKpic0JTOThCbrYq6ZE=", Context.class), new hi3("fPyGoeDuTUuDJV03GsNFpCGRO2J3Ui8HA6QvnuqOeQaxvLcgOY5Y2sf90BXpAioC", "znAIQ1vWTnsSA3nf0QmMCBs/bj4g6mmUyXonbfu9VUs=", Context.class), new hi3("gbI2a8ruQFsh7iJbKP5csiDrRqRaAG+o51RWglq6SF+q1HNUXOxpmDRR6GgQlE1Z", "C7gHksN/1NwyNvzCHdeBzJsOxB75cHtIeny2v2KpeXA=", MotionEvent.class, DisplayMetrics.class), new hi3("TJcXhplO1c7oeAIzyyjGCjnhXIAfNaFNWGhya9KHb9++zv8J1h9atpUrZL1Yjg6v", "v7ewhEi0QRfAHjcos6RExS5aIOB6pcbb0aW+P30gIsQ=", MotionEvent.class, DisplayMetrics.class));
                i41.M(dn3VarH);
                return new gi3(context, executorService, wh3Var, fi3Var, file, gk3Var, vf3Var.Q(), dn3VarH);
            case 9:
                return new mi3((fr1) ((da4) this.f).a, (gi3) this.b.d(), (Map) ((da4) this.g).a, (Context) this.c.d(), (eg3) ((da4) this.h).a, (vf3) this.d.d(), (gk3) this.e.d());
            default:
                return new pj3((Context) this.b.d(), ba4.b((ba4) this.e), (rj3) ((ba4) this.f).d(), (gk3) this.c.d(), (ExecutorService) this.d.d(), (jj3) ((ba4) this.g).d(), (gd3) ((ba4) this.h).d());
        }
    }

    public bm2(hh2 hh2Var, ba4 ba4Var, ba4 ba4Var2, ll2 ll2Var, ll2 ll2Var2, ba4 ba4Var3, ca4 ca4Var) {
        this.b = hh2Var;
        this.c = ba4Var;
        this.d = ba4Var2;
        this.f = ll2Var;
        this.g = ll2Var2;
        this.e = ba4Var3;
        this.h = ca4Var;
    }

    public bm2(da4 da4Var, wb2 wb2Var, ga4 ga4Var, ba4 ba4Var, ba4 ba4Var2, ga4 ga4Var2, ba4 ba4Var3) {
        this.d = da4Var;
        this.e = wb2Var;
        this.b = ga4Var;
        this.f = ba4Var;
        this.g = ba4Var2;
        this.c = ga4Var2;
        this.h = ba4Var3;
    }

    public bm2(da4 da4Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, wf3 wf3Var, da4 da4Var2) {
        this.b = da4Var;
        this.f = ba4Var;
        this.c = ba4Var2;
        this.d = ba4Var3;
        this.g = ba4Var4;
        this.h = wf3Var;
        this.e = da4Var2;
    }

    public bm2(da4 da4Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, da4 da4Var2, ba4 ba4Var4, ba4 ba4Var5) {
        this.b = da4Var;
        this.e = ba4Var;
        this.f = ba4Var2;
        this.c = ba4Var3;
        this.d = da4Var2;
        this.g = ba4Var4;
        this.h = ba4Var5;
    }

    public bm2(da4 da4Var, ba4 ba4Var, da4 da4Var2, da4 da4Var3, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4) {
        this.d = da4Var;
        this.b = ba4Var;
        this.e = da4Var2;
        this.c = da4Var3;
        this.f = ba4Var2;
        this.g = ba4Var3;
        this.h = ba4Var4;
    }

    public bm2(da4 da4Var, ba4 ba4Var, da4 da4Var2, da4 da4Var3, da4 da4Var4, da4 da4Var5, ba4 ba4Var2) {
        this.f = da4Var;
        this.b = ba4Var;
        this.g = da4Var2;
        this.c = da4Var3;
        this.h = da4Var4;
        this.d = da4Var5;
        this.e = ba4Var2;
    }

    public bm2(da4 da4Var, ba4 ba4Var, ga4 ga4Var, ba4 ba4Var2, qm2 qm2Var, ba4 ba4Var3, ba4 ba4Var4) {
        this.c = da4Var;
        this.d = ba4Var;
        this.b = ga4Var;
        this.e = ba4Var2;
        this.h = qm2Var;
        this.f = ba4Var3;
        this.g = ba4Var4;
    }

    public bm2(da4 da4Var, da4 da4Var2, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, ba4 ba4Var4, da4 da4Var3) {
        this.b = da4Var;
        this.c = da4Var2;
        this.d = ba4Var;
        this.h = ba4Var2;
        this.e = ba4Var3;
        this.f = ba4Var4;
        this.g = da4Var3;
    }

    public bm2(da4 da4Var, da4 da4Var2, da4 da4Var3, ba4 ba4Var, ba4 ba4Var2, ph2 ph2Var, ba4 ba4Var3) {
        this.b = da4Var;
        this.e = da4Var2;
        this.f = da4Var3;
        this.g = ba4Var;
        this.h = ba4Var2;
        this.c = ph2Var;
        this.d = ba4Var3;
    }

    public bm2(ga4 ga4Var, qm2 qm2Var, ga4 ga4Var2, ga4 ga4Var3, ga4 ga4Var4, ga4 ga4Var5, ga4 ga4Var6) {
        this.b = ga4Var;
        this.h = qm2Var;
        this.c = ga4Var2;
        this.d = ga4Var3;
        this.e = ga4Var4;
        this.f = ga4Var5;
        this.g = ga4Var6;
    }
}
