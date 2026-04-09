.class public abstract Lyl;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lxl;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxl;

    .line 2
    .line 3
    const-string v1, "DClass"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    const-string v1, "CLASS"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lue0;->g(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyl;->a:Lxl;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    const-string v2, "IN"

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "CH"

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    const-string v1, "CHAOS"

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lue0;->c(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    const-string v1, "HS"

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    const-string v1, "HESIOD"

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lue0;->c(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const/16 v1, 0xfe

    .line 45
    .line 46
    const-string v2, "NONE"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    const/16 v1, 0xff

    .line 52
    .line 53
    const-string v2, "ANY"

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static a(I)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    const v0, 0xffff

    .line 4
    .line 5
    .line 6
    if-gt p0, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ll30;

    .line 10
    .line 11
    const-string v1, "Invalid DNS class: "

    .line 12
    .line 13
    invoke-static {v1, p0}, Lex0;->f(Ljava/lang/String;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method
