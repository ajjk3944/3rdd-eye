package B2;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f429c;

    public /* synthetic */ o(Object obj, int i) {
        this.f428b = i;
        this.f429c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f428b) {
            case 0:
                Oo.j(((v) this.f429c).f438b.f2429a, "PREVIEW", z10);
                break;
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f429c).f22692j;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    break;
                }
                break;
        }
    }
}
