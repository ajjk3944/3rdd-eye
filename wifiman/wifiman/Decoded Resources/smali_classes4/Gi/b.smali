.class public final LGi/b;
.super LZg/k;
.source "SourceFile"

# interfaces
.implements LCi/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGi/b$a;
    }
.end annotation


# static fields
.field public static final e:LGi/b$a;

.field private static final f:LGi/b;


# instance fields
.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;

.field private final d:LEi/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LGi/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LGi/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LGi/b;->e:LGi/b$a;

    new-instance v0, LGi/b;

    sget-object v1, LHi/c;->a:LHi/c;

    sget-object v2, LEi/d;->d:LEi/d$a;

    invoke-virtual {v2}, LEi/d$a;->a()LEi/d;

    move-result-object v2

    invoke-direct {v0, v1, v1, v2}, LGi/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEi/d;)V

    sput-object v0, LGi/b;->f:LGi/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;LEi/d;)V
    .locals 1

    const-string v0, "hashMap"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/k;-><init>()V

    iput-object p1, p0, LGi/b;->b:Ljava/lang/Object;

    iput-object p2, p0, LGi/b;->c:Ljava/lang/Object;

    iput-object p3, p0, LGi/b;->d:LEi/d;

    return-void
.end method

.method public static final synthetic v()LGi/b;
    .locals 1

    sget-object v0, LGi/b;->f:LGi/b;

    return-object v0
.end method


# virtual methods
.method public final C()LEi/d;
    .locals 1

    iget-object v0, p0, LGi/b;->d:LEi/d;

    return-object v0
.end method

.method public final J()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LGi/b;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public addAll(Ljava/util/Collection;)LCi/h;
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, LCi/h;->c()LCi/h$a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, LCi/h$a;->a()LCi/h;

    move-result-object p1

    return-object p1
.end method

.method public c()LCi/h$a;
    .locals 1

    new-instance v0, LGi/c;

    invoke-direct {v0, p0}, LGi/c;-><init>(LGi/b;)V

    return-object v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LGi/b;->d:LEi/d;

    invoke-virtual {v0, p1}, LEi/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LZg/b;->size()I

    move-result v0

    move-object v2, p1

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v0, v3, :cond_2

    return v1

    :cond_2
    instance-of v0, v2, LGi/b;

    if-eqz v0, :cond_3

    iget-object v0, p0, LGi/b;->d:LEi/d;

    invoke-virtual {v0}, LEi/d;->t()LEi/t;

    move-result-object v0

    check-cast p1, LGi/b;

    iget-object p1, p1, LGi/b;->d:LEi/d;

    invoke-virtual {p1}, LEi/d;->t()LEi/t;

    move-result-object p1

    sget-object v1, LGi/b$b;->a:LGi/b$b;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_3
    instance-of v0, v2, LGi/c;

    if-eqz v0, :cond_4

    iget-object v0, p0, LGi/b;->d:LEi/d;

    invoke-virtual {v0}, LEi/d;->t()LEi/t;

    move-result-object v0

    check-cast p1, LGi/c;

    invoke-virtual {p1}, LGi/c;->s()LEi/f;

    move-result-object p1

    invoke-virtual {p1}, LEi/f;->j()LEi/t;

    move-result-object p1

    sget-object v1, LGi/b$c;->a:LGi/b$c;

    invoke-virtual {v0, p1, v1}, LEi/t;->k(LEi/t;Lmh/p;)Z

    move-result p1

    goto :goto_0

    :cond_4
    invoke-super {p0, p1}, LZg/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, LZg/k;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LGi/d;

    iget-object v1, p0, LGi/b;->b:Ljava/lang/Object;

    iget-object v2, p0, LGi/b;->d:LEi/d;

    invoke-direct {v0, v1, v2}, LGi/d;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LGi/b;->d:LEi/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method

.method public final y()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LGi/b;->b:Ljava/lang/Object;

    return-object v0
.end method
