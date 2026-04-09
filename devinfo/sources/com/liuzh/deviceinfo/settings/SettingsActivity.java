package com.liuzh.deviceinfo.settings;

import ah.n;
import ah.o;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.g;
import com.liuzh.deviceinfo.utilities.y;
import com.liuzh.deviceinfo.view.LineColorPicker;
import com.liuzh.deviceinfo.view.SettingsItemView;
import com.liuzh.deviceinfo.widget.WidgetsActivity;
import d.h;
import e4.m0;
import e4.v0;
import hg.a;
import j$.util.Objects;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import je.u;
import ki.c;
import lf.e;
import mg.d;
import nm.d0;
import qh.k;
import t6.i0;
import t7.m;
import zg.b;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SettingsActivity extends a implements View.OnClickListener, n {
    public static final /* synthetic */ int J = 0;
    public b B;
    public b C;
    public SettingsItemView D;
    public SettingsItemView E;
    public TextView F;
    public final g G = new g(this);
    public final bh.a H = new bh.a(this, 5);
    public n.a I;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r3.b.V(r5, new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"}[0]) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void D(com.liuzh.deviceinfo.settings.SettingsActivity r5, zg.b r6) {
        /*
            boolean r0 = wi.h.f36762h
            r1 = 0
            if (r0 != 0) goto L6
            goto L27
        L6:
            java.lang.String r0 = "already_request_post_notification_permission"
            android.content.SharedPreferences r2 = com.liuzh.deviceinfo.utilities.f.f21257c
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L11
            goto L21
        L11:
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            x.n0 r2 = wi.i.f36764a
            r0 = r0[r1]
            boolean r0 = r3.b.V(r5, r0)
            if (r0 == 0) goto L27
        L21:
            if (r6 == 0) goto L26
            r6.e()
        L26:
            return
        L27:
            android.view.LayoutInflater r0 = r5.getLayoutInflater()
            r2 = 2131493014(0x7f0c0096, float:1.8609496E38)
            r3 = 0
            android.view.View r0 = r0.inflate(r2, r3, r1)
            r2 = 2131297041(0x7f090311, float:1.8212016E38)
            android.view.View r4 = wb.e.s(r2, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L6e
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r2 = 2131887062(0x7f1203d6, float:1.940872E38)
            r4.setText(r2)
            t7.m r2 = new t7.m
            r2.<init>(r5)
            r5 = 2131887397(0x7f120525, float:1.94094E38)
            r2.y(r5)
            r2.z(r0)
            eg.d r5 = new eg.d
            r0 = 4
            r5.<init>(r0, r6)
            r6 = 2131887161(0x7f120439, float:1.9408921E38)
            r2.x(r6, r5)
            r5 = 2131886759(0x7f1202a7, float:1.9408106E38)
            r2.w(r5, r3)
            i.e r5 = r2.A()
            r5.setCanceledOnTouchOutside(r1)
            return
        L6e:
            android.content.res.Resources r5 = r0.getResources()
            java.lang.String r5 = r5.getResourceName(r2)
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liuzh.deviceinfo.settings.SettingsActivity.D(com.liuzh.deviceinfo.settings.SettingsActivity, zg.b):void");
    }

    public final void E() {
        View viewFindViewById = findViewById(R.id.account_content);
        boolean z3 = d.f29372a;
        viewFindViewById.setVisibility(8);
    }

    public final void F(final boolean z3) {
        int i4;
        m mVar = new m(this);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_color_preference, (ViewGroup) null, false);
        final LineColorPicker lineColorPicker = (LineColorPicker) viewInflate.findViewById(R.id.color_picker);
        final LineColorPicker lineColorPicker2 = (LineColorPicker) viewInflate.findViewById(R.id.shade_picker);
        final TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        f fVar = f.f21256b;
        int iD = f.d();
        if (z3) {
            textView.setText(R.string.primary_color);
            HashSet hashSet = zh.a.f38282a;
            lineColorPicker.setColors(new int[]{getColor(R.color.md_red_500), getColor(R.color.md_pink_500), getColor(R.color.md_purple_500), getColor(R.color.md_deep_purple_500), getColor(R.color.md_indigo_500), getColor(R.color.md_blue_500), getColor(R.color.md_light_blue_500), getColor(R.color.md_cyan_500), getColor(R.color.md_teal_500), getColor(R.color.default_theme_color), getColor(R.color.md_green_500), getColor(R.color.md_light_green_500), getColor(R.color.md_lime_500), getColor(R.color.md_yellow_500), getColor(R.color.md_amber_500), getColor(R.color.md_orange_500), getColor(R.color.md_deep_orange_500), getColor(R.color.md_brown_500), getColor(R.color.md_blue_grey_500), getColor(R.color.md_grey_500)});
            for (int i10 : lineColorPicker.getColors()) {
                int[] iArrC = zh.a.c(i10, this);
                int length = iArrC.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    int i12 = iArrC[i11];
                    if (i12 == iD) {
                        lineColorPicker.setSelectedColor(i10);
                        lineColorPicker2.setColors(zh.a.c(i10, this));
                        lineColorPicker2.setSelectedColor(i12);
                        break;
                    }
                    i11++;
                }
            }
            i4 = 8;
        } else {
            textView.setText(R.string.accent_color);
            HashSet hashSet2 = zh.a.f38282a;
            lineColorPicker.setColors(new int[]{getColor(R.color.colorAccent), getColor(R.color.md_red_500), getColor(R.color.md_purple_500), getColor(R.color.md_deep_purple_500), getColor(R.color.md_blue_500), getColor(R.color.md_light_blue_500), getColor(R.color.md_cyan_500), getColor(R.color.md_teal_500), getColor(R.color.md_green_500), getColor(R.color.md_yellow_500), getColor(R.color.md_orange_500), getColor(R.color.md_deep_orange_500), getColor(R.color.md_brown_500), getColor(R.color.md_blue_grey_500)});
            i4 = 8;
            lineColorPicker2.setVisibility(8);
            iD = f.a();
            lineColorPicker.setSelectedColor(iD);
        }
        textView.setBackgroundColor(iD);
        lineColorPicker.setOnColorChangedListener(new c() { // from class: qh.l
            @Override // ki.c
            public final void b(int i13) {
                int i14 = SettingsActivity.J;
                textView.setBackgroundColor(i13);
                if (z3) {
                    LineColorPicker lineColorPicker3 = lineColorPicker;
                    int[] iArrC2 = zh.a.c(lineColorPicker3.getColor(), this.f32413a);
                    LineColorPicker lineColorPicker4 = lineColorPicker2;
                    lineColorPicker4.setColors(iArrC2);
                    lineColorPicker4.setSelectedColor(lineColorPicker3.getColor());
                }
            }
        });
        lineColorPicker2.setOnColorChangedListener(new e(i4, textView));
        mVar.z(viewInflate);
        mVar.x(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: qh.m

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f32418a;

            {
                com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                this.f32418a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                int i14 = SettingsActivity.J;
                o oVar = o.f400d;
                oVar.getClass();
                boolean z10 = mg.d.f29372a;
                boolean zC = oVar.c();
                boolean z11 = z3;
                LineColorPicker lineColorPicker3 = lineColorPicker2;
                LineColorPicker lineColorPicker4 = lineColorPicker;
                if (zC) {
                    if (z11) {
                        com.liuzh.deviceinfo.utilities.f.l(lineColorPicker3.getColor(), "themes_primary_color");
                        com.liuzh.deviceinfo.utilities.f.k("observer_recreate_notifier", !com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("observer_recreate_notifier", false));
                        return;
                    } else {
                        com.liuzh.deviceinfo.utilities.f.l(lineColorPicker4.getColor(), "themes_accent_color");
                        com.liuzh.deviceinfo.utilities.f.k("observer_recreate_notifier", !com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("observer_recreate_notifier", false));
                        return;
                    }
                }
                if (z11) {
                    if (com.liuzh.deviceinfo.utilities.f.d() == lineColorPicker3.getColor()) {
                        return;
                    }
                } else if (com.liuzh.deviceinfo.utilities.f.a() == lineColorPicker4.getColor()) {
                    return;
                }
                d dVar = new d();
                Bundle bundle = new Bundle();
                bundle.putBoolean("isPrimary", z11);
                bundle.putInt("color", z11 ? lineColorPicker3.getColor() : lineColorPicker4.getColor());
                dVar.Z(bundle);
                dVar.h0(this.f32418a.s(), "RewardThemeColorDialog");
            }
        });
        qh.g gVar = new qh.g(this, 0);
        i.b bVar = (i.b) mVar.f34474c;
        bVar.f25238k = bVar.f25230a.getText(R.string.recommend_colors);
        bVar.f25239l = gVar;
        i.e eVarA = mVar.A();
        f.a();
        dj.b.t(eVarA, f.d());
    }

    @Override // ah.n
    public final void i(boolean z3) {
        if (!i0.l(this) && z3) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ad_container);
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(8);
            }
            View viewFindViewById = findViewById(R.id.ad_divider);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.feedback) {
            m mVar = new m(this);
            mVar.y(R.string.settings_feedback_title);
            ((i.b) mVar.f34474c).f25235f = getString(R.string.send_feed_back_to_us, "support@liuzhosoft.com");
            mVar.x(R.string.send_email, new qh.g(this, 1));
            mVar.w(android.R.string.cancel, null);
            mVar.A();
            return;
        }
        if (id2 == R.id.rating) {
            com.liuzh.deviceinfo.utilities.d.j(this, "com.liuzh.deviceinfo", "SettingsRate");
            return;
        }
        if (id2 == R.id.privacy) {
            com.liuzh.deviceinfo.utilities.d.n(this);
            return;
        }
        if (id2 == R.id.siv_pro) {
            ProActivity.D(this);
            return;
        }
        if (id2 == R.id.export_info) {
            g gVar = this.G;
            gVar.getClass();
            gVar.f21260b = new SimpleDateFormat("yyyyMMdd-hh:mm:ss", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
            try {
                gVar.f21259a.a(h.w(new StringBuilder("deviceinfo_"), gVar.f21260b, ".txt"));
                return;
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(this, R.string.failed, 0).show();
                return;
            }
        }
        if (id2 == R.id.widgets) {
            startActivity(new Intent(this, (Class<?>) WidgetsActivity.class));
            return;
        }
        if (id2 == R.id.term_of_service) {
            com.liuzh.deviceinfo.utilities.d.o(this);
            return;
        }
        if (id2 == R.id.help_translate) {
            m mVar2 = new m(this);
            mVar2.y(R.string.help_us_translate);
            mVar2.v(R.string.help_us_translate_summary);
            mVar2.x(R.string.confirm, null);
            mVar2.A();
            return;
        }
        if (id2 == R.id.facebook_home) {
            Context context = view.getContext();
            boolean z3 = com.liuzh.deviceinfo.utilities.d.f21252a;
            if (nh.a.l(context, FbValidationUtils.FB_PACKAGE)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("fb://page/113086391149844"));
                intent.setFlags(268435456);
                try {
                    context.startActivity(intent);
                    return;
                } catch (Exception unused2) {
                }
            }
            try {
                i0.s(context, "https://www.facebook.com/liuzhosoft");
                return;
            } catch (Exception unused3) {
                Toast.makeText(context, R.string.failed, 0).show();
                return;
            }
        }
        if (id2 == R.id.floating_monitor) {
            startActivity(new Intent(this, (Class<?>) MonitorActivity.class));
            return;
        }
        try {
            if (id2 == R.id.xhs_home) {
                try {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("xhsdiscover://user/5d2af5740000000010006677")));
                    return;
                } catch (Exception unused4) {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("https://www.xiaohongshu.com/user/profile/5d2af5740000000010006677")));
                    return;
                }
            }
            if (id2 == R.id.bili_home) {
                try {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("bilibili://space/9881207")));
                } catch (Exception unused5) {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("https://space.bilibili.com/9881207")));
                }
            } else if (id2 == R.id.weibo_home) {
                try {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("sinaweibo://userinfo?uid=2685246603")));
                } catch (Exception unused6) {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("https://weibo.com/u/2685246603")));
                }
            } else if (id2 == R.id.coolapk_home) {
                try {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("coolmarket://u/2060320")));
                } catch (Exception unused7) {
                    startActivity(new Intent("android.intent.action.VIEW").addFlags(268435456).setData(Uri.parse("https://www.coolapk.com/u/2060320")));
                }
            } else if (id2 == R.id.cn_beian) {
                i0.s(this, "https://beian.miit.gov.cn/");
            }
        } catch (Exception unused8) {
        }
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchFieldException, Resources.NotFoundException, SecurityException {
        super.onCreate(bundle);
        d.m.a(this);
        setTitle(R.string.settings);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        z(toolbar);
        A();
        i.e(toolbar);
        ((TextView) findViewById(R.id.version)).setText(getString(R.string.app_name) + " - v3.0.1.0");
        f fVar = f.f21256b;
        int iD = f.d();
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        dj.b.m(scrollView, iD);
        findViewById(R.id.feedback).setOnClickListener(this);
        findViewById(R.id.rating).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.privacy);
        textView.setOnClickListener(this);
        findViewById(R.id.export_info).setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.term_of_service);
        textView2.setOnClickListener(this);
        final int i4 = 2;
        final int i10 = 1;
        final int i11 = 0;
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            y.k(textView, textView2);
        }
        o oVar = o.f400d;
        oVar.getClass();
        boolean z3 = d.f29372a;
        findViewById(R.id.siv_pro).setOnClickListener(this);
        findViewById(R.id.close_ad).setVisibility(8);
        findViewById(R.id.more_apps_card).setVisibility(0);
        findViewById(R.id.distance_unit).setVisibility(0);
        View viewFindViewById = findViewById(R.id.widgets);
        viewFindViewById.setOnClickListener(this);
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = findViewById(R.id.item_dark_mode);
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: qh.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f32410b;

            {
                this.f32410b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                int i12 = i11;
                SettingsActivity settingsActivity = this.f32410b;
                switch (i12) {
                    case 0:
                        int i13 = SettingsActivity.J;
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i14 = com.liuzh.deviceinfo.utilities.f.f21257c.getInt("dark_mode", 0);
                        String[] stringArray = settingsActivity.getResources().getStringArray(R.array.dark_mode_names);
                        if (i14 < 0 || i14 > stringArray.length) {
                            i14 = 0;
                        }
                        t7.m mVar = new t7.m(settingsActivity);
                        mVar.y(R.string.dark_mode);
                        h hVar = new h(0, settingsActivity, stringArray);
                        i.b bVar = (i.b) mVar.f34474c;
                        bVar.f25244q = stringArray;
                        bVar.f25246s = hVar;
                        bVar.f25250w = i14;
                        bVar.f25249v = true;
                        mVar.A();
                        break;
                    case 1:
                        int i15 = SettingsActivity.J;
                        settingsActivity.F(true);
                        break;
                    default:
                        int i16 = SettingsActivity.J;
                        settingsActivity.F(false);
                        break;
                }
            }
        });
        this.F = (TextView) viewFindViewById2.findViewById(R.id.tv_dark_mode_status);
        int i12 = f.f21257c.getInt("dark_mode", 0);
        String[] stringArray = getResources().getStringArray(R.array.dark_mode_names);
        if (i12 < 0 || i12 > stringArray.length) {
            i12 = 0;
        }
        this.F.setText(stringArray[i12]);
        zh.a.b((ImageView) findViewById(R.id.iv_primary_color), iD);
        findViewById(R.id.item_primary_color).setOnClickListener(new View.OnClickListener(this) { // from class: qh.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f32410b;

            {
                this.f32410b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                int i122 = i10;
                SettingsActivity settingsActivity = this.f32410b;
                switch (i122) {
                    case 0:
                        int i13 = SettingsActivity.J;
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i14 = com.liuzh.deviceinfo.utilities.f.f21257c.getInt("dark_mode", 0);
                        String[] stringArray2 = settingsActivity.getResources().getStringArray(R.array.dark_mode_names);
                        if (i14 < 0 || i14 > stringArray2.length) {
                            i14 = 0;
                        }
                        t7.m mVar = new t7.m(settingsActivity);
                        mVar.y(R.string.dark_mode);
                        h hVar = new h(0, settingsActivity, stringArray2);
                        i.b bVar = (i.b) mVar.f34474c;
                        bVar.f25244q = stringArray2;
                        bVar.f25246s = hVar;
                        bVar.f25250w = i14;
                        bVar.f25249v = true;
                        mVar.A();
                        break;
                    case 1:
                        int i15 = SettingsActivity.J;
                        settingsActivity.F(true);
                        break;
                    default:
                        int i16 = SettingsActivity.J;
                        settingsActivity.F(false);
                        break;
                }
            }
        });
        zh.a.b((ImageView) findViewById(R.id.iv_accent_color), f.a());
        findViewById(R.id.item_accent_color).setOnClickListener(new View.OnClickListener(this) { // from class: qh.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f32410b;

            {
                this.f32410b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                int i122 = i4;
                SettingsActivity settingsActivity = this.f32410b;
                switch (i122) {
                    case 0:
                        int i13 = SettingsActivity.J;
                        com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                        int i14 = com.liuzh.deviceinfo.utilities.f.f21257c.getInt("dark_mode", 0);
                        String[] stringArray2 = settingsActivity.getResources().getStringArray(R.array.dark_mode_names);
                        if (i14 < 0 || i14 > stringArray2.length) {
                            i14 = 0;
                        }
                        t7.m mVar = new t7.m(settingsActivity);
                        mVar.y(R.string.dark_mode);
                        h hVar = new h(0, settingsActivity, stringArray2);
                        i.b bVar = (i.b) mVar.f34474c;
                        bVar.f25244q = stringArray2;
                        bVar.f25246s = hVar;
                        bVar.f25250w = i14;
                        bVar.f25249v = true;
                        mVar.A();
                        break;
                    case 1:
                        int i15 = SettingsActivity.J;
                        settingsActivity.F(true);
                        break;
                    default:
                        int i16 = SettingsActivity.J;
                        settingsActivity.F(false);
                        break;
                }
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.help_translate);
        textView3.setOnClickListener(this);
        this.D = (SettingsItemView) findViewById(R.id.notification);
        this.E = (SettingsItemView) findViewById(R.id.new_app_notification);
        this.B = zg.c.f(this, this, new f.b(this) { // from class: qh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f32408b;

            {
                this.f32408b = this;
            }

            @Override // f.b
            public final void k(Object obj) throws Resources.NotFoundException {
                int i13 = i11;
                SettingsActivity settingsActivity = this.f32408b;
                Boolean bool = (Boolean) obj;
                switch (i13) {
                    case 0:
                        int i14 = SettingsActivity.J;
                        settingsActivity.getClass();
                        if (bool.booleanValue()) {
                            settingsActivity.D.setSwitch(true);
                            break;
                        }
                        break;
                    default:
                        int i15 = SettingsActivity.J;
                        settingsActivity.getClass();
                        if (bool.booleanValue()) {
                            settingsActivity.E.setSwitch(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.C = zg.c.f(this, this, new f.b(this) { // from class: qh.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f32408b;

            {
                this.f32408b = this;
            }

            @Override // f.b
            public final void k(Object obj) throws Resources.NotFoundException {
                int i13 = i10;
                SettingsActivity settingsActivity = this.f32408b;
                Boolean bool = (Boolean) obj;
                switch (i13) {
                    case 0:
                        int i14 = SettingsActivity.J;
                        settingsActivity.getClass();
                        if (bool.booleanValue()) {
                            settingsActivity.D.setSwitch(true);
                            break;
                        }
                        break;
                    default:
                        int i15 = SettingsActivity.J;
                        settingsActivity.getClass();
                        if (bool.booleanValue()) {
                            settingsActivity.E.setSwitch(true);
                            break;
                        }
                        break;
                }
            }
        });
        this.D.setSwitchListener(new km.i(12, this));
        this.E.setSwitchListener(new d0(6, this));
        View viewFindViewById3 = findViewById(R.id.help_center);
        viewFindViewById3.setVisibility(8);
        View viewFindViewById4 = findViewById(R.id.facebook_home);
        viewFindViewById4.setOnClickListener(this);
        viewFindViewById4.setVisibility(0);
        View viewFindViewById5 = findViewById(R.id.xhs_home);
        viewFindViewById5.setOnClickListener(this);
        viewFindViewById5.setVisibility(8);
        View viewFindViewById6 = findViewById(R.id.bili_home);
        viewFindViewById6.setOnClickListener(this);
        viewFindViewById6.setVisibility(8);
        View viewFindViewById7 = findViewById(R.id.coolapk_home);
        viewFindViewById7.setOnClickListener(this);
        viewFindViewById7.setVisibility(8);
        View viewFindViewById8 = findViewById(R.id.weibo_home);
        viewFindViewById8.setOnClickListener(this);
        viewFindViewById8.setVisibility(8);
        findViewById(R.id.floating_monitor).setOnClickListener(this);
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            findViewById(R.id.homes_container).setVisibility(8);
            viewFindViewById4.setVisibility(8);
            viewFindViewById3.setVisibility(8);
            textView3.setVisibility(8);
            findViewById(R.id.notification).setVisibility(8);
        }
        TextView textView4 = (TextView) findViewById(R.id.cn_beian);
        textView4.setVisibility(8);
        textView4.setOnClickListener(this);
        textView4.setOnLongClickListener(new k(textView4, i11));
        View viewFindViewById9 = findViewById(R.id.root_container);
        View viewFindViewById10 = findViewById(R.id.root_container_land);
        if (viewFindViewById9 == null) {
            viewFindViewById9 = viewFindViewById10;
        }
        Objects.requireNonNull(viewFindViewById9);
        qe.b bVar = new qe.b(this, toolbar, viewFindViewById10 != null, scrollView);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewFindViewById9, bVar);
        bh.c.b();
        E();
        bh.c.d(this.H);
        oVar.b(this);
        if (oVar.c() || f.g()) {
            return;
        }
        pi.a aVar = ag.a.f358a;
        pi.a aVar2 = new pi.a();
        aVar2.f32004b = 1;
        aVar2.f32005c = 2;
        aVar2.f32003a = "ca-app-pub-3724073793374078/8700177126";
        aVar2.f32007e = new Point();
        Resources resources = DeviceInfoApp.f21145f.getResources();
        aVar2.f32007e.x = a4.a.m(DeviceInfoApp.f21145f) - ((a4.a.c(resources, 22.0f) * 2) + (resources.getDimensionPixelSize(R.dimen.content_padding) * 2));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ad_container);
        if (viewGroup != null) {
            findViewById(R.id.ad_divider).setVisibility(0);
            viewGroup.removeAllViews();
            LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_banner_placeholder_50, viewGroup);
            viewGroup.setVisibility(0);
            u.k(this, new qh.n(this, viewGroup, i11), aVar2);
        }
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n.a aVar = this.I;
        if (aVar != null) {
            aVar.b();
            this.I = null;
        }
        bh.c.g(this.H);
        o.f400d.h(this);
    }
}
