.class final Luj/u$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luj/u;


# direct methods
.method constructor <init>(Luj/u;)V
    .locals 0

    iput-object p1, p0, Luj/u$a;->a:Luj/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/kodein/di/e$a;)Luj/e;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Luj/u;

    iget-object v0, p0, Luj/u$a;->a:Luj/u;

    invoke-virtual {v0}, Luj/u;->c()Luj/q;

    move-result-object v2

    iget-object v0, p0, Luj/u$a;->a:Luj/u;

    invoke-virtual {v0}, Luj/u;->b()Lorg/kodein/type/q;

    move-result-object v3

    iget-object v0, p0, Luj/u$a;->a:Luj/u;

    invoke-static {v0}, Luj/u;->k(Luj/u;)Z

    move-result v4

    iget-object v0, p0, Luj/u$a;->a:Luj/u;

    invoke-virtual {v0}, Luj/u;->j()Lorg/kodein/type/q;

    move-result-object v5

    iget-object v0, p0, Luj/u$a;->a:Luj/u;

    invoke-static {v0}, Luj/u;->l(Luj/u;)Luj/o;

    move-result-object v6

    iget-object v0, p0, Luj/u$a;->a:Luj/u;

    invoke-virtual {v0}, Luj/u;->p()Z

    move-result v7

    iget-object v0, p0, Luj/u$a;->a:Luj/u;

    invoke-virtual {v0}, Luj/u;->o()Lmh/l;

    move-result-object v8

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/kodein/di/e$a;

    invoke-virtual {p0, p1}, Luj/u$a;->a(Lorg/kodein/di/e$a;)Luj/e;

    move-result-object p1

    return-object p1
.end method
