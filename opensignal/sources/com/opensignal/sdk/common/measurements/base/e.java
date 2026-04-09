package com.opensignal.sdk.common.measurements.base;

import android.telephony.ServiceState;
import ch.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f5854b = Pattern.compile("(?<=availableServices=\\[)(.*?)(?=\\])");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5855c = Pattern.compile("NrBearerStatus\\s*=\\s*(\\d*)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f5856d = Pattern.compile("mNrFrequencyRange\\s*=\\s*(\\d*)");

    /* renamed from: a, reason: collision with root package name */
    public final ch.f f5857a;

    public e(ch.f fVar) {
        this.f5857a = fVar;
    }

    public static Integer a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            try {
                return Integer.valueOf(matcher.group(1));
            } catch (NumberFormatException e4) {
                n.g("NrStateExtractor", "getIntegerValueWithRegex() throw exception = [" + e4 + "]");
            }
        }
        return null;
    }

    public final Integer b(ServiceState serviceState, String str) {
        String strGroup;
        if (!this.f5857a.e() || serviceState == null) {
            return null;
        }
        String string = serviceState.toString();
        String[] strArrSplit = (string == null || !string.contains("NetworkRegistrationInfo{")) ? new String[0] : string.split("NetworkRegistrationInfo\\{");
        int length = strArrSplit.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String str2 = strArrSplit[i10];
            ArrayList arrayList = new ArrayList();
            Matcher matcher = f5854b.matcher(str2);
            while (matcher.find()) {
                for (int i11 = 0; i11 < matcher.groupCount(); i11++) {
                    arrayList.add(matcher.group(i11));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3 != null && str3.contains("DATA")) {
                    Matcher matcher2 = Pattern.compile(str).matcher(str2);
                    strGroup = matcher2.find() ? matcher2.group(0) : null;
                }
            }
            i10++;
        }
        if (strGroup == null) {
            return null;
        }
        try {
            return d.valueOf(strGroup).value;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }
}
