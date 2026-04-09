.class public final Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/i;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public P(LZh/c;)Z
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$b;->b(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/c;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/i;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/i;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public l(LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h$b;->a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LZh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/i;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
