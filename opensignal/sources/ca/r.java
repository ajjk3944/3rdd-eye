package ca;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3501c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f3502a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3503b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f3501c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = qb.v.f20828a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f3502a = i11;
            this.f3503b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f4241a;
            if (i10 >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i10];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f4283g) && a(commentFrame.f4284r)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f4290d) && "iTunSMPB".equals(internalFrame.f4291g) && a(internalFrame.f4292r)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
