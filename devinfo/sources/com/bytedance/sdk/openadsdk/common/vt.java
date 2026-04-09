package com.bytedance.sdk.openadsdk.common;

import a0.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.f1;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt {
    private static final HashMap<String, vt> ouw = new HashMap<>();
    private static final HashMap<String, ouw> vt = new HashMap<>();
    private final String fkw;

    /* renamed from: le, reason: collision with root package name */
    private final Map<vpp, Long> f7851le = g.r();

    /* renamed from: lh, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private final Context f7852lh;
    private final ouw yu;

    private vt(Context context, String str) {
        this.f7852lh = context;
        ouw ouwVar = vt.get(str);
        this.yu = ouwVar == null ? new ouw(str) : ouwVar;
        this.fkw = str;
    }

    public final boolean fkw(String str) {
        return this.yu.ra(str);
    }

    public final String lh(String str) {
        long jYu = this.yu.yu(str);
        boolean zFkw = this.yu.fkw(str);
        if (System.currentTimeMillis() - jYu >= 10500000 || zFkw) {
            return null;
        }
        return vt(str);
    }

    public final String vt(String str) {
        try {
            String strVt = this.yu.vt(str);
            if (TextUtils.isEmpty(strVt)) {
                return null;
            }
            return strVt;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void yu(String str) {
        this.yu.le(str);
    }

    public static vt ouw(String str) {
        vt vtVar;
        HashMap<String, vt> map = ouw;
        vt vtVar2 = map.get(str);
        if (vtVar2 != null) {
            return vtVar2;
        }
        synchronized (vt.class) {
            try {
                vtVar = map.get(str);
                if (vtVar == null) {
                    vtVar = new vt(com.bytedance.sdk.openadsdk.core.zih.ouw(), str);
                    map.put(str, vtVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vtVar;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        protected final String ouw;
        private final HashSet<String> ra = new HashSet<>();
        String vt = "material_data";

        /* renamed from: lh, reason: collision with root package name */
        String f7854lh = "has_played";
        String yu = "create_time";
        String fkw = "in_use_process";

        /* renamed from: le, reason: collision with root package name */
        String f7853le = "req_id";

        public ouw(String str) {
            this.ouw = TextUtils.isEmpty(str) ? "" : str;
        }

        public final boolean fkw(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str), this.f7854lh);
            } catch (Throwable unused) {
                return true;
            }
        }

        public final void le(String str) {
            try {
                com.bytedance.sdk.openadsdk.core.zih.ouw();
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str), this.fkw, com.bytedance.sdk.component.utils.zin.ouw());
                this.ra.add(str);
            } catch (Throwable unused) {
            }
        }

        public final String lh(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(ouw(str), this.f7853le, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public String ouw(String str) {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return c.m(new StringBuilder(), this.ouw, "_cache_", str);
        }

        public final void pno(String str) {
            try {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str));
                this.ra.remove(str);
            } catch (Throwable unused) {
            }
        }

        public final boolean ra(String str) {
            String strOuw;
            String strVt;
            try {
                strOuw = ouw(str);
                strVt = com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(strOuw, this.fkw, "");
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(strVt)) {
                return false;
            }
            com.bytedance.sdk.openadsdk.core.zih.ouw();
            if (strVt.equals(com.bytedance.sdk.component.utils.zin.ouw()) && !this.ra.contains(str)) {
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.fkw, "");
                return false;
            }
            return true;
        }

        public String vt(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.vt(ouw(str), this.vt, null);
            } catch (Throwable unused) {
                return null;
            }
        }

        public final long yu(String str) {
            try {
                return com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(ouw(str), this.yu, 0L);
            } catch (Throwable unused) {
                return 0L;
            }
        }

        public void ouw(AdSlot adSlot, String str, String str2) {
            try {
                String codeId = adSlot.getCodeId();
                String strOuw = ouw(codeId);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.f7854lh, Boolean.FALSE);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.yu, Long.valueOf(System.currentTimeMillis()));
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.vt, str);
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.fkw, "");
                com.bytedance.sdk.openadsdk.multipro.yu.yu.ouw(strOuw, this.f7853le, str2);
                this.ra.remove(codeId);
            } catch (Throwable unused) {
            }
        }
    }

    public static void ouw(String str, ouw ouwVar) {
        vt.put(str, ouwVar);
    }

    public final void ouw(String str, vpp vppVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLh = this.yu.lh(str);
        String strUx = vppVar != null ? vppVar.ux() : "";
        if (TextUtils.isEmpty(strLh) || TextUtils.isEmpty(strUx) || strLh.equals(strUx)) {
            this.yu.pno(str);
        }
    }

    public final void ouw() {
        String str;
        File file;
        File[] fileArrListFiles;
        try {
            int i4 = Build.VERSION.SDK_INT;
            boolean zFkw = com.bytedance.sdk.openadsdk.core.bly.fkw(this.fkw);
            if (zFkw) {
                str = "files";
            } else {
                str = "shared_prefs";
            }
            if (i4 >= 24) {
                file = new File(this.f7852lh.getDataDir(), str);
            } else {
                file = new File(this.f7852lh.getDatabasePath("1").getParentFile().getParentFile(), str);
            }
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.common.vt.1
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    if (file2 != null) {
                        return file2.getName().contains(vt.this.fkw);
                    }
                    return false;
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (zFkw) {
                        try {
                            com.bytedance.sdk.component.utils.ra.lh(file2);
                        } catch (Throwable unused) {
                        }
                    } else {
                        String strReplace = file2.getName().replace(".xml", "");
                        if (Build.VERSION.SDK_INT >= 24) {
                            this.f7852lh.deleteSharedPreferences(strReplace);
                        } else {
                            this.f7852lh.getSharedPreferences(strReplace, 0).edit().clear().apply();
                            com.bytedance.sdk.component.utils.ra.lh(file2);
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        try {
            File file3 = new File(((f1) CacheDirFactory.getICacheDir(0)).H());
            if (file3.exists() && file3.isDirectory()) {
                com.bytedance.sdk.component.utils.ra.lh(file3);
            }
        } catch (Throwable unused3) {
        }
    }

    public final void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        vpp vppVarLh;
        if ((ouwVar != null && ouwVar.lh() != null && ouwVar.lh().zn) || ouwVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (vppVarLh = ouwVar.lh()) == null || vppVarLh.yhj() == 2) {
            return;
        }
        try {
            this.yu.ouw(adSlot, ouwVar.f8251cf, ouwVar.ouw());
        } catch (Throwable unused) {
        }
    }

    public static boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        if (ouwVar == null || !ouwVar.vt()) {
            return false;
        }
        Iterator<vpp> it = ouwVar.yu.iterator();
        while (it.hasNext()) {
            vpp next = it.next();
            if (next == null || (!od.lh(next) && next.f8309sd == null)) {
                it.remove();
            }
        }
        return ouwVar.vt();
    }
}
