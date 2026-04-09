package sb;

import Yg.s;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import ej.C5481e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.p;
import kotlin.text.t;
import mh.InterfaceC6835l;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import sh.C7974i;

/* loaded from: classes3.dex */
public abstract class f {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e((String) obj, (String) obj2);
        }
    }

    private static final String d(Request request) throws NoSuchFieldException {
        String strD = request.d("x-amz-date");
        if (strD != null) {
            return strD;
        }
        throw new NoSuchFieldException("Request cannot be signed without having the x-amz-date header");
    }

    private static final String e(Request request) throws NoSuchFieldException {
        String strZ0;
        String strD = request.d("x-amz-date");
        if (strD == null || (strZ0 = t.Z0(strD, new C7974i(0, 7))) == null) {
            throw new NoSuchFieldException("Request cannot be signed without having the x-amz-date header");
        }
        return strZ0;
    }

    public static final String f(Request request, String accesKeyId, String accessKey, String region, String service) throws NoSuchFieldException {
        AbstractC6492s.i(request, "<this>");
        AbstractC6492s.i(accesKeyId, "accesKeyId");
        AbstractC6492s.i(accessKey, "accessKey");
        AbstractC6492s.i(region, "region");
        AbstractC6492s.i(service, "service");
        return "AWS4-HMAC-SHA256 Credential=" + accesKeyId + MqttTopic.TOPIC_LEVEL_SEPARATOR + p(request, region, service) + ", SignedHeaders=" + t(request) + ", Signature=" + r(request, accessKey, region, service);
    }

    private static final String g(Request request) {
        if (request.getBody() != null) {
            C5481e c5481e = new C5481e();
            RequestBody body = request.i().b().getBody();
            if (body != null) {
                body.h(c5481e);
            }
            String strZ0 = c5481e.z0();
            if (strZ0 != null) {
                return strZ0;
            }
        }
        return "";
    }

    private static final String h(Request request) {
        String lowerCase = AbstractC7932b.a(g(request)).toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final String i(final Headers headers) {
        return AbstractC3689v.z0(headers.f(), "\n", null, null, 0, null, new InterfaceC6835l() { // from class: sb.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.k(headers, (String) obj);
            }
        }, 30, null);
    }

    private static final String j(Request request) {
        return i(request.getHeaders());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(Headers headers, String it) {
        AbstractC6492s.i(it, "it");
        String lowerCase = it.toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return lowerCase + ":" + w(headers.k(it));
    }

    private static final String l(Request request) {
        List<String> listV0 = AbstractC3689v.V0(request.getUrl().p());
        if (listV0.isEmpty()) {
            listV0 = null;
        }
        if (listV0 != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : listV0) {
                List<String> listX0 = AbstractC3689v.X0(request.getUrl().q(str), new a());
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(listX0, 10));
                for (String str2 : listX0) {
                    arrayList2.add(new s(q(str), str2 != null ? q(str2) : null));
                }
                AbstractC3689v.C(arrayList, arrayList2);
            }
            String strZ0 = AbstractC3689v.z0(arrayList, "&", null, null, 0, null, new InterfaceC6835l() { // from class: sb.c
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return f.m((s) obj);
                }
            }, 30, null);
            if (strZ0 != null) {
                return strZ0;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(s sVar) {
        AbstractC6492s.i(sVar, "<destruct>");
        return ((String) sVar.a()) + "=" + ((String) sVar.c());
    }

    public static final String n(Request request) throws UnsupportedEncodingException {
        AbstractC6492s.i(request, "<this>");
        return t.k("\n    |" + request.getMethod() + "\n    |" + o(request) + "\n    |" + l(request) + "\n    |" + j(request) + "\n    |\n    |" + t(request) + "\n    |" + h(request) + "\n    ", "|");
    }

    private static final String o(Request request) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(new p("/+").n(request.getUrl().d(), MqttTopic.TOPIC_LEVEL_SEPARATOR), "utf8");
        AbstractC6492s.h(strEncode, "let(...)");
        return t.L(strEncode, "%2F", MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 4, null);
    }

    private static final String p(Request request, String str, String str2) throws NoSuchFieldException {
        return e(request) + MqttTopic.TOPIC_LEVEL_SEPARATOR + str + MqttTopic.TOPIC_LEVEL_SEPARATOR + str2 + "/aws4_request";
    }

    private static final String q(String str) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(str, "utf8");
        AbstractC6492s.h(strEncode, "encode(...)");
        return t.L(t.L(t.L(strEncode, MqttTopic.SINGLE_LEVEL_WILDCARD, "%20", false, 4, null), "*", "%2A", false, 4, null), "%7E", "~", false, 4, null);
    }

    public static final String r(Request request, String accessKey, String region, String service) {
        AbstractC6492s.i(request, "<this>");
        AbstractC6492s.i(accessKey, "accessKey");
        AbstractC6492s.i(region, "region");
        AbstractC6492s.i(service, "service");
        return AbstractC7932b.d(AbstractC7932b.c(AbstractC7932b.c(AbstractC7932b.c(AbstractC7932b.c(AbstractC7932b.b("AWS4" + accessKey, e(request)), region), service), "aws4_request"), u(request, region, service)));
    }

    public static final Request s(Request request, String accessKeyId, String accessKey, String region, String service) {
        AbstractC6492s.i(request, "<this>");
        AbstractC6492s.i(accessKeyId, "accessKeyId");
        AbstractC6492s.i(accessKey, "accessKey");
        AbstractC6492s.i(region, "region");
        AbstractC6492s.i(service, "service");
        return request.i().a("Authorization", f(request, accessKeyId, accessKey, region, service)).b();
    }

    private static final String t(Request request) {
        Set setF = request.getHeaders().f();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(setF, 10));
        Iterator it = setF.iterator();
        while (it.hasNext()) {
            String lowerCase = t.q1((String) it.next()).toString().toLowerCase(Locale.ROOT);
            AbstractC6492s.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        return AbstractC3689v.z0(AbstractC3689v.V0(arrayList), ";", null, null, 0, null, null, 62, null);
    }

    public static final String u(Request request, String region, String service) throws NoSuchFieldException {
        AbstractC6492s.i(request, "<this>");
        AbstractC6492s.i(region, "region");
        AbstractC6492s.i(service, "service");
        return t.k("\n    |AWS4-HMAC-SHA256\n    |" + d(request) + "\n    |" + p(request, region, service) + "\n    |" + AbstractC7932b.a(n(request)) + "\n    ", "|");
    }

    private static final String v(String str) {
        return new p("\\s+").n(t.q1(str).toString(), " ");
    }

    private static final String w(List list) {
        return AbstractC3689v.z0(list, ",", null, null, 0, null, new InterfaceC6835l() { // from class: sb.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.x((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence x(String it) {
        AbstractC6492s.i(it, "it");
        return v(it);
    }
}
