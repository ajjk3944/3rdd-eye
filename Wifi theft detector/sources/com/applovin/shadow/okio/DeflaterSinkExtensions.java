package com.applovin.shadow.okio;

import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0005"}, d2 = {"deflate", "Lcom/applovin/shadow/okio/DeflaterSink;", "Lcom/applovin/shadow/okio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "-DeflaterSinkExtensions")
/* renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class DeflaterSinkExtensions {
    @NotNull
    public static final DeflaterSink deflate(@NotNull Sink sink, @NotNull Deflater deflater) {
        kotlin.jvm.internal.p.e(sink, "<this>");
        kotlin.jvm.internal.p.e(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.p.e(sink, "<this>");
        kotlin.jvm.internal.p.e(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
