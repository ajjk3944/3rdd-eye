package t4;

import com.apm.insight.R;
import com.google.android.gms.internal.ads.C0758Ue;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ad.FreeAdActivity;
import j2.C2556l;
import q2.C2834o;
import q5.i;
import q5.m;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2930a extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2931b f23671d;

    public C2930a(C2931b c2931b) {
        this.f23671d = c2931b;
    }

    @Override // j2.u
    public final void c(C2556l c2556l) {
        C2931b c2931b = this.f23671d;
        c2931b.f23674c = null;
        c2931b.f23675d = 0L;
        c2931b.f23673b = false;
        C2834o c2834o = c2931b.f23676e;
        if (c2834o != null) {
            MaterialButton materialButton = (MaterialButton) c2834o.f23252b;
            materialButton.setText(((FreeAdActivity) c2834o.f23253c).getString(R.string.reward_ad_free_failed));
            materialButton.setEnabled(true);
            ((m) c2834o.f23254d).f23297a = 2;
        }
    }

    @Override // j2.u
    public final void f(Object obj) {
        C0758Ue c0758Ue = (C0758Ue) obj;
        i.e(c0758Ue, "ad");
        C2931b c2931b = this.f23671d;
        c2931b.f23674c = c0758Ue;
        c2931b.f23675d = System.currentTimeMillis();
        c2931b.f23673b = false;
        C2834o c2834o = c2931b.f23676e;
        if (c2834o != null) {
            MaterialButton materialButton = (MaterialButton) c2834o.f23252b;
            materialButton.setText(((FreeAdActivity) c2834o.f23253c).getString(R.string.reward_ad_free_loaded));
            materialButton.setEnabled(true);
            ((m) c2834o.f23254d).f23297a = 1;
        }
    }
}
