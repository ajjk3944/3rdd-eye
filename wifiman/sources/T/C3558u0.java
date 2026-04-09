package T;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: T.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3558u0 extends j1 implements Parcelable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f21255c = new b(null);
    public static final Parcelable.Creator<C3558u0> CREATOR = new a();

    /* renamed from: T.u0$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3558u0 createFromParcel(Parcel parcel) {
            return new C3558u0(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3558u0[] newArray(int i10) {
            return new C3558u0[i10];
        }
    }

    /* renamed from: T.u0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C3558u0(float f10) {
        super(f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(c());
    }
}
