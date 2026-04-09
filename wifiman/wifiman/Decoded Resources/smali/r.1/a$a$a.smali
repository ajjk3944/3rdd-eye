.class final Lr/a$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/a;

.field final synthetic b:Lr/k;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lkotlin/jvm/internal/J;


# direct methods
.method constructor <init>(Lr/a;Lr/k;Lmh/l;Lkotlin/jvm/internal/J;)V
    .locals 0

    iput-object p1, p0, Lr/a$a$a;->a:Lr/a;

    iput-object p2, p0, Lr/a$a$a;->b:Lr/k;

    iput-object p3, p0, Lr/a$a$a;->c:Lmh/l;

    iput-object p4, p0, Lr/a$a$a;->d:Lkotlin/jvm/internal/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/h;)V
    .locals 2

    iget-object v0, p0, Lr/a$a$a;->a:Lr/a;

    invoke-virtual {v0}, Lr/a;->j()Lr/k;

    move-result-object v0

    invoke-static {p1, v0}, Lr/m0;->o(Lr/h;Lr/k;)V

    iget-object v0, p0, Lr/a$a$a;->a:Lr/a;

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lr/a;->a(Lr/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lr/h;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lr/a$a$a;->a:Lr/a;

    invoke-virtual {v1}, Lr/a;->j()Lr/k;

    move-result-object v1

    invoke-virtual {v1, v0}, Lr/k;->v(Ljava/lang/Object;)V

    iget-object v1, p0, Lr/a$a$a;->b:Lr/k;

    invoke-virtual {v1, v0}, Lr/k;->v(Ljava/lang/Object;)V

    iget-object v0, p0, Lr/a$a$a;->c:Lmh/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lr/a$a$a;->a:Lr/a;

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p1}, Lr/h;->a()V

    iget-object p1, p0, Lr/a$a$a;->d:Lkotlin/jvm/internal/J;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lkotlin/jvm/internal/J;->a:Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lr/a$a$a;->c:Lmh/l;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lr/a$a$a;->a:Lr/a;

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/h;

    invoke-virtual {p0, p1}, Lr/a$a$a;->a(Lr/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
