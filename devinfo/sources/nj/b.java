package nj;

import android.content.Context;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.liuzh.deviceinfo.R;
import e4.c2;
import ec.z;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public a f29949a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        k.e(context, "context");
        View.inflate(context, getLayoutId(), this);
        e();
        setOrientation(1);
        setClickable(true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.buttons_container);
        View viewFindViewById = findViewById(R.id.buttons_divider);
        if (viewGroup == null || viewFindViewById == null) {
            return;
        }
        ((z) jm.a.f27720a.f1138f).getClass();
    }

    public static void f(int i4, View view, v3.b bVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = bVar.f35793a + i4;
        marginLayoutParams.rightMargin = i4 + bVar.f35795c;
        view.setLayoutParams(marginLayoutParams);
    }

    public abstract void a(c2 c2Var);

    public void b(Menu menu, MenuInflater menuInflater) {
        k.e(menu, "menu");
        k.e(menuInflater, "inflater");
    }

    public boolean d(MenuItem menuItem) {
        k.e(menuItem, "item");
        return false;
    }

    public final void e() {
        z zVar = (z) jm.a.f27720a.f1138f;
        getContext();
        zVar.getClass();
        Context context = getContext();
        k.d(context, "getContext(...)");
        setBackgroundColor(cm.g.l(android.R.attr.colorBackground, context));
    }

    public final a getCloseListener() {
        return this.f29949a;
    }

    public abstract int getLayoutId();

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e();
    }

    public final void setCloseListener(a aVar) {
        this.f29949a = aVar;
    }

    public void c() {
    }
}
