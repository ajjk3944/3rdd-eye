package androidx.preference;

import A9.I;
import L0.S;
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
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import n1.h;
import n1.i;

/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes.dex */
public final class c extends RecyclerView.h<h> {

    /* renamed from: j, reason: collision with root package name */
    public final PreferenceGroup f16333j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f16334k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f16335l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f16336m;

    /* renamed from: o, reason: collision with root package name */
    public final a f16338o = new a();

    /* renamed from: n, reason: collision with root package name */
    public final Handler f16337n = new Handler(Looper.getMainLooper());

    /* compiled from: PreferenceGroupAdapter.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.i();
        }
    }

    /* compiled from: PreferenceGroupAdapter.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16340a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16341b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16342c;

        public b(Preference preference) {
            this.f16342c = preference.getClass().getName();
            this.f16340a = preference.f16239E;
            this.f16341b = preference.f16240F;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16340a == bVar.f16340a && this.f16341b == bVar.f16341b && TextUtils.equals(this.f16342c, bVar.f16342c);
        }

        public final int hashCode() {
            return this.f16342c.hashCode() + ((((527 + this.f16340a) * 31) + this.f16341b) * 31);
        }
    }

    public c(PreferenceGroup preferenceGroup) {
        this.f16333j = preferenceGroup;
        preferenceGroup.f16241G = this;
        this.f16334k = new ArrayList();
        this.f16335l = new ArrayList();
        this.f16336m = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).f16281T);
        } else {
            setHasStableIds(true);
        }
        i();
    }

    public final ArrayList e(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.f16275O.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Preference preferenceB = preferenceGroup.B(i10);
            if (preferenceB.f16268w) {
                int i11 = preferenceGroup.f16279S;
                if (i11 == Integer.MAX_VALUE || i < i11) {
                    arrayList.add(preferenceB);
                } else {
                    arrayList2.add(preferenceB);
                }
                if (preferenceB instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceB;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.f16279S != Integer.MAX_VALUE && preferenceGroup2.f16279S != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = e(preferenceGroup2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            int i12 = preferenceGroup.f16279S;
                            if (i12 == Integer.MAX_VALUE || i < i12) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        int i13 = preferenceGroup.f16279S;
        if (i13 != Integer.MAX_VALUE && i > i13) {
            long j4 = preferenceGroup.f16250d;
            n1.b bVar = new n1.b(preferenceGroup.f16248b);
            bVar.f16239E = R.layout.expand_button;
            Context context = bVar.f16248b;
            Drawable drawableW = I.w(context, R.drawable.ic_arrow_down_24dp);
            if (bVar.f16256k != drawableW) {
                bVar.f16256k = drawableW;
                bVar.f16255j = 0;
                bVar.h();
            }
            bVar.f16255j = R.drawable.ic_arrow_down_24dp;
            bVar.w(context.getString(R.string.expand_button_title));
            if (999 != bVar.f16253g) {
                bVar.f16253g = 999;
                c cVar = bVar.f16241G;
                if (cVar != null) {
                    Handler handler = cVar.f16337n;
                    a aVar = cVar.f16338o;
                    handler.removeCallbacks(aVar);
                    handler.post(aVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            CharSequence string = null;
            while (it2.hasNext()) {
                Preference preference2 = (Preference) it2.next();
                CharSequence charSequence = preference2.f16254h;
                boolean z10 = preference2 instanceof PreferenceGroup;
                if (z10 && !TextUtils.isEmpty(charSequence)) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
                if (arrayList3.contains(preference2.f16243I)) {
                    if (z10) {
                        arrayList3.add((PreferenceGroup) preference2);
                    }
                } else if (!TextUtils.isEmpty(charSequence)) {
                    string = string == null ? charSequence : context.getString(R.string.summary_collapsed_preference_list, string, charSequence);
                }
            }
            bVar.v(string);
            bVar.f44199N = j4 + 1000000;
            bVar.f16252f = new d(this, preferenceGroup);
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void f(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f16275O);
        }
        int size = preferenceGroup.f16275O.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceB = preferenceGroup.B(i);
            arrayList.add(preferenceB);
            b bVar = new b(preferenceB);
            if (!this.f16336m.contains(bVar)) {
                this.f16336m.add(bVar);
            }
            if (preferenceB instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceB;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    f(arrayList, preferenceGroup2);
                }
            }
            preferenceB.f16241G = this;
        }
    }

    public final Preference g(int i) {
        if (i < 0 || i >= this.f16335l.size()) {
            return null;
        }
        return (Preference) this.f16335l.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f16335l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i) {
        if (hasStableIds()) {
            return g(i).d();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        b bVar = new b(g(i));
        ArrayList arrayList = this.f16336m;
        int iIndexOf = arrayList.indexOf(bVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(bVar);
        return size;
    }

    public final void i() {
        Iterator it = this.f16334k.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).f16241G = null;
        }
        ArrayList arrayList = new ArrayList(this.f16334k.size());
        this.f16334k = arrayList;
        PreferenceGroup preferenceGroup = this.f16333j;
        f(arrayList, preferenceGroup);
        this.f16335l = e(preferenceGroup);
        notifyDataSetChanged();
        Iterator it2 = this.f16334k.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        ColorStateList colorStateList;
        h hVar = (h) f10;
        Preference preferenceG = g(i);
        Drawable background = hVar.itemView.getBackground();
        Drawable drawable = hVar.f44228l;
        if (background != drawable) {
            View view = hVar.itemView;
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) hVar.a(android.R.id.title);
        if (textView != null && (colorStateList = hVar.f44229m) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceG.l(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup viewGroup, int i) {
        b bVar = (b) this.f16336m.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, i.f44233a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = I.w(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(bVar.f16340a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap<View, S> weakHashMap = L0.I.f3792a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i10 = bVar.f16341b;
            if (i10 != 0) {
                layoutInflaterFrom.inflate(i10, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new h(viewInflate);
    }
}
