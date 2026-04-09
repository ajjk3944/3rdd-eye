package com.lefan.signal.tracroute;

import com.lefan.signal.ui.wifi.TraceRouteActivity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public int f18874d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18875e;

    /* renamed from: f, reason: collision with root package name */
    public Process f18876f;

    /* renamed from: g, reason: collision with root package name */
    public TraceRouteActivity f18877g;

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f18871a = Pattern.compile("(?<=From )(?:[0-9]{1,3}\\.){3}[0-9]{1,3}");

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f18872b = Pattern.compile("(?<=from ).*(?=: icmp_seq=1 ttl=)");

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f18873c = Pattern.compile("(?<=time=).*?ms");

    /* renamed from: h, reason: collision with root package name */
    public final Pattern f18878h = Pattern.compile("(?<=\\().*?(?=\\))");

    public static String a(String str) {
        String string = "";
        try {
            Process processExec = Runtime.getRuntime().exec("ping -c 1 ".concat(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    processExec.waitFor();
                    bufferedReader.close();
                    processExec.destroy();
                    return string;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((Object) string);
                sb.append((Object) line);
                string = sb.toString();
            }
        } catch (Throwable th) {
            R2.a.d(th);
            return string;
        }
    }
}
