package y0;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.io.FileNotFoundException;
import java.util.Objects;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f47911a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f47912b;

    /* renamed from: c, reason: collision with root package name */
    public String f47913c;

    /* renamed from: d, reason: collision with root package name */
    public String f47914d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47915e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47916f;

    /* compiled from: Person.java */
    public static class a {
        public static v a(Person person) {
            IconCompat iconCompat;
            CharSequence name = person.getName();
            IconCompat iconCompatB = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f15491k;
                icon.getClass();
                int iC = IconCompat.a.c(icon);
                if (iC != 2) {
                    if (iC == 4) {
                        Uri uriD = IconCompat.a.d(icon);
                        uriD.getClass();
                        String string = uriD.toString();
                        string.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f15493b = string;
                    } else if (iC != 6) {
                        iconCompatB = new IconCompat(-1);
                        iconCompatB.f15493b = icon;
                    } else {
                        Uri uriD2 = IconCompat.a.d(icon);
                        uriD2.getClass();
                        String string2 = uriD2.toString();
                        string2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.f15493b = string2;
                    }
                    iconCompatB = iconCompat;
                } else {
                    iconCompatB = IconCompat.b(null, IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            }
            String uri = person.getUri();
            String key = person.getKey();
            boolean zIsBot = person.isBot();
            boolean zIsImportant = person.isImportant();
            v vVar = new v();
            vVar.f47911a = name;
            vVar.f47912b = iconCompatB;
            vVar.f47913c = uri;
            vVar.f47914d = key;
            vVar.f47915e = zIsBot;
            vVar.f47916f = zIsImportant;
            return vVar;
        }

        public static Person b(v vVar) throws FileNotFoundException {
            Person.Builder name = new Person.Builder().setName(vVar.f47911a);
            Icon iconF = null;
            IconCompat iconCompat = vVar.f47912b;
            if (iconCompat != null) {
                iconCompat.getClass();
                iconF = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(iconF).setUri(vVar.f47913c).setKey(vVar.f47914d).setBot(vVar.f47915e).setImportant(vVar.f47916f).build();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String str = this.f47914d;
        String str2 = vVar.f47914d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.f47911a), Objects.toString(vVar.f47911a)) && Objects.equals(this.f47913c, vVar.f47913c) && Boolean.valueOf(this.f47915e).equals(Boolean.valueOf(vVar.f47915e)) && Boolean.valueOf(this.f47916f).equals(Boolean.valueOf(vVar.f47916f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.f47914d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.f47911a, this.f47913c, Boolean.valueOf(this.f47915e), Boolean.valueOf(this.f47916f));
    }
}
