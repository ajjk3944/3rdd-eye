package I3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class f extends AbstractC8026a {
    public static final Parcelable.Creator<f> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    private final List f8569a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8570b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8571c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f8572a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f8573b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8574c = false;

        public a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f8572a.add(locationRequest);
            }
            return this;
        }

        public f b() {
            return new f(this.f8572a, this.f8573b, this.f8574c);
        }

        public a c(boolean z10) {
            this.f8573b = z10;
            return this;
        }
    }

    f(List list, boolean z10, boolean z11) {
        this.f8569a = list;
        this.f8570b = z10;
        this.f8571c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List list = this.f8569a;
        int iA = t3.b.a(parcel);
        t3.b.t(parcel, 1, Collections.unmodifiableList(list), false);
        t3.b.c(parcel, 2, this.f8570b);
        t3.b.c(parcel, 3, this.f8571c);
        t3.b.b(parcel, iA);
    }
}
