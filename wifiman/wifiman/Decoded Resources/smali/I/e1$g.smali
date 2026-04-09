.class final LI/e1$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;->q(LJ0/w;)V
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

    iput-object p1, p0, LI/e1$g;->a:LI/e1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LI/e1$g;->a:LI/e1;

    invoke-static {v0}, LI/e1;->O2(LI/e1;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LI/e1$g;->a:LI/e1;

    invoke-static {v0}, Landroidx/compose/ui/focus/q;->a(Lk0/k;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LI/e1$g;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->b3()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LI/e1$g;->a:LI/e1;

    invoke-static {v0}, LI/e1;->R2(LI/e1;)Landroidx/compose/ui/platform/n1;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/ui/platform/n1;->b()V

    :cond_1
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/e1$g;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
