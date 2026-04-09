package i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f11045a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11046b;

    public f(Context context) {
        this(context, g.e(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public g create() {
        b bVar = this.f11045a;
        g gVar = new g(bVar.f10990a, this.f11046b);
        View view = bVar.f10994e;
        e eVar = gVar.f11050y;
        if (view != null) {
            eVar.f11042x = view;
        } else {
            CharSequence charSequence = bVar.f10993d;
            if (charSequence != null) {
                eVar.f11024d = charSequence;
                TextView textView = eVar.f11040v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f10992c;
            if (drawable != null) {
                eVar.f11038t = drawable;
                ImageView imageView = eVar.f11039u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f11039u.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f10995f;
        if (charSequence2 != null) {
            eVar.f11025e = charSequence2;
            TextView textView2 = eVar.f11041w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = bVar.f10996g;
        if (charSequence3 != null) {
            eVar.c(-1, charSequence3, bVar.f10997h);
        }
        CharSequence charSequence4 = bVar.f10998i;
        if (charSequence4 != null) {
            eVar.c(-2, charSequence4, bVar.j);
        }
        if (bVar.f11000m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f10991b.inflate(eVar.B, (ViewGroup) null);
            int i10 = bVar.f11004q ? eVar.C : eVar.D;
            Object obj = bVar.f11000m;
            ?? dVar = obj;
            if (obj == null) {
                dVar = new d(bVar.f10990a, i10, R.id.text1, null);
            }
            eVar.f11043y = dVar;
            eVar.f11044z = bVar.f11005r;
            if (bVar.f11001n != null) {
                alertController$RecycleListView.setOnItemClickListener(new a(bVar, eVar));
            }
            if (bVar.f11004q) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f11026f = alertController$RecycleListView;
        }
        View view2 = bVar.f11003p;
        if (view2 != null) {
            eVar.f11027g = view2;
            eVar.f11028h = 0;
            eVar.f11029i = false;
        } else {
            int i11 = bVar.f11002o;
            if (i11 != 0) {
                eVar.f11027g = null;
                eVar.f11028h = i11;
                eVar.f11029i = false;
            }
        }
        gVar.setCancelable(bVar.k);
        if (bVar.k) {
            gVar.setCanceledOnTouchOutside(true);
        }
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        o.n nVar = bVar.f10999l;
        if (nVar != null) {
            gVar.setOnKeyListener(nVar);
        }
        return gVar;
    }

    public Context getContext() {
        return this.f11045a.f10990a;
    }

    public f setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        b bVar = this.f11045a;
        bVar.f10998i = bVar.f10990a.getText(i10);
        bVar.j = onClickListener;
        return this;
    }

    public f setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        b bVar = this.f11045a;
        bVar.f10996g = bVar.f10990a.getText(i10);
        bVar.f10997h = onClickListener;
        return this;
    }

    public f setTitle(CharSequence charSequence) {
        this.f11045a.f10993d = charSequence;
        return this;
    }

    public f setView(View view) {
        b bVar = this.f11045a;
        bVar.f11003p = view;
        bVar.f11002o = 0;
        return this;
    }

    public f(Context context, int i10) {
        this.f11045a = new b(new ContextThemeWrapper(context, g.e(context, i10)));
        this.f11046b = i10;
    }
}
