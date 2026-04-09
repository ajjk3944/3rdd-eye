package s3;

import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7890e extends AbstractC8026a {
    public static final Parcelable.Creator<C7890e> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    private final r f61262a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61263b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f61264c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f61265d;

    /* renamed from: e, reason: collision with root package name */
    private final int f61266e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f61267f;

    public C7890e(r rVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f61262a = rVar;
        this.f61263b = z10;
        this.f61264c = z11;
        this.f61265d = iArr;
        this.f61266e = i10;
        this.f61267f = iArr2;
    }

    public int b() {
        return this.f61266e;
    }

    public int[] e() {
        return this.f61265d;
    }

    public int[] f() {
        return this.f61267f;
    }

    public boolean g() {
        return this.f61263b;
    }

    public boolean i() {
        return this.f61264c;
    }

    public final r j() {
        return this.f61262a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.p(parcel, 1, this.f61262a, i10, false);
        t3.b.c(parcel, 2, g());
        t3.b.c(parcel, 3, i());
        t3.b.l(parcel, 4, e(), false);
        t3.b.k(parcel, 5, b());
        t3.b.l(parcel, 6, f(), false);
        t3.b.b(parcel, iA);
    }
}
