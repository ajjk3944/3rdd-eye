.class public final Lkk;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lgk;


# instance fields
.field public final f:Le50;

.field public final g:Lgk;


# direct methods
.method public constructor <init>(Lgk;Ldy;)V
    .locals 1

    .line 1
    const-string v0, "baseKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    check-cast p2, Le50;

    .line 10
    .line 11
    iput-object p2, p0, Lkk;->f:Le50;

    .line 12
    .line 13
    instance-of p2, p1, Lkk;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    check-cast p1, Lkk;

    .line 18
    .line 19
    iget-object p1, p1, Lkk;->g:Lgk;

    .line 20
    .line 21
    :cond_0
    iput-object p1, p0, Lkk;->g:Lgk;

    .line 22
    .line 23
    return-void
.end method
