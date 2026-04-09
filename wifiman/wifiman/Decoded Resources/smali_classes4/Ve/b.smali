.class public abstract LVe/b;
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
.method protected final n0()LVe/a;
    .locals 2

    sget-object v0, Lxe/I$i;->a:Lxe/I$i;

    invoke-virtual {p0}, Lye/g;->j0()Landroidx/lifecycle/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/I$i;->e(Landroidx/lifecycle/E;)LVe/a;

    move-result-object v0

    return-object v0
.end method

.method public abstract o0()LLi/N;
.end method

.method public abstract p0()V
.end method
