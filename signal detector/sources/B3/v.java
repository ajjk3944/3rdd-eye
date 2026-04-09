package B3;

import android.content.Context;
import android.provider.Settings;
import com.apm.insight.R;

/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f664E = 0;

    /* renamed from: C, reason: collision with root package name */
    public u f665C;

    /* renamed from: D, reason: collision with root package name */
    public M0.r f666D;

    /* renamed from: n, reason: collision with root package name */
    public final t f667n;

    public v(Context context, e eVar, t tVar, u uVar) {
        super(context, eVar);
        this.f667n = tVar;
        this.f665C = uVar;
        uVar.f662a = this;
    }

    public static v g(Context context, l lVar, f fVar) {
        v vVar = new v(context, lVar, fVar, lVar.f612o == 1 ? new k(context, lVar) : new i(lVar));
        vVar.f666D = M0.r.a(R.drawable.ic_mtrl_arrow_circle, null, context.getResources());
        return vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.v.draw(android.graphics.Canvas):void");
    }

    @Override // B3.q
    public final boolean e(boolean z6, boolean z7, boolean z8) {
        M0.r rVar;
        boolean zE = super.e(z6, z7, z8);
        if (this.f637c != null && Settings.Global.getFloat(this.f635a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (rVar = this.f666D) != null) {
            return rVar.setVisible(z6, z7);
        }
        if (!isRunning()) {
            this.f665C.c();
        }
        if (z6 && z8) {
            this.f665C.w();
        }
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f667n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f667n.f();
    }
}
