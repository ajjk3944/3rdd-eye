.class public abstract Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)LZh/c;
    .locals 2

    invoke-static {p0}, Lfi/e;->l(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)LBh/e;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->m(LBh/m;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lfi/e;->k(LBh/m;)LZh/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method
