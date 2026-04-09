package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class TypefaceEmojiRasterizer {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f3012d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f3013a;

    /* renamed from: b, reason: collision with root package name */
    public final m f3014b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f3015c = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HasGlyph {
    }

    public TypefaceEmojiRasterizer(m mVar, int i10) {
        this.f3014b = mVar;
        this.f3013a = i10;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f3014b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f3014b.c(), this.f3013a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f3015c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final e1.a g() {
        ThreadLocal threadLocal = f3012d;
        e1.a aVar = (e1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new e1.a();
            threadLocal.set(aVar);
        }
        this.f3014b.d().j(aVar, this.f3013a);
        return aVar;
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f3015c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f3015c = iD | 4;
        } else {
            this.f3015c = iD;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f3015c & 4;
        this.f3015c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb.append(Integer.toHexString(b(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
