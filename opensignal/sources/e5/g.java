package e5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements a5.j, dd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7820a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7821d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7822g;

    public /* synthetic */ g(Object obj, boolean z10, int i10) {
        this.f7820a = i10;
        this.f7821d = obj;
        this.f7822g = z10;
    }

    @Override // a5.j
    public void a(Object obj) {
        switch (this.f7820a) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$32((a) this.f7821d, this.f7822g, (c) obj);
                break;
            case 1:
                ((c) obj).onSkipSilenceEnabledChanged((a) this.f7821d, this.f7822g);
                break;
            case 2:
                ((c) obj).onIsPlayingChanged((a) this.f7821d, this.f7822g);
                break;
            default:
                ((c) obj).onShuffleModeChanged((a) this.f7821d, this.f7822g);
                break;
        }
    }

    @Override // dd.e
    public void h(Object obj) {
        SharedPreferences.Editor editorEdit = se.b.C((Context) this.f7821d).edit();
        editorEdit.putBoolean("proxy_retention", this.f7822g);
        editorEdit.apply();
    }
}
