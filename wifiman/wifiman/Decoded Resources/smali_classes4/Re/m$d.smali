.class public final LRe/m$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/c$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRe/m;->i(LT/l;I)Lz/c$m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LY0/d;I[I[I)V
    .locals 6

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sizes"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "outPositions"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p3

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    if-ge v0, p1, :cond_1

    aget v3, p3, v0

    add-int/lit8 v4, v1, 0x1

    invoke-static {p3}, LZg/n;->e0([I)I

    move-result v5

    if-ne v1, v5, :cond_0

    sub-int v3, p2, v3

    aput v3, p4, v1

    goto :goto_1

    :cond_0
    aput v2, p4, v1

    add-int/2addr v2, v3

    :goto_1
    add-int/lit8 v0, v0, 0x1

    move v1, v4

    goto :goto_0

    :cond_1
    return-void
.end method
