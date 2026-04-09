package com.singular.sdk.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.vending.licensing.ILicensingService;
import com.android.vending.licensing.a;
import com.singular.sdk.internal.LicenseApiHelper;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class LicenseChecker implements ServiceConnection {
    private static final int ERROR_RESPONSE_CODE = -1;
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final SingularLog logger = SingularLog.getLogger("LicenseApiHelper");
    private final LicenseApiHelper.LicenseResultHandler handler;
    private final Context mContext;
    private Handler mHandler;
    private final String mPackageName;
    private ILicensingService mService;

    public class ResultListener extends a.AbstractBinderC0302a {
        private ResultListener() {
        }

        @Override // com.android.vending.licensing.a
        public void verifyLicense(int i, String str, String str2) {
            LicenseChecker.this.handler.handle(i, str, str2);
        }
    }

    public LicenseChecker(Context context, LicenseApiHelper.LicenseResultHandler licenseResultHandler) {
        HandlerThread handlerThread = new HandlerThread("license_checker");
        handlerThread.start();
        this.mContext = context;
        this.mPackageName = context.getPackageName();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.handler = licenseResultHandler;
    }

    private void cleanupService() {
        if (this.mService != null) {
            try {
                this.mContext.unbindService(this);
            } catch (IllegalArgumentException unused) {
                logger.error("Unable to unbind from licensing service (already unbound)");
            }
            this.mService = null;
        }
    }

    private int generateNonce() {
        return RANDOM.nextInt();
    }

    public synchronized void checkAccess() {
        ILicensingService iLicensingService = this.mService;
        if (iLicensingService == null) {
            SingularLog singularLog = logger;
            singularLog.info("Binding to licensing service.");
            try {
                if (!this.mContext.bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), this, 1)) {
                    singularLog.error("Could not bind to service.");
                    this.handler.handle(-1, "Binding failed", "");
                }
            } catch (SecurityException e4) {
                logger.error("SecurityException", e4);
                this.handler.handle(-1, "Exception: " + e4.toString() + ", Message: " + e4.getMessage(), "");
            }
            logger.info("Binding done.");
        } else {
            try {
                iLicensingService.m(generateNonce(), this.mPackageName, new ResultListener());
            } catch (RemoteException e10) {
                logger.error("RemoteException in checkLicense call.", e10);
                this.handler.handle(-1, "Exception: " + e10.toString() + ", Message: " + e10.getMessage(), "");
            }
        }
    }

    public synchronized void onDestroy() {
        cleanupService();
        this.mHandler.getLooper().quit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.android.vending.licensing.ILicensingService] */
    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ILicensingService.a.C0301a c0301a;
        SingularLog singularLog = logger;
        singularLog.info("onServiceConnected.");
        int i = ILicensingService.a.f18722b;
        if (iBinder == null) {
            c0301a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) {
                ILicensingService.a.C0301a c0301a2 = new ILicensingService.a.C0301a();
                c0301a2.f18723b = iBinder;
                c0301a = c0301a2;
            } else {
                c0301a = (ILicensingService) iInterfaceQueryLocalInterface;
            }
        }
        this.mService = c0301a;
        try {
            c0301a.m(generateNonce(), this.mPackageName, new ResultListener());
            singularLog.info("checkLicense call done.");
        } catch (RemoteException e4) {
            logger.error("RemoteException in checkLicense call.", e4);
            this.handler.handle(-1, e4.toString(), "");
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceDisconnected(ComponentName componentName) {
        logger.info("Service unexpectedly disconnected.");
        this.mService = null;
    }
}
