.class final LN/b$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b;->H(Ljava/lang/Object;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/b;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(LN/b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LN/b$k;->a:LN/b;

    iput-object p2, p0, LN/b$k;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, LN/b$k;->a:LN/b;

    invoke-static {v0}, LN/b;->c(LN/b;)LN/a;

    move-result-object v0

    iget-object v1, p0, LN/b$k;->a:LN/b;

    iget-object v2, p0, LN/b$k;->b:Ljava/lang/Object;

    invoke-virtual {v1}, LN/b;->o()LN/D;

    move-result-object v3

    invoke-interface {v3, v2}, LN/D;->e(Ljava/lang/Object;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v0, v3, v4, v5, v6}, LN/a;->b(LN/a;FFILjava/lang/Object;)V

    invoke-static {v1, v6}, LN/b;->f(LN/b;Ljava/lang/Object;)V

    :cond_0
    invoke-static {v1, v2}, LN/b;->e(LN/b;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/b$k;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
