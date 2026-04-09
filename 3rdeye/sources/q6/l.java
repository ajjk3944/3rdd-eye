package Q6;

import Q6.q;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;

/* compiled from: VariableMonitorView.kt */
/* loaded from: classes.dex */
public final class l extends v<n, b> {

    /* renamed from: j, reason: collision with root package name */
    public final q.b f11356j;

    /* compiled from: VariableMonitorView.kt */
    public static final class a extends p.e<n> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean areContentsTheSame(n nVar, n nVar2) {
            n oldItem = nVar;
            n newItem = nVar2;
            kotlin.jvm.internal.l.f(oldItem, "oldItem");
            kotlin.jvm.internal.l.f(newItem, "newItem");
            return kotlin.jvm.internal.l.b(oldItem.f11364d, newItem.f11364d);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean areItemsTheSame(n nVar, n nVar2) {
            n oldItem = nVar;
            n newItem = nVar2;
            kotlin.jvm.internal.l.f(oldItem, "oldItem");
            kotlin.jvm.internal.l.f(newItem, "newItem");
            return kotlin.jvm.internal.l.b(oldItem.f11361a, newItem.f11361a);
        }
    }

    /* compiled from: VariableMonitorView.kt */
    public static final class b extends RecyclerView.F {

        /* renamed from: l, reason: collision with root package name */
        public final s f11357l;

        /* renamed from: m, reason: collision with root package name */
        public final q.b f11358m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar, q.b variableMutator) {
            super(sVar);
            kotlin.jvm.internal.l.f(variableMutator, "variableMutator");
            this.f11357l = sVar;
            this.f11358m = variableMutator;
        }
    }

    public l(q.b bVar) {
        super(new a());
        this.f11356j = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.F f10, int i) {
        b holder = (b) f10;
        kotlin.jvm.internal.l.f(holder, "holder");
        n nVar = getCurrentList().get(i);
        kotlin.jvm.internal.l.e(nVar, "currentList[position]");
        n nVar2 = nVar;
        s sVar = holder.f11357l;
        TextView textView = sVar.f11374b;
        String str = nVar2.f11362b;
        int length = str.length();
        String str2 = nVar2.f11361a;
        if (length > 0) {
            str2 = str + '/' + str2;
        }
        textView.setText(str2);
        TextView textView2 = sVar.f11375c;
        String str3 = nVar2.f11363c;
        textView2.setText(str3);
        EditText editText = sVar.f11376d;
        editText.setText(nVar2.f11364d);
        editText.setInputType(str3.equals("number") ? true : str3.equals("integer") ? 2 : 1);
        sVar.f11377e = new m(holder, nVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.F onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.l.f(parent, "parent");
        Context context = parent.getContext();
        kotlin.jvm.internal.l.e(context, "parent.context");
        return new b(new s(context), this.f11356j);
    }
}
