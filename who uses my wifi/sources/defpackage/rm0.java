package defpackage;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rm0 implements ProfileStore {
    public static rm0 b;
    public final ProfileStoreBoundaryInterface a;

    public rm0(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (f81.f.b()) {
            return this.a.deleteProfile(str);
        }
        throw f81.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (f81.f.b()) {
            return this.a.getAllProfileNames();
        }
        throw f81.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final pm0 getOrCreateProfile(String str) {
        if (!f81.f.b()) {
            throw f81.a();
        }
        return new sq0(6, (ProfileBoundaryInterface) yb.e(ProfileBoundaryInterface.class, this.a.getOrCreateProfile(str)));
    }

    @Override // androidx.webkit.ProfileStore
    public final pm0 getProfile(String str) {
        if (!f81.f.b()) {
            throw f81.a();
        }
        InvocationHandler profile = this.a.getProfile(str);
        if (profile == null) {
            return null;
        }
        return new sq0(6, (ProfileBoundaryInterface) yb.e(ProfileBoundaryInterface.class, profile));
    }
}
