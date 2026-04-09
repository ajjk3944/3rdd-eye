.class final Lda/I$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->q1()V
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

    iput-object p1, p0, Lda/I$m;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$m;->f(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$m;->g(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$m;->e(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lda/I;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lda/I;->q0()LLi/z;

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

    invoke-virtual {p0}, Lda/I;->q0()LLi/z;

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

    invoke-virtual {p0}, Lda/I;->q0()LLi/z;

    move-result-object p0

    new-instance v0, Ls9/d$b;

    sget v1, LP9/b;->z0:I

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

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lda/I$m;->d(Ljava/lang/String;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;)Lgg/f;
    .locals 2

    const-string/jumbo v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lda/I$m;->a:Lda/I;

    new-instance v0, Lda/S;

    invoke-direct {v0, p1}, Lda/S;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lda/I$m;->a:Lda/I;

    invoke-static {v0}, Lda/I;->P0(Lda/I;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->h()LGb/f;

    move-result-object v0

    invoke-interface {v0}, LGb/f;->G()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lda/I$m;->a:Lda/I;

    new-instance v0, Lda/T;

    invoke-direct {v0, p1}, Lda/T;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lda/I$m;->a:Lda/I;

    invoke-static {v0}, Lda/I;->Q0(Lda/I;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lda/I$m;->a:Lda/I;

    invoke-static {v0}, Lda/I;->P0(Lda/I;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0, p1}, LAb/a;->s(Ljava/lang/String;)Lgg/z;

    move-result-object p1

    sget-object v0, Lda/I$m$a;->a:Lda/I$m$a;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, Lda/I$m$b;

    iget-object v1, p0, Lda/I$m;->a:Lda/I;

    invoke-direct {v0, v1}, Lda/I$m$b;-><init>(Lda/I;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lda/I$m;->a:Lda/I;

    new-instance v0, Lda/U;

    invoke-direct {v0, p1}, Lda/U;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
