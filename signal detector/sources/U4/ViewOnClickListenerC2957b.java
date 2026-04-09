package u4;

import android.view.View;
import com.lefan.base.activity.HelpActivity;
import com.lefan.base.activity.LanguageActivity;
import com.lefan.base.activity.PrivacyActivity;
import com.lefan.base.activity.WebUrlActivity;
import com.lefan.signal.activity.SplashActivity;
import h.AbstractActivityC2349g;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2957b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f23827b;

    public /* synthetic */ ViewOnClickListenerC2957b(AbstractActivityC2349g abstractActivityC2349g, int i) {
        this.f23826a = i;
        this.f23827b = abstractActivityC2349g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f23826a;
        AbstractActivityC2349g abstractActivityC2349g = this.f23827b;
        switch (i) {
            case 0:
                int i3 = SplashActivity.f18821W;
                ((SplashActivity) abstractActivityC2349g).E();
                break;
            case 1:
                int i6 = HelpActivity.f18755O;
                ((HelpActivity) abstractActivityC2349g).finish();
                break;
            case 2:
                int i7 = LanguageActivity.f18756V;
                ((LanguageActivity) abstractActivityC2349g).finish();
                break;
            case 3:
                int i8 = PrivacyActivity.f18764P;
                ((PrivacyActivity) abstractActivityC2349g).finish();
                break;
            default:
                int i9 = WebUrlActivity.f18775R;
                ((WebUrlActivity) abstractActivityC2349g).finish();
                break;
        }
    }
}
