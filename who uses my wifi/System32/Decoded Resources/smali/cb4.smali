.class public final synthetic Lcb4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Ljd4;

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Ljd4;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcb4;->f:Ljd4;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcb4;->g:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lcb4;->h:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcb4;->g:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lcb4;->h:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcb4;->f:Ljd4;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Ljd4;->d(ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
