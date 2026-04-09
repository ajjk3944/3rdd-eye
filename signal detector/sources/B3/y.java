package B3;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import m0.C2650a;

/* loaded from: classes.dex */
public final class y extends u {
    public static final h i = new h(5, Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f679c;

    /* renamed from: d, reason: collision with root package name */
    public final C2650a f680d;

    /* renamed from: e, reason: collision with root package name */
    public final B f681e;

    /* renamed from: f, reason: collision with root package name */
    public int f682f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f683g;

    /* renamed from: h, reason: collision with root package name */
    public float f684h;

    public y(B b5) {
        super(3);
        this.f682f = 1;
        this.f681e = b5;
        this.f680d = new C2650a(1);
    }

    public final void D() {
        if (this.f679c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.f679c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f681e.f571n * 333.0f));
            this.f679c.setInterpolator(null);
            this.f679c.setRepeatCount(-1);
            this.f679c.addListener(new x(0, this));
        }
    }

    public final void E() {
        this.f683g = true;
        this.f682f = 1;
        ArrayList arrayList = (ArrayList) this.f663b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            r rVar = (r) obj;
            B b5 = this.f681e;
            rVar.f648c = b5.f563e[0];
            rVar.f649d = b5.i / 2;
        }
    }

    @Override // B3.u
    public final void c() {
        ObjectAnimator objectAnimator = this.f679c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // B3.u
    public final void q() {
        D();
        this.f679c.setDuration((long) (this.f681e.f571n * 333.0f));
        E();
    }

    @Override // B3.u
    public final void w() {
        D();
        E();
        this.f679c.start();
    }

    @Override // B3.u
    public final void u() {
    }

    @Override // B3.u
    public final void x() {
    }

    @Override // B3.u
    public final void t(c cVar) {
    }
}
