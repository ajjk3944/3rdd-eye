package r1;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import u1.C2949d;

/* loaded from: classes.dex */
public final class y implements s, z1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f23390a;

    public /* synthetic */ y(Resources resources) {
        this.f23390a = resources;
    }

    @Override // z1.a
    public n1.z b(n1.z zVar, l1.h hVar) {
        if (zVar == null) {
            return null;
        }
        return new C2949d(this.f23390a, zVar);
    }

    @Override // r1.s
    public r d(x xVar) {
        return new C2872b(this.f23390a, xVar.c(Uri.class, InputStream.class));
    }
}
