package androidx.preference;

import A9.I;
import L0.S;
import N7.B8;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.C1765s;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import androidx.preference.b;
import androidx.preference.c;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n1.f;
import n1.h;
import n1.i;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f16235A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16236B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f16237C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f16238D;

    /* renamed from: E, reason: collision with root package name */
    public int f16239E;

    /* renamed from: F, reason: collision with root package name */
    public final int f16240F;

    /* renamed from: G, reason: collision with root package name */
    public androidx.preference.c f16241G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f16242H;

    /* renamed from: I, reason: collision with root package name */
    public PreferenceGroup f16243I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f16244J;

    /* renamed from: K, reason: collision with root package name */
    public d f16245K;

    /* renamed from: L, reason: collision with root package name */
    public e f16246L;

    /* renamed from: M, reason: collision with root package name */
    public final a f16247M;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16248b;

    /* renamed from: c, reason: collision with root package name */
    public f f16249c;

    /* renamed from: d, reason: collision with root package name */
    public long f16250d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16251e;

    /* renamed from: f, reason: collision with root package name */
    public c f16252f;

    /* renamed from: g, reason: collision with root package name */
    public int f16253g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f16254h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public int f16255j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f16256k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16257l;

    /* renamed from: m, reason: collision with root package name */
    public Intent f16258m;

    /* renamed from: n, reason: collision with root package name */
    public final String f16259n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f16260o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16261p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16262q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f16263r;

    /* renamed from: s, reason: collision with root package name */
    public final String f16264s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f16265t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16266u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16267v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16268w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16269x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16270y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f16271z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Preference.this.s(view);
        }
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }
    }

    public interface c {
        boolean e(Preference preference);
    }

    public static class d implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final Preference f16273b;

        public d(Preference preference) {
            this.f16273b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            Preference preference = this.f16273b;
            CharSequence charSequenceF = preference.f();
            if (!preference.f16237C || TextUtils.isEmpty(charSequenceF)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceF);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Preference preference = this.f16273b;
            ClipboardManager clipboardManager = (ClipboardManager) preference.f16248b.getSystemService("clipboard");
            CharSequence charSequenceF = preference.f();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceF));
            Context context = preference.f16248b;
            Toast.makeText(context, context.getString(R.string.preference_copied, charSequenceF), 0).show();
            return true;
        }
    }

    public interface e<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f16253g = Integer.MAX_VALUE;
        this.f16261p = true;
        this.f16262q = true;
        this.f16263r = true;
        this.f16266u = true;
        this.f16267v = true;
        this.f16268w = true;
        this.f16269x = true;
        this.f16270y = true;
        this.f16235A = true;
        this.f16238D = true;
        this.f16239E = R.layout.preference;
        this.f16247M = new a();
        this.f16248b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f44239g, i, i10);
        this.f16255j = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.f16257l = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.f16254h = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.i = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f16253g = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.f16259n = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f16239E = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f16240F = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.f16261p = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.f16262q = z10;
        this.f16263r = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.f16264s = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.f16269x = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z10));
        this.f16270y = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z10));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.f16265t = o(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.f16265t = o(typedArrayObtainStyledAttributes, 11);
        }
        this.f16238D = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f16271z = zHasValue;
        if (zHasValue) {
            this.f16235A = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f16236B = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.f16268w = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f16237C = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    public boolean a(String str) {
        return true;
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.f16257l) || (parcelable = bundle.getParcelable(this.f16257l)) == null) {
            return;
        }
        this.f16244J = false;
        p(parcelable);
        if (!this.f16244J) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void c(Bundle bundle) {
        if (TextUtils.isEmpty(this.f16257l)) {
            return;
        }
        this.f16244J = false;
        Parcelable parcelableQ = q();
        if (!this.f16244J) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableQ != null) {
            bundle.putParcelable(this.f16257l, parcelableQ);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.f16253g;
        int i10 = preference2.f16253g;
        if (i != i10) {
            return i - i10;
        }
        CharSequence charSequence = this.f16254h;
        CharSequence charSequence2 = preference2.f16254h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f16254h.toString());
    }

    public long d() {
        return this.f16250d;
    }

    public final String e(String str) {
        return !z() ? str : this.f16249c.c().getString(this.f16257l, str);
    }

    public CharSequence f() {
        e eVar = this.f16246L;
        return eVar != null ? eVar.a(this) : this.i;
    }

    public boolean g() {
        return this.f16261p && this.f16266u && this.f16267v;
    }

    public void h() {
        int iIndexOf;
        androidx.preference.c cVar = this.f16241G;
        if (cVar == null || (iIndexOf = cVar.f16335l.indexOf(this)) == -1) {
            return;
        }
        cVar.notifyItemChanged(iIndexOf, this);
    }

    public void i(boolean z10) {
        ArrayList arrayList = this.f16242H;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.f16266u == z10) {
                preference.f16266u = !z10;
                preference.i(preference.y());
                preference.h();
            }
        }
    }

    public void j() {
        PreferenceScreen preferenceScreen;
        String str = this.f16264s;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f fVar = this.f16249c;
        Preference preferenceA = null;
        if (fVar != null && (preferenceScreen = fVar.f44221g) != null) {
            preferenceA = preferenceScreen.A(str);
        }
        if (preferenceA == null) {
            StringBuilder sbK = B8.k("Dependency \"", str, "\" not found for preference \"");
            sbK.append(this.f16257l);
            sbK.append("\" (title: \"");
            sbK.append((Object) this.f16254h);
            sbK.append("\"");
            throw new IllegalStateException(sbK.toString());
        }
        if (preferenceA.f16242H == null) {
            preferenceA.f16242H = new ArrayList();
        }
        preferenceA.f16242H.add(this);
        boolean zY = preferenceA.y();
        if (this.f16266u == zY) {
            this.f16266u = !zY;
            i(y());
            h();
        }
    }

    public final void k(f fVar) {
        this.f16249c = fVar;
        if (!this.f16251e) {
            this.f16250d = fVar.b();
        }
        if (z()) {
            f fVar2 = this.f16249c;
            if ((fVar2 != null ? fVar2.c() : null).contains(this.f16257l)) {
                r(null);
                return;
            }
        }
        Object obj = this.f16265t;
        if (obj != null) {
            r(obj);
        }
    }

    public void l(h hVar) {
        Integer numValueOf;
        View view = hVar.itemView;
        view.setOnClickListener(this.f16247M);
        view.setId(0);
        TextView textView = (TextView) hVar.a(android.R.id.summary);
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
        TextView textView2 = (TextView) hVar.a(android.R.id.title);
        boolean z10 = this.f16262q;
        if (textView2 != null) {
            CharSequence charSequence = this.f16254h;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f16271z) {
                    textView2.setSingleLine(this.f16235A);
                }
                if (!z10 && g() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) hVar.a(android.R.id.icon);
        if (imageView != null) {
            int i = this.f16255j;
            if (i != 0 || this.f16256k != null) {
                if (this.f16256k == null) {
                    this.f16256k = I.w(this.f16248b, i);
                }
                Drawable drawable = this.f16256k;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f16256k != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f16236B ? 4 : 8);
            }
        }
        View viewA = hVar.a(R.id.icon_frame);
        if (viewA == null) {
            viewA = hVar.a(android.R.id.icon_frame);
        }
        if (viewA != null) {
            if (this.f16256k != null) {
                viewA.setVisibility(0);
            } else {
                viewA.setVisibility(this.f16236B ? 4 : 8);
            }
        }
        if (this.f16238D) {
            u(view, g());
        } else {
            u(view, true);
        }
        view.setFocusable(z10);
        view.setClickable(z10);
        hVar.f44231o = this.f16269x;
        hVar.f44232p = this.f16270y;
        boolean z11 = this.f16237C;
        if (z11 && this.f16245K == null) {
            this.f16245K = new d(this);
        }
        view.setOnCreateContextMenuListener(z11 ? this.f16245K : null);
        view.setLongClickable(z11);
        if (!z11 || z10) {
            return;
        }
        WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
        view.setBackground(null);
    }

    public void n() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f16264s;
        if (str != null) {
            f fVar = this.f16249c;
            Preference preferenceA = null;
            if (fVar != null && (preferenceScreen = fVar.f44221g) != null) {
                preferenceA = preferenceScreen.A(str);
            }
            if (preferenceA == null || (arrayList = preferenceA.f16242H) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object o(TypedArray typedArray, int i) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.f16244J = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable q() {
        this.f16244J = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void s(View view) {
        ComponentCallbacksC1759l componentCallbacksC1759l;
        String str;
        if (g() && this.f16262q) {
            m();
            c cVar = this.f16252f;
            if (cVar == null || !cVar.e(this)) {
                f fVar = this.f16249c;
                if (fVar == null || (componentCallbacksC1759l = fVar.f44222h) == null || (str = this.f16259n) == null) {
                    Intent intent = this.f16258m;
                    if (intent != null) {
                        this.f16248b.startActivity(intent);
                        return;
                    }
                    return;
                }
                boolean zA = false;
                for (ComponentCallbacksC1759l parentFragment = componentCallbacksC1759l; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                    if (parentFragment instanceof b.e) {
                        zA = ((b.e) parentFragment).a();
                    }
                }
                if (!zA && (componentCallbacksC1759l.getContext() instanceof b.e)) {
                    zA = ((b.e) componentCallbacksC1759l.getContext()).a();
                }
                if (!zA && (componentCallbacksC1759l.getActivity() instanceof b.e)) {
                    zA = ((b.e) componentCallbacksC1759l.getActivity()).a();
                }
                if (zA) {
                    return;
                }
                Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                x parentFragmentManager = componentCallbacksC1759l.getParentFragmentManager();
                if (this.f16260o == null) {
                    this.f16260o = new Bundle();
                }
                Bundle bundle = this.f16260o;
                C1765s c1765sD = parentFragmentManager.D();
                componentCallbacksC1759l.requireActivity().getClassLoader();
                ComponentCallbacksC1759l componentCallbacksC1759lA = c1765sD.a(str);
                componentCallbacksC1759lA.setArguments(bundle);
                componentCallbacksC1759lA.setTargetFragment(componentCallbacksC1759l, 0);
                C1748a c1748a = new C1748a(parentFragmentManager);
                c1748a.d(componentCallbacksC1759lA, ((View) componentCallbacksC1759l.requireView().getParent()).getId());
                if (!c1748a.f15791h) {
                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                }
                c1748a.f15790g = true;
                c1748a.i = null;
                c1748a.g(false);
            }
        }
    }

    public final void t(String str) {
        if (z() && !TextUtils.equals(str, e(null))) {
            SharedPreferences.Editor editorA = this.f16249c.a();
            editorA.putString(this.f16257l, str);
            if (this.f16249c.f44219e) {
                return;
            }
            editorA.apply();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f16254h;
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

    public final void v(CharSequence charSequence) {
        if (this.f16246L != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.i, charSequence)) {
            return;
        }
        this.i = charSequence;
        h();
    }

    public final void w(String str) {
        if (TextUtils.equals(str, this.f16254h)) {
            return;
        }
        this.f16254h = str;
        h();
    }

    public final void x(boolean z10) {
        if (this.f16268w != z10) {
            this.f16268w = z10;
            androidx.preference.c cVar = this.f16241G;
            if (cVar != null) {
                Handler handler = cVar.f16337n;
                c.a aVar = cVar.f16338o;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
            }
        }
    }

    public boolean y() {
        return !g();
    }

    public final boolean z() {
        return (this.f16249c == null || !this.f16263r || TextUtils.isEmpty(this.f16257l)) ? false : true;
    }

    public void m() {
    }

    public void r(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, B0.i.a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
