package com.applovin.shadow.okio;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\u0010\u001a\u00028\u0001\"\u0010\b\u0000\u0010\f*\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\"\u0004\b\u0001\u0010\r*\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/BufferedSource;", "buffer", "(Lcom/applovin/shadow/okio/Source;)Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/Sink;", "Lcom/applovin/shadow/okio/BufferedSink;", "(Lcom/applovin/shadow/okio/Sink;)Lcom/applovin/shadow/okio/BufferedSink;", "blackhole", "()Lcom/applovin/shadow/okio/Sink;", "blackholeSink", "Ljava/io/Closeable;", "Lcom/applovin/shadow/okio/Closeable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlin/Function1;", "block", "use", "(Ljava/io/Closeable;Ll9/l;)Ljava/lang/Object;", "com.applovin.shadow.okio"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "com/applovin/shadow/okio/Okio")
/* loaded from: classes.dex */
final /* synthetic */ class Okio__OkioKt {
    @JvmName(name = "blackhole")
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        kotlin.jvm.internal.p.e(source, "<this>");
        return new buffer(source);
    }

    public static final <T extends Closeable, R> R use(T t10, @NotNull l9.l block) throws Throwable {
        R r10;
        kotlin.jvm.internal.p.e(block, "block");
        Throwable th = null;
        try {
            r10 = (R) block.invoke(t10);
            kotlin.jvm.internal.n.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.n.a(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.n.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th4) {
                    y8.d.a(th3, th4);
                }
            }
            kotlin.jvm.internal.n.a(1);
            th = th3;
            r10 = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.p.b(r10);
        return r10;
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        kotlin.jvm.internal.p.e(sink, "<this>");
        return new buffer(sink);
    }
}
