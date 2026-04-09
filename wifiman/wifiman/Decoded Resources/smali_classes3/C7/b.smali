.class public final LC7/b;
.super LA7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC7/b$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:LYg/m;

.field private final d:LYg/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LA7/a;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, LC7/b;->a:I

    const/4 v0, 0x3

    iput v0, p0, LC7/b;->b:I

    sget-object v0, LC7/b$b;->a:LC7/b$b;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LC7/b;->c:LYg/m;

    sget-object v0, LC7/b$c;->a:LC7/b$c;

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LC7/b;->d:LYg/m;

    return-void
.end method

.method private final i()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LC7/b;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final j()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LC7/b;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final k(I)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final l(I)Z
    .locals 1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, LC7/b;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, LC7/b;->a:I

    return v0
.end method

.method public e(Ljava/util/List;)Ls7/c;
    .locals 2

    const-string/jumbo v0, "extras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ls7/c;->c:Ls7/c$b;

    new-instance v1, LC7/b$d;

    invoke-direct {v1, p1}, LC7/b$d;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ls7/c$b;->a(Lmh/l;)Ls7/c;

    move-result-object p1

    return-object p1
.end method

.method public f(LA7/c;LA7/b;[B)Ls7/h;
    .locals 2

    const-string/jumbo v0, "packetHeader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "fieldHeader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LA7/c;->b()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, LC7/b;->j()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, LA7/b;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC7/b$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LC7/b$a;->a()Lmh/l;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls7/h;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException;

    invoke-virtual {p2}, LA7/b;->b()I

    move-result p2

    invoke-direct {p1, p2}, Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_1
    new-instance p2, Lcom/ubnt/discovery/server/lan/processing/InvalidPacketException;

    invoke-virtual {p1}, LA7/c;->b()I

    move-result p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "Parsing of "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " not implemented"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ubnt/discovery/server/lan/processing/InvalidPacketException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-direct {p0}, LC7/b;->i()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, LA7/b;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC7/b$a;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LC7/b$a;->a()Lmh/l;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls7/h;

    if-eqz p1, :cond_3

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException;

    invoke-virtual {p2}, LA7/b;->b()I

    move-result p2

    invoke-direct {p1, p2}, Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException;-><init>(I)V

    throw p1
.end method

.method public g([BII)LA7/b;
    .locals 2

    const-string/jumbo p3, "data"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aget-byte p3, p1, p2

    sget-object v0, Lv7/b;->a:Lv7/b;

    add-int/lit8 v1, p2, 0x1

    add-int/lit8 p2, p2, 0x3

    invoke-static {p1, v1, p2}, LZg/n;->r([BII)[B

    move-result-object p1

    sget-object p2, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {v0, p1, p2}, Lv7/b;->b([BLv7/a;)I

    move-result p1

    new-instance p2, LA7/b;

    invoke-direct {p2, p3, p1}, LA7/b;-><init>(II)V

    return-object p2
.end method

.method public h([BII)LA7/c;
    .locals 3

    const-string/jumbo p3, "data"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aget-byte p3, p1, p2

    add-int/lit8 v0, p2, 0x1

    aget-byte v0, p1, v0

    sget-object v1, Lv7/b;->a:Lv7/b;

    add-int/lit8 v2, p2, 0x2

    add-int/lit8 p2, p2, 0x4

    invoke-static {p1, v2, p2}, LZg/n;->r([BII)[B

    move-result-object p1

    sget-object p2, Lv7/a;->BIG_ENDIAN:Lv7/a;

    invoke-virtual {v1, p1, p2}, Lv7/b;->b([BLv7/a;)I

    move-result p1

    new-instance p2, LA7/c;

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    const/4 v1, 0x2

    if-eq p3, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, v0}, LC7/b;->l(I)Z

    move-result v0

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, LC7/b;->k(I)Z

    move-result v0

    :goto_0
    invoke-direct {p2, p3, v0, p1}, LA7/c;-><init>(IZI)V

    return-object p2
.end method
