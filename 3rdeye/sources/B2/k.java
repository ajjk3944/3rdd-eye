package B2;

import android.widget.CompoundButton;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f412c;

    public /* synthetic */ k(Object obj, int i) {
        this.f411b = i;
        this.f412c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f411b) {
            case 0:
                Oo.j(((l) this.f412c).f416e.f2429a, "PREVIEW", z10);
                break;
            default:
                p9.l listener = (p9.l) this.f412c;
                kotlin.jvm.internal.l.f(listener, "$listener");
                listener.invoke(Boolean.valueOf(z10));
                break;
        }
    }
}
