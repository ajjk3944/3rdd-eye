.class public abstract Lz/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/u$a;,
        Lz/u$b;
    }
.end annotation


# instance fields
.field private final a:Lz/u$a;

.field private final b:I

.field private final c:I

.field private final d:Lmh/l;

.field private final e:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lz/u$a;IILmh/l;Lmh/l;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lz/u;->a:Lz/u$a;

    .line 4
    iput p2, p0, Lz/u;->b:I

    .line 5
    iput p3, p0, Lz/u;->c:I

    .line 6
    iput-object p4, p0, Lz/u;->d:Lmh/l;

    .line 7
    iput-object p5, p0, Lz/u;->e:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(Lz/u$a;IILmh/l;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lz/u;-><init>(Lz/u$a;IILmh/l;Lmh/l;)V

    return-void
.end method


# virtual methods
.method public final a(Lz/v;Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lz/u;->d:Lmh/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmh/p;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lz/u;->e:Lmh/l;

    if-eqz v2, :cond_1

    invoke-interface {v2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lmh/p;

    :cond_1
    iget-object p1, p0, Lz/u;->a:Lz/u$a;

    sget-object v2, Lz/u$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_4

    const/4 v2, 0x2

    if-eq p1, v2, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    if-eqz v1, :cond_5

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_1
    return-void
.end method

.method public final b()Lz/v;
    .locals 4

    new-instance v0, Lz/v;

    iget-object v1, p0, Lz/u;->a:Lz/u$a;

    iget v2, p0, Lz/u;->b:I

    iget v3, p0, Lz/u;->c:I

    invoke-direct {v0, v1, v2, v3}, Lz/v;-><init>(Lz/u$a;II)V

    return-object v0
.end method
