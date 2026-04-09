.class public final Lof/f$b;
.super Lof/a$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof/f;->k(Lof/a;Ls9/c;Lof/a$a;Ljava/lang/String;Ljava/lang/String;)Lof/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/z;

.field private final i:LLi/z;

.field private final j:LLi/z;


# direct methods
.method constructor <init>(Ls9/c;Lof/a$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lof/a$c;-><init>()V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lof/f$b;->g:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lof/f$b;->h:LLi/z;

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    new-instance p2, Ls9/d$c;

    invoke-direct {p2, p3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p2

    iput-object p2, p0, Lof/f$b;->i:LLi/z;

    if-eqz p4, :cond_1

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, p4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Lof/f$b;->j:LLi/z;

    return-void
.end method


# virtual methods
.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lof/f$b;->s0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lof/f$b;->t0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lof/f$b;->u0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lof/f$b;->v0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public r0()V
    .locals 0

    return-void
.end method

.method public s0()LLi/z;
    .locals 1

    iget-object v0, p0, Lof/f$b;->h:LLi/z;

    return-object v0
.end method

.method public t0()LLi/z;
    .locals 1

    iget-object v0, p0, Lof/f$b;->g:LLi/z;

    return-object v0
.end method

.method public u0()LLi/z;
    .locals 1

    iget-object v0, p0, Lof/f$b;->j:LLi/z;

    return-object v0
.end method

.method public v0()LLi/z;
    .locals 1

    iget-object v0, p0, Lof/f$b;->i:LLi/z;

    return-object v0
.end method
