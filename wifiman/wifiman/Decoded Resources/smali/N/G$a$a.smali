.class final LN/G$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G$a;->a(Lz/f;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/H;

.field final synthetic b:LY0/d;

.field final synthetic c:F

.field final synthetic d:F


# direct methods
.method constructor <init>(LN/H;LY0/d;FF)V
    .locals 0

    iput-object p1, p0, LN/G$a$a;->a:LN/H;

    iput-object p2, p0, LN/G$a$a;->b:LY0/d;

    iput p3, p0, LN/G$a$a;->c:F

    iput p4, p0, LN/G$a$a;->d:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, LN/G$a$a;->a:LN/H;

    iget-object v1, p0, LN/G$a$a;->b:LY0/d;

    invoke-virtual {v0, v1}, LN/H;->h(LY0/d;)V

    new-instance v0, LN/G$a$a$a;

    iget v1, p0, LN/G$a$a;->c:F

    iget v2, p0, LN/G$a$a;->d:F

    invoke-direct {v0, v1, v2}, LN/G$a$a$a;-><init>(FF)V

    invoke-static {v0}, Landroidx/compose/material/a;->a(Lmh/l;)LN/D;

    move-result-object v0

    iget-object v1, p0, LN/G$a$a;->a:LN/H;

    invoke-virtual {v1}, LN/H;->c()LN/b;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v0, v2, v3, v2}, LN/b;->J(LN/b;LN/D;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/G$a$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
