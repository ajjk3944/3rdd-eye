package s2;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public final class l extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final ImageButton f23495a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC2894d f23496b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.content.Context r7, com.google.android.gms.internal.ads.Rr r8, s2.BinderC2894d r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.l.<init>(android.content.Context, com.google.android.gms.internal.ads.Rr, s2.d):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BinderC2894d binderC2894d = this.f23496b;
        if (binderC2894d != null) {
            binderC2894d.f23458K = 2;
            binderC2894d.f23460b.finish();
        }
    }
}
