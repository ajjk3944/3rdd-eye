.class final Landroidx/compose/foundation/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/c;->F2(Lo0/c;)Lm0/Q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Landroidx/compose/foundation/c;

.field final synthetic c:Lo0/c;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Landroidx/compose/foundation/c;Lo0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/c$a;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Landroidx/compose/foundation/c$a;->b:Landroidx/compose/foundation/c;

    iput-object p3, p0, Landroidx/compose/foundation/c$a;->c:Lo0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Landroidx/compose/foundation/c$a;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Landroidx/compose/foundation/c$a;->b:Landroidx/compose/foundation/c;

    invoke-virtual {v1}, Landroidx/compose/foundation/c;->G2()Lm0/i1;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/c$a;->c:Lo0/c;

    invoke-interface {v2}, Lo0/f;->c()J

    move-result-wide v2

    iget-object v4, p0, Landroidx/compose/foundation/c$a;->c:Lo0/c;

    invoke-interface {v4}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v4

    iget-object v5, p0, Landroidx/compose/foundation/c$a;->c:Lo0/c;

    invoke-interface {v1, v2, v3, v4, v5}, Lm0/i1;->a(JLY0/t;LY0/d;)Lm0/Q0;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/c$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
