package zh;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import nk.k;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f38298a = new ArrayList();

    static {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        com.liuzh.deviceinfo.utilities.f.n(new yg.d(1));
    }

    public static final void a(Toolbar toolbar, v3.b bVar) {
        k.e(toolbar, "toolbar");
        int i4 = bVar.f35794b;
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = toolbar.getResources().getDimensionPixelSize(R.dimen.toolbar_height) + i4;
        toolbar.setLayoutParams(layoutParams);
        toolbar.setPadding(bVar.f35793a, i4, bVar.f35795c, toolbar.getPaddingBottom());
    }

    public static final int b(Context context) {
        k.e(context, "context");
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        return d(context, iD, R.color.default_theme_color) ? context.getColor(R.color.bg_primary_card) : d(context, iD, R.color.md_red_500) ? context.getColor(R.color.bg_primary_card_red) : d(context, iD, R.color.md_pink_500) ? context.getColor(R.color.bg_primary_card_pink) : d(context, iD, R.color.md_purple_500) ? context.getColor(R.color.bg_primary_card_purple) : d(context, iD, R.color.md_deep_purple_500) ? context.getColor(R.color.bg_primary_card_deep_purple) : d(context, iD, R.color.md_indigo_500) ? context.getColor(R.color.bg_primary_card_indigo) : d(context, iD, R.color.md_blue_500) ? context.getColor(R.color.bg_primary_card_blue) : d(context, iD, R.color.md_light_blue_500) ? context.getColor(R.color.bg_primary_card_light_blue) : d(context, iD, R.color.md_cyan_500) ? context.getColor(R.color.bg_primary_card_cyan) : d(context, iD, R.color.md_teal_500) ? context.getColor(R.color.bg_primary_card_teal) : d(context, iD, R.color.md_green_500) ? context.getColor(R.color.bg_primary_card_green) : d(context, iD, R.color.md_light_green_500) ? context.getColor(R.color.bg_primary_card_light_green) : d(context, iD, R.color.md_lime_500) ? context.getColor(R.color.bg_primary_card_lime) : d(context, iD, R.color.md_yellow_500) ? context.getColor(R.color.bg_primary_card_yellow) : d(context, iD, R.color.md_amber_500) ? context.getColor(R.color.bg_primary_card_amber) : d(context, iD, R.color.md_orange_500) ? context.getColor(R.color.bg_primary_card_orange) : d(context, iD, R.color.md_deep_orange_500) ? context.getColor(R.color.bg_primary_card_deep_orange) : d(context, iD, R.color.md_brown_500) ? context.getColor(R.color.bg_primary_card_brown) : d(context, iD, R.color.md_blue_grey_500) ? context.getColor(R.color.bg_primary_card_blue_grey) : d(context, iD, R.color.md_grey_500) ? context.getColor(R.color.bg_primary_card_grey) : context.getColor(R.color.bg_primary_card);
    }

    public static final int c(Context context) {
        k.e(context, "context");
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        if (iD == context.getColor(R.color.colorPrimary)) {
            return context.getColor(R.color.colorPrimarySecondary);
        }
        return cm.g.H(iD, !a.f38282a.contains(Integer.valueOf(iD)) ? 0.18f : 0.3f);
    }

    public static boolean d(Context context, int i4, int i10) {
        DeviceInfoApp deviceInfoApp = fi.a.f24058a;
        k.e(context, "context");
        return m.J(i4, a.c(context.getColor(i10), deviceInfoApp));
    }

    public static final void e(Toolbar toolbar) {
        k.e(toolbar, "toolbar");
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        toolbar.setBackgroundColor(cm.g.H(com.liuzh.deviceinfo.utilities.f.h() ? dj.b.a(0.22f, iD, Color.parseColor("#FF060606")) : dj.b.a(0.16f, iD, Color.parseColor("#FFFEFEFE")), 0.95f));
        toolbar.setElevation(toolbar.getResources().getDimensionPixelSize(R.dimen.toolbar_elevation));
    }
}
