package w4;

import Y4.RunnableC0225e;
import c5.C0412i;
import com.google.android.material.textfield.TextInputEditText;
import com.lefan.base.activity.SuggestActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import q5.i;
import q5.o;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuggestActivity f23983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f23984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextInputEditText f23985d;

    public /* synthetic */ h(String str, SuggestActivity suggestActivity, o oVar, TextInputEditText textInputEditText) {
        this.f23982a = str;
        this.f23983b = suggestActivity;
        this.f23984c = oVar;
        this.f23985d = textInputEditText;
    }

    @Override // p5.a
    public final Object b() throws Throwable {
        HttpURLConnection httpURLConnection;
        RunnableC0225e runnableC0225e;
        String str = this.f23982a;
        SuggestActivity suggestActivity = this.f23983b;
        o oVar = this.f23984c;
        TextInputEditText textInputEditText = this.f23985d;
        int i = SuggestActivity.f18766W;
        o oVar2 = new o();
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                i.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    httpURLConnection.connect();
                    httpURLConnection.setReadTimeout(3000);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        i.b(inputStream);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, y5.a.f24252a), 8192);
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[8192];
                        for (int i3 = bufferedReader.read(cArr); i3 >= 0; i3 = bufferedReader.read(cArr)) {
                            stringWriter.write(cArr, 0, i3);
                        }
                        String string = stringWriter.toString();
                        i.d(string, "toString(...)");
                        oVar2.f23299a = string;
                        inputStream.close();
                        httpURLConnection.disconnect();
                        runnableC0225e = new RunnableC0225e(suggestActivity, oVar2, oVar, str, textInputEditText);
                    } finally {
                    }
                } catch (Exception e6) {
                    e = e6;
                    httpURLConnection2 = httpURLConnection;
                    e.printStackTrace();
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    runnableC0225e = new RunnableC0225e(suggestActivity, oVar2, oVar, str, textInputEditText);
                    suggestActivity.runOnUiThread(runnableC0225e);
                    return C0412i.f5929a;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    suggestActivity.runOnUiThread(new RunnableC0225e(suggestActivity, oVar2, oVar, str, textInputEditText));
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
            }
        } catch (Exception e7) {
            e = e7;
        }
        suggestActivity.runOnUiThread(runnableC0225e);
        return C0412i.f5929a;
    }
}
