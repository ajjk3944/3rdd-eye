package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p51 extends cb0 {
    public final /* synthetic */ int j;

    public p51(int i, Class cls, int i2, int i3, int i4) {
        this.j = i4;
        this.f = i;
        this.i = cls;
        this.h = i2;
        this.g = i3;
    }

    @Override // defpackage.cb0
    public final Object c(View view) {
        switch (this.j) {
            case 0:
                return Boolean.valueOf(x51.d(view));
            case 1:
                return x51.b(view);
            case 2:
                return z51.b(view);
            default:
                return Boolean.valueOf(x51.c(view));
        }
    }

    @Override // defpackage.cb0
    public final void d(View view, Object obj) {
        switch (this.j) {
            case 0:
                x51.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                x51.h(view, (CharSequence) obj);
                break;
            case 2:
                z51.e(view, (CharSequence) obj);
                break;
            default:
                x51.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.cb0
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.j) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
