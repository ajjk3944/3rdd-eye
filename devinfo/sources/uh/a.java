package uh;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.GpuCard;
import com.liuzh.deviceinfo.utilities.f;
import dj.b;
import e4.m0;
import e4.v0;
import java.util.WeakHashMap;
import ph.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a extends sh.a {
    public View Z;

    /* renamed from: a0, reason: collision with root package name */
    public GpuCard f35328a0;

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.Z == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tab_cpu, viewGroup, false);
            this.Z = viewInflate;
            f fVar = f.f21256b;
            b.m((ScrollView) viewInflate, f.d());
            this.f35328a0 = (GpuCard) this.Z.findViewById(R.id.gpu_card);
        }
        return this.Z;
    }

    @Override // b5.z
    public final void L() {
        GLSurfaceView gLSurfaceView;
        this.F = true;
        GpuCard gpuCard = this.f35328a0;
        if (gpuCard == null || (gLSurfaceView = gpuCard.f21184a) == null) {
            return;
        }
        gLSurfaceView.onPause();
    }

    @Override // b5.z
    public final void N() {
        GLSurfaceView gLSurfaceView;
        this.F = true;
        GpuCard gpuCard = this.f35328a0;
        if (gpuCard == null || (gLSurfaceView = gpuCard.f21184a) == null) {
            return;
        }
        gLSurfaceView.onResume();
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        d dVar = new d(8, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, dVar);
    }
}
