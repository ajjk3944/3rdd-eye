package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import i6.a;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MemoryCache$Key implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<MemoryCache$Key> CREATOR = new a(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f3999a;

    /* renamed from: d, reason: collision with root package name */
    public final Map f4000d;

    public MemoryCache$Key(String str, Map map) {
        this.f3999a = str;
        this.f4000d = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryCache$Key)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
        return l.a(this.f3999a, memoryCache$Key.f3999a) && l.a(this.f4000d, memoryCache$Key.f4000d);
    }

    public final int hashCode() {
        return this.f4000d.hashCode() + (this.f3999a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f3999a + ", extras=" + this.f4000d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f3999a);
        Map map = this.f4000d;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
