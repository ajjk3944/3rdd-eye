.class public final Lt32;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Liq3;
.implements Lvg2;


# instance fields
.field public final synthetic f:Lag2;


# direct methods
.method public synthetic constructor <init>(Lag2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt32;->f:Lag2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public synthetic a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt32;->f:Lag2;

    .line 2
    .line 3
    invoke-interface {v0}, Lag2;->P()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lt32;->f:Lag2;

    .line 4
    .line 5
    invoke-interface {v0}, Lag2;->F()La83;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Lag2;->F()La83;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v1, v1, La83;->x0:Lx34;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    new-instance v2, Lw72;

    .line 20
    .line 21
    invoke-interface {v0}, Lag2;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v0}, Lag2;->u()Le51;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v0, v0, Le51;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct {v2, v3, v0, p1, v1}, Lw72;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx34;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lf74;->r1()Ln70;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 2
    .line 3
    iget-object v0, v0, Lhg4;->h:Lgd2;

    .line 4
    .line 5
    const-string v1, "DefaultGmsgHandlers.attributionReportingManager"

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
