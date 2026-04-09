.class public abstract Lcom/ui/wifiman/ui/wifi/channel/c;
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
.method public abstract c()LLi/N;
.end method

.method public abstract n0()LLi/N;
.end method

.method public abstract o0()LLi/N;
.end method

.method public abstract p0()LLi/N;
.end method

.method public abstract q0()LLi/N;
.end method

.method protected final r0()Lcom/ui/wifiman/ui/wifi/channel/b;
    .locals 2

    sget-object v0, Lxe/I$N;->a:Lxe/I$N;

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/I$N;->p(Landroidx/lifecycle/E;)Lcom/ui/wifiman/ui/wifi/channel/b;

    move-result-object v0

    return-object v0
.end method

.method public abstract s0(Lzf/a;)V
.end method

.method public abstract t0(Lh9/a;)V
.end method
