package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.mq0;
import defpackage.yc0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends mq0 {
    @Override // defpackage.mq0
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(yc0.class.getClassLoader());
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
