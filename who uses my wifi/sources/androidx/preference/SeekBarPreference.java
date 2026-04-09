package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.dn0;
import defpackage.im0;
import defpackage.ut0;
import defpackage.vt0;
import defpackage.wt0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public SeekBar X;
    public TextView Y;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public final ut0 c0;
    public final vt0 d0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.c0 = new ut0(this);
        this.d0 = new vt0(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dn0.k, R.attr.seekBarPreferenceStyle, 0);
        this.T = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.T;
        i = i < i2 ? i2 : i;
        if (i != this.U) {
            this.U = i;
            h();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.V) {
            this.V = Math.min(this.U - this.T, Math.abs(i3));
            h();
        }
        this.Z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.a0 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.b0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void l(im0 im0Var) {
        super.l(im0Var);
        im0Var.a.setOnKeyListener(this.d0);
        this.X = (SeekBar) im0Var.q(R.id.seekbar);
        TextView textView = (TextView) im0Var.q(R.id.seekbar_value);
        this.Y = textView;
        if (this.a0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.Y = null;
        }
        SeekBar seekBar = this.X;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.c0);
        this.X.setMax(this.U - this.T);
        int i = this.V;
        if (i != 0) {
            this.X.setKeyProgressIncrement(i);
        } else {
            this.V = this.X.getKeyProgressIncrement();
        }
        this.X.setProgress(this.S - this.T);
        int i2 = this.S;
        TextView textView2 = this.Y;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.X.setEnabled(g());
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(wt0.class)) {
            super.p(parcelable);
            return;
        }
        wt0 wt0Var = (wt0) parcelable;
        super.p(wt0Var.getSuperState());
        this.S = wt0Var.f;
        this.T = wt0Var.g;
        this.U = wt0Var.h;
        h();
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.w) {
            return absSavedState;
        }
        wt0 wt0Var = new wt0();
        wt0Var.f = this.S;
        wt0Var.g = this.T;
        wt0Var.h = this.U;
        return wt0Var;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (x()) {
            iIntValue = this.g.c().getInt(this.q, iIntValue);
        }
        y(iIntValue, true);
    }

    public final void y(int i, boolean z) {
        int i2 = this.T;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.U;
        if (i > i3) {
            i = i3;
        }
        if (i != this.S) {
            this.S = i;
            TextView textView = this.Y;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (x()) {
                int i4 = ~i;
                boolean zX = x();
                String str = this.q;
                if (zX) {
                    i4 = this.g.c().getInt(str, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor editorB = this.g.b();
                    editorB.putInt(str, i);
                    if (!this.g.e) {
                        editorB.apply();
                    }
                }
            }
            if (z) {
                h();
            }
        }
    }
}
