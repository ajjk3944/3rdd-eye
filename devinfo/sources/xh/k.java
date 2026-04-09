package xh;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.f1;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.tests.TestesActivity;
import e4.m0;
import e4.v0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class k extends hg.d {
    public View Z;

    /* renamed from: a0, reason: collision with root package name */
    public TestesActivity f37136a0;

    /* renamed from: b0, reason: collision with root package name */
    public o7.d f37137b0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        TestesActivity testesActivity = (TestesActivity) context;
        this.f37136a0 = testesActivity;
        testesActivity.setTitle(R.string.flashlight_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        try {
            this.f37137b0 = new o7.d(this.f37136a0, 29);
        } catch (SecurityException unused) {
            this.f37136a0.finish();
        } catch (Exception unused2) {
            Toast.makeText(this.f37136a0, R.string.failed, 0).show();
            this.f37136a0.finish();
        }
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.Z == null) {
            this.Z = layoutInflater.inflate(R.layout.tests_type_normal, viewGroup, false);
            if (c0()) {
                return this.Z;
            }
            ((ImageView) this.Z.findViewById(R.id.image)).setImageResource(R.drawable.img_flashlight);
            ((TextView) this.Z.findViewById(R.id.message)).setText(R.string.flashlight_test_question);
            final int i4 = 0;
            this.Z.findViewById(R.id.iv_failed).setOnClickListener(new View.OnClickListener(this) { // from class: xh.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f37133b;

                {
                    this.f37133b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_flashlight", 0);
                            this.f37133b.f37136a0.finish();
                            break;
                        default:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_flashlight", 1);
                            this.f37133b.f37136a0.finish();
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.Z.findViewById(R.id.iv_success).setOnClickListener(new View.OnClickListener(this) { // from class: xh.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f37133b;

                {
                    this.f37133b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_flashlight", 0);
                            this.f37133b.f37136a0.finish();
                            break;
                        default:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_flashlight", 1);
                            this.f37133b.f37136a0.finish();
                            break;
                    }
                }
            });
        }
        return this.Z;
    }

    @Override // b5.z
    public final void H() throws CameraAccessException {
        ji.a aVar;
        this.F = true;
        o7.d dVar = this.f37137b0;
        if (dVar != null) {
            dVar.q();
            f1 f1Var = (f1) this.f37137b0.f30421b;
            if (f1Var == null || (aVar = (ji.a) f1Var.f1138f) == null) {
                return;
            }
            ((CameraManager) f1Var.f1134b).unregisterTorchCallback(aVar);
            f1Var.f1134b = null;
            f1Var.f1138f = null;
        }
    }

    @Override // b5.z
    public final void L() throws CameraAccessException {
        this.F = true;
        o7.d dVar = this.f37137b0;
        if (dVar != null) {
            dVar.q();
        }
    }

    @Override // b5.z
    public final void N() throws CameraAccessException {
        this.F = true;
        try {
            f1 f1Var = (f1) this.f37137b0.f30421b;
            if (f1Var != null && !TextUtils.isEmpty((String) f1Var.f1135c)) {
                if (f1Var.D()) {
                    return;
                }
                try {
                    ((CameraManager) f1Var.f1134b).setTorchMode((String) f1Var.f1135c, true);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            Toast.makeText(this.f37136a0, R.string.failed, 0).show();
        }
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        j jVar = new j(0, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, jVar);
    }
}
