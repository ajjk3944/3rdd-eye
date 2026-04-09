.class public final Ljf/p$b;
.super Ljf/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf/p;->e(Ljf/d;Ljf/g;Ljf/e;Ljf/c;LT/l;II)Ljf/h;
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
.method constructor <init>(Ljf/d;Ljf/g;Ljf/e;Ljf/c;)V
    .locals 0

    invoke-direct {p0}, Ljf/h;-><init>()V

    invoke-static {p1}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Ljf/p$b;->g:LLi/z;

    invoke-static {p2}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Ljf/p$b;->h:LLi/z;

    invoke-static {p3}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Ljf/p$b;->i:LLi/z;

    invoke-static {p4}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object p1

    iput-object p1, p0, Ljf/p$b;->j:LLi/z;

    return-void
.end method


# virtual methods
.method public A0()LLi/z;
    .locals 1

    iget-object v0, p0, Ljf/p$b;->g:LLi/z;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 3

    new-instance v0, LYg/r;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LYg/r;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Ljf/p$b;->x0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Ljf/p$b;->y0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic p0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Ljf/p$b;->z0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic q0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Ljf/p$b;->A0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public s0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public t0()V
    .locals 0

    return-void
.end method

.method public u0()V
    .locals 0

    return-void
.end method

.method public v0()V
    .locals 0

    return-void
.end method

.method public w0(Z)V
    .locals 0

    return-void
.end method

.method public x0()LLi/z;
    .locals 1

    iget-object v0, p0, Ljf/p$b;->j:LLi/z;

    return-object v0
.end method

.method public y0()LLi/z;
    .locals 1

    iget-object v0, p0, Ljf/p$b;->i:LLi/z;

    return-object v0
.end method

.method public z0()LLi/z;
    .locals 1

    iget-object v0, p0, Ljf/p$b;->h:LLi/z;

    return-object v0
.end method
