package com.lefan.signal.tracroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f18858a;

    public b(String str) {
        this.f18858a = str;
        Matcher matcher = Pattern.compile("(?<=\\().*?(?=\\))").matcher(str);
        if (matcher.find()) {
            this.f18858a = matcher.group();
        }
    }
}
