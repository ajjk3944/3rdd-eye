.class public abstract Lcd/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lcd/a;Lcd/a$b;Ljava/lang/Integer;IJJLandroid/net/Network;ILjava/lang/Object;)Lgg/i;
    .locals 8

    if-nez p10, :cond_5

    and-int/lit8 v0, p9, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v2, p9, 0x4

    if-eqz v2, :cond_1

    const/16 v2, 0x38

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    and-int/lit8 v3, p9, 0x8

    const-wide/16 v4, 0x3e8

    if-eqz v3, :cond_2

    move-wide v6, v4

    goto :goto_2

    :cond_2
    move-wide v6, p4

    :goto_2
    and-int/lit8 v3, p9, 0x10

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    move-wide v4, p6

    :goto_3
    and-int/lit8 v3, p9, 0x20

    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v1, p8

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move p5, v2

    move-wide p6, v6

    move-wide/from16 p8, v4

    move-object/from16 p10, v1

    invoke-interface/range {p2 .. p10}, Lcd/a;->a(Lcd/a$b;Ljava/lang/Integer;IJJLandroid/net/Network;)Lgg/i;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: ping"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
