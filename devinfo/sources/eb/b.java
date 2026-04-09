package eb;

import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.jn;
import p6.i;
import pa.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22517a;

    /* renamed from: b, reason: collision with root package name */
    public i f22518b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView.ScaleType f22519c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22520d;

    /* renamed from: e, reason: collision with root package name */
    public o7.d f22521e;

    public final synchronized void a(o7.d dVar) {
        this.f22521e = dVar;
        if (this.f22520d) {
            dVar.r(this.f22519c);
        }
    }

    public m getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f22520d = true;
        this.f22519c = scaleType;
        o7.d dVar = this.f22521e;
        if (dVar != null) {
            dVar.r(scaleType);
        }
    }

    public void setMediaContent(m mVar) {
        boolean zV;
        this.f22517a = true;
        i iVar = this.f22518b;
        if (iVar != null) {
            iVar.L();
        }
        if (mVar == null) {
            return;
        }
        try {
            jn jnVarA = mVar.a();
            if (jnVarA != null) {
                if (!mVar.c()) {
                    if (mVar.b()) {
                        zV = jnVarA.V(new vb.b(this));
                    }
                    removeAllViews();
                }
                zV = jnVarA.v(new vb.b(this));
                if (zV) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e2) {
            removeAllViews();
            za.i.f("", e2);
        }
    }
}
