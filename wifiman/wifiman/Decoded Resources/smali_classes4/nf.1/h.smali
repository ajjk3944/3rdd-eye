.class public abstract Lnf/h;
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

.method public abstract p0()LLi/N;
.end method

.method protected final q0()Lnf/e;
    .locals 2

    sget-object v0, Lxe/I$y;->a:Lxe/I$y;

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/I$y;->p(Landroidx/lifecycle/E;)Lnf/e;

    move-result-object v0

    return-object v0
.end method

.method public abstract r0()LLi/N;
.end method

.method public abstract s0()LLi/N;
.end method

.method public abstract t0()LLi/N;
.end method

.method public abstract u0()V
.end method

.method public abstract v0(Z)V
.end method
