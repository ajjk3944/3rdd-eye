package s3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import t3.AbstractC8026a;

/* renamed from: s3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7904t extends AbstractC8026a {
    public static final Parcelable.Creator<C7904t> CREATOR = new C7908x();

    /* renamed from: a, reason: collision with root package name */
    private final int f61347a;

    /* renamed from: b, reason: collision with root package name */
    private List f61348b;

    public C7904t(int i10, List list) {
        this.f61347a = i10;
        this.f61348b = list;
    }

    public final int b() {
        return this.f61347a;
    }

    public final List e() {
        return this.f61348b;
    }

    public final void f(C7899n c7899n) {
        if (this.f61348b == null) {
            this.f61348b = new ArrayList();
        }
        this.f61348b.add(c7899n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, this.f61347a);
        t3.b.t(parcel, 2, this.f61348b, false);
        t3.b.b(parcel, iA);
    }
}
