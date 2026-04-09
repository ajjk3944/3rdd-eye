.class public final LH/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/p$a;
    }
.end annotation


# static fields
.field public static final c:LH/p$a;

.field public static final d:I


# instance fields
.field private final a:LK/f;

.field private final b:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LH/p;->c:LH/p$a;

    const/16 v0, 0x8

    sput v0, LH/p;->d:I

    return-void
.end method

.method public constructor <init>(LK/d;LK/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, LH/p;->a:LK/f;

    const/4 p2, 0x0

    const/4 v0, 0x2

    .line 3
    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LH/p;->b:LT/q0;

    return-void
.end method

.method public synthetic constructor <init>(LK/d;LK/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 4
    new-instance p2, LK/f;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x64

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, LK/f;-><init>(Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, LH/p;-><init>(LK/d;LK/f;)V

    return-void
.end method

.method public static final synthetic a(LH/p;)LK/d;
    .locals 0

    invoke-direct {p0}, LH/p;->g()LK/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LH/p;)LK/f;
    .locals 0

    iget-object p0, p0, LH/p;->a:LK/f;

    return-object p0
.end method

.method private final d()V
    .locals 6

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    :try_start_0
    invoke-direct {p0}, LH/p;->g()LK/d;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v4, v3}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    if-eqz v5, :cond_1

    iget-object v0, p0, LH/p;->a:LK/f;

    invoke-virtual {v0, v5}, LK/f;->h(Ljava/lang/Object;)V

    :cond_1
    invoke-direct {p0, v2}, LH/p;->j(LK/d;)V

    return-void

    :catchall_0
    move-exception v2

    invoke-virtual {v0, v1, v4, v3}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v2
.end method

.method private final g()LK/d;
    .locals 1

    iget-object v0, p0, LH/p;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK/d;

    return-object v0
.end method

.method private final j(LK/d;)V
    .locals 1

    iget-object v0, p0, LH/p;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LH/p;->j(LK/d;)V

    iget-object v0, p0, LH/p;->a:LK/f;

    invoke-virtual {v0}, LK/f;->d()V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, LH/p;->a:LK/f;

    invoke-virtual {v0}, LK/f;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LH/p;->g()LK/d;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LH/p;->a:LK/f;

    invoke-virtual {v0}, LK/f;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, LH/p;->g()LK/d;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final h(LK/d;)V
    .locals 5

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    :try_start_0
    invoke-direct {p0}, LH/p;->g()LK/d;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    if-nez v4, :cond_1

    invoke-direct {p0, p1}, LH/p;->j(LK/d;)V

    return-void

    :cond_1
    invoke-static {v4, p1}, LH/q;->b(LK/d;LK/d;)LK/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, LH/p;->j(LK/d;)V

    return-void

    :cond_2
    invoke-direct {p0}, LH/p;->d()V

    invoke-direct {p0, p1}, LH/p;->j(LK/d;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1
.end method

.method public final i(LH/l;)V
    .locals 1

    invoke-virtual {p0}, LH/p;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LH/p;->a:LK/f;

    invoke-virtual {v0}, LK/f;->i()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK/d;

    invoke-static {p1, v0}, LK/e;->a(LH/l;LK/d;)V

    return-void
.end method

.method public final k(LH/l;)V
    .locals 1

    invoke-virtual {p0}, LH/p;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, LH/p;->d()V

    iget-object v0, p0, LH/p;->a:LK/f;

    invoke-virtual {v0}, LK/f;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK/d;

    invoke-static {p1, v0}, LK/e;->b(LH/l;LK/d;)V

    return-void
.end method
