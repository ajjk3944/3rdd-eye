package o3;

import android.net.Uri;
import java.util.Map;

/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7063b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Map f55262a;

    C7063b(C7062a c7062a, Map map) {
        this.f55262a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f55262a;
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        AbstractC7065d.a(builderBuildUpon.build().toString());
    }
}
