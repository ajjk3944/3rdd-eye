package nh;

import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public String f17619a;

    public l(String str) {
        this.f17619a = str;
    }

    public boolean a() {
        return !TextUtils.isEmpty(this.f17619a);
    }
}
