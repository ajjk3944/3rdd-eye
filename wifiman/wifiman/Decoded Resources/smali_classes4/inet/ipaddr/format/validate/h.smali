.class public Linet/ipaddr/format/validate/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/format/validate/h$a;
    }
.end annotation


# static fields
.field private static final i:Linet/ipaddr/format/validate/h$a;

.field static final j:Linet/ipaddr/format/validate/i;


# instance fields
.field private a:[Ljava/lang/String;

.field private b:[I

.field private c:[Z

.field private final d:Linet/ipaddr/format/validate/i;

.field private e:Ljava/lang/String;

.field private f:Linet/ipaddr/format/validate/h$a;

.field g:Ljava/lang/String;

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Linet/ipaddr/format/validate/h$a;

    invoke-direct {v0}, Linet/ipaddr/format/validate/h$a;-><init>()V

    sput-object v0, Linet/ipaddr/format/validate/h;->i:Linet/ipaddr/format/validate/h$a;

    new-instance v0, Linet/ipaddr/format/validate/i;

    invoke-direct {v0}, Linet/ipaddr/format/validate/i;-><init>()V

    sput-object v0, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Linet/ipaddr/format/validate/d;)V
    .locals 6

    .line 1
    sget-object v4, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    new-instance v5, Linet/ipaddr/format/validate/h$a;

    invoke-direct {v5}, Linet/ipaddr/format/validate/h$a;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;Linet/ipaddr/format/validate/h$a;)V

    .line 2
    iget-object p1, p0, Linet/ipaddr/format/validate/h;->f:Linet/ipaddr/format/validate/h$a;

    iput-object p2, p1, Linet/ipaddr/format/validate/h$a;->d:Linet/ipaddr/format/validate/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Linet/ipaddr/format/validate/d;Linet/ipaddr/format/validate/i;)V
    .locals 6

    .line 3
    new-instance v5, Linet/ipaddr/format/validate/h$a;

    invoke-direct {v5}, Linet/ipaddr/format/validate/h$a;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;Linet/ipaddr/format/validate/h$a;)V

    .line 4
    iget-object p1, p0, Linet/ipaddr/format/validate/h;->f:Linet/ipaddr/format/validate/h$a;

    iput-object p2, p1, Linet/ipaddr/format/validate/h$a;->d:Linet/ipaddr/format/validate/d;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 5
    invoke-direct/range {v0 .. v5}, Linet/ipaddr/format/validate/h;-><init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;Linet/ipaddr/format/validate/h$a;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;[I[ZLinet/ipaddr/format/validate/i;Linet/ipaddr/format/validate/h$a;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p4, p0, Linet/ipaddr/format/validate/h;->d:Linet/ipaddr/format/validate/i;

    .line 8
    iput-object p3, p0, Linet/ipaddr/format/validate/h;->c:[Z

    .line 9
    iput-object p2, p0, Linet/ipaddr/format/validate/h;->b:[I

    .line 10
    iput-object p1, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    if-nez p5, :cond_0

    .line 11
    sget-object p5, Linet/ipaddr/format/validate/h;->i:Linet/ipaddr/format/validate/h$a;

    :cond_0
    iput-object p5, p0, Linet/ipaddr/format/validate/h;->f:Linet/ipaddr/format/validate/h$a;

    return-void
.end method

.method private o()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->f:Linet/ipaddr/format/validate/h$a;

    iget-object v0, v0, Linet/ipaddr/format/validate/h$a;->d:Linet/ipaddr/format/validate/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private r(Linet/ipaddr/format/validate/d;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Linet/ipaddr/a;->e:Ljava/lang/String;

    return-object p1

    :cond_0
    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->i0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->g0()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Linet/ipaddr/i;->v(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p1}, Linet/ipaddr/format/validate/d;->y0()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, ""

    return-object p1

    :cond_2
    iget-object p1, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public a()Linet/ipaddr/g;
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/format/validate/h;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/h;->d()Linet/ipaddr/format/validate/d;

    move-result-object v0

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Linet/ipaddr/n;
    .locals 3

    invoke-direct {p0}, Linet/ipaddr/format/validate/h;->o()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/h;->d()Linet/ipaddr/format/validate/d;

    move-result-object v0

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->U()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Linet/ipaddr/n;

    sget-object v2, Linet/ipaddr/a;->e:Ljava/lang/String;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->getParameters()Linet/ipaddr/o;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/o;)V

    return-object v1

    :cond_0
    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->i0()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Linet/ipaddr/n;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->g0()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Linet/ipaddr/i;->v(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->getParameters()Linet/ipaddr/o;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/o;)V

    return-object v1

    :cond_1
    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->y0()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Linet/ipaddr/n;

    const-string v2, ""

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->getParameters()Linet/ipaddr/o;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/o;)V

    return-object v1

    :cond_2
    :try_start_0
    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v1

    invoke-virtual {v1}, Linet/ipaddr/g;->k1()Linet/ipaddr/n;

    move-result-object v0
    :try_end_0
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v1, Linet/ipaddr/n;

    iget-object v2, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->getParameters()Linet/ipaddr/o;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Linet/ipaddr/n;-><init>(Ljava/lang/String;Linet/ipaddr/o;)V

    return-object v1

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Linet/ipaddr/format/validate/d;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->f:Linet/ipaddr/format/validate/h$a;

    iget-object v0, v0, Linet/ipaddr/format/validate/h$a;->d:Linet/ipaddr/format/validate/d;

    return-object v0
.end method

.method public g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->d:Linet/ipaddr/format/validate/i;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->h()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->g:Ljava/lang/String;

    if-nez v0, :cond_5

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/format/validate/h;->g:Ljava/lang/String;

    if-nez v0, :cond_3

    invoke-direct {p0}, Linet/ipaddr/format/validate/h;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/h;->d()Linet/ipaddr/format/validate/d;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v1

    invoke-interface {v1}, Linet/ipaddr/l;->X()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Linet/ipaddr/format/validate/h;->g:Ljava/lang/String;
    :try_end_1
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    :cond_0
    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/h;->r(Linet/ipaddr/format/validate/d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/format/validate/h;->g:Ljava/lang/String;

    monitor-exit p0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Linet/ipaddr/format/validate/h;->l()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, v1, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_2

    const/16 v3, 0x2e

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v3, v1, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/format/validate/h;->g:Ljava/lang/String;

    monitor-exit p0

    return-object v0

    :cond_3
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_4
    iget-object v0, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    iput-object v0, p0, Linet/ipaddr/format/validate/h;->g:Ljava/lang/String;

    :cond_5
    :goto_2
    return-object v0
.end method

.method public j()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->d:Linet/ipaddr/format/validate/i;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->l()Linet/ipaddr/g;

    move-result-object v0

    return-object v0
.end method

.method public l()[Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->a:[Ljava/lang/String;

    if-nez v0, :cond_8

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Linet/ipaddr/format/validate/h;->a:[Ljava/lang/String;

    if-nez v0, :cond_7

    invoke-direct {p0}, Linet/ipaddr/format/validate/h;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/format/validate/h;->d()Linet/ipaddr/format/validate/d;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->M()Linet/ipaddr/g;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Linet/ipaddr/g;->b1()Linet/ipaddr/j;

    move-result-object v2

    invoke-virtual {v2}, Linet/ipaddr/j;->c2()[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Linet/ipaddr/format/validate/h;->a:[Ljava/lang/String;
    :try_end_1
    .catch Linet/ipaddr/IncompatibleAddressException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :catch_0
    :cond_0
    invoke-interface {v0}, Linet/ipaddr/format/validate/d;->y0()Z

    move-result v2

    if-eqz v2, :cond_1

    new-array v0, v1, [Ljava/lang/String;

    goto :goto_3

    :cond_1
    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/h;->r(Linet/ipaddr/format/validate/d;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_2
    iget-object v0, p0, Linet/ipaddr/format/validate/h;->b:[I

    array-length v0, v0

    new-array v2, v0, [Ljava/lang/String;

    const/4 v3, -0x1

    :goto_0
    if-ge v1, v0, :cond_6

    iget-object v4, p0, Linet/ipaddr/format/validate/h;->b:[I

    aget v4, v4, v1

    iget-object v5, p0, Linet/ipaddr/format/validate/h;->c:[Z

    if-eqz v5, :cond_5

    aget-boolean v5, v5, v1

    if-nez v5, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    sub-int v6, v4, v3

    add-int/lit8 v6, v6, -0x1

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    if-ge v3, v4, :cond_4

    iget-object v6, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x41

    if-lt v6, v7, :cond_3

    const/16 v7, 0x5a

    if-gt v6, v7, :cond_3

    add-int/lit8 v6, v6, 0x20

    int-to-char v6, v6

    :cond_3
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    goto :goto_2

    :cond_5
    iget-object v5, p0, Linet/ipaddr/format/validate/h;->h:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v5, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    move v3, v4

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    iput-object v0, p0, Linet/ipaddr/format/validate/h;->b:[I

    iput-object v0, p0, Linet/ipaddr/format/validate/h;->c:[Z

    move-object v0, v2

    :goto_3
    iput-object v0, p0, Linet/ipaddr/format/validate/h;->a:[Ljava/lang/String;

    :cond_7
    monitor-exit p0

    goto :goto_5

    :goto_4
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_8
    :goto_5
    return-object v0
.end method

.method public m()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->d:Linet/ipaddr/format/validate/i;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->m()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/format/validate/h;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v1, p0, Linet/ipaddr/format/validate/h;->d:Linet/ipaddr/format/validate/i;

    invoke-virtual {v1}, Linet/ipaddr/format/validate/i;->n()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/format/validate/h;->e:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method public p()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/h;->d()Linet/ipaddr/format/validate/d;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
