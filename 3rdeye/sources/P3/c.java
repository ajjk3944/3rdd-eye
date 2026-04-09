package P3;

import M0.i;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f10590b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f10590b = bottomSheetBehavior;
        this.f10589a = i;
    }

    @Override // M0.i
    public final boolean a(View view) {
        this.f10590b.D(this.f10589a);
        return true;
    }
}
