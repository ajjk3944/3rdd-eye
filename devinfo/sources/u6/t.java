package u6;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import android.view.InputEvent;
import android.view.ViewGroup;
import c2.l0;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.nn1;
import com.google.android.gms.internal.ads.rl;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ud0;
import com.google.android.gms.internal.ads.xw;
import com.google.android.gms.internal.play_billing.n2;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import g2.j0;
import g2.n0;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import nm.e0;
import org.json.JSONArray;
import u0.i1;
import u0.m1;
import u0.u0;
import va.o0;
import va.z2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static int f35184a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static int f35185b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static int f35186c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static int f35187d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static y8.b f35188e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f35189f = false;
    public static int g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static int f35190h = 8192;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f35191i = true;

    public static void B(ud0 ud0Var, String str, Pair... pairArr) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.I7)).booleanValue()) {
            fx.f11274a.execute(new b4.o(ud0Var, str, pairArr, false, 15));
        }
    }

    public static int D(hq0 hq0Var) {
        if (hq0Var.f11957s) {
            return 2;
        }
        z2 z2Var = hq0Var.f11944d;
        o0 o0Var = z2Var.f36204s;
        String str = z2Var.f36209x;
        if (o0Var == null && str == null) {
            return 1;
        }
        if (o0Var == null || str == null) {
            return o0Var != null ? 3 : 4;
        }
        return 5;
    }

    public static final void a(e0 e0Var, Object obj, i1.n nVar, boolean z3, boolean z10, c1.h hVar, u0.p pVar, int i4) {
        int i10;
        boolean z11;
        boolean z12;
        nk.k.e(e0Var, "state");
        nk.k.e(obj, "key");
        pVar.X(1129341741);
        if ((i4 & 6) == 0) {
            i10 = (pVar.f(e0Var) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= pVar.h(obj) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.f(nVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            z11 = z3;
            i10 |= pVar.g(z11) ? 2048 : Segment.SHARE_MINIMUM;
        } else {
            z11 = z3;
        }
        if ((i4 & 24576) == 0) {
            z12 = z10;
            i10 |= pVar.g(z12) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        } else {
            z12 = z10;
        }
        if ((196608 & i4) == 0) {
            i10 |= pVar.h(hVar) ? 131072 : 65536;
        }
        if ((74899 & i10) == 74898 && pVar.A()) {
            pVar.R();
        } else {
            pVar.W(-1931603123);
            Object objL = pVar.L();
            u0.e eVar = u0.l.f34851a;
            if (objL == eVar) {
                objL = u0.q.r(new o1.b(0L));
                pVar.g0(objL);
            }
            u0 u0Var = (u0) objL;
            pVar.p(false);
            pVar.W(-1931600257);
            Object objL2 = pVar.L();
            if (objL2 == eVar) {
                objL2 = new l0(16, u0Var);
                pVar.g0(objL2);
            }
            pVar.p(false);
            i1.n nVarH = n0.h(nVar, (mk.c) objL2);
            j0 j0VarC = g0.h.c(i1.b.f25531a, false);
            int iN = u0.q.n(pVar);
            i1 i1VarL = pVar.l();
            i1.n nVarW = com.bumptech.glide.d.w(nVarH, pVar);
            i2.g.R8.getClass();
            i2.x xVar = i2.f.f25653b;
            pVar.Z();
            if (pVar.S) {
                pVar.k(xVar);
            } else {
                pVar.j0();
            }
            u0.q.x(j0VarC, i2.f.f25656e, pVar);
            u0.q.x(i1VarL, i2.f.f25655d, pVar);
            i2.e eVar2 = i2.f.f25657f;
            if (pVar.S || !nk.k.a(pVar.L(), Integer.valueOf(iN))) {
                pVar.g0(Integer.valueOf(iN));
                pVar.b(Integer.valueOf(iN), eVar2);
            }
            u0.q.x(nVarW, i2.f.f25654c, pVar);
            pVar.W(872013070);
            int i11 = i10 & 14;
            boolean zF = (i11 == 4) | pVar.f(obj);
            Object objL3 = pVar.L();
            if (zF || objL3 == eVar) {
                objL3 = new nm.o(e0Var, obj, new b2.b(18, u0Var));
                pVar.g0(objL3);
            }
            pVar.p(false);
            hVar.b((nm.o) objL3, Boolean.valueOf(z12), pVar, Integer.valueOf((i10 >> 9) & 1008));
            pVar.p(true);
            HashSet hashSet = e0Var.f30029r;
            Boolean boolValueOf = Boolean.valueOf(z11);
            pVar.W(-1931586729);
            boolean zH = ((i10 & 7168) == 2048) | (i11 == 4) | pVar.h(obj);
            Object objL4 = pVar.L();
            if (zH || objL4 == eVar) {
                nm.q qVar = new nm.q(z3, e0Var, obj, null, 0);
                pVar.g0(qVar);
                objL4 = qVar;
            }
            pVar.p(false);
            u0.q.d(hashSet, boolValueOf, (mk.e) objL4, pVar);
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new nm.r(e0Var, obj, nVar, z3, z12, hVar, i4);
        }
    }

    public static h3.k b(xk.a0 a0Var) {
        return jm.a.n(new lf.e(1, a0Var));
    }

    public static String c(int i4, int i10, String str) {
        if (i4 < 0) {
            return wb.e.G("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i10 >= 0) {
            return wb.e.G("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final hm.q d(hm.w wVar) {
        nk.k.e(wVar, "<this>");
        return new hm.q(wVar);
    }

    public static void e(int i4, int i10) {
        String strG;
        if (i4 < 0 || i4 >= i10) {
            if (i4 < 0) {
                strG = wb.e.G("%s (%s) must not be negative", "index", Integer.valueOf(i4));
            } else {
                if (i10 < 0) {
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("negative size: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                strG = wb.e.G("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i4), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static void f(int i4, int i10) {
        if (i4 < 0 || i4 > i10) {
            throw new IndexOutOfBoundsException(c(i4, i10, "index"));
        }
    }

    public static void g(int i4, int i10, int i11) {
        if (i4 < 0 || i10 < i4 || i10 > i11) {
            throw new IndexOutOfBoundsException((i4 < 0 || i4 > i11) ? c(i4, i11, "start index") : (i10 < 0 || i10 > i11) ? c(i10, i11, "end index") : wb.e.G("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i4)));
        }
    }

    public static final v2.e h(Context context) {
        return new v2.e(new d8.g(context), new v2.a(Build.VERSION.SDK_INT >= 31 ? v2.l.f35781a.a(context) : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x033a, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final u6.r i(android.content.Context r36, t6.b r37) throws android.content.res.Resources.NotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.t.i(android.content.Context, t6.b):u6.r");
    }

    public static void j(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            de.a aVar = (de.a) obj;
            de.g gVar = new de.g(aVar);
            for (de.q qVar : aVar.f22190b) {
                boolean z3 = aVar.f22193e == 0;
                de.h hVar = new de.h(qVar, !z3);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set = (Set) map.get(hVar);
                if (!set.isEmpty() && z3) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set.add(gVar);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (de.g gVar2 : (Set) it.next()) {
                for (de.i iVar : gVar2.f22205a.f22191c) {
                    if (iVar.f22212c == 0) {
                        Set<de.g> set2 = (Set) map.get(new de.h(iVar.f22210a, iVar.f22211b == 2));
                        if (set2 != null) {
                            for (de.g gVar3 : set2) {
                                gVar2.f22206b.add(gVar3);
                                gVar3.f22207c.add(gVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            de.g gVar4 = (de.g) it3.next();
            if (gVar4.f22207c.isEmpty()) {
                hashSet2.add(gVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            de.g gVar5 = (de.g) hashSet2.iterator().next();
            hashSet2.remove(gVar5);
            i4++;
            Iterator it4 = gVar5.f22206b.iterator();
            while (it4.hasNext()) {
                de.g gVar6 = (de.g) it4.next();
                gVar6.f22207c.remove(gVar5);
                if (gVar6.f22207c.isEmpty()) {
                    hashSet2.add(gVar6);
                }
            }
        }
        if (i4 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            de.g gVar7 = (de.g) it5.next();
            if (!gVar7.f22207c.isEmpty() && !gVar7.f22206b.isEmpty()) {
                arrayList2.add(gVar7.f22205a);
            }
        }
        throw new de.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static rl.p k(String str) {
        nk.k.e(str, "<this>");
        vk.f fVarB = rl.p.f33121d.b(0, str);
        if (fVarB == null) {
            throw new IllegalArgumentException(d.h.p('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) ((vk.d) fVarB.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        nk.k.d(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) ((vk.d) fVarB.a()).get(2)).toLowerCase(locale);
        nk.k.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = fVarB.f36283a;
        int i4 = ci.b.E(matcher.start(), matcher.end()).f33818b;
        while (true) {
            int i10 = i4 + 1;
            if (i10 >= str.length()) {
                return new rl.p(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            vk.f fVarB2 = rl.p.f33122e.b(i10, str);
            if (fVarB2 == null) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i10);
                nk.k.d(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(r5.c.l(sb2, str, '\"').toString());
            }
            Matcher matcher2 = fVarB2.f36283a;
            vk.e eVar = fVarB2.f36285c;
            vk.c cVarA = eVar.a(1);
            String str3 = cVarA != null ? cVarA.f36277a : null;
            if (str3 == null) {
                i4 = ci.b.E(matcher2.start(), matcher2.end()).f33818b;
            } else {
                vk.c cVarA2 = eVar.a(2);
                String strSubstring2 = cVarA2 != null ? cVarA2.f36277a : null;
                if (strSubstring2 == null) {
                    vk.c cVarA3 = eVar.a(3);
                    nk.k.b(cVarA3);
                    strSubstring2 = cVarA3.f36277a;
                } else {
                    boolean z3 = false;
                    if (strSubstring2.length() > 0 && com.bumptech.glide.d.o(strSubstring2.charAt(0), '\'', false)) {
                        z3 = true;
                    }
                    if (z3 && strSubstring2.length() > 0 && com.bumptech.glide.d.o(strSubstring2.charAt(vk.i.B0(strSubstring2)), '\'', false) && strSubstring2.length() > 2) {
                        strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                        nk.k.d(strSubstring2, "substring(...)");
                    }
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i4 = ci.b.E(matcher2.start(), matcher2.end()).f33818b;
            }
        }
    }

    public static String m(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("Md5");
                messageDigest.update(bArr);
                return String.format("%032x", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2.getMessage());
            }
        } catch (RuntimeException unused) {
            return "";
        }
    }

    public static JSONArray n() throws SecurityException {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i4;
        int i10;
        String strValueOf;
        HashSet hashSet = new HashSet();
        int i11 = 0;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        int length = codecInfos.length;
        int i12 = 0;
        while (i12 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i12];
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length2 = supportedTypes.length;
                int i13 = i11;
                while (i13 < length2) {
                    if (supportedTypes[i13].equals("video/hevc") && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc")) != null) {
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length3 = codecProfileLevelArr.length;
                        int i14 = i11;
                        while (i14 < length3) {
                            int i15 = codecProfileLevelArr[i14].level;
                            Field[] fields = MediaCodecInfo.CodecProfileLevel.class.getFields();
                            int length4 = fields.length;
                            int i16 = i11;
                            while (true) {
                                if (i16 >= length4) {
                                    mediaCodecInfoArr = codecInfos;
                                    i4 = length;
                                    i10 = i12;
                                    strValueOf = String.valueOf(i15);
                                    break;
                                }
                                Field field = fields[i16];
                                mediaCodecInfoArr = codecInfos;
                                strValueOf = field.getName();
                                i4 = length;
                                i10 = i12;
                                if (field.getType() == Integer.TYPE && strValueOf.contains("HEVC")) {
                                    try {
                                        if (field.getInt(null) == i15) {
                                            break;
                                        }
                                    } catch (IllegalAccessException unused) {
                                        continue;
                                    }
                                }
                                i16++;
                                codecInfos = mediaCodecInfoArr;
                                length = i4;
                                i12 = i10;
                            }
                            hashSet.add(strValueOf);
                            i14++;
                            codecInfos = mediaCodecInfoArr;
                            length = i4;
                            i12 = i10;
                            i11 = 0;
                        }
                    }
                    i13++;
                    codecInfos = codecInfos;
                    length = length;
                    i12 = i12;
                    i11 = 0;
                }
            }
            i12++;
            codecInfos = codecInfos;
            length = length;
            i11 = 0;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    public static final hm.m q(InputStream inputStream) {
        nk.k.e(inputStream, "<this>");
        return new hm.m(inputStream, new hm.y());
    }

    public static void r(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            a4.l.n(viewGroup, z3);
        } else if (f35191i) {
            try {
                a4.l.n(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f35191i = false;
            }
        }
    }

    public static void t(Context context) {
        boolean z3;
        Object obj = za.f.f38143b;
        if (((Boolean) rl.f15687a.u()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (za.f.f38143b) {
                        z3 = za.f.f38144c;
                    }
                    if (z3) {
                        return;
                    }
                    vd.b bVarA = new xw(context).A();
                    za.i.g("Updating ad debug logging enablement.");
                    nn1.e(bVarA, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e2) {
                za.i.i("Fail to determine debug setting.", e2);
            }
        }
    }

    public static String v(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static String x(z2 z2Var) {
        Bundle bundle;
        return (z2Var == null || (bundle = z2Var.f36190c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static int z(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return 2;
        }
        switch (string.hashCode()) {
            case 1743582862:
                return string.equals("requester_type_0") ? 1 : 2;
            case 1743582863:
                return string.equals("requester_type_1") ? 3 : 2;
            case 1743582864:
                return string.equals("requester_type_2") ? 4 : 2;
            case 1743582865:
                return string.equals("requester_type_3") ? 5 : 2;
            case 1743582866:
                return string.equals("requester_type_4") ? 6 : 2;
            case 1743582867:
                return string.equals("requester_type_5") ? 7 : 2;
            case 1743582868:
                return string.equals("requester_type_6") ? 8 : 2;
            case 1743582869:
                return string.equals("requester_type_7") ? 9 : 2;
            case 1743582870:
                return string.equals("requester_type_8") ? 10 : 2;
            default:
                return 2;
        }
    }

    public abstract boolean A(y3 y3Var, Object obj, Object obj2);

    public abstract boolean C(y3 y3Var, x3 x3Var, x3 x3Var2);

    public abstract Object l(ck.c cVar);

    public abstract Object o(Uri uri, InputEvent inputEvent, ck.c cVar);

    public abstract Object p(Uri uri, ck.c cVar);

    public abstract void s(int i4, int i10, byte[] bArr);

    public abstract void u(x3 x3Var, x3 x3Var2);

    public abstract void w(x3 x3Var, Thread thread);

    public abstract boolean y(y3 y3Var, n2 n2Var, n2 n2Var2);
}
