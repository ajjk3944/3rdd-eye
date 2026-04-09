package gi;

import android.location.Location;
import android.os.Bundle;
import br.l;
import ch.f;
import h9.r2;
import hk.h;
import hk.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jj.n0;
import jj.o0;
import mq.o;
import p.l2;
import xi.j;
import xi.u;
import xj.i;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9588a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9589d;

    public e(f fVar, df.c cVar) {
        this.f9589d = fVar;
    }

    @Override // xj.h
    public final Object a(Object obj) throws Throwable {
        m mVar;
        switch (this.f9588a) {
            case 0:
                rj.f fVar = (rj.f) obj;
                ch.d dVar = (ch.d) this.f9589d;
                l.e(fVar, "input");
                long j = fVar.f21591a;
                String str = fVar.f21592b;
                String str2 = fVar.f21593c;
                ArrayList arrayListB = b(fVar.f21594d);
                ArrayList arrayListB2 = b(fVar.f21595e);
                gk.c cVar = new gk.c(fVar.k, fVar.f21600l, fVar.f21596f, fVar.f21597g, fVar.f21599i, fVar.f21601m, fVar.f21602n, fVar.f21603o, fVar.f21598h, fVar.f21604p, fVar.f21606r, fVar.f21607s, fVar.f21608t);
                String str3 = fVar.j;
                String str4 = fVar.f21592b;
                List listN0 = tt.l.N0(str3, new String[]{","}, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    vj.b bVarG = dVar.P().g((String) it.next(), str4);
                    if (bVarG != null) {
                        arrayList.add(bVarG);
                    }
                }
                ek.c cVarS = dVar.S();
                hk.l lVar = m.Companion;
                String str5 = fVar.f21605q;
                lVar.getClass();
                l.e(str5, "name");
                m[] mVarArrValues = m.values();
                int length = mVarArrValues.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        mVar = mVarArrValues[i10];
                        if (!l.a(mVar.name(), str5)) {
                            i10++;
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar == null) {
                    mVar = m.READY;
                }
                m mVar2 = mVar;
                boolean z10 = fVar.f21609u;
                boolean z11 = fVar.f21610v;
                r2 r2VarI0 = dVar.I0();
                String str6 = fVar.f21611w;
                String str7 = fVar.f21612x;
                l2 l2VarS0 = dVar.s0();
                bj.c cVarO0 = dVar.O0();
                r2 r2VarJ0 = dVar.J0();
                ek.c cVarR0 = dVar.R0();
                u uVarZ = dVar.Z();
                boolean z12 = fVar.f21613y;
                q3.a aVarN = dVar.n();
                long j7 = fVar.f21614z;
                long j10 = fVar.A;
                boolean z13 = fVar.B;
                int i11 = fVar.C;
                mj.b.Companion.getClass();
                mj.b bVarA = mj.a.a(i11);
                List listN02 = tt.l.N0(fVar.D, new String[]{","}, 6);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listN02) {
                    if (!tt.l.D0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                int i12 = fVar.E;
                ak.u uVar = (ak.u) ((a) dVar.D()).g(fVar.F);
                String str8 = fVar.G;
                j jVarO = dVar.o();
                cj.a aVarU0 = dVar.u0();
                boolean z14 = fVar.H;
                dVar.G();
                return new h(j, str, str2, arrayListB, arrayListB2, cVar, arrayList, cVarS, r2VarI0, l2VarS0, cVarO0, r2VarJ0, cVarR0, aVarN, uVarZ, mVar2, z14, z10, z11, z12, str6, str7, j7, j10, bVarA, z13, arrayList2, i12, uVar, str8, jVarO, aVarU0, new fh.f(0), dVar.A(), fVar.I, dVar.Q(), dVar.q());
            default:
                Location location = (Location) obj;
                f fVar2 = (f) this.f9589d;
                l.e(location, "input");
                Bundle extras = location.getExtras();
                int i13 = extras != null ? extras.getInt("satellites", 0) : 0;
                long jConvert = TimeUnit.MILLISECONDS.convert(location.getElapsedRealtimeNanos(), TimeUnit.NANOSECONDS);
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean zIsFromMockProvider = location.isFromMockProvider();
                Float fValueOf = null;
                Double dValueOf = (fVar2.i() && location.hasMslAltitude()) ? Double.valueOf(location.getMslAltitudeMeters()) : null;
                Float fValueOf2 = (fVar2.c() && location.hasVerticalAccuracy()) ? Float.valueOf(location.getVerticalAccuracyMeters()) : null;
                if (fVar2.i() && location.hasMslAltitudeAccuracy()) {
                    fValueOf = Float.valueOf(location.getMslAltitudeAccuracyMeters());
                }
                Float f10 = fValueOf;
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                String provider = location.getProvider();
                if (provider == null) {
                    provider = "";
                }
                return new ak.u(latitude, longitude, provider, jConvert, jCurrentTimeMillis, location.getTime(), location.getAltitude(), location.getSpeed(), location.getBearing(), location.getAccuracy(), i13, zIsFromMockProvider, dValueOf, f10, fValueOf2);
        }
    }

    public ArrayList b(String str) throws CloneNotSupportedException {
        List listN0 = tt.l.N0(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN0) {
            if (!tt.l.D0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            o0.Companion.getClass();
            o0 o0VarA = n0.a(str2);
            ik.a aVarD = o0VarA == null ? null : ((ch.d) this.f9589d).Y0().d(o0VarA);
            if (aVarD != null) {
                arrayList2.add(aVarD);
            }
        }
        return arrayList2;
    }

    @Override // xj.g
    public final Object g(Object obj) throws IOException {
        Float f10;
        Float f11;
        Double d6;
        switch (this.f9588a) {
            case 0:
                h hVar = (h) obj;
                l.e(hVar, "input");
                long j = hVar.f10804a;
                String str = hVar.f10805b;
                String str2 = hVar.f10806c;
                List list = hVar.f10807d;
                d dVar = d.f9586x;
                String strX0 = o.x0(list, ",", null, null, dVar, 30);
                String strX02 = o.x0(hVar.f10808e, ",", null, null, dVar, 30);
                gk.c cVar = hVar.f10809f;
                long j7 = cVar.f9617c;
                long j10 = cVar.f9618d;
                long j11 = cVar.f9623i;
                int i10 = cVar.f9619e;
                String strX03 = o.x0(hVar.f10810g, ",", null, null, d.f9585r, 30);
                gk.f fVar = cVar.f9615a;
                long j12 = cVar.f9616b;
                long j13 = cVar.f9620f;
                long j14 = cVar.f9621g;
                long j15 = cVar.f9622h;
                int i11 = cVar.j;
                String strName = hVar.N.name();
                boolean z10 = cVar.k;
                boolean z11 = cVar.f9624l;
                boolean z12 = cVar.f9625m;
                boolean z13 = hVar.f10819r;
                boolean z14 = hVar.f10820s;
                String str3 = hVar.f10822u;
                String str4 = hVar.f10823v;
                boolean z15 = hVar.f10821t;
                hk.b bVar = hVar.T;
                return new rj.f(j, str, str2, strX0, strX02, j7, j10, j11, i10, strX03, fVar, j12, j13, j14, j15, i11, strName, z10, z11, z12, z13, z14, str3, str4, z15, bVar.f10798a, bVar.f10799b, hVar.f10827z, bVar.f10800c.getValue(), o.x0(hVar.A, ",", null, null, d.f9584g, 30), hVar.B, (String) ((a) ((ch.d) this.f9589d).D()).a(hVar.C), hVar.D, hVar.f10818q, hVar.I);
            default:
                ak.u uVar = (ak.u) obj;
                f fVar2 = (f) this.f9589d;
                l.e(uVar, "input");
                Location location = new Location(uVar.f723c);
                location.setLatitude(uVar.f721a);
                location.setLongitude(uVar.f722b);
                location.setAltitude(uVar.f727g);
                location.setSpeed(uVar.f728h);
                location.setBearing(uVar.f729i);
                location.setAccuracy(uVar.j);
                long j16 = uVar.f726f;
                if (j16 < 0) {
                    j16 = 0;
                }
                location.setTime(j16);
                location.setElapsedRealtimeNanos(TimeUnit.NANOSECONDS.convert(uVar.f724d, TimeUnit.MILLISECONDS));
                int i12 = uVar.k;
                if (i12 > 0) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("satellites", i12);
                    location.setExtras(bundle);
                }
                if (fVar2.i() && (d6 = uVar.f731m) != null) {
                    location.setMslAltitudeMeters(d6.doubleValue());
                }
                if (fVar2.i() && (f11 = uVar.f732n) != null) {
                    location.setMslAltitudeAccuracyMeters(f11.floatValue());
                }
                if (fVar2.c() && (f10 = uVar.f733o) != null) {
                    location.setVerticalAccuracyMeters(f10.floatValue());
                }
                return location;
        }
    }

    public e(ch.d dVar) {
        this.f9589d = dVar;
    }
}
