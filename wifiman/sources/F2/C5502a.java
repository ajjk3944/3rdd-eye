package f2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import f2.AbstractC5498D;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import net.sqlcipher.database.SQLiteDatabase;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;
import zi.AbstractC8783m;

@AbstractC5498D.b("activity")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lf2/a;", "Lf2/D;", "Lf2/a$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "l", "()Lf2/a$b;", "", "k", "()Z", "destination", "Landroid/os/Bundle;", "args", "Lf2/y;", "navOptions", "Lf2/D$a;", "navigatorExtras", "Lf2/r;", "m", "(Lf2/a$b;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)Lf2/r;", SnmpConfigurator.O_COMMUNITY, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5502a extends AbstractC5498D {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Activity hostActivity;

    /* renamed from: f2.a$b */
    public static class b extends r {

        /* renamed from: m, reason: collision with root package name */
        private Intent f46709m;

        /* renamed from: n, reason: collision with root package name */
        private String f46710n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC5498D activityNavigator) {
            super(activityNavigator);
            AbstractC6492s.i(activityNavigator, "activityNavigator");
        }

        @Override // f2.r
        public boolean J() {
            return false;
        }

        public final String L() {
            Intent intent = this.f46709m;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName M() {
            Intent intent = this.f46709m;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String N() {
            return this.f46710n;
        }

        public final Intent O() {
            return this.f46709m;
        }

        @Override // f2.r
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.f46709m;
                if ((intent != null ? intent.filterEquals(((b) obj).f46709m) : ((b) obj).f46709m == null) && AbstractC6492s.d(this.f46710n, ((b) obj).f46710n)) {
                    return true;
                }
            }
            return false;
        }

        @Override // f2.r
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f46709m;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f46710n;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // f2.r
        public String toString() {
            ComponentName componentNameM = M();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameM != null) {
                sb2.append(" class=");
                sb2.append(componentNameM.getClassName());
            } else {
                String strL = L();
                if (strL != null) {
                    sb2.append(" action=");
                    sb2.append(strL);
                }
            }
            String string = sb2.toString();
            AbstractC6492s.h(string, "sb.toString()");
            return string;
        }
    }

    /* renamed from: f2.a$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46711a = new c();

        c() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public C5502a(Context context) {
        Object next;
        AbstractC6492s.i(context, "context");
        this.context = context;
        Iterator it = AbstractC8783m.n(context, c.f46711a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) next;
    }

    @Override // f2.AbstractC5498D
    public boolean k() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // f2.AbstractC5498D
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @Override // f2.AbstractC5498D
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public r d(b destination, Bundle args, y navOptions, AbstractC5498D.a navigatorExtras) {
        Intent intent;
        int intExtra;
        String strEncode;
        AbstractC6492s.i(destination, "destination");
        if (destination.O() == null) {
            throw new IllegalStateException(("Destination " + destination.s() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.O());
        if (args != null) {
            intent2.putExtras(args);
            String strN = destination.N();
            if (strN != null && strN.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strN);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!args.containsKey(strGroup)) {
                        throw new IllegalArgumentException(("Could not find " + strGroup + " in " + args + " to fill data pattern " + strN).toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    Map mapK = destination.k();
                    AbstractC6492s.f(strGroup);
                    C5509h c5509h = (C5509h) mapK.get(strGroup);
                    AbstractC5496B abstractC5496BA = c5509h != null ? c5509h.a() : null;
                    if (abstractC5496BA == null || (strEncode = abstractC5496BA.i(abstractC5496BA.a(args, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(args.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.hostActivity == null) {
            intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        }
        if (navOptions != null && navOptions.j()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.s());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int iC = navOptions.c();
            int iD = navOptions.d();
            if ((iC <= 0 || !AbstractC6492s.d(resources.getResourceTypeName(iC), "animator")) && (iD <= 0 || !AbstractC6492s.d(resources.getResourceTypeName(iD), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", iC);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", iD);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + " when launching " + destination);
            }
        }
        this.context.startActivity(intent2);
        if (navOptions != null && this.hostActivity != null) {
            int iA = navOptions.a();
            int iB = navOptions.b();
            if ((iA > 0 && AbstractC6492s.d(resources.getResourceTypeName(iA), "animator")) || (iB > 0 && AbstractC6492s.d(resources.getResourceTypeName(iB), "animator"))) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + destination);
            } else if (iA >= 0 || iB >= 0) {
                this.hostActivity.overridePendingTransition(AbstractC7978m.d(iA, 0), AbstractC7978m.d(iB, 0));
            }
        }
        return null;
    }
}
