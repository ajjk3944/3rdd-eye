package lc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.liuzh.deviceinfo.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f28687a;

    /* renamed from: b, reason: collision with root package name */
    public final b f28688b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final float f28689c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28690d;

    /* renamed from: e, reason: collision with root package name */
    public final float f28691e;

    /* renamed from: f, reason: collision with root package name */
    public final float f28692f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f28693h;

    /* renamed from: i, reason: collision with root package name */
    public final int f28694i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f28695k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28696l;

    public c(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        b bVar = new b();
        int i4 = bVar.f28663a;
        if (i4 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i4);
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
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i4));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayG = m.g(context, attributeSet, ic.a.f25944c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f28689c = typedArrayG.getDimensionPixelSize(5, -1);
        this.f28694i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f28690d = typedArrayG.getDimensionPixelSize(15, -1);
        this.f28691e = typedArrayG.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayG.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f28692f = typedArrayG.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.f28693h = typedArrayG.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f28695k = typedArrayG.getInt(25, 1);
        this.f28696l = typedArrayG.getInt(2, 0);
        b bVar2 = this.f28688b;
        int i10 = bVar.f28670i;
        bVar2.f28670i = i10 == -2 ? 255 : i10;
        int i11 = bVar.f28671k;
        if (i11 != -2) {
            bVar2.f28671k = i11;
        } else if (typedArrayG.hasValue(24)) {
            this.f28688b.f28671k = typedArrayG.getInt(24, 0);
        } else {
            this.f28688b.f28671k = -1;
        }
        String str = bVar.j;
        if (str != null) {
            this.f28688b.j = str;
        } else if (typedArrayG.hasValue(8)) {
            this.f28688b.j = typedArrayG.getString(8);
        }
        b bVar3 = this.f28688b;
        bVar3.f28675o = bVar.f28675o;
        CharSequence charSequence = bVar.f28676p;
        bVar3.f28676p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        b bVar4 = this.f28688b;
        int i12 = bVar.f28677q;
        bVar4.f28677q = i12 == 0 ? R.plurals.mtrl_badge_content_description : i12;
        int i13 = bVar.f28678r;
        bVar4.f28678r = i13 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i13;
        Boolean bool = bVar.f28680t;
        bVar4.f28680t = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar5 = this.f28688b;
        int i14 = bVar.f28672l;
        bVar5.f28672l = i14 == -2 ? typedArrayG.getInt(22, -2) : i14;
        b bVar6 = this.f28688b;
        int i15 = bVar.f28673m;
        bVar6.f28673m = i15 == -2 ? typedArrayG.getInt(23, -2) : i15;
        b bVar7 = this.f28688b;
        Integer num = bVar.f28667e;
        bVar7.f28667e = Integer.valueOf(num == null ? typedArrayG.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        b bVar8 = this.f28688b;
        Integer num2 = bVar.f28668f;
        bVar8.f28668f = Integer.valueOf(num2 == null ? typedArrayG.getResourceId(7, 0) : num2.intValue());
        b bVar9 = this.f28688b;
        Integer num3 = bVar.g;
        bVar9.g = Integer.valueOf(num3 == null ? typedArrayG.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        b bVar10 = this.f28688b;
        Integer num4 = bVar.f28669h;
        bVar10.f28669h = Integer.valueOf(num4 == null ? typedArrayG.getResourceId(17, 0) : num4.intValue());
        b bVar11 = this.f28688b;
        Integer num5 = bVar.f28664b;
        bVar11.f28664b = Integer.valueOf(num5 == null ? jm.a.j(context, typedArrayG, 1).getDefaultColor() : num5.intValue());
        b bVar12 = this.f28688b;
        Integer num6 = bVar.f28666d;
        bVar12.f28666d = Integer.valueOf(num6 == null ? typedArrayG.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = bVar.f28665c;
        if (num7 != null) {
            this.f28688b.f28665c = num7;
        } else if (typedArrayG.hasValue(10)) {
            this.f28688b.f28665c = Integer.valueOf(jm.a.j(context, typedArrayG, 10).getDefaultColor());
        } else {
            int iIntValue = this.f28688b.f28666d.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, h.a.f24797x);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListJ = jm.a.j(context, typedArrayObtainStyledAttributes, 3);
            jm.a.j(context, typedArrayObtainStyledAttributes, 4);
            jm.a.j(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i16 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i16, 0);
            typedArrayObtainStyledAttributes.getString(i16);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            jm.a.j(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, ic.a.f25965z);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            if (Build.VERSION.SDK_INT >= 26) {
                typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f28688b.f28665c = Integer.valueOf(colorStateListJ.getDefaultColor());
        }
        b bVar13 = this.f28688b;
        Integer num8 = bVar.f28679s;
        bVar13.f28679s = Integer.valueOf(num8 == null ? typedArrayG.getInt(3, 8388661) : num8.intValue());
        b bVar14 = this.f28688b;
        Integer num9 = bVar.f28681u;
        bVar14.f28681u = Integer.valueOf(num9 == null ? typedArrayG.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        b bVar15 = this.f28688b;
        Integer num10 = bVar.f28682v;
        bVar15.f28682v = Integer.valueOf(num10 == null ? typedArrayG.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        b bVar16 = this.f28688b;
        Integer num11 = bVar.f28683w;
        bVar16.f28683w = Integer.valueOf(num11 == null ? typedArrayG.getDimensionPixelOffset(19, 0) : num11.intValue());
        b bVar17 = this.f28688b;
        Integer num12 = bVar.f28684x;
        bVar17.f28684x = Integer.valueOf(num12 == null ? typedArrayG.getDimensionPixelOffset(26, 0) : num12.intValue());
        b bVar18 = this.f28688b;
        Integer num13 = bVar.f28685y;
        bVar18.f28685y = Integer.valueOf(num13 == null ? typedArrayG.getDimensionPixelOffset(20, bVar18.f28683w.intValue()) : num13.intValue());
        b bVar19 = this.f28688b;
        Integer num14 = bVar.f28686z;
        bVar19.f28686z = Integer.valueOf(num14 == null ? typedArrayG.getDimensionPixelOffset(27, bVar19.f28684x.intValue()) : num14.intValue());
        b bVar20 = this.f28688b;
        Integer num15 = bVar.C;
        bVar20.C = Integer.valueOf(num15 == null ? typedArrayG.getDimensionPixelOffset(21, 0) : num15.intValue());
        b bVar21 = this.f28688b;
        Integer num16 = bVar.A;
        bVar21.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar22 = this.f28688b;
        Integer num17 = bVar.B;
        bVar22.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar23 = this.f28688b;
        Boolean bool2 = bVar.D;
        bVar23.D = Boolean.valueOf(bool2 == null ? typedArrayG.getBoolean(0, false) : bool2.booleanValue());
        typedArrayG.recycle();
        Locale locale = bVar.f28674n;
        if (locale == null) {
            this.f28688b.f28674n = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            this.f28688b.f28674n = locale;
        }
        this.f28687a = bVar;
    }
}
