.class final Luj/u$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/u;->i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Luj/u;

.field final synthetic c:Luj/b;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Luj/u;Luj/b;)V
    .locals 0

    iput-object p1, p0, Luj/u$b;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Luj/u$b;->b:Luj/u;

    iput-object p3, p0, Luj/u$b;->c:Luj/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Ljava/lang/Object;
    .locals 5

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Luj/u$b;->a:Lkotlin/jvm/internal/N;

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p1, Luj/s;

    if-nez p1, :cond_0

    iget-object p1, p0, Luj/u$b;->b:Luj/u;

    invoke-virtual {p1}, Luj/u;->c()Luj/q;

    move-result-object p1

    iget-object v0, p0, Luj/u$b;->c:Luj/b;

    invoke-interface {v0}, Luj/x;->getContext()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Luj/q;->a(Ljava/lang/Object;)Luj/s;

    move-result-object p1

    iget-object v0, p0, Luj/u$b;->a:Lkotlin/jvm/internal/N;

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Luj/u$b;->b:Luj/u;

    invoke-static {v0}, Luj/u;->m(Luj/u;)Luj/r;

    move-result-object v0

    iget-object v1, p0, Luj/u$b;->b:Luj/u;

    invoke-virtual {v1}, Luj/u;->p()Z

    move-result v1

    new-instance v2, Luj/u$b$a;

    iget-object v3, p0, Luj/u$b;->b:Luj/u;

    iget-object v4, p0, Luj/u$b;->c:Luj/b;

    invoke-direct {v2, v3, v4}, Luj/u$b$a;-><init>(Luj/u;Luj/b;)V

    invoke-virtual {p1, v0, v1, v2}, Luj/s;->a(Ljava/lang/Object;ZLmh/a;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type T of org.kodein.di.bindings.Singleton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Luj/u$b;->a(LYg/J;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
