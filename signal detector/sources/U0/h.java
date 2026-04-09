package U0;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public final class h implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static h f3673b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f3674a;

    public h(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f3674a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (m.f3685g.b()) {
            return this.f3674a.deleteProfile(str);
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (m.f3685g.b()) {
            return this.f3674a.getAllProfileNames();
        }
        throw m.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final T0.b getOrCreateProfile(String str) {
        if (!m.f3685g.b()) {
            throw m.a();
        }
        return new j(15, (ProfileBoundaryInterface) I5.b.e(ProfileBoundaryInterface.class, this.f3674a.getOrCreateProfile(str)));
    }

    @Override // androidx.webkit.ProfileStore
    public final T0.b getProfile(String str) {
        if (!m.f3685g.b()) {
            throw m.a();
        }
        InvocationHandler profile = this.f3674a.getProfile(str);
        if (profile == null) {
            return null;
        }
        return new j(15, (ProfileBoundaryInterface) I5.b.e(ProfileBoundaryInterface.class, profile));
    }
}
