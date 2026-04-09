.class public final Lpi/i0;
.super Lpi/C0;
.source "SourceFile"


# instance fields
.field private final a:Lpi/S;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;)V
    .locals 1

    const-string v0, "kotlinBuiltIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/C0;-><init>()V

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->I()Lpi/d0;

    move-result-object p1

    const-string v0, "getNullableAnyType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpi/i0;->a:Lpi/S;

    return-void
.end method


# virtual methods
.method public a()Lpi/N0;
    .locals 1

    sget-object v0, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    return-object v0
.end method

.method public b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/B0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getType()Lpi/S;
    .locals 1

    iget-object v0, p0, Lpi/i0;->a:Lpi/S;

    return-object v0
.end method
