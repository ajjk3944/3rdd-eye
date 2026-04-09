package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5484a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f46539a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f46540b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f46538c = new b(null);
    public static final Parcelable.Creator<C5484a> CREATOR = new C1751a();

    /* renamed from: f.a$a, reason: collision with other inner class name */
    public static final class C1751a implements Parcelable.Creator {
        C1751a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5484a createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new C5484a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5484a[] newArray(int i10) {
            return new C5484a[i10];
        }
    }

    /* renamed from: f.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }
    }

    public C5484a(int i10, Intent intent) {
        this.f46539a = i10;
        this.f46540b = intent;
    }

    public final Intent a() {
        return this.f46540b;
    }

    public final int b() {
        return this.f46539a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f46538c.a(this.f46539a) + ", data=" + this.f46540b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC6492s.i(dest, "dest");
        dest.writeInt(this.f46539a);
        dest.writeInt(this.f46540b == null ? 0 : 1);
        Intent intent = this.f46540b;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5484a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        AbstractC6492s.i(parcel, "parcel");
    }
}
