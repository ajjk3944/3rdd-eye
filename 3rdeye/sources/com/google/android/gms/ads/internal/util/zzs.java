package com.google.android.gms.ads.internal.util;

import A4.a;
import B4.g;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbvy;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzcgh;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzdpf;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzfbt;
import com.google.android.gms.internal.ads.zzfbw;
import com.google.android.gms.internal.ads.zzfrn;
import com.google.android.gms.internal.ads.zzfup;
import com.google.android.gms.internal.ads.zzfvt;
import com.google.android.gms.internal.ads.zzfvv;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzhgo;
import com.singular.sdk.internal.Constants;
import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.g;
import z0.C5848a;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzs {
    public static final zzfrn zza = new zzf(Looper.getMainLooper());
    private String zzh;
    private volatile String zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    public static final zzbr zzA(Context context) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder);
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzB(Context context, String str) {
        Context contextZza = zzbvy.zza(context);
        return Wrappers.packageManager(contextZza).checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzC(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzD(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfq)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfs);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfr);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        KeyguardManager keyguardManagerZzZ;
        return (context == null || (keyguardManagerZzZ = zzZ(context)) == null || !keyguardManagerZzZ.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzF(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzG() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzH(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        try {
            Bundle bundleZzaa = zzaa(context);
            String string = bundleZzaa.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(zzab(bundleZzaa))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzJ(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzK(View view, int i, MotionEvent motionEvent) {
        String strZza;
        int i10;
        int iHeight;
        int iWidth;
        String str;
        zzfbt zzfbtVarZzD;
        zzfbw zzfbwVarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdpf) {
                childAt = ((zzdpf) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzj) || (childAt instanceof NativeAdView)) {
                strZza = "NATIVE";
                i10 = 1;
            } else {
                strZza = "UNKNOWN";
                i10 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzv.zzr();
            long jZzx = zzx(childAt);
            childAt.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcgh) || (zzfbwVarZzR = ((zzcgh) childAt).zzR()) == null) {
                str = "none";
            } else {
                str = zzfbwVarZzR.zzb;
                childAt.setContentDescription(str + StringUtils.PROCESS_POSTFIX_DELIMITER + childAt.hashCode());
            }
            if ((childAt instanceof zzcev) && (zzfbtVarZzD = ((zzcev) childAt).zzD()) != null) {
                strZza = zzfbt.zza(zzfbtVarZzD.zzb);
                i10 = zzfbtVarZzD.zze;
                str2 = zzfbtVarZzD.zzE;
            }
            Locale locale = Locale.US;
            String str3 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strZza + ", impType=" + i10 + ", class=" + childAt.getClass().getName() + ", x=" + i11 + ", y=" + i12 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jZzx + ", state=" + Integer.toString(i, 2) + ">";
            int i13 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(str3);
        } catch (Exception e4) {
            int i14 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failure getting view location.", e4);
        }
    }

    public static final AlertDialog.Builder zzL(Context context) {
        com.google.android.gms.ads.internal.zzv.zzs();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzM(Context context, String str, String str2) {
        new zzbw(context, str, str2, null, null).zzb();
    }

    public static final void zzN(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzbfl.zzb.zze()).booleanValue()) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final boolean zzO(zzfbt zzfbtVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzny)).booleanValue() && zzfbtVar != null && zzfbtVar.zze == 4;
    }

    public static final int zzP(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            String strConcat = "Could not parse value:".concat(e4.toString());
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strConcat);
            return 0;
        }
    }

    public static final Map zzQ(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzq)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzR(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzS(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrZzv = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, iArrZzv[0]), com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, iArrZzv[1])};
    }

    public static final boolean zzT(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z10 = com.google.android.gms.ads.internal.zzv.zzr().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long jZzx = zzx(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z10)) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbw)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkP)).booleanValue()) {
            if (jZzx < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkR)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void zzU(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlm)).booleanValue()) {
            zzae(context, intent);
            return;
        }
        try {
            zzae(context, intent);
        } catch (SecurityException e4) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzV(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String str = "Opening " + uri.toString() + " in a new browser.";
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze(str);
        } catch (ActivityNotFoundException e4) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("No browser is found.", e4);
        }
    }

    public static final int[] zzW(Activity activity) {
        int[] iArrZzR = zzR(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, iArrZzR[0]), com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(activity, iArrZzR[1])};
    }

    public static final boolean zzX(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzT(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzZ(context));
    }

    public static final void zzY(Context context, Intent intent, zzdsc zzdscVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznm)).booleanValue() || !(context instanceof zzcgx)) {
            zzU(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzno))) {
                    ((zzcgx) context).zzc(intent, 236);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznn)).booleanValue() || zzdscVar == null) {
                        return;
                    }
                    zzdsb zzdsbVarZza = zzdscVar.zza();
                    zzdsbVarZza.zzb("action", "hila");
                    zzdsbVarZza.zzb("gqi", zzfvv.zzc(str));
                    zzdsbVarZza.zzi();
                    return;
                }
            }
            zzU(context, intent);
        } catch (ActivityNotFoundException e4) {
            e = e4;
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzU(context, intent);
        } catch (SecurityException e10) {
            e = e10;
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzU(context, intent);
        } catch (Exception e11) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while starting activity for result", e11);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "AdUtil.startActivityForResult");
            zzU(context, intent);
        }
    }

    private static KeyguardManager zzZ(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        String strI = C4356c.i(i, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj(strI);
        return 60000;
    }

    private static Bundle zzaa(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e4) {
            zze.zzb("Error getting metadata", e4);
            return null;
        }
    }

    private static String zzab(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    private static boolean zzac(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzad(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void zzae(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzaf(final Context context, String str) {
        String strZzr;
        String str2;
        if (str == null) {
            return zzr();
        }
        try {
            zzcg zzcgVarZza = zzcg.zza();
            if (TextUtils.isEmpty(zzcgVarZza.zza)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str2 = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzce
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                zze.zza("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                    str2 = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = remoteContext;
                            Context context3 = context;
                            boolean z10 = false;
                            if (context2 != null) {
                                zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z10 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            zze.zza("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z10) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                zze.zza("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                zzcgVarZza.zza = str2;
            }
            strZzr = zzcgVarZza.zza;
        } catch (Exception unused) {
            strZzr = null;
        }
        if (TextUtils.isEmpty(strZzr)) {
            strZzr = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strZzr)) {
            strZzr = zzr();
        }
        String strO = g.o(strZzr, " (Mobile; ", str);
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                strO = strO + ";aia";
            }
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AdUtil.getUserAgent");
        }
        return strO.concat(")");
    }

    public static List zzd() {
        zzbct zzbctVar = zzbdc.zza;
        List listZzb = com.google.android.gms.ads.internal.client.zzbd.zza().zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfvt.zzb(zzfup.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcad.zza.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzo(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzo(android.view.View):boolean");
    }

    public static final void zzp(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzq(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzab(zzaa(context));
    }

    public static final String zzr() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzs() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : g.o(str, " ", str2);
    }

    public static final Integer zzt(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzv() {
        return new int[]{0, 0};
    }

    public static final Map zzw(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzx(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final WebResourceResponse zzy(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzr().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", Constants.ENCODING, new ByteArrayInputStream(str3.getBytes(Constants.ENCODING)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e4) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not fetch MRAID JS.", e4);
        }
        return null;
    }

    public static final String zzz() {
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        return resourcesZze != null ? resourcesZze.getString(com.google.android.gms.ads.impl.R.string.f22447s7) : "Test Ad";
    }

    public final a zzb(final Uri uri) {
        return zzgdb.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfrn zzfrnVar = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzr();
                return zzs.zzQ(uri);
            }
        }, this.zzl);
    }

    public final String zzc(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzly)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzaf(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            try {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String strZzaf = zzaf(context, str);
                this.zzh = strZzaf;
                return strZzaf;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(Context context, String str, boolean z10, HttpURLConnection httpURLConnection, boolean z11, int i) {
        int iZza = zza(i);
        String strI = C4356c.i(iZza, "HTTP timeout: ", " milliseconds.");
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strI);
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void zzi(final Context context, final String str, String str2, Bundle bundle, boolean z10) {
        com.google.android.gms.ads.internal.zzv.zzr();
        bundle.putString("device", zzs());
        zzbct zzbctVar = zzbdc.zza;
        bundle.putString("eids", TextUtils.join(StringUtils.COMMA, com.google.android.gms.ads.internal.client.zzbd.zza().zza()));
        if (bundle.isEmpty()) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkN);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.zzd.set(zzad.zzb(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        com.google.android.gms.ads.internal.util.client.zzf.zzB(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzfrn zzfrnVar = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzr();
                zzs.zzM(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzj(String str) {
        return zzac(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzas));
    }

    public final boolean zzk(String str) {
        return zzac(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzat));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbdc.zza(context);
        zzr zzrVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzll)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, zzrVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, zzrVar), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzm(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbdc.zza(context);
        zzr zzrVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzll)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzq(this, zzrVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzq(this, zzrVar), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final int zzn(Context context, Uri uri) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zzad(context, uri);
            return 2;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeO)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeM)).booleanValue()) {
                zzad(context, uri);
                return 9;
            }
            zzbed zzbedVar = new zzbed();
            zzbedVar.zze(new zzo(this, zzbedVar, context, uri));
            zzbedVar.zzb((Activity) context);
            return 5;
        }
        s.g gVarA = new g.d(com.google.android.gms.ads.internal.zzv.zzf().zza()).a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfa)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzb();
            if (com.google.android.gms.ads.internal.util.client.zzf.zzw()) {
                return 5;
            }
        }
        Intent intent = gVarA.f45885a;
        intent.setPackage(zzhgo.zza(context));
        intent.setData(uri);
        C5848a.startActivity(context, intent, gVarA.f45886b);
        return 5;
    }
}
