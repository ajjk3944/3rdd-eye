.class public final Lym1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lgm1;

.field public final b:Lx13;

.field public final c:Llg1;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lgm1;Lx13;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lym1;->a:Lgm1;

    .line 5
    .line 6
    iput-object p2, p0, Lym1;->b:Lx13;

    .line 7
    .line 8
    new-instance p1, Llg1;

    .line 9
    .line 10
    const/16 p2, 0x40

    .line 11
    .line 12
    new-array v0, p2, [B

    .line 13
    .line 14
    invoke-direct {p1, p2, v0}, Llg1;-><init>(I[B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lym1;->c:Llg1;

    .line 18
    .line 19
    return-void
.end method
