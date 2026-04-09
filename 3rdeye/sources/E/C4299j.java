package e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* compiled from: IntentSenderRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: e.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4299j implements Parcelable {
    public static final Parcelable.Creator<C4299j> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final IntentSender f37626b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f37627c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37628d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37629e;

    /* compiled from: IntentSenderRequest.kt */
    /* renamed from: e.j$a */
    public static final class a implements Parcelable.Creator<C4299j> {
        @Override // android.os.Parcelable.Creator
        public final C4299j createFromParcel(Parcel inParcel) {
            l.f(inParcel, "inParcel");
            Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
            l.c(parcelable);
            return new C4299j((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C4299j[] newArray(int i) {
            return new C4299j[i];
        }
    }

    public C4299j(IntentSender intentSender, Intent intent, int i, int i10) {
        l.f(intentSender, "intentSender");
        this.f37626b = intentSender;
        this.f37627c = intent;
        this.f37628d = i;
        this.f37629e = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        l.f(dest, "dest");
        dest.writeParcelable(this.f37626b, i);
        dest.writeParcelable(this.f37627c, i);
        dest.writeInt(this.f37628d);
        dest.writeInt(this.f37629e);
    }
}
