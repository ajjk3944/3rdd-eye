.class public final Lw/G;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/G$a;
    }
.end annotation


# static fields
.field private static final f:Lw/G$a;

.field public static final g:I

.field private static final h:Lr/m;


# instance fields
.field private final a:Lr/v0;

.field private b:J

.field private c:Lr/m;

.field private d:Z

.field private e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/G$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw/G$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lw/G;->f:Lw/G$a;

    const/16 v0, 0x8

    sput v0, Lw/G;->g:I

    new-instance v0, Lr/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/m;-><init>(F)V

    sput-object v0, Lw/G;->h:Lr/m;

    return-void
.end method

.method public constructor <init>(Lr/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v0}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v0

    invoke-interface {p1, v0}, Lr/i;->a(Lr/s0;)Lr/v0;

    move-result-object p1

    iput-object p1, p0, Lw/G;->a:Lr/v0;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lw/G;->b:J

    sget-object p1, Lw/G;->h:Lr/m;

    iput-object p1, p0, Lw/G;->c:Lr/m;

    return-void
.end method

.method public static final synthetic a()Lw/G$a;
    .locals 1

    sget-object v0, Lw/G;->f:Lw/G$a;

    return-object v0
.end method

.method public static final synthetic b(Lw/G;)J
    .locals 2

    iget-wide v0, p0, Lw/G;->b:J

    return-wide v0
.end method

.method public static final synthetic c(Lw/G;)Lr/m;
    .locals 0

    iget-object p0, p0, Lw/G;->c:Lr/m;

    return-object p0
.end method

.method public static final synthetic d(Lw/G;)Lr/v0;
    .locals 0

    iget-object p0, p0, Lw/G;->a:Lr/v0;

    return-object p0
.end method

.method public static final synthetic e()Lr/m;
    .locals 1

    sget-object v0, Lw/G;->h:Lr/m;

    return-object v0
.end method

.method public static final synthetic f(Lw/G;J)V
    .locals 0

    iput-wide p1, p0, Lw/G;->b:J

    return-void
.end method

.method public static final synthetic g(Lw/G;Lr/m;)V
    .locals 0

    iput-object p1, p0, Lw/G;->c:Lr/m;

    return-void
.end method


# virtual methods
.method public final h(Lmh/l;Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lw/G$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lw/G$b;

    iget v1, v0, Lw/G$b;->g:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw/G$b;->g:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw/G$b;

    invoke-direct {v0, p0, p3}, Lw/G$b;-><init>(Lw/G;Ldh/e;)V

    :goto_0
    iget-object p3, v0, Lw/G$b;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lw/G$b;->g:I

    const/4 v3, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v8, :cond_2

    if-ne v2, v7, :cond_1

    iget-object p1, v0, Lw/G$b;->b:Ljava/lang/Object;

    check-cast p1, Lmh/a;

    iget-object p2, v0, Lw/G$b;->a:Ljava/lang/Object;

    check-cast p2, Lw/G;

    :try_start_0
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lw/G$b;->d:F

    iget-object p2, v0, Lw/G$b;->c:Ljava/lang/Object;

    check-cast p2, Lmh/a;

    iget-object v2, v0, Lw/G$b;->b:Ljava/lang/Object;

    check-cast v2, Lmh/l;

    iget-object v9, v0, Lw/G$b;->a:Ljava/lang/Object;

    check-cast v9, Lw/G;

    :try_start_1
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p3, v9

    move-object v11, v0

    move-object v0, p2

    move-object p2, v2

    move-object v2, v11

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object p2, v9

    goto/16 :goto_6

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iget-boolean p3, p0, Lw/G;->d:Z

    if-nez p3, :cond_a

    invoke-interface {v0}, Ldh/e;->getContext()Ldh/i;

    move-result-object p3

    sget-object v2, Lf0/g;->n0:Lf0/g$b;

    invoke-interface {p3, v2}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p3

    check-cast p3, Lf0/g;

    if-eqz p3, :cond_4

    invoke-interface {p3}, Lf0/g;->v()F

    move-result p3

    goto :goto_1

    :cond_4
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_1
    iput-boolean v8, p0, Lw/G;->d:Z

    move-object v2, v0

    move-object v0, p2

    move-object p2, p1

    move p1, p3

    move-object p3, p0

    :cond_5
    :try_start_2
    sget-object v9, Lw/G;->f:Lw/G$a;

    iget v10, p3, Lw/G;->e:F

    invoke-virtual {v9, v10}, Lw/G$a;->b(F)Z

    move-result v9

    if-nez v9, :cond_7

    new-instance v9, Lw/G$c;

    invoke-direct {v9, p3, p1, p2}, Lw/G$c;-><init>(Lw/G;FLmh/l;)V

    iput-object p3, v2, Lw/G$b;->a:Ljava/lang/Object;

    iput-object p2, v2, Lw/G$b;->b:Ljava/lang/Object;

    iput-object v0, v2, Lw/G$b;->c:Ljava/lang/Object;

    iput p1, v2, Lw/G$b;->d:F

    iput v8, v2, Lw/G$b;->g:I

    invoke-static {v9, v2}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    cmpg-float v9, p1, v6

    if-nez v9, :cond_5

    :cond_7
    move-object p1, v0

    move-object v11, p3

    move-object p3, p2

    move-object p2, v11

    goto :goto_3

    :catchall_2
    move-exception p1

    move-object p2, p3

    goto :goto_6

    :goto_3
    :try_start_3
    iget v0, p2, Lw/G;->e:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v6

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lw/G$d;

    invoke-direct {v0, p2, p3}, Lw/G$d;-><init>(Lw/G;Lmh/l;)V

    iput-object p2, v2, Lw/G$b;->a:Ljava/lang/Object;

    iput-object p1, v2, Lw/G$b;->b:Ljava/lang/Object;

    const/4 p3, 0x0

    iput-object p3, v2, Lw/G$b;->c:Ljava/lang/Object;

    iput v7, v2, Lw/G$b;->g:I

    invoke-static {v0, v2}, LT/i0;->c(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    return-object v1

    :cond_9
    :goto_4
    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    iput-wide v4, p2, Lw/G;->b:J

    sget-object p1, Lw/G;->h:Lr/m;

    iput-object p1, p2, Lw/G;->c:Lr/m;

    iput-boolean v3, p2, Lw/G;->d:Z

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :goto_6
    iput-wide v4, p2, Lw/G;->b:J

    sget-object p3, Lw/G;->h:Lr/m;

    iput-object p3, p2, Lw/G;->c:Lr/m;

    iput-boolean v3, p2, Lw/G;->d:Z

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "animateToZero called while previous animation is running"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lw/G;->e:F

    return v0
.end method

.method public final j(F)V
    .locals 0

    iput p1, p0, Lw/G;->e:F

    return-void
.end method
