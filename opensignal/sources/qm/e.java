package qm;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.staircase3.opensignal.activities.SettingsActivity;
import com.staircase3.opensignal.utils.o;
import com.staircase3.opensignal.utils.r;
import com.staircase3.opensignal.utils.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final cm.a f20921a;

    /* renamed from: b, reason: collision with root package name */
    public final f f20922b;

    /* renamed from: c, reason: collision with root package name */
    public final r f20923c;

    /* renamed from: d, reason: collision with root package name */
    public final o f20924d;

    public e(cm.a aVar, f fVar, r rVar, o oVar) {
        this.f20921a = aVar;
        this.f20922b = fVar;
        this.f20923c = rVar;
        this.f20924d = oVar;
    }

    public final void a(i.j jVar, int i10) {
        if (jVar == null) {
            return;
        }
        if (i10 == qk.h.rate) {
            try {
                String string = jVar.getString(qk.l.link_for_rating);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setData(Uri.parse(string));
                jVar.startActivity(intent);
                se.b.a0(jVar, jVar.getString(qk.l.hope_you_like_it));
                return;
            } catch (Exception unused) {
                se.b.a0(jVar, jVar.getString(qk.l.taking_you_to_problem));
                return;
            }
        }
        if (i10 == qk.h.contact) {
            b(jVar, d.IDEA);
            return;
        }
        if (i10 == qk.h.report) {
            b(jVar, d.BUGS);
        } else if (i10 == qk.h.settings_menu_item) {
            Intent intentY = SettingsActivity.y(jVar, this.f20921a.a(), false);
            intentY.addFlags(268435456);
            jVar.startActivity(intentY);
        }
    }

    public final void b(i.j jVar, d dVar) throws Resources.NotFoundException {
        Resources resources = jVar.getResources();
        d dVar2 = d.IDEA;
        String string = resources.getString(dVar == dVar2 ? qk.l.contact_mail : qk.l.bugs_mail);
        String string2 = resources.getString(dVar == dVar2 ? qk.l.idea : qk.l.ive_found_a_bug);
        boolean z10 = dVar == d.BUGS;
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", string, null));
            intent.putExtra("android.intent.extra.SUBJECT", string2);
            intent.putExtra("android.intent.extra.TEXT", u.c(jVar, this.f20922b, this.f20923c, this.f20924d, z10));
            jVar.startActivity(Intent.createChooser(intent, resources.getString(qk.l.email_us)));
        } catch (Exception unused) {
        }
    }
}
