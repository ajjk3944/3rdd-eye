package zc;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class h0 implements Runnable {
    public final Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26952a = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f26953d;

    /* renamed from: g, reason: collision with root package name */
    public final String f26954g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f26955r;

    /* renamed from: x, reason: collision with root package name */
    public final Object f26956x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f26957y;

    public /* synthetic */ h0(String str, k0 k0Var, int i10, IOException iOException, byte[] bArr, Map map) {
        cc.s.h(k0Var);
        this.f26955r = k0Var;
        this.f26953d = i10;
        this.f26956x = iOException;
        this.f26957y = bArr;
        this.f26954g = str;
        this.B = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26952a) {
            case 0:
                j0 j0Var = (j0) this.B;
                r0 r0Var = ((c1) j0Var.f1504d).f26888x;
                c1.e(r0Var);
                if (!r0Var.f26980g) {
                    Log.println(6, j0Var.C1(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (j0Var.f26977r == 0) {
                    f fVar = ((c1) j0Var.f1504d).f26887r;
                    if (fVar.f26923y == null) {
                        synchronized (fVar) {
                            try {
                                if (fVar.f26923y == null) {
                                    c1 c1Var = (c1) fVar.f1504d;
                                    ApplicationInfo applicationInfo = c1Var.f26884a.getApplicationInfo();
                                    String strC = gc.b.c();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        fVar.f26923y = Boolean.valueOf(str != null && str.equals(strC));
                                    }
                                    if (fVar.f26923y == null) {
                                        fVar.f26923y = Boolean.TRUE;
                                        j0 j0Var2 = c1Var.f26889y;
                                        c1.g(j0Var2);
                                        j0Var2.B.b("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (fVar.f26923y.booleanValue()) {
                        j0Var.f26977r = 'C';
                    } else {
                        j0Var.f26977r = 'c';
                    }
                }
                if (j0Var.f26978x < 0) {
                    ((c1) j0Var.f1504d).f26887r.x1();
                    j0Var.f26978x = 133005L;
                }
                int i10 = this.f26953d;
                char c4 = j0Var.f26977r;
                long j = j0Var.f26978x;
                String str2 = this.f26954g;
                Object obj = this.f26955r;
                Object obj2 = this.f26956x;
                Object obj3 = this.f26957y;
                char cCharAt = "01VDIWEA?".charAt(i10);
                String strD1 = j0.D1(true, str2, obj, obj2, obj3);
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c4).length() + String.valueOf(j).length() + 1 + strD1.length());
                sb2.append("2");
                sb2.append(cCharAt);
                sb2.append(c4);
                sb2.append(j);
                sb2.append(":");
                sb2.append(strD1);
                String string = sb2.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                q0 q0Var = r0Var.f27123y;
                if (q0Var != null) {
                    String str3 = (String) q0Var.f27106d;
                    r0 r0Var2 = (r0) q0Var.f27107e;
                    r0Var2.s1();
                    if (((r0) q0Var.f27107e).w1().getLong((String) q0Var.f27104b, 0L) == 0) {
                        q0Var.b();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesW1 = r0Var2.w1();
                    String str4 = (String) q0Var.f27105c;
                    long j7 = sharedPreferencesW1.getLong(str4, 0L);
                    if (j7 <= 0) {
                        SharedPreferences.Editor editorEdit = r0Var2.w1().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    s3 s3Var = ((c1) r0Var2.f1504d).E;
                    c1.e(s3Var);
                    long jNextLong = s3Var.p2().nextLong() & Long.MAX_VALUE;
                    long j10 = j7 + 1;
                    long j11 = Long.MAX_VALUE / j10;
                    SharedPreferences.Editor editorEdit2 = r0Var2.w1().edit();
                    if (jNextLong < j11) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j10);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((k0) this.f26955r).m(this.f26954g, this.f26953d, (Throwable) this.f26956x, (byte[]) this.f26957y, (Map) this.B);
                return;
        }
    }

    public h0(j0 j0Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f26953d = i10;
        this.f26954g = str;
        this.f26955r = obj;
        this.f26956x = obj2;
        this.f26957y = obj3;
        this.B = j0Var;
    }
}
