package com.bytedance.sdk.component.adexpress.emc.ypw;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.emc.xq.emc;
import com.bytedance.sdk.component.utils.lt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public abstract class xq {
    public abstract File emc();

    public boolean emc(Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar = map.get(it.next());
            if (emcVar != null && !emc(emcVar.ycc())) {
                return false;
            }
        }
        return true;
    }

    public void xq(List<emc.C0024emc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<emc.C0024emc> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(emc(), com.bytedance.sdk.component.utils.bw.emc(it.next().emc()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<emc.C0024emc> ypw(com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar, com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<emc.C0024emc> arrayList3 = new ArrayList<>();
        if (emcVar2 == null || emcVar2.ycc().isEmpty()) {
            arrayList2.addAll(emcVar.ycc());
        } else if (emcVar.ycc().isEmpty()) {
            arrayList.addAll(emcVar2.ycc());
        } else {
            for (emc.C0024emc c0024emc : emcVar.ycc()) {
                if (!emcVar2.ycc().contains(c0024emc) && c0024emc != null && c0024emc.emc() != null && c0024emc.ypw() != null) {
                    arrayList2.add(c0024emc);
                }
            }
            for (emc.C0024emc c0024emc2 : emcVar2.ycc()) {
                if (!emcVar.ycc().contains(c0024emc2)) {
                    arrayList.add(c0024emc2);
                }
            }
        }
        if (emc(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public boolean emc(List<emc.C0024emc> list) throws IOException {
        if (list == null || list.size() <= 0 || emc() == null) {
            return false;
        }
        for (emc.C0024emc c0024emc : list) {
            String strEmc = com.bytedance.sdk.component.utils.bw.emc(c0024emc.emc());
            if (TextUtils.isEmpty(strEmc)) {
                return false;
            }
            File file = new File(emc(), strEmc);
            String strEmc2 = com.bytedance.sdk.component.utils.bw.emc(file);
            if (!file.exists() || !file.isFile() || c0024emc.ypw() == null || !c0024emc.ypw().equals(strEmc2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean xq(com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar, com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar2) {
        if (emcVar != null) {
            try {
                if (!TextUtils.isEmpty(emcVar.xq())) {
                    if (emcVar2 == null) {
                        return false;
                    }
                    String strUym = emcVar.uym();
                    String strUym2 = emcVar2.uym();
                    if ((!TextUtils.isEmpty(strUym2) && !strUym2.equals(strUym)) || emc(emcVar.xq(), emcVar2.xq())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc = emcVar.emc();
                    Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc2 = emcVar2.emc();
                    if (mapEmc.isEmpty()) {
                        return !mapEmc2.isEmpty();
                    }
                    if (mapEmc2.isEmpty()) {
                        return false;
                    }
                    return emc(mapEmc, mapEmc2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean emc(emc.ypw ypwVar) {
        if (ypwVar == null || emc() == null) {
            return false;
        }
        List<Pair<String, String>> listYpw = ypwVar.ypw();
        if (listYpw == null || listYpw.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listYpw.iterator();
        while (it.hasNext()) {
            File file = new File(emc(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void ypw(List<emc.C0024emc> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<emc.C0024emc> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(emc(), com.bytedance.sdk.component.utils.bw.emc(it.next().emc()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<emc.C0024emc> emc(com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar, com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc = emcVar.emc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<emc.C0024emc> arrayList3 = new ArrayList<>();
        if (mapEmc.size() == 0) {
            if (emcVar2 != null && emcVar2.emc().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc2 = emcVar2.emc();
                Iterator<String> it = mapEmc2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar3 = mapEmc2.get(it.next());
                    if (emcVar3 != null) {
                        arrayList.addAll(emcVar3.ycc());
                    }
                }
            }
        } else if (emcVar2 != null && emcVar2.emc().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> mapEmc3 = emcVar2.emc();
            for (String str : mapEmc.keySet()) {
                com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar4 = mapEmc.get(str);
                com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar5 = mapEmc3.get(str);
                if (emcVar5 == null && emcVar4 != null) {
                    arrayList2.addAll(emcVar4.ycc());
                } else if (emcVar4 == null && emcVar5 != null) {
                    arrayList.addAll(emcVar5.ycc());
                } else if (emcVar4 != null) {
                    for (emc.C0024emc c0024emc : emcVar4.ycc()) {
                        if (c0024emc != null && !emcVar5.ycc().contains(c0024emc) && c0024emc.ypw() != null && c0024emc.emc() != null) {
                            arrayList2.add(c0024emc);
                        }
                    }
                    for (emc.C0024emc c0024emc2 : emcVar5.ycc()) {
                        if (c0024emc2 != null && !emcVar4.ycc().contains(c0024emc2)) {
                            arrayList.add(c0024emc2);
                        }
                    }
                }
            }
        } else if (mapEmc.size() != 0) {
            Iterator<String> it2 = mapEmc.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar6 = mapEmc.get(it2.next());
                if (emcVar6 != null) {
                    arrayList2.addAll(emcVar6.ycc());
                }
            }
        }
        if (emc(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void ypw(File file, com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar, String str) {
        if (emcVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (emcVar.ycc() != null) {
            Iterator<emc.C0024emc> it = emcVar.ycc().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.bw.emc(it.next().emc())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean emc(List<emc.C0024emc> list, List<emc.C0024emc> list2) {
        for (emc.C0024emc c0024emc : list) {
            String strEmc = c0024emc.emc();
            String strEmc2 = com.bytedance.sdk.component.utils.bw.emc(strEmc);
            File file = new File(emc(), strEmc2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.uym.ypw.emc emcVarYcc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ycc();
            emcVarYcc.ypw(strEmc);
            emcVarYcc.emc(emc().getAbsolutePath(), strEmc2);
            com.bytedance.sdk.component.uym.ypw ypwVarEmc = emcVarYcc.emc();
            list2.add(c0024emc);
            if (ypwVarEmc == null || !ypwVarEmc.ycc() || ypwVarEmc.bw() == null || !ypwVarEmc.bw().exists()) {
                xq(list2);
                return false;
            }
        }
        return true;
    }

    public boolean emc(String str) {
        File file = new File(emc().getAbsoluteFile(), AbstractC2763b.e(com.bytedance.sdk.component.utils.bw.emc(str), ".zip"));
        com.bytedance.sdk.component.uym.ypw.emc emcVarYcc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq().ycc();
        emcVarYcc.ypw(str);
        emcVarYcc.emc(file.getParent(), file.getName());
        com.bytedance.sdk.component.uym.ypw ypwVarEmc = emcVarYcc.emc();
        if (ypwVarEmc.ycc() && ypwVarEmc.bw() != null && ypwVarEmc.bw().exists()) {
            File fileBw = ypwVarEmc.bw();
            try {
                lt.emc(fileBw.getAbsolutePath(), file.getParent());
                if (!fileBw.exists()) {
                    return true;
                }
                fileBw.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void emc(int i) {
        if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().dg() != null) {
            com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().dg().emc(i);
        }
    }

    public static void emc(File file, com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar, String str) {
        FileOutputStream fileOutputStream;
        if (emcVar == null) {
            return;
        }
        String strRu = emcVar.ru();
        if (TextUtils.isEmpty(strRu)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.write(strRu.getBytes("utf-8"));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file3.renameTo(file2);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable unused3) {
            fileOutputStream = null;
        }
    }

    private static boolean emc(Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> map, Map<String, com.bytedance.sdk.component.adexpress.emc.xq.emc> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar = map.get(str);
            if (emcVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar2 = map2.get(str);
            if (emcVar2 == null) {
                return false;
            }
            if (emc(emcVar.xq(), emcVar2.xq())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean emc(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.emc.ypw.xq.emc(java.lang.String, java.lang.String):boolean");
    }

    public static boolean emc(com.bytedance.sdk.component.adexpress.emc.xq.emc emcVar, String str) {
        if (emcVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(emcVar.xq())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return emc(emcVar.xq(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
