package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ss1 implements rs1 {
    public static volatile jt1 C = null;
    public static final Object D = new Object();
    public static boolean E = false;
    public static long F;
    public static zs1 G;
    public static pt1 H;
    public static xe1 I;
    public static t83 J;
    public static vg0 K;
    public nt1 A;
    public final HashMap B;
    public MotionEvent f;
    public double o;
    public double p;
    public double q;
    public float r;
    public float s;
    public float t;
    public float u;
    public final DisplayMetrics x;
    public final dm1 y;
    public final wy0 z;
    public final LinkedList g = new LinkedList();
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public long l = 0;
    public long m = 0;
    public long n = 0;
    public boolean v = false;
    public boolean w = false;

    public ss1(Context context, wy0 wy0Var) {
        try {
            hs1.a();
            this.x = context.getResources().getDisplayMetrics();
            if (((Boolean) tw1.e.c.a(mz1.b3)).booleanValue()) {
                this.y = new dm1();
            }
        } catch (Throwable unused) {
        }
        this.B = new HashMap();
        this.z = wy0Var;
    }

    public static jt1 q(Context context, boolean z) {
        if (C == null) {
            synchronized (D) {
                try {
                    if (C == null) {
                        jt1 jt1VarA = jt1.a(context, z, K);
                        if (jt1VarA.n) {
                            try {
                                if (((Boolean) tw1.e.c.a(mz1.F3)).booleanValue()) {
                                    jt1VarA.c("hTLiiIA7LJpRCIVGwbLw56sBtWYdpFA3KN/lVIAoqlyIo4UMQoQK3mH52LWi8hnG", "S64wW/9/kcrI6i+T76YThiZ/p514KjvGlvxi0Ei4eDg=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            jt1VarA.c("Fl0NzymWHJhyDpr9GrhyVi62KX+d2kj13lp1AwiYQHKKCKe1X2FxmeM5KLeNR5D2", "WhU/3eeIEz43+QqYTIKNH8p88w1+Uh4fQMNHsNTU34U=", Context.class);
                            iz1 iz1Var = mz1.N3;
                            tw1 tw1Var = tw1.e;
                            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                                jt1VarA.c("gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", new Class[0]);
                            }
                            jt1VarA.c("yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", Context.class);
                            jt1VarA.c("JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", Context.class);
                            jt1VarA.c("0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", Context.class);
                            jt1VarA.c("01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt", "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8=", Context.class);
                            Class cls = Boolean.TYPE;
                            jt1VarA.c("8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", Context.class, cls);
                            jt1VarA.c("f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", Context.class);
                            jt1VarA.c("Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", Context.class);
                            jt1VarA.c("6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG", "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY=", MotionEvent.class, DisplayMetrics.class);
                            jt1VarA.c("0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI", "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI=", MotionEvent.class, DisplayMetrics.class);
                            jt1VarA.c("6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", new Class[0]);
                            jt1VarA.c("VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", new Class[0]);
                            jt1VarA.c("MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", new Class[0]);
                            jt1VarA.c("N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", new Class[0]);
                            jt1VarA.c("b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", new Class[0]);
                            jt1VarA.c("cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", new Class[0]);
                            jt1VarA.c("yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", Context.class, cls, String.class);
                            jt1VarA.c("ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", StackTraceElement[].class);
                            jt1VarA.c("UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", View.class, DisplayMetrics.class, cls, cls);
                            jt1VarA.c("i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", Context.class, cls);
                            jt1VarA.c("YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", View.class, Activity.class, cls);
                            jt1VarA.c("7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", Long.TYPE);
                            jt1VarA.c("zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", new Class[0]);
                            try {
                                if (((Boolean) tw1Var.c.a(mz1.I3)).booleanValue()) {
                                    jt1VarA.c("ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            jt1VarA.c("71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt", "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8=", Context.class);
                            try {
                                if (((Boolean) tw1.e.c.a(mz1.J3)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    jt1VarA.c("1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", NetworkCapabilities.class, cls2, cls2);
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) tw1.e.c.a(mz1.b3)).booleanValue()) {
                                    jt1VarA.c("sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                            } catch (IllegalStateException unused5) {
                            }
                            if (((Boolean) tw1.e.c.a(mz1.S2)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                jt1VarA.c("OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) tw1.e.c.a(mz1.R2)).booleanValue()) {
                                        jt1VarA.c("ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused6) {
                                }
                            }
                        }
                        C = jt1VarA;
                    }
                } finally {
                }
            }
        }
        return C;
    }

    public static kt1 r(jt1 jt1Var, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws dt1 {
        Method methodD = jt1Var.d("6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG", "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY=");
        if (methodD == null || motionEvent == null) {
            throw new dt1();
        }
        try {
            return new kt1((String) methodD.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new dt1(e);
        }
    }

    public static final void t(List list) throws InterruptedException {
        ExecutorService executorService;
        if (C == null || (executorService = C.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) tw1.e.c.a(mz1.N2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            char[] cArr = lt1.a;
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        }
    }

    @Override // defpackage.rs1
    public final synchronized void a(int i, int i2, int i3) {
        try {
            if (this.f != null) {
                if (((Boolean) tw1.e.c.a(mz1.K2)).booleanValue()) {
                    o();
                } else {
                    this.f.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.x;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f = null;
            }
            this.w = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.rs1
    public final String b(Context context) {
        return "19";
    }

    @Override // defpackage.rs1
    public final void c(StackTraceElement[] stackTraceElementArr) {
        dm1 dm1Var;
        if (!((Boolean) tw1.e.c.a(mz1.b3)).booleanValue() || (dm1Var = this.y) == null) {
            return;
        }
        dm1Var.a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // defpackage.rs1
    public final String d(Context context) {
        char[] cArr = lt1.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return p(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // defpackage.rs1
    public final void e(View view) {
        if (((Boolean) tw1.e.c.a(mz1.Q2)).booleanValue()) {
            if (this.A == null) {
                jt1 jt1Var = C;
                this.A = new nt1(jt1Var.a, jt1Var.o);
            }
            this.A.a(view);
        }
    }

    @Override // defpackage.rs1
    public final synchronized void f(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.v) {
                o();
                this.v = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.o = 0.0d;
                this.p = motionEvent.getRawX();
                this.q = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.p;
                double d2 = rawY - this.q;
                this.o += Math.sqrt((d2 * d2) + (d * d));
                this.p = rawX;
                this.q = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f = motionEventObtain;
                        LinkedList linkedList = this.g;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.j++;
                        this.l = n(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.i += motionEvent.getHistorySize() + 1;
                        kt1 kt1VarM = m(motionEvent);
                        Long l2 = kt1VarM.w;
                        if (l2 != null && kt1VarM.z != null) {
                            this.m = l2.longValue() + kt1VarM.z.longValue() + this.m;
                        }
                        if (this.x != null && (l = kt1VarM.x) != null && kt1VarM.A != null) {
                            this.n = l.longValue() + kt1VarM.A.longValue() + this.n;
                        }
                    } else if (action2 == 3) {
                        this.k++;
                    }
                } catch (dt1 unused) {
                }
            } else {
                this.r = motionEvent.getX();
                this.s = motionEvent.getY();
                this.t = motionEvent.getRawX();
                this.u = motionEvent.getRawY();
                this.h++;
            }
            this.w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.rs1
    public final String g(Context context, String str, View view) {
        return p(context, str, 3, view, null);
    }

    @Override // defpackage.rs1
    public final String h(Context context, String str, View view, Activity activity) {
        return p(context, str, 3, view, activity);
    }

    @Override // defpackage.rs1
    public final String i(Context context, View view, Activity activity) {
        return p(context, null, 2, view, activity);
    }

    public final fr1 j(Context context) throws InterruptedException {
        long j;
        pt1 pt1Var = H;
        if (pt1Var != null && pt1Var.d) {
            pt1Var.b = System.currentTimeMillis();
        }
        iz1 iz1Var = mz1.S2;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            xe1 xe1Var = I;
            xe1Var.b = xe1Var.a;
            xe1Var.a = SystemClock.uptimeMillis();
        }
        fr1 fr1VarC0 = qr1.C0();
        wy0 wy0Var = this.z;
        String str = (String) wy0Var.g;
        if (!TextUtils.isEmpty(str)) {
            fr1VarC0.b();
            ((qr1) fr1VarC0.g).F0(str);
        }
        jt1 jt1VarQ = q(context, wy0Var.f);
        if (jt1VarQ.b == null) {
            return fr1VarC0;
        }
        int iE = jt1VarQ.e();
        ArrayList arrayList = new ArrayList();
        if (jt1VarQ.n) {
            st1 st1Var = new st1(jt1VarQ, fr1VarC0, iE, context, (yq1) wy0Var.h, J);
            int i = iE;
            arrayList.add(st1Var);
            arrayList.add(new ut1(jt1VarQ, fr1VarC0, F, i));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 3));
            arrayList.add(new qt1(jt1VarQ, fr1VarC0, i, context));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 4));
            arrayList.add(new rt1(jt1VarQ, fr1VarC0, i, context));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 7));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 9));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 10));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 0));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 2));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 13));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 6));
            arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 12));
            arrayList.add(new du1(jt1VarQ, fr1VarC0, i));
            if (((Boolean) kz1Var2.a(mz1.J3)).booleanValue()) {
                pt1 pt1Var2 = H;
                long j2 = -1;
                if (pt1Var2 != null) {
                    long j3 = pt1Var2.d ? pt1Var2.b - pt1Var2.a : -1L;
                    long j4 = pt1Var2.c;
                    pt1Var2.c = -1L;
                    j2 = j3;
                    j = j4;
                } else {
                    j = -1;
                }
                cu1 cu1Var = new cu1(jt1VarQ, fr1VarC0, i, G, j2, j);
                i = i;
                arrayList.add(cu1Var);
            }
            if (((Boolean) kz1Var2.a(mz1.I3)).booleanValue()) {
                arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 11));
            }
            tt1 tt1Var = new tt1(jt1VarQ, "71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt", "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8=", fr1VarC0, i, 76, 8);
            fr1VarC0 = fr1VarC0;
            arrayList.add(tt1Var);
            if (((Boolean) kz1Var2.a(mz1.M3)).booleanValue()) {
                arrayList.add(new tt1(jt1VarQ, fr1VarC0, i, 5));
            }
            if (((Boolean) kz1Var2.a(mz1.N3)).booleanValue()) {
                tt1 tt1Var2 = new tt1(jt1VarQ, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", fr1VarC0, i, 82, 1);
                fr1VarC0 = fr1VarC0;
                arrayList.add(tt1Var2);
            }
        } else {
            fr1VarC0.h(16384L);
        }
        t(arrayList);
        return fr1VarC0;
    }

    public final fr1 k(Context context, View view, Activity activity) throws InterruptedException {
        pt1 pt1Var = H;
        if (pt1Var != null && pt1Var.d) {
            pt1Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tw1.e.c.a(mz1.S2)).booleanValue()) {
            xe1 xe1Var = I;
            xe1Var.h = xe1Var.g;
            xe1Var.g = SystemClock.uptimeMillis();
        }
        fr1 fr1VarC0 = qr1.C0();
        wy0 wy0Var = this.z;
        String str = (String) wy0Var.g;
        if (!TextUtils.isEmpty(str)) {
            fr1VarC0.b();
            ((qr1) fr1VarC0.g).F0(str);
        }
        s(q(context, wy0Var.f), fr1VarC0, view, activity, true, context);
        return fr1VarC0;
    }

    public final fr1 l(Context context, View view, Activity activity) throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        pt1 pt1Var = H;
        if (pt1Var != null && pt1Var.d) {
            pt1Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tw1.e.c.a(mz1.S2)).booleanValue()) {
            I.b(context, view);
        }
        fr1 fr1VarC0 = qr1.C0();
        wy0 wy0Var = this.z;
        String str = (String) wy0Var.g;
        fr1VarC0.b();
        ((qr1) fr1VarC0.g).F0(str);
        s(q(context, wy0Var.f), fr1VarC0, view, activity, false, context);
        return fr1VarC0;
    }

    public final kt1 m(MotionEvent motionEvent) throws dt1 {
        Method methodD = C.d("0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI", "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI=");
        if (methodD == null || motionEvent == null) {
            throw new dt1();
        }
        try {
            return new kt1((String) methodD.invoke(null, motionEvent, this.x));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new dt1(e);
        }
    }

    public final long n(StackTraceElement[] stackTraceElementArr) throws dt1 {
        Method methodD = C.d("ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new dt1();
        }
        try {
            return new ys1((String) methodD.invoke(null, stackTraceElementArr)).u.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new dt1(e);
        }
    }

    public final void o() {
        this.l = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.m = 0L;
        this.n = 0L;
        LinkedList linkedList = this.g;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String p(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss1.p(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    public final void s(jt1 jt1Var, fr1 fr1Var, View view, Activity activity, boolean z, Context context) throws InterruptedException {
        Context context2;
        tw1 tw1Var;
        long j;
        long j2;
        long j3;
        MotionEvent motionEvent;
        ArrayList arrayListAsList;
        int i = 1;
        if (jt1Var.n) {
            synchronized (this) {
                try {
                    try {
                        kt1 kt1VarR = r(jt1Var, this.f, this.x);
                        Long l = kt1VarR.t;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).L0(jLongValue);
                        }
                        Long l2 = kt1VarR.u;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).M0(jLongValue2);
                        }
                        Long l3 = kt1VarR.v;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            fr1Var.b();
                            ((qr1) fr1Var.g).N0(jLongValue3);
                        }
                        if (this.w) {
                            Long l4 = kt1VarR.w;
                            if (l4 != null) {
                                long jLongValue4 = l4.longValue();
                                fr1Var.b();
                                ((qr1) fr1Var.g).G(jLongValue4);
                            }
                            Long l5 = kt1VarR.x;
                            if (l5 != null) {
                                long jLongValue5 = l5.longValue();
                                fr1Var.b();
                                ((qr1) fr1Var.g).H(jLongValue5);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (dt1 unused) {
                }
                mr1 mr1VarA = nr1.A();
                if (this.h > 0) {
                    DisplayMetrics displayMetrics = this.x;
                    char[] cArr = lt1.a;
                    if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                        long jB = lt1.b(this.o, displayMetrics);
                        mr1VarA.b();
                        ((nr1) mr1VarA.g).M(jB);
                        long jB2 = lt1.b(this.t - this.r, this.x);
                        mr1VarA.b();
                        ((nr1) mr1VarA.g).N(jB2);
                        long jB3 = lt1.b(this.u - this.s, this.x);
                        mr1VarA.b();
                        ((nr1) mr1VarA.g).O(jB3);
                        long jB4 = lt1.b(this.r, this.x);
                        mr1VarA.b();
                        ((nr1) mr1VarA.g).R(jB4);
                        long jB5 = lt1.b(this.s, this.x);
                        mr1VarA.b();
                        ((nr1) mr1VarA.g).S(jB5);
                        if (this.w && (motionEvent = this.f) != null) {
                            long jB6 = lt1.b(((this.r - this.t) + motionEvent.getRawX()) - this.f.getX(), this.x);
                            if (jB6 != 0) {
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).P(jB6);
                            }
                            long jB7 = lt1.b(((this.s - this.u) + this.f.getRawY()) - this.f.getY(), this.x);
                            if (jB7 != 0) {
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).Q(jB7);
                            }
                        }
                    }
                }
                try {
                    kt1 kt1VarM = m(this.f);
                    Long l6 = kt1VarM.t;
                    if (l6 != null) {
                        long jLongValue6 = l6.longValue();
                        mr1VarA.b();
                        ((nr1) mr1VarA.g).B(jLongValue6);
                    }
                    Long l7 = kt1VarM.u;
                    if (l7 != null) {
                        long jLongValue7 = l7.longValue();
                        mr1VarA.b();
                        ((nr1) mr1VarA.g).C(jLongValue7);
                    }
                    long jLongValue8 = kt1VarM.v.longValue();
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).I(jLongValue8);
                    if (this.w) {
                        Long l8 = kt1VarM.x;
                        if (l8 != null) {
                            long jLongValue9 = l8.longValue();
                            mr1VarA.b();
                            ((nr1) mr1VarA.g).D(jLongValue9);
                        }
                        Long l9 = kt1VarM.w;
                        if (l9 != null) {
                            long jLongValue10 = l9.longValue();
                            mr1VarA.b();
                            ((nr1) mr1VarA.g).G(jLongValue10);
                        }
                        Long l10 = kt1VarM.y;
                        if (l10 != null) {
                            int i2 = l10.longValue() != 0 ? 2 : 1;
                            mr1VarA.b();
                            ((nr1) mr1VarA.g).T(i2);
                        }
                        long j4 = this.i;
                        if (j4 > 0) {
                            DisplayMetrics displayMetrics2 = this.x;
                            char[] cArr2 = lt1.a;
                            Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.n / j4)) : null;
                            if (lValueOf != null) {
                                long jLongValue11 = lValueOf.longValue();
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).E(jLongValue11);
                            } else {
                                mr1VarA.b();
                                ((nr1) mr1VarA.g).F();
                            }
                            long jRound = Math.round(this.m / this.i);
                            mr1VarA.b();
                            ((nr1) mr1VarA.g).H(jRound);
                        }
                        Long l11 = kt1VarM.B;
                        if (l11 != null) {
                            long jLongValue12 = l11.longValue();
                            mr1VarA.b();
                            ((nr1) mr1VarA.g).K(jLongValue12);
                        }
                        Long l12 = kt1VarM.C;
                        if (l12 != null) {
                            long jLongValue13 = l12.longValue();
                            mr1VarA.b();
                            ((nr1) mr1VarA.g).J(jLongValue13);
                        }
                        Long l13 = kt1VarM.D;
                        if (l13 != null) {
                            int i3 = l13.longValue() != 0 ? 2 : 1;
                            mr1VarA.b();
                            ((nr1) mr1VarA.g).U(i3);
                        }
                    }
                } catch (dt1 unused2) {
                }
                long j5 = this.l;
                if (j5 > 0) {
                    mr1VarA.b();
                    ((nr1) mr1VarA.g).L(j5);
                }
                nr1 nr1Var = (nr1) mr1VarA.d();
                fr1Var.b();
                ((qr1) fr1Var.g).T(nr1Var);
                long j6 = this.h;
                if (j6 > 0) {
                    fr1Var.b();
                    ((qr1) fr1Var.g).K(j6);
                }
                long j7 = this.i;
                if (j7 > 0) {
                    fr1Var.b();
                    ((qr1) fr1Var.g).J(j7);
                }
                long j8 = this.j;
                if (j8 > 0) {
                    fr1Var.b();
                    ((qr1) fr1Var.g).I(j8);
                }
                long j9 = this.k;
                if (j9 > 0) {
                    fr1Var.b();
                    ((qr1) fr1Var.g).L(j9);
                }
                try {
                    LinkedList linkedList = this.g;
                    int size = linkedList.size() - 1;
                    if (size > 0) {
                        fr1Var.b();
                        ((qr1) fr1Var.g).V();
                        for (int i4 = 0; i4 < size; i4++) {
                            kt1 kt1VarR2 = r(C, (MotionEvent) linkedList.get(i4), this.x);
                            mr1 mr1VarA2 = nr1.A();
                            long jLongValue14 = kt1VarR2.t.longValue();
                            mr1VarA2.b();
                            ((nr1) mr1VarA2.g).B(jLongValue14);
                            long jLongValue15 = kt1VarR2.u.longValue();
                            mr1VarA2.b();
                            ((nr1) mr1VarA2.g).C(jLongValue15);
                            nr1 nr1Var2 = (nr1) mr1VarA2.d();
                            fr1Var.b();
                            ((qr1) fr1Var.g).U(nr1Var2);
                        }
                    }
                } catch (dt1 unused3) {
                    fr1Var.b();
                    ((qr1) fr1Var.g).V();
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayListAsList = arrayList;
            if (jt1Var.b != null) {
                int iE = jt1Var.e();
                iz1 iz1Var = mz1.a3;
                tw1 tw1Var2 = tw1.e;
                if (((Boolean) tw1Var2.c.a(iz1Var)).booleanValue()) {
                    context2 = context;
                    arrayList.add(new st1(jt1Var, fr1Var, iE, context, (yq1) this.z.h, J));
                    arrayList.add(new rt1(jt1Var, fr1Var, iE, context2));
                    arrayList.add(new qt1(jt1Var, fr1Var, iE, context2));
                    arrayList.add(new tt1(jt1Var, fr1Var, iE, 4));
                    pt1 pt1Var = H;
                    if (pt1Var != null) {
                        if (pt1Var.d) {
                            tw1Var = tw1Var2;
                            j3 = pt1Var.b - pt1Var.a;
                        } else {
                            tw1Var = tw1Var2;
                            j3 = -1;
                        }
                        long j10 = pt1Var.c;
                        pt1Var.c = -1L;
                        j2 = j3;
                        j = j10;
                    } else {
                        tw1Var = tw1Var2;
                        j = -1;
                        j2 = -1;
                    }
                    arrayList.add(new cu1(jt1Var, fr1Var, iE, G, j2, j));
                    arrayList.add(new tt1(jt1Var, fr1Var, iE, 11));
                } else {
                    context2 = context;
                    tw1Var = tw1Var2;
                }
                arrayList.add(new gs1(jt1Var, fr1Var, i));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 3));
                arrayList.add(new ut1(jt1Var, fr1Var, F, iE));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 0));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 9));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 10));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 2));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 7));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 13));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 6));
                arrayList.add(new tt1(jt1Var, fr1Var, iE, 12));
                arrayList.add(new vt1(jt1Var, fr1Var, iE, new Throwable().getStackTrace()));
                arrayList.add(new vt1(jt1Var, fr1Var, iE, view));
                arrayList.add(new du1(jt1Var, fr1Var, iE));
                tw1 tw1Var3 = tw1Var;
                if (((Boolean) tw1Var3.c.a(mz1.O2)).booleanValue()) {
                    arrayList.add(new qt1(jt1Var, fr1Var, iE, view, activity));
                }
                if (((Boolean) tw1Var3.c.a(mz1.M3)).booleanValue()) {
                    arrayList.add(new tt1(jt1Var, fr1Var, iE, 5));
                }
                if (z) {
                    arrayListAsList = arrayList;
                    if (((Boolean) tw1Var3.c.a(mz1.Q2)).booleanValue()) {
                        arrayList.add(new eu1(jt1Var, fr1Var, iE, this.A));
                        arrayListAsList = arrayList;
                    }
                } else {
                    try {
                        if (((Boolean) tw1Var3.c.a(mz1.R2)).booleanValue()) {
                            arrayList.add(new wt1(jt1Var, fr1Var, iE, this.B, view, context2));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) tw1.e.c.a(mz1.S2)).booleanValue()) {
                            arrayList.add(new vt1(jt1Var, fr1Var, iE, I));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    arrayListAsList = arrayList;
                    if (((Boolean) tw1.e.c.a(mz1.b3)).booleanValue()) {
                        arrayList.add(new vt1(jt1Var, fr1Var, iE, this.y));
                        arrayListAsList = arrayList;
                    }
                }
            }
        } else {
            fr1Var.h(16384L);
            arrayListAsList = Arrays.asList(new gs1(jt1Var, fr1Var, i));
        }
        t(arrayListAsList);
    }
}
