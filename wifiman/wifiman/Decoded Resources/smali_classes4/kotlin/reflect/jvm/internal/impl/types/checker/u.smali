.class final Lkotlin/reflect/jvm/internal/impl/types/checker/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lpi/S;

.field private final b:Lkotlin/reflect/jvm/internal/impl/types/checker/u;


# direct methods
.method public constructor <init>(Lpi/S;Lkotlin/reflect/jvm/internal/impl/types/checker/u;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->a:Lpi/S;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/u;

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/reflect/jvm/internal/impl/types/checker/u;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/u;

    return-object v0
.end method

.method public final b()Lpi/S;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/u;->a:Lpi/S;

    return-object v0
.end method
