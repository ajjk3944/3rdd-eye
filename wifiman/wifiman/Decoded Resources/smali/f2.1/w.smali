.class public Lf2/w;
.super Lf2/n;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf2/n;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final s0(Landroidx/lifecycle/o;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf2/n;->s0(Landroidx/lifecycle/o;)V

    return-void
.end method

.method public final t0(Landroidx/lifecycle/Q;)V
    .locals 1

    const-string v0, "viewModelStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf2/n;->t0(Landroidx/lifecycle/Q;)V

    return-void
.end method

.method public final u(Z)V
    .locals 0

    invoke-super {p0, p1}, Lf2/n;->u(Z)V

    return-void
.end method
