.class Lpi/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lpi/Q;


# direct methods
.method public constructor <init>(Lpi/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/P;->a:Lpi/Q;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi/P;->a:Lpi/Q;

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-static {v0, p1}, Lpi/Q;->h(Lpi/Q;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
