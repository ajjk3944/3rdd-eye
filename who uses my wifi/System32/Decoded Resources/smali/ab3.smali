.class public final synthetic Lab3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:Lg4;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lg4;IJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lab3;->a:Lg4;

    .line 5
    .line 6
    iput p2, p0, Lab3;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Lab3;->c:J

    .line 9
    .line 10
    iput-object p5, p0, Lab3;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 7

    .line 1
    check-cast p1, Leg4;

    .line 2
    .line 3
    sget-object v0, Leg4;->h:Leg4;

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object p1, p0, Lab3;->a:Lg4;

    .line 13
    .line 14
    iget-object v0, p1, Lg4;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcd4;

    .line 17
    .line 18
    iget v1, v0, Lcd4;->b:I

    .line 19
    .line 20
    int-to-long v1, v1

    .line 21
    iget v3, p0, Lab3;->b:I

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-eq v3, v4, :cond_1

    .line 25
    .line 26
    iget-wide v1, p0, Lab3;->c:J

    .line 27
    .line 28
    long-to-double v1, v1

    .line 29
    iget-wide v5, v0, Lcd4;->c:D

    .line 30
    .line 31
    mul-double/2addr v5, v1

    .line 32
    double-to-long v1, v5

    .line 33
    :cond_1
    add-int/2addr v3, v4

    .line 34
    iget-object v0, p0, Lab3;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, v3, v1, v2, v0}, Lg4;->n(IJLjava/lang/String;)Ln70;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method
