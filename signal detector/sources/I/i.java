package I;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1865a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f1866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1867c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1865a = colorStateList;
        this.f1866b = configuration;
        this.f1867c = theme == null ? 0 : theme.hashCode();
    }
}
