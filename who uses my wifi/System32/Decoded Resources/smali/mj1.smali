.class public final Lmj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lqj1;

.field public final b:Ltj1;

.field public final c:Ljg1;

.field public final d:Lkg1;

.field public e:I

.field public f:Lph4;


# direct methods
.method public constructor <init>(Lqj1;Ltj1;Ljg1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmj1;->a:Lqj1;

    .line 5
    .line 6
    iput-object p2, p0, Lmj1;->b:Ltj1;

    .line 7
    .line 8
    iput-object p3, p0, Lmj1;->c:Ljg1;

    .line 9
    .line 10
    iget-object p1, p1, Lqj1;->g:Lph4;

    .line 11
    .line 12
    iget-object p1, p1, Lph4;->m:Ljava/lang/String;

    .line 13
    .line 14
    const-string p2, "audio/true-hd"

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p1, Lkg1;

    .line 23
    .line 24
    invoke-direct {p1}, Lkg1;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iput-object p1, p0, Lmj1;->d:Lkg1;

    .line 30
    .line 31
    return-void
.end method
