package b8;

import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class f {
    public static int a(String str) {
        double d10 = -2.0d;
        for (String str2 : str.split("\\.")) {
            d10 += 256.0d - Double.parseDouble(str2);
        }
        return 32 - ((int) (Math.log(d10) / Math.log(2.0d)));
    }

    public static void b(Context context, Map map) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            map.put(j(r3.getIpAddress()), wifiManager.getConnectionInfo().getMacAddress());
        }
    }

    public static boolean c(Context context) throws IOException {
        boolean zExists = false;
        try {
            File file = new File(context.getDatabasePath(x7.a.f24982a).getParent().toString() + "/" + x7.a.f24982a);
            zExists = file.exists();
            if (zExists) {
                return zExists;
            }
            file.createNewFile();
            return zExists;
        } catch (Exception e10) {
            c.a("Database doesn't exist", e10);
            return zExists;
        }
    }

    public static void d(Context context) throws Resources.NotFoundException, IOException {
        String string = context.getDatabasePath(x7.a.f24982a).getParent().toString();
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(c8.a.vendor);
        FileOutputStream fileOutputStream = new FileOutputStream(string + "/" + x7.a.f24982a);
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStreamOpenRawResource.read(bArr);
            if (i10 <= 0) {
                fileOutputStream.flush();
                fileOutputStream.close();
                inputStreamOpenRawResource.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e() throws java.lang.Throwable {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.String r4 = "/proc/net/arp"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
        L12:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1f
            if (r1 == 0) goto L21
            r0.add(r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1f
            goto L12
        L1c:
            r0 = move-exception
            r1 = r2
            goto L39
        L1f:
            r1 = move-exception
            goto L30
        L21:
            r2.close()     // Catch: java.io.IOException -> L25
            return r0
        L25:
            r1 = move-exception
            r1.printStackTrace()
            goto L38
        L2a:
            r0 = move-exception
            goto L39
        L2c:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L30:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.io.IOException -> L25
        L38:
            return r0
        L39:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.io.IOException -> L3f
            goto L43
        L3f:
            r1 = move-exception
            r1.printStackTrace()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.f.e():java.util.ArrayList");
    }

    public static HashMap f() throws InterruptedException, IOException {
        HashMap map = new HashMap();
        try {
            Process processExec = Runtime.getRuntime().exec("ip neigh show");
            processExec.waitFor();
            processExec.exitValue();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return map;
                }
                String[] strArrSplit = line.split(" ");
                if (strArrSplit.length >= 4 && strArrSplit[4].matches("..:..:..:..:..:..") && !strArrSplit[4].equals("00:00:00:00:00:00")) {
                    map.put(strArrSplit[0], strArrSplit[4]);
                }
            }
        } catch (IOException | InterruptedException e10) {
            e10.printStackTrace();
            return map;
        }
    }

    public static String g(NetworkInterface networkInterface) {
        if (networkInterface == null) {
            return "0.0.0.0";
        }
        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddressNextElement = inetAddresses.nextElement();
            if (!inetAddressNextElement.isLoopbackAddress() && !(inetAddressNextElement instanceof Inet6Address)) {
                return inetAddressNextElement.getHostAddress();
            }
        }
        return "0.0.0.0";
    }

    public static String h() throws SocketException {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = list.get(i10);
                i10++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b10)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString().toLowerCase();
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception e10) {
            c.a("WYNetworkUtils getMacAddr exception", e10);
            return "02:00:00:00:00:00";
        }
    }

    public static long i(String str) {
        String[] strArrSplit = str.split("[.]");
        long j10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            j10 += Long.parseLong(strArrSplit[i10]) << (i10 * 8);
        }
        return j10;
    }

    public static String j(long j10) {
        String str = "";
        for (int i10 = 0; i10 < 4; i10++) {
            str = str + ((j10 >> (i10 * 8)) & 255) + ".";
        }
        return str.substring(0, str.length() - 1);
    }

    public static long k(long j10) {
        long j11 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            j11 += (((255 << r3) & j10) >> (i10 * 8)) << ((3 - i10) * 8);
        }
        return j11;
    }

    public static String l(String str, String str2, String str3) throws IOException {
        Matcher matcher;
        try {
            if (new File(str).exists()) {
                Pattern patternCompile = Pattern.compile(str3);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str + str2).getInputStream()), 8192);
                do {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        matcher = patternCompile.matcher(line);
                    }
                } while (!matcher.matches());
                return matcher.group(1);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void m(Context context, Map map) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            n(context, map);
            return;
        }
        Scanner scanner = null;
        try {
            try {
                Scanner scanner2 = new Scanner(new File("/proc/net/arp"));
                try {
                    map.clear();
                    while (scanner2.hasNextLine()) {
                        String strNextLine = scanner2.nextLine();
                        if (strNextLine != null && !strNextLine.contains("00:00:00:00:00:00") && strNextLine.matches(".*?(\\d+).*?")) {
                            String strReplaceAll = strNextLine.replaceAll(".*?(\\d+[.]\\d+[.]\\d+[.]\\d+).*", "$1");
                            String strReplaceAll2 = strNextLine.replaceAll(".*?(\\w+:\\w+:\\w+:\\w+:\\w+:\\w+).*", "$1");
                            if (strReplaceAll != null && strReplaceAll2 != null) {
                                map.put(strReplaceAll, strReplaceAll2);
                            }
                        }
                    }
                    b(context, map);
                    scanner2.close();
                } catch (Exception e10) {
                    e = e10;
                    scanner = scanner2;
                    e.printStackTrace();
                    if (scanner != null) {
                        scanner.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    scanner = scanner2;
                    if (scanner != null) {
                        scanner.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static void n(Context context, Map map) throws Throwable {
        map.clear();
        map.putAll(f());
        ArrayList arrayListE = e();
        int size = arrayListE.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListE.get(i10);
            i10++;
            String[] strArrSplit = ((String) obj).split(" +");
            if (strArrSplit.length >= 4 && strArrSplit[3].matches("..:..:..:..:..:..") && !strArrSplit[3].equals("00:00:00:00:00:00") && !map.containsKey(strArrSplit[0])) {
                map.put(strArrSplit[0], strArrSplit[3]);
            }
        }
        b(context, map);
    }
}
