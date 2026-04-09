.class public final Lsz1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldp2;


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsz1;->f:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lsz1;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Llp2;

    .line 2
    .line 3
    iget-object v0, p0, Lsz1;->f:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lsz1;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p1, v0, v1}, Llp2;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
