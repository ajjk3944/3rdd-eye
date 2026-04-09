package km;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e4.c2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.e2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class o implements g, e4.s, qd.c, OnCompleteListener, SuccessContinuation, d6.b, u0.f, v0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f28445a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28446b;

    public /* synthetic */ o(Object obj, Object obj2) {
        this.f28446b = obj;
        this.f28445a = obj2;
    }

    @Override // v0.k0
    public List a(Integer num) {
        List listA = ((v0.k0) this.f28445a).a(null);
        e2 e2Var = (e2) this.f28446b;
        int i4 = e2Var.f34798v;
        return i4 < 0 ? listA : zj.n.j0(com.bumptech.glide.f.e(e2Var, num, i4, Integer.valueOf(e2Var.E(i4, e2Var.f34780b))), listA);
    }

    @Override // qd.c
    public Object b() {
        return new pd.i(((d8.h) ((i) this.f28445a).f28426b).f22020b, (pd.j) ((qd.c) this.f28446b).b());
    }

    public int c() {
        d8.f fVar = (d8.f) this.f28446b;
        if (fVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = fVar.f22011a;
        FingerprintManager fingerprintManagerE = d8.f.e(context);
        if (fingerprintManagerE == null || !fingerprintManagerE.isHardwareDetected()) {
            return 12;
        }
        FingerprintManager fingerprintManagerE2 = d8.f.e(context);
        return (fingerprintManagerE2 == null || !fingerprintManagerE2.hasEnrolledFingerprints()) ? 11 : 0;
    }

    @Override // u0.f
    public void cancel() {
        if (((c1.a) this.f28446b).compareAndSet(1, 1)) {
            return;
        }
        ((c1.b) this.f28445a).invoke();
    }

    public of.d d(lf.c cVar) throws JSONException, kf.c {
        String string;
        JSONArray jSONArray = cVar.g;
        long j = cVar.f28751f;
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i4);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                lf.c cVarC = ((lf.b) this.f28445a).c();
                String string3 = null;
                if (cVarC == null) {
                    string = null;
                } else {
                    try {
                        string = cVarC.f28747b.getString(strOptString);
                    } catch (JSONException unused) {
                    }
                }
                if (string == null) {
                    lf.c cVarC2 = ((lf.b) this.f28446b).c();
                    if (cVarC2 != null) {
                        try {
                            string3 = cVarC2.f28747b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i10 = of.e.f30545a;
                of.b bVar = new of.b();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                bVar.f30533a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                bVar.f30534b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                bVar.f30535c = strOptString;
                bVar.f30536d = string;
                bVar.f30537e = j;
                bVar.f30538f = (byte) (bVar.f30538f | 1);
                hashSet.add(bVar.a());
            } catch (JSONException e2) {
                throw new kf.c("Exception parsing rollouts metadata to create RolloutsState.", e2);
            }
        }
        return new of.d(hashSet);
    }

    public synchronized List e(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f28445a).contains(str)) {
                ((ArrayList) this.f28445a).add(str);
            }
            arrayList = (List) ((HashMap) this.f28446b).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f28446b).put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized ArrayList f(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f28445a;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            List<o8.d> list = (List) ((HashMap) this.f28446b).get((String) obj);
            if (list != null) {
                for (o8.d dVar : list) {
                    if ((dVar.f30428a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f30429b)) && !arrayList.contains(dVar.f30429b)) {
                        arrayList.add(dVar.f30429b);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // km.g
    public void g(d dVar, Throwable th2) {
        ((p) this.f28446b).f28450a.execute(new b5.e(this, (g) this.f28445a, th2, 28));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0072, B:33:0x007d, B:32:0x0078, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #3 {all -> 0x00a6, blocks: (B:20:0x004c, B:22:0x0050, B:25:0x0061, B:29:0x0068, B:31:0x0072, B:33:0x007d, B:32:0x0078, B:27:0x0065, B:28:0x0067, B:45:0x009e, B:46:0x00a5, B:24:0x005c), top: B:73:0x004c, outer: #5, inners: #0 }] */
    @Override // d6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d6.a h(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: km.o.h(java.lang.String):d6.a");
    }

    public String i(String str) {
        String str2 = (String) this.f28446b;
        Resources resources = (Resources) this.f28445a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        ViewPager viewPager = (ViewPager) this.f28446b;
        c2 c2VarJ = e4.v0.j(view, c2Var);
        if (c2VarJ.f22315a.o()) {
            return c2VarJ;
        }
        Rect rect = (Rect) this.f28445a;
        rect.left = c2VarJ.b();
        rect.top = c2VarJ.d();
        rect.right = c2VarJ.c();
        rect.bottom = c2VarJ.a();
        int childCount = viewPager.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            c2 c2VarC = e4.v0.c(viewPager.getChildAt(i4), c2VarJ);
            rect.left = Math.min(c2VarC.b(), rect.left);
            rect.top = Math.min(c2VarC.d(), rect.top);
            rect.right = Math.min(c2VarC.c(), rect.right);
            rect.bottom = Math.min(c2VarC.a(), rect.bottom);
        }
        return c2VarJ.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public Object k(s7.b bVar) {
        return (f7.i0) this.f28446b;
    }

    public Object l(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        s7.b bVar = (s7.b) this.f28445a;
        bVar.f33497a = f10;
        bVar.f33498b = f11;
        bVar.f33499c = obj;
        bVar.f33500d = obj2;
        bVar.f33501e = f12;
        bVar.f33502f = f13;
        bVar.g = f14;
        return k(bVar);
    }

    public void m() throws IOException {
        String str = (String) this.f28445a;
        if (((FileChannel) this.f28446b) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f28446b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.f28446b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f28446b = null;
            throw new IllegalStateException(d.h.t("Unable to lock file: '", str, "'."), th2);
        }
    }

    public void n(int i4, int i10, int i11, int i12) {
        CardView cardView = (CardView) this.f28446b;
        cardView.f852d.set(i4, i10, i11, i12);
        Rect rect = cardView.f851c;
        super/*android.widget.FrameLayout*/.setPadding(i4 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    public void o(u6.h hVar, int i4) {
        nk.k.e(hVar, "workSpecId");
        d7.a aVar = (d7.a) this.f28446b;
        ((c7.l) ((a0.x0) aVar).f148e).execute(new c7.m((u6.c) this.f28445a, hVar, false, i4));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        qd.n nVar = (qd.n) this.f28445a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f28446b;
        synchronized (nVar.f32262f) {
            nVar.f32261e.remove(taskCompletionSource);
        }
    }

    @Override // km.g
    public void p(d dVar, v0 v0Var) {
        ((p) this.f28446b).f28450a.execute(new b5.e(this, (g) this.f28445a, v0Var, 27));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f28446b;
        JSONObject jSONObject = (JSONObject) ((ke.c) this.f28445a).f28260c.f28255a.submit(new f7.l(5, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            re.a aVarT = ((o.e) dVar.f19297c).t(jSONObject);
            i iVar = (i) dVar.f19299e;
            long j = aVarT.f32926c;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) iVar.f28426b);
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                je.g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            try {
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    je.g.b(fileWriter, "Failed to close settings writer.");
                    com.google.android.gms.internal.consent_sdk.d.e("Loaded settings: ", jSONObject);
                    String str = ((re.c) dVar.f19296b).f32935f;
                    SharedPreferences.Editor editorEdit = ((Context) dVar.f19295a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    ((AtomicReference) dVar.f19301h).set(aVarT);
                    ((TaskCompletionSource) ((AtomicReference) dVar.f19302i).get()).trySetResult(aVarT);
                    return Tasks.forResult(null);
                }
                je.g.b(fileWriter, "Failed to close settings writer.");
                com.google.android.gms.internal.consent_sdk.d.e("Loaded settings: ", jSONObject);
                String str2 = ((re.c) dVar.f19296b).f32935f;
                SharedPreferences.Editor editorEdit2 = ((Context) dVar.f19295a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit2.putString("existing_instance_identifier", str2);
                editorEdit2.apply();
                ((AtomicReference) dVar.f19301h).set(aVarT);
                ((TaskCompletionSource) ((AtomicReference) dVar.f19302i).get()).trySetResult(aVarT);
            } catch (Throwable th3) {
                th = th3;
                fileWriter2 = fileWriter;
                je.g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }

    public /* synthetic */ o(boolean z3, Object obj, Object obj2) {
        this.f28445a = obj;
        this.f28446b = obj2;
    }

    public o(int i4) {
        switch (i4) {
            case 9:
                this.f28445a = new LinkedHashMap();
                this.f28446b = new LinkedHashMap();
                break;
            case 16:
                this.f28445a = new s7.b();
                this.f28446b = null;
                break;
            case 26:
                this.f28445a = Choreographer.getInstance();
                this.f28446b = Looper.myLooper();
                break;
            default:
                this.f28445a = new ArrayList();
                this.f28446b = new HashMap();
                break;
        }
    }

    public o(u6.c cVar, d7.a aVar) {
        nk.k.e(cVar, "processor");
        nk.k.e(aVar, "workTaskExecutor");
        this.f28445a = cVar;
        this.f28446b = aVar;
    }

    public o(t5.p pVar, d6.b bVar) {
        nk.k.e(bVar, "actual");
        this.f28446b = pVar;
        this.f28445a = bVar;
    }
}
