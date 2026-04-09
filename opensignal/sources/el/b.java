package el;

import android.content.Context;
import br.l;

/* loaded from: classes.dex */
public final class b {
    public long A;
    public long B;
    public boolean C;
    public boolean D;
    public String E;
    public String F;
    public String G;
    public boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8203a;

    /* renamed from: b, reason: collision with root package name */
    public og.b f8204b;

    /* renamed from: c, reason: collision with root package name */
    public int f8205c;

    /* renamed from: d, reason: collision with root package name */
    public int f8206d;

    /* renamed from: e, reason: collision with root package name */
    public int f8207e;

    /* renamed from: f, reason: collision with root package name */
    public int f8208f;

    /* renamed from: g, reason: collision with root package name */
    public int f8209g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8210h;

    /* renamed from: i, reason: collision with root package name */
    public int f8211i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public String f8212l;

    /* renamed from: m, reason: collision with root package name */
    public String f8213m;

    /* renamed from: n, reason: collision with root package name */
    public String f8214n;

    /* renamed from: o, reason: collision with root package name */
    public double f8215o;

    /* renamed from: p, reason: collision with root package name */
    public String f8216p;

    /* renamed from: q, reason: collision with root package name */
    public double f8217q;

    /* renamed from: r, reason: collision with root package name */
    public String f8218r;

    /* renamed from: s, reason: collision with root package name */
    public double f8219s;

    /* renamed from: t, reason: collision with root package name */
    public String f8220t;

    /* renamed from: u, reason: collision with root package name */
    public String f8221u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8222v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8223w;

    /* renamed from: x, reason: collision with root package name */
    public String f8224x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8225y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8226z;

    public b(Context context) {
        l.e(context, "context");
        this.f8203a = context;
        this.f8205c = 12;
        this.f8206d = 4;
        this.f8207e = 15;
        this.f8208f = 9;
        this.f8209g = 15;
        this.f8211i = 12;
        this.j = 9;
        this.k = 15;
        this.f8212l = "";
        this.f8213m = "";
        this.f8214n = "";
        this.f8215o = 22.0d;
        this.f8216p = "";
        this.f8217q = 20.0d;
        this.f8218r = "";
        this.f8219s = 16.0d;
        this.f8220t = "";
        this.f8221u = "";
        this.f8222v = true;
        this.f8223w = true;
        this.f8224x = "";
        this.A = 3L;
        this.B = 5000L;
        this.E = "";
        this.F = "";
        this.G = "";
    }

    public final void a() {
        og.b bVar = this.f8204b;
        if (bVar == null) {
            return;
        }
        this.f8205c = (int) bVar.c("coverage_tab_default_zoom");
        this.f8206d = (int) bVar.c("coverage_tab_coverage_min_zoom");
        this.f8207e = (int) bVar.c("coverage_tab_coverage_max_zoom");
        this.f8208f = (int) bVar.c("coverage_tab_network_rank_min_zoom");
        this.f8209g = (int) bVar.c("coverage_tab_network_rank_max_zoom");
        this.f8210h = bVar.a("coverage_tab_5g_enabled");
        this.f8211i = (int) bVar.c("towers_activity_default_zoom");
        this.j = (int) bVar.c("towers_activity_min_zoom");
        this.k = (int) bVar.c("towers_activity_max_zoom");
        this.f8212l = bVar.d("awesome_dialog_header_background_image_url");
        this.f8213m = bVar.d("awesome_dialog_header_hero_image_url");
        this.f8214n = bVar.d("awesome_dialog_title");
        this.f8215o = bVar.b("awesome_dialog_title_font_size");
        this.f8216p = bVar.d("awesome_dialog_main_content");
        this.f8217q = bVar.b("awesome_dialog_main_content_font_size");
        this.f8218r = bVar.d("awesome_dialog_bottom_content");
        this.f8219s = bVar.b("awesome_dialog_bottom_content_font_size");
        this.f8220t = bVar.d("awesome_dialog_left_button_label");
        this.f8221u = bVar.d("awesome_dialog_right_button_label");
        this.f8222v = bVar.a("awesome_dialog_show_left_button");
        this.f8223w = bVar.a("awesome_dialog_show_right_button");
        bVar.d("awesome_dialog_left_button_action_url");
        this.f8224x = bVar.d("awesome_dialog_right_button_action_url");
        this.f8225y = bVar.a("awesome_dialog_show");
        this.f8226z = bVar.a("awesome_dialog_reset_was_shown_state");
        this.A = bVar.c("awesome_dialog_min_session_count_before_showing_dialog");
        this.B = bVar.c("awesome_dialog_delay_before_showing_millis");
        this.C = bVar.a("ui_hide_stats_tab");
        this.D = bVar.a("ui_hide_network_stats_page");
        this.E = bVar.d("video_test_config");
        this.F = bVar.d("regex_nr_state");
        this.G = bVar.d("app_rating_configuration");
        this.H = bVar.a("connectivity_assistant_enabled");
        bVar.c("osca_pulse_timeout_ms");
        bVar.c("osca_pulse_min_distance_meters");
    }
}
