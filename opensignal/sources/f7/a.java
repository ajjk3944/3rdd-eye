package f7;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import i7.l;
import i7.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8636a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8637b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8638c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8639d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8640e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8641f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8642g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8643h;

    public a(Context context, sm.f fVar, m mVar, ArrayList arrayList, l lVar, e7.d dVar, e7.d dVar2, boolean z10, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        br.l.e(mVar, "migrationContainer");
        br.l.e(lVar, "journalMode");
        br.l.e(dVar, "queryExecutor");
        br.l.e(dVar2, "transactionExecutor");
        br.l.e(arrayList2, "typeConverters");
        br.l.e(arrayList3, "autoMigrationSpecs");
        this.f8638c = context;
        this.f8639d = mVar;
        this.f8640e = arrayList;
        this.f8641f = lVar;
        this.f8636a = dVar;
        this.f8642g = dVar2;
        this.f8637b = z10;
        this.f8643h = linkedHashSet;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        this.f8636a.execute(new a5.i(i10, this, serializable, 1));
    }

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        byte[] bArr;
        this.f8637b = false;
        this.f8636a = executor;
        this.f8638c = dVar;
        this.f8642g = str;
        this.f8641f = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            bArr = e.f8656d;
        } else {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e.f8660h;
                    break;
                case 26:
                    bArr = e.f8659g;
                    break;
                case 27:
                    bArr = e.f8658f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f8657e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f8639d = bArr;
    }
}
