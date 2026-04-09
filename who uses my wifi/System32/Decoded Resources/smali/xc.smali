.class public abstract Lxc;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ll40;
.implements Ljava/io/Serializable;


# instance fields
.field public transient f:Ll40;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Class;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxc;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lxc;->h:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lxc;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lxc;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lxc;->k:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c()Lgf;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxc;->k:Z

    .line 2
    .line 3
    iget-object v1, p0, Lxc;->h:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ldp0;->a:Lep0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lak0;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lak0;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-static {v1}, Ldp0;->a(Ljava/lang/Class;)Lhf;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
