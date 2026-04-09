package com.yandex.mobile.ads.impl;

import N7.C1154e9;
import io.appmetrica.analytics.impl.Oo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w11 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f34770a;

    public w11(sf1 parentHtmlWebView) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        this.f34770a = parentHtmlWebView;
    }

    private final void a(String str) {
        this.f34770a.loadUrl("javascript: " + str);
        fp0.e(str);
    }

    public final void b(String htmlResponse) {
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        this.f34770a.b(htmlResponse);
    }

    public final void a(gq0... events) {
        kotlin.jvm.internal.l.f(events, "events");
        if (events.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("fireChangeEvent({");
        int length = events.length;
        String str = "";
        int i = 0;
        while (i < length) {
            gq0 gq0Var = events[i];
            sb.append(str);
            sb.append(gq0Var.a());
            i++;
            str = ", ";
        }
        sb.append("})");
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        a(C4215v0.a(new Object[]{string}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    public final void a(i21 command, String message) {
        kotlin.jvm.internal.l.f(command, "command");
        kotlin.jvm.internal.l.f(message, "message");
        a(C4215v0.a(new Object[]{Oo.h("notifyErrorEvent(", JSONObject.quote(command.a()), ", ", JSONObject.quote(message), ")")}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    public final void a(i21 command) {
        kotlin.jvm.internal.l.f(command, "command");
        a(C4215v0.a(new Object[]{C1154e9.i("nativeCallComplete(", JSONObject.quote(command.a()), ")")}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    public final void a() {
        a(C4215v0.a(new Object[]{"notifyReadyEvent();"}, 1, "window.mraidbridge.%s", "format(...)"));
    }
}
