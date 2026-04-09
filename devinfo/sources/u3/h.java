package u3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f35086a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f35087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35088c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f35086a = colorStateList;
        this.f35087b = configuration;
        this.f35088c = theme == null ? 0 : theme.hashCode();
    }
}
