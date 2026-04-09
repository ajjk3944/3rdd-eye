.class public final Lk83;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Lpc4;

.field public b:Lxe4;

.field public c:Ljava/lang/String;

.field public d:Lih3;

.field public e:Z

.field public f:Ljava/util/ArrayList;

.field public g:Ljava/util/ArrayList;

.field public h:Lr12;

.field public i:Lvi4;

.field public j:Lz2;

.field public k:Lvm0;

.field public l:Lwi2;

.field public m:I

.field public n:Lf52;

.field public final o:Lh80;

.field public p:Z

.field public q:Z

.field public r:Ls23;

.field public s:Z

.field public t:Landroid/os/Bundle;

.field public final u:Ljava/util/concurrent/atomic/AtomicLong;

.field public v:Lpk2;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lk83;->m:I

    .line 6
    .line 7
    new-instance v0, Lh80;

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    invoke-direct {v0, v1}, Lh80;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iput v1, v0, Lh80;->g:I

    .line 15
    .line 16
    iput-object v0, p0, Lk83;->o:Lh80;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lk83;->p:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lk83;->q:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lk83;->s:Z

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lk83;->u:Ljava/util/concurrent/atomic/AtomicLong;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()Ll83;
    .locals 2

    .line 1
    iget-object v0, p0, Lk83;->c:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "ad unit must not be null"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lk83;->b:Lxe4;

    .line 9
    .line 10
    const-string v1, "ad size must not be null"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lk83;->a:Lpc4;

    .line 16
    .line 17
    const-string v1, "ad request must not be null"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lou1;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ll83;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Ll83;-><init>(Lk83;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method
