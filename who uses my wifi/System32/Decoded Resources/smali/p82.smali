.class public final Lp82;
.super Lgw3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lag2;Ljava/util/Map;)V
    .locals 2

    .line 1
    const/16 p2, 0x17

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "storePicture"

    .line 5
    .line 6
    invoke-direct {p0, p1, v1, p2, v0}, Lgw3;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lag2;->g()Landroid/app/Activity;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lp82;->i:Landroid/app/Activity;

    .line 14
    .line 15
    return-void
.end method
