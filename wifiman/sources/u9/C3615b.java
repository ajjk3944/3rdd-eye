package U9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: U9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3615b implements Parcelable {
    public static final Parcelable.Creator<C3615b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private Eb.w f22184a;

    /* renamed from: b, reason: collision with root package name */
    private Set f22185b;

    /* renamed from: c, reason: collision with root package name */
    private Eb.w f22186c;

    /* renamed from: U9.b$a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3615b createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            Eb.w wVar = (Eb.w) parcel.readParcelable(C3615b.class.getClassLoader());
            int i10 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashSet.add(parcel.readParcelable(C3615b.class.getClassLoader()));
            }
            return new C3615b(wVar, linkedHashSet, (Eb.w) parcel.readParcelable(C3615b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3615b[] newArray(int i10) {
            return new C3615b[i10];
        }
    }

    public C3615b(Eb.w primaryMethod, Set methods, Eb.w wVar) {
        AbstractC6492s.i(primaryMethod, "primaryMethod");
        AbstractC6492s.i(methods, "methods");
        this.f22184a = primaryMethod;
        this.f22185b = methods;
        this.f22186c = wVar;
    }

    public final Set a() {
        return this.f22185b;
    }

    public final Eb.w b() {
        return this.f22184a;
    }

    public final Eb.w c() {
        return this.f22186c;
    }

    public final void d(Eb.w wVar) {
        this.f22186c = wVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3615b)) {
            return false;
        }
        C3615b c3615b = (C3615b) obj;
        return AbstractC6492s.d(this.f22184a, c3615b.f22184a) && AbstractC6492s.d(this.f22185b, c3615b.f22185b) && AbstractC6492s.d(this.f22186c, c3615b.f22186c);
    }

    public int hashCode() {
        int iHashCode = ((this.f22184a.hashCode() * 31) + this.f22185b.hashCode()) * 31;
        Eb.w wVar = this.f22186c;
        return iHashCode + (wVar == null ? 0 : wVar.hashCode());
    }

    public String toString() {
        return "MFAMethods(primaryMethod=" + this.f22184a + ", methods=" + this.f22185b + ", selectedMethod=" + this.f22186c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC6492s.i(dest, "dest");
        dest.writeParcelable(this.f22184a, i10);
        Set set = this.f22185b;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i10);
        }
        dest.writeParcelable(this.f22186c, i10);
    }
}
