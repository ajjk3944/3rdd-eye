.class final Landroidx/compose/foundation/lazy/layout/b$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/lazy/layout/b;

.field final synthetic b:J


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/b;J)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e$a;->a:Landroidx/compose/foundation/lazy/layout/b;

    iput-wide p2, p0, Landroidx/compose/foundation/lazy/layout/b$e$a;->b:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/a;)V
    .locals 5

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b$e$a;->a:Landroidx/compose/foundation/lazy/layout/b;

    invoke-virtual {p1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/n;

    invoke-virtual {p1}, LY0/n;->n()J

    move-result-wide v1

    iget-wide v3, p0, Landroidx/compose/foundation/lazy/layout/b$e$a;->b:J

    invoke-static {v1, v2, v3, v4}, LY0/n;->k(JJ)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/lazy/layout/b;->i(Landroidx/compose/foundation/lazy/layout/b;J)V

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$e$a;->a:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->b(Landroidx/compose/foundation/lazy/layout/b;)Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/b$e$a;->a(Lr/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
