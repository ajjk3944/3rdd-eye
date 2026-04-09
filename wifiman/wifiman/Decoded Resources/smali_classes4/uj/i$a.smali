.class final Luj/i$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/i;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Lorg/kodein/type/q;Luj/o;ZLmh/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luj/i;


# direct methods
.method constructor <init>(Luj/i;)V
    .locals 0

    iput-object p1, p0, Luj/i$a;->a:Luj/i;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/kodein/di/e$a;)Luj/e;
    .locals 10

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luj/i;

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-virtual {v0}, Luj/i;->c()Luj/q;

    move-result-object v2

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-virtual {v0}, Luj/i;->b()Lorg/kodein/type/q;

    move-result-object v3

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-static {v0}, Luj/i;->l(Luj/i;)Z

    move-result v4

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-virtual {v0}, Luj/i;->d()Lorg/kodein/type/q;

    move-result-object v5

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-virtual {v0}, Luj/i;->j()Lorg/kodein/type/q;

    move-result-object v6

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-static {v0}, Luj/i;->m(Luj/i;)Luj/o;

    move-result-object v7

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-virtual {v0}, Luj/i;->p()Z

    move-result v8

    iget-object v0, p0, Luj/i$a;->a:Luj/i;

    invoke-static {v0}, Luj/i;->k(Luj/i;)Lmh/p;

    move-result-object v9

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Luj/i;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Lorg/kodein/type/q;Luj/o;ZLmh/p;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/kodein/di/e$a;

    invoke-virtual {p0, p1}, Luj/i$a;->a(Lorg/kodein/di/e$a;)Luj/e;

    move-result-object p1

    return-object p1
.end method
