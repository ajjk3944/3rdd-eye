.class public final Lyr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final h:Lyr2;


# instance fields
.field public final a:Lr22;

.field public final b:Lq22;

.field public final c:Lz22;

.field public final d:Lx22;

.field public final e:Lj52;

.field public final f:Lbw0;

.field public final g:Lbw0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luk1;

    .line 2
    .line 3
    invoke-direct {v0}, Luk1;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lyr2;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lyr2;-><init>(Luk1;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lyr2;->h:Lyr2;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Luk1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Luk1;->f:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lr22;

    .line 7
    .line 8
    iput-object v0, p0, Lyr2;->a:Lr22;

    .line 9
    .line 10
    iget-object v0, p1, Luk1;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lq22;

    .line 13
    .line 14
    iput-object v0, p0, Lyr2;->b:Lq22;

    .line 15
    .line 16
    iget-object v0, p1, Luk1;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lz22;

    .line 19
    .line 20
    iput-object v0, p0, Lyr2;->c:Lz22;

    .line 21
    .line 22
    new-instance v0, Lbw0;

    .line 23
    .line 24
    iget-object v1, p1, Luk1;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lbw0;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Lbw0;-><init>(Lbw0;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lyr2;->f:Lbw0;

    .line 32
    .line 33
    new-instance v0, Lbw0;

    .line 34
    .line 35
    iget-object v1, p1, Luk1;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lbw0;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Lbw0;-><init>(Lbw0;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lyr2;->g:Lbw0;

    .line 43
    .line 44
    iget-object v0, p1, Luk1;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lx22;

    .line 47
    .line 48
    iput-object v0, p0, Lyr2;->d:Lx22;

    .line 49
    .line 50
    iget-object p1, p1, Luk1;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lj52;

    .line 53
    .line 54
    iput-object p1, p0, Lyr2;->e:Lj52;

    .line 55
    .line 56
    return-void
.end method
