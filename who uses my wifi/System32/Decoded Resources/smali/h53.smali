.class public final synthetic Lh53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Li53;

.field public final synthetic g:Ld82;

.field public final synthetic h:Landroid/os/Bundle;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ll23;

.field public final synthetic k:Lpd2;


# direct methods
.method public synthetic constructor <init>(Li53;Ld82;Landroid/os/Bundle;Ljava/util/List;Ll23;Lpd2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh53;->f:Li53;

    .line 5
    .line 6
    iput-object p2, p0, Lh53;->g:Ld82;

    .line 7
    .line 8
    iput-object p3, p0, Lh53;->h:Landroid/os/Bundle;

    .line 9
    .line 10
    iput-object p4, p0, Lh53;->i:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lh53;->j:Ll23;

    .line 13
    .line 14
    iput-object p6, p0, Lh53;->k:Lpd2;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lh53;->f:Li53;

    .line 2
    .line 3
    iget-object v1, p0, Lh53;->g:Ld82;

    .line 4
    .line 5
    iget-object v4, p0, Lh53;->h:Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v2, p0, Lh53;->i:Ljava/util/List;

    .line 8
    .line 9
    iget-object v7, p0, Lh53;->j:Ll23;

    .line 10
    .line 11
    :try_start_0
    iget-object v3, v0, Li53;->d:Landroid/content/Context;

    .line 12
    .line 13
    move-object v5, v2

    .line 14
    new-instance v2, Loi0;

    .line 15
    .line 16
    invoke-direct {v2, v3}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    move-object v5, v3

    .line 25
    check-cast v5, Landroid/os/Bundle;

    .line 26
    .line 27
    iget-object v3, v0, Li53;->j:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v0, v0, Li53;->e:Ll83;

    .line 30
    .line 31
    iget-object v6, v0, Ll83;->f:Lxe4;

    .line 32
    .line 33
    invoke-interface/range {v1 .. v7}, Ld82;->q3(Lu10;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Lxe4;Lf82;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception v0

    .line 38
    iget-object v1, p0, Lh53;->k:Lpd2;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
