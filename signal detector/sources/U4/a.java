package U4;

import A2.C0117e;
import B4.C0141c;
import Y2.C0200b;
import Y2.C0201c;
import Y2.C0203e;
import Y2.C0207i;
import Y2.C0209k;
import Y2.C0210l;
import Y2.M;
import Y2.Q;
import Y2.S;
import a2.AbstractC0271g;
import android.animation.Animator;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import com.apm.insight.R;
import com.lefan.base.activity.LanguageActivity;
import com.lefan.signal.activity.SplashActivity;
import com.lefan.signal.db.CellInfoBean;
import d5.AbstractC2282j;
import e2.InterfaceC2302a;
import h0.C2351a;
import h0.C2352b;
import java.util.Arrays;
import java.util.Locale;
import k0.K;
import k0.U;
import p4.C2781h;
import q2.C2834o;
import w4.C2976b;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC2302a, N.c, e4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3706c;

    public /* synthetic */ a(Object obj, int i, Object obj2) {
        this.f3704a = i;
        this.f3705b = obj;
        this.f3706c = obj2;
    }

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        int i3 = this.f3704a;
        Object obj = this.f3706c;
        Object obj2 = this.f3705b;
        boolean z6 = false;
        switch (i3) {
            case 0:
                D4.a aVar = (D4.a) obj;
                b bVar = (b) AbstractC2282j.V(i, ((CellInfoBean) obj2).getCellInfoItems());
                if (bVar != null) {
                    B4.s.a(aVar.f(), view, String.format("%s:%s\n\n%s", Arrays.copyOf(new Object[]{bVar.f3707a, bVar.f3709c, aVar.f().getString(bVar.f3708b)}, 3)));
                    break;
                }
                break;
            default:
                LanguageActivity languageActivity = (LanguageActivity) obj2;
                Locale locale = (Locale) obj;
                int i6 = LanguageActivity.f18756V;
                C2976b c2976b = (C2976b) AbstractC2282j.V(i, languageActivity.f18759Q);
                if (c2976b != null) {
                    Locale locale2 = c2976b.f23971a;
                    if (c2976b.f23973c != 1) {
                        Locale locale3 = F4.e.f1457a;
                        if (F4.e.a(locale, locale2) != 1) {
                            if (languageActivity.f18763U) {
                                SharedPreferences sharedPreferences = languageActivity.getSharedPreferences("sp", 0);
                                q5.i.b(sharedPreferences);
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                editorEdit.putInt("language_click_id", i);
                                editorEdit.apply();
                            }
                            String language = locale2.getLanguage();
                            q5.i.d(language, "getLanguage(...)");
                            int i7 = 27;
                            if (!y5.l.V(language, "en", false)) {
                                if (languageActivity.f18760R == null) {
                                    K kS = languageActivity.s();
                                    c1.g gVar = new c1.g(i7, z6);
                                    gVar.f5897c = languageActivity.getString(R.string.global_locale_change_title);
                                    String string = languageActivity.getString(R.string.change_language_default);
                                    q5.i.d(string, "getString(...)");
                                    gVar.f5896b = String.format(string, Arrays.copyOf(new Object[]{locale2.getDisplayName(locale)}, 1));
                                    gVar.f5898d = languageActivity.getString(R.string.action_change);
                                    d4.h hVar = new d4.h(21, c2976b);
                                    if (kS != null) {
                                        C0141c c0141c = new C0141c();
                                        c0141c.f704C0 = gVar;
                                        c0141c.f703B0 = hVar;
                                        c0141c.e0(kS, "custom_dialog");
                                        break;
                                    }
                                } else if (languageActivity.f18762T != i) {
                                    K kS2 = languageActivity.s();
                                    c1.g gVar2 = new c1.g(i7, z6);
                                    gVar2.f5897c = languageActivity.getString(R.string.global_locale_change_title);
                                    String string2 = languageActivity.getString(R.string.change_language_need_down);
                                    q5.i.d(string2, "getString(...)");
                                    gVar2.f5896b = String.format(string2, Arrays.copyOf(new Object[]{locale2.getDisplayName(locale)}, 1));
                                    gVar2.f5898d = languageActivity.getString(R.string.string_down);
                                    I.d dVar = new I.d(languageActivity, i, c2976b);
                                    if (kS2 != null) {
                                        C0141c c0141c2 = new C0141c();
                                        c0141c2.f704C0 = gVar2;
                                        c0141c2.f703B0 = dVar;
                                        c0141c2.e0(kS2, "custom_dialog");
                                        break;
                                    }
                                }
                            } else {
                                K kS3 = languageActivity.s();
                                c1.g gVar3 = new c1.g(i7, z6);
                                gVar3.f5897c = languageActivity.getString(R.string.global_locale_change_title);
                                String string3 = languageActivity.getString(R.string.change_language_default);
                                q5.i.d(string3, "getString(...)");
                                gVar3.f5896b = String.format(string3, Arrays.copyOf(new Object[]{locale2.getDisplayName(locale)}, 1));
                                gVar3.f5898d = languageActivity.getString(R.string.action_change);
                                C2352b c2352b = new C2352b(14, c2976b);
                                if (kS3 != null) {
                                    C0141c c0141c3 = new C0141c();
                                    c0141c3.f704C0 = gVar3;
                                    c0141c3.f703B0 = c2352b;
                                    c0141c3.e0(kS3, "custom_dialog");
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // e4.b
    public void h() {
        SplashActivity splashActivity = (SplashActivity) this.f3705b;
        F4.c cVar = (F4.c) this.f3706c;
        if (splashActivity.isDestroyed() || splashActivity.isFinishing()) {
            return;
        }
        cVar.f("show");
        C2781h c2781h = new C2781h(1, cVar);
        if (((S) ((M) C0200b.c(splashActivity).f4309h).a()).a()) {
            c2781h.a(null);
            return;
        }
        C0209k c0209k = (C0209k) ((M) C0200b.c(splashActivity).f4307f).a();
        Y2.z.a();
        C2351a c2351a = new C2351a(splashActivity, 14, c2781h);
        C0117e c0117e = new C0117e(21, c2781h);
        c0209k.getClass();
        Y2.z.a();
        C0210l c0210l = (C0210l) c0209k.f4344c.get();
        if (c0210l == null) {
            c0117e.k(new Q(3, "No available form can be built.").a());
            return;
        }
        C0201c c0201c = (C0201c) c0209k.f4342a.a();
        c0201c.getClass();
        C0200b c0200b = c0201c.f4310a;
        M mB = M.b(new U0.j(20, (A0.e) c0200b.f4304c));
        A0.e eVar = new A0.e(20, c0210l);
        C0117e c0117e2 = new C0117e(22, false);
        A0.e eVar2 = (A0.e) c0200b.f4304c;
        M m6 = (M) c0200b.f4308g;
        C0203e c0203e = (C0203e) c0200b.i;
        M m7 = (M) c0200b.f4305d;
        M mB2 = M.b(new C2834o(eVar2, (M) c0200b.f4306e, mB, m7, eVar, new V2.h(mB, 13, new C2834o(eVar2, mB, m6, c0203e, c0117e2, m7, 6)), 5));
        if (((M) c0117e2.f245b) != null) {
            throw new IllegalStateException();
        }
        c0117e2.f245b = mB2;
        ((C0207i) c0117e2.a()).b(c2351a, c0117e);
    }

    @Override // N.c
    public void onCancel() {
        Animator animator = (Animator) this.f3705b;
        U u6 = (U) this.f3706c;
        q5.i.e(u6, "$operation");
        animator.end();
        if (K.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + u6 + " has been canceled.");
        }
    }
}
