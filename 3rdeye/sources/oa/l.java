package oa;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SimpleDateTimeTextProvider.java */
/* loaded from: classes3.dex */
public final class l extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f44938c = new a();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f44939b = new ConcurrentHashMap(16, 0.75f, 2);

    /* compiled from: SimpleDateTimeTextProvider.java */
    public class a implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        public final int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* compiled from: SimpleDateTimeTextProvider.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<m, Map<Long, String>> f44940a;

        public b(Map<m, Map<Long, String>> map) {
            this.f44940a = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (m mVar : map.keySet()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(mVar).entrySet()) {
                    String value = entry.getValue();
                    String value2 = entry.getValue();
                    Long key = entry.getKey();
                    a aVar = l.f44938c;
                    map3.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
                }
                ArrayList arrayList2 = new ArrayList(map3.values());
                Collections.sort(arrayList2, l.f44938c);
                map2.put(mVar, arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Collections.sort(arrayList, l.f44938c);
        }
    }

    public static b b(HashMap map) {
        map.put(m.FULL_STANDALONE, map.get(m.FULL));
        map.put(m.SHORT_STANDALONE, map.get(m.SHORT));
        m mVar = m.NARROW;
        if (map.containsKey(mVar)) {
            m mVar2 = m.NARROW_STANDALONE;
            if (!map.containsKey(mVar2)) {
                map.put(mVar2, map.get(mVar));
            }
        }
        return new b(map);
    }

    public static String c(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    public static String d(int i, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i) : str.substring(0, 1);
    }

    @Override // oa.h
    public final String a(qa.a aVar, long j4, m mVar, Locale locale) {
        Map<Long, String> map;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        ConcurrentHashMap concurrentHashMap;
        Object objB;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(aVar, locale);
        ConcurrentHashMap concurrentHashMap2 = this.f44939b;
        Object obj = concurrentHashMap2.get(simpleImmutableEntry2);
        if (obj == null) {
            if (aVar == qa.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap map2 = new HashMap();
                String[] months = dateFormatSymbols.getMonths();
                simpleImmutableEntry = simpleImmutableEntry2;
                HashMap map3 = new HashMap();
                concurrentHashMap = concurrentHashMap2;
                map3.put(1L, months[0]);
                map3.put(2L, months[1]);
                map3.put(3L, months[2]);
                map3.put(4L, months[3]);
                map3.put(5L, months[4]);
                map3.put(6L, months[5]);
                map3.put(7L, months[6]);
                map3.put(8L, months[7]);
                map3.put(9L, months[8]);
                map3.put(10L, months[9]);
                map3.put(11L, months[10]);
                map3.put(12L, months[11]);
                map2.put(m.FULL, map3);
                HashMap map4 = new HashMap();
                map4.put(1L, d(1, months[0], locale));
                map4.put(2L, d(2, months[1], locale));
                map4.put(3L, d(3, months[2], locale));
                map4.put(4L, d(4, months[3], locale));
                map4.put(5L, d(5, months[4], locale));
                map4.put(6L, d(6, months[5], locale));
                map4.put(7L, d(7, months[6], locale));
                map4.put(8L, d(8, months[7], locale));
                map4.put(9L, d(9, months[8], locale));
                map4.put(10L, d(10, months[9], locale));
                map4.put(11L, d(11, months[10], locale));
                map4.put(12L, d(12, months[11], locale));
                map2.put(m.NARROW, map4);
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                HashMap map5 = new HashMap();
                map5.put(1L, shortMonths[0]);
                map5.put(2L, shortMonths[1]);
                map5.put(3L, shortMonths[2]);
                map5.put(4L, shortMonths[3]);
                map5.put(5L, shortMonths[4]);
                map5.put(6L, shortMonths[5]);
                map5.put(7L, shortMonths[6]);
                map5.put(8L, shortMonths[7]);
                map5.put(9L, shortMonths[8]);
                map5.put(10L, shortMonths[9]);
                map5.put(11L, shortMonths[10]);
                map5.put(12L, shortMonths[11]);
                map2.put(m.SHORT, map5);
                objB = b(map2);
            } else {
                simpleImmutableEntry = simpleImmutableEntry2;
                concurrentHashMap = concurrentHashMap2;
                if (aVar == qa.a.DAY_OF_WEEK) {
                    DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                    HashMap map6 = new HashMap();
                    String[] weekdays = dateFormatSymbols2.getWeekdays();
                    HashMap map7 = new HashMap();
                    map7.put(1L, weekdays[2]);
                    map7.put(2L, weekdays[3]);
                    map7.put(3L, weekdays[4]);
                    map7.put(4L, weekdays[5]);
                    map7.put(5L, weekdays[6]);
                    map7.put(6L, weekdays[7]);
                    map7.put(7L, weekdays[1]);
                    map6.put(m.FULL, map7);
                    HashMap map8 = new HashMap();
                    map8.put(1L, c(1, weekdays[2], locale));
                    map8.put(2L, c(2, weekdays[3], locale));
                    map8.put(3L, c(3, weekdays[4], locale));
                    map8.put(4L, c(4, weekdays[5], locale));
                    map8.put(5L, c(5, weekdays[6], locale));
                    map8.put(6L, c(6, weekdays[7], locale));
                    map8.put(7L, c(7, weekdays[1], locale));
                    map6.put(m.NARROW, map8);
                    String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                    HashMap map9 = new HashMap();
                    map9.put(1L, shortWeekdays[2]);
                    map9.put(2L, shortWeekdays[3]);
                    map9.put(3L, shortWeekdays[4]);
                    map9.put(4L, shortWeekdays[5]);
                    map9.put(5L, shortWeekdays[6]);
                    map9.put(6L, shortWeekdays[7]);
                    map9.put(7L, shortWeekdays[1]);
                    map6.put(m.SHORT, map9);
                    objB = b(map6);
                } else if (aVar == qa.a.AMPM_OF_DAY) {
                    DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                    HashMap map10 = new HashMap();
                    String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                    HashMap map11 = new HashMap();
                    map11.put(0L, amPmStrings[0]);
                    map11.put(1L, amPmStrings[1]);
                    map10.put(m.FULL, map11);
                    map10.put(m.SHORT, map11);
                    objB = b(map10);
                } else if (aVar == qa.a.ERA) {
                    DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                    HashMap map12 = new HashMap();
                    String[] eras = dateFormatSymbols4.getEras();
                    HashMap map13 = new HashMap();
                    map13.put(0L, eras[0]);
                    map13.put(1L, eras[1]);
                    map12.put(m.SHORT, map13);
                    if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                        HashMap map14 = new HashMap();
                        map14.put(0L, "Before Christ");
                        map14.put(1L, "Anno Domini");
                        map12.put(m.FULL, map14);
                    } else {
                        map12.put(m.FULL, map13);
                    }
                    HashMap map15 = new HashMap();
                    map15.put(0L, eras[0].substring(0, 1));
                    map15.put(1L, eras[1].substring(0, 1));
                    map12.put(m.NARROW, map15);
                    objB = b(map12);
                } else if (aVar == qa.c.f45467a) {
                    HashMap map16 = new HashMap();
                    HashMap map17 = new HashMap();
                    map17.put(1L, "Q1");
                    map17.put(2L, "Q2");
                    map17.put(3L, "Q3");
                    map17.put(4L, "Q4");
                    map16.put(m.SHORT, map17);
                    HashMap map18 = new HashMap();
                    map18.put(1L, "1st quarter");
                    map18.put(2L, "2nd quarter");
                    map18.put(3L, "3rd quarter");
                    map18.put(4L, "4th quarter");
                    map16.put(m.FULL, map18);
                    objB = b(map16);
                } else {
                    objB = "";
                }
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
            concurrentHashMap3.putIfAbsent(simpleImmutableEntry3, objB);
            obj = concurrentHashMap3.get(simpleImmutableEntry3);
        }
        if (!(obj instanceof b) || (map = ((b) obj).f44940a.get(mVar)) == null) {
            return null;
        }
        return map.get(Long.valueOf(j4));
    }
}
