.class public final Ldi/k;
.super Ldi/g;
.source "SourceFile"


# instance fields
.field private final b:LZh/b;

.field private final c:LZh/f;


# direct methods
.method public constructor <init>(LZh/b;LZh/f;)V
    .locals 1

    const-string v0, "enumClassId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumEntryName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-direct {p0, v0}, Ldi/g;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ldi/k;->b:LZh/b;

    iput-object p2, p0, Ldi/k;->c:LZh/f;

    return-void
.end method


# virtual methods
.method public a(LBh/G;)Lpi/S;
    .locals 2

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldi/k;->b:LZh/b;

    invoke-static {p1, v0}, LBh/y;->b(LBh/G;LZh/b;)LBh/e;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lbi/i;->A(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, LBh/e;->u()Lpi/d0;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->ERROR_ENUM_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    iget-object v0, p0, Ldi/k;->b:LZh/b;

    invoke-virtual {v0}, LZh/b;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ldi/k;->c:LZh/f;

    invoke-virtual {v1}, LZh/f;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final c()LZh/f;
    .locals 1

    iget-object v0, p0, Ldi/k;->c:LZh/f;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ldi/k;->b:LZh/b;

    invoke-virtual {v1}, LZh/b;->h()LZh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldi/k;->c:LZh/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
