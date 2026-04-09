package J6;

import J6.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.l;
import m.C5306c;

/* compiled from: BackHandlingRecyclerView.kt */
/* loaded from: classes.dex */
public class a extends RecyclerView {

    /* renamed from: b, reason: collision with root package name */
    public final b f2802b;

    public a(C5306c c5306c) {
        super(c5306c, null, 0);
        this.f2802b = new b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyPreIme(int r6, android.view.KeyEvent r7) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.l.f(r7, r0)
            J6.b r0 = r5.f2802b
            r0.getClass()
            J6.b$a r1 = r0.f2804b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L51
            r1 = 4
            if (r6 != r1) goto L51
            int r1 = r7.getAction()
            J6.a r4 = r0.f2803a
            if (r1 != 0) goto L2c
            int r1 = r7.getRepeatCount()
            if (r1 != 0) goto L2c
            android.view.KeyEvent$DispatcherState r1 = r4.getKeyDispatcherState()
            if (r1 == 0) goto L2a
            r1.startTracking(r7, r0)
        L2a:
            r0 = r3
            goto L52
        L2c:
            int r1 = r7.getAction()
            if (r1 != r3) goto L51
            android.view.KeyEvent$DispatcherState r1 = r4.getKeyDispatcherState()
            if (r1 == 0) goto L3b
            r1.handleUpEvent(r7)
        L3b:
            boolean r1 = r7.isTracking()
            if (r1 == 0) goto L51
            boolean r1 = r7.isCanceled()
            if (r1 != 0) goto L51
            J6.b$a r0 = r0.f2804b
            kotlin.jvm.internal.l.c(r0)
            boolean r0 = r0.a()
            goto L52
        L51:
            r0 = r2
        L52:
            if (r0 != 0) goto L5c
            boolean r6 = super.onKeyPreIme(r6, r7)
            if (r6 == 0) goto L5b
            goto L5c
        L5b:
            return r2
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: J6.a.onKeyPreIme(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        l.f(changedView, "changedView");
        this.f2802b.a();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b bVar = this.f2802b;
        if (z10) {
            bVar.a();
        } else {
            bVar.getClass();
        }
    }

    public void setOnBackClickListener(b.a aVar) {
        setDescendantFocusability(aVar != null ? 131072 : 262144);
        b bVar = this.f2802b;
        bVar.f2804b = aVar;
        bVar.a();
    }
}
