package r7;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes3.dex */
public final class b implements a {
    @Override // r7.a
    @Nullable
    public Void convert(@Nullable ResponseBody responseBody) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (responseBody != null) {
            try {
                responseBody.close();
                s sVar = s.f25199a;
                i9.b.a(responseBody, null);
            } finally {
            }
        }
        return null;
    }
}
