package j8;

import android.os.AsyncTask;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21784a = new a();

    public static SpannableStringBuilder d(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        try {
            Matcher matcher = Pattern.compile("From (.*?):").matcher(spannableStringBuilder);
            while (matcher.find()) {
                SpannableString spannableString = new SpannableString(matcher.group(0));
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                spannableStringBuilder.replace(matcher.start(), matcher.end(), (CharSequence) spannableString);
            }
            return spannableStringBuilder;
        } catch (Exception e10) {
            Log.e("Ping & DNS", "WhoisTask.style: " + e10.getMessage());
            return spannableStringBuilder;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(String... strArr) {
        try {
            String strSubstring = strArr[0];
            int iIndexOf = strSubstring.indexOf(".");
            int iLastIndexOf = strSubstring.lastIndexOf(".");
            b("Whois " + strSubstring + "\n");
            if (iIndexOf != iLastIndexOf && strSubstring.startsWith("www.")) {
                b("Removing 'www.' from domain name\n");
                strSubstring = strSubstring.substring(iIndexOf + 1);
                b("Whois " + strSubstring + "\n");
            }
            a aVar = f21784a;
            aVar.c("whois.iana.org", 43);
            String strD = aVar.d(false, strSubstring);
            aVar.a();
            int iIndexOf2 = strD.indexOf("whois:");
            if (iIndexOf2 < 0) {
                b("\nNo WHOIS server available for " + strSubstring);
                return null;
            }
            String strTrim = strD.substring(iIndexOf2 + 6).trim();
            c(strSubstring, strTrim);
            int iIndexOf3 = strSubstring.indexOf("Whois Server:");
            if (iIndexOf3 == -1) {
                return null;
            }
            String strTrim2 = strSubstring.substring(iIndexOf3 + 13).trim();
            aVar.c(strTrim2.substring(0, strTrim2.indexOf("\n")), 43);
            String strD2 = aVar.d(false, strTrim);
            aVar.a();
            b("\n\nFrom " + strTrim2 + ":\n");
            b(strD2, strTrim2);
            return null;
        } catch (Exception e10) {
            Log.e("Ping & DNS", "WhoisTask problem: '" + strArr[0] + "': " + e10.getMessage());
            b(e10.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca A[Catch: Exception -> 0x002b, LOOP:1: B:52:0x00c8->B:53:0x00ca, LOOP_END, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:4:0x000c, B:7:0x0015, B:11:0x002e, B:13:0x0042, B:16:0x0048, B:17:0x0055, B:40:0x0096, B:50:0x00be, B:43:0x00a3, B:45:0x00ab, B:46:0x00af, B:47:0x00b3, B:49:0x00bb, B:19:0x0059, B:22:0x0063, B:25:0x006d, B:28:0x0077, B:31:0x0081, B:51:0x00c3, B:53:0x00ca), top: B:57:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String... r17) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.b.b(java.lang.String[]):void");
    }

    public final void c(String str, String str2) throws IOException {
        String strD;
        String lowerCase = str.substring(str.lastIndexOf(".") + 1).trim().toLowerCase();
        String strSubstring = str2.substring(0, str2.indexOf("\n"));
        if ("jp".equals(lowerCase)) {
            str = str + "/e";
        }
        a aVar = f21784a;
        aVar.c(strSubstring, 43);
        if ("com".equals(lowerCase)) {
            strD = aVar.d(false, "domain " + str);
        } else if (DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR.equals(lowerCase)) {
            strD = aVar.d(false, "-T dn " + str);
        } else if ("dk".equals(lowerCase)) {
            strD = aVar.d(false, "--show-handles " + str);
        } else {
            strD = aVar.d(false, str);
        }
        aVar.a();
        b("\nFrom " + strSubstring + ":\n");
        b(strD, strSubstring);
    }
}
