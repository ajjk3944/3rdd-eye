.class public Lcv3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Class;

.field public final c:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcv3;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcv3;->b:Ljava/lang/Class;

    .line 7
    .line 8
    iput p1, p0, Lcv3;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La54;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcv3;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lcv3;->c:I

    .line 5
    .line 6
    sget-object v3, Li04;->j:Li04;

    .line 7
    .line 8
    invoke-static {v0, p1, v2, v3, v1}, Lfw3;->v(Ljava/lang/String;La54;ILi04;Ljava/lang/Integer;)Lfw3;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lrv3;->b:Lrv3;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lrv3;->e(Lfw3;)Lgi2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Lpv3;->b:Lpv3;

    .line 19
    .line 20
    iget-object v0, v0, Lpv3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ldw3;

    .line 27
    .line 28
    iget-object v1, p0, Lcv3;->b:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-virtual {v0, p1, v1}, Ldw3;->a(Lgi2;Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method
