.class public final Lci2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm42;

.field public final c:Lth2;

.field public final d:Lci2;

.field public final e:Lba4;


# direct methods
.method public constructor <init>(Lth2;Landroid/content/Context;Lm42;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lci2;->d:Lci2;

    .line 5
    .line 6
    iput-object p1, p0, Lci2;->c:Lth2;

    .line 7
    .line 8
    iput-object p2, p0, Lci2;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p3, p0, Lci2;->b:Lm42;

    .line 11
    .line 12
    invoke-static {p0}, Lda4;->a(Ljava/lang/Object;)Lda4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p3}, Lda4;->a(Ljava/lang/Object;)Lda4;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    new-instance p3, Law2;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p3, p2, v0}, Law2;-><init>(Lda4;I)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Lrc2;

    .line 27
    .line 28
    const/16 v0, 0x15

    .line 29
    .line 30
    invoke-direct {p2, p1, p3, v0}, Lrc2;-><init>(Ljava/lang/Object;Lga4;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2}, Lba4;->a(Lga4;)Lba4;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lci2;->e:Lba4;

    .line 38
    .line 39
    return-void
.end method
