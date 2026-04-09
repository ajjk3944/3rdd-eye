.class final Lda/I$j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I$j;->d(Ljava/lang/CharSequence;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/I;

.field final synthetic b:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Lda/I;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lda/I$j$b;->a:Lda/I;

    iput-object p2, p0, Lda/I$j$b;->b:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lda/I;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lda/I$j$b;->c(Lda/I;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lda/I;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lda/I;->j0()LLi/z;

    move-result-object p0

    new-instance v0, Ls9/d$b;

    sget v1, LP9/b;->h0:I

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

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lda/I$j$b;->b(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "emailTaken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lda/I$j$b;->a:Lda/I;

    new-instance v0, Lda/O;

    invoke-direct {v0, p1}, Lda/O;-><init>(Lda/I;)V

    invoke-static {v0}, Lgg/b;->F(Ljava/util/concurrent/Callable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lda/I$j$b;->a:Lda/I;

    invoke-virtual {p1}, Lda/I;->j0()LLi/z;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    iget-object p1, p0, Lda/I$j$b;->a:Lda/I;

    invoke-virtual {p1}, Lda/I;->p0()LH/l;

    move-result-object p1

    invoke-virtual {p1}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lda/I$j$b;->a:Lda/I;

    iget-object v0, p0, Lda/I$j$b;->b:Ljava/lang/CharSequence;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lda/I;->N0(Lda/I;Ljava/lang/String;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method
