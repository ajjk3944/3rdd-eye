package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzamj {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "white");
        s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "lime");
        s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map, "cyan");
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map, "red");
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map, "yellow");
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "magenta");
        s.l(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map, "blue");
        s.l(0, 0, 0, map, "black");
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_white");
        s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_lime");
        s.l(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_cyan");
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, map2, "bg_red");
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0, map2, "bg_yellow");
        s.l(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_magenta");
        s.l(0, 0, KotlinVersion.MAX_COMPONENT_VALUE, map2, "bg_blue");
        s.l(0, 0, 0, map2, "bg_black");
        zzd = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zza(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamj.zza(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static zzcs zzb(String str) {
        zzamh zzamhVar = new zzamh();
        zzh(str, zzamhVar);
        return zzamhVar.zza();
    }

    public static zzamc zzc(zzen zzenVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzz = zzenVar.zzz(charset);
        if (strZzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzenVar, list);
            }
            String strZzz2 = zzenVar.zzz(charset);
            if (strZzz2 != null) {
                Matcher matcher2 = pattern.matcher(strZzz2);
                if (matcher2.matches()) {
                    return zze(strZzz.trim(), matcher2, zzenVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzamf zzamfVar) {
        List listZzf = zzf(list, str, zzamfVar);
        for (int i = 0; i < listZzf.size(); i++) {
            zzamb zzambVar = ((zzamg) listZzf.get(i)).zzb;
            if (zzambVar.zze() != -1) {
                return zzambVar.zze();
            }
        }
        return -1;
    }

    private static zzamc zze(String str, Matcher matcher, zzen zzenVar, List list) {
        zzamh zzamhVar = new zzamh();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzamhVar.zza = zzaml.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzamhVar.zzb = zzaml.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zzh(strGroup3, zzamhVar);
            StringBuilder sb = new StringBuilder();
            String strZzz = zzenVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzz)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzz.trim());
                strZzz = zzenVar.zzz(StandardCharsets.UTF_8);
            }
            zzamhVar.zzc = zza(str, sb.toString(), list);
            return new zzamc(zzamhVar.zza().zzq(), zzamhVar.zza, zzamhVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzea.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzamf zzamfVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzamb zzambVar = (zzamb) list.get(i);
            int iZzf = zzambVar.zzf(str, zzamfVar.zza, zzamfVar.zzd, zzamfVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new zzamg(iZzf, zzambVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzg(java.lang.String r17, com.google.android.gms.internal.ads.zzamf r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamj.zzg(java.lang.String, com.google.android.gms.internal.ads.zzamf, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(String str, zzamh zzamhVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i10 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                char c10 = 65535;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0) {
                            i10 = 0;
                        } else if (c10 == 1 || c10 == 2) {
                            i10 = 1;
                        } else if (c10 != 3) {
                            zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i10 = RecyclerView.UNDEFINED_DURATION;
                        }
                        zzamhVar.zzg = i10;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzamhVar.zze = zzaml.zza(strGroup2);
                        zzamhVar.zzf = 0;
                    } else {
                        zzamhVar.zze = Integer.parseInt(strGroup2);
                        zzamhVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                c10 = 0;
                                break;
                            }
                            break;
                    }
                    if (c10 != 0) {
                        if (c10 == 1) {
                            i = 4;
                        } else if (c10 == 2 || c10 == 3) {
                            i = 2;
                        } else if (c10 == 4) {
                            i = 3;
                        } else if (c10 != 5) {
                            zzea.zzf("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                        } else {
                            i = 5;
                        }
                    }
                    zzamhVar.zzd = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0 || c10 == 1) {
                            i = 0;
                        } else if (c10 != 2 && c10 != 3) {
                            if (c10 == 4 || c10 == 5) {
                                i = 2;
                            } else {
                                zzea.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i = RecyclerView.UNDEFINED_DURATION;
                            }
                        }
                        zzamhVar.zzi = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzamhVar.zzh = zzaml.zza(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzamhVar.zzj = zzaml.zza(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            c10 = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        c10 = 1;
                    }
                    if (c10 != 0) {
                        if (c10 != 1) {
                            zzea.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = RecyclerView.UNDEFINED_DURATION;
                        } else {
                            i = 2;
                        }
                    }
                    zzamhVar.zzk = i;
                } else {
                    zzea.zzf("WebvttCueParser", "Unknown cue setting " + strGroup + StringUtils.PROCESS_POSTFIX_DELIMITER + strGroup2);
                }
            } catch (NumberFormatException unused) {
                zzea.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
