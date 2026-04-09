.class public final Leh4;
.super Lah4;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final e:Ljava/lang/Object;


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leh4;->e:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Loz1;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lah4;-><init>(Loz1;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Leh4;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Leh4;->d:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(ILez1;J)Lez1;
    .locals 1

    .line 1
    iget-object v0, p0, Lah4;->b:Loz1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Loz1;->b(ILez1;J)Lez1;

    .line 4
    .line 5
    .line 6
    iget-object p1, p2, Lez1;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p3, p0, Leh4;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p1, Lez1;->m:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, p2, Lez1;->a:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_0
    return-object p2
.end method

.method public final d(ILsw1;Z)Lsw1;
    .locals 1

    .line 1
    iget-object v0, p0, Lah4;->b:Loz1;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Loz1;->d(ILsw1;Z)Lsw1;

    .line 4
    .line 5
    .line 6
    iget-object p1, p2, Lsw1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v0, p0, Leh4;->d:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    sget-object p1, Leh4;->e:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p1, p2, Lsw1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    return-object p2
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Leh4;->e:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Leh4;->d:Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :cond_0
    iget-object v0, p0, Lah4;->b:Loz1;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Loz1;->e(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final f(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lah4;->b:Loz1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Loz1;->f(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Leh4;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object p1, Leh4;->e:Ljava/lang/Object;

    .line 16
    .line 17
    :cond_0
    return-object p1
.end method
