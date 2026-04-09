package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class qbp {
    public vt fkw;

    /* renamed from: le, reason: collision with root package name */
    public boolean f8502le = false;

    /* renamed from: lh, reason: collision with root package name */
    public Context f8503lh;
    public View ouw;
    public ViewGroup pno;
    public c ra;
    public TextView vt;
    public com.bytedance.sdk.openadsdk.core.mwh.vt.ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ouw {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void mwh();

        boolean ryl();
    }

    public final boolean ouw() {
        View view = this.ouw;
        return view != null && view.getVisibility() == 0;
    }

    public final void vt() {
        View view = this.ouw;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void ouw(boolean z3) {
        if (z3) {
            this.ra = null;
        }
        vt();
    }
}
