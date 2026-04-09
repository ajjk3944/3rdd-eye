package q0;

import android.net.Uri;
import c5.C0407d;
import d5.AbstractC2282j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q extends q5.j implements p5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f23007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i) {
        super(0);
        this.f23006b = i;
        this.f23007c = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [c5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [c5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [c5.b, java.lang.Object] */
    @Override // p5.a
    public final Object b() {
        List list;
        switch (this.f23006b) {
            case 0:
                C0407d c0407d = (C0407d) this.f23007c.f23020j.getValue();
                return (c0407d == null || (list = (List) c0407d.f5921a) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f23007c.f23012a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                q5.i.b(fragment);
                s.a(fragment, arrayList, sb);
                String string = sb.toString();
                q5.i.d(string, "fragRegex.toString()");
                return new C0407d(arrayList, string);
            case 2:
                String str2 = (String) this.f23007c.f23022l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                C0407d c0407d2 = (C0407d) this.f23007c.f23020j.getValue();
                if (c0407d2 != null) {
                    return (String) c0407d2.f5922b;
                }
                return null;
            case 4:
                String str3 = this.f23007c.f23012a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                String str4 = this.f23007c.f23024n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.f23007c.f23016e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                s sVar = this.f23007c;
                String str6 = sVar.f23012a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) sVar.f23018g.getValue()).booleanValue()) {
                    Uri uri = Uri.parse(str6);
                    for (String str7 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str7);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str8 = (String) AbstractC2282j.U(queryParameters);
                        if (str8 == null) {
                            sVar.i = true;
                            str8 = str7;
                        }
                        Matcher matcher = s.f23011r.matcher(str8);
                        p pVar = new p();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            q5.i.c(strGroup, "null cannot be cast to non-null type kotlin.String");
                            pVar.f23005b.add(strGroup);
                            q5.i.d(str8, "queryParam");
                            String strSubstring = str8.substring(iEnd, matcher.start());
                            q5.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(strSubstring));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < str8.length()) {
                            String strSubstring2 = str8.substring(iEnd);
                            q5.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            sb2.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb2.toString();
                        q5.i.d(string2, "argRegex.toString()");
                        pVar.f23004a = y5.l.f0(string2, ".*", "\\E.*\\Q");
                        q5.i.d(str7, "paramName");
                        linkedHashMap.put(str7, pVar);
                    }
                }
                return linkedHashMap;
        }
    }
}
