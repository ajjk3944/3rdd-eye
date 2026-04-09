package com.ui.unifi.core.base.net.traces;

import gg.AbstractC5912b;
import kotlin.Metadata;
import rb.TracesBody;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ui/unifi/core/base/net/traces/TracesClient;", "", "Lrb/g;", "tracesBody", "Lgg/b;", "reportTrace", "(Lrb/g;)Lgg/b;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TracesClient {
    AbstractC5912b reportTrace(TracesBody tracesBody);
}
