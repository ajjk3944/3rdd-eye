.class Lw4/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw4/r$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static final b:[B

.field private static final c:Lw4/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lw4/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lw4/r;->a:Ljava/util/logging/Logger;

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte v1, v0, v1

    sput-object v0, Lw4/r;->b:[B

    new-instance v0, Lw4/r;

    invoke-direct {v0}, Lw4/r;-><init>()V

    sput-object v0, Lw4/r;->c:Lw4/r;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic d()[B
    .locals 1

    sget-object v0, Lw4/r;->b:[B

    return-object v0
.end method

.method static synthetic e()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lw4/r;->a:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static f()V
    .locals 1

    sget-object v0, Lw4/r;->c:Lw4/r;

    invoke-static {v0}, Lo4/x;->n(Lo4/w;)V

    return-void
.end method

.method private g(Lo4/v;)V
    .locals 4

    invoke-virtual {p1}, Lo4/v;->c()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo4/v$c;

    invoke-virtual {v1}, Lo4/v$c;->c()Lo4/g;

    move-result-object v2

    instance-of v2, v2, Lw4/p;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lo4/v$c;->c()Lo4/g;

    move-result-object v2

    check-cast v2, Lw4/p;

    invoke-virtual {v1}, Lo4/v$c;->b()[B

    move-result-object v1

    invoke-static {v1}, LC4/a;->a([B)LC4/a;

    move-result-object v1

    invoke-virtual {v2}, Lw4/p;->a()LC4/a;

    move-result-object v3

    invoke-virtual {v1, v3}, LC4/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Mac Key with parameters "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lw4/p;->b()Lw4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " has wrong output prefix ("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lw4/p;->a()LC4/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") instead of ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    const-class v0, Lo4/t;

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1

    const-class v0, Lo4/t;

    return-object v0
.end method

.method public bridge synthetic c(Lo4/v;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lw4/r;->h(Lo4/v;)Lo4/t;

    move-result-object p1

    return-object p1
.end method

.method public h(Lo4/v;)Lo4/t;
    .locals 2

    invoke-direct {p0, p1}, Lw4/r;->g(Lo4/v;)V

    new-instance v0, Lw4/r$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lw4/r$b;-><init>(Lo4/v;Lw4/r$a;)V

    return-object v0
.end method
