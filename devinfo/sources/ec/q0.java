package ec;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23000a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f23001b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23002c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23003d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23004e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23005f;
    public final Object g;

    public q0(s0 s0Var, int i4, String str, Object obj, Object obj2, Object obj3) {
        this.f23001b = i4;
        this.f23002c = str;
        this.f23003d = obj;
        this.f23004e = obj2;
        this.f23005f = obj3;
        this.g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23000a) {
            case 0:
                s0 s0Var = (s0) this.g;
                b1 b1Var = ((o1) s0Var.f218b).f22953e;
                o1.k(b1Var);
                if (!b1Var.f23099c) {
                    Log.println(6, s0Var.L(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (s0Var.f23051d == 0) {
                    g gVar = ((o1) s0Var.f218b).f22952d;
                    if (gVar.f22719f == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f22719f == null) {
                                    o1 o1Var = (o1) gVar.f218b;
                                    ApplicationInfo applicationInfo = o1Var.f22949a.getApplicationInfo();
                                    String strA = tb.c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.f22719f = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (gVar.f22719f == null) {
                                        gVar.f22719f = Boolean.TRUE;
                                        s0 s0Var2 = o1Var.f22954f;
                                        o1.m(s0Var2);
                                        s0Var2.g.d("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (gVar.f22719f.booleanValue()) {
                        s0Var.f23051d = 'C';
                    } else {
                        s0Var.f23051d = 'c';
                    }
                }
                if (s0Var.f23052e < 0) {
                    ((o1) s0Var.f218b).f22952d.G();
                    s0Var.f23052e = 133005L;
                }
                int i4 = this.f23001b;
                char c9 = s0Var.f23051d;
                long j = s0Var.f23052e;
                String str2 = this.f23002c;
                Object obj = this.f23003d;
                Object obj2 = this.f23004e;
                Object obj3 = this.f23005f;
                char cCharAt = "01VDIWEA?".charAt(i4);
                String strM = s0.M(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(je.u.l(String.valueOf(cCharAt).length() + 1, String.valueOf(c9).length(), String.valueOf(j).length(), 1) + strM.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c9);
                sb2.append(j);
                sb2.append(":");
                sb2.append(strM);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, Segment.SHARE_MINIMUM);
                }
                b8.d dVar = b1Var.f22559f;
                if (dVar != null) {
                    String str3 = (String) dVar.f2076d;
                    b1 b1Var2 = (b1) dVar.f2077e;
                    b1Var2.B();
                    if (((b1) dVar.f2077e).F().getLong((String) dVar.f2074b, 0L) == 0) {
                        dVar.i();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesF = b1Var2.F();
                    String str4 = (String) dVar.f2075c;
                    long j8 = sharedPreferencesF.getLong(str4, 0L);
                    if (j8 <= 0) {
                        SharedPreferences.Editor editorEdit = b1Var2.F().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    l4 l4Var = ((o1) b1Var2.f218b).f22956i;
                    o1.k(l4Var);
                    long jNextLong = l4Var.z0().nextLong() & Long.MAX_VALUE;
                    long j9 = j8 + 1;
                    long j10 = Long.MAX_VALUE / j9;
                    SharedPreferences.Editor editorEdit2 = b1Var2.F().edit();
                    if (jNextLong < j10) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j9);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((u0) this.f23003d).b(this.f23002c, this.f23001b, (Throwable) this.f23004e, (byte[]) this.f23005f, (Map) this.g);
                return;
        }
    }

    public /* synthetic */ q0(String str, u0 u0Var, int i4, IOException iOException, byte[] bArr, Map map) {
        pb.y.h(u0Var);
        this.f23003d = u0Var;
        this.f23001b = i4;
        this.f23004e = iOException;
        this.f23005f = bArr;
        this.f23002c = str;
        this.g = map;
    }
}
