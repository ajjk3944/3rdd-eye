package v2;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import v2.f;

/* loaded from: classes.dex */
public class d extends a implements SurfaceHolder.Callback, f {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f24702c = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f24703a;

    /* renamed from: b, reason: collision with root package name */
    public e f24704b;

    public d(Context context) {
        super(context);
        b();
    }

    @Override // v2.f
    public void a(c cVar) {
        this.f24703a = new WeakReference(cVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f24702c.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null && eVar.a() == null) {
                holder.removeCallback(eVar);
                it.remove();
            }
        }
        holder.addCallback(this.f24704b);
    }

    public final void b() {
        e eVar = new e(this);
        this.f24704b = eVar;
        f24702c.add(eVar);
    }

    @Override // v2.f
    public void emc(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference weakReference = this.f24703a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((c) this.f24703a.get()).emc(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f24703a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((c) this.f24703a.get()).emc(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f24703a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((c) this.f24703a.get()).ypw(surfaceHolder);
    }

    @Override // v2.f
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(f.a aVar) {
    }
}
