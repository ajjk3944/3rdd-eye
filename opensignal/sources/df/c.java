package df;

import ab.n;
import ak.l1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.Typeface;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.View;
import androidx.media3.common.k0;
import br.l;
import ch.i;
import com.google.android.gms.internal.measurement.e5;
import com.google.firebase.components.ComponentRegistrar;
import com.opensignal.sdk.common.measurements.base.f;
import com.opensignal.sdk.data.telephony.TelephonyPhoneStateListener;
import db.p;
import db.q;
import dd.g;
import fj.t;
import hf.z;
import io.sentry.r4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import k2.w;
import kc.e;
import mi.e0;
import oe.f0;
import oe.h0;
import oe.u0;
import pb.d0;
import pb.p0;
import r5.h;
import r5.m;
import rs.r;
import xj.j;

/* loaded from: classes.dex */
public class c implements n, f, q, g, io.sentry.clientreport.f, w, kc.b, r, dd.a, h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f7340a = new c();

    public c(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new u3.q(18, view).f23206g = view;
        } else {
            new o2.g(18, view);
        }
    }

    public static t e(TelephonyManager telephonyManager, ch.f fVar, ag.b bVar, j jVar, i iVar, Executor executor, boolean z10) {
        ch.n.b("PhoneStateListenerFactory", "create() called with: deviceSdk = " + fVar + ", useTelephonyCallbackForApi31Plus = " + z10);
        return (fVar.g() && z10) ? new fj.j(telephonyManager, bVar, jVar, executor) : new TelephonyPhoneStateListener(telephonyManager, fVar, bVar, jVar, iVar, executor);
    }

    public static Typeface f(String str, k2.r rVar, int i10) {
        if (i10 == 0 && l.a(rVar, k2.r.f14002x) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), rVar.f14004a, i10 == 1);
    }

    public static ArrayList h(List list, l1 l1Var) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i10 = l1Var.f614d;
        if (i10 > -1 && i10 < size) {
            size = i10;
        }
        int i11 = l1Var.f615e;
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        for (int i12 = 0; i12 < size; i12++) {
            ScanResult.InformationElement informationElementI = z.i(list.get(i12));
            try {
                byte[] bArr = new byte[Math.min(i11, informationElementI.getBytes().remaining())];
                informationElementI.getBytes().get(bArr);
                int id2 = informationElementI.getId();
                int idExt = informationElementI.getIdExt();
                String strEncodeToString = Base64.encodeToString(bArr, 0);
                l.d(strEncodeToString, "encodeToString(...)");
                int length = strEncodeToString.length() - 1;
                int i13 = 0;
                boolean z10 = false;
                while (i13 <= length) {
                    boolean z11 = l.g(strEncodeToString.charAt(!z10 ? i13 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i13++;
                    } else {
                        z10 = true;
                    }
                }
                arrayList.add(new e0(strEncodeToString.subSequence(i13, length + 1).toString(), id2, idExt));
            } catch (Exception e4) {
                ch.n.g("WifiInformationElementsExtractor", "Exception while retrieving wifi information elements", e4);
            }
        }
        return arrayList;
    }

    public static long n() {
        return SystemClock.elapsedRealtime();
    }

    public static Path v(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static Long y(Long l10) {
        long jLongValue;
        if (l10 == null || l10.longValue() <= 0) {
            return null;
        }
        try {
            jLongValue = ((l10.longValue() + 52428800) / 104857600) * 104857600;
        } catch (Exception unused) {
            jLongValue = l10.longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer A(NetworkRegistrationInfo networkRegistrationInfo) {
        Integer numValueOf;
        Class cls = Integer.TYPE;
        Integer numValueOf2 = null;
        try {
            Parcel parcelObtain = Parcel.obtain();
            l.d(parcelObtain, "obtain(...)");
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
            parcelObtain.readList(new ArrayList(), cls.getClassLoader());
            parcelObtain.readParcelable(a1.h.o().getClassLoader(), a1.h.o());
            parcelObtain.readParcelable(Parcelable.class.getClassLoader(), Parcelable.class);
            parcelObtain.readParcelable(Parcelable.class.getClassLoader(), Parcelable.class);
            int i10 = parcelObtain.readInt();
            ch.n.b("ServiceStateParcelMapperApi33", "getNrStateNewRevision() return: = [" + i10 + ']');
            numValueOf = Integer.valueOf(i10);
        } catch (Exception e4) {
            ch.n.g("ServiceStateParcelMapperApi33", "Exception in getNrStateNewRevision: " + e4.getLocalizedMessage());
            numValueOf = null;
        }
        if (numValueOf == null || numValueOf.intValue() < 0 || numValueOf.intValue() > 3) {
            try {
                Parcel parcelObtain2 = Parcel.obtain();
                l.d(parcelObtain2, "obtain(...)");
                networkRegistrationInfo.writeToParcel(parcelObtain2, 1);
                parcelObtain2.setDataPosition(0);
                parcelObtain2.readInt();
                parcelObtain2.readInt();
                parcelObtain2.readInt();
                parcelObtain2.readInt();
                parcelObtain2.readInt();
                parcelObtain2.readInt();
                parcelObtain2.readBoolean();
                parcelObtain2.readList(new ArrayList(), cls.getClassLoader());
                parcelObtain2.readParcelable(a1.h.o().getClassLoader(), a1.h.o());
                parcelObtain2.readParcelable(Parcelable.class.getClassLoader(), Parcelable.class);
                parcelObtain2.readParcelable(Parcelable.class.getClassLoader(), Parcelable.class);
                int i11 = parcelObtain2.readInt();
                ch.n.b("ServiceStateParcelMapperApi33", "getNrStateOldRevision() return: = [" + i11 + ']');
                numValueOf2 = Integer.valueOf(i11);
            } catch (Exception e10) {
                ch.n.g("ServiceStateParcelMapperApi33", "Exception in getNrStateOldRevision: " + e10.getLocalizedMessage());
            }
            numValueOf = numValueOf2;
        }
        ch.n.b("ServiceStateParcelMapperApi33", "getNrState() return: = [" + numValueOf + ']');
        return numValueOf;
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer B(ServiceState serviceState) {
        return i3.g.s(this, serviceState);
    }

    public List C(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (bf.c cVar : componentRegistrar.getComponents()) {
            String str = cVar.f2703a;
            if (str != null) {
                cVar = new bf.c(str, cVar.f2704b, cVar.f2705c, cVar.f2706d, cVar.f2707e, new kg.q(str, cVar, 19), cVar.f2709g);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // ab.n, p5.m
    public long a() {
        throw new NoSuchElementException();
    }

    @Override // ab.n, p5.m
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // kc.b
    public int c(Context context, String str, boolean z10) {
        return e.d(context, str, z10);
    }

    @Override // kc.b
    public int d(Context context, String str) {
        return e.a(context, str);
    }

    @Override // db.q
    public p0 g() {
        return new p(db.f.f7220l, null);
    }

    @Override // k2.w
    public Typeface i(k2.t tVar, k2.r rVar, int i10) {
        tVar.getClass();
        return f("sans-serif", rVar, i10);
    }

    @Override // dd.a
    public /* synthetic */ Object j(dd.r rVar) {
        return null;
    }

    @Override // k2.w
    public Typeface k(int i10, k2.r rVar) {
        return f(null, rVar, i10);
    }

    @Override // ab.n, p5.m
    public boolean next() {
        return false;
    }

    @Override // dd.g
    public dd.r o(Object obj) {
        return e5.u(Boolean.TRUE);
    }

    @Override // db.q
    public p0 r(db.f fVar, db.l lVar) {
        return new p(fVar, lVar);
    }

    public h9.t s(d0 d0Var, pb.e0 e0Var) {
        IOException iOException = e0Var.f20368a;
        if (!(iOException instanceof b5.w)) {
            return null;
        }
        int i10 = ((b5.w) iOException).f2468r;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (d0Var.a(1)) {
            return new h9.t(1, 3, 300000L);
        }
        if (d0Var.a(2)) {
            return new h9.t(2, 3, 60000L);
        }
        return null;
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public String t() {
        return "ServiceStateParcelMapperApi33";
    }

    public int u(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    public long x(pb.e0 e0Var) {
        Throwable cause = e0Var.f20368a;
        if ((cause instanceof k0) || (cause instanceof FileNotFoundException) || (cause instanceof b5.t) || (cause instanceof m)) {
            return -9223372036854775807L;
        }
        int i10 = b5.i.f2434d;
        while (cause != null) {
            if ((cause instanceof b5.i) && ((b5.i) cause).f2435a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((e0Var.f20369b - 1) * 1000, 5000);
    }

    public Signature[] z(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public c(int i10) {
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.US);
                break;
            default:
                f0 f0Var = h0.f19336d;
                u0 u0Var = u0.f19383x;
                break;
        }
    }

    @Override // io.sentry.clientreport.f
    public i4.b m(i4.b bVar) {
        return bVar;
    }

    @Override // io.sentry.clientreport.f
    public void l(io.sentry.clientreport.d dVar, io.sentry.m mVar) {
    }

    @Override // io.sentry.clientreport.f
    public void q(io.sentry.clientreport.d dVar, i4.b bVar) {
    }

    @Override // io.sentry.clientreport.f
    public void w(io.sentry.clientreport.d dVar, r4 r4Var) {
    }

    @Override // io.sentry.clientreport.f
    public void p(io.sentry.clientreport.d dVar, io.sentry.m mVar, long j) {
    }
}
