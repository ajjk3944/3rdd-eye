package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.h;
import n1.i;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: N, reason: collision with root package name */
    public int f16282N;

    /* renamed from: O, reason: collision with root package name */
    public int f16283O;

    /* renamed from: P, reason: collision with root package name */
    public int f16284P;

    /* renamed from: Q, reason: collision with root package name */
    public int f16285Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f16286R;

    /* renamed from: S, reason: collision with root package name */
    public SeekBar f16287S;

    /* renamed from: T, reason: collision with root package name */
    public TextView f16288T;

    /* renamed from: U, reason: collision with root package name */
    public final boolean f16289U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f16290V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f16291W;

    /* renamed from: X, reason: collision with root package name */
    public final a f16292X;

    /* renamed from: Y, reason: collision with root package name */
    public final b f16293Y;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z10) {
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (!z10 || (!seekBarPreference.f16291W && seekBarPreference.f16286R)) {
                int i10 = i + seekBarPreference.f16283O;
                TextView textView = seekBarPreference.f16288T;
                if (textView != null) {
                    textView.setText(String.valueOf(i10));
                    return;
                }
                return;
            }
            int progress = seekBar.getProgress() + seekBarPreference.f16283O;
            if (progress != seekBarPreference.f16282N) {
                seekBarPreference.A(progress, false);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f16286R = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            int progress;
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            seekBarPreference.f16286R = false;
            int progress2 = seekBar.getProgress();
            int i = seekBarPreference.f16283O;
            if (progress2 + i == seekBarPreference.f16282N || (progress = seekBar.getProgress() + i) == seekBarPreference.f16282N) {
                return;
            }
            seekBarPreference.A(progress, false);
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f16289U && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f16287S;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.f16292X = new a();
        this.f16293Y = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f44242k, R.attr.seekBarPreferenceStyle, 0);
        this.f16283O = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i10 = this.f16283O;
        i = i < i10 ? i10 : i;
        if (i != this.f16284P) {
            this.f16284P = i;
            h();
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i11 != this.f16285Q) {
            this.f16285Q = Math.min(this.f16284P - this.f16283O, Math.abs(i11));
            h();
        }
        this.f16289U = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f16290V = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f16291W = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void A(int i, boolean z10) {
        int i10 = this.f16283O;
        if (i < i10) {
            i = i10;
        }
        int i11 = this.f16284P;
        if (i > i11) {
            i = i11;
        }
        if (i != this.f16282N) {
            this.f16282N = i;
            TextView textView = this.f16288T;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (z()) {
                int i12 = ~i;
                if (z()) {
                    i12 = this.f16249c.c().getInt(this.f16257l, i12);
                }
                if (i != i12) {
                    SharedPreferences.Editor editorA = this.f16249c.a();
                    editorA.putInt(this.f16257l, i);
                    if (!this.f16249c.f44219e) {
                        editorA.apply();
                    }
                }
            }
            if (z10) {
                h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void l(h hVar) {
        super.l(hVar);
        hVar.itemView.setOnKeyListener(this.f16293Y);
        this.f16287S = (SeekBar) hVar.a(R.id.seekbar);
        TextView textView = (TextView) hVar.a(R.id.seekbar_value);
        this.f16288T = textView;
        if (this.f16290V) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f16288T = null;
        }
        SeekBar seekBar = this.f16287S;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f16292X);
        this.f16287S.setMax(this.f16284P - this.f16283O);
        int i = this.f16285Q;
        if (i != 0) {
            this.f16287S.setKeyProgressIncrement(i);
        } else {
            this.f16285Q = this.f16287S.getKeyProgressIncrement();
        }
        this.f16287S.setProgress(this.f16282N - this.f16283O);
        int i10 = this.f16282N;
        TextView textView2 = this.f16288T;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i10));
        }
        this.f16287S.setEnabled(g());
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.p(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.p(cVar.getSuperState());
        this.f16282N = cVar.f16296b;
        this.f16283O = cVar.f16297c;
        this.f16284P = cVar.f16298d;
        h();
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f16263r) {
            return absSavedState;
        }
        c cVar = new c();
        cVar.f16296b = this.f16282N;
        cVar.f16297c = this.f16283O;
        cVar.f16298d = this.f16284P;
        return cVar;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (z()) {
            iIntValue = this.f16249c.c().getInt(this.f16257l, iIntValue);
        }
        A(iIntValue, true);
    }

    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f16296b;

        /* renamed from: c, reason: collision with root package name */
        public int f16297c;

        /* renamed from: d, reason: collision with root package name */
        public int f16298d;

        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f16296b = parcel.readInt();
            this.f16297c = parcel.readInt();
            this.f16298d = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16296b);
            parcel.writeInt(this.f16297c);
            parcel.writeInt(this.f16298d);
        }

        public c() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }
}
