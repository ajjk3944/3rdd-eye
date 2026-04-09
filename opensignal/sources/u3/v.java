package u3;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class v extends k4.c {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f23223x;

    public v(int i10, Class cls, int i11, int i12, int i13) {
        this.f23223x = i13;
        this.f14037a = i10;
        this.f14040r = cls;
        this.f14039g = i11;
        this.f14038d = i12;
    }

    @Override // k4.c
    public final Object c(View view) {
        switch (this.f23223x) {
            case 0:
                return Boolean.valueOf(d0.c(view));
            case 1:
                return d0.a(view);
            case 2:
                return f0.a(view);
            default:
                return Boolean.valueOf(d0.b(view));
        }
    }

    @Override // k4.c
    public final void d(View view, Object obj) {
        switch (this.f23223x) {
            case 0:
                d0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                d0.e(view, (CharSequence) obj);
                break;
            case 2:
                f0.b(view, (CharSequence) obj);
                break;
            default:
                d0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // k4.c
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f23223x) {
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
