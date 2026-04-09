.class public Ldi/b;
.super Ldi/g;
.source "SourceFile"


# instance fields
.field private final b:Lmh/l;


# direct methods
.method public constructor <init>(Ljava/util/List;Lmh/l;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ldi/g;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Ldi/b;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public a(LBh/G;)Lpi/S;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldi/b;->b:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpi/S;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c0(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->q0(Lpi/S;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->D0(Lpi/S;)Z

    :cond_0
    return-object p1
.end method
