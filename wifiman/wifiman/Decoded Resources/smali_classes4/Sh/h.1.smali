.class public final LSh/h;
.super LSh/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/h$a;
    }
.end annotation


# instance fields
.field private final d:LBh/G;

.field private final e:LBh/L;

.field private final f:Lli/g;

.field private g:LYh/e;


# direct methods
.method public constructor <init>(LBh/G;LBh/L;Loi/n;LSh/v;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4}, LSh/d;-><init>(Loi/n;LSh/v;)V

    iput-object p1, p0, LSh/h;->d:LBh/G;

    iput-object p2, p0, LSh/h;->e:LBh/L;

    new-instance p3, Lli/g;

    invoke-direct {p3, p1, p2}, Lli/g;-><init>(LBh/G;LBh/L;)V

    iput-object p3, p0, LSh/h;->f:Lli/g;

    sget-object p1, LYh/e;->i:LYh/e;

    iput-object p1, p0, LSh/h;->g:LYh/e;

    return-void
.end method

.method public static final synthetic N(LSh/h;LZh/f;Ljava/lang/Object;)Ldi/g;
    .locals 0

    invoke-direct {p0, p1, p2}, LSh/h;->O(LZh/f;Ljava/lang/Object;)Ldi/g;

    move-result-object p0

    return-object p0
.end method

.method private final O(LZh/f;Ljava/lang/Object;)Ldi/g;
    .locals 2

    sget-object v0, Ldi/i;->a:Ldi/i;

    iget-object v1, p0, LSh/h;->d:LBh/G;

    invoke-virtual {v0, p2, v1}, Ldi/i;->e(Ljava/lang/Object;LBh/G;)Ldi/g;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p2, Ldi/l;->b:Ldi/l$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported annotation argument: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ldi/l$a;->a(Ljava/lang/String;)Ldi/l;

    move-result-object p2

    :cond_0
    return-object p2
.end method

.method private final R(LZh/b;)LBh/e;
    .locals 2

    iget-object v0, p0, LSh/h;->d:LBh/G;

    iget-object v1, p0, LSh/h;->e:LBh/L;

    invoke-static {v0, p1, v1}, LBh/y;->d(LBh/G;LZh/b;LBh/L;)LBh/e;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic I(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LSh/h;->Q(Ljava/lang/String;Ljava/lang/Object;)Ldi/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic M(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/g;

    invoke-virtual {p0, p1}, LSh/h;->T(Ldi/g;)Ldi/g;

    move-result-object p1

    return-object p1
.end method

.method public P(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LSh/h;->f:Lli/g;

    invoke-virtual {v0, p1, p2}, Lli/g;->a(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p1

    return-object p1
.end method

.method protected Q(Ljava/lang/String;Ljava/lang/Object;)Ldi/g;
    .locals 4

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "ZBCS"

    const/4 v3, 0x0

    invoke-static {v2, p1, v3, v0, v1}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x42

    if-eq v0, v1, :cond_3

    const/16 v1, 0x43

    if-eq v0, v1, :cond_2

    const/16 v1, 0x53

    if-eq v0, v1, :cond_1

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_4

    const-string v0, "Z"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p2, :cond_0

    const/4 v3, 0x1

    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    goto :goto_0

    :cond_1
    const-string v0, "S"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    int-to-short p1, p2

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    goto :goto_0

    :cond_2
    const-string v0, "C"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    int-to-char p1, p2

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    goto :goto_0

    :cond_3
    const-string v0, "B"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    int-to-byte p1, p2

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    goto :goto_0

    :cond_4
    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_5
    :goto_0
    sget-object p1, Ldi/i;->a:Ldi/i;

    iget-object v0, p0, LSh/h;->d:LBh/G;

    invoke-virtual {p1, p2, v0}, Ldi/i;->e(Ljava/lang/Object;LBh/G;)Ldi/g;

    move-result-object p1

    return-object p1
.end method

.method public S(LYh/e;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LSh/h;->g:LYh/e;

    return-void
.end method

.method protected T(Ldi/g;)Ldi/g;
    .locals 3

    const-string v0, "constant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ldi/d;

    if-eqz v0, :cond_0

    new-instance v0, Ldi/A;

    check-cast p1, Ldi/d;

    invoke-virtual {p1}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    invoke-direct {v0, p1}, Ldi/A;-><init>(B)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Ldi/w;

    if-eqz v0, :cond_1

    new-instance v0, Ldi/D;

    check-cast p1, Ldi/w;

    invoke-virtual {p1}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    invoke-direct {v0, p1}, Ldi/D;-><init>(S)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ldi/n;

    if-eqz v0, :cond_2

    new-instance v0, Ldi/B;

    check-cast p1, Ldi/n;

    invoke-virtual {p1}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p1}, Ldi/B;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ldi/t;

    if-eqz v0, :cond_3

    new-instance v0, Ldi/C;

    check-cast p1, Ldi/t;

    invoke-virtual {p1}, Ldi/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ldi/C;-><init>(J)V

    goto :goto_0

    :cond_3
    :goto_1
    return-object p1
.end method

.method public bridge synthetic l(LUh/b;LWh/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LSh/h;->P(LUh/b;LWh/c;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    move-result-object p1

    return-object p1
.end method

.method public u()LYh/e;
    .locals 1

    iget-object v0, p0, LSh/h;->g:LYh/e;

    return-object v0
.end method

.method protected x(LZh/b;LBh/g0;Ljava/util/List;)LSh/x$a;
    .locals 7

    const-string v0, "annotationClassId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LSh/h;->R(LZh/b;)LBh/e;

    move-result-object v3

    new-instance v0, LSh/h$b;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p3

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, LSh/h$b;-><init>(LSh/h;LBh/e;LZh/b;Ljava/util/List;LBh/g0;)V

    return-object v0
.end method
