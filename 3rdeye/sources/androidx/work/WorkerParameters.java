package androidx.work;

import android.net.Network;
import android.net.Uri;
import c2.C2047C;
import c2.C2049E;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f16852a;

    /* renamed from: b, reason: collision with root package name */
    public e f16853b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f16854c;

    /* renamed from: d, reason: collision with root package name */
    public a f16855d;

    /* renamed from: e, reason: collision with root package name */
    public int f16856e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorService f16857f;

    /* renamed from: g, reason: collision with root package name */
    public e2.c f16858g;

    /* renamed from: h, reason: collision with root package name */
    public x f16859h;
    public C2049E i;

    /* renamed from: j, reason: collision with root package name */
    public C2047C f16860j;

    /* renamed from: k, reason: collision with root package name */
    public int f16861k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f16862a;

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f16863b;

        /* renamed from: c, reason: collision with root package name */
        public Network f16864c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f16862a = list;
            this.f16863b = list;
        }
    }

    public WorkerParameters() {
        throw null;
    }
}
