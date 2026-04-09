package kn;

import android.widget.ImageView;
import androidx.lifecycle.e0;
import bf.n;
import br.l;
import com.staircase3.opensignal.goldstar.videotest.result.VideoResultActivity;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import io.sentry.cache.e;
import java.util.MissingResourceException;
import qk.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14446a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14447d;

    public /* synthetic */ a(int i10, Object obj) {
        this.f14446a = i10;
        this.f14447d = obj;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, lq.h] */
    @Override // androidx.lifecycle.e0
    public final void b(Object obj) throws MissingResourceException {
        int i10 = this.f14446a;
        Object obj2 = this.f14447d;
        switch (i10) {
            case 0:
                d dVar = (d) obj2;
                NetworkUiState networkUiState = (NetworkUiState) obj;
                l.e(networkUiState, "networkUiState");
                dVar.f14457f = networkUiState;
                dVar.b(networkUiState, null, dVar.f14458g, dVar.f14459h);
                dVar.getClass();
                return;
            case 1:
                VideoResultActivity videoResultActivity = (VideoResultActivity) obj2;
                NetworkUiState networkUiState2 = (NetworkUiState) obj;
                int i11 = VideoResultActivity.f6101d0;
                l.e(networkUiState2, "state");
                videoResultActivity.runOnUiThread(new e(videoResultActivity, 14, networkUiState2));
                return;
            case 2:
                TestsFragment testsFragment = (TestsFragment) obj2;
                NetworkUiState networkUiState3 = (NetworkUiState) obj;
                l.e(networkUiState3, "networkUiState");
                networkUiState3.toString();
                al.c cVar = testsFragment.I0;
                if (cVar == null) {
                    l.l("presenter");
                    throw null;
                }
                networkUiState3.toString();
                um.a aVar = networkUiState3.B;
                TestsFragment testsFragment2 = (TestsFragment) cVar.f820b;
                int i12 = tl.a.f22879a[aVar.ordinal()];
                if (i12 == 1) {
                    ImageView imageView = testsFragment2.K0;
                    if (imageView != null) {
                        imageView.setImageResource(f.no_signal);
                    }
                } else if (i12 == 2) {
                    ImageView imageView2 = testsFragment2.K0;
                    if (imageView2 != null) {
                        imageView2.setImageResource(f.ic_cellular_a);
                    }
                } else {
                    if (i12 != 3) {
                        throw new n();
                    }
                    ImageView imageView3 = testsFragment2.K0;
                    if (imageView3 != null) {
                        imageView3.setImageResource(f.ic_wifi_a);
                    }
                }
                al.c cVar2 = testsFragment2.J0;
                l.b(cVar2);
                ((NetworkInfoView) ((bm.d) cVar2.f821c).f2827g).setNetworkInformation(networkUiState3);
                al.c cVar3 = testsFragment.J0;
                l.b(cVar3);
                ((NetworkInfoView) ((bm.d) cVar3.f821c).f2827g).setNetworkInformation(networkUiState3);
                d.f((d) testsFragment.P0.getValue(), null, "app_opened", 0L, 11);
                return;
            default:
                VideoTestActivity videoTestActivity = (VideoTestActivity) obj2;
                NetworkUiState networkUiState4 = (NetworkUiState) obj;
                int i13 = VideoTestActivity.f6105h0;
                l.e(networkUiState4, "networkUiState");
                videoTestActivity.W = networkUiState4;
                videoTestActivity.runOnUiThread(new e(videoTestActivity, 15, networkUiState4));
                ((tm.b) videoTestActivity.f6111f0.getValue()).f22888b = new i4.b(videoTestActivity, networkUiState4);
                return;
        }
    }
}
