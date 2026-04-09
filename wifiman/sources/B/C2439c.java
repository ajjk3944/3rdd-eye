package B;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: B.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2439c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f935a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f934b = new b(null);
    public static final Parcelable.Creator<C2439c> CREATOR = new a();

    /* renamed from: B.c$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2439c createFromParcel(Parcel parcel) {
            return new C2439c(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2439c[] newArray(int i10) {
            return new C2439c[i10];
        }
    }

    /* renamed from: B.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C2439c(int i10) {
        this.f935a = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2439c) && this.f935a == ((C2439c) obj).f935a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f935a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f935a + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f935a);
    }
}
