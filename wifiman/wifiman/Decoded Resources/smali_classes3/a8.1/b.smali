.class public final La8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/b$a;,
        La8/b$b;
    }
.end annotation


# static fields
.field public static final c:La8/b$a;


# instance fields
.field private final a:[B

.field private final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La8/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La8/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La8/b;->c:La8/b$a;

    return-void
.end method

.method public constructor <init>(Lh9/a;)V
    .locals 1

    const-string/jumbo v0, "hwAddr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lh9/a;->g()[B

    move-result-object p1

    invoke-direct {p0, p1}, La8/b;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x0

    const-string/jumbo v2, "macBytes"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    array-length v2, p1

    const/4 v3, 0x6

    if-ne v2, v3, :cond_0

    .line 3
    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    const-string/jumbo v2, "copyOf(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La8/b;->a:[B

    .line 4
    aget-byte v2, p1, v1

    const-string/jumbo v3, "FC"

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lkotlin/text/M;->b(Ljava/lang/String;I)B

    move-result v3

    and-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    .line 5
    aget-byte v2, p1, v0

    const-string v3, "0F"

    invoke-static {v3, v4}, Lkotlin/text/M;->b(Ljava/lang/String;I)B

    move-result v3

    and-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p1, v0

    .line 6
    new-instance v2, La8/b$b$b;

    invoke-direct {v2, p1}, La8/b$b$b;-><init>([B)V

    .line 7
    new-instance v3, La8/b$b$a;

    invoke-direct {v3, p1}, La8/b$b$a;-><init>([B)V

    .line 8
    new-instance v4, La8/b$b$c;

    invoke-direct {v4, p1}, La8/b$b$c;-><init>([B)V

    new-array p1, v0, [La8/b$b;

    aput-object v2, p1, v1

    const/4 v0, 0x1

    aput-object v3, p1, v0

    const/4 v0, 0x2

    aput-object v4, p1, v0

    .line 9
    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, La8/b;->b:Ljava/util/List;

    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    array-length p1, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "invalid device id bytes size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic a(La8/b;)[B
    .locals 0

    iget-object p0, p0, La8/b;->a:[B

    return-object p0
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La8/b;->b:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La8/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, La8/b;->b:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, LZg/v;->m(Ljava/util/Collection;)Lsh/i;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v3, v1

    check-cast v3, LZg/Q;

    invoke-virtual {v3}, LZg/Q;->d()I

    move-result v3

    iget-object v4, p0, La8/b;->b:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, p1

    check-cast v5, La8/b;

    iget-object v5, v5, La8/b;->b:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, La8/b;->a:[B

    const/4 v1, 0x1

    aget-byte v1, v0, v1

    mul-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x2

    aget-byte v0, v0, v2

    add-int/2addr v1, v0

    return v1
.end method
