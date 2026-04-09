package bb;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.y0;
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
import pb.p0;

/* loaded from: classes.dex */
public final class i implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2530a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // pb.p0
    public final Object parse(Uri uri, InputStream inputStream) throws IOException, NumberFormatException {
        String line = new BufferedReader(new InputStreamReader(inputStream, ne.g.f17524c)).readLine();
        try {
            Matcher matcher = f2530a.matcher(line);
            if (!matcher.matches()) {
                String strValueOf = String.valueOf(line);
                throw y0.b(null, strValueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(strValueOf) : new String("Couldn't parse timestamp: "));
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
            throw y0.b(e4, null);
        }
    }
}
