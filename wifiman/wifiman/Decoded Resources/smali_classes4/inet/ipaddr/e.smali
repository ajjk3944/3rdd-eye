.class public Linet/ipaddr/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZf/f;
.implements Ljava/lang/Comparable;


# static fields
.field private static g:[Linet/ipaddr/g;

.field public static final h:Linet/ipaddr/f;

.field private static final i:Linet/ipaddr/f;


# instance fields
.field private final a:Ljava/lang/String;

.field private transient b:Ljava/lang/String;

.field private c:Linet/ipaddr/format/validate/h;

.field private d:Linet/ipaddr/HostNameException;

.field e:[Linet/ipaddr/g;

.field final f:Linet/ipaddr/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Linet/ipaddr/g;

    sput-object v0, Linet/ipaddr/e;->g:[Linet/ipaddr/g;

    new-instance v0, Linet/ipaddr/f$a;

    invoke-direct {v0}, Linet/ipaddr/f$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/f$a;->n()Linet/ipaddr/f;

    move-result-object v0

    sput-object v0, Linet/ipaddr/e;->h:Linet/ipaddr/f;

    invoke-virtual {v0}, Linet/ipaddr/f;->l()Linet/ipaddr/f$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Linet/ipaddr/f$a;->m(Z)Linet/ipaddr/f$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/f$a;->n()Linet/ipaddr/f;

    move-result-object v0

    sput-object v0, Linet/ipaddr/e;->i:Linet/ipaddr/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 5
    sget-object v0, Linet/ipaddr/e;->h:Linet/ipaddr/f;

    invoke-direct {p0, p1, v0}, Linet/ipaddr/e;-><init>(Ljava/lang/String;Linet/ipaddr/f;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Linet/ipaddr/f;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iput-object p2, p0, Linet/ipaddr/e;->f:Linet/ipaddr/f;

    if-nez p1, :cond_0

    .line 9
    const-string p1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Linet/ipaddr/e;->a:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Linet/ipaddr/format/validate/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Linet/ipaddr/e;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Linet/ipaddr/e;->f:Linet/ipaddr/f;

    return-void
.end method

.method private V()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/e;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Linet/ipaddr/e;->s(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/e;->b:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method private s(Z)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Linet/ipaddr/e;->p()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Linet/ipaddr/e;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/e;->a()Linet/ipaddr/g;

    move-result-object v1

    invoke-static {v1, p1, v0}, Linet/ipaddr/e;->v(Linet/ipaddr/g;ZLjava/lang/StringBuilder;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/e;->n()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/e;->c()Linet/ipaddr/n;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/n;->a0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->g()Ljava/lang/Integer;

    move-result-object p1

    const/16 v1, 0x2f

    if-eqz p1, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0xa

    invoke-static {p1, v1, v0}, Linet/ipaddr/k;->X2(IILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->j()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_0
    iget-object p1, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->m()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1, v0}, Linet/ipaddr/e;->t(ILjava/lang/StringBuilder;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->n()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object p1, p0, Linet/ipaddr/e;->a:Ljava/lang/String;

    return-object p1
.end method

.method private static t(ILjava/lang/StringBuilder;)V
    .locals 1

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-static {p0, v0, p1}, Linet/ipaddr/k;->X2(IILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static v(Linet/ipaddr/g;ZLjava/lang/StringBuilder;)V
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/g;->f1()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x5d

    const/16 v1, 0x5b

    if-nez p1, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/a;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x2f

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    invoke-virtual {p0}, Linet/ipaddr/g;->o1()Linet/ipaddr/ipv6/b;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2, p2}, Linet/ipaddr/e;->y(Linet/ipaddr/ipv6/b;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Linet/ipaddr/g;->o1()Linet/ipaddr/ipv6/b;

    move-result-object p1

    invoke-virtual {p0}, Linet/ipaddr/g;->V()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0, p2}, Linet/ipaddr/e;->y(Linet/ipaddr/ipv6/b;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/g;->V()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    return-void
.end method

.method private static y(Linet/ipaddr/ipv6/b;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/ipv6/b;->Q1()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const/16 p0, 0x25

    invoke-virtual {p1, p0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const-string v1, "%25"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Linet/ipaddr/format/validate/s;->x(C)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v2, 0x10

    invoke-static {v1, v2, p2}, Linet/ipaddr/k;->X2(IILjava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public B()V
    .locals 1

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Linet/ipaddr/e;->d:Linet/ipaddr/HostNameException;

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Linet/ipaddr/e;->d:Linet/ipaddr/HostNameException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    :try_start_1
    invoke-virtual {p0}, Linet/ipaddr/e;->j()Linet/ipaddr/format/validate/b;

    move-result-object v0

    invoke-interface {v0, p0}, Linet/ipaddr/format/validate/b;->b(Linet/ipaddr/e;)Linet/ipaddr/format/validate/h;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;
    :try_end_1
    .catch Linet/ipaddr/HostNameException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    return-void

    :catch_0
    move-exception v0

    iput-object v0, p0, Linet/ipaddr/e;->d:Linet/ipaddr/HostNameException;

    throw v0

    :cond_2
    throw v0

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_3
    throw v0
.end method

.method public a()Linet/ipaddr/g;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/e;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->a()Linet/ipaddr/g;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Linet/ipaddr/n;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/e;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->c()Linet/ipaddr/n;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Linet/ipaddr/e;

    invoke-virtual {p0, p1}, Linet/ipaddr/e;->d(Linet/ipaddr/e;)I

    move-result p1

    return p1
.end method

.method public d(Linet/ipaddr/e;)I
    .locals 11

    invoke-virtual {p0}, Linet/ipaddr/e;->p()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_13

    invoke-virtual {p1}, Linet/ipaddr/e;->p()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_12

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    iget-object p1, p1, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->p()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->p()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->c()Linet/ipaddr/n;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->c()Linet/ipaddr/n;

    move-result-object v4

    invoke-virtual {v3, v4}, Linet/ipaddr/n;->d(Linet/ipaddr/n;)I

    move-result v3

    if-eqz v3, :cond_b

    return v3

    :cond_0
    return v1

    :cond_1
    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->l()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->l()[Ljava/lang/String;

    move-result-object v4

    array-length v5, v3

    array-length v6, v4

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v7

    move v8, v2

    :goto_0
    if-gt v8, v7, :cond_4

    sub-int v9, v5, v8

    aget-object v9, v3, v9

    sub-int v10, v6, v8

    aget-object v10, v4, v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v9

    if-eqz v9, :cond_3

    return v9

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    if-eq v5, v6, :cond_5

    sub-int/2addr v5, v6

    return v5

    :cond_5
    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->g()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->g()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v3, :cond_7

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v5, v6, :cond_b

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int/2addr p1, v0

    return p1

    :cond_6
    return v2

    :cond_7
    if-eqz v4, :cond_8

    return v1

    :cond_8
    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->j()Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->j()Linet/ipaddr/g;

    move-result-object v4

    if-eqz v3, :cond_a

    if-eqz v4, :cond_9

    invoke-interface {v3, v4}, Lag/g;->z0(Lag/g;)I

    move-result v3

    if-eqz v3, :cond_b

    return v3

    :cond_9
    return v2

    :cond_a
    if-eqz v4, :cond_b

    return v1

    :cond_b
    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->m()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->m()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v3, :cond_d

    if-eqz v4, :cond_c

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sub-int/2addr v3, v4

    if-eqz v3, :cond_e

    return v3

    :cond_c
    return v2

    :cond_d
    if-eqz v4, :cond_e

    return v1

    :cond_e
    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->n()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_10

    if-eqz p1, :cond_f

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_11

    return p1

    :cond_f
    return v2

    :cond_10
    if-eqz p1, :cond_11

    return v1

    :cond_11
    const/4 p1, 0x0

    return p1

    :cond_12
    return v2

    :cond_13
    invoke-virtual {p1}, Linet/ipaddr/e;->p()Z

    move-result v0

    if-eqz v0, :cond_14

    return v1

    :cond_14
    invoke-virtual {p0}, Linet/ipaddr/e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Linet/ipaddr/e;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Linet/ipaddr/e;

    if-eqz v0, :cond_0

    check-cast p1, Linet/ipaddr/e;

    invoke-virtual {p0, p1}, Linet/ipaddr/e;->r(Linet/ipaddr/e;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/e;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Linet/ipaddr/f;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/e;->f:Linet/ipaddr/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/e;->V()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method protected j()Linet/ipaddr/format/validate/b;
    .locals 1

    sget-object v0, Linet/ipaddr/format/validate/s;->j:Linet/ipaddr/format/validate/b;

    return-object v0
.end method

.method public l()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/e;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->a()Linet/ipaddr/g;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/e;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/h;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p()Z
    .locals 3

    iget-object v0, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Linet/ipaddr/e;->d:Linet/ipaddr/HostNameException;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Linet/ipaddr/e;->B()V
    :try_end_0
    .catch Linet/ipaddr/HostNameException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    return v2
.end method

.method public r(Linet/ipaddr/e;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/e;->p()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Linet/ipaddr/e;->p()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    iget-object p1, p1, Linet/ipaddr/e;->c:Linet/ipaddr/format/validate/h;

    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->p()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->c()Linet/ipaddr/n;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->c()Linet/ipaddr/n;

    move-result-object v4

    invoke-virtual {v3, v4}, Linet/ipaddr/n;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->m()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->m()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->n()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->p()Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->g()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->g()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->j()Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->j()Linet/ipaddr/g;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->m()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->m()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Linet/ipaddr/format/validate/h;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/h;->n()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move v0, v2

    :goto_1
    return v0

    :cond_6
    return v2

    :cond_7
    invoke-virtual {p1}, Linet/ipaddr/e;->p()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p0}, Linet/ipaddr/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Linet/ipaddr/e;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_2

    :cond_8
    move v0, v2

    :goto_2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/e;->a:Ljava/lang/String;

    return-object v0
.end method
