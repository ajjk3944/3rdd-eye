package nc;

import Zg.AbstractC3689v;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import dc.C5341a;
import ec.AbstractC5452a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class i implements InterfaceC6924a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f54566c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final PackageManager f54567a;

    /* renamed from: b, reason: collision with root package name */
    private final C5341a f54568b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(PackageManager packageManager, C5341a buildConfig) {
        AbstractC6492s.i(packageManager, "packageManager");
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f54567a = packageManager;
        this.f54568b = buildConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent o(i iVar, AbstractC5452a abstractC5452a, Context context) {
        AbstractC6492s.i(context, "context");
        return iVar.t(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", abstractC5452a.a(context).toString(), null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent p(File[] fileArr, i iVar, AbstractC5452a abstractC5452a, AbstractC5452a abstractC5452a2, AbstractC5452a abstractC5452a3, AbstractC5452a abstractC5452a4, Context context) {
        LabeledIntent labeledIntent;
        CharSequence charSequenceA;
        AbstractC6492s.i(context, "context");
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (File file : fileArr) {
            if (file != null) {
                arrayList.add(FileProvider.h(context, iVar.f54568b.a() + ".provider", file));
            }
        }
        String string = abstractC5452a.a(context).toString();
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", string, null));
        if (abstractC5452a2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", abstractC5452a2.a(context));
        }
        if (abstractC5452a3 != null) {
            intent.putExtra("android.intent.extra.TEXT", abstractC5452a3.a(context));
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        AbstractC6492s.h(listQueryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList2 = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent("android.intent.action.SEND_MULTIPLE");
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.putExtra("android.intent.extra.EMAIL", new String[]{string});
            if (abstractC5452a2 != null) {
                intent2.putExtra("android.intent.extra.SUBJECT", abstractC5452a2.a(context));
            }
            if (abstractC5452a3 != null) {
                intent2.putExtra("android.intent.extra.TEXT", abstractC5452a3.a(context));
            }
            intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            arrayList2.add(new LabeledIntent(intent2, resolveInfo.activityInfo.packageName, resolveInfo.loadLabel(context.getPackageManager()), resolveInfo.icon));
        }
        if (arrayList2.size() <= 0) {
            return iVar.t(intent);
        }
        ArrayList arrayList3 = arrayList2.size() > 1 ? arrayList2 : null;
        if (arrayList3 == null || (labeledIntent = (LabeledIntent) arrayList3.remove(arrayList2.size() - 1)) == null) {
            labeledIntent = (LabeledIntent) AbstractC3689v.q0(arrayList2);
        }
        if (abstractC5452a4 == null || (charSequenceA = abstractC5452a4.a(context)) == null) {
            charSequenceA = "";
        }
        Intent intentCreateChooser = Intent.createChooser(labeledIntent, charSequenceA);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new LabeledIntent[0]));
        AbstractC6492s.f(intentCreateChooser);
        return iVar.t(intentCreateChooser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent q(i iVar, String str, Context it) {
        AbstractC6492s.i(it, "it");
        String str2 = String.format("http://play.google.com/store/apps/details?id=%1$s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC6492s.h(str2, "format(...)");
        return iVar.t(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent r(i iVar, Uri uri, Context it) {
        AbstractC6492s.i(it, "it");
        return iVar.t(new Intent("android.intent.action.VIEW", uri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent s(Intent intent, Context context) {
        AbstractC6492s.i(context, "<unused var>");
        return intent;
    }

    private final Intent t(Intent intent) {
        intent.setFlags(276824064);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent u(AbstractC5452a abstractC5452a, File file, i iVar, AbstractC5452a abstractC5452a2, Context context) {
        CharSequence charSequenceA;
        AbstractC6492s.i(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("application/octet-stream");
        if (abstractC5452a != null) {
            intent.putExtra("android.intent.extra.SUBJECT", abstractC5452a.a(context));
        }
        intent.putExtra("android.intent.extra.STREAM", FileProvider.h(context, context.getApplicationContext().getPackageName() + ".provider", file));
        intent.addFlags(1);
        if (abstractC5452a2 == null || (charSequenceA = abstractC5452a2.a(context)) == null) {
            charSequenceA = "";
        }
        Intent intentCreateChooser = Intent.createChooser(intent, charSequenceA);
        AbstractC6492s.h(intentCreateChooser, "createChooser(...)");
        return iVar.t(intentCreateChooser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent v(File file, i iVar, AbstractC5452a abstractC5452a, Context context) {
        CharSequence charSequenceA;
        AbstractC6492s.i(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", FileProvider.h(context, context.getApplicationContext().getPackageName() + ".provider", file));
        intent.addFlags(1);
        if (abstractC5452a == null || (charSequenceA = abstractC5452a.a(context)) == null) {
            charSequenceA = "";
        }
        Intent intentCreateChooser = Intent.createChooser(intent, charSequenceA);
        AbstractC6492s.h(intentCreateChooser, "createChooser(...)");
        return iVar.t(intentCreateChooser);
    }

    @Override // nc.InterfaceC6924a
    public InterfaceC6835l a(String packageName) {
        AbstractC6492s.i(packageName, "packageName");
        final Intent launchIntentForPackage = this.f54567a.getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            return new InterfaceC6835l() { // from class: nc.b
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return i.s(launchIntentForPackage, (Context) obj);
                }
            };
        }
        return null;
    }

    @Override // nc.InterfaceC6924a
    public InterfaceC6835l b(final AbstractC5452a abstractC5452a, final File file) {
        AbstractC6492s.i(file, "file");
        return new InterfaceC6835l() { // from class: nc.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.v(file, this, abstractC5452a, (Context) obj);
            }
        };
    }

    @Override // nc.InterfaceC6924a
    public InterfaceC6835l c(final String packageName) {
        AbstractC6492s.i(packageName, "packageName");
        return new InterfaceC6835l() { // from class: nc.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.q(this.f54547a, packageName, (Context) obj);
            }
        };
    }

    @Override // nc.InterfaceC6924a
    public InterfaceC6835l d(final AbstractC5452a abstractC5452a, final AbstractC5452a abstractC5452a2, final File file) {
        AbstractC6492s.i(file, "file");
        return new InterfaceC6835l() { // from class: nc.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.u(abstractC5452a2, file, this, abstractC5452a, (Context) obj);
            }
        };
    }

    @Override // nc.InterfaceC6924a
    public InterfaceC6835l e(final AbstractC5452a number) {
        AbstractC6492s.i(number, "number");
        return new InterfaceC6835l() { // from class: nc.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.o(this.f54556a, number, (Context) obj);
            }
        };
    }

    @Override // nc.InterfaceC6924a
    public InterfaceC6835l f(final Uri url) {
        AbstractC6492s.i(url, "url");
        return new InterfaceC6835l() { // from class: nc.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.r(this.f54564a, url, (Context) obj);
            }
        };
    }

    @Override // nc.InterfaceC6924a
    public InterfaceC6835l g(final AbstractC5452a abstractC5452a, final AbstractC5452a email, final AbstractC5452a abstractC5452a2, final AbstractC5452a abstractC5452a3, final File... attachment) {
        AbstractC6492s.i(email, "email");
        AbstractC6492s.i(attachment, "attachment");
        return new InterfaceC6835l() { // from class: nc.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.p(attachment, this, email, abstractC5452a2, abstractC5452a3, abstractC5452a, (Context) obj);
            }
        };
    }
}
