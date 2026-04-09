package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class em0 extends ao0 {
    public final PreferenceGroup i;
    public ArrayList j;
    public ArrayList k;
    public final ArrayList l;
    public final a9 n = new a9(12, this);
    public final Handler m = new Handler(Looper.getMainLooper());

    public em0(PreferenceGroup preferenceGroup) {
        this.i = preferenceGroup;
        preferenceGroup.L = this;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            f(((PreferenceScreen) preferenceGroup).Y);
        } else {
            f(true);
        }
        j();
    }

    @Override // defpackage.ao0
    public final int a() {
        return this.k.size();
    }

    @Override // defpackage.ao0
    public final long b(int i) {
        if (this.g) {
            return i(i).d();
        }
        return -1L;
    }

    @Override // defpackage.ao0
    public final int c(int i) {
        dm0 dm0Var = new dm0(i(i));
        ArrayList arrayList = this.l;
        int iIndexOf = arrayList.indexOf(dm0Var);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(dm0Var);
        return size;
    }

    @Override // defpackage.ao0
    public final void d(wo0 wo0Var, int i) {
        im0 im0Var = (im0) wo0Var;
        Preference preferenceI = i(i);
        ColorStateList colorStateList = im0Var.v;
        View view = im0Var.a;
        Drawable background = view.getBackground();
        Drawable drawable = im0Var.u;
        if (background != drawable) {
            WeakHashMap weakHashMap = e61.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) im0Var.q(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceI.l(im0Var);
    }

    @Override // defpackage.ao0
    public final wo0 e(ViewGroup viewGroup, int i) {
        dm0 dm0Var = (dm0) this.l.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, dn0.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = ob1.h(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(dm0Var.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = e61.a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = dm0Var.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new im0(viewInflate);
    }

    public final ArrayList g(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.T.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Preference preferenceZ = preferenceGroup.z(i3);
            if (preferenceZ.B) {
                int i4 = preferenceGroup.X;
                if (i4 == Integer.MAX_VALUE || i2 < i4) {
                    arrayList.add(preferenceZ);
                } else {
                    arrayList2.add(preferenceZ);
                }
                if (preferenceZ instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceZ;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.X != Integer.MAX_VALUE && preferenceGroup2.X != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        ArrayList arrayListG = g(preferenceGroup2);
                        int size2 = arrayListG.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = arrayListG.get(i5);
                            i5++;
                            Preference preference = (Preference) obj;
                            int i6 = preferenceGroup.X;
                            if (i6 == Integer.MAX_VALUE || i2 < i6) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        int i7 = preferenceGroup.X;
        if (i7 != Integer.MAX_VALUE && i2 > i7) {
            Context context = preferenceGroup.f;
            long j = preferenceGroup.h;
            CharSequence string = null;
            kt ktVar = new kt(context, null);
            ktVar.J = com.phuongpn.whousemywifi.networkscanner.R.layout.expand_button;
            Context context2 = ktVar.f;
            Drawable drawableH = ob1.h(context2, com.phuongpn.whousemywifi.networkscanner.R.drawable.ic_arrow_down_24dp);
            if (ktVar.p != drawableH) {
                ktVar.p = drawableH;
                ktVar.o = 0;
                ktVar.h();
            }
            ktVar.o = com.phuongpn.whousemywifi.networkscanner.R.drawable.ic_arrow_down_24dp;
            String string2 = context2.getString(com.phuongpn.whousemywifi.networkscanner.R.string.expand_button_title);
            if (!TextUtils.equals(string2, ktVar.m)) {
                ktVar.m = string2;
                ktVar.h();
            }
            if (999 != ktVar.l) {
                ktVar.l = 999;
                em0 em0Var = ktVar.L;
                if (em0Var != null) {
                    Handler handler = em0Var.m;
                    a9 a9Var = em0Var.n;
                    handler.removeCallbacks(a9Var);
                    handler.post(a9Var);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList2.size();
            while (i < size3) {
                Object obj2 = arrayList2.get(i);
                i++;
                Preference preference2 = (Preference) obj2;
                CharSequence charSequence = preference2.m;
                boolean z = preference2 instanceof PreferenceGroup;
                if (z && !TextUtils.isEmpty(charSequence)) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
                if (arrayList3.contains(preference2.N)) {
                    if (z) {
                        arrayList3.add((PreferenceGroup) preference2);
                    }
                } else if (!TextUtils.isEmpty(charSequence)) {
                    string = string == null ? charSequence : context2.getString(com.phuongpn.whousemywifi.networkscanner.R.string.summary_collapsed_preference_list, string, charSequence);
                }
            }
            ktVar.v(string);
            ktVar.S = j + 1000000;
            ktVar.k = new vq2((Object) this, (Object) preferenceGroup, 12, false);
            arrayList.add(ktVar);
        }
        return arrayList;
    }

    public final void h(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.T);
        }
        int size = preferenceGroup.T.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceZ = preferenceGroup.z(i);
            arrayList.add(preferenceZ);
            dm0 dm0Var = new dm0(preferenceZ);
            if (!this.l.contains(dm0Var)) {
                this.l.add(dm0Var);
            }
            if (preferenceZ instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceZ;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    h(arrayList, preferenceGroup2);
                }
            }
            preferenceZ.L = this;
        }
    }

    public final Preference i(int i) {
        if (i < 0 || i >= this.k.size()) {
            return null;
        }
        return (Preference) this.k.get(i);
    }

    public final void j() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Preference) obj).L = null;
        }
        ArrayList arrayList2 = new ArrayList(this.j.size());
        this.j = arrayList2;
        PreferenceGroup preferenceGroup = this.i;
        h(arrayList2, preferenceGroup);
        this.k = g(preferenceGroup);
        this.f.b();
        ArrayList arrayList3 = this.j;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((Preference) obj2).getClass();
        }
    }
}
