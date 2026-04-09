package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import c9.C2099t;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.yandex.mobile.ads.impl.xx;

/* loaded from: classes3.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    private final lw f25802a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f25803b;

    /* renamed from: c, reason: collision with root package name */
    private final ProgressBar f25804c;

    public cy(IntegrationInspectorActivity activity, final p9.l<? super xx, C1992A> onAction, gx imageLoader, LinearLayoutManager layoutManager, lw debugPanelAdapter) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(onAction, "onAction");
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        kotlin.jvm.internal.l.f(layoutManager, "layoutManager");
        kotlin.jvm.internal.l.f(debugPanelAdapter, "debugPanelAdapter");
        this.f25802a = debugPanelAdapter;
        ImageButton imageButton = (ImageButton) activity.findViewById(R.id.toolbar_navigation_button);
        this.f25803b = (TextView) activity.findViewById(R.id.toolbar_title);
        this.f25804c = (ProgressBar) activity.findViewById(R.id.loading_view);
        RecyclerView recyclerView = (RecyclerView) activity.findViewById(R.id.recycler_view);
        hx hxVar = new hx();
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cy.a(onAction, view);
            }
        });
        recyclerView.setAdapter(debugPanelAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(hxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p9.l onAction, View view) {
        kotlin.jvm.internal.l.f(onAction, "$onAction");
        onAction.invoke(xx.d.f35529a);
    }

    public final void a(ay state) {
        kotlin.jvm.internal.l.f(state, "state");
        if (state.d()) {
            this.f25802a.submitList(C2099t.f18581b);
            this.f25804c.setVisibility(0);
        } else {
            this.f25802a.submitList(state.c());
            this.f25804c.setVisibility(8);
        }
        this.f25803b.setText(state.a().a());
    }
}
