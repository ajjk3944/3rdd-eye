.class public abstract Lwh/K0$a;
.super Lwh/A;
.source "SourceFile"

# interfaces
.implements Lth/g;
.implements Lth/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/K0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lwh/A;-><init>()V

    return-void
.end method


# virtual methods
.method public W()Lwh/d0;
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->W()Lwh/d0;

    move-result-object v0

    return-object v0
.end method

.method public X()Lxh/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b0()Z
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->e0()Lwh/K0;

    move-result-object v0

    invoke-virtual {v0}, Lwh/K0;->b0()Z

    move-result v0

    return v0
.end method

.method public abstract d0()LBh/X;
.end method

.method public abstract e0()Lwh/K0;
.end method

.method public isExternal()Z
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->d0()LBh/X;

    move-result-object v0

    invoke-interface {v0}, LBh/C;->isExternal()Z

    move-result v0

    return v0
.end method

.method public isInfix()Z
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->d0()LBh/X;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isInfix()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->d0()LBh/X;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isInline()Z

    move-result v0

    return v0
.end method

.method public isOperator()Z
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->d0()LBh/X;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isOperator()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lwh/K0$a;->d0()LBh/X;

    move-result-object v0

    invoke-interface {v0}, LBh/z;->isSuspend()Z

    move-result v0

    return v0
.end method
