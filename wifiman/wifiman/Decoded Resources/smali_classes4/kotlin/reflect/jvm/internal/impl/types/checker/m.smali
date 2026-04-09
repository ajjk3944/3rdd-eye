.class Lkotlin/reflect/jvm/internal/impl/types/checker/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

.field private final b:Lkotlin/reflect/jvm/internal/impl/types/checker/g;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/m;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/m;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/m;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/m;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/checker/n;->k(Lkotlin/reflect/jvm/internal/impl/types/checker/n;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
