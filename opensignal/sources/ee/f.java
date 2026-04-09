package ee;

import android.content.Context;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection$Factory;
import com.google.android.gms.libs.identity.zzee;
import com.google.android.gms.location.LastLocationRequest;
import h9.r2;
import io.sentry.b5;
import io.sentry.u0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mi.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pb.j0;

/* loaded from: classes.dex */
public class f implements r5.k, com.opensignal.sdk.common.measurements.base.f, f7.d, fj.a, k2.w, kc.d, rs.r, bc.i, j0, r5.o, oh.o, th.a, u5.d, v9.a, xj.g {

    /* renamed from: d, reason: collision with root package name */
    public static f f8094d;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f f8095g = new f(21);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8096a;

    public /* synthetic */ f(int i10) {
        this.f8096a = i10;
    }

    public static final long m(String str, boolean z10, long j) {
        if (br.l.a(str, "core") || z10) {
            return 0L;
        }
        return j;
    }

    public static final long n(String str, boolean z10, long j) {
        if (!br.l.a(str, "core") && z10) {
            return j;
        }
        return 0L;
    }

    public static final Field o(u0 u0Var, String str) throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = Class.forName(str).getDeclaredField("tag");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            u0Var.m(b5.WARNING, h0.b.o("Could not load ", str, ".tag field"), new Object[0]);
            return null;
        }
    }

    public static Typeface r(String str, k2.r rVar, int i10) {
        if (i10 == 0 && br.l.a(rVar, k2.r.f14002x) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iV = kc.f.v(i10, rVar);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iV) : Typeface.create(str, iV);
    }

    public static String s(ArrayList arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            e0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wf_info_element_id", e0Var.f16809a);
            jSONObject.put("wf_info_element_ext", e0Var.f16810b);
            jSONObject.put("wf_info_element_encoded_bytes", e0Var.f16811c);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean u(l4.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.f.u(l4.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean v(ak.s sVar, ak.s sVar2, boolean z10) {
        Integer num = sVar2.f657b;
        ch.n.b("ConnectionChecker", "hasChanged() called with: oldConnection = " + sVar + ", newConnection = " + sVar2);
        if (sVar != null && br.l.a(sVar.f657b, num)) {
            if (num != null && num.intValue() == 0) {
                if (sVar.f663h == sVar2.f663h && br.l.a(sVar.f658c, sVar2.f658c) && ((!z10 || br.l.a(sVar.f665l, sVar2.f665l)) && br.l.a(sVar.f661f, sVar2.f661f) && br.l.a(sVar.j, sVar2.j) && br.l.a(sVar.k, sVar2.k))) {
                    return false;
                }
            } else if (num == null || num.intValue() != 1 || br.l.a(sVar.f662g, sVar2.f662g)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer A(NetworkRegistrationInfo networkRegistrationInfo) {
        Parcel parcelObtain = Parcel.obtain();
        br.l.d(parcelObtain, "obtain(...)");
        networkRegistrationInfo.writeToParcel(parcelObtain, 1);
        parcelObtain.setDataPosition(0);
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readBoolean();
        parcelObtain.readList(new ArrayList(), Integer.TYPE.getClassLoader());
        parcelObtain.readParcelable(a1.h.o().getClassLoader(), a1.h.o());
        parcelObtain.readParcelable(Parcelable.class.getClassLoader(), Parcelable.class);
        parcelObtain.readParcelable(Parcelable.class.getClassLoader(), Parcelable.class);
        int i10 = parcelObtain.readInt();
        ch.n.b("ServiceStateParcelMapperApi34", "getNrState() return: = [" + i10 + ']');
        return Integer.valueOf(i10);
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer B(ServiceState serviceState) {
        return i3.g.s(this, serviceState);
    }

    @Override // bc.i
    public void accept(Object obj, Object obj2) {
        dd.h hVar = (dd.h) obj2;
        pc.h hVar2 = (pc.h) obj;
        LastLocationRequest lastLocationRequest = new LastLocationRequest(Long.MAX_VALUE, 0, false, null);
        if (hVar2.v(tc.e.f22701b)) {
            pc.r rVar = (pc.r) hVar2.m();
            zzee zzeeVar = new zzee(4, null, new pc.d(1, hVar), null, null);
            Parcel parcelR = rVar.R();
            pc.b.b(parcelR, lastLocationRequest);
            pc.b.b(parcelR, zzeeVar);
            rVar.S(parcelR, 90);
            return;
        }
        if (hVar2.v(tc.e.f22700a)) {
            pc.r rVar2 = (pc.r) hVar2.m();
            pc.d dVar = new pc.d(1, hVar);
            Parcel parcelR2 = rVar2.R();
            pc.b.b(parcelR2, lastLocationRequest);
            parcelR2.writeStrongBinder(dVar);
            rVar2.S(parcelR2, 82);
            return;
        }
        pc.r rVar3 = (pc.r) hVar2.m();
        Parcel parcelR3 = rVar3.R();
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                rVar3.f5251e.transact(7, parcelR3, parcelObtain, 0);
                parcelObtain.readException();
                parcelR3.recycle();
                Location location = (Location) pc.b.a(parcelObtain, Location.CREATOR);
                parcelObtain.recycle();
                hVar.a(location);
            } catch (RuntimeException e4) {
                parcelObtain.recycle();
                throw e4;
            }
        } catch (Throwable th2) {
            parcelR3.recycle();
            throw th2;
        }
    }

    @Override // r5.k, pb.j0
    public void c() {
        switch (this.f8096a) {
            case 2:
                synchronized (androidx.media3.exoplayer.util.c.f1937a) {
                    Object obj = androidx.media3.exoplayer.util.c.f1938b;
                    synchronized (obj) {
                        if (androidx.media3.exoplayer.util.c.f1939c) {
                            return;
                        }
                        long jA = androidx.media3.exoplayer.util.c.a();
                        synchronized (obj) {
                            androidx.media3.exoplayer.util.c.f1940d = jA;
                            androidx.media3.exoplayer.util.c.f1939c = true;
                        }
                        return;
                    }
                }
            default:
                synchronized (qb.b.f20764g) {
                    Object obj2 = qb.b.f20765h;
                    synchronized (obj2) {
                        if (qb.b.f20766i) {
                            return;
                        }
                        long jA2 = qb.b.a();
                        synchronized (obj2) {
                            qb.b.j = jA2;
                            qb.b.f20766i = true;
                        }
                        return;
                    }
                }
        }
    }

    @Override // r5.k, pb.j0
    public void d() {
        int i10 = this.f8096a;
    }

    @Override // v9.a
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152 A[PHI: r1
  0x0152: PHI (r1v21 java.lang.Double) = (r1v7 java.lang.Double), (r1v22 java.lang.Double) binds: [B:117:0x015f, B:112:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a A[PHI: r1
  0x016a: PHI (r1v18 java.lang.Integer) = (r1v10 java.lang.Integer), (r1v20 java.lang.Integer) binds: [B:128:0x0178, B:122:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    @Override // xj.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.f.g(java.lang.Object):java.lang.Object");
    }

    @Override // kc.d
    public kc.c h(Context context, String str, kc.b bVar) {
        kc.c cVar = new kc.c();
        int iC = bVar.c(context, str, true);
        cVar.f14270b = iC;
        if (iC != 0) {
            cVar.f14271c = 1;
            return cVar;
        }
        int iD = bVar.d(context, str);
        cVar.f14269a = iD;
        if (iD != 0) {
            cVar.f14271c = -1;
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // k2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface i(k2.t r5, k2.r r6, int r7) {
        /*
            r4 = this;
            r5.getClass()
            int r5 = r6.f14004a
            int r5 = r5 / 100
            java.lang.String r0 = "sans-serif"
            r1 = 2
            if (r5 < 0) goto L11
            if (r5 >= r1) goto L11
            java.lang.String r5 = "sans-serif-thin"
            goto L33
        L11:
            r2 = 4
            if (r1 > r5) goto L19
            if (r5 >= r2) goto L19
            java.lang.String r5 = "sans-serif-light"
            goto L33
        L19:
            if (r5 != r2) goto L1d
        L1b:
            r5 = r0
            goto L33
        L1d:
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.String r5 = "sans-serif-medium"
            goto L33
        L23:
            r1 = 6
            r2 = 8
            if (r1 > r5) goto L2b
            if (r5 >= r2) goto L2b
            goto L1b
        L2b:
            if (r2 > r5) goto L1b
            r1 = 11
            if (r5 >= r1) goto L1b
            java.lang.String r5 = "sans-serif-black"
        L33:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L3b
            goto L5a
        L3b:
            android.graphics.Typeface r5 = r(r5, r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            int r3 = kc.f.v(r7, r6)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
            boolean r1 = br.l.a(r5, r1)
            if (r1 != 0) goto L5a
            android.graphics.Typeface r1 = r(r2, r6, r7)
            boolean r1 = br.l.a(r5, r1)
            if (r1 != 0) goto L5a
            r2 = r5
        L5a:
            if (r2 != 0) goto L61
            android.graphics.Typeface r5 = r(r0, r6, r7)
            return r5
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.f.i(k2.t, k2.r, int):android.graphics.Typeface");
    }

    @Override // oh.o
    public oh.i j(Context context, int[] iArr, ak.a aVar, r2 r2Var) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        b5.b0 b0VarO;
        br.l.e(context, "context");
        br.l.e(iArr, "buffer");
        br.l.e(r2Var, "networkGenerationChecker");
        r5.e eVar = new r5.e();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        d5.e.a("bufferForPlaybackMs", i12, 0, "0");
        d5.e.a("bufferForPlaybackAfterRebufferMs", i13, 0, "0");
        d5.e.a("minBufferMs", i10, i12, "bufferForPlaybackMs");
        d5.e.a("minBufferMs", i10, i13, "bufferForPlaybackAfterRebufferMs");
        d5.e.a("maxBufferMs", i11, i10, "minBufferMs");
        d5.e eVar2 = new d5.e(eVar, i10, i11, i12, i13);
        ch.n.b("Media3VideoPlayerFactory", "getExoPlayer() called with: adaptiveConfig = " + aVar);
        d5.k kVar = new d5.k(context);
        a5.a.i(kVar.f7021s ^ true);
        kVar.f7010f = new com.google.android.exoplayer2.z(1, eVar2);
        if (aVar != null) {
            long j = aVar.I;
            long j7 = aVar.J;
            long j10 = aVar.G;
            long j11 = aVar.F;
            long j12 = aVar.E;
            long j13 = aVar.D;
            int i14 = aVar.f412y;
            long j14 = aVar.f411x;
            androidx.media3.exoplayer.trackselection.b bVar = new androidx.media3.exoplayer.trackselection.b(aVar.f407a, aVar.f408d, aVar.f409g, aVar.f410r);
            try {
                int i15 = DefaultTrackSelector.f1857a;
                Object objNewInstance = DefaultTrackSelector.class.getConstructor(Context.class, ExoTrackSelection$Factory.class).newInstance(context, bVar);
                br.l.c(objNewInstance, "null cannot be cast to non-null type androidx.media3.exoplayer.trackselection.DefaultTrackSelector");
                DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) objNewInstance;
                if (aVar.O) {
                    ch.n.b("Media3VideoPlayerFactory", "Ignoring Device Screen Resolution");
                    androidx.media3.exoplayer.trackselection.l parameters = defaultTrackSelector.getParameters();
                    br.l.d(parameters, "getParameters(...)");
                    androidx.media3.exoplayer.trackselection.k kVar2 = new androidx.media3.exoplayer.trackselection.k(parameters);
                    kVar2.b(Integer.MAX_VALUE, Integer.MAX_VALUE);
                    defaultTrackSelector.setParameters(kVar2);
                }
                a5.a.i(!kVar.f7021s);
                kVar.f7009e = new com.google.android.exoplayer2.z(3, defaultTrackSelector);
                ch.n.b("Media3VideoPlayerFactory", "AdaptiveTrackSelection set successfully");
            } catch (Exception e4) {
                ch.n.d("Media3VideoPlayerFactory", "AdaptiveTrackSelection exception", e4);
            }
            oh.e eVarB = oh.e.b(context, new ch.f());
            eVarB.f19455a = r2Var;
            int i16 = aVar.B;
            ch.n.b("BandwidthMeterFactory", h0.b.h(i16, "bandwidthOverride: "));
            if (i16 == 1) {
                l5.c cVar = new l5.c(context, 2);
                HashMap map = (HashMap) cVar.f14688e;
                for (Integer num : map.keySet()) {
                    num.getClass();
                    map.put(num, Long.valueOf(j14));
                }
                cVar.f14685b = i14;
                b0VarO = cVar.o();
            } else if (i16 == 2) {
                l5.c cVar2 = new l5.c(context, 2);
                HashMap map2 = (HashMap) cVar2.f14688e;
                for (Integer num2 : map2.keySet()) {
                    num2.getClass();
                    map2.put(num2, Long.valueOf(j14));
                }
                cVar2.f14685b = i14;
                cVar2.q(0, j14);
                cVar2.q(1, j14);
                cVar2.q(6, j14);
                cVar2.q(7, j14);
                cVar2.q(8, j14);
                cVar2.q(2, j13);
                cVar2.q(3, j12);
                cVar2.q(4, j11);
                cVar2.q(5, j10);
                cVar2.q(9, j7);
                cVar2.q(10, j);
                b0VarO = cVar2.o();
            } else if (i16 != 3) {
                b0VarO = new l5.c(context, 2).o();
            } else {
                Context applicationContext = context.getApplicationContext();
                HashMap map3 = new HashMap();
                for (Integer num3 : map3.keySet()) {
                    num3.getClass();
                    map3.put(num3, Long.valueOf(j14));
                }
                map3.put(2, Long.valueOf(j13));
                map3.put(3, Long.valueOf(j12));
                map3.put(4, Long.valueOf(j11));
                map3.put(5, Long.valueOf(j10));
                map3.put(9, Long.valueOf(j7));
                map3.put(10, Long.valueOf(j));
                map3.put(11, Long.valueOf(aVar.K));
                b0VarO = new rh.h(applicationContext, map3, i14, a5.b.f92a, true, eVarB);
            }
            z10 = true;
            a5.a.i(!kVar.f7021s);
            kVar.f7011g = new com.google.android.exoplayer2.z(2, b0VarO);
        } else {
            z10 = true;
        }
        a5.a.i(kVar.f7021s ^ z10);
        kVar.f7021s = z10;
        return new oh.i(new rh.e(new d5.z(kVar)));
    }

    @Override // k2.w
    public Typeface k(int i10, k2.r rVar) {
        return r(null, rVar, i10);
    }

    @Override // fj.a
    public List l(TelephonyManager telephonyManager) {
        return mq.w.f16945a;
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public String t() {
        return "ServiceStateParcelMapperApi34";
    }

    @Override // th.a
    public boolean z(String str) {
        br.l.e(str, "url");
        return true;
    }

    private final void p() {
    }

    private final void q() {
    }

    @Override // r5.o
    public void a() {
    }

    @Override // u5.d
    public long b(long j) {
        return j;
    }

    @Override // f7.d
    public void f(int i10, Object obj) {
    }
}
