.class public final synthetic Lpo;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Lqo;

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lqo;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpo;->f:Lqo;

    .line 5
    .line 6
    iput p2, p0, Lpo;->g:I

    .line 7
    .line 8
    iput-object p3, p0, Lpo;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lpo;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lpo;->f:Lqo;

    .line 4
    .line 5
    iget-object v1, v1, Lqo;->b:Lqm0;

    .line 6
    .line 7
    iget v2, p0, Lpo;->g:I

    .line 8
    .line 9
    invoke-interface {v1, v2, v0}, Lqm0;->i(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
