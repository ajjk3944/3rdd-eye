.class public final Lfl1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ldn3;

.field public static final f:Ldn3;

.field public static final g:Ldn3;

.field public static final h:Ldn3;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "\\s+"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lfl1;->d:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "auto"

    .line 10
    .line 11
    const-string v1, "none"

    .line 12
    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-static {v0, v1}, Ldn3;->m([Ljava/lang/Object;I)Ldn3;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lfl1;->e:Ldn3;

    .line 23
    .line 24
    const-string v0, "dot"

    .line 25
    .line 26
    const-string v2, "sesame"

    .line 27
    .line 28
    const-string v3, "circle"

    .line 29
    .line 30
    filled-new-array {v0, v2, v3}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-static {v0, v2}, Ldn3;->m([Ljava/lang/Object;I)Ldn3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lfl1;->f:Ldn3;

    .line 40
    .line 41
    const-string v0, "filled"

    .line 42
    .line 43
    const-string v3, "open"

    .line 44
    .line 45
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, v1}, Ldn3;->m([Ljava/lang/Object;I)Ldn3;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lfl1;->g:Ldn3;

    .line 54
    .line 55
    const-string v0, "before"

    .line 56
    .line 57
    const-string v1, "outside"

    .line 58
    .line 59
    const-string v3, "after"

    .line 60
    .line 61
    filled-new-array {v3, v0, v1}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0, v2}, Ldn3;->m([Ljava/lang/Object;I)Ldn3;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lfl1;->h:Ldn3;

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lfl1;->a:I

    .line 5
    .line 6
    iput p2, p0, Lfl1;->b:I

    .line 7
    .line 8
    iput p3, p0, Lfl1;->c:I

    .line 9
    .line 10
    return-void
.end method
