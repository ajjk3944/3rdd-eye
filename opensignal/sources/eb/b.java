package eb;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: r, reason: collision with root package name */
    public static final b f8055r = new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f8056a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f8057b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f8058c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f8059d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8060e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8061f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8062g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8063h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8064i;
    public final float j;
    public final float k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8065l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8066m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8067n;

    /* renamed from: o, reason: collision with root package name */
    public final float f8068o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8069p;

    /* renamed from: q, reason: collision with root package name */
    public final float f8070q;

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            qb.b.g(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f8056a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8056a = charSequence.toString();
        } else {
            this.f8056a = null;
        }
        this.f8057b = alignment;
        this.f8058c = alignment2;
        this.f8059d = bitmap;
        this.f8060e = f10;
        this.f8061f = i10;
        this.f8062g = i11;
        this.f8063h = f11;
        this.f8064i = i12;
        this.j = f13;
        this.k = f14;
        this.f8065l = z10;
        this.f8066m = i14;
        this.f8067n = i13;
        this.f8068o = f12;
        this.f8069p = i15;
        this.f8070q = f15;
    }

    public final a a() {
        a aVar = new a();
        aVar.f8040a = this.f8056a;
        aVar.f8041b = this.f8059d;
        aVar.f8042c = this.f8057b;
        aVar.f8043d = this.f8058c;
        aVar.f8044e = this.f8060e;
        aVar.f8045f = this.f8061f;
        aVar.f8046g = this.f8062g;
        aVar.f8047h = this.f8063h;
        aVar.f8048i = this.f8064i;
        aVar.j = this.f8067n;
        aVar.k = this.f8068o;
        aVar.f8049l = this.j;
        aVar.f8050m = this.k;
        aVar.f8051n = this.f8065l;
        aVar.f8052o = this.f8066m;
        aVar.f8053p = this.f8069p;
        aVar.f8054q = this.f8070q;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Bitmap bitmap = bVar.f8059d;
        if (!TextUtils.equals(this.f8056a, bVar.f8056a) || this.f8057b != bVar.f8057b || this.f8058c != bVar.f8058c) {
            return false;
        }
        Bitmap bitmap2 = this.f8059d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f8060e == bVar.f8060e && this.f8061f == bVar.f8061f && this.f8062g == bVar.f8062g && this.f8063h == bVar.f8063h && this.f8064i == bVar.f8064i && this.j == bVar.j && this.k == bVar.k && this.f8065l == bVar.f8065l && this.f8066m == bVar.f8066m && this.f8067n == bVar.f8067n && this.f8068o == bVar.f8068o && this.f8069p == bVar.f8069p && this.f8070q == bVar.f8070q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8056a, this.f8057b, this.f8058c, this.f8059d, Float.valueOf(this.f8060e), Integer.valueOf(this.f8061f), Integer.valueOf(this.f8062g), Float.valueOf(this.f8063h), Integer.valueOf(this.f8064i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.f8065l), Integer.valueOf(this.f8066m), Integer.valueOf(this.f8067n), Float.valueOf(this.f8068o), Integer.valueOf(this.f8069p), Float.valueOf(this.f8070q)});
    }
}
