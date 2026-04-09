.class final LT/m$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/m;->L0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/m;

.field final synthetic b:LU/a;

.field final synthetic c:LT/a1;

.field final synthetic d:LT/l0;


# direct methods
.method constructor <init>(LT/m;LU/a;LT/a1;LT/l0;)V
    .locals 0

    iput-object p1, p0, LT/m$d;->a:LT/m;

    iput-object p2, p0, LT/m$d;->b:LU/a;

    iput-object p3, p0, LT/m$d;->c:LT/a1;

    iput-object p4, p0, LT/m$d;->d:LT/l0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 12

    iget-object v0, p0, LT/m$d;->a:LT/m;

    invoke-static {v0}, LT/m;->Y(LT/m;)LU/b;

    move-result-object v0

    iget-object v1, p0, LT/m$d;->b:LU/a;

    iget-object v2, p0, LT/m$d;->a:LT/m;

    iget-object v3, p0, LT/m$d;->c:LT/a1;

    iget-object v4, p0, LT/m$d;->d:LT/l0;

    invoke-virtual {v0}, LU/b;->n()LU/a;

    move-result-object v5

    :try_start_0
    invoke-virtual {v0, v1}, LU/b;->R(LU/a;)V

    invoke-virtual {v2}, LT/m;->J0()LT/a1;

    move-result-object v1

    invoke-static {v2}, LT/m;->a0(LT/m;)[I

    move-result-object v6

    invoke-static {v2}, LT/m;->c0(LT/m;)LV/a;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v2, v8}, LT/m;->g0(LT/m;[I)V

    invoke-static {v2, v8}, LT/m;->h0(LT/m;LV/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2, v3}, LT/m;->i1(LT/a1;)V

    invoke-static {v2}, LT/m;->Y(LT/m;)LU/b;

    move-result-object v3

    invoke-virtual {v3}, LU/b;->o()Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v10, 0x0

    :try_start_2
    invoke-virtual {v3, v10}, LU/b;->S(Z)V

    invoke-virtual {v4}, LT/l0;->c()LT/j0;

    invoke-virtual {v4}, LT/l0;->e()LT/A0;

    move-result-object v10

    invoke-virtual {v4}, LT/l0;->f()Ljava/lang/Object;

    move-result-object v4

    const/4 v11, 0x1

    invoke-static {v2, v8, v10, v4, v11}, LT/m;->e0(LT/m;LT/j0;LT/A0;Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v3, v9}, LU/b;->S(Z)V

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v2, v1}, LT/m;->i1(LT/a1;)V

    invoke-static {v2, v6}, LT/m;->g0(LT/m;[I)V

    invoke-static {v2, v7}, LT/m;->h0(LT/m;LV/a;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v0, v5}, LU/b;->R(LU/a;)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v3

    goto :goto_0

    :catchall_2
    move-exception v4

    :try_start_5
    invoke-virtual {v3, v9}, LU/b;->S(Z)V

    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_0
    :try_start_6
    invoke-virtual {v2, v1}, LT/m;->i1(LT/a1;)V

    invoke-static {v2, v6}, LT/m;->g0(LT/m;[I)V

    invoke-static {v2, v7}, LT/m;->h0(LT/m;LV/a;)V

    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_1
    invoke-virtual {v0, v5}, LU/b;->R(LU/a;)V

    throw v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/m$d;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
