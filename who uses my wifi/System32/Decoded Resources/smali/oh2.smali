.class public final Loh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lda4;


# direct methods
.method public constructor <init>(Lda4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loh2;->a:Lda4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Loh2;->a:Lda4;

    .line 2
    .line 3
    iget-object v0, v0, Lda4;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lth2;

    .line 6
    .line 7
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
