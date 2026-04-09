package r7;

import N7.B8;
import Q9.C1553s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.jvm.internal.x;

/* compiled from: DivLayoutParams.kt */
/* renamed from: r7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5533d extends ViewGroup.MarginLayoutParams {
    public static final /* synthetic */ w9.i<Object>[] i;

    /* renamed from: a, reason: collision with root package name */
    public int f45758a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45759b;

    /* renamed from: c, reason: collision with root package name */
    public float f45760c;

    /* renamed from: d, reason: collision with root package name */
    public float f45761d;

    /* renamed from: e, reason: collision with root package name */
    public final C1553s f45762e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553s f45763f;

    /* renamed from: g, reason: collision with root package name */
    public int f45764g;

    /* renamed from: h, reason: collision with root package name */
    public int f45765h;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(C5533d.class, "columnSpan", "getColumnSpan()I");
        x.f43661a.getClass();
        i = new w9.i[]{nVar, new kotlin.jvm.internal.n(C5533d.class, "rowSpan", "getRowSpan()I")};
    }

    public C5533d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45758a = 8388659;
        this.f45762e = new C1553s(0);
        this.f45763f = new C1553s(0);
        this.f45764g = Integer.MAX_VALUE;
        this.f45765h = Integer.MAX_VALUE;
    }

    public final int a() {
        w9.i<Object> property = i[0];
        C1553s c1553s = this.f45762e;
        c1553s.getClass();
        kotlin.jvm.internal.l.f(property, "property");
        return ((Number) c1553s.f11527b).intValue();
    }

    public final int b() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final int c() {
        w9.i<Object> property = i[1];
        C1553s c1553s = this.f45763f;
        c1553s.getClass();
        kotlin.jvm.internal.l.f(property, "property");
        return ((Number) c1553s.f11527b).intValue();
    }

    public final int d() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5533d.class != obj.getClass()) {
            return false;
        }
        C5533d c5533d = (C5533d) obj;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) c5533d).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) c5533d).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) c5533d).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) c5533d).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) c5533d).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) c5533d).bottomMargin && this.f45758a == c5533d.f45758a && this.f45759b == c5533d.f45759b && a() == c5533d.a() && c() == c5533d.c() && this.f45760c == c5533d.f45760c && this.f45761d == c5533d.f45761d && this.f45764g == c5533d.f45764g && this.f45765h == c5533d.f45765h;
    }

    public final int hashCode() {
        int iG = B8.g(this.f45761d, B8.g(this.f45760c, (c() + ((a() + (((((super.hashCode() * 31) + this.f45758a) * 31) + (this.f45759b ? 1 : 0)) * 31)) * 31)) * 31, 31), 31);
        int i10 = this.f45764g;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        int i11 = (iG + i10) * 31;
        int i12 = this.f45765h;
        return i11 + (i12 != Integer.MAX_VALUE ? i12 : 0);
    }

    public C5533d(int i10, int i11) {
        super(i10, i11);
        this.f45758a = 8388659;
        this.f45762e = new C1553s(0);
        this.f45763f = new C1553s(0);
        this.f45764g = Integer.MAX_VALUE;
        this.f45765h = Integer.MAX_VALUE;
    }

    public C5533d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f45758a = 8388659;
        this.f45762e = new C1553s(0);
        this.f45763f = new C1553s(0);
        this.f45764g = Integer.MAX_VALUE;
        this.f45765h = Integer.MAX_VALUE;
    }

    public C5533d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f45758a = 8388659;
        this.f45762e = new C1553s(0);
        this.f45763f = new C1553s(0);
        this.f45764g = Integer.MAX_VALUE;
        this.f45765h = Integer.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5533d(C5533d source) {
        super((ViewGroup.MarginLayoutParams) source);
        kotlin.jvm.internal.l.f(source, "source");
        this.f45758a = 8388659;
        C1553s c1553s = new C1553s(0);
        this.f45762e = c1553s;
        C1553s c1553s2 = new C1553s(0);
        this.f45763f = c1553s2;
        this.f45764g = Integer.MAX_VALUE;
        this.f45765h = Integer.MAX_VALUE;
        this.f45758a = source.f45758a;
        this.f45759b = source.f45759b;
        this.f45760c = source.f45760c;
        this.f45761d = source.f45761d;
        int iA = source.a();
        w9.i<Object>[] iVarArr = i;
        w9.i<Object> property = iVarArr[0];
        Number numberValueOf = Integer.valueOf(iA);
        kotlin.jvm.internal.l.f(property, "property");
        c1553s.f11527b = numberValueOf.doubleValue() <= 0.0d ? (Number) c1553s.f11528c : numberValueOf;
        int iC = source.c();
        w9.i<Object> property2 = iVarArr[1];
        Number numberValueOf2 = Integer.valueOf(iC);
        kotlin.jvm.internal.l.f(property2, "property");
        c1553s2.f11527b = numberValueOf2.doubleValue() <= 0.0d ? (Number) c1553s2.f11528c : numberValueOf2;
        this.f45764g = source.f45764g;
        this.f45765h = source.f45765h;
    }
}
