.class final Landroidx/compose/ui/window/j;
.super Lc/r;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/B1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/window/j$c;
    }
.end annotation


# instance fields
.field private d:Lmh/a;

.field private e:Landroidx/compose/ui/window/i;

.field private final f:Landroid/view/View;

.field private final g:Landroidx/compose/ui/window/h;

.field private final h:F

.field private final i:I


# direct methods
.method public constructor <init>(Lmh/a;Landroidx/compose/ui/window/i;Landroid/view/View;LY0/t;LY0/d;Ljava/util/UUID;)V
    .locals 6

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-ge v2, v3, :cond_1

    invoke-virtual {p2}, Landroidx/compose/ui/window/i;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget v2, Lf0/j;->b:I

    goto :goto_1

    :cond_1
    :goto_0
    sget v2, Lf0/j;->a:I

    :goto_1
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v0, v2, v1, v3}, Lc/r;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/ui/window/j;->d:Lmh/a;

    iput-object p2, p0, Landroidx/compose/ui/window/j;->e:Landroidx/compose/ui/window/i;

    iput-object p3, p0, Landroidx/compose/ui/window/j;->f:Landroid/view/View;

    const/16 p1, 0x8

    int-to-float p1, p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    iput p1, p0, Landroidx/compose/ui/window/j;->h:F

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    and-int/lit16 v0, v0, 0xf0

    iput v0, p0, Landroidx/compose/ui/window/j;->i:I

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x106000d

    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    iget-object v0, p0, Landroidx/compose/ui/window/j;->e:Landroidx/compose/ui/window/i;

    invoke-virtual {v0}, Landroidx/compose/ui/window/i;->a()Z

    move-result v0

    invoke-static {p2, v0}, LF1/i0;->b(Landroid/view/Window;Z)V

    new-instance v0, Landroidx/compose/ui/window/h;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Landroidx/compose/ui/window/h;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    sget v1, Lf0/h;->H:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Dialog:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {v0, v1, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-interface {p5, p1}, LY0/d;->d1(F)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    new-instance p1, Landroidx/compose/ui/window/j$a;

    invoke-direct {p1}, Landroidx/compose/ui/window/j$a;-><init>()V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    iput-object v0, p0, Landroidx/compose/ui/window/j;->g:Landroidx/compose/ui/window/h;

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    instance-of p2, p1, Landroid/view/ViewGroup;

    if-eqz p2, :cond_2

    move-object v3, p1

    check-cast v3, Landroid/view/ViewGroup;

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v3}, Landroidx/compose/ui/window/j;->h(Landroid/view/ViewGroup;)V

    :cond_3
    invoke-virtual {p0, v0}, Lc/r;->setContentView(Landroid/view/View;)V

    invoke-static {p3}, Landroidx/lifecycle/T;->a(Landroid/view/View;)Landroidx/lifecycle/o;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/T;->b(Landroid/view/View;Landroidx/lifecycle/o;)V

    invoke-static {p3}, Landroidx/lifecycle/U;->a(Landroid/view/View;)Landroidx/lifecycle/S;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/U;->b(Landroid/view/View;Landroidx/lifecycle/S;)V

    invoke-static {p3}, Lq2/g;->a(Landroid/view/View;)Lq2/f;

    move-result-object p1

    invoke-static {v0, p1}, Lq2/g;->b(Landroid/view/View;Lq2/f;)V

    iget-object p1, p0, Landroidx/compose/ui/window/j;->d:Lmh/a;

    iget-object p2, p0, Landroidx/compose/ui/window/j;->e:Landroidx/compose/ui/window/i;

    invoke-virtual {p0, p1, p2, p4}, Landroidx/compose/ui/window/j;->o(Lmh/a;Landroidx/compose/ui/window/i;LY0/t;)V

    invoke-virtual {p0}, Lc/r;->b()Lc/G;

    move-result-object v0

    new-instance v3, Landroidx/compose/ui/window/j$b;

    invoke-direct {v3, p0}, Landroidx/compose/ui/window/j$b;-><init>(Landroidx/compose/ui/window/j;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lc/I;->b(Lc/G;Landroidx/lifecycle/o;ZLmh/l;ILjava/lang/Object;)Lc/F;

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dialog has no window"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final h(Landroid/view/ViewGroup;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    instance-of v1, p0, Landroidx/compose/ui/window/h;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    invoke-static {v2}, Landroidx/compose/ui/window/j;->h(Landroid/view/ViewGroup;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static final synthetic i(Landroidx/compose/ui/window/j;)Lmh/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/window/j;->d:Lmh/a;

    return-object p0
.end method

.method public static final synthetic j(Landroidx/compose/ui/window/j;)Landroidx/compose/ui/window/i;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/window/j;->e:Landroidx/compose/ui/window/i;

    return-object p0
.end method

.method private final m(LY0/t;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/window/j;->g:Landroidx/compose/ui/window/h;

    sget-object v1, Landroidx/compose/ui/window/j$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method private final n(Landroidx/compose/ui/window/s;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/window/j;->f:Landroid/view/View;

    invoke-static {v0}, Landroidx/compose/ui/window/b;->i(Landroid/view/View;)Z

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/window/t;->a(Landroidx/compose/ui/window/s;Z)Z

    move-result p1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    const/16 v1, 0x2000

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/16 p1, -0x2001

    :goto_0
    invoke-virtual {v0, p1, v1}, Landroid/view/Window;->setFlags(II)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/j;->g:Landroidx/compose/ui/window/h;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/a;->e()V

    return-void
.end method

.method public final l(LT/q;Lmh/p;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/j;->g:Landroidx/compose/ui/window/h;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/window/h;->m(LT/q;Lmh/p;)V

    return-void
.end method

.method public final o(Lmh/a;Landroidx/compose/ui/window/i;LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/j;->d:Lmh/a;

    iput-object p2, p0, Landroidx/compose/ui/window/j;->e:Landroidx/compose/ui/window/i;

    invoke-virtual {p2}, Landroidx/compose/ui/window/i;->d()Landroidx/compose/ui/window/s;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/compose/ui/window/j;->n(Landroidx/compose/ui/window/s;)V

    invoke-direct {p0, p3}, Landroidx/compose/ui/window/j;->m(LY0/t;)V

    invoke-virtual {p2}, Landroidx/compose/ui/window/i;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/window/j;->g:Landroidx/compose/ui/window/h;

    invoke-virtual {p1}, Landroidx/compose/ui/window/h;->k()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p3, -0x2

    invoke-virtual {p1, p3, p3}, Landroid/view/Window;->setLayout(II)V

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/window/j;->g:Landroidx/compose/ui/window/h;

    invoke-virtual {p2}, Landroidx/compose/ui/window/i;->e()Z

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/compose/ui/window/h;->n(Z)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1f

    if-ge p1, p3, :cond_2

    invoke-virtual {p2}, Landroidx/compose/ui/window/i;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_2

    iget p2, p0, Landroidx/compose/ui/window/j;->i:I

    invoke-virtual {p1, p2}, Landroid/view/Window;->setSoftInputMode(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_2

    const/16 p2, 0x10

    invoke-virtual {p1, p2}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/window/j;->e:Landroidx/compose/ui/window/i;

    invoke-virtual {v0}, Landroidx/compose/ui/window/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/window/j;->d:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return p1
.end method
