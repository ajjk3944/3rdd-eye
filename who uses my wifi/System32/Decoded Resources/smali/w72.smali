.class public final Lw72;
.super Lf74;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Lug4;

.field public final j:Ljava/lang/String;

.field public final k:Lx34;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lx34;)V
    .locals 1

    .line 1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 2
    .line 3
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v0, 0x6

    .line 10
    invoke-direct {p0, v0}, Lf74;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lug4;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lug4;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lw72;->i:Lug4;

    .line 19
    .line 20
    iput-object p3, p0, Lw72;->j:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, Lw72;->k:Lx34;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final p1()V
    .locals 9

    .line 1
    iget-object v0, p0, Lw72;->j:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lw72;->k:Lx34;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lx34;->f:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v3, v1

    .line 10
    check-cast v3, Lcd4;

    .line 11
    .line 12
    new-instance v2, Lg4;

    .line 13
    .line 14
    sget-object v5, Lmd2;->e:Luq3;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/16 v8, 0x10

    .line 18
    .line 19
    iget-object v4, p0, Lw72;->i:Lug4;

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-direct/range {v2 .. v8}, Lg4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v0}, Lg4;->g(Ljava/lang/String;)Ln70;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v1, p0, Lw72;->i:Lug4;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v1, v0, v2}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 33
    .line 34
    .line 35
    return-void
.end method
