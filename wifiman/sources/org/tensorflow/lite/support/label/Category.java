package org.tensorflow.lite.support.label;

import java.util.Objects;
import org.tensorflow.lite.annotations.UsedByReflection;

@UsedByReflection
/* loaded from: classes2.dex */
public final class Category {

    /* renamed from: a, reason: collision with root package name */
    private final int f57157a;

    /* renamed from: b, reason: collision with root package name */
    private final String f57158b;

    /* renamed from: c, reason: collision with root package name */
    private final String f57159c;

    /* renamed from: d, reason: collision with root package name */
    private final float f57160d;

    @UsedByReflection
    public Category(String str, float f10) {
        this(str, "", f10, -1);
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f10, int i10) {
        return new Category(str, str2, f10, i10);
    }

    public String a() {
        return this.f57159c;
    }

    public int b() {
        return this.f57157a;
    }

    public String c() {
        return this.f57158b;
    }

    public float d() {
        return this.f57160d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return category.c().equals(this.f57158b) && category.a().equals(this.f57159c) && category.d() == this.f57160d && category.b() == this.f57157a;
    }

    public int hashCode() {
        return Objects.hash(this.f57158b, this.f57159c, Float.valueOf(this.f57160d), Integer.valueOf(this.f57157a));
    }

    public String toString() {
        return "<Category \"" + this.f57158b + "\" (displayName=" + this.f57159c + " score=" + this.f57160d + " index=" + this.f57157a + ")>";
    }

    private Category(String str, String str2, float f10, int i10) {
        this.f57158b = str;
        this.f57159c = str2;
        this.f57160d = f10;
        this.f57157a = i10;
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f10) {
        return new Category(str, str2, f10, -1);
    }
}
