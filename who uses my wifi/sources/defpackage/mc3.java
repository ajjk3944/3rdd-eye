package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mc3 {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ArrayList a = new ArrayList();

    public final void a(View view, ac3 ac3Var) {
        lc3 lc3Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lc3Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            lc3Var = (lc3) obj;
            if (lc3Var.a.get() == view) {
                break;
            }
        }
        if (lc3Var == null) {
            arrayList.add(new lc3(view, ac3Var));
        }
    }
}
