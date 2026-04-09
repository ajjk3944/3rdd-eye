.class public final Lli/f;
.super Lli/a;
.source "SourceFile"

# interfaces
.implements Lli/e;


# instance fields
.field private final b:Lli/g;


# direct methods
.method public constructor <init>(LBh/G;LBh/L;Lki/a;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3}, Lli/a;-><init>(Lki/a;)V

    new-instance p3, Lli/g;

    invoke-direct {p3, p1, p2}, Lli/g;-><init>(LBh/G;LBh/L;)V

    iput-object p3, p0, Lli/f;->b:Lli/g;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lli/N;LUh/n;Lpi/S;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lli/f;->o(Lli/N;LUh/n;Lpi/S;)Ldi/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lli/N;LUh/n;Lpi/S;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lli/f;->p(Lli/N;LUh/n;Lpi/S;)Ldi/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(LUh/b;LWh/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lli/f;->n(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p1

    return-object p1
.end method

.method public n(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/f;->b:Lli/g;

    invoke-virtual {v0, p1, p2}, Lli/g;->a(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p1

    return-object p1
.end method

.method public o(Lli/N;LUh/n;Lpi/S;)Ldi/g;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "proto"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "expectedType"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public p(Lli/N;LUh/n;Lpi/S;)Ldi/g;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lli/a;->m()Lki/a;

    move-result-object v0

    invoke-virtual {v0}, Lki/a;->b()Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    move-result-object v0

    invoke-static {p2, v0}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LUh/b$b$c;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lli/f;->b:Lli/g;

    invoke-virtual {p1}, Lli/N;->b()LWh/c;

    move-result-object p1

    invoke-virtual {v0, p3, p2, p1}, Lli/g;->f(Lpi/S;LUh/b$b$c;LWh/c;)Ldi/g;

    move-result-object p1

    return-object p1
.end method
