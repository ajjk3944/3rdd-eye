package u5;

import a5.d0;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f23309c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f23310a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f23311b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f23309c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = d0.f105a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f23310a = i11;
            this.f23311b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f1549a;
            if (i10 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i10];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f1987g) && a(commentFrame.f1988r)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f1994d) && "iTunSMPB".equals(internalFrame.f1995g) && a(internalFrame.f1996r)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
