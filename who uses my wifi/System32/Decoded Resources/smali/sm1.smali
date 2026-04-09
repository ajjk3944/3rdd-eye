.class public final Lsm1;
.super Lzu1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lxe4;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lbu1;


# direct methods
.method public constructor <init>(Lbu1;Landroid/content/Context;Lxe4;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lsm1;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, Lsm1;->c:Lxe4;

    .line 7
    .line 8
    iput-object p4, p0, Lsm1;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lsm1;->e:Lbu1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lsm1;->b:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "search"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lbu1;->F(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lr93;

    .line 9
    .line 10
    invoke-direct {v0}, Ln92;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lsm1;->e:Lbu1;

    .line 2
    .line 3
    iget-object v0, v0, Lbu1;->g:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Lg32;

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x3

    .line 10
    iget-object v2, p0, Lsm1;->b:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, p0, Lsm1;->c:Lxe4;

    .line 13
    .line 14
    iget-object v4, p0, Lsm1;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual/range {v1 .. v6}, Lg32;->w(Landroid/content/Context;Lxe4;Ljava/lang/String;Lu62;I)Lba2;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final c(Lek2;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Loi0;

    .line 2
    .line 3
    iget-object v1, p0, Lsm1;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lsm1;->d:Ljava/lang/String;

    .line 9
    .line 10
    const v2, 0xf212370

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lsm1;->c:Lxe4;

    .line 14
    .line 15
    invoke-interface {p1, v0, v3, v1, v2}, Lek2;->b1(Lu10;Lxe4;Ljava/lang/String;I)Lba2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
