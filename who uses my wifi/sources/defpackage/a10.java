package defpackage;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.CheckBox;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class a10 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a10(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                fa0 fa0Var = (fa0) ((c10) obj3).k;
                View view2 = ((b10) obj2).a;
                i30.l(view2, "itemView");
                fa0Var.f(view2, (d10) obj);
                break;
            case 1:
                ((fa0) ((c10) obj3).k).f(((b10) obj2).A, (d10) obj);
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj2;
                Dialog dialog = (Dialog) obj;
                int[] iArr = MainActivity.d0;
                if (((CheckBox) obj3).isChecked()) {
                    SharedPreferences.Editor editorEdit = mainActivity.C().edit();
                    editorEdit.putBoolean("ratedialog", false);
                    editorEdit.apply();
                    editorEdit.apply();
                }
                dialog.dismiss();
                break;
        }
    }
}
