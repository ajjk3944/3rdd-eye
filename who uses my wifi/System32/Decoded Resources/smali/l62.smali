.class public final Ll62;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lmm2;

.field public b:Ln70;


# direct methods
.method public constructor <init>(Lmm2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll62;->a:Lmm2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll62;->b:Ln70;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lpd2;

    .line 6
    .line 7
    invoke-direct {v0}, Lpd2;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll62;->b:Ln70;

    .line 11
    .line 12
    iget-object v1, p0, Ll62;->a:Lmm2;

    .line 13
    .line 14
    invoke-virtual {v1}, Lmm2;->c()Lx52;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lf20;

    .line 19
    .line 20
    const/16 v3, 0xf

    .line 21
    .line 22
    invoke-direct {v2, v3, v0}, Lf20;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lv42;

    .line 26
    .line 27
    invoke-direct {v3, v0}, Lv42;-><init>(Lpd2;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Le6;->t(Ltd2;Lrd2;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
