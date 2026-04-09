package com.singular.sdk.internal;

import N7.B8;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.singular.sdk.SingularLinkHandler;
import com.singular.sdk.SingularLinkParams;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class Utils {
    private static int asidScope;
    private static double asidTimeinterval;
    private static final SingularLog logger = SingularLog.getLogger("Utils");
    private static String wrapperName = null;
    private static String wrapperVersion = null;
    private static String imei = null;

    private Utils() {
    }

    public static boolean appMovedToBackground() {
        SingularInstance.getInstance().getSingularConfig().isOpenedWithDeepLink = false;
        return false;
    }

    public static String bytesToHexString(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b10 = bArr[i];
            int i10 = i * 2;
            cArr2[i10] = cArr[(b10 & 255) >>> 4];
            cArr2[i10 + 1] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    private static UUID createSingularId(SharedPreferences sharedPreferences) {
        UUID uuidRandomUUID = UUID.randomUUID();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(Constants.PREF_SINGULAR_ID_KEY, uuidRandomUUID.toString());
        editorEdit.commit();
        return uuidRandomUUID;
    }

    public static String extractDeepLink(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (!isESPLink(uri) && uri.getHost() != null && !uri.getHost().endsWith(Constants.DEFAULT_SINGULAR_LINK_DOMAIN)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter(Constants.QUERY_ANDROID_DEEPLINK);
        return queryParameter != null ? queryParameter : uri.getQueryParameter(Constants.QUERY_DEEPLINK);
    }

    public static String extractPassthroughFromSingularLink(Uri uri) {
        return uri.getQueryParameter(Constants.QUERY_DEEPLINK_PASSTHROUGH);
    }

    public static String formatException(Throwable th) {
        return "Exception: \n" + th.getMessage() + "\nStack trace: \n" + getStackTrace(th);
    }

    public static String formatTimestamp(long j4) {
        return new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format(Long.valueOf(j4));
    }

    public static int getASIDScope() {
        return asidScope;
    }

    public static double getASIDTimeInterval() {
        return asidTimeinterval;
    }

    public static long getAdmonEventIndex(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_ADMON_EVENT_INDEX, 0);
        return increaseAdmonEventIndex(sharedPreferences, sharedPreferences.getLong(Constants.PREF_ADMON_EVENT_INDEX_KEY, -1L));
    }

    private static Object getAdvertisingInfoObject(Context context) throws Exception {
        return SLReflectionUtils.invokeStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class}, context);
    }

    public static String getAmazonId(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), Constants.AMAZON_ADVERTISING_ID);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAndroidId(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        return !getInvalidDeviceIds().contains(string) ? string : "None";
    }

    public static String getAppSetId(Context context) {
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            final long currentTimeMillis = getCurrentTimeMillis();
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.singular.sdk.internal.Utils.1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(AppSetIdInfo appSetIdInfo2) {
                    int unused = Utils.asidScope = appSetIdInfo2.getScope();
                    linkedBlockingQueue.offer(appSetIdInfo2.getId());
                    double unused2 = Utils.asidTimeinterval = Utils.lagSince(currentTimeMillis);
                }
            });
            String str = (String) linkedBlockingQueue.poll(1L, TimeUnit.SECONDS);
            if (isEmptyOrNull(str)) {
                return null;
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long getBatchSendId(Context context) {
        return context.getSharedPreferences(Constants.PREF_BATCH_SEND_ID, 0).getLong("sendId", 0L);
    }

    public static String getCSIReferrer(Context context) {
        return context.getSharedPreferences(Constants.PREF_INSTALL_REFERRER, 0).getString(Constants.PREF_CSI_REFERRER_KEY, null);
    }

    public static String getConnectionType(Context context) {
        if (isConnectedMobile(context)) {
            return Constants.WWAN;
        }
        isConnectedWifi(context);
        return Constants.WIFI;
    }

    public static String getCpuAbi() {
        return SLReflectionUtils.getCpuAbi();
    }

    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static Method getDeclaredMethod(Object obj, String str, Class<?>... clsArr) {
        try {
            return obj.getClass().getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            SingularLog singularLog = logger;
            StringBuilder sbK = B8.k("Method ", str, " was not found in ");
            sbK.append(obj != null ? obj.getClass().getName() : null);
            singularLog.debug(sbK.toString());
            return null;
        } catch (SecurityException e4) {
            logger.debug("Security violation occured ", e4);
            return null;
        }
    }

    public static long getEventIndex(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_EVENT_INDEX, 0);
        return increaseEventIndex(sharedPreferences, sharedPreferences.getLong(Constants.PREF_EVENT_INDEX_KEY, -1L));
    }

    public static String getImei() {
        return imei;
    }

    public static Set<String> getInvalidDeviceIds() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add(Constants.PLATFORM);
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        hashSet.add("0000-0000");
        return hashSet;
    }

    public static Locale getLocale(Configuration configuration) {
        Locale localeFromLocaleList = SLReflectionUtils.getLocaleFromLocaleList(configuration);
        return localeFromLocaleList != null ? localeFromLocaleList : SLReflectionUtils.getLocaleFromField(configuration);
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static String getPlayStoreAdId(Context context) {
        String str;
        try {
            str = (String) SLReflectionUtils.invokeInstanceMethod(getAdvertisingInfoObject(context), "getId", null, new Object[0]);
        } catch (Throwable unused) {
        }
        if (isInvalidDeviceId(str)) {
            return null;
        }
        return str;
    }

    public static String getPlayStoreAdIdByBackupMethod(Context context) {
        String aifa;
        try {
            aifa = ExternalAIFAHelper.getAIFA(context);
        } catch (Throwable unused) {
        }
        if (isInvalidDeviceId(aifa)) {
            return null;
        }
        return aifa;
    }

    public static String getSdkVersion() {
        String str;
        String str2 = SingularInstance.getInstance().getDeviceInfo().sdkVersion;
        String str3 = wrapperName;
        if (str3 == null || (str = wrapperVersion) == null) {
            return str2;
        }
        return str2 + "-" + str3 + "/" + str;
    }

    public static UUID getSingularId(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_SINGULAR_ID, 0);
        String string = sharedPreferences.getString(Constants.PREF_SINGULAR_ID_KEY, null);
        return string != null ? UUID.fromString(string) : createSingularId(sharedPreferences);
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String[] getSupportedAbis() {
        return SLReflectionUtils.getSupportedAbis();
    }

    public static String getWrapperName() {
        return wrapperName;
    }

    public static boolean handleDeepLink(final SingularLinkParams singularLinkParams) {
        final SingularLinkHandler singularLinkHandler = SingularInstance.getInstance().getSingularConfig().linkCallback;
        if (singularLinkParams.getDeeplink() == null || singularLinkHandler == null) {
            return false;
        }
        new Runnable() { // from class: com.singular.sdk.internal.Utils.2
            @Override // java.lang.Runnable
            public void run() {
                singularLinkHandler.onResolved(singularLinkParams);
            }
        }.run();
        return true;
    }

    public static void handleSingularLink(Uri uri) {
        String strExtractDeepLink = extractDeepLink(uri);
        if (strExtractDeepLink != null) {
            handleDeepLink(new SingularLinkParams(strExtractDeepLink, extractPassthroughFromSingularLink(uri), false, uri));
        }
    }

    public static long incBatchSendId(Context context) {
        long batchSendId = getBatchSendId(context) + 1;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_BATCH_SEND_ID, 0).edit();
            editorEdit.putLong("sendId", batchSendId);
            editorEdit.commit();
            return batchSendId;
        } catch (Throwable th) {
            logger.error(formatException(th));
            return batchSendId;
        }
    }

    private static long increaseAdmonEventIndex(SharedPreferences sharedPreferences, long j4) {
        long j10 = j4 + 1;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(Constants.PREF_ADMON_EVENT_INDEX_KEY, j10);
        editorEdit.commit();
        return j10;
    }

    private static long increaseEventIndex(SharedPreferences sharedPreferences, long j4) {
        long j10 = j4 + 1;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(Constants.PREF_EVENT_INDEX_KEY, j10);
        editorEdit.commit();
        return j10;
    }

    public static boolean isAmazonAvailable(Context context) throws Settings.SettingNotFoundException {
        try {
            Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking");
            return true;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    public static boolean isAmazonLimitAdTracking(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking") != 0;
    }

    public static boolean isConnected(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean isConnectedMobile(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
    }

    public static boolean isConnectedWifi(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
    }

    public static boolean isESPLink(Uri uri) {
        if (uri == null || SingularInstance.getInstance() == null || SingularInstance.getInstance().getSingularConfig() == null || SingularInstance.getInstance().getSingularConfig().espDomains == null || SingularInstance.getInstance().getSingularConfig().espDomains.size() == 0) {
            return false;
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse("https://" + uri.toString());
        }
        return isUrlInDomains(uri, SingularInstance.getInstance().getSingularConfig().espDomains);
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isFirstInstall(Context context) {
        if (context.getSharedPreferences(Constants.PREF_FIRST_INSTALL, 0).getBoolean(Constants.WAS_OPENED_AFTER_INSTALL, false)) {
            return false;
        }
        saveFirstInstallInfo(context);
        return true;
    }

    public static boolean isGooglePlayServicesAvailable() {
        return SLReflectionUtils.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient") != null;
    }

    public static boolean isInvalidDeviceId(String str) {
        if (isEmptyOrNull(str)) {
            return false;
        }
        return getInvalidDeviceIds().contains(str) || Pattern.compile("^[0-]+$").matcher(str).matches();
    }

    public static boolean isLicenseRetrieved(Context context, String str) {
        return context.getSharedPreferences(Constants.LICENSING_API_KEY, 0).getBoolean(str, false);
    }

    public static boolean isLimitedTrackingEnabled(Context context) {
        try {
            return ((Boolean) SLReflectionUtils.invokeInstanceMethod(getAdvertisingInfoObject(context), "isLimitAdTrackingEnabled", null, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean isOpenedWithDeeplink() {
        return SingularInstance.getInstance().getSingularConfig().isOpenedWithDeepLink;
    }

    public static boolean isShortLink(Uri uri) {
        return (isESPLink(uri) || uri.getHost() == null || uri.getHost().endsWith(Constants.DEFAULT_SINGULAR_LINK_DOMAIN)) && extractDeepLink(uri) == null;
    }

    private static boolean isUrlInDomains(Uri uri, List<String> list) {
        for (String str : list) {
            if (uri.getHost() != null && uri.getHost().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static double lagSince(long j4) {
        return (getCurrentTimeMillis() - j4) * 0.001d;
    }

    public static Uri resolveESPLink(Uri uri) throws IOException {
        try {
            URL url = new URL(uri.toString());
            HttpURLConnection httpsConnection = url.getProtocol().equalsIgnoreCase("https") ? SingularRequestHandler.getHttpsConnection(url) : SingularRequestHandler.getHttpConnection(url);
            httpsConnection.setInstanceFollowRedirects(false);
            httpsConnection.connect();
            String headerField = httpsConnection.getHeaderField("Location");
            if (headerField == null) {
                return null;
            }
            return Uri.parse(headerField);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void saveCSIReferrer(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_INSTALL_REFERRER, 0).edit();
        editorEdit.putString(Constants.PREF_CSI_REFERRER_KEY, str);
        editorEdit.commit();
    }

    private static void saveFirstInstallInfo(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_FIRST_INSTALL, 0).edit();
        editorEdit.putBoolean(Constants.WAS_OPENED_AFTER_INSTALL, true);
        editorEdit.commit();
    }

    public static void saveLicenseInfo(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.LICENSING_API_KEY, 0).edit();
        editorEdit.putBoolean(str, true);
        editorEdit.commit();
    }

    public static void setImei(String str) {
        imei = str;
    }

    public static void setWrapperNameAndVersion(String str, String str2) {
        wrapperName = str;
        wrapperVersion = str2;
    }

    public static String sha1Hash(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str2.getBytes(Constants.ENCODING));
            messageDigest.update(str.getBytes(Constants.ENCODING));
            return bytesToHexString(messageDigest.digest());
        } catch (Throwable th) {
            logger.error("error in sha1Hash()", th);
            return null;
        }
    }

    public static boolean validateSingularLink(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (uri.getScheme() == null) {
            uri = Uri.parse("https://" + uri.toString());
        }
        return uri.getHost() != null;
    }
}
