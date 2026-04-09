.class public final Lku0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lp40;


# instance fields
.field public final synthetic f:Lfo;


# direct methods
.method public constructor <init>(Lfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lku0;->f:Lfo;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Leo;

    .line 2
    .line 3
    iget-object v1, p0, Lku0;->f:Lfo;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Leo;-><init>(Lfo;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
