package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n32 implements y32 {
    public static final Pattern f = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    public static final Pattern g = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // defpackage.y32
    public final void c(Object obj, Map map) throws NumberFormatException {
        ag2 ag2Var = (ag2) obj;
        String str = (String) map.get("action");
        boolean zEquals = "tick".equals(str);
        Pattern pattern = f;
        if (!zEquals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    gi2.i0("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) tw1.e.c.a(mz1.i2)).booleanValue() || g.matcher(str2).matches()) {
                    ((tz1) ag2Var.m().h).c("e", str2);
                    return;
                } else {
                    gi2.U("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    gi2.i0("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    gi2.i0("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) tw1.e.c.a(mz1.i2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((tz1) ag2Var.m().h).c(str3, str4);
                    return;
                } else {
                    gi2.U("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            gi2.i0("No label given for CSI tick.");
            return;
        }
        iz1 iz1Var = mz1.i2;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && !pattern.matcher(str5).matches()) {
            gi2.U("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            gi2.i0("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j = Long.parseLong(str7);
            hg4 hg4Var = hg4.C;
            hg4Var.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            hg4Var.k.getClass();
            long jElapsedRealtime = (j - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && !pattern.matcher(str6).matches()) {
                gi2.U("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            vq2 vq2VarM = ag2Var.m();
            HashMap map2 = (HashMap) vq2VarM.g;
            rz1 rz1Var = (rz1) map2.get(str6);
            String[] strArr = {str5};
            if (rz1Var != null) {
                ((tz1) vq2VarM.h).a(rz1Var, jElapsedRealtime, strArr);
            }
            map2.put(str5, new rz1(jElapsedRealtime, null, null));
        } catch (NumberFormatException unused) {
            gi2.q0(5);
        }
    }
}
