package v8;

import A9.C0575f;
import A9.E;
import A9.U;
import F9.C0663f;
import F9.q;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import b9.C1992A;
import b9.n;
import c9.C2099t;
import com.google.android.gms.common.Scopes;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.support.ContactSupportActivity;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import io.appmetrica.analytics.impl.Oo;
import j8.C5201c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l8.d;
import p9.p;
import z0.C5849b;

/* compiled from: ContactSupportManager.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0663f f47069a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f47070b;

    /* renamed from: c, reason: collision with root package name */
    public final C5201c f47071c;

    /* compiled from: ContactSupportManager.kt */
    @e(c = "com.zipoapps.premiumhelper.support.ContactSupportManager$openEmailApp$1", f = "ContactSupportManager.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public String f47072l;

        /* renamed from: m, reason: collision with root package name */
        public List f47073m;

        /* renamed from: n, reason: collision with root package name */
        public int f47074n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Activity f47076p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f47077q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f47078r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f47079s;

        /* compiled from: ContactSupportManager.kt */
        @e(c = "com.zipoapps.premiumhelper.support.ContactSupportManager$openEmailApp$1$attachmentFile$1", f = "ContactSupportManager.kt", l = {90}, m = "invokeSuspend")
        /* renamed from: v8.b$a$a, reason: collision with other inner class name */
        public static final class C0539a extends i implements p<E, InterfaceC4347e<? super File>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f47080l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ b f47081m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Activity f47082n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0539a(b bVar, Activity activity, InterfaceC4347e<? super C0539a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f47081m = bVar;
                this.f47082n = activity;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new C0539a(this.f47081m, this.f47082n, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super File> interfaceC4347e) {
                return ((C0539a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) throws Throwable {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                int i = this.f47080l;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                    return obj;
                }
                n.b(obj);
                this.f47080l = 1;
                Object objB = b.b(this.f47081m, this.f47082n, this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, String str, String str2, String str3, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f47076p = activity;
            this.f47077q = str;
            this.f47078r = str2;
            this.f47079s = str3;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return b.this.new a(this.f47076p, this.f47077q, this.f47078r, this.f47079s, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v2, types: [c9.t] */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strF;
            List<ResolveInfo> listQueryIntentActivities;
            List<ResolveInfo> listQueryIntentActivities2;
            Object objH;
            List<ResolveInfo> list;
            Uri uriFromFile;
            Intent intentC;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f47074n;
            Activity activity = this.f47076p;
            b bVar = b.this;
            if (i == 0) {
                n.b(obj);
                strF = Oo.f("I have an issue with ", bVar.f47071c.c(activity), " ", bVar.f47071c.b(activity));
                List arrayList = C2099t.f18581b;
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:test@gmail.com"));
                intent.putExtra("android.intent.extra.EMAIL", "test@gmail.com");
                intent.putExtra("android.intent.extra.SUBJECT", "this is a test");
                try {
                    listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
                    l.c(listQueryIntentActivities);
                } catch (Throwable unused) {
                    listQueryIntentActivities = arrayList;
                }
                try {
                    listQueryIntentActivities2 = activity.getPackageManager().queryIntentActivities(b.c(null, "test@gmail.com", "Test", null), 0);
                    l.c(listQueryIntentActivities2);
                } catch (Throwable unused2) {
                    listQueryIntentActivities2 = arrayList;
                }
                List<ResolveInfo> list2 = listQueryIntentActivities;
                if (!list2.isEmpty() && !listQueryIntentActivities2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                        Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (l.b(resolveInfo.activityInfo.packageName, it.next().activityInfo.packageName)) {
                                    arrayList.add(resolveInfo);
                                    break;
                                }
                            }
                        }
                    }
                } else if (!listQueryIntentActivities2.isEmpty()) {
                    arrayList = listQueryIntentActivities2;
                } else if (!list2.isEmpty()) {
                    arrayList = listQueryIntentActivities;
                }
                I9.b bVar2 = U.f212b;
                C0539a c0539a = new C0539a(bVar, activity, null);
                this.f47072l = strF;
                this.f47073m = arrayList;
                this.f47074n = 1;
                objH = C0575f.h(bVar2, c0539a, this);
                if (objH == aVar) {
                    return aVar;
                }
                list = arrayList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = this.f47073m;
                strF = this.f47072l;
                n.b(obj);
                objH = obj;
            }
            File file = (File) objH;
            bVar.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                uriFromFile = C5849b.getUriForFile(activity, activity.getPackageName() + ".com.zipoapps.premiumhelper.share", file);
                l.c(uriFromFile);
            } else {
                uriFromFile = Uri.fromFile(file);
                l.c(uriFromFile);
            }
            boolean zIsEmpty = list.isEmpty();
            String str = this.f47079s;
            String str2 = this.f47078r;
            String str3 = this.f47077q;
            if (zIsEmpty) {
                intentC = b.c(uriFromFile, b.a(bVar, str3, b.a(bVar, str3, str2)), strF, str);
            } else {
                String strA = b.a(bVar, str3, str2);
                ArrayList arrayList2 = new ArrayList();
                new Intent("android.intent.action.SEND").setType("vnd.android.cursor.dir/email");
                for (ResolveInfo resolveInfo2 : list) {
                    String str4 = resolveInfo2.activityInfo.packageName;
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("vnd.android.cursor.dir/email");
                    intent2.putExtra("android.intent.extra.SUBJECT", strF);
                    intent2.putExtra("android.intent.extra.EMAIL", new String[]{strA});
                    if (str != null) {
                        intent2.putExtra("android.intent.extra.TEXT", str);
                    }
                    intent2.setPackage(str4);
                    intent2.addFlags(1);
                    intent2.putExtra("android.intent.extra.STREAM", uriFromFile);
                    ActivityInfo activityInfo = resolveInfo2.activityInfo;
                    intent2.setClassName(activityInfo.packageName, activityInfo.name);
                    arrayList2.add(intent2);
                }
                intentC = Intent.createChooser((Intent) arrayList2.remove(0), "");
                intentC.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new Intent[0]));
            }
            try {
                activity.startActivity(intentC);
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                e.a.a().f();
            } catch (ActivityNotFoundException unused3) {
                Intent intent3 = new Intent();
                intent3.setAction("android.intent.action.SEND");
                intent3.setDataAndType(uriFromFile, "application/zip");
                try {
                    activity.startActivity(intent3);
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    e.a.a().f();
                } catch (ActivityNotFoundException e4) {
                    va.a.f47104a.d(e4);
                }
            }
            return C1992A.f18074a;
        }
    }

    public b(C0663f c0663f, l8.b bVar, C5201c c5201c) {
        this.f47069a = c0663f;
        this.f47070b = bVar;
        this.f47071c = c5201c;
    }

    public static final String a(b bVar, String str, String str2) {
        bVar.getClass();
        if (str2 != null) {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            if (e.a.a().i.j()) {
                return str2;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(v8.b r12, android.content.Context r13, h9.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.b(v8.b, android.content.Context, h9.c):java.lang.Object");
    }

    public static Intent c(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        intent.setType("vnd.android.cursor.dir/email");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        if (str3 != null) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
        if (uri != null) {
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        return intent;
    }

    public final void d(Activity activity, String email, String str, String str2) {
        l.f(email, "email");
        I9.c cVar = U.f211a;
        C0575f.e(this.f47069a, q.f1782a, null, new a(activity, email, str, str2, null), 2);
    }

    public final void e(Activity activity, String email, String str) {
        l.f(email, "email");
        d<Boolean> PH_SHOW_CONTACT_SUPPORT_DIALOG = i8.d.f38545Y;
        l.e(PH_SHOW_CONTACT_SUPPORT_DIALOG, "PH_SHOW_CONTACT_SUPPORT_DIALOG");
        if (((Boolean) this.f47070b.h(PH_SHOW_CONTACT_SUPPORT_DIALOG)).booleanValue()) {
            int i = ContactSupportActivity.f37060f;
            Intent intent = new Intent(activity, (Class<?>) ContactSupportActivity.class);
            intent.putExtra(Scopes.EMAIL, email);
            if (str != null) {
                intent.putExtra("email_vip", str);
            }
            activity.startActivity(intent);
            return;
        }
        try {
            d(activity, email, null, null);
        } catch (Exception e4) {
            va.a.f47104a.c("Failed to open email app", new Object[0]);
            K4.e.a().b(e4);
            e4.printStackTrace();
        }
    }
}
