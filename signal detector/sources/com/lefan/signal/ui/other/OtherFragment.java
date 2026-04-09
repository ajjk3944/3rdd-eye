package com.lefan.signal.ui.other;

import A1.t;
import D4.c;
import F4.b;
import K4.n;
import T4.f;
import T4.j;
import T4.k;
import T4.l;
import V4.a;
import V4.d;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import androidx.lifecycle.D;
import androidx.lifecycle.Q;
import c5.C0410g;
import com.apm.insight.R;
import f.C2314a;
import java.util.ArrayList;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2611o;
import q5.i;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final class OtherFragment extends AbstractComponentCallbacksC2617v implements a, SensorEventListener {

    /* renamed from: k0, reason: collision with root package name */
    public n f19096k0;

    /* renamed from: n0, reason: collision with root package name */
    public l f19099n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f19100o0;

    /* renamed from: p0, reason: collision with root package name */
    public SensorManager f19101p0;

    /* renamed from: q0, reason: collision with root package name */
    public Sensor f19102q0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f19104s0;

    /* renamed from: l0, reason: collision with root package name */
    public final String f19097l0 = "android.permission.ACCESS_FINE_LOCATION";

    /* renamed from: m0, reason: collision with root package name */
    public final d f19098m0 = new d();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f19103r0 = true;

    /* renamed from: t0, reason: collision with root package name */
    public String f19105t0 = "KM/H";

    /* renamed from: u0, reason: collision with root package name */
    public final D4.a f19106u0 = new D4.a(R.layout.copy_hor_liner_layout, 8);
    public final ArrayList v0 = new ArrayList();

    /* renamed from: w0, reason: collision with root package name */
    public final D4.a f19107w0 = new D4.a(R.layout.copy_hor_liner_layout, 7);

    /* renamed from: x0, reason: collision with root package name */
    public final ArrayList f19108x0 = new ArrayList();

    /* renamed from: y0, reason: collision with root package name */
    public final C0410g f19109y0 = new C0410g(new c(7, this));

    /* renamed from: z0, reason: collision with root package name */
    public final t f19110z0 = new t(2, this);

    /* renamed from: A0, reason: collision with root package name */
    public final C2611o f19094A0 = (C2611o) P(new C2314a(2), new f(this, 2));

    /* renamed from: B0, reason: collision with root package name */
    public final C2611o f19095B0 = (C2611o) P(new C2314a(3), new b(18));

    public static final double X(OtherFragment otherFragment) {
        return ((Number) otherFragment.f19109y0.getValue()).doubleValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:82|(2:294|83)|87|(1:89)(1:90)|91|(15:280|92|300|93|292|94|95|287|96|285|97|98|281|99|(2:100|(2:102|(1:303)(1:139))(2:302|140)))|138|157|(1:159)(1:160)|161|298|162|(2:165|163)|304|168|171|(6:(1:175)(1:176)|177|(1:182)(1:181)|(2:309|(3:308|185|314)(3:307|186|313))(2:306|(1:310)(2:189|312))|311|172)|305|188|190|296|191|(2:194|192)|315|197|200|(5:(1:203)(1:204)|205|(1:210)(1:209)|(2:320|(3:319|213|325)(3:317|214|324))(2:316|(1:321)(2:217|323))|322)|318|216|218|(1:220)(1:221)|222|290|223|(4:225|(1:229)|232|(1:236))(4:237|(1:243)|244|(1:250))|251|(1:253)(1:254)|255|256|(1:258)|259|262|263) */
    /* JADX WARN: Can't wrap try/catch for region: R(44:82|294|83|87|(1:89)(1:90)|91|(15:280|92|300|93|292|94|95|287|96|285|97|98|281|99|(2:100|(2:102|(1:303)(1:139))(2:302|140)))|138|157|(1:159)(1:160)|161|298|162|(2:165|163)|304|168|171|(6:(1:175)(1:176)|177|(1:182)(1:181)|(2:309|(3:308|185|314)(3:307|186|313))(2:306|(1:310)(2:189|312))|311|172)|305|188|190|296|191|(2:194|192)|315|197|200|(5:(1:203)(1:204)|205|(1:210)(1:209)|(2:320|(3:319|213|325)(3:317|214|324))(2:316|(1:321)(2:217|323))|322)|318|216|218|(1:220)(1:221)|222|290|223|(4:225|(1:229)|232|(1:236))(4:237|(1:243)|244|(1:250))|251|(1:253)(1:254)|255|256|(1:258)|259|262|263) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04c3, code lost:
    
        r0 = r7.group(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04c8, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04ce, code lost:
    
        if (r0.length() != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04d2, code lost:
    
        r0 = r7.group(0);
        q5.i.b(r0);
        r5 = java.util.regex.Pattern.compile(":");
        q5.i.d(r5, "compile(...)");
        r5 = r5.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04ec, code lost:
    
        if (r5.find() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04ee, code lost:
    
        r0 = a4.p.l(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04f7, code lost:
    
        r7 = new java.util.ArrayList(10);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04ff, code lost:
    
        r7.add(r0.subSequence(r8, r5.start()).toString());
        r8 = r5.end();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0516, code lost:
    
        if (r5.find() != false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0518, code lost:
    
        r7.add(r0.subSequence(r8, r0.length()).toString());
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0528, code lost:
    
        r5 = r0.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x052e, code lost:
    
        if (r5 > 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0530, code lost:
    
        r0 = d5.s.f19824a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0533, code lost:
    
        if (r5 != 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0535, code lost:
    
        r0 = a4.p.l(d5.AbstractC2282j.Y(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x053e, code lost:
    
        r7 = new java.util.ArrayList(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0545, code lost:
    
        if ((r0 instanceof java.util.RandomAccess) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0547, code lost:
    
        r5 = r0.size();
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x054c, code lost:
    
        if (r8 >= r5) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x054e, code lost:
    
        r7.add(r0.get(r8));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0558, code lost:
    
        r0 = r0.listIterator(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0561, code lost:
    
        if (r0.hasNext() == false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0563, code lost:
    
        r7.add(r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x056b, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x056c, code lost:
    
        r0 = y5.l.j0(d5.AbstractC2282j.X(r0, "", null, 62)).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x057b, code lost:
    
        r15.close();
        r13 = r0;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0585, code lost:
    
        r15.close();
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x064c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0652, code lost:
    
        r0.printStackTrace();
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x06cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x06d1, code lost:
    
        r0.printStackTrace();
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x077b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x091b, code lost:
    
        R2.a.d(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0635 A[Catch: IOException -> 0x064c, LOOP:1: B:163:0x062e->B:165:0x0635, LOOP_END, TryCatch #10 {IOException -> 0x064c, blocks: (B:162:0x0611, B:163:0x062e, B:165:0x0635, B:168:0x064e), top: B:298:0x0611 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06b4 A[Catch: IOException -> 0x06cb, LOOP:3: B:192:0x06ad->B:194:0x06b4, LOOP_END, TryCatch #9 {IOException -> 0x06cb, blocks: (B:191:0x0691, B:192:0x06ad, B:194:0x06b4, B:197:0x06cd), top: B:296:0x0691 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x076b A[Catch: all -> 0x077b, TryCatch #6 {all -> 0x077b, blocks: (B:223:0x075d, B:225:0x076b, B:227:0x0771, B:229:0x0777, B:232:0x077e, B:234:0x0784, B:236:0x078a, B:251:0x07b8, B:253:0x086d, B:255:0x0875, B:258:0x087b, B:259:0x08c0, B:237:0x078e, B:239:0x0794, B:241:0x079a, B:243:0x07a0, B:244:0x07a3, B:246:0x07a9, B:248:0x07af, B:250:0x07b5), top: B:290:0x075d }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x078e A[Catch: all -> 0x077b, TryCatch #6 {all -> 0x077b, blocks: (B:223:0x075d, B:225:0x076b, B:227:0x0771, B:229:0x0777, B:232:0x077e, B:234:0x0784, B:236:0x078a, B:251:0x07b8, B:253:0x086d, B:255:0x0875, B:258:0x087b, B:259:0x08c0, B:237:0x078e, B:239:0x0794, B:241:0x079a, B:243:0x07a0, B:244:0x07a3, B:246:0x07a9, B:248:0x07af, B:250:0x07b5), top: B:290:0x075d }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x086d A[Catch: all -> 0x077b, TryCatch #6 {all -> 0x077b, blocks: (B:223:0x075d, B:225:0x076b, B:227:0x0771, B:229:0x0777, B:232:0x077e, B:234:0x0784, B:236:0x078a, B:251:0x07b8, B:253:0x086d, B:255:0x0875, B:258:0x087b, B:259:0x08c0, B:237:0x078e, B:239:0x0794, B:241:0x079a, B:243:0x07a0, B:244:0x07a3, B:246:0x07a9, B:248:0x07af, B:250:0x07b5), top: B:290:0x075d }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x087b A[Catch: all -> 0x077b, TRY_ENTER, TryCatch #6 {all -> 0x077b, blocks: (B:223:0x075d, B:225:0x076b, B:227:0x0771, B:229:0x0777, B:232:0x077e, B:234:0x0784, B:236:0x078a, B:251:0x07b8, B:253:0x086d, B:255:0x0875, B:258:0x087b, B:259:0x08c0, B:237:0x078e, B:239:0x0794, B:241:0x079a, B:243:0x07a0, B:244:0x07a3, B:246:0x07a9, B:248:0x07af, B:250:0x07b5), top: B:290:0x075d }] */
    /* JADX WARN: Type inference failed for: r0v72, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1, types: [androidx.appcompat.widget.LinearLayoutCompat] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    @Override // k0.AbstractComponentCallbacksC2617v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View C(android.view.LayoutInflater r29, android.view.ViewGroup r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.other.OtherFragment.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void D() {
        this.f21694R = true;
        this.f19096k0 = null;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void H() {
        this.f21694R = true;
        this.f19098m0.c();
        Context contextM = m();
        if (contextM != null) {
            contextM.unregisterReceiver(this.f19110z0);
        }
        SensorManager sensorManager = this.f19101p0;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void I() {
        SensorManager sensorManager;
        String string;
        this.f21694R = true;
        Context contextM = m();
        String str = "KM/H";
        boolean zRegisterListener = false;
        if (contextM != null && (string = contextM.getSharedPreferences("sp", 0).getString("speed_unit_string", "KM/H")) != null) {
            str = string;
        }
        this.f19105t0 = str;
        l lVar = this.f19099n0;
        if (lVar == null) {
            i.g("viewModel");
            throw null;
        }
        D d6 = lVar.i;
        Boolean bool = Boolean.TRUE;
        d6.j(bool);
        Context contextM2 = m();
        String str2 = this.f19097l0;
        i.e(str2, "string");
        if (contextM2 != null && G.c.a(contextM2, str2) == 0) {
            this.f19098m0.b(R());
            l lVar2 = this.f19099n0;
            if (lVar2 == null) {
                i.g("viewModel");
                throw null;
            }
            lVar2.f3626g.j(bool);
        } else {
            l lVar3 = this.f19099n0;
            if (lVar3 == null) {
                i.g("viewModel");
                throw null;
            }
            lVar3.f3626g.j(Boolean.FALSE);
        }
        Context contextM3 = m();
        if (contextM3 != null) {
            contextM3.registerReceiver(this.f19110z0, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        }
        Sensor sensor = this.f19102q0;
        if (sensor != null && (sensorManager = this.f19101p0) != null) {
            zRegisterListener = sensorManager.registerListener(this, sensor, 3);
        }
        this.f19104s0 = zRegisterListener;
    }

    @Override // V4.a
    public final void e(ArrayList arrayList) {
        i.e(arrayList, "satelliteBeans");
        l lVar = this.f19099n0;
        if (lVar != null) {
            lVar.f3624e.j(arrayList);
        } else {
            i.g("viewModel");
            throw null;
        }
    }

    @Override // V4.a
    public final void h(boolean z6) {
        l lVar = this.f19099n0;
        if (lVar != null) {
            lVar.i.j(Boolean.valueOf(z6));
        } else {
            i.g("viewModel");
            throw null;
        }
    }

    @Override // V4.a
    public final void i(Location location) {
        CharSequence charSequence;
        l lVar = this.f19099n0;
        if (lVar == null) {
            i.g("viewModel");
            throw null;
        }
        D d6 = lVar.f3631m;
        d6.j(location);
        Location location2 = (Location) d6.d();
        if (location2 == null) {
            AbstractC3046w.l(Q.h(lVar), null, new k(lVar, location, null), 3);
            return;
        }
        float[] fArr = new float[1];
        Location.distanceBetween(location2.getLatitude(), location2.getLongitude(), location.getLatitude(), location.getLongitude(), fArr);
        if (fArr[0] > 500.0f || (charSequence = (CharSequence) lVar.f3629k.d()) == null || charSequence.length() == 0) {
            AbstractC3046w.l(Q.h(lVar), null, new j(lVar, location, null), 3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        if (this.f19103r0) {
            if ((sensorEvent != null ? sensorEvent.sensor : null) == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 6) {
                return;
            }
            l lVar = this.f19099n0;
            if (lVar != null) {
                lVar.f3622c.j(Double.valueOf((1 - Math.pow(sensorEvent.values[0] / 1013.25d, 0.19029495718363465d)) * 44330.0d));
            } else {
                i.g("viewModel");
                throw null;
            }
        }
    }

    @Override // V4.a
    public final void b() {
    }
}
