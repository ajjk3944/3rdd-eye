package com.liuzh.deviceinfo.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.y;
import com.liuzh.deviceinfo.view.SettingsItemView;
import dj.b;
import je.u;
import ki.j;
import ki.k;
import ki.l;
import zf.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class SettingsItemView extends ConstraintLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f21349v = 0;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f21350q;

    /* renamed from: r, reason: collision with root package name */
    public final TextView f21351r;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f21352s;

    /* renamed from: t, reason: collision with root package name */
    public final int f21353t;

    /* renamed from: u, reason: collision with root package name */
    public l f21354u;

    public SettingsItemView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        final SettingsItemView settingsItemView;
        super(context, attributeSet, 0);
        View.inflate(getContext(), R.layout.settings_item_view, this);
        this.f21352s = (ImageView) findViewById(R.id.icon);
        this.f21350q = (TextView) findViewById(R.id.title);
        this.f21351r = (TextView) findViewById(R.id.summary);
        int iP = d.p(12.0f, getResources().getDisplayMetrics());
        setPadding(iP, iP, iP, iP);
        setMinHeight(d.p(48.0f, getResources().getDisplayMetrics()));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f38278f);
        String string = typedArrayObtainStyledAttributes.getString(7);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f21352s.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
        this.f21350q.setText(string);
        if (TextUtils.isEmpty(string2)) {
            this.f21351r.setVisibility(8);
        } else {
            this.f21351r.setText(string2);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.widget);
        int i4 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i4 != 0) {
            if (i4 == 1) {
                View.inflate(getContext(), R.layout.siv_widget_switch, frameLayout);
                SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.siv_switch);
                if (!isInEditMode()) {
                    f fVar = f.f21256b;
                    b.p(switchCompat, f.a());
                }
                String string3 = typedArrayObtainStyledAttributes.getString(3);
                if (!typedArrayObtainStyledAttributes.hasValue(5)) {
                    throw new IllegalArgumentException(u.t("SwitchWidget type need siv_sp_default_val for key = ", string3));
                }
                boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, false);
                switchCompat.setChecked(isInEditMode() ? z3 : f.f21257c.getBoolean(string3, z3));
                switchCompat.setOnCheckedChangeListener(new j(this, switchCompat, string3, 0));
                setOnClickListener(new ki.h(switchCompat, 0));
            } else if (i4 == 2) {
                final String string4 = typedArrayObtainStyledAttributes.getString(3);
                if (!typedArrayObtainStyledAttributes.hasValue(4)) {
                    throw new IllegalArgumentException(u.t("SwitchWidget type need siv_sp_default_val for key = ", string4));
                }
                final int i10 = typedArrayObtainStyledAttributes.getInt(4, 0);
                final CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(1);
                final int[] intArray = getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, 0));
                if (isInEditMode()) {
                    i = 0;
                    this.f21351r.setVisibility(0);
                    this.f21351r.setText(textArray[i]);
                    settingsItemView = this;
                    setOnClickListener(new View.OnClickListener() { // from class: ki.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final int[] iArr;
                            int i11 = SettingsItemView.f21349v;
                            SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
                            final String str = string4;
                            int i12 = sharedPreferences.getInt(str, i10);
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                iArr = intArray;
                                if (i14 >= iArr.length) {
                                    break;
                                }
                                if (iArr[i14] == i12) {
                                    i13 = i14;
                                    break;
                                }
                                i14++;
                            }
                            final SettingsItemView settingsItemView2 = this.f28314a;
                            t7.m mVar = new t7.m(settingsItemView2.getContext());
                            CharSequence text = settingsItemView2.f21350q.getText();
                            i.b bVar = (i.b) mVar.f34474c;
                            bVar.f25233d = text;
                            final CharSequence[] charSequenceArr = textArray;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ki.i
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i15) {
                                    int i16 = SettingsItemView.f21349v;
                                    com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                                    com.liuzh.deviceinfo.utilities.f.l(iArr[i15], str);
                                    settingsItemView2.f21351r.setText(charSequenceArr[i15]);
                                    dialogInterface.dismiss();
                                }
                            };
                            bVar.f25244q = charSequenceArr;
                            bVar.f25246s = onClickListener;
                            bVar.f25250w = i13;
                            bVar.f25249v = true;
                            mVar.A();
                        }
                    });
                } else {
                    int i11 = f.f21257c.getInt(string4, i10);
                    int i12 = 0;
                    while (i12 < intArray.length) {
                        if (intArray[i12] == i11) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i12 = 0;
                    this.f21351r.setVisibility(0);
                    this.f21351r.setText(textArray[i12]);
                    settingsItemView = this;
                    setOnClickListener(new View.OnClickListener() { // from class: ki.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final int[] iArr;
                            int i112 = SettingsItemView.f21349v;
                            SharedPreferences sharedPreferences = com.liuzh.deviceinfo.utilities.f.f21257c;
                            final String str = string4;
                            int i122 = sharedPreferences.getInt(str, i10);
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                iArr = intArray;
                                if (i14 >= iArr.length) {
                                    break;
                                }
                                if (iArr[i14] == i122) {
                                    i13 = i14;
                                    break;
                                }
                                i14++;
                            }
                            final SettingsItemView settingsItemView2 = this.f28314a;
                            t7.m mVar = new t7.m(settingsItemView2.getContext());
                            CharSequence text = settingsItemView2.f21350q.getText();
                            i.b bVar = (i.b) mVar.f34474c;
                            bVar.f25233d = text;
                            final CharSequence[] charSequenceArr = textArray;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ki.i
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i15) {
                                    int i16 = SettingsItemView.f21349v;
                                    com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                                    com.liuzh.deviceinfo.utilities.f.l(iArr[i15], str);
                                    settingsItemView2.f21351r.setText(charSequenceArr[i15]);
                                    dialogInterface.dismiss();
                                }
                            };
                            bVar.f25244q = charSequenceArr;
                            bVar.f25246s = onClickListener;
                            bVar.f25250w = i13;
                            bVar.f25249v = true;
                            mVar.A();
                        }
                    });
                }
            }
            settingsItemView = this;
        } else {
            settingsItemView = this;
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(8, 0);
            if (resourceId > 0) {
                View.inflate(getContext(), resourceId, frameLayout);
            } else {
                frameLayout.setVisibility(8);
            }
        }
        settingsItemView.f21353t = i4;
        typedArrayObtainStyledAttributes.recycle();
        if (!isInEditMode() && d.k()) {
            y.j(1.02f, settingsItemView);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (this.f21353t == 1) {
            throw new IllegalStateException("switchWidget type can't set clickListener");
        }
        super.setOnClickListener(onClickListener);
    }

    public void setSwitch(boolean z3) throws Resources.NotFoundException {
        if (this.f21353t != 1) {
            throw new UnsupportedOperationException("type not switch");
        }
        ((SwitchCompat) findViewById(R.id.siv_switch)).setChecked(z3);
    }

    public void setSwitchListener(l lVar) {
        if (this.f21353t != 1) {
            throw new UnsupportedOperationException("type not switch");
        }
        this.f21354u = lVar;
    }

    public void setSelectListener(k kVar) {
    }
}
