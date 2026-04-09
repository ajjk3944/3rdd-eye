.class public final Lyu1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lf41;
.implements Le41;


# instance fields
.field public final f:Lf41;

.field public final g:Le41;


# direct methods
.method public synthetic constructor <init>(Lf41;Le41;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyu1;->f:Lf41;

    .line 5
    .line 6
    iput-object p2, p0, Lyu1;->g:Le41;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Lbw;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyu1;->g:Le41;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Le41;->j(Lbw;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k(Lbw1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyu1;->f:Lf41;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lf41;->k(Lbw1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
