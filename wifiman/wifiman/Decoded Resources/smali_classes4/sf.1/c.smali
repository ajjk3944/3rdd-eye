.class public abstract Lsf/c;
.super Lze/d;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lze/d;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getTitle()LLi/N;
.end method

.method public abstract n0()LLi/N;
.end method

.method public abstract o0()LLi/N;
.end method

.method protected final p0()Lsf/b;
    .locals 2

    sget-object v0, Lxe/I$G;->a:Lxe/I$G;

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/I$G;->e(Landroidx/lifecycle/E;)Lsf/b;

    move-result-object v0

    return-object v0
.end method

.method public abstract q0()LLi/N;
.end method

.method public abstract r0()LLi/N;
.end method

.method public abstract s0()V
.end method

.method public abstract t0()V
.end method
