package rl;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f33113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33115c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33116d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33117e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f33118f;
    public final List g;

    /* renamed from: h, reason: collision with root package name */
    public final String f33119h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33120i;

    public n(String str, String str2, String str3, String str4, int i4, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f33113a = str;
        this.f33114b = str2;
        this.f33115c = str3;
        this.f33116d = str4;
        this.f33117e = i4;
        this.f33118f = arrayList;
        this.g = arrayList2;
        this.f33119h = str5;
        this.f33120i = str6;
    }

    public final String a() {
        if (this.f33115c.length() == 0) {
            return "";
        }
        int length = this.f33113a.length() + 3;
        String str = this.f33120i;
        String strSubstring = str.substring(vk.i.E0(str, ':', length, 4) + 1, vk.i.E0(str, '@', 0, 6));
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f33113a.length() + 3;
        String str = this.f33120i;
        int iE0 = vk.i.E0(str, '/', length, 4);
        String strSubstring = str.substring(iE0, sl.f.d(str, "?#", iE0, str.length()));
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f33113a.length() + 3;
        String str = this.f33120i;
        int iE0 = vk.i.E0(str, '/', length, 4);
        int iD = sl.f.d(str, "?#", iE0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iE0 < iD) {
            int i4 = iE0 + 1;
            int iC = sl.f.c(str, '/', i4, iD);
            String strSubstring = str.substring(i4, iC);
            nk.k.d(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iE0 = iC;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.f33120i;
        int iE0 = vk.i.E0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iE0, sl.f.c(str, '#', iE0, str.length()));
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f33114b.length() == 0) {
            return "";
        }
        int length = this.f33113a.length() + 3;
        String str = this.f33120i;
        String strSubstring = str.substring(length, sl.f.d(str, ":@", length, str.length()));
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && nk.k.a(((n) obj).f33120i, this.f33120i);
    }

    public final ed.a0 f(String str) {
        nk.k.e(str, "link");
        try {
            ed.a0 a0Var = new ed.a0(1);
            a0Var.e(this, str);
            return a0Var;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        ed.a0 a0VarF = f("/...");
        nk.k.b(a0VarF);
        a0VarF.f23259d = gm.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        a0VarF.f23260e = gm.a.a(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#");
        return a0VarF.b().f33120i;
    }

    public final URI h() {
        String strSubstring;
        String strReplaceAll;
        ed.a0 a0Var = new ed.a0(1);
        ArrayList arrayList = (ArrayList) a0Var.g;
        String str = this.f33113a;
        a0Var.f23258c = str;
        a0Var.f23259d = e();
        a0Var.f23260e = a();
        a0Var.f23261f = this.f33116d;
        nk.k.e(str, "scheme");
        int i4 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i10 = this.f33117e;
        a0Var.f23257b = i10 != i4 ? i10 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        a0Var.f23262h = strD != null ? ed.a0.f(gm.a.a(0, 0, 83, strD, HttpUrl.QUERY_ENCODE_SET)) : null;
        if (this.f33119h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f33120i;
            strSubstring = str2.substring(vk.i.E0(str2, '#', 0, 6) + 1);
            nk.k.d(strSubstring, "substring(...)");
        }
        a0Var.f23263i = strSubstring;
        String str3 = (String) a0Var.f23261f;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            nk.k.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            nk.k.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        a0Var.f23261f = strReplaceAll;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, gm.a.a(0, 0, 99, (String) arrayList.get(i11), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        }
        ArrayList arrayList2 = (ArrayList) a0Var.f23262h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str4 = (String) arrayList2.get(i12);
                arrayList2.set(i12, str4 != null ? gm.a.a(0, 0, 67, str4, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI) : null);
            }
        }
        String str5 = (String) a0Var.f23263i;
        a0Var.f23263i = str5 != null ? gm.a.a(0, 0, 35, str5, HttpUrl.FRAGMENT_ENCODE_SET_URI) : null;
        String string = a0Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                nk.k.d(patternCompile2, "compile(...)");
                nk.k.e(string, "input");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                nk.k.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                nk.k.b(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f33120i.hashCode();
    }

    public final String toString() {
        return this.f33120i;
    }
}
