.class public final Lwz1;
.super Lil;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:Lxz1;


# direct methods
.method public constructor <init>(Lxz1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwz1;->a:Lxz1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lwz1;->a:Lxz1;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmz1;->Y4:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p2, Lxz1;->d:Lmv2;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    sget-object v0, Lmd2;->a:Lld2;

    .line 29
    .line 30
    new-instance v1, Lcd;

    .line 31
    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-direct {v1, p2, p1, v2}, Lcd;-><init>(Ljava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method
