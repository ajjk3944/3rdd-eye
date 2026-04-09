.class public abstract Lcom/ui/wifiman/ui/teleport/consoles/w;
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

.method protected final o0()Lcom/ui/wifiman/ui/teleport/consoles/v;
    .locals 2

    sget-object v0, Lxe/I$F;->a:Lxe/I$F;

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/I$F;->e(Landroidx/lifecycle/E;)Lcom/ui/wifiman/ui/teleport/consoles/v;

    move-result-object v0

    return-object v0
.end method
