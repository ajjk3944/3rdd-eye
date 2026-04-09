.class Lpi/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

.field private final b:Lpi/Y;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lpi/Y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/X;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    iput-object p2, p0, Lpi/X;->b:Lpi/Y;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpi/X;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    iget-object v1, p0, Lpi/X;->b:Lpi/Y;

    invoke-static {v0, v1}, Lpi/Y;->T0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lpi/Y;)Lpi/S;

    move-result-object v0

    return-object v0
.end method
