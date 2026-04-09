package Za;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b implements a {
    @Override // Za.a
    public URI a(URI url, int i10) {
        AbstractC6492s.i(url, "url");
        try {
            String str = String.format("u=%s&w=%d", Arrays.copyOf(new Object[]{url.toString(), Integer.valueOf(i10)}, 2));
            AbstractC6492s.h(str, "format(...)");
            return new URI("https://images.svc.ui.com/?" + str);
        } catch (IllegalArgumentException e10) {
            throw new IllegalStateException("Image URL should never get into invalid format! [" + url + ", size: " + i10 + "]", e10);
        } catch (URISyntaxException e11) {
            throw new IllegalStateException("Image URL should never get into invalid format! [" + url + ", size: " + i10 + "]", e11);
        }
    }
}
