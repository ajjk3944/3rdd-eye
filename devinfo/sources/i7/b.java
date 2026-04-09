package i7;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import b5.u0;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.j5;
import com.google.android.gms.internal.ads.s9;
import com.google.android.gms.internal.play_billing.p3;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements c, m8.g, m8.m, na.a, pi.f, r5.d, re.b, se.a, ba.d, x5.a, u8.a, ck.g, wb.b, wb.c, x7.f {
    public static re.a x(b bVar) {
        return new re.a(System.currentTimeMillis() + 3600000, new s9(8, 10), new j5(true, false, false), 10.0d, 1.2d, 60);
    }

    public static void y(u0 u0Var) {
        if (u0Var.P()) {
            return;
        }
        new tg.o().h0(u0Var, "TabEditBottomSheet");
    }

    @Override // wb.b
    public int a(Context context, String str, boolean z3) {
        return wb.d.d(context, str, z3);
    }

    @Override // ba.d
    public Object apply(Object obj) {
        return ((p3) obj).a();
    }

    @Override // pi.f
    public void b(Context context, cm.g gVar, pi.a aVar) {
        nk.k.e(context, "context");
        nk.k.e(aVar, "adItem");
        gVar.B("NoAdLoader");
    }

    @Override // x5.a
    public void c(e6.a aVar) {
        nk.k.e(aVar, "db");
        aVar.j("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        aVar.R(contentValues, new Object[0]);
    }

    @Override // wb.b
    public int e(Context context, String str) {
        return wb.d.a(context, str);
    }

    @Override // i7.c
    public boolean g(float f10) {
        throw new IllegalStateException("not implemented");
    }

    @Override // u8.a
    public Object h() {
        return new ArrayList();
    }

    @Override // na.a
    public long i() {
        return System.currentTimeMillis();
    }

    @Override // i7.c
    public boolean isEmpty() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // wb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.h0 j(android.content.Context r3, java.lang.String r4, wb.b r5) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.h0 r0 = new com.google.android.gms.internal.ads.h0
            r0.<init>()
            int r1 = r5.e(r3, r4)
            r0.f11671a = r1
            r1 = 1
            int r3 = r5.a(r3, r4, r1)
            r0.f11672b = r3
            int r4 = r0.f11671a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f11673c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.b.j(android.content.Context, java.lang.String, wb.b):com.google.android.gms.internal.ads.h0");
    }

    @Override // i7.c
    public s7.a k() {
        throw new IllegalStateException("not implemented");
    }

    @Override // r5.d
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // r5.d
    public void m(int i4, Object obj) {
        String str;
        switch (i4) {
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
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
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
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // m8.g
    public void n(m8.i iVar) {
        iVar.onStart();
    }

    @Override // i7.c
    public boolean o(float f10) {
        return false;
    }

    @Override // se.a
    public StackTraceElement[] p(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[Segment.SHARE_MINIMUM];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // pi.f
    public void q(Context context, cm.g gVar, pi.a aVar) {
        nk.k.e(context, "context");
        nk.k.e(aVar, "adItem");
        gVar.B("NoAdLoader");
    }

    @Override // pi.f
    public void r(Context context, cm.g gVar, pi.a aVar) {
        nk.k.e(context, "context");
        nk.k.e(aVar, "adItem");
        gVar.B("NoAdLoader");
    }

    @Override // pi.f
    public void s(Context context, cm.g gVar, pi.a aVar) {
        nk.k.e(context, "context");
        nk.k.e(aVar, "adItem");
        gVar.B("NoAdLoader");
    }

    @Override // i7.c
    public float t() {
        return 1.0f;
    }

    @Override // re.b
    public re.a u(b bVar, JSONObject jSONObject) {
        return x(bVar);
    }

    @Override // i7.c
    public float v() {
        return 0.0f;
    }

    @Override // pi.f
    public void w(Context context, cm.g gVar, pi.a aVar) {
        nk.k.e(context, "context");
        nk.k.e(aVar, "adItem");
        gVar.B("NoAdLoader");
    }

    @Override // m8.g
    public void f(m8.i iVar) {
    }

    @Override // x7.f
    public void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
