package O1;

import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.sz.ypw.bw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends a implements SurfaceHolder.Callback, g {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3060c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f3061a;

    /* renamed from: b, reason: collision with root package name */
    public e f3062b;

    @Override // O1.g
    public final void a(bw bwVar) {
        this.f3061a = new WeakReference(bwVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f3060c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null && ((SurfaceHolder.Callback) eVar.f3063a.get()) == null) {
                holder.removeCallback(eVar);
                it.remove();
            }
        }
        holder.addCallback(this.f3062b);
    }

    @Override // O1.g
    public final void emc(int i, int i3) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i3;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i3, int i6) {
        WeakReference weakReference = this.f3061a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((c) this.f3061a.get()).emc(surfaceHolder, i, i3, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f3061a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((c) this.f3061a.get()).emc(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f3061a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((c) this.f3061a.get()).ypw(surfaceHolder);
    }

    @Override // O1.g
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(f fVar) {
    }
}
