package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static o f6459a;

    /* renamed from: b, reason: collision with root package name */
    private File f6460b;

    /* renamed from: c, reason: collision with root package name */
    private File f6461c;

    /* renamed from: d, reason: collision with root package name */
    private File f6462d;

    /* renamed from: e, reason: collision with root package name */
    private Context f6463e;

    /* renamed from: f, reason: collision with root package name */
    private a f6464f = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f6467a;

        /* renamed from: b, reason: collision with root package name */
        private long f6468b;

        /* renamed from: c, reason: collision with root package name */
        private File f6469c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f6470d;

        public /* synthetic */ a(File file, byte b5) {
            this(file);
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f6469c.delete();
        }

        private a(File file) throws NumberFormatException {
            this.f6470d = null;
            this.f6469c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f6467a = Long.parseLong(strArrSplit[0]);
                this.f6468b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j6 = Long.parseLong(strSubstring);
                this.f6467a = j6;
                this.f6468b = j6;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f6470d == null) {
                try {
                    this.f6470d = new JSONObject(com.apm.insight.l.f.a(this.f6469c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f6470d == null) {
                    this.f6470d = new JSONObject();
                }
            }
            return this.f6470d;
        }

        public static /* synthetic */ boolean a(a aVar, long j6) {
            long j7 = aVar.f6467a;
            if (j7 > j6 && j7 - j6 > 604800000) {
                return true;
            }
            long j8 = aVar.f6468b;
            if (j8 >= j6 || j6 - j8 <= 604800000) {
                return aVar.f6469c.lastModified() < j6 && j6 - aVar.f6469c.lastModified() > 604800000;
            }
            return true;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f6460b = fileC;
        this.f6461c = new File(fileC, "did");
        this.f6462d = new File(fileC, "device_uuid");
        this.f6463e = context;
    }

    public static o a() {
        if (f6459a == null) {
            f6459a = new o(com.apm.insight.e.g());
        }
        return f6459a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f6461c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f6462d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f6460b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b5 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b5);
                    arrayList.add(aVar2);
                    if (this.f6464f == null && ".ctx".equals(str) && (aVar == null || aVar2.f6468b >= aVar.f6468b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            if (this.f6464f == null && aVar != null) {
                this.f6464f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r10, org.json.JSONArray r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.f6463e
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.a(r0)
            org.json.JSONObject r6 = r0.a(r10)
            boolean r10 = com.apm.insight.entity.Header.c(r6)
            if (r10 == 0) goto L13
            r1 = r9
            goto La8
        L13:
            long r2 = java.lang.System.currentTimeMillis()
            com.apm.insight.runtime.o$a r10 = r9.f6464f
            if (r10 != 0) goto L20
            java.lang.String r10 = ".ctx"
            r9.c(r10)
        L20:
            com.apm.insight.runtime.o$a r10 = r9.f6464f
            if (r10 != 0) goto L2b
            r4 = r2
            r1 = r9
            r7 = r11
            r1.a(r2, r4, r6, r7)
            return
        L2b:
            r7 = r11
            org.json.JSONObject r11 = com.apm.insight.runtime.o.a.a(r10)
            boolean r0 = com.apm.insight.entity.Header.c(r11)
            r8 = 0
            r1 = 2
            r4 = 1
            if (r0 != 0) goto L61
            boolean r0 = com.apm.insight.entity.Header.c(r6)
            if (r0 == 0) goto L41
            r11 = r8
            goto L62
        L41:
            java.lang.String r0 = "update_version_code"
            java.lang.Object r5 = r6.opt(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r0 = r11.opt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L61
            boolean r11 = com.apm.insight.entity.Header.d(r11)
            if (r11 == 0) goto L61
            r11 = r4
            goto L62
        L61:
            r11 = r1
        L62:
            if (r11 == r4) goto L6e
            if (r11 == r1) goto L68
            r1 = r9
            goto L7f
        L68:
            r4 = r2
            r1 = r9
            r1.a(r2, r4, r6, r7)
            goto L7f
        L6e:
            r4 = r2
            long r2 = com.apm.insight.runtime.o.a.b(r10)
            r1 = r9
            r1.a(r2, r4, r6, r7)
            r2 = r4
            java.io.File r10 = com.apm.insight.runtime.o.a.c(r10)
            com.apm.insight.l.f.a(r10)
        L7f:
            java.lang.String r10 = ""
            java.util.ArrayList r10 = r9.c(r10)     // Catch: java.lang.Throwable -> La5
            int r11 = r10.size()     // Catch: java.lang.Throwable -> La5
            r0 = 6
            if (r11 > r0) goto L8d
            goto La8
        L8d:
            int r11 = r10.size()     // Catch: java.lang.Throwable -> La5
        L91:
            if (r8 >= r11) goto La8
            java.lang.Object r0 = r10.get(r8)     // Catch: java.lang.Throwable -> La5
            int r8 = r8 + 1
            com.apm.insight.runtime.o$a r0 = (com.apm.insight.runtime.o.a) r0     // Catch: java.lang.Throwable -> La5
            boolean r4 = com.apm.insight.runtime.o.a.a(r0, r2)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto L91
            com.apm.insight.runtime.o.a.d(r0)     // Catch: java.lang.Throwable -> La5
            goto L91
        La5:
            r0 = move-exception
            r10 = r0
            goto La9
        La8:
            return
        La9:
            com.apm.insight.c.a()
            java.lang.String r11 = "NPTH_CATCH"
            com.apm.insight.runtime.j.a(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.a(java.util.Map, org.json.JSONArray):void");
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f6462d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONArray b(long j6) {
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".allData");
        int size = arrayListC.size();
        int i = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i3);
            i3++;
            a aVar2 = aVar;
            if (j6 >= aVar2.f6467a && j6 <= aVar2.f6468b) {
                file = aVar2.f6469c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".allData");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i < size2) {
                a aVar4 = arrayListC2.get(i);
                i++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.f6468b - j6) > Math.abs(aVar5.f6468b - j6)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.f6469c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
            } catch (Throwable th) {
                th = th;
                strA = null;
            }
            try {
                return new JSONArray(strA);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.c.a();
                j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                return null;
            }
        }
        return null;
    }

    private void a(long j6, long j7, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f6460b, j6 + "-" + j7 + ".ctx");
        File file2 = new File(this.f6460b, j6 + "-" + j7 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f6464f = new a(file, (byte) 0);
        } catch (IOException e6) {
            com.apm.insight.c.a();
            j.a(e6, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f6461c, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONObject a(long j6) {
        JSONObject jSONObject;
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".ctx");
        int size = arrayListC.size();
        int i = 0;
        int i3 = 0;
        while (true) {
            jSONObject = null;
            if (i3 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i3);
            i3++;
            a aVar2 = aVar;
            if (j6 >= aVar2.f6467a && j6 <= aVar2.f6468b) {
                file = aVar2.f6469c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".ctx");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i < size2) {
                a aVar4 = arrayListC2.get(i);
                i++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.f6468b - j6) > Math.abs(aVar5.f6468b - j6)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.f6469c;
            i = 1;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
            } catch (Throwable th) {
                th = th;
                strA = null;
            }
            try {
                jSONObject = new JSONObject(strA);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.c.a();
                j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                if (jSONObject != null) {
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e6) {
                        com.apm.insight.c.a();
                        j.a(e6, "NPTH_CATCH");
                    }
                }
                return jSONObject;
            }
        }
        if (jSONObject != null && i != 0) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }
}
