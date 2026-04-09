package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import b2.b;
import java.util.List;

@UiThread
/* loaded from: classes.dex */
public interface ProfileStore {
    boolean deleteProfile(@NonNull String str);

    @NonNull
    List<String> getAllProfileNames();

    @NonNull
    b getOrCreateProfile(@NonNull String str);

    @Nullable
    b getProfile(@NonNull String str);
}
