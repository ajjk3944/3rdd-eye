package com.vungle.ads.internal.network.converters;

import i9.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.f;
import l9.l;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;
import z9.c;
import z9.k;

/* loaded from: classes3.dex */
public final class JsonConverter implements r7.a {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final z9.a json = k.b(null, new l() { // from class: com.vungle.ads.internal.network.converters.JsonConverter$Companion$json$1
        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((c) obj);
            return s.f25199a;
        }

        public final void invoke(@NotNull c Json) {
            p.e(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
            Json.c(true);
        }
    }, 1, null);

    @NotNull
    private final r9.p kType;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public JsonConverter(@NotNull r9.p kType) {
        p.e(kType, "kType");
        this.kType = kType;
    }

    @Override // r7.a
    @Nullable
    public Object convert(@Nullable ResponseBody responseBody) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (responseBody != null) {
            try {
                String strString = responseBody.string();
                if (strString != null) {
                    Object objB = json.b(f.b(z9.a.f25415d.a(), this.kType), strString);
                    b.a(responseBody, null);
                    return objB;
                }
            } finally {
            }
        }
        b.a(responseBody, null);
        return null;
    }
}
