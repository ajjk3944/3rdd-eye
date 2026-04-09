.class public final La71;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ld71;


# instance fields
.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:Lsq0;


# direct methods
.method public constructor <init>(ZZZLsq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La71;->f:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La71;->g:Z

    .line 7
    .line 8
    iput-boolean p3, p0, La71;->h:Z

    .line 9
    .line 10
    iput-object p4, p0, La71;->i:Lsq0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final i(Landroid/view/View;Lo91;Le71;)Lo91;
    .locals 4

    .line 1
    iget-boolean v0, p0, La71;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p3, Le71;->d:I

    .line 6
    .line 7
    invoke-virtual {p2}, Lo91;->a()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    iput v1, p3, Le71;->d:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x0

    .line 23
    :goto_0
    iget-boolean v0, p0, La71;->g:Z

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget v0, p3, Le71;->c:I

    .line 30
    .line 31
    invoke-virtual {p2}, Lo91;->b()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v0

    .line 36
    iput v2, p3, Le71;->c:I

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget v0, p3, Le71;->a:I

    .line 40
    .line 41
    invoke-virtual {p2}, Lo91;->b()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/2addr v2, v0

    .line 46
    iput v2, p3, Le71;->a:I

    .line 47
    .line 48
    :cond_3
    :goto_1
    iget-boolean v0, p0, La71;->h:Z

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    iget v0, p3, Le71;->a:I

    .line 55
    .line 56
    invoke-virtual {p2}, Lo91;->c()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    iput v1, p3, Le71;->a:I

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    iget v0, p3, Le71;->c:I

    .line 65
    .line 66
    invoke-virtual {p2}, Lo91;->c()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v1, v0

    .line 71
    iput v1, p3, Le71;->c:I

    .line 72
    .line 73
    :cond_5
    :goto_2
    iget v0, p3, Le71;->a:I

    .line 74
    .line 75
    iget v1, p3, Le71;->b:I

    .line 76
    .line 77
    iget v2, p3, Le71;->c:I

    .line 78
    .line 79
    iget v3, p3, Le71;->d:I

    .line 80
    .line 81
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, La71;->i:Lsq0;

    .line 85
    .line 86
    invoke-virtual {v0, p1, p2, p3}, Lsq0;->i(Landroid/view/View;Lo91;Le71;)Lo91;

    .line 87
    .line 88
    .line 89
    return-object p2
.end method
