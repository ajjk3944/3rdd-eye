.class final LT/m$e;
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

.field final synthetic b:LT/l0;


# direct methods
.method constructor <init>(LT/m;LT/l0;)V
    .locals 0

    iput-object p1, p0, LT/m$e;->a:LT/m;

    iput-object p2, p0, LT/m$e;->b:LT/l0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, LT/m$e;->a:LT/m;

    iget-object v1, p0, LT/m$e;->b:LT/l0;

    invoke-virtual {v1}, LT/l0;->c()LT/j0;

    iget-object v1, p0, LT/m$e;->b:LT/l0;

    invoke-virtual {v1}, LT/l0;->e()LT/A0;

    move-result-object v1

    iget-object v2, p0, LT/m$e;->b:LT/l0;

    invoke-virtual {v2}, LT/l0;->f()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v4, v1, v2, v3}, LT/m;->e0(LT/m;LT/j0;LT/A0;Ljava/lang/Object;Z)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/m$e;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
