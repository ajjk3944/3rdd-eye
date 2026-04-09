package androidx.webkit;

import androidx.annotation.RestrictTo;
import b2.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public class WebMessageCompat {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f4275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4276b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4277c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4278d;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Type {
    }

    public WebMessageCompat(String str, f[] fVarArr) {
        this.f4276b = str;
        this.f4277c = null;
        this.f4275a = fVarArr;
        this.f4278d = 0;
    }

    public final void a(int i10) {
        if (i10 == this.f4278d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(this.f4278d) + " expected, but got " + c(i10));
    }

    public String b() {
        a(0);
        return this.f4276b;
    }

    public final String c(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public WebMessageCompat(byte[] bArr, f[] fVarArr) {
        Objects.requireNonNull(bArr);
        this.f4277c = bArr;
        this.f4276b = null;
        this.f4275a = fVarArr;
        this.f4278d = 1;
    }
}
