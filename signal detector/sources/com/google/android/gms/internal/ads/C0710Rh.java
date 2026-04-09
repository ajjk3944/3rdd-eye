package com.google.android.gms.internal.ads;

import A2.C0127o;
import A2.C0131t;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import q2.C2841s;
import q2.InterfaceC2815e0;
import t2.C2905A;
import t2.C2911G;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710Rh {

    /* renamed from: P0, reason: collision with root package name */
    public static C0710Rh f10943P0;

    /* renamed from: A, reason: collision with root package name */
    public final C1799rN f10944A;

    /* renamed from: A0, reason: collision with root package name */
    public final C1799rN f10945A0;

    /* renamed from: B, reason: collision with root package name */
    public final C1799rN f10946B;

    /* renamed from: B0, reason: collision with root package name */
    public final C1434ki f10947B0;

    /* renamed from: C, reason: collision with root package name */
    public final C0489Eh f10948C;

    /* renamed from: C0, reason: collision with root package name */
    public final C1799rN f10949C0;

    /* renamed from: D, reason: collision with root package name */
    public final C1799rN f10950D;

    /* renamed from: D0, reason: collision with root package name */
    public final C1799rN f10951D0;

    /* renamed from: E, reason: collision with root package name */
    public final C1799rN f10952E;

    /* renamed from: E0, reason: collision with root package name */
    public final C1799rN f10953E0;

    /* renamed from: F, reason: collision with root package name */
    public final C1907tN f10954F;

    /* renamed from: F0, reason: collision with root package name */
    public final P7 f10955F0;

    /* renamed from: G, reason: collision with root package name */
    public final C1799rN f10956G;

    /* renamed from: G0, reason: collision with root package name */
    public final C1799rN f10957G0;

    /* renamed from: H, reason: collision with root package name */
    public final C1111ei f10958H;

    /* renamed from: H0, reason: collision with root package name */
    public final C0796Wi f10959H0;

    /* renamed from: I, reason: collision with root package name */
    public final C1799rN f10960I;

    /* renamed from: I0, reason: collision with root package name */
    public final C1799rN f10961I0;

    /* renamed from: J, reason: collision with root package name */
    public final C1799rN f10962J;

    /* renamed from: J0, reason: collision with root package name */
    public final C1799rN f10963J0;

    /* renamed from: K, reason: collision with root package name */
    public final C1799rN f10964K;

    /* renamed from: K0, reason: collision with root package name */
    public final C1799rN f10965K0;

    /* renamed from: L, reason: collision with root package name */
    public final C1799rN f10966L;

    /* renamed from: L0, reason: collision with root package name */
    public final C1799rN f10967L0;
    public final C1799rN M;

    /* renamed from: M0, reason: collision with root package name */
    public final C1799rN f10968M0;

    /* renamed from: N, reason: collision with root package name */
    public final C1799rN f10969N;

    /* renamed from: N0, reason: collision with root package name */
    public final C1799rN f10970N0;

    /* renamed from: O, reason: collision with root package name */
    public final C1799rN f10971O;

    /* renamed from: O0, reason: collision with root package name */
    public final C1799rN f10972O0;

    /* renamed from: P, reason: collision with root package name */
    public final C1799rN f10973P;

    /* renamed from: Q, reason: collision with root package name */
    public final C1799rN f10974Q;

    /* renamed from: R, reason: collision with root package name */
    public final C1799rN f10975R;

    /* renamed from: S, reason: collision with root package name */
    public final C1799rN f10976S;

    /* renamed from: T, reason: collision with root package name */
    public final C0608Lh f10977T;

    /* renamed from: U, reason: collision with root package name */
    public final C0676Ph f10978U;

    /* renamed from: V, reason: collision with root package name */
    public final C1799rN f10979V;

    /* renamed from: W, reason: collision with root package name */
    public final C0659Oh f10980W;

    /* renamed from: X, reason: collision with root package name */
    public final C1799rN f10981X;

    /* renamed from: Y, reason: collision with root package name */
    public final C1799rN f10982Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C1799rN f10983Z;

    /* renamed from: a, reason: collision with root package name */
    public final C0472Dh f10984a;

    /* renamed from: a0, reason: collision with root package name */
    public final C1799rN f10985a0;

    /* renamed from: b, reason: collision with root package name */
    public final C0710Rh f10986b = this;
    public final C1799rN b0;

    /* renamed from: c, reason: collision with root package name */
    public final C1799rN f10987c;

    /* renamed from: c0, reason: collision with root package name */
    public final Bs f10988c0;

    /* renamed from: d, reason: collision with root package name */
    public final C1799rN f10989d;

    /* renamed from: d0, reason: collision with root package name */
    public final C1799rN f10990d0;

    /* renamed from: e, reason: collision with root package name */
    public final C1799rN f10991e;

    /* renamed from: e0, reason: collision with root package name */
    public final C1799rN f10992e0;

    /* renamed from: f, reason: collision with root package name */
    public final C1799rN f10993f;

    /* renamed from: f0, reason: collision with root package name */
    public final C1284hs f10994f0;

    /* renamed from: g, reason: collision with root package name */
    public final C0540Hh f10995g;

    /* renamed from: g0, reason: collision with root package name */
    public final C1799rN f10996g0;

    /* renamed from: h, reason: collision with root package name */
    public final C0642Nh f10997h;

    /* renamed from: h0, reason: collision with root package name */
    public final Js f10998h0;
    public final C1799rN i;

    /* renamed from: i0, reason: collision with root package name */
    public final C1799rN f10999i0;

    /* renamed from: j, reason: collision with root package name */
    public final C1799rN f11000j;

    /* renamed from: j0, reason: collision with root package name */
    public final Ts f11001j0;

    /* renamed from: k, reason: collision with root package name */
    public final C1799rN f11002k;

    /* renamed from: k0, reason: collision with root package name */
    public final C1799rN f11003k0;

    /* renamed from: l, reason: collision with root package name */
    public final C1799rN f11004l;

    /* renamed from: l0, reason: collision with root package name */
    public final C1799rN f11005l0;

    /* renamed from: m, reason: collision with root package name */
    public final C1799rN f11006m;

    /* renamed from: m0, reason: collision with root package name */
    public final C1799rN f11007m0;

    /* renamed from: n, reason: collision with root package name */
    public final C1799rN f11008n;

    /* renamed from: n0, reason: collision with root package name */
    public final C1799rN f11009n0;

    /* renamed from: o, reason: collision with root package name */
    public final C1799rN f11010o;

    /* renamed from: o0, reason: collision with root package name */
    public final C1799rN f11011o0;

    /* renamed from: p, reason: collision with root package name */
    public final C1799rN f11012p;

    /* renamed from: p0, reason: collision with root package name */
    public final Zr f11013p0;

    /* renamed from: q, reason: collision with root package name */
    public final C1799rN f11014q;

    /* renamed from: q0, reason: collision with root package name */
    public final C1799rN f11015q0;

    /* renamed from: r, reason: collision with root package name */
    public final C1799rN f11016r;

    /* renamed from: r0, reason: collision with root package name */
    public final Ir f11017r0;

    /* renamed from: s, reason: collision with root package name */
    public final C1799rN f11018s;

    /* renamed from: s0, reason: collision with root package name */
    public final C1799rN f11019s0;

    /* renamed from: t, reason: collision with root package name */
    public final C1799rN f11020t;

    /* renamed from: t0, reason: collision with root package name */
    public final C1176fs f11021t0;

    /* renamed from: u, reason: collision with root package name */
    public final C1799rN f11022u;

    /* renamed from: u0, reason: collision with root package name */
    public final C1799rN f11023u0;

    /* renamed from: v, reason: collision with root package name */
    public final C1799rN f11024v;
    public final C1799rN v0;

    /* renamed from: w, reason: collision with root package name */
    public final C1799rN f11025w;

    /* renamed from: w0, reason: collision with root package name */
    public final C2037vs f11026w0;

    /* renamed from: x, reason: collision with root package name */
    public final C1799rN f11027x;

    /* renamed from: x0, reason: collision with root package name */
    public final C1799rN f11028x0;

    /* renamed from: y, reason: collision with root package name */
    public final C0557Ih f11029y;

    /* renamed from: y0, reason: collision with root package name */
    public final C1799rN f11030y0;

    /* renamed from: z, reason: collision with root package name */
    public final C1799rN f11031z;

    /* renamed from: z0, reason: collision with root package name */
    public final C1799rN f11032z0;

    public C0710Rh(C0472Dh c0472Dh, W9 w9) {
        this.f10984a = c0472Dh;
        C1799rN c1799rNA = C1799rN.a(AbstractC2022vd.f17307w);
        this.f10987c = c1799rNA;
        C1799rN c1799rNA2 = C1799rN.a(new C0901aq(C1799rN.a(AbstractC2022vd.f17308x), 19));
        this.f10989d = c1799rNA2;
        this.f10991e = C1799rN.a(AbstractC0709Rg.f10941y);
        int i = 5;
        C1799rN c1799rNA3 = C1799rN.a(new C1122et(i));
        this.f10993f = c1799rNA3;
        C0540Hh c0540Hh = new C0540Hh(c0472Dh);
        this.f10995g = c0540Hh;
        int i3 = 1;
        InterfaceC2069wN interfaceC2069wNA = C2177yN.a(new C0591Kh(c0540Hh, C1799rN.a(new C0506Fh(c0472Dh, i)), i3));
        C0642Nh c0642Nh = new C0642Nh(c0472Dh);
        this.f10997h = c0642Nh;
        C1799rN c1799rNA4 = C1799rN.a(new C1271hf(interfaceC2069wNA, new A2.H(c0540Hh, c0642Nh, i3), c0540Hh, 13));
        this.i = c1799rNA4;
        C1799rN c1799rNA5 = C1799rN.a(new C0733Sn(c1799rNA4, 4));
        this.f11000j = c1799rNA5;
        C1799rN c1799rNA6 = C1799rN.a(AbstractC1114el.f13967y);
        this.f11002k = c1799rNA6;
        this.f11004l = C1799rN.a(new C2242zh(c1799rNA6, c1799rNA5, 0));
        C1799rN c1799rNA7 = C1799rN.a(new C0598Ko(c0540Hh, c0642Nh, i3));
        this.f11006m = c1799rNA7;
        C0523Gh c0523Gh = new C0523Gh(c0540Hh, 2);
        C1799rN c1799rNA8 = C1799rN.a(AbstractC2022vd.f17301q);
        this.f11008n = c1799rNA8;
        C1799rN c1799rNA9 = C1799rN.a(new C1808rf(c0523Gh, c1799rNA8, 14));
        this.f11010o = c1799rNA9;
        C1799rN c1799rNA10 = C1799rN.a(new C0574Jh(c1799rNA9, 2));
        this.f11012p = c1799rNA10;
        C1799rN c1799rNA11 = C1799rN.a(new C0748Tl(23));
        this.f11014q = c1799rNA11;
        C0506Fh c0506Fh = new C0506Fh(c0472Dh, 2);
        C1799rN c1799rNA12 = C1799rN.a(new P7(5));
        this.f11016r = c1799rNA12;
        C1799rN c1799rNA13 = C1799rN.a(new C2242zh(c1799rNA12, c1799rNA4, 24));
        C1799rN c1799rNA14 = C1799rN.a(AbstractC1114el.f13937F);
        this.f11018s = c1799rNA14;
        C1799rN c1799rNA15 = C1799rN.a(new C0574Jh(c1799rNA14, 0));
        int i6 = C2123xN.f17584c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c1799rNA15);
        C1329ik c1329ik = new C1329ik(new C2123xN(list, arrayList), 17);
        C1799rN c1799rNA16 = C1799rN.a(new C2242zh(c1799rNA6, c1799rNA2, 1));
        C1799rN c1799rNA17 = C1799rN.a(new C0745Ti(c0540Hh, c0642Nh, c1799rNA8, c1799rNA16));
        this.f11020t = c1799rNA17;
        C1799rN c1799rNA18 = C1799rN.a(new C0131t(c1799rNA, c0540Hh, c0506Fh, c1799rNA9, c1799rNA2, c1799rNA13, c0642Nh, c1329ik, c1799rNA17));
        this.f11022u = c1799rNA18;
        int i7 = 10;
        C1799rN c1799rNA19 = C1799rN.a(new P7(i7));
        this.f11024v = c1799rNA19;
        C1799rN c1799rNA20 = C1799rN.a(new C0748Tl(i7));
        this.f11025w = c1799rNA20;
        C1799rN c1799rNA21 = C1799rN.a(new C0598Ko(c0540Hh, c0642Nh, 0));
        C1799rN c1799rNA22 = C1799rN.a(new C0523Gh(c0540Hh, 4));
        C1799rN c1799rNA23 = C1799rN.a(new C0523Gh(c0540Hh, 3));
        C1799rN c1799rNA24 = C1799rN.a(new C2242zh(c1799rNA18, c1799rNA8, 26));
        C1799rN c1799rNA25 = C1799rN.a(new C1271hf(c0540Hh, c0506Fh, c1799rNA21, 14));
        this.f11027x = c1799rNA25;
        C0557Ih c0557Ih = new C0557Ih(c0540Hh);
        this.f11029y = c0557Ih;
        C1799rN c1799rNA26 = C1799rN.a(new C2031vm(c1799rNA21, c1799rNA22, c1799rNA23, c0540Hh, c0642Nh, c1799rNA24, c1799rNA25, c0557Ih));
        this.f11031z = c1799rNA26;
        C0506Fh c0506Fh2 = new C0506Fh(c0472Dh, 3);
        C1799rN c1799rNA27 = C1799rN.a(new C0610Lj(c0540Hh, c1799rNA17, c0642Nh));
        this.f10944A = c1799rNA27;
        C1799rN c1799rNA28 = C1799rN.a(new C0523Gh(c0540Hh, 5));
        C1799rN c1799rNA29 = C1799rN.a(new P7(2));
        this.f10946B = c1799rNA29;
        C0489Eh c0489Eh = new C0489Eh(c1799rNA29);
        this.f10948C = c0489Eh;
        this.f10950D = C1799rN.a(new C1380ji(c0540Hh, c0642Nh, c1799rNA9, c1799rNA10, c1799rNA11, c1799rNA18, c1799rNA19, c1799rNA20, c1799rNA26, c0506Fh2, c1799rNA17, c0523Gh, c1799rNA27, c1799rNA5, C1799rN.a(new C0745Ti(c1799rNA28, c1799rNA5, c0540Hh, c0489Eh, 7))));
        C1799rN c1799rNA30 = C1799rN.a(new C0901aq(c1799rNA2, 20));
        C0591Kh c0591Kh = new C0591Kh(c0540Hh, c1799rNA5);
        int i8 = 1;
        C1799rN c1799rNA31 = C1799rN.a(new C1271hf(c1799rNA2, c0591Kh, c1799rNA3, i8));
        C1799rN c1799rNA32 = C1799rN.a(new C0682Pn(c0540Hh, c0642Nh, c1799rNA2, c1799rNA30, c0523Gh, c1799rNA3, c1799rNA31));
        this.f10952E = C1799rN.a(new C0902ar(C1799rN.a(new C0745Ti(c1799rNA32, c0591Kh, c0540Hh, c1799rNA3)), C1799rN.a(new C1381jj((InterfaceC2069wN) c1799rNA32, (InterfaceC1853sN) c0591Kh, (InterfaceC1853sN) c0540Hh, (InterfaceC2069wN) c1799rNA3, c1799rNA31, 15)), 11));
        C1907tN c1907tNA = C1907tN.a(this);
        this.f10954F = c1907tNA;
        C1799rN c1799rNA33 = C1799rN.a(new C2242zh(C1799rN.a(new C0506Fh(c0472Dh, 4)), C1799rN.a(new C0506Fh(c0472Dh, 0)), 2));
        this.f10956G = c1799rNA33;
        C1111ei c1111ei = new C1111ei(w9);
        this.f10958H = c1111ei;
        C1799rN c1799rNA34 = C1799rN.a(new C0523Gh(c0540Hh, 6));
        this.f10960I = c1799rNA34;
        C1799rN c1799rNA35 = C1799rN.a(AbstractC1114el.f13941J);
        C1799rN c1799rNA36 = C1799rN.a(new C0901aq(c1799rNA34, 23));
        this.f10962J = c1799rNA36;
        C1799rN c1799rNA37 = C1799rN.a(new C0663Ol(c0540Hh, c1799rNA35, interfaceC2069wNA, c1799rNA36, c1799rNA17, c1799rNA16));
        this.f10964K = c1799rNA37;
        C1799rN c1799rNA38 = C1799rN.a(new C0745Ti(c0540Hh, c1799rNA34, interfaceC2069wNA, c1799rNA5));
        this.f10966L = c1799rNA38;
        C1799rN c1799rNA39 = C1799rN.a(new C0901aq(c1799rNA33, 17));
        this.M = c1799rNA39;
        C1799rN c1799rNA40 = C1799rN.a(new C0574Jh(C1799rN.a(new C0131t(c0540Hh, c1799rNA, c1799rNA33, c0642Nh, c1111ei, c1799rNA34, c1799rNA37, c1799rNA5, c1799rNA38, c1799rNA39)), 3));
        this.f10969N = c1799rNA40;
        C1799rN c1799rNA41 = C1799rN.a(new A2.H(c0540Hh, c1799rNA4, 2));
        C1799rN c1799rNA42 = C1799rN.a(new A2.H(c0540Hh, c0642Nh, 0));
        this.f10971O = C1799rN.a(new C0127o(c1907tNA, c0540Hh, c1799rNA33, c1799rNA40, c1799rNA2, c1799rNA4, c1799rNA37, c0642Nh, new T9(c1799rNA2, c1799rNA41, c1799rNA42, c1799rNA4, 0), c1799rNA39, c1799rNA41, c1799rNA42));
        this.f10973P = C1799rN.a(new A2.v(c1799rNA4, i8));
        this.f10974Q = C1799rN.a(AbstractC0933bL.f13371v);
        this.f10975R = C1799rN.a(new A2.F(c0540Hh, i8));
        int i9 = 22;
        this.f10976S = C1799rN.a(new C1811ri(16, new C0902ar(C1799rN.a(new C1811ri(i9, new C0506Fh(c0472Dh, i8))), C1799rN.a(new C0527Gl(c1799rNA5, i9)), 12)));
        this.f10977T = new C0608Lh(c1907tNA);
        this.f10978U = new C0676Ph(c0540Hh, c1799rNA17);
        this.f10979V = C1799rN.a(AbstractC0933bL.f13362m);
        this.f10980W = new C0659Oh(c1799rNA29);
        this.f10981X = C1799rN.a(new C0733Sn(c1799rNA3, 5));
        int i10 = 0;
        C1799rN c1799rNA43 = C1799rN.a(new C0523Gh(c0540Hh, i10));
        this.f10982Y = c1799rNA43;
        C1799rN c1799rNA44 = C1799rN.a(new C0591Kh(c0540Hh, c1799rNA43, i10));
        this.f10983Z = c1799rNA44;
        this.f10985a0 = C1799rN.a(new C1271hf(new C0591Kh(c0540Hh, c1799rNA7, 2), c1799rNA3, c1799rNA5, 19));
        this.b0 = C1799rN.a(AbstractC0933bL.f13370u);
        Bs bs = new Bs(c1799rNA43, c1799rNA44, c0540Hh);
        this.f10988c0 = bs;
        this.f10990d0 = C1799rN.a(new C1271hf(bs, c1799rNA3, c1799rNA5, 25));
        this.f10992e0 = C1799rN.a(AbstractC2022vd.f17305u);
        C1284hs c1284hs = new C1284hs(c0540Hh);
        this.f10994f0 = c1284hs;
        this.f10996g0 = C1799rN.a(new C1271hf(c1284hs, c1799rNA3, c1799rNA5, 23));
        Js js = new Js(c0540Hh, c0642Nh, c0557Ih);
        this.f10998h0 = js;
        this.f10999i0 = C1799rN.a(new C1271hf(js, c1799rNA3, c1799rNA5, 26));
        Ts ts = new Ts(c0540Hh);
        this.f11001j0 = ts;
        this.f11003k0 = C1799rN.a(new C1271hf(ts, c1799rNA3, c1799rNA5, 27));
        this.f11005l0 = C1799rN.a(new C1271hf(new C0523Gh(c0540Hh, 7), c1799rNA3, c1799rNA5, 17));
        this.f11007m0 = C1799rN.a(new C0902ar(c1799rNA3, c1799rNA5, 2));
        this.f11009n0 = C1799rN.a(AbstractC0709Rg.f10935s);
        this.f11011o0 = C1799rN.a(new C0902ar(c1799rNA3, c1799rNA5, 3));
        Zr zr = new Zr(c1799rNA29);
        this.f11013p0 = zr;
        this.f11015q0 = C1799rN.a(new C1271hf(zr, c1799rNA3, c1799rNA5, 21));
        Ir ir = new Ir(c0540Hh);
        this.f11017r0 = ir;
        this.f11019s0 = C1799rN.a(new C1271hf(ir, c1799rNA3, c1799rNA5, 20));
        C1176fs c1176fs = new C1176fs(c0642Nh);
        this.f11021t0 = c1176fs;
        this.f11023u0 = C1799rN.a(new C1271hf(c1176fs, c1799rNA3, c1799rNA5, 22));
        C1799rN c1799rNA45 = C1799rN.a(new P7(4));
        this.v0 = c1799rNA45;
        C2037vs c2037vs = new C2037vs(c0540Hh, c1799rNA45);
        this.f11026w0 = c2037vs;
        this.f11028x0 = C1799rN.a(new C1271hf(c2037vs, c1799rNA3, c1799rNA5, 24));
        this.f11030y0 = C1799rN.a(AbstractC0709Rg.f10930n);
        C1799rN c1799rNA46 = C1799rN.a(new C0506Fh(c0472Dh, 6));
        this.f11032z0 = c1799rNA46;
        int i11 = 8;
        int i12 = 18;
        this.f10945A0 = C1799rN.a(new C1271hf(new C0523Gh(c0540Hh, i11), c1799rNA3, c1799rNA5, i12));
        this.f10947B0 = new C1434ki(c0540Hh);
        this.f10949C0 = C1799rN.a(AbstractC2022vd.f17306v);
        this.f10951D0 = C1799rN.a(AbstractC0933bL.f13373x);
        this.f10953E0 = C1799rN.a(new C0574Jh(c1799rNA9, 1));
        this.f10955F0 = new P7(i11);
        this.f10957G0 = C1799rN.a(new C0610Lj(c0540Hh, c0642Nh, c1799rNA17));
        this.f10959H0 = new C0796Wi(c1799rNA2, c1799rNA3, c1799rNA5);
        this.f10961I0 = C1799rN.a(AbstractC1114el.f13940I);
        this.f10963J0 = C1799rN.a(AbstractC0933bL.f13372w);
        this.f10965K0 = C1799rN.a(new C0523Gh(c0540Hh, 1));
        this.f10967L0 = C1799rN.a(new C0527Gl(c1799rNA5, i12));
        this.f10968M0 = C1799rN.a(AbstractC2022vd.f17295k);
        this.f10970N0 = C1799rN.a(new A2.D(c0540Hh, c1799rNA46, c1799rNA44, C1799rN.a(new A2.F(c0540Hh, 0)), c1799rNA2));
        this.f10972O0 = C1799rN.a(new C0523Gh(c0540Hh, 9));
    }

    public static C0710Rh a(Context context, InterfaceC0603Lc interfaceC0603Lc, int i) {
        ID id;
        SharedPreferences sharedPreferences;
        synchronized (C0710Rh.class) {
            try {
                C0710Rh c0710Rh = f10943P0;
                if (c0710Rh != null) {
                    return c0710Rh;
                }
                p2.j jVar = p2.j.f22785C;
                jVar.f22797k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                H9.a(context);
                if (((Boolean) AbstractC0994ca.f13571e.v()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", AbstractC2022vd.I(context, "init_without_write") + 1).commit();
                }
                C1338iu c1338iuO = C1338iu.o(context);
                boolean zG = C2911G.g((Context) c1338iuO.f14822b);
                C2951a c2951a = new C2951a(ModuleDescriptor.MODULE_VERSION, i, 0, true, zG);
                if (((Boolean) AbstractC1426ka.f15168c.v()).booleanValue()) {
                    InterfaceC2815e0 interfaceC2815e0 = (InterfaceC2815e0) c1338iuO.f14823c;
                    q2.L0 liteSdkVersion = null;
                    if (interfaceC2815e0 != null) {
                        try {
                            liteSdkVersion = interfaceC2815e0.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        c2951a = new C2951a(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.f23130b, 0, true, zG);
                    }
                }
                c1338iuO.y(interfaceC0603Lc);
                C0472Dh c0472Dh = new C0472Dh();
                c0472Dh.f7821a = c2951a;
                c0472Dh.f7824d = new WeakReference(context);
                c0472Dh.f7822b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                c0472Dh.f7823c = jCurrentTimeMillis;
                C0472Dh c0472Dh2 = new C0472Dh();
                c0472Dh2.f7821a = c0472Dh.f7821a;
                c0472Dh2.f7822b = c0472Dh.f7822b;
                c0472Dh2.f7824d = c0472Dh.f7824d;
                c0472Dh2.f7823c = c0472Dh.f7823c;
                C0710Rh c0710Rh2 = new C0710Rh(c0472Dh2, new W9(27));
                E9 e9 = H9.Ye;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    C0589Kf c0589Kf = jVar.f22792e;
                    C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                    Cr.v(c0623Mf);
                    c0589Kf.a(c0623Mf, (C0784Vn) c0710Rh2.f11000j.c(), context);
                    C0589Kf c0589Kf2 = jVar.f22792e;
                    if (c0589Kf2.f9493d.get() && c0589Kf2.f9495f >= 0 && c0589Kf2.f9496g >= 0 && c0589Kf2.f9494e.compareAndSet(false, true) && (id = c0589Kf2.f9490a) != null) {
                        ((C0623Mf) id).a(new RunnableC1883t(18, c0589Kf2));
                    }
                }
                ((C0819Xo) c0710Rh2.f11006m.c()).a();
                ((C2188yh) c0710Rh2.f11004l.c()).a(context, c2951a);
                jVar.f22795h.d(context, c2951a, (C0784Vn) c0710Rh2.f11000j.c());
                jVar.f22796j.d(context);
                jVar.f22790c.D(context);
                jVar.f22790c.E(context);
                com.bumptech.glide.c.R(context);
                jVar.f22794g.h(context);
                jVar.f22812z.a(context);
                if (((Boolean) c2841s.f23270c.a(H9.vf)).booleanValue()) {
                    String str = (String) c2841s.f23270c.a(H9.wf);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((C0495En) c0710Rh2.f10976S.c()).a(jVar.f22794g);
                        }
                    }
                } else if (((Boolean) c2841s.f23270c.a(H9.uf)).booleanValue()) {
                    ((C0495En) c0710Rh2.f10976S.c()).a(jVar.f22794g);
                }
                ((C2905A) c0710Rh2.f10975R.c()).a();
                C1431kf.n(context);
                if (((Boolean) c2841s.f23270c.a(H9.W6)).booleanValue()) {
                    if (!((Boolean) c2841s.f23270c.a(H9.f8683V0)).booleanValue()) {
                        A8 a8 = new A8(new A1.w(context, 7));
                        C0697Ql c0697Ql = new C0697Ql(new C0480Dp(context), 22, (ID) c0710Rh2.f10991e.c());
                        try {
                            c0697Ql.i(new P.g(new C1338iu(context, c2951a, a8, c0697Ql), jVar.f22795h.i().E()));
                        } catch (Exception e6) {
                            u2.k.e("Error in offline signals database startup: ".concat(String.valueOf(e6.getMessage())));
                        }
                    }
                }
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.of)).booleanValue()) {
                    Context context2 = c0710Rh2.f10984a.f7822b;
                    Cr.v(context2);
                    C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                    Cr.v(c0623Mf2);
                    c0623Mf2.execute(new RunnableC0558Ii(15, new C1338iu(c0710Rh2, context2, c0623Mf2)));
                }
                f10943P0 = c0710Rh2;
                return c0710Rh2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.f10987c.c();
    }

    public final Yu c() {
        return (Yu) this.f11020t.c();
    }
}
