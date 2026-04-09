.class final Lda/I$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I$b;->a(Lca/d$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/I;

.field final synthetic b:Lca/d$a;


# direct methods
.method constructor <init>(Lda/I;Lca/d$a;)V
    .locals 0

    iput-object p1, p0, Lda/I$b$a;->a:Lda/I;

    iput-object p2, p0, Lda/I$b$a;->b:Lca/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/s;)Lgg/f;
    .locals 7

    const-string/jumbo v0, "termsRevisions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lda/I$b$a;->a:Lda/I;

    invoke-virtual {v0}, Lda/I;->i0()LH/l;

    move-result-object v0

    invoke-static {v0}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v0

    iget-object v1, p0, Lda/I$b$a;->a:Lda/I;

    invoke-virtual {v1}, Lda/I;->k0()LH/l;

    move-result-object v1

    invoke-static {v1}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v1

    iget-object v2, p0, Lda/I$b$a;->a:Lda/I;

    invoke-virtual {v2}, Lda/I;->p0()LH/l;

    move-result-object v2

    invoke-static {v2}, Lja/b;->b(LH/l;)LLi/g;

    move-result-object v2

    iget-object v3, p0, Lda/I$b$a;->a:Lda/I;

    invoke-virtual {v3}, Lda/I;->f0()LLi/z;

    move-result-object v3

    new-instance v4, Lda/I$b$a$a;

    iget-object v5, p0, Lda/I$b$a;->b:Lca/d$a;

    const/4 v6, 0x0

    invoke-direct {v4, v5, p1, v6}, Lda/I$b$a$a;-><init>(Lca/d$a;LEb/s;Ldh/e;)V

    invoke-static {v0, v1, v2, v3, v4}, LLi/i;->j(LLi/g;LLi/g;LLi/g;LLi/g;Lmh/s;)LLi/g;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v6, v0, v6}, LQi/i;->e(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->P()Lgg/z;

    move-result-object p1

    new-instance v0, Lda/I$b$a$b;

    iget-object v1, p0, Lda/I$b$a;->a:Lda/I;

    invoke-direct {v0, v1}, Lda/I$b$a$b;-><init>(Lda/I;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/s;

    invoke-virtual {p0, p1}, Lda/I$b$a;->a(LEb/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
