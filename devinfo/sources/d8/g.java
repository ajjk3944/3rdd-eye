package d8;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements w, j, t8.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22015a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22016b;

    public /* synthetic */ g(Context context, int i4) {
        this.f22015a = i4;
        this.f22016b = context;
    }

    @Override // d8.j
    public Class a() {
        return Drawable.class;
    }

    @Override // d8.j
    public Object c(int i4, Resources.Theme theme, Resources resources) {
        Context context = this.f22016b;
        return d5.i(context, context, i4, theme);
    }

    @Override // d8.j
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // t8.g
    public Object get() {
        return (ConnectivityManager) this.f22016b.getSystemService("connectivity");
    }

    @Override // d8.w
    public v i(b0 b0Var) {
        switch (this.f22015a) {
            case 0:
                return new b(this.f22016b, this);
            case 1:
                return new b(this.f22016b, b0Var.b(Integer.class, AssetFileDescriptor.class));
            default:
                return new r(this.f22016b, 1);
        }
    }

    public g(Context context) {
        this.f22015a = 4;
        this.f22016b = context.getApplicationContext();
    }
}
