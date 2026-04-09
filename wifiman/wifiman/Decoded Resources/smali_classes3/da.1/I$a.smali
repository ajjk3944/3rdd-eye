.class final Lda/I$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->R0(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/I;


# direct methods
.method constructor <init>(Lda/I;)V
    .locals 0

    iput-object p1, p0, Lda/I$a;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/m;)V
    .locals 2

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lda/I$a;->a:Lda/I;

    invoke-static {v0, p1}, Lda/I;->O0(Lda/I;LEb/m;)Lda/u$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lda/I$a;->a:Lda/I;

    invoke-virtual {v1}, Lda/I;->l0()LLi/z;

    move-result-object v1

    invoke-interface {v1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lda/I$a;->a:Lda/I;

    invoke-virtual {v0}, Lda/I;->a1()LLi/z;

    move-result-object v0

    invoke-virtual {p1}, LEb/m;->e()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    iget-object v0, p0, Lda/I$a;->a:Lda/I;

    invoke-virtual {v0}, Lda/I;->m0()LLi/z;

    move-result-object v0

    invoke-virtual {p1}, LEb/m;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p1}, LEb/m;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LEb/m;

    invoke-virtual {p0, p1}, Lda/I$a;->a(LEb/m;)V

    return-void
.end method
