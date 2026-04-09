package com.applovin.impl;

import N7.C1094a9;
import N7.C1154e9;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.i4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.AdRequest;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class l4 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public static final l4 f19693A;

    /* renamed from: A0, reason: collision with root package name */
    public static final l4 f19694A0;

    /* renamed from: A1, reason: collision with root package name */
    public static final l4 f19695A1;

    /* renamed from: A2, reason: collision with root package name */
    public static final l4 f19696A2;

    /* renamed from: A3, reason: collision with root package name */
    public static final l4 f19697A3;

    /* renamed from: A4, reason: collision with root package name */
    public static final l4 f19698A4;

    /* renamed from: A5, reason: collision with root package name */
    public static final l4 f19699A5;

    /* renamed from: A6, reason: collision with root package name */
    public static final l4 f19700A6;

    /* renamed from: B, reason: collision with root package name */
    public static final l4 f19701B;

    /* renamed from: B0, reason: collision with root package name */
    public static final l4 f19702B0;

    /* renamed from: B1, reason: collision with root package name */
    public static final l4 f19703B1;

    /* renamed from: B2, reason: collision with root package name */
    public static final l4 f19704B2;

    /* renamed from: B3, reason: collision with root package name */
    public static final l4 f19705B3;

    /* renamed from: B4, reason: collision with root package name */
    public static final l4 f19706B4;

    /* renamed from: B5, reason: collision with root package name */
    public static final l4 f19707B5;

    /* renamed from: B6, reason: collision with root package name */
    public static final l4 f19708B6;

    /* renamed from: C, reason: collision with root package name */
    public static final l4 f19709C;

    /* renamed from: C0, reason: collision with root package name */
    public static final l4 f19710C0;

    /* renamed from: C1, reason: collision with root package name */
    public static final l4 f19711C1;

    /* renamed from: C2, reason: collision with root package name */
    public static final l4 f19712C2;

    /* renamed from: C3, reason: collision with root package name */
    public static final l4 f19713C3;

    /* renamed from: C4, reason: collision with root package name */
    public static final l4 f19714C4;

    /* renamed from: C5, reason: collision with root package name */
    public static final l4 f19715C5;

    /* renamed from: C6, reason: collision with root package name */
    public static final l4 f19716C6;

    /* renamed from: D, reason: collision with root package name */
    public static final l4 f19717D;

    /* renamed from: D0, reason: collision with root package name */
    public static final l4 f19718D0;

    /* renamed from: D1, reason: collision with root package name */
    public static final l4 f19719D1;

    /* renamed from: D2, reason: collision with root package name */
    public static final l4 f19720D2;

    /* renamed from: D3, reason: collision with root package name */
    public static final l4 f19721D3;

    /* renamed from: D4, reason: collision with root package name */
    public static final l4 f19722D4;

    /* renamed from: D5, reason: collision with root package name */
    public static final l4 f19723D5;

    /* renamed from: D6, reason: collision with root package name */
    public static final l4 f19724D6;

    /* renamed from: E, reason: collision with root package name */
    public static final l4 f19725E;

    /* renamed from: E0, reason: collision with root package name */
    public static final l4 f19726E0;

    /* renamed from: E1, reason: collision with root package name */
    public static final l4 f19727E1;

    /* renamed from: E2, reason: collision with root package name */
    public static final l4 f19728E2;

    /* renamed from: E3, reason: collision with root package name */
    public static final l4 f19729E3;

    /* renamed from: E4, reason: collision with root package name */
    public static final l4 f19730E4;

    /* renamed from: E5, reason: collision with root package name */
    public static final l4 f19731E5;

    /* renamed from: E6, reason: collision with root package name */
    public static final l4 f19732E6;

    /* renamed from: F, reason: collision with root package name */
    public static final l4 f19733F;
    public static final l4 F0;

    /* renamed from: F1, reason: collision with root package name */
    public static final l4 f19734F1;

    /* renamed from: F2, reason: collision with root package name */
    public static final l4 f19735F2;

    /* renamed from: F3, reason: collision with root package name */
    public static final l4 f19736F3;

    /* renamed from: F4, reason: collision with root package name */
    public static final l4 f19737F4;

    /* renamed from: F5, reason: collision with root package name */
    public static final l4 f19738F5;

    /* renamed from: F6, reason: collision with root package name */
    public static final l4 f19739F6;

    /* renamed from: G, reason: collision with root package name */
    public static final l4 f19740G;

    /* renamed from: G0, reason: collision with root package name */
    public static final l4 f19741G0;

    /* renamed from: G1, reason: collision with root package name */
    public static final l4 f19742G1;

    /* renamed from: G2, reason: collision with root package name */
    public static final l4 f19743G2;

    /* renamed from: G3, reason: collision with root package name */
    public static final l4 f19744G3;

    /* renamed from: G4, reason: collision with root package name */
    public static final l4 f19745G4;

    /* renamed from: G5, reason: collision with root package name */
    public static final l4 f19746G5;

    /* renamed from: G6, reason: collision with root package name */
    public static final l4 f19747G6;

    /* renamed from: H, reason: collision with root package name */
    public static final l4 f19748H;

    /* renamed from: H0, reason: collision with root package name */
    public static final l4 f19749H0;

    /* renamed from: H1, reason: collision with root package name */
    public static final l4 f19750H1;

    /* renamed from: H2, reason: collision with root package name */
    public static final l4 f19751H2;

    /* renamed from: H3, reason: collision with root package name */
    public static final l4 f19752H3;

    /* renamed from: H4, reason: collision with root package name */
    public static final l4 f19753H4;

    /* renamed from: H5, reason: collision with root package name */
    public static final l4 f19754H5;

    /* renamed from: H6, reason: collision with root package name */
    public static final l4 f19755H6;

    /* renamed from: I, reason: collision with root package name */
    public static final l4 f19756I;

    /* renamed from: I0, reason: collision with root package name */
    public static final l4 f19757I0;

    /* renamed from: I1, reason: collision with root package name */
    public static final l4 f19758I1;

    /* renamed from: I2, reason: collision with root package name */
    public static final l4 f19759I2;

    /* renamed from: I3, reason: collision with root package name */
    public static final l4 f19760I3;

    /* renamed from: I4, reason: collision with root package name */
    public static final l4 f19761I4;

    /* renamed from: I5, reason: collision with root package name */
    public static final l4 f19762I5;

    /* renamed from: I6, reason: collision with root package name */
    public static final l4 f19763I6;

    /* renamed from: J, reason: collision with root package name */
    public static final l4 f19764J;

    /* renamed from: J0, reason: collision with root package name */
    public static final l4 f19765J0;

    /* renamed from: J1, reason: collision with root package name */
    public static final l4 f19766J1;

    /* renamed from: J2, reason: collision with root package name */
    public static final l4 f19767J2;

    /* renamed from: J3, reason: collision with root package name */
    public static final l4 f19768J3;

    /* renamed from: J4, reason: collision with root package name */
    public static final l4 f19769J4;

    /* renamed from: J5, reason: collision with root package name */
    public static final l4 f19770J5;

    /* renamed from: K, reason: collision with root package name */
    public static final l4 f19771K;

    /* renamed from: K0, reason: collision with root package name */
    public static final l4 f19772K0;

    /* renamed from: K1, reason: collision with root package name */
    public static final l4 f19773K1;

    /* renamed from: K2, reason: collision with root package name */
    public static final l4 f19774K2;

    /* renamed from: K3, reason: collision with root package name */
    public static final l4 f19775K3;

    /* renamed from: K4, reason: collision with root package name */
    public static final l4 f19776K4;

    /* renamed from: K5, reason: collision with root package name */
    public static final l4 f19777K5;

    /* renamed from: L, reason: collision with root package name */
    public static final l4 f19778L;

    /* renamed from: L0, reason: collision with root package name */
    public static final l4 f19779L0;

    /* renamed from: L1, reason: collision with root package name */
    public static final l4 f19780L1;

    /* renamed from: L2, reason: collision with root package name */
    public static final l4 f19781L2;

    /* renamed from: L3, reason: collision with root package name */
    public static final l4 f19782L3;

    /* renamed from: L4, reason: collision with root package name */
    public static final l4 f19783L4;

    /* renamed from: L5, reason: collision with root package name */
    public static final l4 f19784L5;

    /* renamed from: M, reason: collision with root package name */
    public static final l4 f19785M;

    /* renamed from: M0, reason: collision with root package name */
    public static final l4 f19786M0;

    /* renamed from: M1, reason: collision with root package name */
    public static final l4 f19787M1;

    /* renamed from: M2, reason: collision with root package name */
    public static final l4 f19788M2;

    /* renamed from: M3, reason: collision with root package name */
    public static final l4 f19789M3;

    /* renamed from: M4, reason: collision with root package name */
    public static final l4 f19790M4;

    /* renamed from: M5, reason: collision with root package name */
    public static final l4 f19791M5;

    /* renamed from: N, reason: collision with root package name */
    public static final l4 f19792N;

    /* renamed from: N0, reason: collision with root package name */
    public static final l4 f19793N0;
    public static final l4 N1;

    /* renamed from: N2, reason: collision with root package name */
    public static final l4 f19794N2;

    /* renamed from: N3, reason: collision with root package name */
    public static final l4 f19795N3;

    /* renamed from: N4, reason: collision with root package name */
    public static final l4 f19796N4;

    /* renamed from: N5, reason: collision with root package name */
    public static final l4 f19797N5;

    /* renamed from: O, reason: collision with root package name */
    public static final l4 f19798O;

    /* renamed from: O0, reason: collision with root package name */
    public static final l4 f19799O0;

    /* renamed from: O1, reason: collision with root package name */
    public static final l4 f19800O1;

    /* renamed from: O2, reason: collision with root package name */
    public static final l4 f19801O2;

    /* renamed from: O3, reason: collision with root package name */
    public static final l4 f19802O3;

    /* renamed from: O4, reason: collision with root package name */
    public static final l4 f19803O4;

    /* renamed from: O5, reason: collision with root package name */
    public static final l4 f19804O5;

    /* renamed from: P, reason: collision with root package name */
    public static final l4 f19805P;

    /* renamed from: P0, reason: collision with root package name */
    public static final l4 f19806P0;

    /* renamed from: P1, reason: collision with root package name */
    public static final l4 f19807P1;

    /* renamed from: P2, reason: collision with root package name */
    public static final l4 f19808P2;

    /* renamed from: P3, reason: collision with root package name */
    public static final l4 f19809P3;

    /* renamed from: P4, reason: collision with root package name */
    public static final l4 f19810P4;

    /* renamed from: P5, reason: collision with root package name */
    public static final l4 f19811P5;

    /* renamed from: Q, reason: collision with root package name */
    public static final l4 f19812Q;

    /* renamed from: Q0, reason: collision with root package name */
    public static final l4 f19813Q0;

    /* renamed from: Q1, reason: collision with root package name */
    public static final l4 f19814Q1;

    /* renamed from: Q2, reason: collision with root package name */
    public static final l4 f19815Q2;

    /* renamed from: Q3, reason: collision with root package name */
    public static final l4 f19816Q3;

    /* renamed from: Q4, reason: collision with root package name */
    public static final l4 f19817Q4;
    public static final l4 Q5;

    /* renamed from: R, reason: collision with root package name */
    public static final l4 f19818R;

    /* renamed from: R0, reason: collision with root package name */
    public static final l4 f19819R0;

    /* renamed from: R1, reason: collision with root package name */
    public static final l4 f19820R1;

    /* renamed from: R2, reason: collision with root package name */
    public static final l4 f19821R2;

    /* renamed from: R3, reason: collision with root package name */
    public static final l4 f19822R3;

    /* renamed from: R4, reason: collision with root package name */
    public static final l4 f19823R4;

    /* renamed from: R5, reason: collision with root package name */
    public static final l4 f19824R5;

    /* renamed from: S, reason: collision with root package name */
    public static final l4 f19825S;

    /* renamed from: S0, reason: collision with root package name */
    public static final l4 f19826S0;

    /* renamed from: S1, reason: collision with root package name */
    public static final l4 f19827S1;

    /* renamed from: S2, reason: collision with root package name */
    public static final l4 f19828S2;

    /* renamed from: S3, reason: collision with root package name */
    public static final l4 f19829S3;

    /* renamed from: S4, reason: collision with root package name */
    public static final l4 f19830S4;

    /* renamed from: S5, reason: collision with root package name */
    public static final l4 f19831S5;

    /* renamed from: T, reason: collision with root package name */
    public static final l4 f19832T;

    /* renamed from: T0, reason: collision with root package name */
    public static final l4 f19833T0;

    /* renamed from: T1, reason: collision with root package name */
    public static final l4 f19834T1;

    /* renamed from: T2, reason: collision with root package name */
    public static final l4 f19835T2;

    /* renamed from: T3, reason: collision with root package name */
    public static final l4 f19836T3;

    /* renamed from: T4, reason: collision with root package name */
    public static final l4 f19837T4;

    /* renamed from: T5, reason: collision with root package name */
    public static final l4 f19838T5;

    /* renamed from: U, reason: collision with root package name */
    public static final l4 f19839U;

    /* renamed from: U0, reason: collision with root package name */
    public static final l4 f19840U0;

    /* renamed from: U1, reason: collision with root package name */
    public static final l4 f19841U1;

    /* renamed from: U2, reason: collision with root package name */
    public static final l4 f19842U2;

    /* renamed from: U3, reason: collision with root package name */
    public static final l4 f19843U3;

    /* renamed from: U4, reason: collision with root package name */
    public static final l4 f19844U4;

    /* renamed from: U5, reason: collision with root package name */
    public static final l4 f19845U5;

    /* renamed from: V, reason: collision with root package name */
    public static final l4 f19846V;

    /* renamed from: V0, reason: collision with root package name */
    public static final l4 f19847V0;

    /* renamed from: V1, reason: collision with root package name */
    public static final l4 f19848V1;

    /* renamed from: V2, reason: collision with root package name */
    public static final l4 f19849V2;

    /* renamed from: V3, reason: collision with root package name */
    public static final l4 f19850V3;

    /* renamed from: V4, reason: collision with root package name */
    public static final l4 f19851V4;

    /* renamed from: V5, reason: collision with root package name */
    public static final l4 f19852V5;

    /* renamed from: W, reason: collision with root package name */
    public static final l4 f19853W;

    /* renamed from: W0, reason: collision with root package name */
    public static final l4 f19854W0;

    /* renamed from: W1, reason: collision with root package name */
    public static final l4 f19855W1;

    /* renamed from: W2, reason: collision with root package name */
    public static final l4 f19856W2;

    /* renamed from: W3, reason: collision with root package name */
    public static final l4 f19857W3;

    /* renamed from: W4, reason: collision with root package name */
    public static final l4 f19858W4;

    /* renamed from: W5, reason: collision with root package name */
    public static final l4 f19859W5;

    /* renamed from: X, reason: collision with root package name */
    public static final l4 f19860X;

    /* renamed from: X0, reason: collision with root package name */
    public static final l4 f19861X0;

    /* renamed from: X1, reason: collision with root package name */
    public static final l4 f19862X1;

    /* renamed from: X2, reason: collision with root package name */
    public static final l4 f19863X2;
    public static final l4 X3;

    /* renamed from: X4, reason: collision with root package name */
    public static final l4 f19864X4;

    /* renamed from: X5, reason: collision with root package name */
    public static final l4 f19865X5;

    /* renamed from: Y, reason: collision with root package name */
    public static final l4 f19866Y;

    /* renamed from: Y0, reason: collision with root package name */
    public static final l4 f19867Y0;

    /* renamed from: Y1, reason: collision with root package name */
    public static final l4 f19868Y1;

    /* renamed from: Y2, reason: collision with root package name */
    public static final l4 f19869Y2;

    /* renamed from: Y3, reason: collision with root package name */
    public static final l4 f19870Y3;

    /* renamed from: Y4, reason: collision with root package name */
    public static final l4 f19871Y4;

    /* renamed from: Y5, reason: collision with root package name */
    public static final l4 f19872Y5;

    /* renamed from: Z, reason: collision with root package name */
    public static final l4 f19873Z;

    /* renamed from: Z0, reason: collision with root package name */
    public static final l4 f19874Z0;

    /* renamed from: Z1, reason: collision with root package name */
    public static final l4 f19875Z1;

    /* renamed from: Z2, reason: collision with root package name */
    public static final l4 f19876Z2;

    /* renamed from: Z3, reason: collision with root package name */
    public static final l4 f19877Z3;

    /* renamed from: Z4, reason: collision with root package name */
    public static final l4 f19878Z4;

    /* renamed from: Z5, reason: collision with root package name */
    public static final l4 f19879Z5;

    /* renamed from: a0, reason: collision with root package name */
    public static final l4 f19880a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final l4 f19881a1;

    /* renamed from: a2, reason: collision with root package name */
    public static final l4 f19882a2;

    /* renamed from: a3, reason: collision with root package name */
    public static final l4 f19883a3;

    /* renamed from: a4, reason: collision with root package name */
    public static final l4 f19884a4;

    /* renamed from: a5, reason: collision with root package name */
    public static final l4 f19885a5;

    /* renamed from: a6, reason: collision with root package name */
    public static final l4 f19886a6;

    /* renamed from: b0, reason: collision with root package name */
    public static final l4 f19887b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final l4 f19888b1;

    /* renamed from: b2, reason: collision with root package name */
    public static final l4 f19889b2;

    /* renamed from: b3, reason: collision with root package name */
    public static final l4 f19890b3;

    /* renamed from: b4, reason: collision with root package name */
    public static final l4 f19891b4;

    /* renamed from: b5, reason: collision with root package name */
    public static final l4 f19892b5;

    /* renamed from: b6, reason: collision with root package name */
    public static final l4 f19893b6;

    /* renamed from: c0, reason: collision with root package name */
    public static final l4 f19895c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final l4 f19896c1;

    /* renamed from: c2, reason: collision with root package name */
    public static final l4 f19897c2;

    /* renamed from: c3, reason: collision with root package name */
    public static final l4 f19898c3;

    /* renamed from: c4, reason: collision with root package name */
    public static final l4 f19899c4;

    /* renamed from: c5, reason: collision with root package name */
    public static final l4 f19900c5;

    /* renamed from: c6, reason: collision with root package name */
    public static final l4 f19901c6;

    /* renamed from: d0, reason: collision with root package name */
    public static final l4 f19903d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final l4 f19904d1;

    /* renamed from: d2, reason: collision with root package name */
    public static final l4 f19905d2;

    /* renamed from: d3, reason: collision with root package name */
    public static final l4 f19906d3;

    /* renamed from: d4, reason: collision with root package name */
    public static final l4 f19907d4;

    /* renamed from: d5, reason: collision with root package name */
    public static final l4 f19908d5;

    /* renamed from: d6, reason: collision with root package name */
    public static final l4 f19909d6;

    /* renamed from: e, reason: collision with root package name */
    public static final l4 f19910e;

    /* renamed from: e0, reason: collision with root package name */
    public static final l4 f19911e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final l4 f19912e1;

    /* renamed from: e2, reason: collision with root package name */
    public static final l4 f19913e2;

    /* renamed from: e3, reason: collision with root package name */
    public static final l4 f19914e3;
    public static final l4 e4;

    /* renamed from: e5, reason: collision with root package name */
    public static final l4 f19915e5;

    /* renamed from: e6, reason: collision with root package name */
    public static final l4 f19916e6;

    /* renamed from: f, reason: collision with root package name */
    public static final l4 f19917f;

    /* renamed from: f0, reason: collision with root package name */
    public static final l4 f19918f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final l4 f19919f1;

    /* renamed from: f2, reason: collision with root package name */
    public static final l4 f19920f2;

    /* renamed from: f3, reason: collision with root package name */
    public static final l4 f19921f3;

    /* renamed from: f4, reason: collision with root package name */
    public static final l4 f19922f4;

    /* renamed from: f5, reason: collision with root package name */
    public static final l4 f19923f5;

    /* renamed from: f6, reason: collision with root package name */
    public static final l4 f19924f6;

    /* renamed from: g, reason: collision with root package name */
    public static final l4 f19925g;

    /* renamed from: g0, reason: collision with root package name */
    public static final l4 f19926g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final l4 f19927g1;

    /* renamed from: g2, reason: collision with root package name */
    public static final l4 f19928g2;

    /* renamed from: g3, reason: collision with root package name */
    public static final l4 f19929g3;

    /* renamed from: g4, reason: collision with root package name */
    public static final l4 f19930g4;

    /* renamed from: g5, reason: collision with root package name */
    public static final l4 f19931g5;

    /* renamed from: g6, reason: collision with root package name */
    public static final l4 f19932g6;

    /* renamed from: h, reason: collision with root package name */
    public static final l4 f19933h;

    /* renamed from: h0, reason: collision with root package name */
    public static final l4 f19934h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final l4 f19935h1;

    /* renamed from: h2, reason: collision with root package name */
    public static final l4 f19936h2;

    /* renamed from: h3, reason: collision with root package name */
    public static final l4 f19937h3;

    /* renamed from: h4, reason: collision with root package name */
    public static final l4 f19938h4;

    /* renamed from: h5, reason: collision with root package name */
    public static final l4 f19939h5;

    /* renamed from: h6, reason: collision with root package name */
    public static final l4 f19940h6;
    public static final l4 i;

    /* renamed from: i0, reason: collision with root package name */
    public static final l4 f19941i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final l4 f19942i1;

    /* renamed from: i2, reason: collision with root package name */
    public static final l4 f19943i2;

    /* renamed from: i3, reason: collision with root package name */
    public static final l4 f19944i3;

    /* renamed from: i4, reason: collision with root package name */
    public static final l4 f19945i4;

    /* renamed from: i5, reason: collision with root package name */
    public static final l4 f19946i5;

    /* renamed from: i6, reason: collision with root package name */
    public static final l4 f19947i6;

    /* renamed from: j, reason: collision with root package name */
    public static final l4 f19948j;

    /* renamed from: j0, reason: collision with root package name */
    public static final l4 f19949j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final l4 f19950j1;

    /* renamed from: j2, reason: collision with root package name */
    public static final l4 f19951j2;

    /* renamed from: j3, reason: collision with root package name */
    public static final l4 f19952j3;
    public static final l4 j4;

    /* renamed from: j5, reason: collision with root package name */
    public static final l4 f19953j5;

    /* renamed from: j6, reason: collision with root package name */
    public static final l4 f19954j6;

    /* renamed from: k, reason: collision with root package name */
    public static final l4 f19955k;

    /* renamed from: k0, reason: collision with root package name */
    public static final l4 f19956k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final l4 f19957k1;

    /* renamed from: k2, reason: collision with root package name */
    public static final l4 f19958k2;

    /* renamed from: k3, reason: collision with root package name */
    public static final l4 f19959k3;

    /* renamed from: k4, reason: collision with root package name */
    public static final l4 f19960k4;

    /* renamed from: k5, reason: collision with root package name */
    public static final l4 f19961k5;

    /* renamed from: k6, reason: collision with root package name */
    public static final l4 f19962k6;

    /* renamed from: l, reason: collision with root package name */
    public static final l4 f19963l;

    /* renamed from: l0, reason: collision with root package name */
    public static final l4 f19964l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final l4 f19965l1;

    /* renamed from: l2, reason: collision with root package name */
    public static final l4 f19966l2;

    /* renamed from: l3, reason: collision with root package name */
    public static final l4 f19967l3;

    /* renamed from: l4, reason: collision with root package name */
    public static final l4 f19968l4;
    public static final l4 l5;

    /* renamed from: l6, reason: collision with root package name */
    public static final l4 f19969l6;

    /* renamed from: m, reason: collision with root package name */
    public static final l4 f19970m;

    /* renamed from: m0, reason: collision with root package name */
    public static final l4 f19971m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final l4 f19972m1;

    /* renamed from: m2, reason: collision with root package name */
    public static final l4 f19973m2;

    /* renamed from: m3, reason: collision with root package name */
    public static final l4 f19974m3;

    /* renamed from: m4, reason: collision with root package name */
    public static final l4 f19975m4;

    /* renamed from: m5, reason: collision with root package name */
    public static final l4 f19976m5;

    /* renamed from: m6, reason: collision with root package name */
    public static final l4 f19977m6;

    /* renamed from: n, reason: collision with root package name */
    public static final l4 f19978n;

    /* renamed from: n0, reason: collision with root package name */
    public static final l4 f19979n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final l4 f19980n1;

    /* renamed from: n2, reason: collision with root package name */
    public static final l4 f19981n2;

    /* renamed from: n3, reason: collision with root package name */
    public static final l4 f19982n3;

    /* renamed from: n4, reason: collision with root package name */
    public static final l4 f19983n4;

    /* renamed from: n5, reason: collision with root package name */
    public static final l4 f19984n5;

    /* renamed from: n6, reason: collision with root package name */
    public static final l4 f19985n6;

    /* renamed from: o, reason: collision with root package name */
    public static final l4 f19986o;

    /* renamed from: o0, reason: collision with root package name */
    public static final l4 f19987o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final l4 f19988o1;

    /* renamed from: o2, reason: collision with root package name */
    public static final l4 f19989o2;

    /* renamed from: o3, reason: collision with root package name */
    public static final l4 f19990o3;

    /* renamed from: o4, reason: collision with root package name */
    public static final l4 f19991o4;

    /* renamed from: o5, reason: collision with root package name */
    public static final l4 f19992o5;

    /* renamed from: o6, reason: collision with root package name */
    public static final l4 f19993o6;

    /* renamed from: p, reason: collision with root package name */
    public static final l4 f19994p;

    /* renamed from: p0, reason: collision with root package name */
    public static final l4 f19995p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final l4 f19996p1;

    /* renamed from: p2, reason: collision with root package name */
    public static final l4 f19997p2;

    /* renamed from: p3, reason: collision with root package name */
    public static final l4 f19998p3;

    /* renamed from: p4, reason: collision with root package name */
    public static final l4 f19999p4;

    /* renamed from: p5, reason: collision with root package name */
    public static final l4 f20000p5;

    /* renamed from: p6, reason: collision with root package name */
    public static final l4 f20001p6;

    /* renamed from: q, reason: collision with root package name */
    public static final l4 f20002q;

    /* renamed from: q0, reason: collision with root package name */
    public static final l4 f20003q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final l4 f20004q1;

    /* renamed from: q2, reason: collision with root package name */
    public static final l4 f20005q2;

    /* renamed from: q3, reason: collision with root package name */
    public static final l4 f20006q3;

    /* renamed from: q4, reason: collision with root package name */
    public static final l4 f20007q4;

    /* renamed from: q5, reason: collision with root package name */
    public static final l4 f20008q5;

    /* renamed from: q6, reason: collision with root package name */
    public static final l4 f20009q6;

    /* renamed from: r, reason: collision with root package name */
    public static final l4 f20010r;

    /* renamed from: r0, reason: collision with root package name */
    public static final l4 f20011r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final l4 f20012r1;

    /* renamed from: r2, reason: collision with root package name */
    public static final l4 f20013r2;

    /* renamed from: r3, reason: collision with root package name */
    public static final l4 f20014r3;

    /* renamed from: r4, reason: collision with root package name */
    public static final l4 f20015r4;

    /* renamed from: r5, reason: collision with root package name */
    public static final l4 f20016r5;

    /* renamed from: r6, reason: collision with root package name */
    public static final l4 f20017r6;

    /* renamed from: s, reason: collision with root package name */
    public static final l4 f20018s;

    /* renamed from: s0, reason: collision with root package name */
    public static final l4 f20019s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final l4 f20020s1;

    /* renamed from: s2, reason: collision with root package name */
    public static final l4 f20021s2;

    /* renamed from: s3, reason: collision with root package name */
    public static final l4 f20022s3;

    /* renamed from: s4, reason: collision with root package name */
    public static final l4 f20023s4;

    /* renamed from: s5, reason: collision with root package name */
    public static final l4 f20024s5;

    /* renamed from: s6, reason: collision with root package name */
    public static final l4 f20025s6;

    /* renamed from: t, reason: collision with root package name */
    public static final l4 f20026t;

    /* renamed from: t0, reason: collision with root package name */
    public static final l4 f20027t0;

    /* renamed from: t1, reason: collision with root package name */
    public static final l4 f20028t1;

    /* renamed from: t2, reason: collision with root package name */
    public static final l4 f20029t2;

    /* renamed from: t3, reason: collision with root package name */
    public static final l4 f20030t3;

    /* renamed from: t4, reason: collision with root package name */
    public static final l4 f20031t4;

    /* renamed from: t5, reason: collision with root package name */
    public static final l4 f20032t5;

    /* renamed from: t6, reason: collision with root package name */
    public static final l4 f20033t6;

    /* renamed from: u, reason: collision with root package name */
    public static final l4 f20034u;

    /* renamed from: u0, reason: collision with root package name */
    public static final l4 f20035u0;

    /* renamed from: u1, reason: collision with root package name */
    public static final l4 f20036u1;

    /* renamed from: u2, reason: collision with root package name */
    public static final l4 f20037u2;

    /* renamed from: u3, reason: collision with root package name */
    public static final l4 f20038u3;

    /* renamed from: u4, reason: collision with root package name */
    public static final l4 f20039u4;

    /* renamed from: u5, reason: collision with root package name */
    public static final l4 f20040u5;

    /* renamed from: u6, reason: collision with root package name */
    public static final l4 f20041u6;

    /* renamed from: v, reason: collision with root package name */
    public static final l4 f20042v;

    /* renamed from: v0, reason: collision with root package name */
    public static final l4 f20043v0;

    /* renamed from: v1, reason: collision with root package name */
    public static final l4 f20044v1;

    /* renamed from: v2, reason: collision with root package name */
    public static final l4 f20045v2;

    /* renamed from: v3, reason: collision with root package name */
    public static final l4 f20046v3;

    /* renamed from: v4, reason: collision with root package name */
    public static final l4 f20047v4;

    /* renamed from: v5, reason: collision with root package name */
    public static final l4 f20048v5;

    /* renamed from: v6, reason: collision with root package name */
    public static final l4 f20049v6;

    /* renamed from: w, reason: collision with root package name */
    public static final l4 f20050w;

    /* renamed from: w0, reason: collision with root package name */
    public static final l4 f20051w0;

    /* renamed from: w1, reason: collision with root package name */
    public static final l4 f20052w1;

    /* renamed from: w2, reason: collision with root package name */
    public static final l4 f20053w2;

    /* renamed from: w3, reason: collision with root package name */
    public static final l4 f20054w3;

    /* renamed from: w4, reason: collision with root package name */
    public static final l4 f20055w4;

    /* renamed from: w5, reason: collision with root package name */
    public static final l4 f20056w5;

    /* renamed from: w6, reason: collision with root package name */
    public static final l4 f20057w6;

    /* renamed from: x, reason: collision with root package name */
    public static final l4 f20058x;

    /* renamed from: x0, reason: collision with root package name */
    public static final l4 f20059x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final l4 f20060x1;

    /* renamed from: x2, reason: collision with root package name */
    public static final l4 f20061x2;

    /* renamed from: x3, reason: collision with root package name */
    public static final l4 f20062x3;

    /* renamed from: x4, reason: collision with root package name */
    public static final l4 f20063x4;

    /* renamed from: x5, reason: collision with root package name */
    public static final l4 f20064x5;

    /* renamed from: x6, reason: collision with root package name */
    public static final l4 f20065x6;

    /* renamed from: y, reason: collision with root package name */
    public static final l4 f20066y;

    /* renamed from: y0, reason: collision with root package name */
    public static final l4 f20067y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final l4 f20068y1;

    /* renamed from: y2, reason: collision with root package name */
    public static final l4 f20069y2;

    /* renamed from: y3, reason: collision with root package name */
    public static final l4 f20070y3;

    /* renamed from: y4, reason: collision with root package name */
    public static final l4 f20071y4;

    /* renamed from: y5, reason: collision with root package name */
    public static final l4 f20072y5;

    /* renamed from: y6, reason: collision with root package name */
    public static final l4 f20073y6;

    /* renamed from: z, reason: collision with root package name */
    public static final l4 f20074z;

    /* renamed from: z0, reason: collision with root package name */
    public static final l4 f20075z0;

    /* renamed from: z1, reason: collision with root package name */
    public static final l4 f20076z1;

    /* renamed from: z2, reason: collision with root package name */
    public static final l4 f20077z2;

    /* renamed from: z3, reason: collision with root package name */
    public static final l4 f20078z3;

    /* renamed from: z4, reason: collision with root package name */
    public static final l4 f20079z4;

    /* renamed from: z5, reason: collision with root package name */
    public static final l4 f20080z5;

    /* renamed from: z6, reason: collision with root package name */
    public static final l4 f20081z6;

    /* renamed from: a, reason: collision with root package name */
    private final String f20082a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20083b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f19894c = Arrays.asList(Boolean.class, Float.class, Double.class, Integer.class, Long.class, String.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Map f19902d = new HashMap(AdRequest.MAX_CONTENT_URL_LENGTH);

    static {
        Boolean bool = Boolean.FALSE;
        f19910e = a("is_disabled", bool);
        f19917f = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f19925g = a("rss", bool2);
        f19933h = a("rssoitf", bool);
        i = a("cpoitf", bool);
        f19948j = a("device_token", "");
        f19955k = a("is_verbose_logging", bool);
        f19963l = a("sc", "");
        f19970m = a("sc2", "");
        f19978n = a("sc3", "");
        f19986o = a("server_installed_at", "");
        f19994p = a("clear_completion_callback_on_failure", bool);
        f20002q = a("sicd_ms", 0L);
        f20010r = a("logcat_max_line_size", 1000);
        f20018s = a("exception_handler_enabled", bool2);
        f20026t = a("md", "");
        f20034u = a("ps_atu", "");
        f20042v = a("lsu", bool);
        f20050w = a("tla_ms", -1L);
        f20058x = a("uactlac", bool);
        f20066y = a("vsk", bool);
        f20074z = a("error_reporter_v1_sample_percent", 100);
        f19693A = a("health_events_reporter_v1_endpoint", "https://sts.applovin.com/v1/stats/sdk");
        f19701B = a("health_events_reporter_v1_event_level_sampling_percentages", "");
        Float fValueOf = Float.valueOf(-1.0f);
        f19709C = a("health_events_reporter_v1_ad_sampling_percent", fValueOf);
        f19717D = a("health_events_reporter_v1_error_sampling_percent", fValueOf);
        f19725E = a("health_events_reporter_v1_user_session_sampling_percent", fValueOf);
        f19733F = a("health_events_reporter_v1_sampling_percent", Float.valueOf(1.0f));
        f19740G = a("health_events_reporter_v1_batch_grouped_events", bool);
        f19748H = a("health_events_reporter_should_skip_al_events_in_max", bool);
        f19756I = a("health_events_reporter_valid_network_status_codes", "");
        f19764J = a("health_events_reporter_include_cached_asset_info", bool);
        f19771K = a("health_events_reporter_include_html_source", bool);
        f19778L = a("stps", 2);
        f19785M = a("auxiliary_operations_threads", 1);
        f19792N = a("apsobt", bool2);
        f19798O = a("tmtp", 1);
        f19805P = a("network_thread_count", 2);
        f19812Q = a("ntp", 5);
        f19818R = a("ueq", bool);
        f19825S = a("coretc", 1);
        f19832T = a("cachetc", 1);
        f19839U = a("mtc", 1);
        f19846V = a("ttc", 1);
        f19853W = a("otc", 1);
        f19860X = a("uaeq", bool);
        f19866Y = a("ubsm", bool);
        f19873Z = a("ah_cvc", bool2);
        f19880a0 = a("ah_cdde", bool2);
        f19887b0 = a("ah_crut", bool2);
        f19895c0 = a("ah_sae", bool2);
        f19903d0 = a("ah_mvcwges", -1);
        f19911e0 = a("init_omsdk", bool2);
        f19918f0 = a("omsdk_partner_name", "applovin");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f19926g0 = C1154e9.f(timeUnit, 1L, "ttc_max_click_duration_ms");
        f19934h0 = a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        f19941i0 = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        f19949j0 = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        f19956k0 = a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        f19964l0 = a("ttc_edge_buffer_dp", 0);
        f19971m0 = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f19979n0 = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f19987o0 = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        f19995p0 = a("adserver_endpoint", "https://a.applovin.com/");
        f20003q0 = a("adserver_backup_endpoint", "https://a.applvn.com/");
        f20011r0 = a("api_endpoint", "https://d.applovin.com/");
        f20019s0 = a("api_backup_endpoint", "https://d.applvn.com/");
        f20027t0 = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        f20035u0 = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        f20043v0 = a("eete", "https://b.applovin.com/");
        f20051w0 = a("eetbe", "");
        f20059x0 = a("webview_network_error_endpoints_to_report", "applovin.com,applvn.com");
        f20067y0 = a("token_type_prefixes_r", "4!");
        f20075z0 = a("token_type_prefixes_arj", "json_v3!");
        f19694A0 = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        f19702B0 = a("axon_events", C1094a9.i(new CharSequence[]{"page_view", "view_item", "add_to_cart", "begin_checkout", "purchase", "add_payment_info", "generate_lead", AppLovinEventTypes.USER_LOGGED_IN, "sign_up", AppLovinEventTypes.USER_EXECUTED_SEARCH, "subscribe", "remove_from_cart"}));
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        f19710C0 = a("cache_file_ttl_seconds", Long.valueOf(timeUnit2.toSeconds(1L)));
        f19718D0 = a("cache_max_size_mb", -1);
        f19726E0 = a("precache_delimiters", ")]', ");
        F0 = a("ad_resource_caching_enabled", bool2);
        f19741G0 = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        f19749H0 = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        f19757I0 = a("resource_max_filename_length", Integer.valueOf(KotlinVersion.MAX_COMPONENT_VALUE));
        f19765J0 = a("dfirf", bool);
        f19772K0 = a("dfipf", bool);
        f19779L0 = a("dcrome", bool);
        f19786M0 = a("dcrobs", bool);
        f19793N0 = a("pcro", bool);
        f19799O0 = a("serfaad", bool);
        f19806P0 = a("mdafra", 1);
        f19813Q0 = a("ssch", bool2);
        f19819R0 = a("suaf", bool);
        f19826S0 = a("lfblrs", bool);
        f19833T0 = a("ape", bool);
        f19840U0 = a("pafqi", bool);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        f19847V0 = C1154e9.f(timeUnit3, 5L, "pae_ms");
        f19854W0 = C1154e9.f(timeUnit, 5L, "pamttl_ms");
        f19861X0 = a("saewib", bool);
        f19867Y0 = a("fsae_ms", -1L);
        f19874Z0 = a("raae", bool);
        f19881a1 = a("vr_retry_count_v1", 1);
        f19888b1 = a("cr_retry_count_v1", 1);
        f19896c1 = a("text_incent_warning_title", "Attention!");
        f19904d1 = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
        f19912e1 = a("text_incent_warning_close_option", "Close");
        f19919f1 = a("text_incent_warning_continue_option", "Keep Watching");
        f19927g1 = a("close_button_touch_area", 0);
        f19935h1 = a("close_button_outside_touch_area", 0);
        f19942i1 = a("creative_debugger_enabled", bool2);
        f19950j1 = a("smdfhcdb", bool2);
        f19957k1 = a("use_background_view_for_ad_clicks", bool2);
        f19965l1 = C1154e9.f(timeUnit, 1L, "viewability_adview_imp_delay_ms");
        f19972m1 = a("viewability_adview_banner_min_width", Integer.valueOf(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE));
        f19980n1 = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        f19988o1 = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f19996p1 = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f20004q1 = a("viewability_adview_leader_min_width", 728);
        f20012r1 = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f20020s1 = a("viewability_adview_native_min_width", 0);
        f20028t1 = a("viewability_adview_native_min_height", 0);
        f20036u1 = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        f20044v1 = C1154e9.f(timeUnit, 1L, "viewability_timer_min_visible_ms");
        f20052w1 = a("viewability_timer_interval_ms", 100L);
        f20060x1 = a("expandable_close_button_size", 27);
        f20068y1 = a("expandable_h_close_button_margin", 10);
        f20076z1 = a("expandable_t_close_button_margin", 10);
        f19695A1 = a("expandable_lhs_close_button", bool);
        f19703B1 = a("expandable_close_button_touch_area", 0);
        f19711C1 = a("forward_lifecycle_events_to_adview_webview", bool);
        f19719D1 = a("forward_in_app_browser_events_to_adview_webview", bool);
        f19727E1 = a("forward_external_redirect_events_to_adview_webview", bool);
        f19734F1 = a("forward_preload_events_to_adview_webview", bool);
        f19742G1 = a("iaad", bool);
        f19750H1 = C1154e9.f(timeUnit, 10L, "fullscreen_ad_pending_display_state_timeout_ms");
        f19758I1 = C1154e9.f(timeUnit3, 2L, "fullscreen_ad_showing_state_timeout_ms");
        f19766J1 = a("lhs_close_button_video", bool);
        f19773K1 = a("close_button_right_margin_video", 4);
        f19780L1 = a("close_button_size_video", 30);
        f19787M1 = a("close_button_top_margin_video", 8);
        N1 = a("video_countdown_clock_margin", 10);
        f19800O1 = a("video_countdown_clock_gravity", 83);
        f19807P1 = a("countdown_clock_size", 32);
        f19814Q1 = a("countdown_clock_stroke_size", 4);
        f19820R1 = a("countdown_clock_text_size", 28);
        f19827S1 = a("draw_countdown_clock", bool2);
        f19834T1 = a("inter_display_delay", 200L);
        f19841U1 = a("maximum_close_button_delay_seconds", 999L);
        f19848V1 = a("respect_close_button", bool2);
        f19855W1 = a("lhs_skip_button", bool2);
        f19862X1 = a("track_app_killed", bool);
        f19868Y1 = a("track_ad_duration", bool);
        f19875Z1 = C1154e9.f(timeUnit, 1L, "track_ad_duration_interval_ms");
        f19882a2 = a("simplified_app_killed_detection", bool);
        f19889b2 = C1154e9.f(timeUnit, 60L, "app_closed_time_threshold_for_app_killed_event_ms");
        f19897c2 = a("mute_controls_enabled", bool);
        f19905d2 = a("allow_user_muting", bool2);
        f19913e2 = a("mute_videos", bool);
        f19920f2 = a("show_mute_by_default", bool);
        f19928g2 = a("mute_with_user_settings", bool2);
        f19936h2 = a("mute_button_size", 32);
        f19943i2 = a("mute_button_margin", 10);
        f19951j2 = a("mute_button_gravity", 85);
        f19958k2 = a("progress_bar_step", 25L);
        f19966l2 = a("progress_bar_scale", 10000);
        f19973m2 = a("progress_bar_vertical_padding", -8);
        f19981n2 = a("vs_buffer_indicator_size", 50);
        f19989o2 = a("video_zero_length_as_computed", bool);
        f19997p2 = a("set_poststitial_muted_initial_delay_ms", 500L);
        f20005q2 = a("fasuic", bool2);
        f20013r2 = a("fsahrpg", bool2);
        f20021s2 = a("eaafrwsoa", bool2);
        f20029t2 = a("postitial_progress_bar_step_ms", 25L);
        f20037u2 = a("postitial_progress_bar_on_bottom", bool2);
        f20045v2 = a("postitial_progress_bar_vertical_padding", -8);
        f20053w2 = a("postitial_progress_bar_scale", 10000);
        f20061x2 = a("fahosu", bool);
        f20069y2 = a("system_insets_mask", Integer.valueOf(a7.f()));
        f20077z2 = a("nsuttcl", bool);
        f19696A2 = a("submit_postback_timeout", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f19704B2 = a("submit_postback_retries", 4);
        f19712C2 = a("max_postback_attempts", 3);
        f19720D2 = a("max_persisted_postbacks", 100);
        f19728E2 = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit.toMillis(7L)));
        f19735F2 = a("sossp", bool);
        f19743G2 = a("spp", bool2);
        f19751H2 = a("fire_native_ad_postbacks_from_webview", bool);
        f19759I2 = a("use_requests_for_native_ad_click_postbacks", bool);
        f19767J2 = a("preload_postback_webview", bool);
        f19774K2 = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f19781L2 = a("http_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f19788M2 = a("http_socket_timeout", Integer.valueOf((int) timeUnit.toMillis(20L)));
        f19794N2 = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f19801O2 = a("fetch_ad_retry_count_v1", 1);
        f19808P2 = a("faer", bool);
        f19815Q2 = a("faroae", bool);
        f19821R2 = a("submit_data_retry_count_v1", 1);
        f19828S2 = a("response_buffer_size", 16000);
        f19835T2 = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f19842U2 = a("fetch_basic_settings_retry_count", 3);
        f19849V2 = a("fetch_basic_settings_on_reconnect", bool);
        f19856W2 = a("skip_fetch_basic_settings_if_not_connected", bool);
        f19863X2 = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit.toMillis(2L)));
        f19869Y2 = a("idflrwbe", bool);
        f19876Z2 = a("falawpr", bool);
        f19883a3 = a("sort_query_parameters", bool);
        f19890b3 = C1154e9.f(timeUnit, 10L, "communicator_request_timeout_ms");
        f19898c3 = a("communicator_request_retry_count", 3);
        f19906d3 = C1154e9.f(timeUnit, 2L, "communicator_request_retry_delay_ms");
        f19914e3 = a("rfbsd_ms", -1L);
        f19921f3 = a("ehkpd_ms", 500L);
        f19929g3 = a("rironc", bool);
        f19937h3 = a("rroncbd", bool);
        f19944i3 = C1154e9.f(timeUnit, 5L, "wverc_ms");
        f19952j3 = a("sducifm", bool);
        f19959k3 = a("session_tracking_cooldown_on_event_fire", bool2);
        f19967l3 = a("session_tracking_resumed_cooldown_minutes", 90L);
        f19974m3 = a("session_tracking_paused_cooldown_minutes", 90L);
        f19982n3 = a("qq", bool);
        f19990o3 = a("qq1", bool2);
        f19998p3 = a("qq2", bool2);
        f20006q3 = a("qq3", bool2);
        f20014r3 = a("qq4", bool2);
        f20022s3 = a("qq5", bool2);
        f20030t3 = a("qq6", bool2);
        f20038u3 = a("qq7", bool2);
        f20046v3 = a("qq8", bool2);
        f20054w3 = a("qq9", bool);
        f20062x3 = a("qq10", bool2);
        f20070y3 = a("qq11", bool2);
        f20078z3 = a("qq12", bool2);
        f19697A3 = a("pui", bool2);
        f19705B3 = a("plugin_version", "");
        f19713C3 = a("validate_admob_adapter_sdk_version", bool2);
        f19721D3 = a("ccbtbsic", bool);
        f19729E3 = a("hgn", bool2);
        f19736F3 = a("cso", bool2);
        f19744G3 = a("cfs", bool2);
        f19752H3 = a("cmi", bool2);
        f19760I3 = a("crat", bool2);
        f19768J3 = a("cvs", bool2);
        f19775K3 = a("caf", bool2);
        f19782L3 = a("cf", bool2);
        f19789M3 = a("cmtl", bool2);
        f19795N3 = a("cnr", bool2);
        f19802O3 = a("ccr", bool);
        f19809P3 = a("adr", bool2);
        f19816Q3 = a("volume_normalization_factor", Float.valueOf(100.0f));
        f19822R3 = a("system_user_agent_collection_enabled", bool);
        f19829S3 = a("user_agent_collection_enabled", bool);
        f19836T3 = a("use_cached_user_agent_as_default", bool2);
        f19843U3 = a("collect_device_angle", bool2);
        f19850V3 = a("collect_device_movement", bool2);
        f19857W3 = a("movement_degradation", Float.valueOf(0.75f));
        X3 = a("device_sensor_period_ms", 250);
        f19870Y3 = a("mps", "");
        f19877Z3 = a("mpsl", 3);
        f19884a4 = a("mpis", "com.applovin,dalvik,java,android,com.android");
        f19891b4 = a("cmps", bool);
        f19899c4 = a("rmps", bool);
        f19907d4 = a("collect_webview_package_info", bool);
        e4 = a("webview_package_names", "com.google.android.webview,com.android.webview");
        f19922f4 = a("collect_opengl_version", bool);
        f19930g4 = a("ncre", bool);
        f19938h4 = a("ncrs", "4,5,6,7,8,11,16");
        f19945i4 = a("ncrcs", bool);
        j4 = a("ncrcai", bool2);
        f19960k4 = a("tmas", "");
        f19968l4 = a("cin_v2", bool);
        f19975m4 = a("suia", bool2);
        f19983n4 = a("umsm", bool);
        f19991o4 = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        f19999p4 = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        f20007q4 = a("vast_max_response_length", 640000);
        f20015r4 = a("vast_max_wrapper_depth", 5);
        f20023s4 = a("vast_unsupported_video_extensions", "ogv,flv");
        f20031t4 = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        f20039u4 = a("vast_validate_with_extension_if_no_video_type", bool2);
        f20047v4 = a("vast_wrapper_resolution_retry_count_v1", 1);
        f20055w4 = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f20063x4 = a("vast_industry_icon_max_size", 20);
        f20071y4 = a("vast_industry_icon_margin", 12);
        f20079z4 = a("vast_industry_icon_gravity", 85);
        f19698A4 = a("vast_native_mute_button_size", 24);
        f19706B4 = a("vast_native_play_pause_button_size", 24);
        f19714C4 = a("vast_native_video_widget_padding", 6);
        f19722D4 = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        f19730E4 = a("vast_native_video_widgets_enabled", bool2);
        f19737F4 = a("vast_replay_video_upon_completion", bool2);
        f19745G4 = a("vast_replay_icon_size", 64);
        f19753H4 = a("vcjfhr", bool);
        f19761I4 = a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");
        f19769J4 = a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");
        f19776K4 = a("vast_fire_trackers_from_webview", bool);
        f19783L4 = a("ree", bool2);
        i4.a aVar = i4.a.DEFAULT;
        f19790M4 = a("ree_t", Integer.valueOf(aVar.b()));
        f19796N4 = a("btee", bool2);
        f19803O4 = a("btet", Integer.valueOf(aVar.b()));
        f19810P4 = a("reetoa", bool);
        f19817Q4 = a("reet_msfs", Integer.valueOf(aVar.b()));
        i4.a aVar2 = i4.a.V2;
        f19823R4 = a("reet_msma", Integer.valueOf(aVar2.b()));
        f19830S4 = a("reet_msmd", Integer.valueOf(aVar.b()));
        f19837T4 = a("reet_asfp", Integer.valueOf(aVar.b()));
        f19844U4 = a("reet_asfg", Integer.valueOf(aVar.b()));
        f19851V4 = a("reet_aset", Integer.valueOf(aVar.b()));
        f19858W4 = a("reet_asaet", Integer.valueOf(aVar2.b()));
        f19864X4 = a("reet_esdi", Integer.valueOf(aVar.b()));
        f19871Y4 = a("reet_esrp", Integer.valueOf(aVar.b()));
        f19878Z4 = a("apdra", bool);
        f19885a5 = a("apdrfs", bool);
        f19892b5 = a("apdrma", bool);
        f19900c5 = a("apdrmd", bool);
        f19908d5 = a("apdrfa", bool);
        f19915e5 = a("apdrev", bool);
        f19923f5 = a("apdrdi", bool);
        f19931g5 = a("apdrrp", bool);
        f19939h5 = a("server_timestamp_ms", 0L);
        f19946i5 = a("device_timestamp_ms", 0L);
        f19953j5 = a("gzip_min_length", 0);
        f19961k5 = a("gzip_encoding_default", bool);
        l5 = a("fetch_settings_gzip", bool);
        f19976m5 = a("device_init_gzip", bool);
        f19984n5 = a("fetch_ad_gzip", bool);
        f19992o5 = a("event_tracking_gzip", bool);
        f20000p5 = a("reward_postback_gzip", bool);
        f20008q5 = a("handle_render_process_gone", bool2);
        f20016r5 = a("rworpg", bool2);
        f20024s5 = a("fdadaomr", bool2);
        f20032t5 = a("vfswccar", bool);
        f20040u5 = a("sparafad", bool);
        f20048v5 = a("fahctdmr", bool);
        f20056w5 = a("teorpc", bool);
        f20064x5 = a("set_webview_render_process_client", bool);
        f20072y5 = a("disable_webview_hardware_acceleration", bool);
        f20080z5 = a("anr_detection_enabled", bool);
        f19699A5 = a("anr_trigger_millis", 4000L);
        f19707B5 = a("anr_touch_millis", 3000L);
        f19715C5 = a("anr_check_millis", 3000L);
        f19723D5 = a("spadib", bool);
        f19731E5 = a("uobid", bool2);
        f19738F5 = a("bvde", bool);
        f19746G5 = a("bvdidm", 1000L);
        f19754H5 = a("bvdim", 4000L);
        f19762I5 = a("bvdrs", 10);
        f19770J5 = a("bvdct", 230);
        f19777K5 = a("bvdict", 3);
        f19784L5 = a("bvad", bool);
        f19791M5 = a("bvebb", bool2);
        f19797N5 = a("bvscb", bool2);
        f19804O5 = a("bvlmtb", -1L);
        f19811P5 = a("bvsafw", bool2);
        Q5 = a("aocve", bool);
        f19824R5 = a("dwvvb", bool);
        f19831S5 = a("stcpc", bool);
        f19838T5 = a("stcic", bool2);
        f19845U5 = a("qjscwwvl", bool);
        f19852V5 = a("web_contents_debugging_enabled", bool);
        f19859W5 = a("fcioiauiidb", bool2);
        f19865X5 = a("teouauiidb", bool2);
        f19872Y5 = a("usc", bool);
        f19879Z5 = a("should_apply_web_view_settings_to_web_view_button", bool);
        f19886a6 = a("should_use_cached_screen_size_for_foldable_devices", bool2);
        f19893b6 = a("should_persist_shared_prefs_with_background_commit", bool);
        f19901c6 = a("wvmldt", -1);
        f19909d6 = a("fmldt", -1);
        f19916e6 = a("csl", -1);
        f19924f6 = a("should_use_applovin_adaptive_sizing_formula", bool);
        f19932g6 = a("cdbpn", bool);
        f19940h6 = a("cavdi", bool);
        f19947i6 = a("pvdiaqp", bool);
        f19954j6 = a("sudbia", bool);
        f19962k6 = a("pbpn", "");
        f19969l6 = a("nvelifapd", bool);
        f19977m6 = a("sufecfhrd", bool);
        f19985n6 = a("ignored_auto_redirect_schemes", C1094a9.i(new CharSequence[]{"about", "data", "file"}));
        f19993o6 = a("config_consent_dialog_state", "unknown");
        f20001p6 = a("country_code", "");
        f20009q6 = a("approved_installers_for_package_name_override", "com.google.android.packageinstaller");
        f20017r6 = a("consent_flow_doc_url", "https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow");
        f20025s6 = a("consent_flow_unity_doc_url", "https://developers.applovin.com/en/unity/overview/terms-and-privacy-policy-flow");
        f20033t6 = a("cfadtml", 20);
        f20041u6 = a("cfgcsmrc", -1);
        f20049v6 = a("cfgcsrec", String.valueOf(3));
        f20057w6 = a("enable_custom_tabs_service", bool2);
        f20065x6 = a("custom_tabs_chrome_package_names", "com.android.chrome");
        f20073y6 = a("custom_tabs_prefer_default_browser", bool2);
        f20081z6 = a("custom_tabs_animation_enabled", bool2);
        f19700A6 = a("ps_etr", bool);
        f19708B6 = C1154e9.f(timeUnit2, 7L, "ps_tri_ms");
        f19716C6 = a("ps_ftri_ms", -1L);
        f19724D6 = a("ps_sroftr", bool);
        f19732E6 = a("ps_sroftrof", bool);
        f19739F6 = a("gawvbu", "https://applovin.com");
        f19747G6 = a("c_sticky_topics", "safedk_init,user_info");
        f19755H6 = a("communicator_enabled", bool2);
        f19763I6 = a("adse", bool2);
    }

    public l4(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f20082a = str;
        this.f20083b = obj;
    }

    public static Collection c() {
        return Collections.synchronizedCollection(f19902d.values());
    }

    public Object a() {
        return this.f20083b;
    }

    public String b() {
        return this.f20082a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof l4)) {
            return 0;
        }
        return this.f20082a.compareTo(((l4) obj).b());
    }

    public Object a(Object obj) {
        return this.f20083b.getClass().cast(obj);
    }

    public static l4 a(String str, Object obj) {
        if (obj != null) {
            if (f19894c.contains(obj.getClass())) {
                l4 l4Var = new l4(str, obj);
                Map map = f19902d;
                if (!map.containsKey(str)) {
                    map.put(str, l4Var);
                    return l4Var;
                }
                throw new IllegalArgumentException(androidx.work.s.d("Setting has already been used: ", str));
            }
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }

    public static l4 a(String str) {
        return (l4) f19902d.get(str);
    }
}
