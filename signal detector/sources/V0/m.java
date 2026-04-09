package V0;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ads.BO;
import com.google.android.gms.internal.ads.CO;
import com.google.android.gms.internal.ads.InterfaceC0801Wn;
import com.google.android.gms.internal.ads.InterfaceC1223gl;
import com.google.android.gms.internal.ads.Q6;
import d4.C2267a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements T2.c, InterfaceC1223gl, InterfaceC0801Wn, d4.g {

    /* renamed from: c, reason: collision with root package name */
    public static m f3828c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3829a;

    /* renamed from: b, reason: collision with root package name */
    public int f3830b;

    public static synchronized m f() {
        try {
            if (f3828c == null) {
                f3828c = new m(3, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3828c;
    }

    public static String h(String str) {
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

    public void a(String str, String str2, Throwable... thArr) {
        if (this.f3830b <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        switch (this.f3829a) {
            case 5:
                ((s2.k) obj).k0(this.f3830b);
                break;
            case 9:
                ((CO) obj).b(this.f3830b);
                break;
            case 10:
                ((CO) obj).f(this.f3830b);
                break;
            default:
                ((CO) obj).a(this.f3830b);
                break;
        }
    }

    @Override // T2.c
    public int c(Context context) {
        return this.f3830b;
    }

    @Override // T2.c
    public int d(Context context, boolean z6) {
        return 0;
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f3830b <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void g(String str, String str2, Throwable... thArr) {
        if (this.f3830b <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.f3830b <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public int j() {
        int i = this.f3830b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // d4.g
    public a4.d m(a4.d dVar) {
        int i = this.f3830b;
        int i3 = C2267a.f19773p;
        if (dVar == null) {
            return null;
        }
        int i6 = dVar.f4679a;
        long j6 = dVar.f4682d;
        long j7 = dVar.f4683e;
        List list = dVar.f4684f;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        List list2 = dVar.f4685g;
        return a4.d.a(i6, 6, i, j6, j7, arrayList, list2 != null ? new ArrayList(list2) : new ArrayList());
    }

    public /* synthetic */ m(int i, int i3) {
        this.f3829a = i3;
        this.f3830b = i;
    }

    public /* synthetic */ m(m mVar) {
        this.f3829a = 7;
        this.f3830b = mVar.f3830b;
    }

    public /* synthetic */ m(BO bo, int i) {
        this.f3829a = 10;
        this.f3830b = i;
    }

    public /* synthetic */ m(BO bo, int i, long j6) {
        this.f3829a = 9;
        this.f3830b = i;
    }

    public /* synthetic */ m(BO bo, int i, Q6 q6, Q6 q62) {
        this.f3829a = 11;
        this.f3830b = i;
    }
}
