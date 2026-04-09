.class public LY/d;
.super LZg/f;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/d$a;
    }
.end annotation


# static fields
.field public static final d:LY/d$a;

.field public static final e:I

.field private static final f:LY/d;


# instance fields
.field private final b:LY/t;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LY/d;->d:LY/d$a;

    const/16 v0, 0x8

    sput v0, LY/d;->e:I

    new-instance v0, LY/d;

    sget-object v1, LY/t;->e:LY/t$a;

    invoke-virtual {v1}, LY/t$a;->a()LY/t;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LY/d;-><init>(LY/t;I)V

    sput-object v0, LY/d;->f:LY/d;

    return-void
.end method

.method public constructor <init>(LY/t;I)V
    .locals 0

    invoke-direct {p0}, LZg/f;-><init>()V

    iput-object p1, p0, LY/d;->b:LY/t;

    iput p2, p0, LY/d;->c:I

    return-void
.end method

.method public static final synthetic p()LY/d;
    .locals 1

    sget-object v0, LY/d;->f:LY/d;

    return-object v0
.end method

.method private final q()LW/d;
    .locals 1

    new-instance v0, LY/n;

    invoke-direct {v0, p0}, LY/n;-><init>(LY/d;)V

    return-object v0
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, LY/d;->b:LY/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, LY/t;->k(ILjava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public final f()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, LY/d;->q()LW/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, LY/d;->r()LW/d;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LY/d;->b:LY/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, LY/t;->o(ILjava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()I
    .locals 1

    iget v0, p0, LY/d;->c:I

    return v0
.end method

.method public bridge synthetic i()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LY/d;->t()LW/b;

    move-result-object v0

    return-object v0
.end method

.method public r()LW/d;
    .locals 1

    new-instance v0, LY/p;

    invoke-direct {v0, p0}, LY/p;-><init>(LY/d;)V

    return-object v0
.end method

.method public final s()LY/t;
    .locals 1

    iget-object v0, p0, LY/d;->b:LY/t;

    return-object v0
.end method

.method public t()LW/b;
    .locals 1

    new-instance v0, LY/r;

    invoke-direct {v0, p0}, LY/r;-><init>(LY/d;)V

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/Object;)LY/d;
    .locals 3

    iget-object v0, p0, LY/d;->b:LY/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, p2, v1}, LY/t;->P(ILjava/lang/Object;Ljava/lang/Object;I)LY/t$b;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance p2, LY/d;

    invoke-virtual {p1}, LY/t$b;->a()LY/t;

    move-result-object v0

    invoke-virtual {p0}, LZg/f;->size()I

    move-result v1

    invoke-virtual {p1}, LY/t$b;->b()I

    move-result p1

    add-int/2addr v1, p1

    invoke-direct {p2, v0, v1}, LY/d;-><init>(LY/t;I)V

    return-object p2
.end method

.method public v(Ljava/lang/Object;)LY/d;
    .locals 3

    iget-object v0, p0, LY/d;->b:LY/t;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1}, LY/t;->Q(ILjava/lang/Object;I)LY/t;

    move-result-object p1

    iget-object v0, p0, LY/d;->b:LY/t;

    if-ne v0, p1, :cond_1

    return-object p0

    :cond_1
    if-nez p1, :cond_2

    sget-object p1, LY/d;->d:LY/d$a;

    invoke-virtual {p1}, LY/d$a;->a()LY/d;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, LY/d;

    invoke-virtual {p0}, LZg/f;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-direct {v0, p1, v1}, LY/d;-><init>(LY/t;I)V

    return-object v0
.end method
