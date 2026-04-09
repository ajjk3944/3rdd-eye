package hd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.material.badge.BadgeState$State;
import ed.d;
import ed.i;
import ed.j;
import ed.l;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import xd.k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final BadgeState$State f10626a;

    /* renamed from: b, reason: collision with root package name */
    public final BadgeState$State f10627b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10628c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10629d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10630e;

    /* renamed from: f, reason: collision with root package name */
    public final float f10631f;

    /* renamed from: g, reason: collision with root package name */
    public final float f10632g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10633h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10634i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public int f10635l;

    public b(Context context, BadgeState$State badgeState$State) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        int i10 = a.K;
        int i11 = a.J;
        this.f10627b = new BadgeState$State();
        badgeState$State = badgeState$State == null ? new BadgeState$State() : badgeState$State;
        int i12 = badgeState$State.f5469a;
        if (i12 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i12);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e4) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i12));
                notFoundException.initCause(e4);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = k.d(context, attributeSetAsAttributeSet, l.Badge, i10, styleAttribute == 0 ? i11 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f10628c = typedArrayD.getDimensionPixelSize(l.Badge_badgeRadius, -1);
        this.f10634i = context.getResources().getDimensionPixelSize(d.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(d.mtrl_badge_text_horizontal_edge_offset);
        this.f10629d = typedArrayD.getDimensionPixelSize(l.Badge_badgeWithTextRadius, -1);
        this.f10630e = typedArrayD.getDimension(l.Badge_badgeWidth, resources.getDimension(d.m3_badge_size));
        this.f10632g = typedArrayD.getDimension(l.Badge_badgeWithTextWidth, resources.getDimension(d.m3_badge_with_text_size));
        this.f10631f = typedArrayD.getDimension(l.Badge_badgeHeight, resources.getDimension(d.m3_badge_size));
        this.f10633h = typedArrayD.getDimension(l.Badge_badgeWithTextHeight, resources.getDimension(d.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(l.Badge_offsetAlignmentMode, 1);
        this.f10635l = typedArrayD.getInt(l.Badge_badgeFixedEdge, 0);
        BadgeState$State badgeState$State2 = this.f10627b;
        int i13 = badgeState$State.E;
        badgeState$State2.E = i13 == -2 ? 255 : i13;
        int i14 = badgeState$State.G;
        if (i14 != -2) {
            badgeState$State2.G = i14;
        } else if (typedArrayD.hasValue(l.Badge_number)) {
            this.f10627b.G = typedArrayD.getInt(l.Badge_number, 0);
        } else {
            this.f10627b.G = -1;
        }
        String str = badgeState$State.F;
        if (str != null) {
            this.f10627b.F = str;
        } else if (typedArrayD.hasValue(l.Badge_badgeText)) {
            this.f10627b.F = typedArrayD.getString(l.Badge_badgeText);
        }
        BadgeState$State badgeState$State3 = this.f10627b;
        badgeState$State3.K = badgeState$State.K;
        CharSequence charSequence = badgeState$State.L;
        badgeState$State3.L = charSequence == null ? context.getString(j.mtrl_badge_numberless_content_description) : charSequence;
        BadgeState$State badgeState$State4 = this.f10627b;
        int i15 = badgeState$State.M;
        badgeState$State4.M = i15 == 0 ? i.mtrl_badge_content_description : i15;
        int i16 = badgeState$State.N;
        badgeState$State4.N = i16 == 0 ? j.mtrl_exceed_max_badge_number_content_description : i16;
        Boolean bool = badgeState$State.P;
        badgeState$State4.P = Boolean.valueOf(bool == null || bool.booleanValue());
        BadgeState$State badgeState$State5 = this.f10627b;
        int i17 = badgeState$State.H;
        badgeState$State5.H = i17 == -2 ? typedArrayD.getInt(l.Badge_maxCharacterCount, -2) : i17;
        BadgeState$State badgeState$State6 = this.f10627b;
        int i18 = badgeState$State.I;
        badgeState$State6.I = i18 == -2 ? typedArrayD.getInt(l.Badge_maxNumber, -2) : i18;
        BadgeState$State badgeState$State7 = this.f10627b;
        Integer num = badgeState$State.f5474x;
        badgeState$State7.f5474x = Integer.valueOf(num == null ? typedArrayD.getResourceId(l.Badge_badgeShapeAppearance, ed.k.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        BadgeState$State badgeState$State8 = this.f10627b;
        Integer num2 = badgeState$State.f5475y;
        badgeState$State8.f5475y = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(l.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        BadgeState$State badgeState$State9 = this.f10627b;
        Integer num3 = badgeState$State.B;
        badgeState$State9.B = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(l.Badge_badgeWithTextShapeAppearance, ed.k.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        BadgeState$State badgeState$State10 = this.f10627b;
        Integer num4 = badgeState$State.D;
        badgeState$State10.D = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(l.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        BadgeState$State badgeState$State11 = this.f10627b;
        Integer num5 = badgeState$State.f5471d;
        badgeState$State11.f5471d = Integer.valueOf(num5 == null ? xu.l.q(context, typedArrayD, l.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        BadgeState$State badgeState$State12 = this.f10627b;
        Integer num6 = badgeState$State.f5473r;
        badgeState$State12.f5473r = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(l.Badge_badgeTextAppearance, ed.k.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = badgeState$State.f5472g;
        if (num7 != null) {
            this.f10627b.f5472g = num7;
        } else if (typedArrayD.hasValue(l.Badge_badgeTextColor)) {
            this.f10627b.f5472g = Integer.valueOf(xu.l.q(context, typedArrayD, l.Badge_badgeTextColor).getDefaultColor());
        } else {
            int iIntValue = this.f10627b.f5473r.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, h.j.TextAppearance);
            typedArrayObtainStyledAttributes.getDimension(h.j.TextAppearance_android_textSize, 0.0f);
            ColorStateList colorStateListQ = xu.l.q(context, typedArrayObtainStyledAttributes, h.j.TextAppearance_android_textColor);
            xu.l.q(context, typedArrayObtainStyledAttributes, h.j.TextAppearance_android_textColorHint);
            xu.l.q(context, typedArrayObtainStyledAttributes, h.j.TextAppearance_android_textColorLink);
            typedArrayObtainStyledAttributes.getInt(h.j.TextAppearance_android_textStyle, 0);
            typedArrayObtainStyledAttributes.getInt(h.j.TextAppearance_android_typeface, 1);
            int i19 = h.j.TextAppearance_fontFamily;
            i19 = typedArrayObtainStyledAttributes.hasValue(i19) ? i19 : h.j.TextAppearance_android_fontFamily;
            typedArrayObtainStyledAttributes.getResourceId(i19, 0);
            typedArrayObtainStyledAttributes.getString(i19);
            typedArrayObtainStyledAttributes.getBoolean(h.j.TextAppearance_textAllCaps, false);
            xu.l.q(context, typedArrayObtainStyledAttributes, h.j.TextAppearance_android_shadowColor);
            typedArrayObtainStyledAttributes.getFloat(h.j.TextAppearance_android_shadowDx, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(h.j.TextAppearance_android_shadowDy, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(h.j.TextAppearance_android_shadowRadius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, l.MaterialTextAppearance);
            typedArrayObtainStyledAttributes2.hasValue(l.MaterialTextAppearance_android_letterSpacing);
            typedArrayObtainStyledAttributes2.getFloat(l.MaterialTextAppearance_android_letterSpacing, 0.0f);
            if (Build.VERSION.SDK_INT >= 26) {
                int i20 = l.MaterialTextAppearance_fontVariationSettings;
                typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i20) ? i20 : l.MaterialTextAppearance_android_fontVariationSettings);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f10627b.f5472g = Integer.valueOf(colorStateListQ.getDefaultColor());
        }
        BadgeState$State badgeState$State13 = this.f10627b;
        Integer num8 = badgeState$State.O;
        badgeState$State13.O = Integer.valueOf(num8 == null ? typedArrayD.getInt(l.Badge_badgeGravity, 8388661) : num8.intValue());
        BadgeState$State badgeState$State14 = this.f10627b;
        Integer num9 = badgeState$State.Q;
        badgeState$State14.Q = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(l.Badge_badgeWidePadding, resources.getDimensionPixelSize(d.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        BadgeState$State badgeState$State15 = this.f10627b;
        Integer num10 = badgeState$State.R;
        badgeState$State15.R = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(l.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(d.m3_badge_with_text_vertical_padding)) : num10.intValue());
        BadgeState$State badgeState$State16 = this.f10627b;
        Integer num11 = badgeState$State.S;
        badgeState$State16.S = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(l.Badge_horizontalOffset, 0) : num11.intValue());
        BadgeState$State badgeState$State17 = this.f10627b;
        Integer num12 = badgeState$State.T;
        badgeState$State17.T = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(l.Badge_verticalOffset, 0) : num12.intValue());
        BadgeState$State badgeState$State18 = this.f10627b;
        Integer num13 = badgeState$State.U;
        badgeState$State18.U = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(l.Badge_horizontalOffsetWithText, badgeState$State18.S.intValue()) : num13.intValue());
        BadgeState$State badgeState$State19 = this.f10627b;
        Integer num14 = badgeState$State.V;
        badgeState$State19.V = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(l.Badge_verticalOffsetWithText, badgeState$State19.T.intValue()) : num14.intValue());
        BadgeState$State badgeState$State20 = this.f10627b;
        Integer num15 = badgeState$State.Y;
        badgeState$State20.Y = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(l.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        BadgeState$State badgeState$State21 = this.f10627b;
        Integer num16 = badgeState$State.W;
        badgeState$State21.W = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        BadgeState$State badgeState$State22 = this.f10627b;
        Integer num17 = badgeState$State.X;
        badgeState$State22.X = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        BadgeState$State badgeState$State23 = this.f10627b;
        Boolean bool2 = badgeState$State.Z;
        badgeState$State23.Z = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(l.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = badgeState$State.J;
        if (locale == null) {
            this.f10627b.J = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f10627b.J = locale;
        }
        this.f10626a = badgeState$State;
    }
}
