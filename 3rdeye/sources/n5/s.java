package n5;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;
import m0.C5308a;
import org.json.JSONException;

/* compiled from: RemoteMessage.java */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class s extends AbstractSafeParcelable {
    public static final Parcelable.Creator<s> CREATOR = new t();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final Bundle f44370b;

    /* renamed from: c, reason: collision with root package name */
    public C5308a f44371c;

    /* renamed from: d, reason: collision with root package name */
    public a f44372d;

    /* compiled from: RemoteMessage.java */
    public static class a {
    }

    @SafeParcelable.Constructor
    public s(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f44370b = bundle;
    }

    public final a c() throws JSONException {
        if (this.f44372d == null) {
            Bundle bundle = this.f44370b;
            if (A3.c.p(bundle)) {
                A3.c cVar = new A3.c(bundle);
                a aVar = new a();
                cVar.m("gcm.n.title");
                cVar.j("gcm.n.title");
                Object[] objArrI = cVar.i("gcm.n.title");
                if (objArrI != null) {
                    String[] strArr = new String[objArrI.length];
                    for (int i = 0; i < objArrI.length; i++) {
                        strArr[i] = String.valueOf(objArrI[i]);
                    }
                }
                cVar.m("gcm.n.body");
                cVar.j("gcm.n.body");
                Object[] objArrI2 = cVar.i("gcm.n.body");
                if (objArrI2 != null) {
                    String[] strArr2 = new String[objArrI2.length];
                    for (int i10 = 0; i10 < objArrI2.length; i10++) {
                        strArr2[i10] = String.valueOf(objArrI2[i10]);
                    }
                }
                cVar.m("gcm.n.icon");
                if (TextUtils.isEmpty(cVar.m("gcm.n.sound2"))) {
                    cVar.m("gcm.n.sound");
                }
                cVar.m("gcm.n.tag");
                cVar.m("gcm.n.color");
                cVar.m("gcm.n.click_action");
                cVar.m("gcm.n.android_channel_id");
                String strM = cVar.m("gcm.n.link_android");
                if (TextUtils.isEmpty(strM)) {
                    strM = cVar.m("gcm.n.link");
                }
                if (!TextUtils.isEmpty(strM)) {
                    Uri.parse(strM);
                }
                cVar.m("gcm.n.image");
                cVar.m("gcm.n.ticker");
                cVar.f("gcm.n.notification_priority");
                cVar.f("gcm.n.visibility");
                cVar.f("gcm.n.notification_count");
                cVar.e("gcm.n.sticky");
                cVar.e("gcm.n.local_only");
                cVar.e("gcm.n.default_sound");
                cVar.e("gcm.n.default_vibrate_timings");
                cVar.e("gcm.n.default_light_settings");
                cVar.k();
                cVar.h();
                cVar.o();
                this.f44372d = aVar;
            }
        }
        return this.f44372d;
    }

    public final Map<String, String> getData() {
        if (this.f44371c == null) {
            C5308a c5308a = new C5308a();
            Bundle bundle = this.f44370b;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c5308a.put(str, str2);
                    }
                }
            }
            this.f44371c = c5308a;
        }
        return this.f44371c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f44370b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
