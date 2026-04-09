package c2;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* loaded from: classes.dex */
public class p implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static ProfileStore f4651b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f4652a;

    public p(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f4652a = profileStoreBoundaryInterface;
    }

    public static ProfileStore a() {
        if (f4651b == null) {
            f4651b = new p(y.d().getProfileStore());
        }
        return f4651b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) {
        if (x.f4669c0.c()) {
            return this.f4652a.deleteProfile(str);
        }
        throw x.a();
    }

    @Override // androidx.webkit.ProfileStore
    public List getAllProfileNames() {
        if (x.f4669c0.c()) {
            return this.f4652a.getAllProfileNames();
        }
        throw x.a();
    }

    @Override // androidx.webkit.ProfileStore
    public b2.b getOrCreateProfile(String str) {
        if (x.f4669c0.c()) {
            return new o((ProfileBoundaryInterface) da.a.a(ProfileBoundaryInterface.class, this.f4652a.getOrCreateProfile(str)));
        }
        throw x.a();
    }

    @Override // androidx.webkit.ProfileStore
    public b2.b getProfile(String str) {
        if (!x.f4669c0.c()) {
            throw x.a();
        }
        InvocationHandler profile = this.f4652a.getProfile(str);
        if (profile != null) {
            return new o((ProfileBoundaryInterface) da.a.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
