package p6;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements ProfileStore {

    /* renamed from: b, reason: collision with root package name */
    public static g f31382b;

    /* renamed from: a, reason: collision with root package name */
    public final ProfileStoreBoundaryInterface f31383a;

    public g(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f31383a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (l.g.b()) {
            return this.f31383a.deleteProfile(str);
        }
        throw l.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (l.g.b()) {
            return this.f31383a.getAllProfileNames();
        }
        throw l.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final o6.b getOrCreateProfile(String str) {
        if (!l.g.b()) {
            throw l.a();
        }
        return new km.i(7, (ProfileBoundaryInterface) jm.a.f(ProfileBoundaryInterface.class, this.f31383a.getOrCreateProfile(str)));
    }

    @Override // androidx.webkit.ProfileStore
    public final o6.b getProfile(String str) {
        if (!l.g.b()) {
            throw l.a();
        }
        InvocationHandler profile = this.f31383a.getProfile(str);
        if (profile == null) {
            return null;
        }
        return new km.i(7, (ProfileBoundaryInterface) jm.a.f(ProfileBoundaryInterface.class, profile));
    }
}
