.class final Lda/I$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->n1()V
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

    iput-object p1, p0, Lda/I$k;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$k;->d(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$k;->e(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lda/I;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lda/I;->l0()LLi/z;

    move-result-object v0

    sget-object v1, Lda/u$a$a;->a:Lda/u$a$a;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lda/I;->a1()LLi/z;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lda/I;->m0()LLi/z;

    move-result-object p0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {p0, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lda/I;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lda/I;->l0()LLi/z;

    move-result-object v0

    sget-object v1, Lda/u$a$f;->a:Lda/u$a$f;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lda/I;->a1()LLi/z;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LLi/y;->j(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lda/I;->m0()LLi/z;

    move-result-object p0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {p0, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Lda/I$k;->c(Ljava/lang/CharSequence;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/CharSequence;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "password"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lda/I$k;->a:Lda/I;

    new-instance v0, Lda/P;

    invoke-direct {v0, p1}, Lda/P;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lda/I$k;->a:Lda/I;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lda/I;->L0(Lda/I;Ljava/lang/String;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lda/I$k;->a:Lda/I;

    new-instance v0, Lda/Q;

    invoke-direct {v0, p1}, Lda/Q;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
