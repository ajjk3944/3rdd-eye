package et;

import a5.q;
import ak.s0;
import ak.x0;
import ak.y0;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.ServiceState;
import bf.n;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import fs.e;
import g4.j;
import ht.a1;
import ht.d1;
import ht.g0;
import ht.p0;
import io.sentry.android.core.e0;
import io.sentry.hints.h;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import mq.p;
import o.x;
import o5.k;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import qb.t;
import rr.r0;
import rs.r;
import u5.a0;
import u5.m;

/* loaded from: classes.dex */
public final class d implements ca.c, com.opensignal.sdk.common.measurements.base.c, f7.d, h, kc.d, r, k, x, bc.h, qb.a, o9.b, th.a, m, v9.a {
    public static final String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        byte[] bArr3 = PublicSuffixDatabase.f19540e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte b2 = bArr2[i19][i20];
                    byte[] bArr4 = pu.b.f20645a;
                    int i22 = b2 & 255;
                    z10 = z11;
                    i12 = i22;
                }
                byte b10 = bArr[i16 + i21];
                byte[] bArr5 = pu.b.f20645a;
                i13 = i12 - (b10 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length != i20) {
                    z11 = z10;
                } else {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset charset = StandardCharsets.UTF_8;
                            l.d(charset, "UTF_8");
                            return new String(bArr, i16, i18, charset);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }

    public static p0 d(r0 r0Var, fs.a aVar, io.sentry.internal.debugmeta.c cVar, ht.x xVar) {
        l.e(aVar, "typeAttr");
        l.e(cVar, "typeParameterUpperBoundEraser");
        if (!aVar.f9053c) {
            aVar = aVar.b(fs.b.INFLEXIBLE);
        }
        int i10 = e.f9063a[aVar.f9052b.ordinal()];
        if (i10 == 1) {
            return new g0(xVar, d1.INVARIANT);
        }
        if (i10 != 2 && i10 != 3) {
            throw new n();
        }
        if (!r0Var.N().getAllowsOutPosition()) {
            return new g0(xs.d.e(r0Var).n(), d1.INVARIANT);
        }
        List listO = xVar.Z().o();
        l.d(listO, "erasedUpperBound.constructor.parameters");
        return !listO.isEmpty() ? new g0(xVar, d1.OUT_VARIANCE) : a1.k(r0Var, aVar);
    }

    public static void i(s0 s0Var, dh.e eVar) {
        eVar.f7346a = s0Var.f677e;
        eVar.f7361r = o(s0Var.f695y.f788h);
        eVar.f7355l = s0Var.f679g;
        eVar.f7350e = s0Var.f673a;
        eVar.f7348c = s0Var.f674b;
        eVar.f7349d = s0Var.f675c;
        eVar.A = s0Var.f678f;
        eVar.G = s0Var.f680h;
    }

    public static void k(s0 s0Var, dh.e eVar) {
        x0 x0Var = s0Var.f695y;
        eVar.j = o(x0Var.j);
        eVar.f7358o = s0Var.f682l;
        eVar.f7357n = s0Var.f681i;
        eVar.f7354i = s0Var.j;
        eVar.f7359p = s0Var.k;
        eVar.f7360q = s0Var.f683m;
        eVar.k = s0Var.f689s;
        eVar.f7364u = e5.A(0, x0Var);
        eVar.f7365v = e5.A(1, x0Var);
        eVar.f7366w = e5.A(2, x0Var);
        eVar.f7367x = e5.A(3, x0Var);
        eVar.f7368y = e5.A(8, x0Var);
        eVar.f7369z = e5.A(13, x0Var);
    }

    public static void l(s0 s0Var, dh.e eVar) {
        eVar.f7347b = s0Var.f686p;
        eVar.f7362s = o(s0Var.f695y.f789i);
        eVar.f7353h = s0Var.f684n;
        eVar.f7351f = s0Var.f685o;
        eVar.f7352g = s0Var.f676d;
        eVar.f7356m = s0Var.f688r;
        eVar.B = s0Var.f687q;
        eVar.H = s0Var.f690t;
    }

    public static InputStream m(String str) {
        l.e(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }

    public static ArrayList o(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            arrayList.add(new dh.b(y0Var.f796b, y0Var.f795a));
        }
        return arrayList;
    }

    @Override // com.opensignal.sdk.common.measurements.base.c
    public Integer E(ServiceState serviceState) {
        if (serviceState == null) {
            return null;
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            l.d(parcelObtain, "obtain(...)");
            serviceState.writeToParcel(parcelObtain, 1);
            parcelObtain.setDataPosition(0);
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readString();
            parcelObtain.readString();
            parcelObtain.readString();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            List networkRegistrationInfoList = serviceState.getNetworkRegistrationInfoList();
            l.d(networkRegistrationInfoList, "getNetworkRegistrationInfoList(...)");
            synchronized (networkRegistrationInfoList) {
                parcelObtain.readList(networkRegistrationInfoList, q.k().getClassLoader());
            }
            parcelObtain.readInt();
            parcelObtain.createIntArray();
            int i10 = parcelObtain.readInt();
            parcelObtain.readString();
            parcelObtain.readString();
            parcelObtain.readBoolean();
            parcelObtain.readBoolean();
            ch.n.b("DefaultNrFrequencyRange", "getNrFrequencyRange() with nrFrequencyRange = [" + i10 + ']');
            return Integer.valueOf(i10);
        } catch (Exception e4) {
            ch.n.e("DefaultNrFrequencyRange", e4);
            return null;
        }
    }

    @Override // o.x
    public boolean Q(o.m mVar) {
        return false;
    }

    @Override // v9.a
    public long e() {
        return System.currentTimeMillis();
    }

    @Override // f7.d
    public void f(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case j.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            e0.c("ProfileInstaller", str, (Throwable) obj);
        }
    }

    public t g(Looper looper, Handler.Callback callback) {
        return new t(new Handler(looper, callback));
    }

    @Override // kq.a
    public Object get() {
        d dVar = new d();
        HashMap map = new HashMap();
        j9.d dVar2 = j9.d.DEFAULT;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(dVar2, new s9.b(30000L, 86400000L, set));
        j9.d dVar3 = j9.d.HIGHEST;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(dVar3, new s9.b(1000L, 86400000L, set));
        j9.d dVar4 = j9.d.VERY_LOW;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(s9.d.DEVICE_IDLE)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(dVar4, new s9.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < j9.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new s9.a(dVar, map);
    }

    @Override // kc.d
    public kc.c h(Context context, String str, kc.b bVar) {
        kc.c cVar = new kc.c();
        int iD = bVar.d(context, str);
        cVar.f14269a = iD;
        if (iD != 0) {
            cVar.f14271c = -1;
            return cVar;
        }
        int iC = bVar.c(context, str, true);
        cVar.f14270b = iC;
        if (iC != 0) {
            cVar.f14271c = 1;
        }
        return cVar;
    }

    @Override // u5.m
    /* renamed from: n */
    public a0 mo36n(int i10, int i11) {
        return new u5.j();
    }

    public dh.e p(s0 s0Var) {
        try {
            dh.e eVar = new dh.e();
            i(s0Var, eVar);
            l(s0Var, eVar);
            k(s0Var, eVar);
            eVar.C = s0Var.f691u;
            eVar.D = s0Var.f692v;
            eVar.E = s0Var.f693w;
            eVar.F = s0Var.f694x;
            String str = s0Var.f695y.f787g;
            Locale locale = Locale.US;
            l.d(locale, "US");
            String upperCase = str.toUpperCase(locale);
            l.d(upperCase, "toUpperCase(...)");
            eVar.f7363t = dh.c.valueOf(upperCase);
            return eVar;
        } catch (Exception e4) {
            ch.n.e("SpeedTestConfigMapper", e4);
            cj.a.E(e4, "SpeedTestConfigMapper: Cannot mapTo speedTestConfig object");
            return new dh.e();
        }
    }

    @Override // bc.h
    public /* synthetic */ void y(Object obj) {
        ((ji.a) obj).getClass();
    }

    @Override // th.a
    public boolean z(String str) {
        l.e(str, "url");
        return true;
    }

    @Override // u5.m
    public void j() {
    }

    @Override // ca.c
    public long b(long j) {
        return j;
    }

    @Override // u5.m
    public void u(u5.x xVar) {
    }

    @Override // o.x
    public void c(o.m mVar, boolean z10) {
    }
}
