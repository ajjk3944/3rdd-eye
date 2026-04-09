.class public final Loi4;
.super Loz1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final g:Ljava/lang/Object;


# instance fields
.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:Lfk1;

.field public final f:Lqg1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loi4;->g:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Lxm3;->g:Lvm3;

    .line 9
    .line 10
    sget-object v0, Lsn3;->j:Lsn3;

    .line 11
    .line 12
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    sget-object v0, Lsn3;->j:Lsn3;

    .line 15
    .line 16
    sget-object v1, Lzi1;->a:Lzi1;

    .line 17
    .line 18
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v2, Lkh1;

    .line 23
    .line 24
    invoke-direct {v2, v1, v0}, Lkh1;-><init>(Landroid/net/Uri;Lxm3;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    new-instance v0, Lfk1;

    .line 28
    .line 29
    new-instance v0, Lse1;

    .line 30
    .line 31
    invoke-direct {v0}, Lce1;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lqg1;

    .line 35
    .line 36
    sget-object v0, Lrm1;->B:Lrm1;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(JJZLfk1;Lqg1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Loi4;->b:J

    .line 5
    .line 6
    iput-wide p3, p0, Loi4;->c:J

    .line 7
    .line 8
    iput-boolean p5, p0, Loi4;->d:Z

    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iput-object p6, p0, Loi4;->e:Lfk1;

    .line 14
    .line 15
    iput-object p7, p0, Loi4;->f:Lqg1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final b(ILez1;J)Lez1;
    .locals 7

    .line 1
    const/4 p3, 0x1

    .line 2
    invoke-static {p1, p3}, Lzt0;->e0(II)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Lez1;->m:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-wide v5, p0, Loi4;->c:J

    .line 9
    .line 10
    iget-object v1, p0, Loi4;->e:Lfk1;

    .line 11
    .line 12
    iget-boolean v2, p0, Loi4;->d:Z

    .line 13
    .line 14
    iget-object v4, p0, Loi4;->f:Lqg1;

    .line 15
    .line 16
    move-object v0, p2

    .line 17
    invoke-virtual/range {v0 .. v6}, Lez1;->a(Lfk1;ZZLqg1;J)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final d(ILsw1;Z)Lsw1;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lzt0;->e0(II)V

    .line 3
    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p1, Loi4;->g:Ljava/lang/Object;

    .line 8
    .line 9
    :goto_0
    move-object v2, p1

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :goto_1
    sget-object p1, Lzb2;->b:Lzb2;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    iget-wide v4, p0, Loi4;->b:J

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    invoke-virtual/range {v0 .. v6}, Lsw1;->a(Ljava/lang/Object;Ljava/lang/Object;IJZ)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Loi4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, -0x1

    .line 12
    return p1
.end method

.method public final f(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lzt0;->e0(II)V

    .line 3
    .line 4
    .line 5
    sget-object p1, Loi4;->g:Ljava/lang/Object;

    .line 6
    .line 7
    return-object p1
.end method
