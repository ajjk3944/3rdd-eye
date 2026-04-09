package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import cc.a0;
import g4.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "activity_release"}, k = 1, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a0(8);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f919a;

    /* renamed from: d, reason: collision with root package name */
    public final Intent f920d;

    /* renamed from: g, reason: collision with root package name */
    public final int f921g;

    /* renamed from: r, reason: collision with root package name */
    public final int f922r;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f919a = intentSender;
        this.f920d = intent;
        this.f921g = i10;
        this.f922r = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.e(parcel, "dest");
        parcel.writeParcelable(this.f919a, i10);
        parcel.writeParcelable(this.f920d, i10);
        parcel.writeInt(this.f921g);
        parcel.writeInt(this.f922r);
    }
}
