package S4;

import android.location.Location;
import c5.C0412i;
import com.lefan.signal.ui.noise.NoiseActivity;
import h5.InterfaceC2370d;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class i extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public NoiseActivity f3532e;

    /* renamed from: f, reason: collision with root package name */
    public int f3533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ NoiseActivity f3534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Location f3535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(NoiseActivity noiseActivity, Location location, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3534g = noiseActivity;
        this.f3535h = location;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((i) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new i(this.f3534g, this.f3535h, interfaceC2370d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    @Override // j5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = r8.f3533f
            com.lefan.signal.ui.noise.NoiseActivity r1 = r8.f3534g
            r7 = 1
            if (r0 == 0) goto L17
            if (r0 != r7) goto Lf
            com.lefan.signal.ui.noise.NoiseActivity r0 = r8.f3532e
            R2.a.H(r9)
            goto L37
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            R2.a.H(r9)
            android.location.Location r9 = r8.f3535h
            r1.f18979a0 = r9
            if (r9 == 0) goto L3b
            double r2 = r9.getLatitude()
            double r4 = r9.getLongitude()
            r8.f3532e = r1
            r8.f3533f = r7
            r6 = r8
            java.lang.Object r9 = com.lefan.signal.ui.noise.NoiseActivity.C(r1, r2, r4, r6)
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r9 != r0) goto L36
            return r0
        L36:
            r0 = r1
        L37:
            java.lang.String r9 = (java.lang.String) r9
            r0.f18974V = r9
        L3b:
            androidx.appcompat.widget.AppCompatTextView r9 = r1.f18986i0
            r0 = 0
            if (r9 == 0) goto L64
            java.lang.String r2 = r1.f18974V
            if (r2 == 0) goto L45
            goto L51
        L45:
            r2 = 2131887050(0x7f1203ca, float:1.9408696E38)
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = "getString(...)"
            q5.i.d(r2, r3)
        L51:
            r9.setText(r2)
            com.google.android.material.button.MaterialButton r9 = r1.f18987j0
            if (r9 == 0) goto L5e
            r9.setEnabled(r7)
            c5.i r9 = c5.C0412i.f5929a
            return r9
        L5e:
            java.lang.String r9 = "addressBtn"
            q5.i.g(r9)
            throw r0
        L64:
            java.lang.String r9 = "addressTextView"
            q5.i.g(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.i.l(java.lang.Object):java.lang.Object");
    }
}
