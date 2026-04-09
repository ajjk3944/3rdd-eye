package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5490g implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final IntentSender f46556a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f46557b;

    /* renamed from: c, reason: collision with root package name */
    private final int f46558c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46559d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f46555e = new c(null);
    public static final Parcelable.Creator<C5490g> CREATOR = new b();

    /* renamed from: f.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntentSender f46560a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f46561b;

        /* renamed from: c, reason: collision with root package name */
        private int f46562c;

        /* renamed from: d, reason: collision with root package name */
        private int f46563d;

        public a(IntentSender intentSender) {
            AbstractC6492s.i(intentSender, "intentSender");
            this.f46560a = intentSender;
        }

        public final C5490g a() {
            return new C5490g(this.f46560a, this.f46561b, this.f46562c, this.f46563d);
        }

        public final a b(Intent intent) {
            this.f46561b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f46563d = i10;
            this.f46562c = i11;
            return this;
        }
    }

    /* renamed from: f.g$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5490g createFromParcel(Parcel inParcel) {
            AbstractC6492s.i(inParcel, "inParcel");
            return new C5490g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5490g[] newArray(int i10) {
            return new C5490g[i10];
        }
    }

    /* renamed from: f.g$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public C5490g(IntentSender intentSender, Intent intent, int i10, int i11) {
        AbstractC6492s.i(intentSender, "intentSender");
        this.f46556a = intentSender;
        this.f46557b = intent;
        this.f46558c = i10;
        this.f46559d = i11;
    }

    public final Intent a() {
        return this.f46557b;
    }

    public final int b() {
        return this.f46558c;
    }

    public final int c() {
        return this.f46559d;
    }

    public final IntentSender d() {
        return this.f46556a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC6492s.i(dest, "dest");
        dest.writeParcelable(this.f46556a, i10);
        dest.writeParcelable(this.f46557b, i10);
        dest.writeInt(this.f46558c);
        dest.writeInt(this.f46559d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5490g(Parcel parcel) {
        AbstractC6492s.i(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC6492s.f(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
