package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.bm0;
import defpackage.dn0;
import defpackage.e61;
import defpackage.em0;
import defpackage.g9;
import defpackage.gi2;
import defpackage.gm0;
import defpackage.i30;
import defpackage.im0;
import defpackage.iw;
import defpackage.m1;
import defpackage.ob1;
import defpackage.sw;
import defpackage.u5;
import defpackage.ul0;
import defpackage.vl0;
import defpackage.wl0;
import defpackage.xw;
import defpackage.yo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public int J;
    public final int K;
    public em0 L;
    public ArrayList M;
    public PreferenceGroup N;
    public boolean O;
    public vl0 P;
    public wl0 Q;
    public final m1 R;
    public final Context f;
    public gm0 g;
    public long h;
    public boolean i;
    public yo j;
    public ul0 k;
    public int l;
    public CharSequence m;
    public CharSequence n;
    public int o;
    public Drawable p;
    public final String q;
    public Intent r;
    public final String s;
    public Bundle t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final Object y;
    public boolean z;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.l = Integer.MAX_VALUE;
        this.u = true;
        this.v = true;
        this.w = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.F = true;
        this.I = true;
        this.J = R.layout.preference;
        this.R = new m1(4, this);
        this.f = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.g, i, 0);
        this.o = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.q = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.m = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.n = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.l = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.s = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.J = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.K = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.u = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.v = z;
        this.w = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.x = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.C = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.D = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.y = o(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.y = o(typedArrayObtainStyledAttributes, 11);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.E = zHasValue;
        if (zHasValue) {
            this.F = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.G = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.B = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.H = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void a(Serializable serializable) {
        if (this.j != null) {
            i30.k(serializable, "null cannot be cast to non-null type kotlin.String");
            String str = (String) serializable;
            if (str.equals("light")) {
                u5.k(1);
                return;
            }
            if (str.equals("dark")) {
                u5.k(2);
                return;
            }
            try {
                u5.k(-1);
            } catch (Exception unused) {
                if (Build.VERSION.SDK_INT >= 28) {
                    u5.k(-1);
                } else {
                    u5.k(3);
                }
            }
        }
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        String str = this.q;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.O = false;
        p(parcelable);
        if (!this.O) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void c(Bundle bundle) {
        String str = this.q;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.O = false;
        Parcelable parcelableQ = q();
        if (!this.O) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableQ != null) {
            bundle.putParcelable(str, parcelableQ);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.l;
        int i2 = preference2.l;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.m;
        CharSequence charSequence2 = preference2.m;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.m.toString());
    }

    public long d() {
        return this.h;
    }

    public final String e(String str) {
        return !x() ? str : this.g.c().getString(this.q, str);
    }

    public CharSequence f() {
        wl0 wl0Var = this.Q;
        return wl0Var != null ? wl0Var.h(this) : this.n;
    }

    public boolean g() {
        return this.u && this.z && this.A;
    }

    public void h() {
        int iIndexOf;
        em0 em0Var = this.L;
        if (em0Var == null || (iIndexOf = em0Var.k.indexOf(this)) == -1) {
            return;
        }
        em0Var.f.c(iIndexOf, 1, this);
    }

    public void i(boolean z) {
        ArrayList arrayList = this.M;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.z == z) {
                preference.z = !z;
                preference.i(preference.w());
                preference.h();
            }
        }
    }

    public void j() {
        PreferenceScreen preferenceScreen;
        String str = this.x;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gm0 gm0Var = this.g;
        Preference preferenceY = null;
        if (gm0Var != null && (preferenceScreen = gm0Var.g) != null) {
            preferenceY = preferenceScreen.y(str);
        }
        if (preferenceY == null) {
            throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.q + "\" (title: \"" + ((Object) this.m) + "\"");
        }
        if (preferenceY.M == null) {
            preferenceY.M = new ArrayList();
        }
        preferenceY.M.add(this);
        boolean zW = preferenceY.w();
        if (this.z == zW) {
            this.z = !zW;
            i(w());
            h();
        }
    }

    public final void k(gm0 gm0Var) {
        long j;
        this.g = gm0Var;
        if (!this.i) {
            synchronized (gm0Var) {
                j = gm0Var.b;
                gm0Var.b = 1 + j;
            }
            this.h = j;
        }
        if (x()) {
            gm0 gm0Var2 = this.g;
            if ((gm0Var2 != null ? gm0Var2.c() : null).contains(this.q)) {
                r(null);
                return;
            }
        }
        Object obj = this.y;
        if (obj != null) {
            r(obj);
        }
    }

    public void l(im0 im0Var) {
        Integer numValueOf;
        View view = im0Var.a;
        view.setOnClickListener(this.R);
        view.setId(0);
        TextView textView = (TextView) im0Var.q(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceF = f();
            if (TextUtils.isEmpty(charSequenceF)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceF);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) im0Var.q(android.R.id.title);
        boolean z = this.v;
        if (textView2 != null) {
            CharSequence charSequence = this.m;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.E) {
                    textView2.setSingleLine(this.F);
                }
                if (!z && g() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) im0Var.q(android.R.id.icon);
        boolean z2 = this.G;
        if (imageView != null) {
            int i = this.o;
            if (i != 0 || this.p != null) {
                if (this.p == null) {
                    this.p = ob1.h(this.f, i);
                }
                Drawable drawable = this.p;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.p != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z2 ? 4 : 8);
            }
        }
        View viewQ = im0Var.q(R.id.icon_frame);
        if (viewQ == null) {
            viewQ = im0Var.q(android.R.id.icon_frame);
        }
        if (viewQ != null) {
            if (this.p != null) {
                viewQ.setVisibility(0);
            } else {
                viewQ.setVisibility(z2 ? 4 : 8);
            }
        }
        if (this.I) {
            u(view, g());
        } else {
            u(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        im0Var.x = this.C;
        im0Var.y = this.D;
        boolean z3 = this.H;
        if (z3 && this.P == null) {
            this.P = new vl0(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.P : null);
        view.setLongClickable(z3);
        if (!z3 || z) {
            return;
        }
        WeakHashMap weakHashMap = e61.a;
        view.setBackground(null);
    }

    public void n() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.x;
        if (str != null) {
            gm0 gm0Var = this.g;
            Preference preferenceY = null;
            if (gm0Var != null && (preferenceScreen = gm0Var.g) != null) {
                preferenceY = preferenceScreen.y(str);
            }
            if (preferenceY == null || (arrayList = preferenceY.M) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object o(TypedArray typedArray, int i) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.O = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable q() {
        this.O = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void s(View view) {
        bm0 bm0Var;
        String str;
        if (g() && this.v) {
            m();
            ul0 ul0Var = this.k;
            if (ul0Var != null) {
                ul0Var.b(this);
                return;
            }
            gm0 gm0Var = this.g;
            if (gm0Var == null || (bm0Var = gm0Var.h) == null || (str = this.s) == null) {
                Intent intent = this.r;
                if (intent != null) {
                    this.f.startActivity(intent);
                    return;
                }
                return;
            }
            for (iw iwVar = bm0Var; iwVar != null; iwVar = iwVar.z) {
            }
            xw xwVarK = bm0Var.k();
            if (this.t == null) {
                this.t = new Bundle();
            }
            Bundle bundle = this.t;
            sw swVarD = xwVarK.D();
            bm0Var.F().getClassLoader();
            iw iwVarA = swVarD.a(str);
            iwVarA.K(bundle);
            iwVarA.L(bm0Var);
            g9 g9Var = new g9(xwVarK);
            int id = ((View) bm0Var.H().getParent()).getId();
            if (id == 0) {
                throw new IllegalArgumentException("Must use non-zero containerViewId");
            }
            g9Var.e(id, iwVarA, null, 2);
            if (!g9Var.h) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            g9Var.g = true;
            g9Var.i = null;
            g9Var.d(false);
        }
    }

    public final void t(String str) {
        if (x() && !TextUtils.equals(str, e(null))) {
            SharedPreferences.Editor editorB = this.g.b();
            editorB.putString(this.q, str);
            if (this.g.e) {
                return;
            }
            editorB.apply();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.m;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceF = f();
        if (!TextUtils.isEmpty(charSequenceF)) {
            sb.append(charSequenceF);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void v(CharSequence charSequence) {
        if (this.Q != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.n, charSequence)) {
            return;
        }
        this.n = charSequence;
        h();
    }

    public boolean w() {
        return !g();
    }

    public final boolean x() {
        return (this.g == null || !this.w || TextUtils.isEmpty(this.q)) ? false : true;
    }

    public void m() {
    }

    public void r(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gi2.l(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
