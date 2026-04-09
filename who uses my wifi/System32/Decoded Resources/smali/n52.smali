.class public final Ln52;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final f:Ly32;

.field public final synthetic g:Lq52;


# direct methods
.method public constructor <init>(Lq52;Ly32;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln52;->g:Lq52;

    .line 5
    .line 6
    iput-object p2, p0, Ln52;->f:Ly32;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    .line 1
    check-cast p1, Lag2;

    .line 2
    .line 3
    iget-object p1, p0, Ln52;->f:Ly32;

    .line 4
    .line 5
    iget-object v0, p0, Ln52;->g:Lq52;

    .line 6
    .line 7
    invoke-interface {p1, v0, p2}, Ly32;->c(Ljava/lang/Object;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
