package androidx.compose.ui.node;

import a1.j;
import a1.k;
import c1.b;
import e1.g;
import e2.m;
import g1.w;
import kotlin.Metadata;
import o1.a;
import pq.h;
import t2.c;
import t2.i;
import v1.u;
import x1.f0;
import x1.h0;
import x1.n1;
import y1.f;
import y1.r1;
import y1.s1;
import y1.x0;
import y1.x1;
import y1.y0;
import y1.z1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "", "x1/f0", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Owner {
    f getAccessibilityManager();

    a1.f getAutofill();

    j getAutofillManager();

    k getAutofillTree();

    x0 getClipboard();

    y0 getClipboardManager();

    h getCoroutineContext();

    c getDensity();

    b getDragAndDropManager();

    g getFocusOwner();

    k2.g getFontFamilyResolver();

    k2.f getFontLoader();

    w getGraphicsContext();

    a getHapticFeedBack();

    p1.b getInputModeManager();

    i getLayoutDirection();

    u getPlacementScope();

    r1.i getPointerIconService();

    f2.a getRectManager();

    f0 getRoot();

    m getSemanticsOwner();

    h0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    n1 getSnapshotObserver();

    r1 getSoftwareKeyboardController();

    l2.c getTextInputService();

    s1 getTextToolbar();

    x1 getViewConfiguration();

    z1 getWindowInfo();

    void setShowLayoutBounds(boolean z10);
}
