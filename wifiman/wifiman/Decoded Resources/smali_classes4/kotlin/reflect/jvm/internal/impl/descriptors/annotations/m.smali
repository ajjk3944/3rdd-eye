.class Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LZh/c;


# direct methods
.method public constructor <init>(LZh/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/m;->a:LZh/c;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/m;->a:LZh/c;

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    invoke-static {v0, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/o;->b(LZh/c;Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p1

    return-object p1
.end method
