package sl;

import am.b;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import br.l;
import i.f;
import i.g;
import o4.p;
import qk.h;
import qk.i;

/* loaded from: classes.dex */
public final class a extends p {
    public final String M0;
    public final String N0;
    public final int O0;

    public a(String str, int i10, String str2) {
        l.e(str, "title");
        this.M0 = str;
        this.N0 = str2;
        this.O0 = i10;
    }

    @Override // o4.p
    public final Dialog h0() {
        View viewInflate = LayoutInflater.from(X()).inflate(i.information_fragment_dialog, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(h.informationDescriptionTextView)).setText(this.N0);
        ((TextView) viewInflate.findViewById(h.informationTitleTextView)).setText(this.M0);
        ((ImageView) viewInflate.findViewById(h.closeImageView)).setOnClickListener(new b(23, this));
        ImageView imageView = (ImageView) viewInflate.findViewById(h.informationIconImageView);
        int i10 = this.O0;
        if (i10 != -1) {
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        f fVar = new f(X());
        fVar.setView(viewInflate);
        g gVarCreate = fVar.create();
        l.d(gVarCreate, "create(...)");
        Window window = gVarCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return gVarCreate;
    }
}
