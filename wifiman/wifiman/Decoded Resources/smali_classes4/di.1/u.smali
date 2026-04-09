.class public final Ldi/u;
.super Ldi/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldi/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LBh/G;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Ldi/u;->c(LBh/G;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method

.method public c(LBh/G;)Lpi/d0;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/G;->q()Lkotlin/reflect/jvm/internal/impl/builtins/i;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->J()Lpi/d0;

    move-result-object p1

    const-string v0, "getNullableNothingType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
