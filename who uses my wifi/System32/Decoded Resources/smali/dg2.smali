.class public final synthetic Ldg2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Lsg2;

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(Lsg2;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldg2;->f:Lsg2;

    .line 5
    .line 6
    iput-wide p2, p0, Ldg2;->g:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Ldg2;->f:Lsg2;

    .line 3
    .line 4
    iget-object v1, v1, Lsg2;->f:Ljg2;

    .line 5
    .line 6
    iget-wide v2, p0, Ldg2;->g:J

    .line 7
    .line 8
    invoke-virtual {v1, v2, v3, v0}, Ljg2;->z(JZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
