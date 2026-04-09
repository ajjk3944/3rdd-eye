package T4;

import android.app.Application;
import android.location.Geocoder;
import androidx.lifecycle.AbstractC0279a;
import androidx.lifecycle.D;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends AbstractC0279a {

    /* renamed from: b, reason: collision with root package name */
    public final Geocoder f3621b;

    /* renamed from: c, reason: collision with root package name */
    public final D f3622c;

    /* renamed from: d, reason: collision with root package name */
    public final D f3623d;

    /* renamed from: e, reason: collision with root package name */
    public final D f3624e;

    /* renamed from: f, reason: collision with root package name */
    public final D f3625f;

    /* renamed from: g, reason: collision with root package name */
    public final D f3626g;

    /* renamed from: h, reason: collision with root package name */
    public final D f3627h;
    public final D i;

    /* renamed from: j, reason: collision with root package name */
    public final D f3628j;

    /* renamed from: k, reason: collision with root package name */
    public final D f3629k;

    /* renamed from: l, reason: collision with root package name */
    public final D f3630l;

    /* renamed from: m, reason: collision with root package name */
    public final D f3631m;

    /* renamed from: n, reason: collision with root package name */
    public final D f3632n;

    public l(Application application) {
        q5.i.e(application, "application");
        if (Geocoder.isPresent()) {
            this.f3621b = new Geocoder(application);
        }
        D d6 = new D();
        this.f3622c = d6;
        this.f3623d = d6;
        D d7 = new D();
        d7.j(new ArrayList());
        this.f3624e = d7;
        this.f3625f = d7;
        D d8 = new D();
        this.f3626g = d8;
        this.f3627h = d8;
        D d9 = new D();
        this.i = d9;
        this.f3628j = d9;
        D d10 = new D();
        this.f3629k = d10;
        this.f3630l = d10;
        D d11 = new D();
        this.f3631m = d11;
        this.f3632n = d11;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(T4.l r11, double r12, double r14, j5.b r16) throws java.lang.Throwable {
        /*
            r0 = r16
            r11.getClass()
            boolean r2 = r0 instanceof T4.h
            if (r2 == 0) goto L19
            r2 = r0
            T4.h r2 = (T4.h) r2
            int r3 = r2.f3608g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f3608g = r3
        L17:
            r8 = r2
            goto L1f
        L19:
            T4.h r2 = new T4.h
            r2.<init>(r11, r0)
            goto L17
        L1f:
            java.lang.Object r0 = r8.f3606e
            int r2 = r8.f3608g
            r9 = 1
            if (r2 == 0) goto L36
            if (r2 != r9) goto L2e
            q5.o r1 = r8.f3605d
            R2.a.H(r0)
            goto L5d
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            R2.a.H(r0)
            android.location.Geocoder r0 = r11.f3621b
            if (r0 != 0) goto L3f
            r0 = 0
            return r0
        L3f:
            q5.o r6 = new q5.o
            r6.<init>()
            G5.d r10 = z5.D.f24486b
            T4.i r0 = new T4.i
            r7 = 0
            r1 = r11
            r2 = r12
            r4 = r14
            r0.<init>(r1, r2, r4, r6, r7)
            r8.f3605d = r6
            r8.f3608g = r9
            java.lang.Object r0 = z5.AbstractC3046w.r(r10, r8, r0)
            i5.a r1 = i5.EnumC2380a.f20635a
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r1 = r6
        L5d:
            java.lang.Object r0 = r1.f23299a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.l.e(T4.l, double, double, j5.b):java.lang.Object");
    }
}
