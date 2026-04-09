.class public final Lz/z;
.super Lz/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/z$a;
    }
.end annotation


# static fields
.field public static final f:Lz/z$a;

.field private static final g:Lz/z;

.field private static final h:Lz/z;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lz/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz/z;->f:Lz/z$a;

    new-instance v0, Lz/z;

    sget-object v3, Lz/u$a;->Visible:Lz/u$a;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lz/z;-><init>(Lz/u$a;IILmh/l;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz/z;->g:Lz/z;

    new-instance v0, Lz/z;

    sget-object v11, Lz/u$a;->Clip:Lz/u$a;

    const/16 v16, 0x1e

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v17}, Lz/z;-><init>(Lz/u$a;IILmh/l;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz/z;->h:Lz/z;

    return-void
.end method

.method private constructor <init>(Lz/u$a;IILmh/l;Lmh/l;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v6}, Lz/u;-><init>(Lz/u$a;IILmh/l;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method synthetic constructor <init>(Lz/u$a;IILmh/l;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v5, p3

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move-object v6, p3

    goto :goto_3

    :cond_3
    move-object v6, p5

    :goto_3
    move-object v1, p0

    move-object v2, p1

    .line 1
    invoke-direct/range {v1 .. v6}, Lz/z;-><init>(Lz/u$a;IILmh/l;Lmh/l;)V

    return-void
.end method

.method public static final synthetic c()Lz/z;
    .locals 1

    sget-object v0, Lz/z;->h:Lz/z;

    return-object v0
.end method
