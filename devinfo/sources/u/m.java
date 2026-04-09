package u;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f34718a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f34719b;

    public m(Intent intent, Bundle bundle) {
        this.f34718a = intent;
        this.f34719b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f34718a;
        intent.setData(uri);
        context.startActivity(intent, this.f34719b);
    }
}
