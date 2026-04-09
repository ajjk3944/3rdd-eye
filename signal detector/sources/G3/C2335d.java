package g3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.apm.insight.R;
import d3.AbstractC2266a;
import g.AbstractC2327a;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import x3.AbstractC2993B;

/* renamed from: g3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2335d {

    /* renamed from: a, reason: collision with root package name */
    public final C2334c f20210a;

    /* renamed from: b, reason: collision with root package name */
    public final C2334c f20211b = new C2334c();

    /* renamed from: c, reason: collision with root package name */
    public final float f20212c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20213d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20214e;

    /* renamed from: f, reason: collision with root package name */
    public final float f20215f;

    /* renamed from: g, reason: collision with root package name */
    public final float f20216g;

    /* renamed from: h, reason: collision with root package name */
    public final float f20217h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20218j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20219k;

    /* renamed from: l, reason: collision with root package name */
    public int f20220l;

    public C2335d(Context context, C2334c c2334c) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSet;
        int styleAttribute;
        Locale locale;
        int next;
        C2334c c2334c2 = c2334c == null ? new C2334c() : c2334c;
        int i = c2334c2.f20197a;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
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
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e6) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e6);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayI = AbstractC2993B.i(context, attributeSet, AbstractC2266a.f19749c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f20212c = typedArrayI.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f20218j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f20213d = typedArrayI.getDimensionPixelSize(15, -1);
        this.f20214e = typedArrayI.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.f20216g = typedArrayI.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f20215f = typedArrayI.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f20217h = typedArrayI.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f20219k = typedArrayI.getInt(25, 1);
        this.f20220l = typedArrayI.getInt(2, 0);
        C2334c c2334c3 = this.f20211b;
        int i3 = c2334c2.i;
        c2334c3.i = i3 == -2 ? 255 : i3;
        int i6 = c2334c2.f20206k;
        if (i6 != -2) {
            c2334c3.f20206k = i6;
        } else if (typedArrayI.hasValue(24)) {
            this.f20211b.f20206k = typedArrayI.getInt(24, 0);
        } else {
            this.f20211b.f20206k = -1;
        }
        String str = c2334c2.f20205j;
        if (str != null) {
            this.f20211b.f20205j = str;
        } else if (typedArrayI.hasValue(8)) {
            this.f20211b.f20205j = typedArrayI.getString(8);
        }
        C2334c c2334c4 = this.f20211b;
        c2334c4.f20181C = c2334c2.f20181C;
        CharSequence charSequence = c2334c2.f20182D;
        c2334c4.f20182D = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C2334c c2334c5 = this.f20211b;
        int i7 = c2334c2.f20183E;
        c2334c5.f20183E = i7 == 0 ? R.plurals.mtrl_badge_content_description : i7;
        int i8 = c2334c2.f20184F;
        c2334c5.f20184F = i8 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i8;
        Boolean bool = c2334c2.f20186H;
        c2334c5.f20186H = Boolean.valueOf(bool == null || bool.booleanValue());
        C2334c c2334c6 = this.f20211b;
        int i9 = c2334c2.f20207l;
        c2334c6.f20207l = i9 == -2 ? typedArrayI.getInt(22, -2) : i9;
        C2334c c2334c7 = this.f20211b;
        int i10 = c2334c2.f20208m;
        c2334c7.f20208m = i10 == -2 ? typedArrayI.getInt(23, -2) : i10;
        C2334c c2334c8 = this.f20211b;
        Integer num = c2334c2.f20201e;
        c2334c8.f20201e = Integer.valueOf(num == null ? typedArrayI.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        C2334c c2334c9 = this.f20211b;
        Integer num2 = c2334c2.f20202f;
        c2334c9.f20202f = Integer.valueOf(num2 == null ? typedArrayI.getResourceId(7, 0) : num2.intValue());
        C2334c c2334c10 = this.f20211b;
        Integer num3 = c2334c2.f20203g;
        c2334c10.f20203g = Integer.valueOf(num3 == null ? typedArrayI.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        C2334c c2334c11 = this.f20211b;
        Integer num4 = c2334c2.f20204h;
        c2334c11.f20204h = Integer.valueOf(num4 == null ? typedArrayI.getResourceId(17, 0) : num4.intValue());
        C2334c c2334c12 = this.f20211b;
        Integer num5 = c2334c2.f20198b;
        c2334c12.f20198b = Integer.valueOf(num5 == null ? com.bumptech.glide.c.n(context, typedArrayI, 1).getDefaultColor() : num5.intValue());
        C2334c c2334c13 = this.f20211b;
        Integer num6 = c2334c2.f20200d;
        c2334c13.f20200d = Integer.valueOf(num6 == null ? typedArrayI.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = c2334c2.f20199c;
        if (num7 != null) {
            this.f20211b.f20199c = num7;
        } else if (typedArrayI.hasValue(10)) {
            this.f20211b.f20199c = Integer.valueOf(com.bumptech.glide.c.n(context, typedArrayI, 10).getDefaultColor());
        } else {
            int iIntValue = this.f20211b.f20200d.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, AbstractC2327a.f20137y);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListN = com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 3);
            com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 4);
            com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i11, 0);
            typedArrayObtainStyledAttributes.getString(i11);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            com.bumptech.glide.c.n(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, AbstractC2266a.f19727E);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            if (Build.VERSION.SDK_INT >= 26) {
                typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f20211b.f20199c = Integer.valueOf(colorStateListN.getDefaultColor());
        }
        C2334c c2334c14 = this.f20211b;
        Integer num8 = c2334c2.f20185G;
        c2334c14.f20185G = Integer.valueOf(num8 == null ? typedArrayI.getInt(3, 8388661) : num8.intValue());
        C2334c c2334c15 = this.f20211b;
        Integer num9 = c2334c2.f20187I;
        c2334c15.f20187I = Integer.valueOf(num9 == null ? typedArrayI.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        C2334c c2334c16 = this.f20211b;
        Integer num10 = c2334c2.f20188J;
        c2334c16.f20188J = Integer.valueOf(num10 == null ? typedArrayI.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        C2334c c2334c17 = this.f20211b;
        Integer num11 = c2334c2.f20189K;
        c2334c17.f20189K = Integer.valueOf(num11 == null ? typedArrayI.getDimensionPixelOffset(19, 0) : num11.intValue());
        C2334c c2334c18 = this.f20211b;
        Integer num12 = c2334c2.f20190L;
        c2334c18.f20190L = Integer.valueOf(num12 == null ? typedArrayI.getDimensionPixelOffset(26, 0) : num12.intValue());
        C2334c c2334c19 = this.f20211b;
        Integer num13 = c2334c2.M;
        c2334c19.M = Integer.valueOf(num13 == null ? typedArrayI.getDimensionPixelOffset(20, c2334c19.f20189K.intValue()) : num13.intValue());
        C2334c c2334c20 = this.f20211b;
        Integer num14 = c2334c2.f20191N;
        c2334c20.f20191N = Integer.valueOf(num14 == null ? typedArrayI.getDimensionPixelOffset(27, c2334c20.f20190L.intValue()) : num14.intValue());
        C2334c c2334c21 = this.f20211b;
        Integer num15 = c2334c2.f20194Q;
        c2334c21.f20194Q = Integer.valueOf(num15 == null ? typedArrayI.getDimensionPixelOffset(21, 0) : num15.intValue());
        C2334c c2334c22 = this.f20211b;
        Integer num16 = c2334c2.f20192O;
        c2334c22.f20192O = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        C2334c c2334c23 = this.f20211b;
        Integer num17 = c2334c2.f20193P;
        c2334c23.f20193P = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        C2334c c2334c24 = this.f20211b;
        Boolean bool2 = c2334c2.f20195R;
        c2334c24.f20195R = Boolean.valueOf(bool2 == null ? typedArrayI.getBoolean(0, false) : bool2.booleanValue());
        typedArrayI.recycle();
        Locale locale2 = c2334c2.f20209n;
        if (locale2 == null) {
            C2334c c2334c25 = this.f20211b;
            if (Build.VERSION.SDK_INT >= 24) {
                Locale.Category unused = Locale.Category.FORMAT;
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            c2334c25.f20209n = locale;
        } else {
            this.f20211b.f20209n = locale2;
        }
        this.f20210a = c2334c2;
    }
}
