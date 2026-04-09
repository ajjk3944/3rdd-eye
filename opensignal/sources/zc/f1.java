package zc;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26928a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26929d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26930g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f26931r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f26932x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26933y;

    public /* synthetic */ f1(Object obj, String str, String str2, Object obj2, long j, int i10) {
        this.f26928a = i10;
        this.f26929d = str;
        this.f26930g = str2;
        this.f26932x = obj2;
        this.f26931r = j;
        this.f26933y = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f26928a) {
            case 0:
                String str = (String) this.f26930g;
                i1 i1Var = (i1) this.f26933y;
                String str2 = (String) this.f26929d;
                if (str2 != null) {
                    l2 l2Var = new l2(this.f26931r, (String) this.f26932x, str2);
                    p3 p3Var = i1Var.f26968d;
                    p3Var.J().s1();
                    String str3 = p3Var.f27094c0;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    p3Var.f27094c0 = str;
                    p3Var.f27093b0 = l2Var;
                    break;
                } else {
                    p3 p3Var2 = i1Var.f26968d;
                    p3Var2.J().s1();
                    String str4 = p3Var2.f27094c0;
                    if (str4 == null || str4.equals(str)) {
                        p3Var2.f27094c0 = str;
                        p3Var2.f27093b0 = null;
                        break;
                    }
                }
                break;
            case 1:
                d2 d2Var = (d2) this.f26933y;
                String str5 = (String) this.f26929d;
                String str6 = (String) this.f26930g;
                d2Var.D1(this.f26931r, this.f26932x, str5, str6);
                break;
            default:
                o2 o2Var = (o2) this.f26933y;
                Bundle bundle = (Bundle) this.f26929d;
                l2 l2Var2 = (l2) this.f26930g;
                l2 l2Var3 = (l2) this.f26932x;
                o2Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                s3 s3Var = ((c1) o2Var.f1504d).E;
                c1.e(s3Var);
                o2Var.C1(l2Var2, l2Var3, this.f26931r, true, s3Var.A1("screen_view", bundle, null, false));
                break;
        }
    }

    public f1(o2 o2Var, Bundle bundle, l2 l2Var, l2 l2Var2, long j) {
        this.f26928a = 2;
        this.f26929d = bundle;
        this.f26930g = l2Var;
        this.f26932x = l2Var2;
        this.f26931r = j;
        Objects.requireNonNull(o2Var);
        this.f26933y = o2Var;
    }
}
