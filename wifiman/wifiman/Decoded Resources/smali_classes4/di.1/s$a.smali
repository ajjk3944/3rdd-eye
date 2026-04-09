.class public final Ldi/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldi/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldi/s$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpi/S;)Ldi/g;
    .locals 5

    const-string v0, "argumentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpi/W;->a(Lpi/S;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    move-object v2, p1

    move v3, v0

    :goto_0
    invoke-static {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c0(Lpi/S;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lpi/S;->L0()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpi/B0;

    invoke-interface {v2}, Lpi/B0;->getType()Lpi/S;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lpi/S;->N0()Lpi/v0;

    move-result-object v2

    invoke-interface {v2}, Lpi/v0;->c()LBh/h;

    move-result-object v2

    instance-of v4, v2, LBh/e;

    if-eqz v4, :cond_3

    invoke-static {v2}, Lfi/e;->n(LBh/h;)LZh/b;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ldi/s;

    new-instance v1, Ldi/s$b$a;

    invoke-direct {v1, p1}, Ldi/s$b$a;-><init>(Lpi/S;)V

    invoke-direct {v0, v1}, Ldi/s;-><init>(Ldi/s$b;)V

    return-object v0

    :cond_2
    new-instance v1, Ldi/s;

    invoke-direct {v1, v0, v3}, Ldi/s;-><init>(LZh/b;I)V

    goto :goto_1

    :cond_3
    instance-of p1, v2, LBh/l0;

    if-eqz p1, :cond_4

    new-instance v1, Ldi/s;

    sget-object p1, LZh/b;->d:LZh/b$a;

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->b:LZh/d;

    invoke-virtual {v2}, LZh/d;->l()LZh/c;

    move-result-object v2

    const-string v3, "toSafe(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ldi/s;-><init>(LZh/b;I)V

    :cond_4
    :goto_1
    return-object v1
.end method
