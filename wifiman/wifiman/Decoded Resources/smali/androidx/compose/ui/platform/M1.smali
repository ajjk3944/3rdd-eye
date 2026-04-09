.class public abstract Landroidx/compose/ui/platform/M1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Landroidx/compose/ui/platform/M1;->a:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public static final a(LE0/G;LT/q;)LT/U0;
    .locals 1

    new-instance v0, LE0/D0;

    invoke-direct {v0, p0}, LE0/D0;-><init>(LE0/G;)V

    invoke-static {v0, p1}, LT/t;->b(LT/f;LT/q;)LT/U0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroidx/compose/ui/platform/r;LT/q;Lmh/p;)LT/p;
    .locals 4

    invoke-static {}, Landroidx/compose/ui/platform/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lf0/h;->K:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    new-instance v0, LE0/D0;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v1

    invoke-direct {v0, v1}, LE0/D0;-><init>(LE0/G;)V

    invoke-static {v0, p1}, LT/t;->a(LT/f;LT/q;)LT/p;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v1

    sget v2, Lf0/h;->L:I

    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroidx/compose/ui/platform/K1;

    if-eqz v3, :cond_1

    check-cast v1, Landroidx/compose/ui/platform/K1;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    new-instance v1, Landroidx/compose/ui/platform/K1;

    invoke-direct {v1, p0, v0}, Landroidx/compose/ui/platform/K1;-><init>(Landroidx/compose/ui/platform/r;LT/p;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_2
    invoke-virtual {v1, p2}, Landroidx/compose/ui/platform/K1;->e(Lmh/p;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getCoroutineContext()Ldh/i;

    move-result-object p2

    invoke-virtual {p1}, LT/q;->h()Ldh/i;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p1}, LT/q;->h()Ldh/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r;->setCoroutineContext(Ldh/i;)V

    :cond_3
    return-object v1
.end method

.method public static final c(Landroidx/compose/ui/platform/a;LT/q;Lmh/p;)LT/p;
    .locals 3

    sget-object v0, Landroidx/compose/ui/platform/t0;->a:Landroidx/compose/ui/platform/t0;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/t0;->b()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v2, v0, Landroidx/compose/ui/platform/r;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/platform/r;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    new-instance v1, Landroidx/compose/ui/platform/r;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, LT/q;->h()Ldh/i;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Landroidx/compose/ui/platform/r;-><init>(Landroid/content/Context;Ldh/i;)V

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v0

    sget-object v2, Landroidx/compose/ui/platform/M1;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0, v2}, Landroidx/compose/ui/platform/a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    invoke-static {v1, p1, p2}, Landroidx/compose/ui/platform/M1;->b(Landroidx/compose/ui/platform/r;LT/q;Lmh/p;)LT/p;

    move-result-object p0

    return-object p0
.end method
