package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2472a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2473b = new Object();

    public static RemoteInput a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                String str = stringArrayList.get(i10);
                i10++;
                hashSet.add(str);
            }
        }
        return new RemoteInput(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    public static RemoteInput[] b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            remoteInputArr[i10] = a(bundleArr[i10]);
        }
        return remoteInputArr;
    }

    public static NotificationCompat.Action c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new NotificationCompat.Action(bundle.getInt(RewardPlus.ICON), bundle.getCharSequence(CampaignEx.JSON_KEY_TITLE), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), b(d(bundle, "remoteInputs")), b(d(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    public static Bundle[] d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle e(NotificationCompat.Action action) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = action.d();
        bundle.putInt(RewardPlus.ICON, iconCompatD != null ? iconCompatD.k() : 0);
        bundle.putCharSequence(CampaignEx.JSON_KEY_TITLE, action.h());
        bundle.putParcelable("actionIntent", action.a());
        Bundle bundle2 = action.c() != null ? new Bundle(action.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", action.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", g(action.e()));
        bundle.putBoolean("showsUserInterface", action.g());
        bundle.putInt("semanticAction", action.f());
        return bundle;
    }

    public static Bundle f(RemoteInput remoteInput) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", remoteInput.i());
        bundle.putCharSequence("label", remoteInput.h());
        bundle.putCharSequenceArray("choices", remoteInput.e());
        bundle.putBoolean("allowFreeFormInput", remoteInput.c());
        bundle.putBundle("extras", remoteInput.g());
        Set setD = remoteInput.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] g(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[remoteInputArr.length];
        for (int i10 = 0; i10 < remoteInputArr.length; i10++) {
            bundleArr[i10] = f(remoteInputArr[i10]);
        }
        return bundleArr;
    }
}
