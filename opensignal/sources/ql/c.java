package ql;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import br.l;
import com.staircase3.opensignal.utils.u;
import java.util.regex.Pattern;
import kc.f;
import kotlin.Metadata;
import lq.j;
import lq.q;
import o4.p;
import qk.h;
import qk.i;
import qk.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lql/c;", "Lo4/p;", "<init>", "()V", "ql/a", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends p {
    public final Object M0;
    public final Object N0;
    public final Object O0;
    public a P0;

    public c() {
        j jVar = j.SYNCHRONIZED;
        this.M0 = f.E(jVar, new b(this, 0));
        this.N0 = f.E(jVar, new b(this, 1));
        this.O0 = f.E(jVar, new b(this, 2));
    }

    @Override // o4.p, androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        i0(m.DialogTheme_Fullscreen);
        this.C0 = false;
        Dialog dialog = this.H0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.b
    public final View F(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.e(layoutInflater, "inflater");
        super.F(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(i.onboarding_gdpr, viewGroup);
        l.b(viewInflate);
        f.j(viewInflate);
        View viewFindViewById = viewInflate.findViewById(h.close_button);
        l.b(viewFindViewById);
        viewFindViewById.setVisibility(8);
        TextView textView = (TextView) viewInflate.findViewById(h.gdpr_content_textview);
        String strR = r(qk.l.gdpr_content);
        l.d(strR, "getString(...)");
        String strReplaceAll = Pattern.compile("<a href=\"internal:com.staircase3.opensignal.activities.SettingsActivity\">").matcher(strR).replaceAll("");
        q qVar = u.f6195a;
        Spanned spannedFromHtml = Html.fromHtml(strReplaceAll, 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannedFromHtml);
        TextView textView2 = (TextView) viewInflate.findViewById(h.privacy_policy_textview);
        Spanned spannedFromHtml2 = Html.fromHtml(r(qk.l.gdpr_privacy_policy_text), 0);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(spannedFromHtml2);
        ((Button) viewInflate.findViewById(h.agree_button)).setOnClickListener(new am.b(21, this));
        return viewInflate;
    }
}
