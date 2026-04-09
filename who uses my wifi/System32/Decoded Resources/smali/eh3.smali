.class public final Leh3;
.super Lad1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic g:Lw9;


# direct methods
.method public constructor <init>(Lw9;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Leh3;->g:Lw9;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lad1;-><init>(Lw9;ILandroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lrh;)V
    .locals 1

    .line 1
    iget-object v0, p0, Leh3;->g:Lw9;

    .line 2
    .line 3
    iget-object v0, v0, Lw9;->j:Lv9;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lv9;->e(Lrh;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Leh3;->g:Lw9;

    .line 2
    .line 3
    iget-object v0, v0, Lw9;->j:Lv9;

    .line 4
    .line 5
    sget-object v1, Lrh;->j:Lrh;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lv9;->e(Lrh;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0
.end method
