.class Lkotlin/reflect/jvm/internal/impl/types/checker/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/types/checker/n;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/types/checker/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/j;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/j;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/n;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/n;->h(Lkotlin/reflect/jvm/internal/impl/types/checker/n;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
