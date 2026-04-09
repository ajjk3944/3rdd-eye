package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.a0;
import d5.c;
import d5.e;
import j4.d;
import j4.i;
import j4.j;
import j4.k;
import j4.l;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class BadgeState {

    /* renamed from: a, reason: collision with root package name */
    public final State f9845a;

    /* renamed from: b, reason: collision with root package name */
    public final State f9846b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9847c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9848d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9849e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9850f;

    /* renamed from: g, reason: collision with root package name */
    public final float f9851g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9852h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9853i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9854j;

    /* renamed from: k, reason: collision with root package name */
    public int f9855k;

    /* renamed from: l, reason: collision with root package name */
    public int f9856l;

    public BadgeState(Context context, int i10, int i11, int i12, State state) throws XmlPullParserException, Resources.NotFoundException, IOException {
        State state2 = new State();
        this.f9846b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f9857a = i10;
        }
        TypedArray typedArrayA = a(context, state.f9857a, i11, i12);
        Resources resources = context.getResources();
        this.f9847c = typedArrayA.getDimensionPixelSize(l.Badge_badgeRadius, -1);
        this.f9853i = context.getResources().getDimensionPixelSize(d.mtrl_badge_horizontal_edge_offset);
        this.f9854j = context.getResources().getDimensionPixelSize(d.mtrl_badge_text_horizontal_edge_offset);
        this.f9848d = typedArrayA.getDimensionPixelSize(l.Badge_badgeWithTextRadius, -1);
        int i13 = l.Badge_badgeWidth;
        int i14 = d.m3_badge_size;
        this.f9849e = typedArrayA.getDimension(i13, resources.getDimension(i14));
        int i15 = l.Badge_badgeWithTextWidth;
        int i16 = d.m3_badge_with_text_size;
        this.f9851g = typedArrayA.getDimension(i15, resources.getDimension(i16));
        this.f9850f = typedArrayA.getDimension(l.Badge_badgeHeight, resources.getDimension(i14));
        this.f9852h = typedArrayA.getDimension(l.Badge_badgeWithTextHeight, resources.getDimension(i16));
        boolean z10 = true;
        this.f9855k = typedArrayA.getInt(l.Badge_offsetAlignmentMode, 1);
        this.f9856l = typedArrayA.getInt(l.Badge_badgeFixedEdge, 0);
        state2.f9865i = state.f9865i == -2 ? 255 : state.f9865i;
        if (state.f9867k != -2) {
            state2.f9867k = state.f9867k;
        } else {
            int i17 = l.Badge_number;
            if (typedArrayA.hasValue(i17)) {
                state2.f9867k = typedArrayA.getInt(i17, 0);
            } else {
                state2.f9867k = -1;
            }
        }
        if (state.f9866j != null) {
            state2.f9866j = state.f9866j;
        } else {
            int i18 = l.Badge_badgeText;
            if (typedArrayA.hasValue(i18)) {
                state2.f9866j = typedArrayA.getString(i18);
            }
        }
        state2.f9871o = state.f9871o;
        state2.f9872p = state.f9872p == null ? context.getString(j.mtrl_badge_numberless_content_description) : state.f9872p;
        state2.f9873q = state.f9873q == 0 ? i.mtrl_badge_content_description : state.f9873q;
        state2.f9874r = state.f9874r == 0 ? j.mtrl_exceed_max_badge_number_content_description : state.f9874r;
        if (state.f9876t != null && !state.f9876t.booleanValue()) {
            z10 = false;
        }
        state2.f9876t = Boolean.valueOf(z10);
        state2.f9868l = state.f9868l == -2 ? typedArrayA.getInt(l.Badge_maxCharacterCount, -2) : state.f9868l;
        state2.f9869m = state.f9869m == -2 ? typedArrayA.getInt(l.Badge_maxNumber, -2) : state.f9869m;
        state2.f9861e = Integer.valueOf(state.f9861e == null ? typedArrayA.getResourceId(l.Badge_badgeShapeAppearance, k.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f9861e.intValue());
        state2.f9862f = Integer.valueOf(state.f9862f == null ? typedArrayA.getResourceId(l.Badge_badgeShapeAppearanceOverlay, 0) : state.f9862f.intValue());
        state2.f9863g = Integer.valueOf(state.f9863g == null ? typedArrayA.getResourceId(l.Badge_badgeWithTextShapeAppearance, k.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f9863g.intValue());
        state2.f9864h = Integer.valueOf(state.f9864h == null ? typedArrayA.getResourceId(l.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state.f9864h.intValue());
        state2.f9858b = Integer.valueOf(state.f9858b == null ? G(context, typedArrayA, l.Badge_backgroundColor) : state.f9858b.intValue());
        state2.f9860d = Integer.valueOf(state.f9860d == null ? typedArrayA.getResourceId(l.Badge_badgeTextAppearance, k.TextAppearance_MaterialComponents_Badge) : state.f9860d.intValue());
        if (state.f9859c != null) {
            state2.f9859c = state.f9859c;
        } else {
            int i19 = l.Badge_badgeTextColor;
            if (typedArrayA.hasValue(i19)) {
                state2.f9859c = Integer.valueOf(G(context, typedArrayA, i19));
            } else {
                state2.f9859c = Integer.valueOf(new e(context, state2.f9860d.intValue()).j().getDefaultColor());
            }
        }
        state2.f9875s = Integer.valueOf(state.f9875s == null ? typedArrayA.getInt(l.Badge_badgeGravity, 8388661) : state.f9875s.intValue());
        state2.f9877u = Integer.valueOf(state.f9877u == null ? typedArrayA.getDimensionPixelSize(l.Badge_badgeWidePadding, resources.getDimensionPixelSize(d.mtrl_badge_long_text_horizontal_padding)) : state.f9877u.intValue());
        state2.f9878v = Integer.valueOf(state.f9878v == null ? typedArrayA.getDimensionPixelSize(l.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(d.m3_badge_with_text_vertical_padding)) : state.f9878v.intValue());
        state2.f9879w = Integer.valueOf(state.f9879w == null ? typedArrayA.getDimensionPixelOffset(l.Badge_horizontalOffset, 0) : state.f9879w.intValue());
        state2.f9880x = Integer.valueOf(state.f9880x == null ? typedArrayA.getDimensionPixelOffset(l.Badge_verticalOffset, 0) : state.f9880x.intValue());
        state2.f9881y = Integer.valueOf(state.f9881y == null ? typedArrayA.getDimensionPixelOffset(l.Badge_horizontalOffsetWithText, state2.f9879w.intValue()) : state.f9881y.intValue());
        state2.f9882z = Integer.valueOf(state.f9882z == null ? typedArrayA.getDimensionPixelOffset(l.Badge_verticalOffsetWithText, state2.f9880x.intValue()) : state.f9882z.intValue());
        state2.C = Integer.valueOf(state.C == null ? typedArrayA.getDimensionPixelOffset(l.Badge_largeFontVerticalOffsetAdjustment, 0) : state.C.intValue());
        state2.A = Integer.valueOf(state.A == null ? 0 : state.A.intValue());
        state2.B = Integer.valueOf(state.B == null ? 0 : state.B.intValue());
        state2.D = Boolean.valueOf(state.D == null ? typedArrayA.getBoolean(l.Badge_autoAdjustToWithinGrandparentBounds, false) : state.D.booleanValue());
        typedArrayA.recycle();
        if (state.f9870n == null) {
            state2.f9870n = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            state2.f9870n = state.f9870n;
        }
        this.f9845a = state;
    }

    public static int G(Context context, TypedArray typedArray, int i10) {
        return c.a(context, typedArray, i10).getDefaultColor();
    }

    public int A() {
        return this.f9846b.f9882z.intValue();
    }

    public int B() {
        return this.f9846b.f9880x.intValue();
    }

    public boolean C() {
        return this.f9846b.f9867k != -1;
    }

    public boolean D() {
        return this.f9846b.f9866j != null;
    }

    public boolean E() {
        return this.f9846b.D.booleanValue();
    }

    public boolean F() {
        return this.f9846b.f9876t.booleanValue();
    }

    public void H(int i10) {
        this.f9845a.f9865i = i10;
        this.f9846b.f9865i = i10;
    }

    public final TypedArray a(Context context, int i10, int i11, int i12) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = w4.d.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return a0.i(context, attributeSetI, l.Badge, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    public int b() {
        return this.f9846b.A.intValue();
    }

    public int c() {
        return this.f9846b.B.intValue();
    }

    public int d() {
        return this.f9846b.f9865i;
    }

    public int e() {
        return this.f9846b.f9858b.intValue();
    }

    public int f() {
        return this.f9846b.f9875s.intValue();
    }

    public int g() {
        return this.f9846b.f9877u.intValue();
    }

    public int h() {
        return this.f9846b.f9862f.intValue();
    }

    public int i() {
        return this.f9846b.f9861e.intValue();
    }

    public int j() {
        return this.f9846b.f9859c.intValue();
    }

    public int k() {
        return this.f9846b.f9878v.intValue();
    }

    public int l() {
        return this.f9846b.f9864h.intValue();
    }

    public int m() {
        return this.f9846b.f9863g.intValue();
    }

    public int n() {
        return this.f9846b.f9874r;
    }

    public CharSequence o() {
        return this.f9846b.f9871o;
    }

    public CharSequence p() {
        return this.f9846b.f9872p;
    }

    public int q() {
        return this.f9846b.f9873q;
    }

    public int r() {
        return this.f9846b.f9881y.intValue();
    }

    public int s() {
        return this.f9846b.f9879w.intValue();
    }

    public int t() {
        return this.f9846b.C.intValue();
    }

    public int u() {
        return this.f9846b.f9868l;
    }

    public int v() {
        return this.f9846b.f9869m;
    }

    public int w() {
        return this.f9846b.f9867k;
    }

    public Locale x() {
        return this.f9846b.f9870n;
    }

    public String y() {
        return this.f9846b.f9866j;
    }

    public int z() {
        return this.f9846b.f9860d.intValue();
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public Integer A;
        public Integer B;
        public Integer C;
        public Boolean D;
        public Integer E;

        /* renamed from: a, reason: collision with root package name */
        public int f9857a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f9858b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f9859c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f9860d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f9861e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f9862f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f9863g;

        /* renamed from: h, reason: collision with root package name */
        public Integer f9864h;

        /* renamed from: i, reason: collision with root package name */
        public int f9865i;

        /* renamed from: j, reason: collision with root package name */
        public String f9866j;

        /* renamed from: k, reason: collision with root package name */
        public int f9867k;

        /* renamed from: l, reason: collision with root package name */
        public int f9868l;

        /* renamed from: m, reason: collision with root package name */
        public int f9869m;

        /* renamed from: n, reason: collision with root package name */
        public Locale f9870n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f9871o;

        /* renamed from: p, reason: collision with root package name */
        public CharSequence f9872p;

        /* renamed from: q, reason: collision with root package name */
        public int f9873q;

        /* renamed from: r, reason: collision with root package name */
        public int f9874r;

        /* renamed from: s, reason: collision with root package name */
        public Integer f9875s;

        /* renamed from: t, reason: collision with root package name */
        public Boolean f9876t;

        /* renamed from: u, reason: collision with root package name */
        public Integer f9877u;

        /* renamed from: v, reason: collision with root package name */
        public Integer f9878v;

        /* renamed from: w, reason: collision with root package name */
        public Integer f9879w;

        /* renamed from: x, reason: collision with root package name */
        public Integer f9880x;

        /* renamed from: y, reason: collision with root package name */
        public Integer f9881y;

        /* renamed from: z, reason: collision with root package name */
        public Integer f9882z;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f9865i = 255;
            this.f9867k = -2;
            this.f9868l = -2;
            this.f9869m = -2;
            this.f9876t = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f9857a);
            parcel.writeSerializable(this.f9858b);
            parcel.writeSerializable(this.f9859c);
            parcel.writeSerializable(this.f9860d);
            parcel.writeSerializable(this.f9861e);
            parcel.writeSerializable(this.f9862f);
            parcel.writeSerializable(this.f9863g);
            parcel.writeSerializable(this.f9864h);
            parcel.writeInt(this.f9865i);
            parcel.writeString(this.f9866j);
            parcel.writeInt(this.f9867k);
            parcel.writeInt(this.f9868l);
            parcel.writeInt(this.f9869m);
            CharSequence charSequence = this.f9871o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f9872p;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f9873q);
            parcel.writeSerializable(this.f9875s);
            parcel.writeSerializable(this.f9877u);
            parcel.writeSerializable(this.f9878v);
            parcel.writeSerializable(this.f9879w);
            parcel.writeSerializable(this.f9880x);
            parcel.writeSerializable(this.f9881y);
            parcel.writeSerializable(this.f9882z);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.f9876t);
            parcel.writeSerializable(this.f9870n);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
        }

        public State(Parcel parcel) {
            this.f9865i = 255;
            this.f9867k = -2;
            this.f9868l = -2;
            this.f9869m = -2;
            this.f9876t = Boolean.TRUE;
            this.f9857a = parcel.readInt();
            this.f9858b = (Integer) parcel.readSerializable();
            this.f9859c = (Integer) parcel.readSerializable();
            this.f9860d = (Integer) parcel.readSerializable();
            this.f9861e = (Integer) parcel.readSerializable();
            this.f9862f = (Integer) parcel.readSerializable();
            this.f9863g = (Integer) parcel.readSerializable();
            this.f9864h = (Integer) parcel.readSerializable();
            this.f9865i = parcel.readInt();
            this.f9866j = parcel.readString();
            this.f9867k = parcel.readInt();
            this.f9868l = parcel.readInt();
            this.f9869m = parcel.readInt();
            this.f9871o = parcel.readString();
            this.f9872p = parcel.readString();
            this.f9873q = parcel.readInt();
            this.f9875s = (Integer) parcel.readSerializable();
            this.f9877u = (Integer) parcel.readSerializable();
            this.f9878v = (Integer) parcel.readSerializable();
            this.f9879w = (Integer) parcel.readSerializable();
            this.f9880x = (Integer) parcel.readSerializable();
            this.f9881y = (Integer) parcel.readSerializable();
            this.f9882z = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.A = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.f9876t = (Boolean) parcel.readSerializable();
            this.f9870n = (Locale) parcel.readSerializable();
            this.D = (Boolean) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
        }
    }
}
