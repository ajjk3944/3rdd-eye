.class final LT/z0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/z0;-><init>(Ljava/util/List;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z0;


# direct methods
.method constructor <init>(LT/z0;)V
    .locals 0

    iput-object p1, p0, LT/z0$a;->a:LT/z0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lo/H;
    .locals 6

    iget-object v0, p0, LT/z0$a;->a:LT/z0;

    invoke-virtual {v0}, LT/z0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, LT/o;->j(I)Lo/H;

    move-result-object v0

    iget-object v1, p0, LT/z0$a;->a:LT/z0;

    invoke-virtual {v1}, LT/z0;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1}, LT/z0;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LT/a0;

    invoke-static {v4}, LT/o;->h(LT/a0;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v5, v4}, LT/p0;->f(Lo/H;Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LT/z0$a;->a()Lo/H;

    move-result-object v0

    invoke-static {v0}, LT/p0;->a(Lo/H;)LT/p0;

    move-result-object v0

    return-object v0
.end method
