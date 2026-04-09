.class final LI/e1$w$a$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1$w$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$w$a$b$a;->a:LI/e1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LI/e1$w$a$b$a;->a:LI/e1;

    invoke-static {v0}, LI/e1;->L2(LI/e1;)LIi/y0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI/e1$w$a$b$a;->a:LI/e1;

    invoke-static {v0}, LI/e1;->R2(LI/e1;)Landroidx/compose/ui/platform/n1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/platform/n1;->b()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LI/e1$w$a$b$a;->a:LI/e1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LI/e1;->U2(LI/e1;Z)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/e1$w$a$b$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
