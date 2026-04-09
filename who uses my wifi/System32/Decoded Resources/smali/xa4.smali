.class public final Lxa4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lsb4;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Loz1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lgh4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxa4;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p1, p2, Lgh4;->o:Leh4;

    .line 7
    .line 8
    iput-object p1, p0, Lxa4;->b:Loz1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa4;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Loz1;
    .locals 1

    .line 1
    iget-object v0, p0, Lxa4;->b:Loz1;

    .line 2
    .line 3
    return-object v0
.end method
