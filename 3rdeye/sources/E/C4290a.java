package e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* compiled from: ActivityResult.kt */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4290a implements Parcelable {
    public static final Parcelable.Creator<C4290a> CREATOR = new C0444a();

    /* renamed from: b, reason: collision with root package name */
    public final int f37602b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f37603c;

    /* compiled from: ActivityResult.kt */
    /* renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0444a implements Parcelable.Creator<C4290a> {
        @Override // android.os.Parcelable.Creator
        public final C4290a createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new C4290a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final C4290a[] newArray(int i) {
            return new C4290a[i];
        }
    }

    public C4290a(int i, Intent intent) {
        this.f37602b = i;
        this.f37603c = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f37602b;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f37603c);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        l.f(dest, "dest");
        dest.writeInt(this.f37602b);
        Intent intent = this.f37603c;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }
}
