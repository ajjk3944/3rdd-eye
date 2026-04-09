.class final Landroidx/lifecycle/A$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/A$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/k$a;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:LIi/N;

.field final synthetic d:Landroidx/lifecycle/k$a;

.field final synthetic e:LIi/n;

.field final synthetic f:LTi/a;

.field final synthetic g:Lmh/p;


# direct methods
.method constructor <init>(Landroidx/lifecycle/k$a;Lkotlin/jvm/internal/N;LIi/N;Landroidx/lifecycle/k$a;LIi/n;LTi/a;Lmh/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/A$a$a$a;->a:Landroidx/lifecycle/k$a;

    iput-object p2, p0, Landroidx/lifecycle/A$a$a$a;->b:Lkotlin/jvm/internal/N;

    iput-object p3, p0, Landroidx/lifecycle/A$a$a$a;->c:LIi/N;

    iput-object p4, p0, Landroidx/lifecycle/A$a$a$a;->d:Landroidx/lifecycle/k$a;

    iput-object p5, p0, Landroidx/lifecycle/A$a$a$a;->e:LIi/n;

    iput-object p6, p0, Landroidx/lifecycle/A$a$a$a;->f:LTi/a;

    iput-object p7, p0, Landroidx/lifecycle/A$a$a$a;->g:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Landroidx/lifecycle/o;Landroidx/lifecycle/k$a;)V
    .locals 7

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/A$a$a$a;->a:Landroidx/lifecycle/k$a;

    const/4 v0, 0x0

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/A$a$a$a;->b:Lkotlin/jvm/internal/N;

    iget-object v1, p0, Landroidx/lifecycle/A$a$a$a;->c:LIi/N;

    new-instance v4, Landroidx/lifecycle/A$a$a$a$a;

    iget-object p2, p0, Landroidx/lifecycle/A$a$a$a;->f:LTi/a;

    iget-object v2, p0, Landroidx/lifecycle/A$a$a$a;->g:Lmh/p;

    invoke-direct {v4, p2, v2, v0}, Landroidx/lifecycle/A$a$a$a$a;-><init>(LTi/a;Lmh/p;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p2

    iput-object p2, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/lifecycle/A$a$a$a;->d:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Landroidx/lifecycle/A$a$a$a;->b:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p1, LIi/y0;

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Landroidx/lifecycle/A$a$a$a;->b:Lkotlin/jvm/internal/N;

    iput-object v0, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_2
    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_3

    iget-object p1, p0, Landroidx/lifecycle/A$a$a$a;->e:LIi/n;

    sget-object p2, LYg/u;->b:LYg/u$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-static {p2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
