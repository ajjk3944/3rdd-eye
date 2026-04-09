.class final Luj/i$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/i;->i(Lorg/kodein/di/DI$e;Luj/b;)Lmh/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Luj/i;

.field final synthetic c:Luj/b;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Luj/i;Luj/b;)V
    .locals 0

    iput-object p1, p0, Luj/i$b;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Luj/i$b;->b:Luj/i;

    iput-object p3, p0, Luj/i$b;->c:Luj/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Luj/i$b;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Luj/s;

    if-nez v0, :cond_0

    iget-object v0, p0, Luj/i$b;->b:Luj/i;

    invoke-virtual {v0}, Luj/i;->c()Luj/q;

    move-result-object v0

    iget-object v1, p0, Luj/i$b;->c:Luj/b;

    invoke-interface {v1}, Luj/x;->getContext()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Luj/q;->a(Ljava/lang/Object;)Luj/s;

    move-result-object v0

    iget-object v1, p0, Luj/i$b;->a:Lkotlin/jvm/internal/N;

    iput-object v0, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_0
    new-instance v1, Luj/r;

    iget-object v2, p0, Luj/i$b;->b:Luj/i;

    invoke-static {v2}, Luj/i;->n(Luj/i;)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Luj/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Luj/i$b;->b:Luj/i;

    invoke-virtual {v2}, Luj/i;->p()Z

    move-result v2

    new-instance v3, Luj/i$b$a;

    iget-object v4, p0, Luj/i$b;->b:Luj/i;

    iget-object v5, p0, Luj/i$b;->c:Luj/b;

    invoke-direct {v3, v4, v5, p1}, Luj/i$b$a;-><init>(Luj/i;Luj/b;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2, v3}, Luj/s;->a(Ljava/lang/Object;ZLmh/a;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type T of org.kodein.di.bindings.Multiton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
