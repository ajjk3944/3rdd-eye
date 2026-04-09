package x8;

import B0.g;
import R0.h;
import R0.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import b9.j;
import com.zipoapps.premiumhelper.e;
import i8.r;
import i9.InterfaceC4463a;
import java.util.Locale;
import kotlin.jvm.internal.l;
import n1.h;

/* compiled from: PreferenceHelper.kt */
/* renamed from: x8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5782b {

    /* renamed from: a, reason: collision with root package name */
    public TextView f47808a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f47809b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47810c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0552b f47811d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47812e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorStateList f47813f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47814g = true;

    /* renamed from: h, reason: collision with root package name */
    public final String f47815h;
    public final String i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PreferenceHelper.kt */
    /* renamed from: x8.b$b, reason: collision with other inner class name */
    public static final class EnumC0552b {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ EnumC0552b[] $VALUES;
        public static final EnumC0552b START = new EnumC0552b("START", 0);
        public static final EnumC0552b END = new EnumC0552b("END", 1);

        private static final /* synthetic */ EnumC0552b[] $values() {
            return new EnumC0552b[]{START, END};
        }

        static {
            EnumC0552b[] enumC0552bArr$values = $values();
            $VALUES = enumC0552bArr$values;
            $ENTRIES = com.google.gson.internal.c.l(enumC0552bArr$values);
        }

        private EnumC0552b(String str, int i) {
        }

        public static InterfaceC4463a<EnumC0552b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0552b valueOf(String str) {
            return (EnumC0552b) Enum.valueOf(EnumC0552b.class, str);
        }

        public static EnumC0552b[] values() {
            return (EnumC0552b[]) $VALUES.clone();
        }
    }

    /* compiled from: PreferenceHelper.kt */
    /* renamed from: x8.b$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47817a;

        static {
            int[] iArr = new int[EnumC0552b.values().length];
            try {
                iArr[EnumC0552b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0552b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f47817a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5782b(Context context, AttributeSet attributeSet) {
        this.f47810c = -1;
        this.f47811d = EnumC0552b.END;
        this.f47812e = -1;
        if (context instanceof InterfaceC1790x) {
            ((InterfaceC1790x) context).getLifecycle().addObserver(new a());
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f38632b);
        this.f47810c = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f47812e = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        this.f47813f = typedArrayObtainStyledAttributes.getColorStateList(3);
        String nonResourceString = typedArrayObtainStyledAttributes.getNonResourceString(4);
        String upperCase = (nonResourceString == null ? "END" : nonResourceString).toUpperCase(Locale.ROOT);
        l.e(upperCase, "toUpperCase(...)");
        this.f47811d = EnumC0552b.valueOf(upperCase);
        this.f47815h = typedArrayObtainStyledAttributes.getString(8);
        this.i = typedArrayObtainStyledAttributes.getString(6);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean b() {
        e.f37006D.getClass();
        return e.a.a().i.j();
    }

    public final void a(h holder) {
        TextView textView;
        TextView textView2;
        l.f(holder, "holder");
        View viewA = holder.a(R.id.title);
        if (viewA instanceof TextView) {
            this.f47808a = (TextView) viewA;
            d();
            String str = this.f47815h;
            if (str != null && b() && (textView2 = this.f47808a) != null) {
                textView2.setText(str);
            }
        }
        View viewA2 = holder.a(R.id.summary);
        if (viewA2 instanceof TextView) {
            this.f47809b = (TextView) viewA2;
            String str2 = this.i;
            if (str2 == null || !b() || (textView = this.f47809b) == null) {
                return;
            }
            textView.setText(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        TextView textView;
        if (!this.f47814g || (textView = this.f47808a) == 0) {
            return;
        }
        textView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 10.0f, textView.getResources().getDisplayMetrics()));
        ColorStateList colorStateListValueOf = this.f47813f;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(textView.getCurrentTextColor());
            l.e(colorStateListValueOf, "valueOf(...)");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            h.a.f(textView, colorStateListValueOf);
        } else if (textView instanceof k) {
            ((k) textView).setSupportCompoundDrawablesTintList(colorStateListValueOf);
        }
        int i = this.f47810c;
        if (i == -1) {
            i = com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.drawable.ic_preference_lock;
        }
        EnumC0552b enumC0552b = this.f47811d;
        int i10 = this.f47812e;
        if (i10 == -1) {
            int i11 = c.f47817a[enumC0552b.ordinal()];
            if (i11 == 1) {
                textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                return;
            } else {
                if (i11 != 2) {
                    throw new j();
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
                return;
            }
        }
        Resources resources = textView.getResources();
        Resources.Theme theme = textView.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = g.f359a;
        Drawable drawableA = g.a.a(resources, i, theme);
        if (drawableA == null) {
            throw new IllegalStateException("Failed to load icon");
        }
        drawableA.setBounds(0, 0, i10, i10);
        int i12 = c.f47817a[enumC0552b.ordinal()];
        if (i12 == 1) {
            textView.setCompoundDrawables(drawableA, null, null, null);
        } else {
            if (i12 != 2) {
                throw new j();
            }
            textView.setCompoundDrawables(null, null, drawableA, null);
        }
    }

    public void d() {
        if (!b()) {
            c();
            return;
        }
        TextView textView = this.f47808a;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    /* compiled from: PreferenceHelper.kt */
    /* renamed from: x8.b$a */
    public static final class a implements InterfaceC1771d {
        public a() {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onResume(InterfaceC1790x interfaceC1790x) {
            TextView textView;
            TextView textView2;
            C5782b c5782b = C5782b.this;
            c5782b.d();
            String str = c5782b.f47815h;
            if (str != null && C5782b.b() && (textView2 = c5782b.f47808a) != null) {
                textView2.setText(str);
            }
            String str2 = c5782b.i;
            if (str2 == null || !C5782b.b() || (textView = c5782b.f47809b) == null) {
                return;
            }
            textView.setText(str2);
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onCreate(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onDestroy(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onPause(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final /* synthetic */ void onStart(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onStop(InterfaceC1790x interfaceC1790x) {
        }
    }
}
