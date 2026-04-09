package u3;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f35089a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f35090b;

    public i(Resources resources, Resources.Theme theme) {
        this.f35089a = resources;
        this.f35090b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f35089a.equals(iVar.f35089a) && Objects.equals(this.f35090b, iVar.f35090b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35089a, this.f35090b);
    }
}
