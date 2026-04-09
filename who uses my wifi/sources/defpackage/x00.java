package defpackage;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class x00 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;

    public /* synthetic */ x00(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                i30.k(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                FrameLayout frameLayout = (FrameLayout) ((vb) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (frameLayout != null) {
                    BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout);
                    bottomSheetBehaviorB.J = true;
                    frameLayout.post(new e2(8, bottomSheetBehaviorB));
                    break;
                }
                break;
            default:
                int[] iArr = MainActivity.d0;
                break;
        }
    }
}
