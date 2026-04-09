.class public abstract Lcom/ui/wifiman/ui/teleport/M;
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
.method protected final n0()Lcom/ui/wifiman/ui/teleport/L;
    .locals 2

    sget-object v0, Lxe/I$K;->a:Lxe/I$K;

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/I$K;->e(Landroidx/lifecycle/E;)Lcom/ui/wifiman/ui/teleport/L;

    move-result-object v0

    return-object v0
.end method

.method public abstract o0()V
.end method
