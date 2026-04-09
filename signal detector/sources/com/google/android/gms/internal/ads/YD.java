package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class YD implements BD, InterfaceC1223gl {

    /* renamed from: C, reason: collision with root package name */
    public static final YD f12602C;

    /* renamed from: D, reason: collision with root package name */
    public static final YD f12603D;

    /* renamed from: E, reason: collision with root package name */
    public static final YD f12604E;

    /* renamed from: F, reason: collision with root package name */
    public static final YD f12605F;

    /* renamed from: c, reason: collision with root package name */
    public static final YD f12606c;

    /* renamed from: d, reason: collision with root package name */
    public static final YD f12607d;

    /* renamed from: e, reason: collision with root package name */
    public static final YD f12608e;

    /* renamed from: f, reason: collision with root package name */
    public static final YD f12609f;

    /* renamed from: g, reason: collision with root package name */
    public static final YD f12610g;

    /* renamed from: h, reason: collision with root package name */
    public static final YD f12611h;
    public static final YD i;

    /* renamed from: j, reason: collision with root package name */
    public static final YD f12612j;

    /* renamed from: k, reason: collision with root package name */
    public static final YD f12613k;

    /* renamed from: l, reason: collision with root package name */
    public static final YD f12614l;

    /* renamed from: m, reason: collision with root package name */
    public static final YD f12615m;

    /* renamed from: n, reason: collision with root package name */
    public static final YD f12616n;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12618b;

    static {
        int i3 = 0;
        f12606c = new YD("ENABLED", i3);
        f12607d = new YD("DISABLED", i3);
        f12608e = new YD("DESTROYED", i3);
        int i6 = 1;
        f12609f = new YD("TINK", i6);
        f12610g = new YD("CRUNCHY", i6);
        f12611h = new YD("NO_PREFIX", i6);
        int i7 = 2;
        i = new YD("ASSUME_AES_GCM", i7);
        f12612j = new YD("ASSUME_XCHACHA20POLY1305", i7);
        f12613k = new YD("ASSUME_CHACHA20POLY1305", i7);
        f12614l = new YD("ASSUME_AES_CTR_HMAC", i7);
        f12615m = new YD("ASSUME_AES_EAX", i7);
        f12616n = new YD("ASSUME_AES_GCM_SIV", i7);
        int i8 = 3;
        f12602C = new YD("TINK", i8);
        f12603D = new YD("CRUNCHY", i8);
        f12604E = new YD("LEGACY", i8);
        f12605F = new YD("NO_PREFIX", i8);
    }

    public /* synthetic */ YD(String str, int i3) {
        this.f12617a = i3;
        this.f12618b = str;
    }

    public static YD a(C2036vr c2036vr) {
        String str;
        c2036vr.G(2);
        int iK = c2036vr.K();
        int i3 = iK >> 1;
        int i6 = iK & 1;
        int iK2 = c2036vr.K() >> 3;
        if (i3 == 4 || i3 == 5 || i3 == 7 || i3 == 8) {
            str = "dvhe";
        } else if (i3 == 9) {
            str = "dvav";
        } else {
            if (i3 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i7 = iK2 | (i6 << 5);
        String str2 = i3 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i3).length();
        int length3 = String.valueOf(i7).length();
        String str3 = i7 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(AbstractC2763b.b(length + length2, length3, str3));
        sb.append(str);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        sb.append(i7);
        return new YD(sb.toString(), 7);
    }

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e6) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e6);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = AbstractC1135f5.o(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, "]");
            }
        }
        return AbstractC1135f5.n(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        switch (this.f12617a) {
            case 5:
                ((InterfaceC1545ml) obj).v(this.f12618b);
                break;
            default:
                ((InterfaceC0425Al) obj).x(this.f12618b);
                break;
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", h(this.f12618b, str, objArr));
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", h(this.f12618b, str, objArr));
        }
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.f12618b, str, objArr));
        }
    }

    public void g(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.f12618b, str, objArr), remoteException);
        }
    }

    public String toString() {
        switch (this.f12617a) {
            case 0:
                return this.f12618b;
            case 1:
                return this.f12618b;
            case 2:
                return this.f12618b;
            case 3:
                return this.f12618b;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        p2.j.f22785C.f22795h.f(this.f12618b, th);
    }

    public YD(String str) {
        this.f12617a = 8;
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        AbstractC2763b.h(sb, "UID: [", iMyUid, "]  PID: [", iMyPid);
        sb.append("] ");
        this.f12618b = sb.toString().concat(str);
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
    }
}
