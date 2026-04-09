package com.applovin.impl;

import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x4 implements Comparable {
    public static final x4 A;
    public static final x4 A0;
    public static final x4 A1;
    public static final x4 A2;
    public static final x4 A3;
    public static final x4 A4;
    public static final x4 A5;
    public static final x4 A6;
    public static final x4 B;
    public static final x4 B0;
    public static final x4 B1;
    public static final x4 B2;
    public static final x4 B3;
    public static final x4 B4;
    public static final x4 B5;
    public static final x4 B6;
    public static final x4 C;
    public static final x4 C0;
    public static final x4 C1;
    public static final x4 C2;
    public static final x4 C3;
    public static final x4 C4;
    public static final x4 C5;
    public static final x4 C6;
    public static final x4 D;
    public static final x4 D0;
    public static final x4 D1;
    public static final x4 D2;
    public static final x4 D3;
    public static final x4 D4;
    public static final x4 D5;
    public static final x4 D6;
    public static final x4 E;
    public static final x4 E0;
    public static final x4 E1;
    public static final x4 E2;
    public static final x4 E3;
    public static final x4 E4;
    public static final x4 E5;
    public static final x4 E6;
    public static final x4 F;
    public static final x4 F0;
    public static final x4 F1;
    public static final x4 F2;
    public static final x4 F3;
    public static final x4 F4;
    public static final x4 F5;
    public static final x4 F6;
    public static final x4 G;
    public static final x4 G0;
    public static final x4 G1;
    public static final x4 G2;
    public static final x4 G3;
    public static final x4 G4;
    public static final x4 G5;
    public static final x4 G6;
    public static final x4 H;
    public static final x4 H0;
    public static final x4 H1;
    public static final x4 H2;
    public static final x4 H3;
    public static final x4 H4;
    public static final x4 H5;
    public static final x4 H6;
    public static final x4 I;
    public static final x4 I0;
    public static final x4 I1;
    public static final x4 I2;
    public static final x4 I3;
    public static final x4 I4;
    public static final x4 I5;
    public static final x4 I6;
    public static final x4 J;
    public static final x4 J0;
    public static final x4 J1;
    public static final x4 J2;
    public static final x4 J3;
    public static final x4 J4;
    public static final x4 J5;
    public static final x4 J6;
    public static final x4 K;
    public static final x4 K0;
    public static final x4 K1;
    public static final x4 K2;
    public static final x4 K3;
    public static final x4 K4;
    public static final x4 K5;
    public static final x4 K6;
    public static final x4 L;
    public static final x4 L0;
    public static final x4 L1;
    public static final x4 L2;
    public static final x4 L3;
    public static final x4 L4;
    public static final x4 L5;
    public static final x4 L6;
    public static final x4 M;
    public static final x4 M0;
    public static final x4 M1;
    public static final x4 M2;
    public static final x4 M3;
    public static final x4 M4;
    public static final x4 M5;
    public static final x4 M6;
    public static final x4 N;
    public static final x4 N0;
    public static final x4 N1;
    public static final x4 N2;
    public static final x4 N3;
    public static final x4 N4;
    public static final x4 N5;
    public static final x4 N6;
    public static final x4 O;
    public static final x4 O0;
    public static final x4 O1;
    public static final x4 O2;
    public static final x4 O3;
    public static final x4 O4;
    public static final x4 O5;
    public static final x4 O6;
    public static final x4 P;
    public static final x4 P0;
    public static final x4 P1;
    public static final x4 P2;
    public static final x4 P3;
    public static final x4 P4;
    public static final x4 P5;
    public static final x4 P6;
    public static final x4 Q;
    public static final x4 Q0;
    public static final x4 Q1;
    public static final x4 Q2;
    public static final x4 Q3;
    public static final x4 Q4;
    public static final x4 Q5;
    public static final x4 Q6;
    public static final x4 R;
    public static final x4 R0;
    public static final x4 R1;
    public static final x4 R2;
    public static final x4 R3;
    public static final x4 R4;
    public static final x4 R5;
    public static final x4 R6;
    public static final x4 S;
    public static final x4 S0;
    public static final x4 S1;
    public static final x4 S2;
    public static final x4 S3;
    public static final x4 S4;
    public static final x4 S5;
    public static final x4 S6;
    public static final x4 T;
    public static final x4 T0;
    public static final x4 T1;
    public static final x4 T2;
    public static final x4 T3;
    public static final x4 T4;
    public static final x4 T5;
    public static final x4 T6;
    public static final x4 U;
    public static final x4 U0;
    public static final x4 U1;
    public static final x4 U2;
    public static final x4 U3;
    public static final x4 U4;
    public static final x4 U5;
    public static final x4 U6;
    public static final x4 V;
    public static final x4 V0;
    public static final x4 V1;
    public static final x4 V2;
    public static final x4 V3;
    public static final x4 V4;
    public static final x4 V5;
    public static final x4 V6;
    public static final x4 W;
    public static final x4 W0;
    public static final x4 W1;
    public static final x4 W2;
    public static final x4 W3;
    public static final x4 W4;
    public static final x4 W5;
    public static final x4 W6;
    public static final x4 X;
    public static final x4 X0;
    public static final x4 X1;
    public static final x4 X2;
    public static final x4 X3;
    public static final x4 X4;
    public static final x4 X5;
    public static final x4 X6;
    public static final x4 Y;
    public static final x4 Y0;
    public static final x4 Y1;
    public static final x4 Y2;
    public static final x4 Y3;
    public static final x4 Y4;
    public static final x4 Y5;
    public static final x4 Y6;
    public static final x4 Z;
    public static final x4 Z0;
    public static final x4 Z1;
    public static final x4 Z2;
    public static final x4 Z3;
    public static final x4 Z4;
    public static final x4 Z5;
    public static final x4 Z6;

    /* renamed from: a0, reason: collision with root package name */
    public static final x4 f8416a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final x4 f8417a1;

    /* renamed from: a2, reason: collision with root package name */
    public static final x4 f8418a2;

    /* renamed from: a3, reason: collision with root package name */
    public static final x4 f8419a3;

    /* renamed from: a4, reason: collision with root package name */
    public static final x4 f8420a4;

    /* renamed from: a5, reason: collision with root package name */
    public static final x4 f8421a5;

    /* renamed from: a6, reason: collision with root package name */
    public static final x4 f8422a6;

    /* renamed from: a7, reason: collision with root package name */
    public static final x4 f8423a7;

    /* renamed from: b0, reason: collision with root package name */
    public static final x4 f8424b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final x4 f8425b1;

    /* renamed from: b2, reason: collision with root package name */
    public static final x4 f8426b2;

    /* renamed from: b3, reason: collision with root package name */
    public static final x4 f8427b3;

    /* renamed from: b4, reason: collision with root package name */
    public static final x4 f8428b4;

    /* renamed from: b5, reason: collision with root package name */
    public static final x4 f8429b5;

    /* renamed from: b6, reason: collision with root package name */
    public static final x4 f8430b6;

    /* renamed from: b7, reason: collision with root package name */
    public static final x4 f8431b7;

    /* renamed from: c0, reason: collision with root package name */
    public static final x4 f8433c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final x4 f8434c1;

    /* renamed from: c2, reason: collision with root package name */
    public static final x4 f8435c2;

    /* renamed from: c3, reason: collision with root package name */
    public static final x4 f8436c3;

    /* renamed from: c4, reason: collision with root package name */
    public static final x4 f8437c4;

    /* renamed from: c5, reason: collision with root package name */
    public static final x4 f8438c5;

    /* renamed from: c6, reason: collision with root package name */
    public static final x4 f8439c6;

    /* renamed from: c7, reason: collision with root package name */
    public static final x4 f8440c7;

    /* renamed from: d0, reason: collision with root package name */
    public static final x4 f8442d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final x4 f8443d1;

    /* renamed from: d2, reason: collision with root package name */
    public static final x4 f8444d2;

    /* renamed from: d3, reason: collision with root package name */
    public static final x4 f8445d3;

    /* renamed from: d4, reason: collision with root package name */
    public static final x4 f8446d4;

    /* renamed from: d5, reason: collision with root package name */
    public static final x4 f8447d5;

    /* renamed from: d6, reason: collision with root package name */
    public static final x4 f8448d6;

    /* renamed from: d7, reason: collision with root package name */
    public static final x4 f8449d7;

    /* renamed from: e, reason: collision with root package name */
    public static final x4 f8450e;

    /* renamed from: e0, reason: collision with root package name */
    public static final x4 f8451e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final x4 f8452e1;

    /* renamed from: e2, reason: collision with root package name */
    public static final x4 f8453e2;

    /* renamed from: e3, reason: collision with root package name */
    public static final x4 f8454e3;

    /* renamed from: e4, reason: collision with root package name */
    public static final x4 f8455e4;

    /* renamed from: e5, reason: collision with root package name */
    public static final x4 f8456e5;

    /* renamed from: e6, reason: collision with root package name */
    public static final x4 f8457e6;

    /* renamed from: e7, reason: collision with root package name */
    public static final x4 f8458e7;

    /* renamed from: f, reason: collision with root package name */
    public static final x4 f8459f;

    /* renamed from: f0, reason: collision with root package name */
    public static final x4 f8460f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final x4 f8461f1;

    /* renamed from: f2, reason: collision with root package name */
    public static final x4 f8462f2;

    /* renamed from: f3, reason: collision with root package name */
    public static final x4 f8463f3;

    /* renamed from: f4, reason: collision with root package name */
    public static final x4 f8464f4;

    /* renamed from: f5, reason: collision with root package name */
    public static final x4 f8465f5;

    /* renamed from: f6, reason: collision with root package name */
    public static final x4 f8466f6;

    /* renamed from: f7, reason: collision with root package name */
    public static final x4 f8467f7;

    /* renamed from: g, reason: collision with root package name */
    public static final x4 f8468g;

    /* renamed from: g0, reason: collision with root package name */
    public static final x4 f8469g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final x4 f8470g1;

    /* renamed from: g2, reason: collision with root package name */
    public static final x4 f8471g2;

    /* renamed from: g3, reason: collision with root package name */
    public static final x4 f8472g3;

    /* renamed from: g4, reason: collision with root package name */
    public static final x4 f8473g4;

    /* renamed from: g5, reason: collision with root package name */
    public static final x4 f8474g5;

    /* renamed from: g6, reason: collision with root package name */
    public static final x4 f8475g6;

    /* renamed from: g7, reason: collision with root package name */
    public static final x4 f8476g7;

    /* renamed from: h, reason: collision with root package name */
    public static final x4 f8477h;

    /* renamed from: h0, reason: collision with root package name */
    public static final x4 f8478h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final x4 f8479h1;

    /* renamed from: h2, reason: collision with root package name */
    public static final x4 f8480h2;

    /* renamed from: h3, reason: collision with root package name */
    public static final x4 f8481h3;

    /* renamed from: h4, reason: collision with root package name */
    public static final x4 f8482h4;

    /* renamed from: h5, reason: collision with root package name */
    public static final x4 f8483h5;

    /* renamed from: h6, reason: collision with root package name */
    public static final x4 f8484h6;

    /* renamed from: h7, reason: collision with root package name */
    public static final x4 f8485h7;

    /* renamed from: i, reason: collision with root package name */
    public static final x4 f8486i;

    /* renamed from: i0, reason: collision with root package name */
    public static final x4 f8487i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final x4 f8488i1;

    /* renamed from: i2, reason: collision with root package name */
    public static final x4 f8489i2;

    /* renamed from: i3, reason: collision with root package name */
    public static final x4 f8490i3;

    /* renamed from: i4, reason: collision with root package name */
    public static final x4 f8491i4;

    /* renamed from: i5, reason: collision with root package name */
    public static final x4 f8492i5;

    /* renamed from: i6, reason: collision with root package name */
    public static final x4 f8493i6;

    /* renamed from: i7, reason: collision with root package name */
    public static final x4 f8494i7;

    /* renamed from: j, reason: collision with root package name */
    public static final x4 f8495j;

    /* renamed from: j0, reason: collision with root package name */
    public static final x4 f8496j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final x4 f8497j1;

    /* renamed from: j2, reason: collision with root package name */
    public static final x4 f8498j2;

    /* renamed from: j3, reason: collision with root package name */
    public static final x4 f8499j3;

    /* renamed from: j4, reason: collision with root package name */
    public static final x4 f8500j4;

    /* renamed from: j5, reason: collision with root package name */
    public static final x4 f8501j5;

    /* renamed from: j6, reason: collision with root package name */
    public static final x4 f8502j6;

    /* renamed from: j7, reason: collision with root package name */
    public static final x4 f8503j7;

    /* renamed from: k, reason: collision with root package name */
    public static final x4 f8504k;

    /* renamed from: k0, reason: collision with root package name */
    public static final x4 f8505k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final x4 f8506k1;

    /* renamed from: k2, reason: collision with root package name */
    public static final x4 f8507k2;

    /* renamed from: k3, reason: collision with root package name */
    public static final x4 f8508k3;

    /* renamed from: k4, reason: collision with root package name */
    public static final x4 f8509k4;

    /* renamed from: k5, reason: collision with root package name */
    public static final x4 f8510k5;

    /* renamed from: k6, reason: collision with root package name */
    public static final x4 f8511k6;

    /* renamed from: k7, reason: collision with root package name */
    public static final x4 f8512k7;

    /* renamed from: l, reason: collision with root package name */
    public static final x4 f8513l;

    /* renamed from: l0, reason: collision with root package name */
    public static final x4 f8514l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final x4 f8515l1;

    /* renamed from: l2, reason: collision with root package name */
    public static final x4 f8516l2;

    /* renamed from: l3, reason: collision with root package name */
    public static final x4 f8517l3;

    /* renamed from: l4, reason: collision with root package name */
    public static final x4 f8518l4;

    /* renamed from: l5, reason: collision with root package name */
    public static final x4 f8519l5;

    /* renamed from: l6, reason: collision with root package name */
    public static final x4 f8520l6;

    /* renamed from: l7, reason: collision with root package name */
    public static final x4 f8521l7;

    /* renamed from: m, reason: collision with root package name */
    public static final x4 f8522m;

    /* renamed from: m0, reason: collision with root package name */
    public static final x4 f8523m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final x4 f8524m1;

    /* renamed from: m2, reason: collision with root package name */
    public static final x4 f8525m2;

    /* renamed from: m3, reason: collision with root package name */
    public static final x4 f8526m3;

    /* renamed from: m4, reason: collision with root package name */
    public static final x4 f8527m4;

    /* renamed from: m5, reason: collision with root package name */
    public static final x4 f8528m5;

    /* renamed from: m6, reason: collision with root package name */
    public static final x4 f8529m6;

    /* renamed from: n, reason: collision with root package name */
    public static final x4 f8530n;

    /* renamed from: n0, reason: collision with root package name */
    public static final x4 f8531n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final x4 f8532n1;

    /* renamed from: n2, reason: collision with root package name */
    public static final x4 f8533n2;

    /* renamed from: n3, reason: collision with root package name */
    public static final x4 f8534n3;

    /* renamed from: n4, reason: collision with root package name */
    public static final x4 f8535n4;

    /* renamed from: n5, reason: collision with root package name */
    public static final x4 f8536n5;

    /* renamed from: n6, reason: collision with root package name */
    public static final x4 f8537n6;

    /* renamed from: o, reason: collision with root package name */
    public static final x4 f8538o;

    /* renamed from: o0, reason: collision with root package name */
    public static final x4 f8539o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final x4 f8540o1;

    /* renamed from: o2, reason: collision with root package name */
    public static final x4 f8541o2;

    /* renamed from: o3, reason: collision with root package name */
    public static final x4 f8542o3;

    /* renamed from: o4, reason: collision with root package name */
    public static final x4 f8543o4;

    /* renamed from: o5, reason: collision with root package name */
    public static final x4 f8544o5;

    /* renamed from: o6, reason: collision with root package name */
    public static final x4 f8545o6;

    /* renamed from: p, reason: collision with root package name */
    public static final x4 f8546p;

    /* renamed from: p0, reason: collision with root package name */
    public static final x4 f8547p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final x4 f8548p1;

    /* renamed from: p2, reason: collision with root package name */
    public static final x4 f8549p2;

    /* renamed from: p3, reason: collision with root package name */
    public static final x4 f8550p3;

    /* renamed from: p4, reason: collision with root package name */
    public static final x4 f8551p4;

    /* renamed from: p5, reason: collision with root package name */
    public static final x4 f8552p5;

    /* renamed from: p6, reason: collision with root package name */
    public static final x4 f8553p6;

    /* renamed from: q, reason: collision with root package name */
    public static final x4 f8554q;

    /* renamed from: q0, reason: collision with root package name */
    public static final x4 f8555q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final x4 f8556q1;

    /* renamed from: q2, reason: collision with root package name */
    public static final x4 f8557q2;

    /* renamed from: q3, reason: collision with root package name */
    public static final x4 f8558q3;

    /* renamed from: q4, reason: collision with root package name */
    public static final x4 f8559q4;

    /* renamed from: q5, reason: collision with root package name */
    public static final x4 f8560q5;

    /* renamed from: q6, reason: collision with root package name */
    public static final x4 f8561q6;

    /* renamed from: r, reason: collision with root package name */
    public static final x4 f8562r;

    /* renamed from: r0, reason: collision with root package name */
    public static final x4 f8563r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final x4 f8564r1;

    /* renamed from: r2, reason: collision with root package name */
    public static final x4 f8565r2;

    /* renamed from: r3, reason: collision with root package name */
    public static final x4 f8566r3;

    /* renamed from: r4, reason: collision with root package name */
    public static final x4 f8567r4;

    /* renamed from: r5, reason: collision with root package name */
    public static final x4 f8568r5;

    /* renamed from: r6, reason: collision with root package name */
    public static final x4 f8569r6;

    /* renamed from: s, reason: collision with root package name */
    public static final x4 f8570s;

    /* renamed from: s0, reason: collision with root package name */
    public static final x4 f8571s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final x4 f8572s1;

    /* renamed from: s2, reason: collision with root package name */
    public static final x4 f8573s2;

    /* renamed from: s3, reason: collision with root package name */
    public static final x4 f8574s3;

    /* renamed from: s4, reason: collision with root package name */
    public static final x4 f8575s4;

    /* renamed from: s5, reason: collision with root package name */
    public static final x4 f8576s5;

    /* renamed from: s6, reason: collision with root package name */
    public static final x4 f8577s6;

    /* renamed from: t, reason: collision with root package name */
    public static final x4 f8578t;

    /* renamed from: t0, reason: collision with root package name */
    public static final x4 f8579t0;

    /* renamed from: t1, reason: collision with root package name */
    public static final x4 f8580t1;

    /* renamed from: t2, reason: collision with root package name */
    public static final x4 f8581t2;

    /* renamed from: t3, reason: collision with root package name */
    public static final x4 f8582t3;

    /* renamed from: t4, reason: collision with root package name */
    public static final x4 f8583t4;

    /* renamed from: t5, reason: collision with root package name */
    public static final x4 f8584t5;

    /* renamed from: t6, reason: collision with root package name */
    public static final x4 f8585t6;

    /* renamed from: u, reason: collision with root package name */
    public static final x4 f8586u;

    /* renamed from: u0, reason: collision with root package name */
    public static final x4 f8587u0;

    /* renamed from: u1, reason: collision with root package name */
    public static final x4 f8588u1;

    /* renamed from: u2, reason: collision with root package name */
    public static final x4 f8589u2;

    /* renamed from: u3, reason: collision with root package name */
    public static final x4 f8590u3;

    /* renamed from: u4, reason: collision with root package name */
    public static final x4 f8591u4;

    /* renamed from: u5, reason: collision with root package name */
    public static final x4 f8592u5;

    /* renamed from: u6, reason: collision with root package name */
    public static final x4 f8593u6;

    /* renamed from: v, reason: collision with root package name */
    public static final x4 f8594v;

    /* renamed from: v0, reason: collision with root package name */
    public static final x4 f8595v0;

    /* renamed from: v1, reason: collision with root package name */
    public static final x4 f8596v1;

    /* renamed from: v2, reason: collision with root package name */
    public static final x4 f8597v2;

    /* renamed from: v3, reason: collision with root package name */
    public static final x4 f8598v3;

    /* renamed from: v4, reason: collision with root package name */
    public static final x4 f8599v4;

    /* renamed from: v5, reason: collision with root package name */
    public static final x4 f8600v5;

    /* renamed from: v6, reason: collision with root package name */
    public static final x4 f8601v6;

    /* renamed from: w, reason: collision with root package name */
    public static final x4 f8602w;

    /* renamed from: w0, reason: collision with root package name */
    public static final x4 f8603w0;

    /* renamed from: w1, reason: collision with root package name */
    public static final x4 f8604w1;

    /* renamed from: w2, reason: collision with root package name */
    public static final x4 f8605w2;

    /* renamed from: w3, reason: collision with root package name */
    public static final x4 f8606w3;

    /* renamed from: w4, reason: collision with root package name */
    public static final x4 f8607w4;

    /* renamed from: w5, reason: collision with root package name */
    public static final x4 f8608w5;

    /* renamed from: w6, reason: collision with root package name */
    public static final x4 f8609w6;

    /* renamed from: x, reason: collision with root package name */
    public static final x4 f8610x;

    /* renamed from: x0, reason: collision with root package name */
    public static final x4 f8611x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final x4 f8612x1;

    /* renamed from: x2, reason: collision with root package name */
    public static final x4 f8613x2;

    /* renamed from: x3, reason: collision with root package name */
    public static final x4 f8614x3;

    /* renamed from: x4, reason: collision with root package name */
    public static final x4 f8615x4;

    /* renamed from: x5, reason: collision with root package name */
    public static final x4 f8616x5;

    /* renamed from: x6, reason: collision with root package name */
    public static final x4 f8617x6;

    /* renamed from: y, reason: collision with root package name */
    public static final x4 f8618y;

    /* renamed from: y0, reason: collision with root package name */
    public static final x4 f8619y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final x4 f8620y1;

    /* renamed from: y2, reason: collision with root package name */
    public static final x4 f8621y2;

    /* renamed from: y3, reason: collision with root package name */
    public static final x4 f8622y3;

    /* renamed from: y4, reason: collision with root package name */
    public static final x4 f8623y4;

    /* renamed from: y5, reason: collision with root package name */
    public static final x4 f8624y5;

    /* renamed from: y6, reason: collision with root package name */
    public static final x4 f8625y6;

    /* renamed from: z, reason: collision with root package name */
    public static final x4 f8626z;

    /* renamed from: z0, reason: collision with root package name */
    public static final x4 f8627z0;

    /* renamed from: z1, reason: collision with root package name */
    public static final x4 f8628z1;

    /* renamed from: z2, reason: collision with root package name */
    public static final x4 f8629z2;

    /* renamed from: z3, reason: collision with root package name */
    public static final x4 f8630z3;

    /* renamed from: z4, reason: collision with root package name */
    public static final x4 f8631z4;

    /* renamed from: z5, reason: collision with root package name */
    public static final x4 f8632z5;

    /* renamed from: z6, reason: collision with root package name */
    public static final x4 f8633z6;

    /* renamed from: a, reason: collision with root package name */
    private final String f8634a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8635b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f8432c = Arrays.asList(Boolean.class, Float.class, Double.class, Integer.class, Long.class, String.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Map f8441d = new HashMap(512);

    static {
        Boolean bool = Boolean.FALSE;
        f8450e = a("is_disabled", bool);
        f8459f = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f8468g = a("rss", bool2);
        f8477h = a("rssoitf", bool);
        f8486i = a("cpoitf", bool);
        f8495j = a("device_token", "");
        f8504k = a("is_verbose_logging", bool);
        f8513l = a("sc", "");
        f8522m = a("sc2", "");
        f8530n = a("sc3", "");
        f8538o = a("server_installed_at", "");
        f8546p = a("clear_completion_callback_on_failure", bool);
        f8554q = a("sicd_ms", 0L);
        f8562r = a("logcat_max_line_size", 1000);
        f8570s = a("exception_handler_enabled", bool2);
        f8578t = a("md", "");
        f8586u = a("lsu", bool);
        f8594v = a("tla_ms", -1L);
        f8602w = a("uactlac", bool);
        f8610x = a("vsk", bool);
        f8618y = a("avt_ms", -1L);
        f8626z = a("avsves", bool);
        A = a("avrctr", "");
        B = a("error_reporter_v1_sample_percent", 100);
        C = a("health_events_reporter_v1_endpoint", "https://sts.applovin.com/v1/stats/sdk");
        D = a("health_events_reporter_v1_event_level_sampling_percentages", "");
        Float fValueOf = Float.valueOf(-1.0f);
        E = a("health_events_reporter_v1_ad_sampling_percent", fValueOf);
        F = a("health_events_reporter_v1_error_sampling_percent", fValueOf);
        G = a("health_events_reporter_v1_user_session_sampling_percent", fValueOf);
        H = a("health_events_reporter_v1_sampling_percent", Float.valueOf(1.0f));
        I = a("health_events_reporter_v1_batch_grouped_events", bool);
        J = a("health_events_reporter_should_skip_al_events_in_max", bool);
        K = a("health_events_reporter_valid_network_status_codes", "");
        L = a("health_events_reporter_include_cached_asset_info", bool);
        M = a("health_events_reporter_include_html_source", bool);
        N = a("stps", 2);
        O = a("auxiliary_operations_threads", 1);
        P = a("apsobt", bool2);
        Q = a("tmtp", 1);
        R = a("network_thread_count", 2);
        S = a("ntp", 5);
        T = a("ueq", bool);
        U = a("coretc", 1);
        V = a("cachetc", 1);
        W = a("mtc", 1);
        X = a("ttc", 1);
        Y = a("otc", 1);
        Z = a("uaeq", bool);
        f8416a0 = a("init_omsdk", bool2);
        f8424b0 = a("omsdk_partner_name", "applovin");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8433c0 = a("ttc_max_click_duration_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f8442d0 = a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        f8451e0 = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        f8460f0 = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        f8469g0 = a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        f8478h0 = a("ttc_edge_buffer_dp", 0);
        f8487i0 = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f8496j0 = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f8505k0 = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        f8514l0 = a("adserver_endpoint", "https://a.applovin.com/");
        f8523m0 = a("adserver_backup_endpoint", "https://a.applvn.com/");
        f8531n0 = a("api_endpoint", "https://d.applovin.com/");
        f8539o0 = a("api_backup_endpoint", "https://d.applvn.com/");
        f8547p0 = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        f8555q0 = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        f8563r0 = a("eete", "https://b.applovin.com/");
        f8571s0 = a("eetbe", "");
        f8579t0 = a("webview_network_error_endpoints_to_report", "applovin.com,applvn.com");
        f8587u0 = a("vle", "");
        f8595v0 = a("vlbe", "");
        f8603w0 = a("vlep", "");
        f8611x0 = a("token_type_prefixes_r", "4!");
        f8619y0 = a("token_type_prefixes_arj", "json_v3!");
        f8627z0 = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        A0 = a("axon_events", vc.a(",", new CharSequence[]{"rewarded_ad_opportunity", "ad_view", "ad_clicked", "page_view", "view_item", "add_to_cart", "begin_checkout", "purchase", "add_payment_info", "remove_from_cart", "view_cart", "wishlist_updated", "refund_requested", "financial_deposit", "financial_withdraw", "financial_transaction", "level_start", "level_complete", "level_fail", "virtual_resource_transaction", "tutorial_complete", "energy_depleted", "use_prop", "game_shop_enter", "generate_lead", AppLovinEventTypes.USER_LOGGED_IN, "sign_up", AppLovinEventTypes.USER_EXECUTED_SEARCH, "product_review", "app_open", "account_verification_start", "account_verification_complete", "order", "account_linked", "friend_invite", "gift_transaction", "group_joined", "chat_sent", "post_view", "post_created", "subscribe", "start_trial"}));
        B0 = a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1L)));
        C0 = a("cache_max_size_mb", -1);
        D0 = a("precache_delimiters", ")]', ");
        E0 = a("ad_resource_caching_enabled", bool2);
        F0 = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        G0 = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        H0 = a("resource_max_filename_length", 255);
        I0 = a("ccrc", bool);
        J0 = a("ustpfcrc", bool);
        K0 = a("mcct", 3);
        L0 = a("mchct", 3);
        M0 = a("dfirf", bool);
        N0 = a("dfipf", bool);
        O0 = a("dcrome", bool);
        P0 = a("dcrobs", bool);
        Q0 = a("pcro", bool);
        R0 = a("serfaad", bool);
        S0 = a("mdafra", 1);
        T0 = a("ssch", bool2);
        U0 = a("suaf", bool);
        V0 = a("lfblrs", bool);
        W0 = a("pawnrrm", bool);
        X0 = a("ape", bool);
        Y0 = a("pafqi", bool);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        Z0 = a("pae_ms", Long.valueOf(timeUnit2.toMillis(5L)));
        f8417a1 = a("pamttl_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f8425b1 = a("saewib", bool);
        f8434c1 = a("fsae_ms", -1L);
        f8443d1 = a("raae", bool);
        f8452e1 = a("vr_retry_count_v1", 1);
        f8461f1 = a("cr_retry_count_v1", 1);
        f8470g1 = a("saru", bool);
        f8479h1 = a("spvtzians", bool);
        f8488i1 = a("close_button_touch_area", 0);
        f8497j1 = a("close_button_outside_touch_area", 0);
        f8506k1 = a("creative_debugger_enabled", bool2);
        f8515l1 = a("smdfhcdb", bool2);
        f8524m1 = a("use_background_view_for_ad_clicks", bool2);
        f8532n1 = a("viewability_adview_imp_delay_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f8540o1 = a("viewability_adview_banner_min_width", Integer.valueOf(Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE));
        f8548p1 = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        f8556q1 = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f8564r1 = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f8572s1 = a("viewability_adview_leader_min_width", 728);
        f8580t1 = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f8588u1 = a("viewability_adview_native_min_width", 0);
        f8596v1 = a("viewability_adview_native_min_height", 0);
        f8604w1 = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        f8612x1 = a("viewability_timer_min_visible_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f8620y1 = a("viewability_timer_interval_ms", 100L);
        f8628z1 = a("expandable_close_button_size", 27);
        A1 = a("expandable_h_close_button_margin", 10);
        B1 = a("expandable_t_close_button_margin", 10);
        C1 = a("expandable_lhs_close_button", bool);
        D1 = a("expandable_close_button_touch_area", 0);
        E1 = a("forward_lifecycle_events_to_adview_webview", bool);
        F1 = a("forward_in_app_browser_events_to_adview_webview", bool);
        G1 = a("forward_external_redirect_events_to_adview_webview", bool);
        H1 = a("forward_preload_events_to_adview_webview", bool);
        I1 = a("iaad", bool);
        J1 = a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        K1 = a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(timeUnit2.toMillis(2L)));
        L1 = a("lhs_close_button_video", bool);
        M1 = a("close_button_right_margin_video", 4);
        N1 = a("close_button_size_video", 30);
        O1 = a("close_button_top_margin_video", 8);
        P1 = a("video_countdown_clock_margin", 10);
        Q1 = a("video_countdown_clock_gravity", 83);
        R1 = a("countdown_clock_size", 32);
        S1 = a("countdown_clock_stroke_size", 4);
        T1 = a("countdown_clock_text_size", 28);
        U1 = a("draw_countdown_clock", bool2);
        V1 = a("inter_display_delay", 200L);
        W1 = a("maximum_close_button_delay_seconds", 999L);
        X1 = a("respect_close_button", bool2);
        Y1 = a("lhs_skip_button", bool2);
        Z1 = a("mute_controls_enabled", bool);
        f8418a2 = a("allow_user_muting", bool2);
        f8426b2 = a("mute_videos", bool);
        f8435c2 = a("show_mute_by_default", bool);
        f8444d2 = a("mute_with_user_settings", bool2);
        f8453e2 = a("mute_button_size", 32);
        f8462f2 = a("mute_button_margin", 10);
        f8471g2 = a("mute_button_gravity", 85);
        f8480h2 = a("progress_bar_step", 25L);
        f8489i2 = a("progress_bar_scale", 10000);
        f8498j2 = a("progress_bar_vertical_padding", -8);
        f8507k2 = a("vs_buffer_indicator_size", 50);
        f8516l2 = a("video_zero_length_as_computed", bool);
        f8525m2 = a("set_poststitial_muted_initial_delay_ms", 500L);
        f8533n2 = a("fsahrpg", bool2);
        f8541o2 = a("eaafrwsoa", bool2);
        f8549p2 = a("postitial_progress_bar_step_ms", 25L);
        f8557q2 = a("postitial_progress_bar_on_bottom", bool2);
        f8565r2 = a("postitial_progress_bar_vertical_padding", -8);
        f8573s2 = a("postitial_progress_bar_scale", 10000);
        f8581t2 = a("fahosu", bool);
        f8589u2 = a("system_insets_mask", Integer.valueOf(n7.g()));
        f8597v2 = a("system_bars_hide_list", "");
        f8605w2 = a("aarwdc", bool);
        f8613x2 = a("track_app_killed", bool);
        f8621y2 = a("track_ad_duration", bool);
        f8629z2 = a("track_ad_duration_interval_ms", Long.valueOf(timeUnit.toMillis(1L)));
        A2 = a("simplified_app_killed_detection", bool);
        B2 = a("app_closed_time_threshold_for_app_killed_event_ms", Long.valueOf(timeUnit.toMillis(60L)));
        C2 = a("track_app_killed_during_mediated_ad", bool);
        D2 = a("track_mediated_ad_duration_interval_ms", -1L);
        E2 = a("app_closed_time_threshold_for_app_killed_during_mediated_ad_event_ms", Long.valueOf(timeUnit.toMillis(60L)));
        F2 = a("nsuttcl", bool);
        G2 = a("submit_postback_timeout", Integer.valueOf((int) timeUnit.toMillis(10L)));
        H2 = a("submit_postback_retries", 4);
        I2 = a("max_postback_attempts", 3);
        J2 = a("max_persisted_postbacks", 100);
        K2 = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit.toMillis(7L)));
        L2 = a("sossp", bool);
        M2 = a("spp", bool2);
        N2 = a("fire_native_ad_postbacks_from_webview", bool);
        O2 = a("use_requests_for_native_ad_click_postbacks", bool);
        P2 = a("preload_postback_webview", bool);
        Q2 = a("sejwp", bool);
        R2 = a("ejt_ms", Long.valueOf(timeUnit.toMillis(5L)));
        S2 = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit.toMillis(10L)));
        T2 = a("http_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        U2 = a("http_socket_timeout", Integer.valueOf((int) timeUnit.toMillis(20L)));
        V2 = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        W2 = a("fetch_ad_retry_count_v1", 1);
        X2 = a("faer", bool);
        Y2 = a("faroae", bool);
        Z2 = a("submit_data_retry_count_v1", 1);
        f8419a3 = a("response_buffer_size", 16000);
        f8427b3 = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f8436c3 = a("fetch_basic_settings_retry_count", 3);
        f8445d3 = a("fetch_basic_settings_on_reconnect", bool);
        f8454e3 = a("skip_fetch_basic_settings_if_not_connected", bool);
        f8463f3 = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit.toMillis(2L)));
        f8472g3 = a("idflrwbe", bool);
        f8481h3 = a("falawpr", bool);
        f8490i3 = a("sort_query_parameters", bool);
        f8499j3 = a("communicator_request_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        f8508k3 = a("communicator_request_retry_count", 3);
        f8517l3 = a("communicator_request_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        f8526m3 = a("rfbsd_ms", -1L);
        f8534n3 = a("ehkpd_ms", 500L);
        f8542o3 = a("rironc", bool);
        f8550p3 = a("rroncbd", bool);
        f8558q3 = a("wverc_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f8566r3 = a("scrsifm", bool);
        f8574s3 = a("suohfrl", bool);
        f8582t3 = a("lvrc", 1);
        f8590u3 = a("session_tracking_cooldown_on_event_fire", bool2);
        f8598v3 = a("session_tracking_resumed_cooldown_minutes", 90L);
        f8606w3 = a("session_tracking_paused_cooldown_minutes", 90L);
        f8614x3 = a("qq", bool);
        f8622y3 = a("qq1", bool2);
        f8630z3 = a("qq2", bool);
        A3 = a("qq3", bool2);
        B3 = a("qq4", bool2);
        C3 = a("qq5", bool2);
        D3 = a("qq6", bool2);
        E3 = a("qq7", bool2);
        F3 = a("qq8", bool2);
        G3 = a("qq9", bool);
        H3 = a("qq10", bool2);
        I3 = a("qq11", bool2);
        J3 = a("qq12", bool2);
        K3 = a("pui", bool2);
        L3 = a("plugin_version", "");
        M3 = a("validate_admob_adapter_sdk_version", bool2);
        N3 = a("ccbtbsic", bool);
        O3 = a("hgn", bool2);
        P3 = a("cso", bool2);
        Q3 = a("cfs", bool2);
        R3 = a("cmi", bool2);
        S3 = a("crat", bool2);
        T3 = a("cvs", bool2);
        U3 = a("caf", bool2);
        V3 = a("cf", bool2);
        W3 = a("cmtl", bool2);
        X3 = a("cnr", bool2);
        Y3 = a("ccr", bool);
        Z3 = a("adr", bool2);
        f8420a4 = a("volume_normalization_factor", Float.valueOf(100.0f));
        f8428b4 = a("system_user_agent_collection_enabled", bool);
        f8437c4 = a("user_agent_collection_enabled", bool);
        f8446d4 = a("use_cached_user_agent_as_default", bool2);
        f8455e4 = a("collect_device_angle", bool2);
        f8464f4 = a("collect_device_movement", bool2);
        f8473g4 = a("movement_degradation", Float.valueOf(0.75f));
        f8482h4 = a("device_sensor_period_ms", 250);
        f8491i4 = a("mps", "");
        f8500j4 = a("mpsl", 3);
        f8509k4 = a("mpis", "com.applovin,dalvik,java,android,com.android");
        f8518l4 = a("cmps", bool);
        f8527m4 = a("rmps", bool);
        f8535n4 = a("collect_webview_package_info", bool);
        f8543o4 = a("webview_package_names", "com.google.android.webview,com.android.webview");
        f8551p4 = a("collect_opengl_version", bool);
        f8559q4 = a("ncre", bool);
        f8567r4 = a("ncrs", "4,5,6,7,8,11,16");
        f8575s4 = a("ncrcs", bool);
        f8583t4 = a("ncrcai", bool2);
        f8591u4 = a("tmas", "");
        f8599v4 = a("tmasl", "");
        f8607w4 = a("tmahl", 1);
        f8615x4 = a("cin_v2", bool);
        f8623y4 = a("suia", bool2);
        f8631z4 = a("asicl", 1);
        A4 = a("aeicl", 1);
        B4 = a("aeisupf", bool);
        C4 = a("aeistl", -1);
        D4 = a("aeistsr", CampaignEx.CLICKMODE_ON);
        E4 = a("csbi", bool);
        F4 = a("btt_ms", Long.valueOf(timeUnit.toMillis(20L)));
        G4 = a("chs", bool);
        H4 = a("dltc", "");
        I4 = a("sy_stc", JsonUtils.EMPTY_JSON);
        J4 = a("se_stc", JsonUtils.EMPTY_JSON);
        K4 = a("gl_stc", JsonUtils.EMPTY_JSON);
        L4 = a("crpaf", bool);
        M4 = a("umsm", bool);
        N4 = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        O4 = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        P4 = a("vast_max_response_length", 640000);
        Q4 = a("vast_max_wrapper_depth", 5);
        R4 = a("vast_unsupported_video_extensions", "ogv,flv");
        S4 = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        T4 = a("vast_validate_with_extension_if_no_video_type", bool2);
        U4 = a("vast_wrapper_resolution_retry_count_v1", 1);
        V4 = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        W4 = a("vast_industry_icon_max_size", 20);
        X4 = a("vast_industry_icon_margin", 12);
        Y4 = a("vast_industry_icon_gravity", 85);
        Z4 = a("vast_native_mute_button_size", 24);
        f8421a5 = a("vast_native_play_pause_button_size", 24);
        f8429b5 = a("vast_native_video_widget_padding", 6);
        f8438c5 = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        f8447d5 = a("vast_native_video_widgets_enabled", bool2);
        f8456e5 = a("vast_replay_video_upon_completion", bool2);
        f8465f5 = a("vast_replay_icon_size", 64);
        f8474g5 = a("vcjfhr", bool);
        f8483h5 = a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");
        f8492i5 = a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");
        f8501j5 = a("vast_fire_trackers_from_webview", bool);
        f8510k5 = a("ree", bool2);
        u4.a aVar = u4.a.DEFAULT;
        f8519l5 = a("ree_t", Integer.valueOf(aVar.b()));
        f8528m5 = a("btee", bool2);
        f8536n5 = a("btet", Integer.valueOf(aVar.b()));
        f8544o5 = a("reetoa", bool);
        f8552p5 = a("reet_msfs", Integer.valueOf(aVar.b()));
        u4.a aVar2 = u4.a.V2;
        f8560q5 = a("reet_msma", Integer.valueOf(aVar2.b()));
        f8568r5 = a("reet_msmd", Integer.valueOf(aVar.b()));
        f8576s5 = a("reet_asfp", Integer.valueOf(aVar.b()));
        f8584t5 = a("reet_asfg", Integer.valueOf(aVar.b()));
        f8592u5 = a("reet_aset", Integer.valueOf(aVar.b()));
        f8600v5 = a("reet_asaet", Integer.valueOf(aVar2.b()));
        f8608w5 = a("reet_esdi", Integer.valueOf(aVar.b()));
        f8616x5 = a("reet_esrp", Integer.valueOf(aVar.b()));
        f8624y5 = a("reet_lv", Integer.valueOf(aVar2.b()));
        f8632z5 = a("apdra", bool);
        A5 = a("apdrfs", bool);
        B5 = a("apdrma", bool);
        C5 = a("apdrmd", bool);
        D5 = a("apdrfa", bool);
        E5 = a("apdrev", bool);
        F5 = a("apdrdi", bool);
        G5 = a("apdrrp", bool);
        H5 = a("server_timestamp_ms", 0L);
        I5 = a("device_timestamp_ms", 0L);
        J5 = a("gzip_min_length", 0);
        K5 = a("gzip_encoding_default", bool);
        L5 = a("fetch_settings_gzip", bool);
        M5 = a("device_init_gzip", bool);
        N5 = a("fetch_ad_gzip", bool);
        O5 = a("event_tracking_gzip", bool);
        P5 = a("reward_postback_gzip", bool);
        Q5 = a("avg", bool);
        R5 = a("handle_render_process_gone", bool2);
        S5 = a("rworpg", bool2);
        T5 = a("fdadaomr", bool2);
        U5 = a("vfswccar", bool);
        V5 = a("sparafad", bool);
        W5 = a("fahctdmr", bool);
        X5 = a("mmcarc", bool);
        Y5 = a("teorpc", bool);
        Z5 = a("set_webview_render_process_client", bool);
        f8422a6 = a("disable_webview_hardware_acceleration", bool);
        f8430b6 = a("anr_detection_enabled", bool);
        f8439c6 = a("anr_trigger_millis", 4000L);
        f8448d6 = a("anr_touch_millis", 3000L);
        f8457e6 = a("anr_check_millis", 3000L);
        f8466f6 = a("spadib", bool);
        f8475g6 = a("uobid", bool2);
        f8484h6 = a("bvde", bool);
        f8493i6 = a("bvdidm", 1000L);
        f8502j6 = a("bvdim", 4000L);
        f8511k6 = a("bvdrs", 10);
        f8520l6 = a("bvdct", 230);
        f8529m6 = a("bvdict", 3);
        f8537n6 = a("bvad", bool);
        f8545o6 = a("bvebb", bool2);
        f8553p6 = a("bvscb", bool2);
        f8561q6 = a("bvlmtb", -1L);
        f8569r6 = a("bvsafw", bool2);
        f8577s6 = a("bvdtr", 2);
        f8585t6 = a("bvdtc", 2);
        f8593u6 = a("aocve", bool);
        f8601v6 = a("dwvvb", bool);
        f8609w6 = a("stcpc", bool);
        f8617x6 = a("stcic", bool2);
        f8625y6 = a("qjscwwvl", bool);
        f8633z6 = a("web_contents_debugging_enabled", bool);
        A6 = a("fcioiauiidb", bool2);
        B6 = a("teouauiidb", bool2);
        C6 = a("usc", bool);
        D6 = a("should_apply_web_view_settings_to_web_view_button", bool);
        E6 = a("should_use_cached_screen_size_for_foldable_devices", bool2);
        F6 = a("should_persist_shared_prefs_with_background_commit", bool);
        G6 = a("wvmldt", -1);
        H6 = a("fmldt", -1);
        I6 = a("csl", -1);
        J6 = a("should_use_applovin_adaptive_sizing_formula", bool);
        K6 = a("cdbpn", bool);
        L6 = a("cavdi", bool);
        M6 = a("pvdiaqp", bool);
        N6 = a("sudbia", bool);
        O6 = a("pbpn", "");
        P6 = a("nvelifapd", bool);
        Q6 = a("sufecfhrd", bool);
        R6 = a("ignored_auto_redirect_schemes", vc.a(",", new CharSequence[]{"about", "data", "file"}));
        S6 = a("esowod", bool);
        T6 = a("sswskan", bool);
        U6 = a("rfipt", bool);
        V6 = a("config_consent_dialog_state", "unknown");
        W6 = a("country_code", "");
        X6 = a("approved_installers_for_package_name_override", "com.google.android.packageinstaller");
        Y6 = a("consent_flow_doc_url", "https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow");
        Z6 = a("consent_flow_unity_doc_url", "https://support.axon.ai/en/max/unity/overview/terms-and-privacy-policy-flow");
        f8423a7 = a("cfadtml", 20);
        f8431b7 = a("cfgcsmrc", -1);
        f8440c7 = a("cfgcsrec", String.valueOf(3));
        f8449d7 = a("enable_custom_tabs_service", bool2);
        f8458e7 = a("custom_tabs_chrome_package_names", "com.android.chrome");
        f8467f7 = a("custom_tabs_prefer_default_browser", bool2);
        f8476g7 = a("custom_tabs_animation_enabled", bool2);
        f8485h7 = a("custom_tabs_open_external_browser_on_failure", bool2);
        f8494i7 = a("gawvbu", "https://applovin.com");
        f8503j7 = a("c_sticky_topics", "safedk_init,user_info");
        f8512k7 = a("communicator_enabled", bool2);
        f8521l7 = a("adse", bool2);
    }

    public x4(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f8634a = str;
        this.f8635b = obj;
    }

    public static Collection c() {
        return Collections.synchronizedCollection(f8441d.values());
    }

    public Object a() {
        return this.f8635b;
    }

    public String b() {
        return this.f8634a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof x4)) {
            return 0;
        }
        return this.f8634a.compareTo(((x4) obj).b());
    }

    public Object a(Object obj) {
        return this.f8635b.getClass().cast(obj);
    }

    public static x4 a(String str, Object obj) {
        if (obj != null) {
            if (f8432c.contains(obj.getClass())) {
                x4 x4Var = new x4(str, obj);
                Map map = f8441d;
                if (!map.containsKey(str)) {
                    map.put(str, x4Var);
                    return x4Var;
                }
                throw new IllegalArgumentException("Setting has already been used: " + str);
            }
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }

    public static x4 a(String str) {
        return (x4) f8441d.get(str);
    }
}
