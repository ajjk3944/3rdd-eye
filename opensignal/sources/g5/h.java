package g5;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.k0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.p;

/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f9358a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // r5.p
    public final Object parse(Uri uri, InputStream inputStream) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(inputStream, ne.g.f17524c)).readLine();
        try {
            Matcher matcher = f9358a.matcher(line);
            if (!matcher.matches()) {
                throw k0.b(null, "Couldn't parse timestamp: " + line);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j7 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j7 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e4) {
            throw k0.b(e4, null);
        }
    }
}
