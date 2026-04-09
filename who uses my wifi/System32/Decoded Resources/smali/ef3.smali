.class public final Lef3;
.super Lqj;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public i:Ltf0;

.field public j:J

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lmu2;

.field public m:I

.field public n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lmu2;Lqj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lef3;->l:Lmu2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lqj;-><init>(Loj;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lef3;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lef3;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lef3;->m:I

    .line 9
    .line 10
    iget-object p1, p0, Lef3;->l:Lmu2;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lmu2;->h(Ljava/lang/String;Lqj;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
