package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import m2.C2654a;
import m2.C2658e;
import q2.InterfaceC2853y;
import u.C2940i;

/* renamed from: com.google.android.gms.internal.ads.sr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1874sr extends q2.G {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16806a;

    /* renamed from: b, reason: collision with root package name */
    public final C0710Rh f16807b;

    /* renamed from: c, reason: collision with root package name */
    public final C0905au f16808c;

    /* renamed from: d, reason: collision with root package name */
    public final C0969c3 f16809d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2853y f16810e;

    public BinderC1874sr(C0710Rh c0710Rh, Context context, String str) {
        C0905au c0905au = new C0905au();
        this.f16808c = c0905au;
        this.f16809d = new C0969c3();
        this.f16807b = c0710Rh;
        c0905au.f13243c = str;
        this.f16806a = context;
    }

    @Override // q2.H
    public final void F0(InterfaceC1427kb interfaceC1427kb) {
        this.f16809d.f13522c = interfaceC1427kb;
    }

    @Override // q2.H
    public final void J0(C1160fc c1160fc) {
        this.f16809d.f13524e = c1160fc;
    }

    @Override // q2.H
    public final void W1(C0886ab c0886ab) {
        this.f16809d.f13521b = c0886ab;
    }

    @Override // q2.H
    public final void Y1(InterfaceC2853y interfaceC2853y) {
        this.f16810e = interfaceC2853y;
    }

    @Override // q2.H
    public final q2.E b() {
        C0969c3 c0969c3 = this.f16809d;
        c0969c3.getClass();
        C1708pm c1708pm = new C1708pm(c0969c3);
        ArrayList arrayList = new ArrayList();
        if (c1708pm.f16218c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (c1708pm.f16216a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (c1708pm.f16217b != null) {
            arrayList.add(Integer.toString(2));
        }
        C2940i c2940i = c1708pm.f16221f;
        if (!c2940i.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (c1708pm.f16220e != null) {
            arrayList.add(Integer.toString(7));
        }
        C0905au c0905au = this.f16808c;
        c0905au.f13246f = arrayList;
        ArrayList arrayList2 = new ArrayList(c2940i.f23705c);
        for (int i = 0; i < c2940i.f23705c; i++) {
            arrayList2.add((String) c2940i.f(i));
        }
        c0905au.f13247g = arrayList2;
        if (c0905au.f13242b == null) {
            c0905au.f13242b = q2.d1.a();
        }
        return new BinderC1928tr(this.f16806a, this.f16807b, c0905au, c1708pm, this.f16810e);
    }

    @Override // q2.H
    public final void l2(C0499Fa c0499Fa) {
        this.f16808c.f13248h = c0499Fa;
    }

    @Override // q2.H
    public final void m3(C0941bb c0941bb) {
        this.f16809d.f13520a = c0941bb;
    }

    @Override // q2.H
    public final void n3(C0942bc c0942bc) {
        C0905au c0905au = this.f16808c;
        c0905au.f13253n = c0942bc;
        c0905au.f13244d = new q2.Y0(false, true, false);
    }

    @Override // q2.H
    public final void p1(C2658e c2658e) {
        C0905au c0905au = this.f16808c;
        c0905au.f13250k = c2658e;
        if (c2658e != null) {
            c0905au.f13245e = c2658e.f21949a;
            c0905au.f13251l = c2658e.f21950b;
        }
    }

    @Override // q2.H
    public final void t2(q2.Z z6) {
        this.f16808c.f13262w = z6;
    }

    @Override // q2.H
    public final void v2(String str, InterfaceC1159fb interfaceC1159fb, InterfaceC1050db interfaceC1050db) {
        C0969c3 c0969c3 = this.f16809d;
        ((C2940i) c0969c3.f13525f).put(str, interfaceC1159fb);
        if (interfaceC1050db != null) {
            ((C2940i) c0969c3.f13526g).put(str, interfaceC1050db);
        }
    }

    @Override // q2.H
    public final void z1(C2654a c2654a) {
        C0905au c0905au = this.f16808c;
        c0905au.f13249j = c2654a;
        if (c2654a != null) {
            c0905au.f13245e = c2654a.f21941a;
        }
    }

    @Override // q2.H
    public final void z3(C1321ib c1321ib, q2.d1 d1Var) {
        this.f16809d.f13523d = c1321ib;
        this.f16808c.f13242b = d1Var;
    }
}
