package com.mbridge.msdk.config.component.database.file;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final String f13299a = "FileOperate";

    public void a(String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d(str.startsWith("DELETE") ? str.replaceFirst("DELETE", "SELECT") : str.startsWith("delete") ? str.replaceFirst("delete", "SELECT") : "");
        if (mapD == null || mapD.isEmpty() || !(mapD.get("data") instanceof List) || (arrayList = (ArrayList) mapD.get("data")) == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (((String) entry.getKey()).equals("filePath")) {
                    arrayList2.add(String.valueOf(entry.getValue()));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            a(new File((String) obj2));
        }
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }
}
