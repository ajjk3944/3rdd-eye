package x8;

import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.mwh.vt.fkw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends a implements SurfaceHolder.Callback, f {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f37008c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f37009a;

    /* renamed from: b, reason: collision with root package name */
    public b f37010b;

    @Override // x8.f
    public final void a(fkw fkwVar) {
        this.f37009a = new WeakReference(fkwVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f37008c.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null && ((SurfaceHolder.Callback) bVar.f37007a.get()) == null) {
                holder.removeCallback(bVar);
                it.remove();
            }
        }
        holder.addCallback(this.f37010b);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
    }

    @Override // x8.f
    public final void ouw(int i4, int i10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i10;
        layoutParams.width = i4;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i10, int i11) {
        pk.a.x("CSJ_VIDEO_SurfaceView", "surfaceChanged: ");
        WeakReference weakReference = this.f37009a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f37009a.get()).vt(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f37009a;
        if (weakReference != null && weakReference.get() != null) {
            ((d) this.f37009a.get()).ouw(surfaceHolder);
        }
        pk.a.x("CSJ_VIDEO_SurfaceView", "surfaceCreated: ");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        pk.a.x("CSJ_VIDEO_SurfaceView", "surfaceDestroyed: ");
        WeakReference weakReference = this.f37009a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f37009a.get()).lh(surfaceHolder);
    }

    @Override // x8.f
    public final View getView() {
        return this;
    }

    public final void setWindowVisibilityChangedListener(e eVar) {
    }
}
