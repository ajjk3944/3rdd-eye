package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC4453s3;
import com.google.android.gms.internal.measurement.AbstractC4461t3;
import com.google.android.gms.internal.measurement.C4305a7;
import com.google.android.gms.internal.measurement.C4322c6;
import com.google.android.gms.internal.measurement.C4337e3;
import com.google.android.gms.internal.measurement.C4350f7;
import com.google.android.gms.internal.measurement.C4359g7;
import com.google.android.gms.internal.measurement.C4367h6;
import com.google.android.gms.internal.measurement.C4376i6;
import com.google.android.gms.internal.measurement.C4425o6;
import com.google.android.gms.internal.measurement.C4433p6;
import com.google.android.gms.internal.measurement.C4472u6;
import com.google.android.gms.internal.measurement.C4480v6;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: A, reason: collision with root package name */
    public static final C4936q2 f36009A;

    /* renamed from: A0, reason: collision with root package name */
    public static final C4936q2 f36010A0;

    /* renamed from: B, reason: collision with root package name */
    public static final C4936q2 f36011B;

    /* renamed from: B0, reason: collision with root package name */
    public static final C4936q2 f36012B0;

    /* renamed from: C, reason: collision with root package name */
    public static final C4936q2 f36013C;

    /* renamed from: C0, reason: collision with root package name */
    public static final C4936q2 f36014C0;

    /* renamed from: D, reason: collision with root package name */
    public static final C4936q2 f36015D;

    /* renamed from: D0, reason: collision with root package name */
    public static final C4936q2 f36016D0;

    /* renamed from: E, reason: collision with root package name */
    public static final C4936q2 f36017E;

    /* renamed from: E0, reason: collision with root package name */
    public static final C4936q2 f36018E0;

    /* renamed from: F, reason: collision with root package name */
    public static final C4936q2 f36019F;

    /* renamed from: F0, reason: collision with root package name */
    public static final C4936q2 f36020F0;

    /* renamed from: G, reason: collision with root package name */
    public static final C4936q2 f36021G;

    /* renamed from: G0, reason: collision with root package name */
    public static final C4936q2 f36022G0;

    /* renamed from: H, reason: collision with root package name */
    public static final C4936q2 f36023H;

    /* renamed from: H0, reason: collision with root package name */
    public static final C4936q2 f36024H0;

    /* renamed from: I, reason: collision with root package name */
    public static final C4936q2 f36025I;

    /* renamed from: I0, reason: collision with root package name */
    public static final C4936q2 f36026I0;

    /* renamed from: J, reason: collision with root package name */
    public static final C4936q2 f36027J;

    /* renamed from: J0, reason: collision with root package name */
    public static final C4936q2 f36028J0;

    /* renamed from: K, reason: collision with root package name */
    public static final C4936q2 f36029K;

    /* renamed from: K0, reason: collision with root package name */
    public static final C4936q2 f36030K0;

    /* renamed from: L, reason: collision with root package name */
    public static final C4936q2 f36031L;

    /* renamed from: L0, reason: collision with root package name */
    public static final C4936q2 f36032L0;

    /* renamed from: M, reason: collision with root package name */
    public static final C4936q2 f36033M;

    /* renamed from: M0, reason: collision with root package name */
    public static final C4936q2 f36034M0;

    /* renamed from: N, reason: collision with root package name */
    public static final C4936q2 f36035N;

    /* renamed from: N0, reason: collision with root package name */
    public static final C4936q2 f36036N0;

    /* renamed from: O, reason: collision with root package name */
    public static final C4936q2 f36037O;

    /* renamed from: O0, reason: collision with root package name */
    public static final C4936q2 f36038O0;

    /* renamed from: P, reason: collision with root package name */
    public static final C4936q2 f36039P;

    /* renamed from: P0, reason: collision with root package name */
    public static final C4936q2 f36040P0;

    /* renamed from: Q, reason: collision with root package name */
    public static final C4936q2 f36041Q;

    /* renamed from: Q0, reason: collision with root package name */
    public static final C4936q2 f36042Q0;

    /* renamed from: R, reason: collision with root package name */
    public static final C4936q2 f36043R;

    /* renamed from: R0, reason: collision with root package name */
    public static final C4936q2 f36044R0;

    /* renamed from: S, reason: collision with root package name */
    public static final C4936q2 f36045S;

    /* renamed from: S0, reason: collision with root package name */
    public static final C4936q2 f36046S0;

    /* renamed from: T, reason: collision with root package name */
    public static final C4936q2 f36047T;

    /* renamed from: T0, reason: collision with root package name */
    public static final C4936q2 f36048T0;

    /* renamed from: U, reason: collision with root package name */
    public static final C4936q2 f36049U;

    /* renamed from: U0, reason: collision with root package name */
    public static final C4936q2 f36050U0;

    /* renamed from: V, reason: collision with root package name */
    public static final C4936q2 f36051V;

    /* renamed from: V0, reason: collision with root package name */
    public static final C4936q2 f36052V0;

    /* renamed from: W, reason: collision with root package name */
    public static final C4936q2 f36053W;

    /* renamed from: W0, reason: collision with root package name */
    public static final C4936q2 f36054W0;

    /* renamed from: X, reason: collision with root package name */
    public static final C4936q2 f36055X;

    /* renamed from: X0, reason: collision with root package name */
    public static final C4936q2 f36056X0;

    /* renamed from: Y, reason: collision with root package name */
    public static final C4936q2 f36057Y;

    /* renamed from: Y0, reason: collision with root package name */
    public static final C4936q2 f36058Y0;

    /* renamed from: Z, reason: collision with root package name */
    public static final C4936q2 f36059Z;

    /* renamed from: Z0, reason: collision with root package name */
    public static final C4936q2 f36060Z0;

    /* renamed from: a, reason: collision with root package name */
    private static final List f36061a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0, reason: collision with root package name */
    public static final C4936q2 f36062a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final C4936q2 f36063a1;

    /* renamed from: b, reason: collision with root package name */
    public static final C4936q2 f36064b;

    /* renamed from: b0, reason: collision with root package name */
    public static final C4936q2 f36065b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final C4936q2 f36066b1;

    /* renamed from: c, reason: collision with root package name */
    public static final C4936q2 f36067c;

    /* renamed from: c0, reason: collision with root package name */
    public static final C4936q2 f36068c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final C4936q2 f36069c1;

    /* renamed from: d, reason: collision with root package name */
    public static final C4936q2 f36070d;

    /* renamed from: d0, reason: collision with root package name */
    public static final C4936q2 f36071d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final C4936q2 f36072d1;

    /* renamed from: e, reason: collision with root package name */
    public static final C4936q2 f36073e;

    /* renamed from: e0, reason: collision with root package name */
    public static final C4936q2 f36074e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final C4936q2 f36075e1;

    /* renamed from: f, reason: collision with root package name */
    public static final C4936q2 f36076f;

    /* renamed from: f0, reason: collision with root package name */
    public static final C4936q2 f36077f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final C4936q2 f36078f1;

    /* renamed from: g, reason: collision with root package name */
    public static final C4936q2 f36079g;

    /* renamed from: g0, reason: collision with root package name */
    public static final C4936q2 f36080g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final C4936q2 f36081g1;

    /* renamed from: h, reason: collision with root package name */
    public static final C4936q2 f36082h;

    /* renamed from: h0, reason: collision with root package name */
    public static final C4936q2 f36083h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final C4936q2 f36084h1;

    /* renamed from: i, reason: collision with root package name */
    public static final C4936q2 f36085i;

    /* renamed from: i0, reason: collision with root package name */
    public static final C4936q2 f36086i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final C4936q2 f36087i1;

    /* renamed from: j, reason: collision with root package name */
    public static final C4936q2 f36088j;

    /* renamed from: j0, reason: collision with root package name */
    public static final C4936q2 f36089j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final C4936q2 f36090j1;

    /* renamed from: k, reason: collision with root package name */
    public static final C4936q2 f36091k;

    /* renamed from: k0, reason: collision with root package name */
    public static final C4936q2 f36092k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final C4936q2 f36093k1;

    /* renamed from: l, reason: collision with root package name */
    public static final C4936q2 f36094l;

    /* renamed from: l0, reason: collision with root package name */
    public static final C4936q2 f36095l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final C4936q2 f36096l1;

    /* renamed from: m, reason: collision with root package name */
    public static final C4936q2 f36097m;

    /* renamed from: m0, reason: collision with root package name */
    public static final C4936q2 f36098m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final C4936q2 f36099m1;

    /* renamed from: n, reason: collision with root package name */
    public static final C4936q2 f36100n;

    /* renamed from: n0, reason: collision with root package name */
    public static final C4936q2 f36101n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final C4936q2 f36102n1;

    /* renamed from: o, reason: collision with root package name */
    public static final C4936q2 f36103o;

    /* renamed from: o0, reason: collision with root package name */
    public static final C4936q2 f36104o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final C4936q2 f36105o1;

    /* renamed from: p, reason: collision with root package name */
    public static final C4936q2 f36106p;

    /* renamed from: p0, reason: collision with root package name */
    public static final C4936q2 f36107p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final C4936q2 f36108p1;

    /* renamed from: q, reason: collision with root package name */
    public static final C4936q2 f36109q;

    /* renamed from: q0, reason: collision with root package name */
    public static final C4936q2 f36110q0;

    /* renamed from: r, reason: collision with root package name */
    public static final C4936q2 f36111r;

    /* renamed from: r0, reason: collision with root package name */
    public static final C4936q2 f36112r0;

    /* renamed from: s, reason: collision with root package name */
    public static final C4936q2 f36113s;

    /* renamed from: s0, reason: collision with root package name */
    public static final C4936q2 f36114s0;

    /* renamed from: t, reason: collision with root package name */
    public static final C4936q2 f36115t;

    /* renamed from: t0, reason: collision with root package name */
    public static final C4936q2 f36116t0;

    /* renamed from: u, reason: collision with root package name */
    public static final C4936q2 f36117u;

    /* renamed from: u0, reason: collision with root package name */
    public static final C4936q2 f36118u0;

    /* renamed from: v, reason: collision with root package name */
    public static final C4936q2 f36119v;

    /* renamed from: v0, reason: collision with root package name */
    public static final C4936q2 f36120v0;

    /* renamed from: w, reason: collision with root package name */
    public static final C4936q2 f36121w;

    /* renamed from: w0, reason: collision with root package name */
    public static final C4936q2 f36122w0;

    /* renamed from: x, reason: collision with root package name */
    public static final C4936q2 f36123x;

    /* renamed from: x0, reason: collision with root package name */
    public static final C4936q2 f36124x0;

    /* renamed from: y, reason: collision with root package name */
    public static final C4936q2 f36125y;

    /* renamed from: y0, reason: collision with root package name */
    public static final C4936q2 f36126y0;

    /* renamed from: z, reason: collision with root package name */
    public static final C4936q2 f36127z;

    /* renamed from: z0, reason: collision with root package name */
    public static final C4936q2 f36128z0;

    static {
        Collections.synchronizedSet(new HashSet());
        f36064b = F("measurement.ad_id_cache_time", 10000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.P
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.a());
            }
        });
        f36067c = F("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.O0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.B());
            }
        });
        f36070d = F("measurement.monitoring.sample_period_millis", 86400000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.a1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.m0());
            }
        });
        f36073e = c("measurement.config.cache_time", 86400000L, 3600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.n1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.W());
            }
        }, false);
        f36076f = F("measurement.config.url_scheme", "https", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.z1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.H();
            }
        });
        f36079g = F("measurement.config.url_authority", "app-measurement.com", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.M1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.G();
            }
        });
        f36082h = F("measurement.upload.max_bundles", 100, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Y1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.t());
            }
        });
        Integer numValueOf = Integer.valueOf(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        f36085i = F("measurement.upload.max_batch_size", numValueOf, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.C());
            }
        });
        f36088j = F("measurement.upload.max_bundle_size", numValueOf, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.g0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.s());
            }
        });
        f36091k = F("measurement.upload.max_events_per_bundle", 1000, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.s0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.w());
            }
        });
        f36094l = F("measurement.upload.max_events_per_day", 100000, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.q0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.x());
            }
        });
        f36097m = F("measurement.upload.max_error_events_per_day", 1000, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.F0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.v());
            }
        });
        f36100n = F("measurement.upload.max_public_events_per_day", Integer.valueOf(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH), new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.H0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.y());
            }
        });
        f36103o = F("measurement.upload.max_conversions_per_day", 10000, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.G0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.u());
            }
        });
        f36106p = F("measurement.upload.max_realtime_events_per_day", 10, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.J0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.A());
            }
        });
        f36109q = F("measurement.store.max_stored_events_per_app", 100000, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.I0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.d0());
            }
        });
        f36111r = F("measurement.upload.url", "https://app-measurement.com/a", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.L0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.R();
            }
        });
        f36113s = F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.N0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.J();
            }
        });
        f36115t = F("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.M0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.L();
            }
        });
        f36117u = F("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.P0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.M();
            }
        });
        f36119v = F("measurement.sgtm.upload.retry_interval", 600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.R0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.h());
            }
        });
        f36121w = F("measurement.sgtm.upload.retry_max_wait", 21600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Q0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.i());
            }
        });
        f36123x = F("measurement.sgtm.batch.retry_interval", 1800000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.T0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.r0());
            }
        });
        f36125y = F("measurement.sgtm.batch.retry_max_wait", 21600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.S0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.b());
            }
        });
        f36127z = F("measurement.sgtm.batch.retry_max_count", 10, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.V0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.s0());
            }
        });
        f36009A = F("measurement.sgtm.upload.max_queued_batches", Integer.valueOf(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT), new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.U0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.d());
            }
        });
        f36011B = F("measurement.sgtm.upload.batches_retrieval_limit", 5, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.W0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.c());
            }
        });
        f36013C = F("measurement.sgtm.upload.min_delay_after_startup", 5000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Z0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.g());
            }
        });
        f36015D = F("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Y0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.f());
            }
        });
        f36017E = F("measurement.sgtm.upload.min_delay_after_background", 600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.b1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.e());
            }
        });
        f36019F = F("measurement.upload.backoff_period", 43200000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.d1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.p());
            }
        });
        f36021G = F("measurement.upload.window_interval", 3600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.c1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.F());
            }
        });
        f36023H = F("measurement.upload.interval", 3600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.g1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.r());
            }
        });
        f36025I = F("measurement.upload.realtime_upload_interval", 10000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.e1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.o0());
            }
        });
        f36027J = F("measurement.upload.debug_upload_interval", 1000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.i1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.X());
            }
        });
        f36029K = F("measurement.upload.minimum_delay", 500L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.k1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.l0());
            }
        });
        f36031L = F("measurement.alarm_manager.minimum_interval", 60000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.j1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.k0());
            }
        });
        f36033M = F("measurement.upload.stale_data_deletion_interval", 86400000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.m1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.j());
            }
        });
        f36035N = F("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.l1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.p0());
            }
        });
        f36037O = F("measurement.upload.initial_upload_delay_time", 15000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.o1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.q());
            }
        });
        f36039P = F("measurement.upload.retry_time", 1800000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.q1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.E());
            }
        });
        f36041Q = F("measurement.upload.retry_count", 6, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.p1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.D());
            }
        });
        f36043R = F("measurement.upload.max_queue_time", 518400000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.s1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.z());
            }
        });
        f36045S = F("measurement.upload.google_signal_max_queue_time", 300000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.r1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.Z());
            }
        });
        f36047T = F("measurement.lifetimevalue.max_currency_tracked", 4, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.t1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.a0());
            }
        });
        f36049U = F("measurement.audience.filter_result_max_count", 200, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.w1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.f0());
            }
        });
        f36051V = a("measurement.upload.max_public_user_properties", 100);
        f36053W = a("measurement.upload.max_event_name_cardinality", 2000);
        f36055X = a("measurement.upload.max_public_event_params", 100);
        f36057Y = F("measurement.service_client.idle_disconnect_millis", 5000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.v1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.q0());
            }
        });
        Boolean bool = Boolean.FALSE;
        f36059Z = F("measurement.test.boolean_flag", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.y1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.T6.f());
            }
        });
        f36062a0 = F("measurement.test.string_flag", "---", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.x1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return com.google.android.gms.internal.measurement.T6.e();
            }
        });
        f36065b0 = F("measurement.test.long_flag", -1L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.A1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.T6.d());
            }
        });
        b("measurement.test.cached_long_flag", -1L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.C1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(com.google.android.gms.internal.measurement.T6.b());
            }
        });
        f36068c0 = F("measurement.test.int_flag", -2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.B1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) com.google.android.gms.internal.measurement.T6.c());
            }
        });
        f36071d0 = F("measurement.test.double_flag", Double.valueOf(-3.0d), new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.E1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Double.valueOf(com.google.android.gms.internal.measurement.T6.a());
            }
        });
        f36074e0 = F("measurement.experiment.max_ids", 50, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.H1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.e0());
            }
        });
        f36077f0 = F("measurement.upload.max_item_scoped_custom_parameters", 27, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.F1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.g0());
            }
        });
        f36080g0 = b("measurement.upload.max_event_parameter_value_length", 500, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.J1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.c0());
            }
        });
        f36083h0 = F("measurement.max_bundles_per_iteration", 100, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.I1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.V());
            }
        });
        f36086i0 = F("measurement.sdk.attribution.cache.ttl", 604800000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.L1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.n());
            }
        });
        f36089j0 = F("measurement.redaction.app_instance_id.ttl", 7200000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.K1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.o());
            }
        });
        f36092k0 = F("measurement.rb.attribution.client.min_ad_services_version", 7, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.N1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.j0());
            }
        });
        f36095l0 = F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.P1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.b0());
            }
        });
        f36098m0 = F("measurement.rb.attribution.uri_scheme", "https", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.O1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.Q();
            }
        });
        f36101n0 = F("measurement.rb.attribution.uri_authority", "google-analytics.com", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Q1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.N();
            }
        });
        f36104o0 = F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.T1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.O();
            }
        });
        f36107p0 = F("measurement.session.engagement_interval", 3600000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.S1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.Y());
            }
        });
        f36110q0 = F("measurement.rb.attribution.app_allowlist", "*", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.V1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.K();
            }
        });
        f36112r0 = F("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.U1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.S();
            }
        });
        f36114s0 = F("measurement.rb.attribution.event_params", "value|currency", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.X1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.I();
            }
        });
        f36116t0 = F("measurement.rb.attribution.query_parameters_to_remove", "", new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.W1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return C4376i6.P();
            }
        });
        f36118u0 = F("measurement.rb.attribution.max_queue_time", 864000000L, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Z1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Long.valueOf(C4376i6.m());
            }
        });
        f36120v0 = F("measurement.rb.attribution.max_retry_delay_seconds", 16, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.b2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.k());
            }
        });
        f36122w0 = F("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.d2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.l());
            }
        });
        F("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.c2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.i0());
            }
        });
        f36124x0 = F("measurement.rb.max_trigger_registrations_per_day", 1000, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.f2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.h0());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f36126y0 = F("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.e2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4376i6.T());
            }
        });
        f36128z0 = F("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.i2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4376i6.U());
            }
        });
        f36010A0 = F("measurement.rb.attribution.notify_app_delay_millis", 3000, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.g2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4376i6.n0());
            }
        });
        f36012B0 = a("measurement.quality.checksum", bool);
        f36014C0 = F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.k2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.A6.c());
            }
        });
        f36016D0 = F("measurement.audience.refresh_event_count_filters_timestamp", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.j2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.A6.b());
            }
        });
        f36018E0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.m2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.A6.d());
            }
        });
        f36020F0 = F("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.S
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.N6.a());
            }
        });
        f36022G0 = F("measurement.integration.disable_firebase_instance_id", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.V
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.t7.b());
            }
        });
        f36024H0 = F("measurement.collection.service.update_with_analytics_fix", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.U
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.y7.a());
            }
        });
        f36026I0 = F("measurement.service.storage_consent_support_version", 203600, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.X
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Integer.valueOf((int) C4425o6.a());
            }
        });
        f36028J0 = F("measurement.service.store_null_safelist", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.W
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4480v6.b());
            }
        });
        f36030K0 = F("measurement.service.store_safelist", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Z
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4480v6.c());
            }
        });
        f36032L0 = F("measurement.session_stitching_token_enabled", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.Y
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4359g7.b());
            }
        });
        f36034M0 = F("measurement.sgtm.upload_queue", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.b0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.g());
            }
        });
        f36036N0 = F("measurement.sgtm.google_signal.enable", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.a0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.c());
            }
        });
        f36038O0 = F("measurement.sgtm.upload_on_uninstall", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.e0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.h());
            }
        });
        f36040P0 = F("measurement.sgtm.no_proxy.service", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.f0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.e());
            }
        });
        f36042Q0 = F("measurement.sgtm.service.batching_on_backgrounded", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.i0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.f());
            }
        });
        f36044R0 = b("measurement.sgtm.no_proxy.client", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.h0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.d());
            }
        });
        f36046S0 = b("measurement.sgtm.client.upload_on_backgrounded.dev", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.k0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.b());
            }
        });
        f36048T0 = b("measurement.sgtm.client.scion_upload_action", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.j0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.m7.a());
            }
        });
        f36050U0 = F("measurement.gmscore_client_telemetry", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.m0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.M6.a());
            }
        });
        f36052V0 = b("measurement.rb.attribution.service", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.l0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.i());
            }
        });
        f36054W0 = b("measurement.rb.attribution.client2", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.o0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.c());
            }
        });
        f36056X0 = F("measurement.rb.attribution.uuid_generation", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.n0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.k());
            }
        });
        f36058Y0 = F("measurement.rb.attribution.enable_trigger_redaction", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.p0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.j());
            }
        });
        F("measurement.rb.attribution.followup1.service", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.A0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.d());
            }
        });
        f36060Z0 = F("measurement.rb.attribution.retry_disposition", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.K0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.h());
            }
        });
        f36063a1 = F("measurement.rb.attribution.ad_campaign_info", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.X0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.b());
            }
        });
        f36066b1 = F("measurement.client.sessions.enable_fix_background_engagement", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.h1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.l7.a());
            }
        });
        f36069c1 = F("measurement.fix_engagement_on_reset_analytics_data", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.u1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.B6.a());
            }
        });
        f36072d1 = F("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.D1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4472u6.b());
            }
        });
        f36075e1 = F("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.R1
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4472u6.a());
            }
        });
        f36078f1 = F("measurement.set_default_event_parameters.fix_deferred_analytics_collection", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.a2
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4433p6.b());
            }
        });
        f36081g1 = F("measurement.chimera.parameter.service", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.T
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4367h6.b());
            }
        });
        f36084h1 = F("measurement.service.ad_impression.convert_value_to_double", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.c0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4322c6.a());
            }
        });
        F("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.r0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.g());
            }
        });
        F("measurement.remove_conflicting_first_party_apis.dev", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.u0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.Z6.a());
            }
        });
        f36087i1 = F("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.t0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.f());
            }
        });
        f36090j1 = F("measurement.rb.attribution.client.get_trigger_uris_async", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.w0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.U6.e());
            }
        });
        f36093k1 = F("measurement.backfill_session_ids.service", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.v0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4350f7.b());
            }
        });
        f36096l1 = F("measurement.tcf.consent_fix", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.y0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.s7.a());
            }
        });
        f36099m1 = F("measurement.experiment.enable_phenotype_experiment_reporting", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.x0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4305a7.a());
            }
        });
        f36102n1 = F("measurement.set_default_event_parameters.fix_service_request_ordering", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.z0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4433p6.c());
            }
        });
        F("measurement.set_default_event_parameters.fix_app_update_logging", bool2, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.C0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(C4433p6.a());
            }
        });
        f36105o1 = F("measurement.fix_high_memory.prune_ees_config", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.B0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.G6.a());
            }
        });
        f36108p1 = b("measurement.upload_controller.wait_initialization", bool, new InterfaceC4920o2() { // from class: com.google.android.gms.measurement.internal.D0
            @Override // com.google.android.gms.measurement.internal.InterfaceC4920o2
            public final Object zza() {
                return Boolean.valueOf(com.google.android.gms.internal.measurement.H6.a());
            }
        });
    }

    private static C4936q2 F(String str, Object obj, InterfaceC4920o2 interfaceC4920o2) {
        return c(str, obj, obj, interfaceC4920o2, false);
    }

    private static C4936q2 a(String str, Object obj) {
        return c(str, obj, obj, null, false);
    }

    private static C4936q2 b(String str, Object obj, InterfaceC4920o2 interfaceC4920o2) {
        return c(str, obj, obj, interfaceC4920o2, true);
    }

    private static C4936q2 c(String str, Object obj, Object obj2, InterfaceC4920o2 interfaceC4920o2, boolean z10) {
        C4936q2 c4936q2 = new C4936q2(str, obj, obj2, interfaceC4920o2);
        if (z10) {
            f36061a.add(c4936q2);
        }
        return c4936q2;
    }

    public static Map e(Context context) {
        C4337e3 c4337e3A = C4337e3.a(context.getContentResolver(), AbstractC4461t3.a("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.Q
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4453s3.m();
            }
        });
        return c4337e3A == null ? Collections.emptyMap() : c4337e3A.b();
    }
}
