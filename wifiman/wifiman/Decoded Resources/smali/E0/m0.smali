.class public interface abstract LE0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/M;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/m0$a;,
        LE0/m0$b;
    }
.end annotation


# static fields
.field public static final L:LE0/m0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LE0/m0$a;->a:LE0/m0$a;

    sput-object v0, LE0/m0;->L:LE0/m0$a;

    return-void
.end method

.method public static synthetic B(LE0/m0;LE0/G;ZZILjava/lang/Object;)V
    .locals 1

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-interface {p0, p1, p2, p3}, LE0/m0;->C(LE0/G;ZZ)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onRequestRelayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic f(LE0/m0;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-interface {p0, p1}, LE0/m0;->a(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: measureAndLayout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic m(LE0/m0;LE0/G;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2}, LE0/m0;->s(LE0/G;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic n(LE0/m0;Lmh/p;Lmh/a;Lp0/c;ILjava/lang/Object;)LE0/l0;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, LE0/m0;->y(Lmh/p;Lmh/a;Lp0/c;)LE0/l0;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createLayer"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic v(LE0/m0;LE0/G;ZZZILjava/lang/Object;)V
    .locals 1

    if-nez p6, :cond_3

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x1

    :cond_2
    invoke-interface {p0, p1, p2, p3, p4}, LE0/m0;->o(LE0/G;ZZZ)V

    return-void

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onRequestMeasure"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract A(LE0/G;J)V
.end method

.method public abstract C(LE0/G;ZZ)V
.end method

.method public abstract a(Z)V
.end method

.method public abstract b(LE0/G;)V
.end method

.method public abstract c(LE0/G;)V
.end method

.method public abstract d(J)J
.end method

.method public abstract e(J)J
.end method

.method public abstract getAccessibilityManager()Landroidx/compose/ui/platform/i;
.end method

.method public abstract getAutofill()Lg0/d;
.end method

.method public abstract getAutofillTree()Lg0/i;
.end method

.method public abstract getClipboardManager()Landroidx/compose/ui/platform/h0;
.end method

.method public abstract getCoroutineContext()Ldh/i;
.end method

.method public abstract getDensity()LY0/d;
.end method

.method public abstract getDragAndDropManager()Li0/c;
.end method

.method public abstract getFocusOwner()Lk0/g;
.end method

.method public abstract getFontFamilyResolver()LQ0/k$b;
.end method

.method public abstract getFontLoader()LQ0/j$a;
.end method

.method public abstract getGraphicsContext()Lm0/H0;
.end method

.method public abstract getHapticFeedBack()Lu0/a;
.end method

.method public abstract getInputModeManager()Lv0/b;
.end method

.method public abstract getLayoutDirection()LY0/t;
.end method

.method public abstract getModifierLocalManager()LD0/f;
.end method

.method public abstract getPlacementScope()Landroidx/compose/ui/layout/t$a;
.end method

.method public abstract getPointerIconService()Ly0/v;
.end method

.method public abstract getRoot()LE0/G;
.end method

.method public abstract getSharedDrawScope()LE0/I;
.end method

.method public abstract getShowLayoutBounds()Z
.end method

.method public abstract getSnapshotObserver()LE0/o0;
.end method

.method public abstract getSoftwareKeyboardController()Landroidx/compose/ui/platform/n1;
.end method

.method public abstract getTextInputService()LR0/T;
.end method

.method public abstract getTextToolbar()Landroidx/compose/ui/platform/q1;
.end method

.method public abstract getViewConfiguration()Landroidx/compose/ui/platform/w1;
.end method

.method public abstract getWindowInfo()Landroidx/compose/ui/platform/E1;
.end method

.method public abstract i(LE0/G;)V
.end method

.method public abstract k(Lmh/a;)V
.end method

.method public abstract l(Landroid/view/View;)V
.end method

.method public abstract o(LE0/G;ZZZ)V
.end method

.method public abstract s(LE0/G;Z)V
.end method

.method public abstract setShowLayoutBounds(Z)V
.end method

.method public abstract u(LE0/G;)V
.end method

.method public abstract w(Lmh/p;Ldh/e;)Ljava/lang/Object;
.end method

.method public abstract x()V
.end method

.method public abstract y(Lmh/p;Lmh/a;Lp0/c;)LE0/l0;
.end method

.method public abstract z()V
.end method
