package com.amazonaws.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class DateUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f34149a = TimeZone.getTimeZone("GMT");

    /* renamed from: b, reason: collision with root package name */
    private static final Map f34150b = new HashMap();

    public static String b(String str, Date date) {
        return ((SimpleDateFormat) c(str).get()).format(date);
    }

    private static ThreadLocal c(final String str) {
        Map map = f34150b;
        ThreadLocal<SimpleDateFormat> threadLocal = (ThreadLocal) map.get(str);
        if (threadLocal == null) {
            synchronized (map) {
                try {
                    threadLocal = (ThreadLocal) map.get(str);
                    if (threadLocal == null) {
                        threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.amazonaws.util.DateUtils.1
                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // java.lang.ThreadLocal
                            /* renamed from: a, reason: merged with bridge method [inline-methods] */
                            public SimpleDateFormat initialValue() {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
                                simpleDateFormat.setTimeZone(DateUtils.f34149a);
                                simpleDateFormat.setLenient(false);
                                return simpleDateFormat;
                            }
                        };
                        map.put(str, threadLocal);
                    }
                } finally {
                }
            }
        }
        return threadLocal;
    }
}
