package com.liuzh.deviceinfo.card;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.o0;
import bi.d;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.l;
import di.a;
import j$.util.Objects;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class GpuCard extends FrameLayout implements GLSurfaceView.Renderer {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f21183f = 0;

    /* renamed from: a, reason: collision with root package name */
    public GLSurfaceView f21184a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21185b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f21186c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21187d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f21188e;

    public GpuCard(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int iE;
        ConfigurationInfo deviceConfigurationInfo;
        super(context, attributeSet);
        if (isInEditMode()) {
            iE = getContext().getResources().getColor(R.color.colorPrimary);
        } else {
            f fVar = f.f21256b;
            iE = f.e();
        }
        this.f21185b = iE;
        int i4 = 1;
        this.f21187d = 1;
        setBackgroundResource(R.drawable.bg_common_card);
        setElevation(getResources().getDimensionPixelSize(R.dimen.common_card_elevation));
        View.inflate(getContext(), R.layout.card_gpu, this);
        this.f21186c = (ViewGroup) findViewById(R.id.card_gpu);
        if (isInEditMode()) {
            return;
        }
        this.f21188e = (TextView) findViewById(R.id.opengl_extensions);
        Drawable drawable = getContext().getDrawable(R.drawable.ic_view_detail);
        Objects.requireNonNull(drawable);
        this.f21188e.setCompoundDrawablesWithIntrinsicBounds(e.M(drawable, iE), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f21188e.setTextColor(iE);
        TextView textView = (TextView) findViewById(R.id.vulkan);
        textView.setTextColor(iE);
        textView.setText(l.X());
        try {
            ActivityManager activityManager = (ActivityManager) getContext().getSystemService("activity");
            if (activityManager != null && (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) != null) {
                int i10 = deviceConfigurationInfo.reqGlEsVersion;
                if (i10 >= 196608) {
                    i4 = 3;
                } else if (i10 >= 131072) {
                    i4 = 2;
                }
            }
            this.f21187d = i4;
            GLSurfaceView gLSurfaceView = new GLSurfaceView(getContext());
            this.f21184a = gLSurfaceView;
            gLSurfaceView.setEGLContextClientVersion(this.f21187d);
            this.f21184a.setRenderer(this);
            addView(this.f21184a);
        } catch (Exception unused) {
        }
        d.c(new o0(28, this));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int i4 = this.f21187d;
        a aVar = i4 == 1 ? new a(gl10.glGetString(7938), gl10.glGetString(7937), gl10.glGetString(7936), gl10.glGetString(7939)) : (i4 == 2 || i4 == 3) ? new a(GLES20.glGetString(7938), GLES20.glGetString(7937), GLES20.glGetString(7936), GLES20.glGetString(7939)) : null;
        d.b(new aj.d(24, this, aVar));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i4, int i10) {
    }
}
