package G3;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes.dex */
public final class C extends A {

    /* renamed from: f, reason: collision with root package name */
    public boolean f1526f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f1527g = 0.0f;

    public C(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new B(0, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    @Override // G3.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.material.navigation.NavigationView r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.C.a(com.google.android.material.navigation.NavigationView):void");
    }

    @Override // G3.A
    public final boolean b() {
        return !this.f1526f || this.f1519a;
    }
}
