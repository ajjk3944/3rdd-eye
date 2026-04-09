.class public final LZh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:LZh/f;

.field private static final f:Ljava/util/regex/Pattern;

.field private static final g:Lmh/l;


# instance fields
.field private final a:Ljava/lang/String;

.field private transient b:LZh/c;

.field private transient c:LZh/d;

.field private transient d:LZh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "<root>"

    invoke-static {v0}, LZh/f;->n(Ljava/lang/String;)LZh/f;

    move-result-object v0

    sput-object v0, LZh/d;->e:LZh/f;

    const-string v0, "\\."

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, LZh/d;->f:Ljava/util/regex/Pattern;

    new-instance v0, LZh/d$a;

    invoke-direct {v0}, LZh/d$a;-><init>()V

    sput-object v0, LZh/d;->g:Lmh/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LZh/d;->a(I)V

    .line 4
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LZh/d;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;LZh/c;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LZh/d;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LZh/d;->a(I)V

    .line 1
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LZh/d;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, LZh/d;->b:LZh/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;LZh/d;LZh/f;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, LZh/d;->a(I)V

    .line 6
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LZh/d;->a:Ljava/lang/String;

    .line 8
    iput-object p2, p0, LZh/d;->c:LZh/d;

    .line 9
    iput-object p3, p0, LZh/d;->d:LZh/f;

    return-void
.end method

.method private static synthetic a(I)V
    .locals 8

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    :pswitch_2
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_3
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe"

    const-string v4, "shortName"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq p0, v6, :cond_0

    packed-switch p0, :pswitch_data_2

    const-string v7, "fqName"

    aput-object v7, v2, v5

    goto :goto_2

    :pswitch_4
    aput-object v4, v2, v5

    goto :goto_2

    :pswitch_5
    const-string v7, "other"

    aput-object v7, v2, v5

    goto :goto_2

    :pswitch_6
    const-string v7, "segment"

    aput-object v7, v2, v5

    goto :goto_2

    :pswitch_7
    const-string v7, "name"

    aput-object v7, v2, v5

    goto :goto_2

    :pswitch_8
    aput-object v3, v2, v5

    goto :goto_2

    :cond_0
    const-string v7, "safe"

    aput-object v7, v2, v5

    :goto_2
    packed-switch p0, :pswitch_data_3

    :pswitch_9
    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_a
    const-string v3, "toString"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_b
    const-string v3, "pathSegments"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_c
    const-string v3, "shortNameOrSpecial"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_d
    aput-object v4, v2, v6

    goto :goto_3

    :pswitch_e
    const-string v3, "parent"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_f
    const-string v3, "toSafe"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_10
    const-string v3, "asString"

    aput-object v3, v2, v6

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_11
    const-string v3, "topLevel"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_12
    const-string v3, "startsWith"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_13
    const-string v3, "child"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_14
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_16
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_8
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x4
        :pswitch_10
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_9
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x4
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_14
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x4
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_16
    .end packed-switch
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, LZh/d;->a:Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LZh/f;->g(Ljava/lang/String;)LZh/f;

    move-result-object v1

    iput-object v1, p0, LZh/d;->d:LZh/f;

    new-instance v1, LZh/d;

    iget-object v2, p0, LZh/d;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, LZh/d;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, LZh/d;->c:LZh/d;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    invoke-static {v0}, LZh/f;->g(Ljava/lang/String;)LZh/f;

    move-result-object v0

    iput-object v0, p0, LZh/d;->d:LZh/f;

    sget-object v0, LZh/c;->c:LZh/c;

    invoke-virtual {v0}, LZh/c;->j()LZh/d;

    move-result-object v0

    iput-object v0, p0, LZh/d;->c:LZh/d;

    :goto_0
    return-void
.end method

.method public static m(LZh/f;)LZh/d;
    .locals 3

    if-nez p0, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, LZh/d;->a(I)V

    :cond_0
    new-instance v0, LZh/d;

    invoke-virtual {p0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LZh/c;->c:LZh/c;

    invoke-virtual {v2}, LZh/c;->j()LZh/d;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0}, LZh/d;-><init>(Ljava/lang/String;LZh/d;LZh/f;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v1, 0x4

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_0
    return-object v0
.end method

.method public c(LZh/f;)LZh/d;
    .locals 2

    if-nez p1, :cond_0

    const/16 v0, 0x9

    invoke-static {v0}, LZh/d;->a(I)V

    :cond_0
    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LZh/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, LZh/d;

    invoke-direct {v1, v0, p0, p1}, LZh/d;-><init>(Ljava/lang/String;LZh/d;LZh/f;)V

    return-object v1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LZh/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LZh/d;

    iget-object v1, p0, LZh/d;->a:Ljava/lang/String;

    iget-object p1, p1, LZh/d;->a:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, LZh/d;->b:LZh/c;

    if-nez v0, :cond_1

    invoke-virtual {p0}, LZh/d;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3c

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public g()LZh/d;
    .locals 2

    iget-object v0, p0, LZh/d;->c:LZh/d;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, LZh/d;->d()V

    iget-object v0, p0, LZh/d;->c:LZh/d;

    if-nez v0, :cond_2

    const/16 v1, 0x8

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_2
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "root"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, LZh/d;->f:Ljava/util/regex/Pattern;

    iget-object v1, p0, LZh/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    sget-object v1, LZh/d;->g:Lmh/l;

    invoke-static {v0, v1}, LZg/n;->N0([Ljava/lang/Object;Lmh/l;)Ljava/util/List;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0xe

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_1
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()LZh/f;
    .locals 2

    iget-object v0, p0, LZh/d;->d:LZh/f;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const/16 v1, 0xa

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, LZh/d;->d()V

    iget-object v0, p0, LZh/d;->d:LZh/f;

    if-nez v0, :cond_2

    const/16 v1, 0xb

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_2
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "root"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()LZh/f;
    .locals 2

    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LZh/d;->e:LZh/f;

    if-nez v0, :cond_0

    const/16 v1, 0xc

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, LZh/d;->i()LZh/f;

    move-result-object v0

    if-nez v0, :cond_2

    const/16 v1, 0xd

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_2
    return-object v0
.end method

.method public k(LZh/f;)Z
    .locals 3

    if-nez p1, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, LZh/d;->a(I)V

    :cond_0
    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    :cond_2
    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v0, v2, :cond_3

    iget-object v2, p0, LZh/d;->a:Ljava/lang/String;

    invoke-virtual {v2, v1, p1, v1, v0}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public l()LZh/c;
    .locals 2

    iget-object v0, p0, LZh/d;->b:LZh/c;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, LZh/c;

    invoke-direct {v0, p0}, LZh/c;-><init>(LZh/d;)V

    iput-object v0, p0, LZh/d;->b:LZh/c;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LZh/d;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LZh/d;->e:LZh/f;

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZh/d;->a:Ljava/lang/String;

    :goto_0
    if-nez v0, :cond_1

    const/16 v1, 0x12

    invoke-static {v1}, LZh/d;->a(I)V

    :cond_1
    return-object v0
.end method
