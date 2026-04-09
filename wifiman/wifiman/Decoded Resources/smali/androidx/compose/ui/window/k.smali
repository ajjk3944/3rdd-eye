.class public final Landroidx/compose/ui/window/k;
.super Landroidx/compose/ui/platform/a;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/B1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/window/k$c;,
        Landroidx/compose/ui/window/k$e;
    }
.end annotation


# static fields
.field private static final C:Landroidx/compose/ui/window/k$c;

.field public static final D:I

.field private static final E:Lmh/l;


# instance fields
.field private A:Z

.field private final B:[I

.field private i:Lmh/a;

.field private j:Landroidx/compose/ui/window/r;

.field private k:Ljava/lang/String;

.field private final l:Landroid/view/View;

.field private final m:Landroidx/compose/ui/window/m;

.field private final n:Landroid/view/WindowManager;

.field private final o:Landroid/view/WindowManager$LayoutParams;

.field private p:Landroidx/compose/ui/window/q;

.field private q:LY0/t;

.field private final r:LT/q0;

.field private final s:LT/q0;

.field private t:LY0/p;

.field private final u:LT/z1;

.field private final v:F

.field private final w:Landroid/graphics/Rect;

.field private final x:Landroidx/compose/runtime/snapshots/l;

.field private y:Ljava/lang/Object;

.field private final z:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/window/k$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/window/k$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/window/k;->C:Landroidx/compose/ui/window/k$c;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/window/k;->D:I

    sget-object v0, Landroidx/compose/ui/window/k$b;->a:Landroidx/compose/ui/window/k$b;

    sput-object v0, Landroidx/compose/ui/window/k;->E:Lmh/l;

    return-void
.end method

.method public constructor <init>(Lmh/a;Landroidx/compose/ui/window/r;Ljava/lang/String;Landroid/view/View;LY0/d;Landroidx/compose/ui/window/q;Ljava/util/UUID;Landroidx/compose/ui/window/m;)V
    .locals 6

    .line 5
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object p1, p0, Landroidx/compose/ui/window/k;->i:Lmh/a;

    .line 7
    iput-object p2, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    .line 8
    iput-object p3, p0, Landroidx/compose/ui/window/k;->k:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Landroidx/compose/ui/window/k;->l:Landroid/view/View;

    .line 10
    iput-object p8, p0, Landroidx/compose/ui/window/k;->m:Landroidx/compose/ui/window/m;

    .line 11
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Landroidx/compose/ui/window/k;->n:Landroid/view/WindowManager;

    .line 12
    invoke-direct {p0}, Landroidx/compose/ui/window/k;->l()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    .line 13
    iput-object p6, p0, Landroidx/compose/ui/window/k;->p:Landroidx/compose/ui/window/q;

    .line 14
    sget-object p1, LY0/t;->Ltr:LY0/t;

    iput-object p1, p0, Landroidx/compose/ui/window/k;->q:LY0/t;

    const/4 p1, 0x0

    const/4 p2, 0x2

    .line 15
    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/k;->r:LT/q0;

    .line 16
    invoke-static {p1, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/k;->s:LT/q0;

    .line 17
    new-instance p3, Landroidx/compose/ui/window/k$f;

    invoke-direct {p3, p0}, Landroidx/compose/ui/window/k$f;-><init>(Landroidx/compose/ui/window/k;)V

    invoke-static {p3}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/k;->u:LT/z1;

    const/16 p3, 0x8

    int-to-float p3, p3

    .line 18
    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    .line 19
    iput p3, p0, Landroidx/compose/ui/window/k;->v:F

    .line 20
    new-instance p6, Landroid/graphics/Rect;

    invoke-direct {p6}, Landroid/graphics/Rect;-><init>()V

    iput-object p6, p0, Landroidx/compose/ui/window/k;->w:Landroid/graphics/Rect;

    .line 21
    new-instance p6, Landroidx/compose/runtime/snapshots/l;

    new-instance p8, Landroidx/compose/ui/window/k$g;

    invoke-direct {p8, p0}, Landroidx/compose/ui/window/k$g;-><init>(Landroidx/compose/ui/window/k;)V

    invoke-direct {p6, p8}, Landroidx/compose/runtime/snapshots/l;-><init>(Lmh/l;)V

    iput-object p6, p0, Landroidx/compose/ui/window/k;->x:Landroidx/compose/runtime/snapshots/l;

    const p6, 0x1020002

    .line 22
    invoke-virtual {p0, p6}, Landroid/view/View;->setId(I)V

    .line 23
    invoke-static {p4}, Landroidx/lifecycle/T;->a(Landroid/view/View;)Landroidx/lifecycle/o;

    move-result-object p6

    invoke-static {p0, p6}, Landroidx/lifecycle/T;->b(Landroid/view/View;Landroidx/lifecycle/o;)V

    .line 24
    invoke-static {p4}, Landroidx/lifecycle/U;->a(Landroid/view/View;)Landroidx/lifecycle/S;

    move-result-object p6

    invoke-static {p0, p6}, Landroidx/lifecycle/U;->b(Landroid/view/View;Landroidx/lifecycle/S;)V

    .line 25
    invoke-static {p4}, Lq2/g;->a(Landroid/view/View;)Lq2/f;

    move-result-object p4

    invoke-static {p0, p4}, Lq2/g;->b(Landroid/view/View;Lq2/f;)V

    .line 26
    sget p4, Lf0/h;->H:I

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string p8, "Popup:"

    invoke-virtual {p6, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p0, p4, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 p4, 0x0

    .line 27
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 28
    invoke-interface {p5, p3}, LY0/d;->d1(F)F

    move-result p3

    invoke-virtual {p0, p3}, Landroid/view/View;->setElevation(F)V

    .line 29
    new-instance p3, Landroidx/compose/ui/window/k$a;

    invoke-direct {p3}, Landroidx/compose/ui/window/k$a;-><init>()V

    invoke-virtual {p0, p3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 30
    sget-object p3, Landroidx/compose/ui/window/g;->a:Landroidx/compose/ui/window/g;

    invoke-virtual {p3}, Landroidx/compose/ui/window/g;->a()Lmh/p;

    move-result-object p3

    invoke-static {p3, p1, p2, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/k;->z:LT/q0;

    .line 31
    new-array p1, p2, [I

    iput-object p1, p0, Landroidx/compose/ui/window/k;->B:[I

    return-void
.end method

.method public synthetic constructor <init>(Lmh/a;Landroidx/compose/ui/window/r;Ljava/lang/String;Landroid/view/View;LY0/d;Landroidx/compose/ui/window/q;Ljava/util/UUID;Landroidx/compose/ui/window/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Landroidx/compose/ui/window/o;

    invoke-direct {v0}, Landroidx/compose/ui/window/o;-><init>()V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Landroidx/compose/ui/window/p;

    invoke-direct {v0}, Landroidx/compose/ui/window/p;-><init>()V

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_1
    move-object/from16 v9, p8

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 4
    invoke-direct/range {v1 .. v9}, Landroidx/compose/ui/window/k;-><init>(Lmh/a;Landroidx/compose/ui/window/r;Ljava/lang/String;Landroid/view/View;LY0/d;Landroidx/compose/ui/window/q;Ljava/util/UUID;Landroidx/compose/ui/window/m;)V

    return-void
.end method

.method private final getContent()Lmh/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/p;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/window/k;->z:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/p;

    return-object v0
.end method

.method private final getDisplayHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method private final getDisplayWidth()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public static synthetic getParams$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getParentLayoutCoordinates()LC0/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->s:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC0/r;

    return-object v0
.end method

.method public static final synthetic k(Landroidx/compose/ui/window/k;)LC0/r;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/window/k;->getParentLayoutCoordinates()LC0/r;

    move-result-object p0

    return-object p0
.end method

.method private final l()Landroid/view/WindowManager$LayoutParams;
    .locals 3

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    const v1, 0x800033

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object v1, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    iget-object v2, p0, Landroidx/compose/ui/window/k;->l:Landroid/view/View;

    invoke-static {v2}, Landroidx/compose/ui/window/b;->i(Landroid/view/View;)Z

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/ui/window/b;->e(Landroidx/compose/ui/window/r;Z)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 v1, 0x3ea

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    iget-object v1, p0, Landroidx/compose/ui/window/k;->l:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v1

    iput-object v1, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    iget-object v1, p0, Landroidx/compose/ui/window/k;->l:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lf0/i;->d:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private final n()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-virtual {v0}, Landroidx/compose/ui/window/r;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/window/k;->y:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->i:Lmh/a;

    invoke-static {v0}, Landroidx/compose/ui/window/e;->b(Lmh/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/window/k;->y:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/window/k;->y:Ljava/lang/Object;

    invoke-static {p0, v0}, Landroidx/compose/ui/window/e;->d(Landroid/view/View;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final o()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/window/k;->y:Ljava/lang/Object;

    invoke-static {p0, v0}, Landroidx/compose/ui/window/e;->e(Landroid/view/View;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/window/k;->y:Ljava/lang/Object;

    return-void
.end method

.method private final s(LY0/t;)V
    .locals 2

    sget-object v0, Landroidx/compose/ui/window/k$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-super {p0, v0}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method private final setContent(Lmh/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/p;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/window/k;->z:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final setParentLayoutCoordinates(LC0/r;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->s:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final w(Landroidx/compose/ui/window/r;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/window/r;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-virtual {v0}, Landroidx/compose/ui/window/r;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    :cond_1
    iput-object p1, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    iget-object v0, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Landroidx/compose/ui/window/k;->l:Landroid/view/View;

    invoke-static {v1}, Landroidx/compose/ui/window/b;->i(Landroid/view/View;)Z

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/window/b;->e(Landroidx/compose/ui/window/r;Z)I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object p1, p0, Landroidx/compose/ui/window/k;->m:Landroidx/compose/ui/window/m;

    iget-object v0, p0, Landroidx/compose/ui/window/k;->n:Landroid/view/WindowManager;

    iget-object v1, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, v0, p0, v1}, Landroidx/compose/ui/window/m;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public a(LT/l;I)V
    .locals 4

    const v0, -0x331e2520

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-direct {p0}, Landroidx/compose/ui/window/k;->getContent()Lmh/p;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Landroidx/compose/ui/window/k$d;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/window/k$d;-><init>(Landroidx/compose/ui/window/k;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_6
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-virtual {v0}, Landroidx/compose/ui/window/r;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    :cond_1
    return v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object p1, p0, Landroidx/compose/ui/window/k;->i:Lmh/a;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_3
    return v1

    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public g(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroidx/compose/ui/platform/a;->g(ZIIII)V

    iget-object p1, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-virtual {p1}, Landroidx/compose/ui/window/r;->f()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iput p3, p2, Landroid/view/WindowManager$LayoutParams;->width:I

    iget-object p2, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->height:I

    iget-object p1, p0, Landroidx/compose/ui/window/k;->m:Landroidx/compose/ui/window/m;

    iget-object p2, p0, Landroidx/compose/ui/window/k;->n:Landroid/view/WindowManager;

    iget-object p3, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p2, p0, p3}, Landroidx/compose/ui/window/m;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method public final getCanCalculatePosition()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->u:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getParams$ui_release()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public final getParentLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->q:LY0/t;

    return-object v0
.end method

.method public final getPopupContentSize-bOM6tXw()LY0/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->r:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/r;

    return-object v0
.end method

.method public final getPositionProvider()Landroidx/compose/ui/window/q;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->p:Landroidx/compose/ui/window/q;

    return-object v0
.end method

.method protected getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/window/k;->A:Z

    return v0
.end method

.method public getSubCompositionView()Landroidx/compose/ui/platform/a;
    .locals 0

    return-object p0
.end method

.method public final getTestTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->k:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic getViewRoot()Landroid/view/View;
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/platform/B1;->getViewRoot()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public h(II)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-virtual {v0}, Landroidx/compose/ui/window/r;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/a;->h(II)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/window/k;->getDisplayWidth()I

    move-result p1

    const/high16 p2, -0x80000000

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-direct {p0}, Landroidx/compose/ui/window/k;->getDisplayHeight()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/a;->h(II)V

    :goto_0
    return-void
.end method

.method public final m()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/lifecycle/T;->b(Landroid/view/View;Landroidx/lifecycle/o;)V

    iget-object v0, p0, Landroidx/compose/ui/window/k;->n:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/platform/a;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/compose/ui/window/k;->x:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->s()V

    invoke-direct {p0}, Landroidx/compose/ui/window/k;->n()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/compose/ui/window/k;->x:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->t()V

    iget-object v0, p0, Landroidx/compose/ui/window/k;->x:Landroidx/compose/runtime/snapshots/l;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/l;->j()V

    invoke-direct {p0}, Landroidx/compose/ui/window/k;->o()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-virtual {v0}, Landroidx/compose/ui/window/r;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v1, v1, v3

    if-gez v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_3

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/window/k;->i:Lmh/a;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_2
    return v0

    :cond_3
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_5

    iget-object p1, p0, Landroidx/compose/ui/window/k;->i:Lmh/a;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_4
    return v0

    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final p()V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/window/k;->B:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    iget-object v5, p0, Landroidx/compose/ui/window/k;->l:Landroid/view/View;

    invoke-virtual {v5, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, Landroidx/compose/ui/window/k;->B:[I

    aget v1, v0, v1

    if-ne v2, v1, :cond_0

    aget v0, v0, v3

    if-eq v4, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/k;->u()V

    :cond_1
    return-void
.end method

.method public final q(LT/q;Lmh/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/a;->setParentCompositionContext(LT/q;)V

    invoke-direct {p0, p2}, Landroidx/compose/ui/window/k;->setContent(Lmh/p;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/window/k;->A:Z

    return-void
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/window/k;->n:Landroid/view/WindowManager;

    iget-object v1, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0

    return-void
.end method

.method public final setParentLayoutDirection(LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/k;->q:LY0/t;

    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(LY0/r;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->r:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPositionProvider(Landroidx/compose/ui/window/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/k;->p:Landroidx/compose/ui/window/q;

    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/k;->k:Ljava/lang/String;

    return-void
.end method

.method public final t(Lmh/a;Landroidx/compose/ui/window/r;Ljava/lang/String;LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/k;->i:Lmh/a;

    iput-object p3, p0, Landroidx/compose/ui/window/k;->k:Ljava/lang/String;

    invoke-direct {p0, p2}, Landroidx/compose/ui/window/k;->w(Landroidx/compose/ui/window/r;)V

    invoke-direct {p0, p4}, Landroidx/compose/ui/window/k;->s(LY0/t;)V

    return-void
.end method

.method public final u()V
    .locals 5

    invoke-direct {p0}, Landroidx/compose/ui/window/k;->getParentLayoutCoordinates()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, LC0/r;->h()J

    move-result-wide v1

    invoke-static {v0}, LC0/s;->f(LC0/r;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v0, v3}, LY0/o;->a(II)J

    move-result-wide v3

    invoke-static {v3, v4, v1, v2}, LY0/q;->a(JJ)LY0/p;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/window/k;->t:LY0/p;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iput-object v0, p0, Landroidx/compose/ui/window/k;->t:LY0/p;

    invoke-virtual {p0}, Landroidx/compose/ui/window/k;->x()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final v(LC0/r;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/window/k;->setParentLayoutCoordinates(LC0/r;)V

    invoke-virtual {p0}, Landroidx/compose/ui/window/k;->u()V

    return-void
.end method

.method public final x()V
    .locals 14

    iget-object v3, p0, Landroidx/compose/ui/window/k;->t:LY0/p;

    if-nez v3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/k;->getPopupContentSize-bOM6tXw()LY0/r;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v6

    iget-object v0, p0, Landroidx/compose/ui/window/k;->w:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/compose/ui/window/k;->m:Landroidx/compose/ui/window/m;

    iget-object v2, p0, Landroidx/compose/ui/window/k;->l:Landroid/view/View;

    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/window/m;->c(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v0}, Landroidx/compose/ui/window/b;->f(Landroid/graphics/Rect;)LY0/p;

    move-result-object v0

    invoke-virtual {v0}, LY0/p;->j()I

    move-result v1

    invoke-virtual {v0}, LY0/p;->e()I

    move-result v0

    invoke-static {v1, v0}, LY0/s;->a(II)J

    move-result-wide v8

    new-instance v10, Lkotlin/jvm/internal/M;

    invoke-direct {v10}, Lkotlin/jvm/internal/M;-><init>()V

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    iput-wide v0, v10, Lkotlin/jvm/internal/M;->a:J

    iget-object v11, p0, Landroidx/compose/ui/window/k;->x:Landroidx/compose/runtime/snapshots/l;

    sget-object v12, Landroidx/compose/ui/window/k;->E:Lmh/l;

    new-instance v13, Landroidx/compose/ui/window/k$h;

    move-object v0, v13

    move-object v1, v10

    move-object v2, p0

    move-wide v4, v8

    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/window/k$h;-><init>(Lkotlin/jvm/internal/M;Landroidx/compose/ui/window/k;LY0/p;JJ)V

    invoke-virtual {v11, p0, v12, v13}, Landroidx/compose/runtime/snapshots/l;->o(Ljava/lang/Object;Lmh/l;Lmh/a;)V

    iget-object v0, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    iget-wide v1, v10, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v1, v2}, LY0/n;->h(J)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v0, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    iget-wide v1, v10, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    iget-object v0, p0, Landroidx/compose/ui/window/k;->j:Landroidx/compose/ui/window/r;

    invoke-virtual {v0}, Landroidx/compose/ui/window/r;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/k;->m:Landroidx/compose/ui/window/m;

    invoke-static {v8, v9}, LY0/r;->g(J)I

    move-result v1

    invoke-static {v8, v9}, LY0/r;->f(J)I

    move-result v2

    invoke-interface {v0, p0, v1, v2}, Landroidx/compose/ui/window/m;->b(Landroid/view/View;II)V

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/window/k;->m:Landroidx/compose/ui/window/m;

    iget-object v1, p0, Landroidx/compose/ui/window/k;->n:Landroid/view/WindowManager;

    iget-object v2, p0, Landroidx/compose/ui/window/k;->o:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, p0, v2}, Landroidx/compose/ui/window/m;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method
