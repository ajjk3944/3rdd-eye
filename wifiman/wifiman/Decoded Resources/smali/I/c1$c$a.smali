.class final LI/c1$c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c1$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/c1;

.field final synthetic b:Lkotlin/jvm/internal/L;


# direct methods
.method constructor <init>(LI/c1;Lkotlin/jvm/internal/L;)V
    .locals 0

    iput-object p1, p0, LI/c1$c$a;->a:LI/c1;

    iput-object p2, p0, LI/c1$c$a;->b:Lkotlin/jvm/internal/L;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, LI/c1$c$a;->a:LI/c1;

    invoke-static {v0}, LI/c1;->L2(LI/c1;)LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    iget-object v0, p0, LI/c1$c$a;->a:LI/c1;

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI/c1$c$a;->a:LI/c1;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->u()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/E1;

    invoke-interface {v0}, Landroidx/compose/ui/platform/E1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    iget-object v1, p0, LI/c1$c$a;->b:Lkotlin/jvm/internal/L;

    iget v1, v1, Lkotlin/jvm/internal/L;->a:I

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, LI/c1$c$a;->b:Lkotlin/jvm/internal/L;

    iget v2, v1, Lkotlin/jvm/internal/L;->a:I

    mul-int/lit8 v2, v2, -0x1

    iput v2, v1, Lkotlin/jvm/internal/L;->a:I

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/c1$c$a;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
