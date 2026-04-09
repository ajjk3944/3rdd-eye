package j3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f13188a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f13189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13190c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f13188a = colorStateList;
        this.f13189b = configuration;
        this.f13190c = theme == null ? 0 : theme.hashCode();
    }
}
