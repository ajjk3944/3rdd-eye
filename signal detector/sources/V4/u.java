package V4;

import android.app.Application;
import android.location.Geocoder;
import androidx.lifecycle.AbstractC0279a;
import androidx.lifecycle.D;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u extends AbstractC0279a {

    /* renamed from: b, reason: collision with root package name */
    public final Geocoder f3941b;

    /* renamed from: c, reason: collision with root package name */
    public final D f3942c;

    /* renamed from: d, reason: collision with root package name */
    public final D f3943d;

    /* renamed from: e, reason: collision with root package name */
    public final D f3944e;

    /* renamed from: f, reason: collision with root package name */
    public final D f3945f;

    /* renamed from: g, reason: collision with root package name */
    public final D f3946g;

    /* renamed from: h, reason: collision with root package name */
    public final D f3947h;
    public final D i;

    /* renamed from: j, reason: collision with root package name */
    public final D f3948j;

    /* renamed from: k, reason: collision with root package name */
    public final D f3949k;

    /* renamed from: l, reason: collision with root package name */
    public final D f3950l;

    /* renamed from: m, reason: collision with root package name */
    public final D f3951m;

    /* renamed from: n, reason: collision with root package name */
    public final D f3952n;

    public u(Application application) {
        q5.i.e(application, "application");
        if (Geocoder.isPresent()) {
            this.f3941b = new Geocoder(application);
        }
        D d6 = new D();
        this.f3942c = d6;
        this.f3943d = d6;
        D d7 = new D();
        this.f3944e = d7;
        this.f3945f = d7;
        D d8 = new D();
        d8.j(new ArrayList());
        this.f3946g = d8;
        this.f3947h = d8;
        D d9 = new D();
        this.i = d9;
        this.f3948j = d9;
        D d10 = new D();
        this.f3949k = d10;
        this.f3950l = d10;
        D d11 = new D();
        d11.j(Boolean.TRUE);
        this.f3951m = d11;
        this.f3952n = d11;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(V4.u r11, double r12, double r14, j5.b r16) throws java.lang.Throwable {
        /*
            r0 = r16
            boolean r2 = r0 instanceof V4.s
            if (r2 == 0) goto L16
            r2 = r0
            V4.s r2 = (V4.s) r2
            int r3 = r2.f3936g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f3936g = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            V4.s r2 = new V4.s
            r2.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f3934e
            int r2 = r8.f3936g
            r9 = 1
            if (r2 == 0) goto L33
            if (r2 != r9) goto L2b
            q5.o r1 = r8.f3933d
            R2.a.H(r0)
            goto L5a
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            R2.a.H(r0)
            android.location.Geocoder r0 = r11.f3941b
            if (r0 != 0) goto L3c
            r0 = 0
            return r0
        L3c:
            q5.o r6 = new q5.o
            r6.<init>()
            G5.d r10 = z5.D.f24486b
            V4.t r0 = new V4.t
            r7 = 0
            r1 = r11
            r2 = r12
            r4 = r14
            r0.<init>(r1, r2, r4, r6, r7)
            r8.f3933d = r6
            r8.f3936g = r9
            java.lang.Object r0 = z5.AbstractC3046w.r(r10, r8, r0)
            i5.a r1 = i5.EnumC2380a.f20635a
            if (r0 != r1) goto L59
            return r1
        L59:
            r1 = r6
        L5a:
            java.lang.Object r0 = r1.f23299a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.u.e(V4.u, double, double, j5.b):java.lang.Object");
    }
}
