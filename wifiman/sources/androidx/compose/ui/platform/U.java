package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class U implements t1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29317a;

    public U(Context context) {
        this.f29317a = context;
    }

    @Override // androidx.compose.ui.platform.t1
    public void a(String str) {
        try {
            this.f29317a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e10) {
            throw new IllegalArgumentException("Can't open " + str + '.', e10);
        }
    }
}
