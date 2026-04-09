package vf;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.t1;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: vf.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8228h implements t1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f63629a;

    public C8228h(Context context) {
        AbstractC6492s.i(context, "context");
        this.f63629a = context;
    }

    @Override // androidx.compose.ui.platform.t1
    public void a(String uri) {
        AbstractC6492s.i(uri, "uri");
        try {
            this.f63629a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
        } catch (ActivityNotFoundException e10) {
            Z7.b.j("Failed to open uri: '" + uri + "'", e10, null, 4, null);
        } catch (SecurityException e11) {
            Z7.b.j("Failed to open uri: '" + uri + "'", e11, null, 4, null);
        }
    }
}
