package kotlin.text;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class u {
    public static void a(Appendable appendable, Object obj, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(appendable, "<this>");
        if (interfaceC6835l != null) {
            appendable.append((CharSequence) interfaceC6835l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
