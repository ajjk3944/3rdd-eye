package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ce4 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ x03 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce4(x03 x03Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = x03Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        x03 x03Var = this.c;
        x03Var.b(ae4.a((Context) x03Var.g, (in2) x03Var.o, (AudioDeviceInfo) x03Var.n));
    }
}
