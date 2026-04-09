package androidx.webkit;

import defpackage.f81;
import defpackage.g81;
import defpackage.pm0;
import defpackage.rm0;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!f81.f.b()) {
            throw f81.a();
        }
        if (rm0.b == null) {
            rm0.b = new rm0(g81.a.getProfileStore());
        }
        return rm0.b;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    pm0 getOrCreateProfile(String str);

    pm0 getProfile(String str);
}
