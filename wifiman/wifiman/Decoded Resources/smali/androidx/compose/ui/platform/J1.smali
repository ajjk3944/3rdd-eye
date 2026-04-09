.class public abstract Landroidx/compose/ui/platform/J1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/J1;->a:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a(Landroid/content/Context;)LLi/N;
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/J1;->e(Landroid/content/Context;)LLi/N;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/view/View;Ldh/i;Landroidx/lifecycle/k;)LT/N0;
    .locals 9

    sget-object v0, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {p1, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, LT/g0;->a0:LT/g0$b;

    invoke-interface {p1, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Landroidx/compose/ui/platform/Q;->m:Landroidx/compose/ui/platform/Q$c;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/Q$c;->a()Ldh/i;

    move-result-object v0

    invoke-interface {v0, p1}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    :cond_1
    sget-object v0, LT/g0;->a0:LT/g0$b;

    invoke-interface {p1, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    check-cast v0, LT/g0;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v2, LT/y0;

    invoke-direct {v2, v0}, LT/y0;-><init>(LT/g0;)V

    invoke-virtual {v2}, LT/y0;->b()V

    move-object v5, v2

    goto :goto_0

    :cond_2
    move-object v5, v1

    :goto_0
    new-instance v7, Lkotlin/jvm/internal/N;

    invoke-direct {v7}, Lkotlin/jvm/internal/N;-><init>()V

    sget-object v0, Lf0/g;->n0:Lf0/g$b;

    invoke-interface {p1, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    check-cast v0, Lf0/g;

    if-nez v0, :cond_3

    new-instance v0, Landroidx/compose/ui/platform/G0;

    invoke-direct {v0}, Landroidx/compose/ui/platform/G0;-><init>()V

    iput-object v0, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_3
    if-eqz v5, :cond_4

    move-object v2, v5

    goto :goto_1

    :cond_4
    sget-object v2, Ldh/j;->a:Ldh/j;

    :goto_1
    invoke-interface {p1, v2}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    invoke-interface {p1, v0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    new-instance v0, LT/N0;

    invoke-direct {v0, p1}, LT/N0;-><init>(Ldh/i;)V

    invoke-virtual {v0}, LT/N0;->l0()V

    invoke-static {p1}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v4

    if-nez p2, :cond_6

    invoke-static {p0}, Landroidx/lifecycle/T;->a(Landroid/view/View;)Landroidx/lifecycle/o;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object p2

    goto :goto_2

    :cond_5
    move-object p2, v1

    :cond_6
    :goto_2
    if-eqz p2, :cond_7

    new-instance p1, Landroidx/compose/ui/platform/J1$a;

    invoke-direct {p1, p0, v0}, Landroidx/compose/ui/platform/J1$a;-><init>(Landroid/view/View;LT/N0;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance p1, Landroidx/compose/ui/platform/J1$b;

    move-object v3, p1

    move-object v6, v0

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/platform/J1$b;-><init>(LIi/N;LT/y0;LT/N0;Lkotlin/jvm/internal/N;Landroid/view/View;)V

    invoke-virtual {p2, p1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    return-object v0

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ViewTreeLifecycleOwner not found from "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static synthetic c(Landroid/view/View;Ldh/i;Landroidx/lifecycle/k;ILjava/lang/Object;)LT/N0;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Ldh/j;->a:Ldh/j;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/J1;->b(Landroid/view/View;Ldh/i;Landroidx/lifecycle/k;)LT/N0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroid/view/View;)LT/q;
    .locals 2

    invoke-static {p0}, Landroidx/compose/ui/platform/J1;->f(Landroid/view/View;)LT/q;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    if-nez v0, :cond_1

    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Landroidx/compose/ui/platform/J1;->f(Landroid/view/View;)LT/q;

    move-result-object v0

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final e(Landroid/content/Context;)LLi/N;
    .locals 10

    sget-object v0, Landroidx/compose/ui/platform/J1;->a:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v1, "animator_duration_scale"

    invoke-static {v1}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const/4 v1, -0x1

    const/4 v2, 0x6

    const/4 v5, 0x0

    invoke-static {v1, v5, v5, v2, v5}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object v6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v1}, LA1/i;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v1

    new-instance v5, Landroidx/compose/ui/platform/J1$d;

    invoke-direct {v5, v6, v1}, Landroidx/compose/ui/platform/J1$d;-><init>(LKi/g;Landroid/os/Handler;)V

    new-instance v1, Landroidx/compose/ui/platform/J1$c;

    const/4 v8, 0x0

    move-object v2, v1

    move-object v7, p0

    invoke-direct/range {v2 .. v8}, Landroidx/compose/ui/platform/J1$c;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Landroidx/compose/ui/platform/J1$d;LKi/g;Landroid/content/Context;Ldh/e;)V

    invoke-static {v1}, LLi/i;->A(Lmh/p;)LLi/g;

    move-result-object v1

    invoke-static {}, LIi/O;->b()LIi/N;

    move-result-object v2

    sget-object v3, LLi/J;->a:LLi/J$a;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v3 .. v9}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string v5, "animator_duration_scale"

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v4, v5, v6}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, LLi/i;->M(LLi/g;LIi/N;LLi/J;Ljava/lang/Object;)LLi/N;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v1, LLi/N;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static final f(Landroid/view/View;)LT/q;
    .locals 1

    sget v0, Lf0/h;->G:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, LT/q;

    if-eqz v0, :cond_0

    check-cast p0, LT/q;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final g(Landroid/view/View;)Landroid/view/View;
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x1020002

    if-ne v1, v2, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    move-object v3, v0

    move-object v0, p0

    move-object p0, v3

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public static final h(Landroid/view/View;)LT/N0;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot locate windowRecomposer; View "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not attached to a window"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/platform/J1;->g(Landroid/view/View;)Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Landroidx/compose/ui/platform/J1;->f(Landroid/view/View;)LT/q;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Landroidx/compose/ui/platform/I1;->a:Landroidx/compose/ui/platform/I1;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/I1;->a(Landroid/view/View;)LT/N0;

    move-result-object p0

    goto :goto_0

    :cond_1
    instance-of p0, v0, LT/N0;

    if-eqz p0, :cond_2

    move-object p0, v0

    check-cast p0, LT/N0;

    :goto_0
    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "root viewTreeParentCompositionContext is not a Recomposer"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(Landroid/view/View;LT/q;)V
    .locals 1

    sget v0, Lf0/h;->G:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
