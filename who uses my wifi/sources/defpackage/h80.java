package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h80 implements o41, dp2, ks2, yq {
    public static h80 h;
    public final /* synthetic */ int f;
    public int g;

    public /* synthetic */ h80(int i) {
        this.f = i;
    }

    public static synchronized h80 d() {
        try {
            if (h == null) {
                h = new h80(3, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(Throwable... thArr) {
        if (this.g > 3 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.g <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        switch (this.f) {
            case 5:
                ((ye4) obj).G1(this.g);
                break;
            case 9:
                ((bd4) obj).a(this.g);
                break;
            case 10:
                ((bd4) obj).d(this.g);
                break;
            default:
                ((bd4) obj).h(this.g);
                break;
        }
    }

    public void e(Throwable... thArr) {
        if (this.g > 4 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    public void g(Throwable... thArr) {
        if (this.g > 5 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    @Override // defpackage.o41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(defpackage.i40 r21, float r22) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h80.k(i40, float):java.lang.Object");
    }

    @Override // defpackage.yq
    public int l(Context context) {
        return this.g;
    }

    @Override // defpackage.yq
    public int m(Context context, boolean z) {
        return 0;
    }

    public /* synthetic */ h80(int i, int i2) {
        this.f = i2;
        this.g = i;
    }

    public /* synthetic */ h80(h80 h80Var) {
        this.f = 8;
        this.g = h80Var.g;
    }

    public /* synthetic */ h80(ad4 ad4Var, int i) {
        this.f = 10;
        this.g = i;
    }

    public /* synthetic */ h80(ad4 ad4Var, int i, long j) {
        this.f = 9;
        this.g = i;
    }

    public /* synthetic */ h80(ad4 ad4Var, int i, xu1 xu1Var, xu1 xu1Var2) {
        this.f = 11;
        this.g = i;
    }
}
