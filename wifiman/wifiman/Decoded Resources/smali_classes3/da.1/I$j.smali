.class final Lda/I$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->k1()V
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

    iput-object p1, p0, Lda/I$j;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$j;->g(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$j;->f(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$j;->e(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lda/I;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lda/I;->j0()LLi/z;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lda/I;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lda/I;->j0()LLi/z;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lda/I;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lda/I;->j0()LLi/z;

    move-result-object p0

    new-instance v0, Ls9/d$b;

    sget v1, LP9/b;->g0:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

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

    invoke-virtual {p0, p1}, Lda/I$j;->d(Ljava/lang/CharSequence;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/CharSequence;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lda/I$j;->a:Lda/I;

    new-instance v0, Lda/L;

    invoke-direct {v0, p1}, Lda/L;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lda/I$j;->a:Lda/I;

    invoke-static {v1}, Lda/I;->P0(Lda/I;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v1

    invoke-interface {v1}, LGb/f;->v()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lda/I$j;->a:Lda/I;

    new-instance v0, Lda/M;

    invoke-direct {v0, p1}, Lda/M;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lda/I$j;->a:Lda/I;

    invoke-static {v0}, Lda/I;->P0(Lda/I;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LAb/a;->t(Ljava/lang/String;)Lgg/z;

    move-result-object v0

    sget-object v1, Lda/I$j$a;->a:Lda/I$j$a;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lda/I$j$b;

    iget-object v2, p0, Lda/I$j;->a:Lda/I;

    invoke-direct {v1, v2, p1}, Lda/I$j$b;-><init>(Lda/I;Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lda/I$j;->a:Lda/I;

    new-instance v0, Lda/N;

    invoke-direct {v0, p1}, Lda/N;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
