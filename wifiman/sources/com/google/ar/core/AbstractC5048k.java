package com.google.ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC5048k {
    static PendingIntent a(Context context) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        try {
            Bundle bundleCall = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (bundleCall != null) {
                PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("intent");
                if (pendingIntent != null) {
                    return pendingIntent;
                }
                String string = bundleCall.getString("exceptionType", "");
                if (!string.isEmpty()) {
                    if (string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                        throw new UnavailableDeviceNotCompatibleException();
                    }
                    if (string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                        throw new UnavailableUserDeclinedInstallationException();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                    String string2 = bundleCall.getString("exceptionText", null);
                    if (string2 != null) {
                        throw ((RuntimeException) clsAsSubclass.getConstructor(String.class).newInstance(string2));
                    }
                    throw ((RuntimeException) clsAsSubclass.getConstructor(null).newInstance(null));
                }
            }
            return null;
        } catch (ReflectiveOperationException e10) {
            e = e10;
            Log.i("ARCore-SetupContentReso", "Post-install failed", e);
            return null;
        } catch (RuntimeException e11) {
            e = e11;
            Log.i("ARCore-SetupContentReso", "Post-install failed", e);
            return null;
        }
    }
}
