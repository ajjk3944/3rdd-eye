package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qs2 {
    public final pu2 a;
    public final au2 b;
    public ps2 c = null;

    public qs2(pu2 pu2Var, au2 au2Var) {
        this.a = pu2Var;
        this.b = au2Var;
    }

    public static final int b(int i, Context context, String str) throws NumberFormatException {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        j63 j63Var = sv1.f.a;
        return j63.b(context, i);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        ag2 ag2VarA = this.a.a(xe4.a(), null, null);
        ag2VarA.p0().setVisibility(4);
        ag2VarA.p0().setContentDescription("policy_validator");
        ag2VarA.v0("/sendMessageToSdk", new k32(9, this));
        ag2VarA.v0("/hideValidatorOverlay", new os2(this, windowManager, frameLayout));
        ag2VarA.v0("/open", new i42(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(ag2VarA);
        os2 os2Var = new os2(this, frameLayout, windowManager);
        au2 au2Var = this.b;
        au2Var.b("/loadNativeAdPolicyViolations", new cr2(au2Var, weakReference, "/loadNativeAdPolicyViolations", os2Var));
        au2Var.b("/showValidatorOverlay", new cr2(au2Var, new WeakReference(ag2VarA), "/showValidatorOverlay", o32.l));
        return ag2VarA.p0();
    }
}
