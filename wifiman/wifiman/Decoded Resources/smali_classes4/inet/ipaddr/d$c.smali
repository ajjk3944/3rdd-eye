.class public Linet/ipaddr/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final f:Linet/ipaddr/d$c;

.field public static final g:Linet/ipaddr/d$c;

.field public static final h:Linet/ipaddr/d$c;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Linet/ipaddr/d$c;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Linet/ipaddr/d$c;-><init>(ZZZZZ)V

    sput-object v6, Linet/ipaddr/d$c;->f:Linet/ipaddr/d$c;

    new-instance v0, Linet/ipaddr/d$c;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Linet/ipaddr/d$c;-><init>(ZZZZZ)V

    sput-object v0, Linet/ipaddr/d$c;->g:Linet/ipaddr/d$c;

    new-instance v0, Linet/ipaddr/d$c;

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Linet/ipaddr/d$c;-><init>(ZZZZZ)V

    sput-object v0, Linet/ipaddr/d$c;->h:Linet/ipaddr/d$c;

    return-void
.end method

.method public constructor <init>(ZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Linet/ipaddr/d$c;->a:Z

    iput-boolean p2, p0, Linet/ipaddr/d$c;->b:Z

    iput-boolean p3, p0, Linet/ipaddr/d$c;->c:Z

    iput-boolean p4, p0, Linet/ipaddr/d$c;->e:Z

    iput-boolean p5, p0, Linet/ipaddr/d$c;->d:Z

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d$c;->e:Z

    return v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/d$c;->p()Linet/ipaddr/d$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Linet/ipaddr/d$c;

    invoke-virtual {p0, p1}, Linet/ipaddr/d$c;->r(Linet/ipaddr/d$c;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d$c;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Linet/ipaddr/d$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Linet/ipaddr/d$c;

    iget-boolean v1, p0, Linet/ipaddr/d$c;->a:Z

    iget-boolean v3, p1, Linet/ipaddr/d$c;->a:Z

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Linet/ipaddr/d$c;->b:Z

    iget-boolean v3, p1, Linet/ipaddr/d$c;->b:Z

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Linet/ipaddr/d$c;->c:Z

    iget-boolean v3, p1, Linet/ipaddr/d$c;->c:Z

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Linet/ipaddr/d$c;->e:Z

    iget-boolean v3, p1, Linet/ipaddr/d$c;->e:Z

    if-ne v1, v3, :cond_1

    iget-boolean v1, p0, Linet/ipaddr/d$c;->d:Z

    iget-boolean p1, p1, Linet/ipaddr/d$c;->d:Z

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d$c;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Linet/ipaddr/d$c;->a:Z

    iget-boolean v1, p0, Linet/ipaddr/d$c;->b:Z

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x2

    :cond_0
    iget-boolean v1, p0, Linet/ipaddr/d$c;->d:Z

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x4

    :cond_1
    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d$c;->d:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d$c;->a:Z

    return v0
.end method

.method public p()Linet/ipaddr/d$c;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Linet/ipaddr/d$c;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public r(Linet/ipaddr/d$c;)I
    .locals 2

    iget-boolean v0, p0, Linet/ipaddr/d$c;->a:Z

    iget-boolean v1, p1, Linet/ipaddr/d$c;->a:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$c;->b:Z

    iget-boolean v1, p1, Linet/ipaddr/d$c;->b:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$c;->d:Z

    iget-boolean v1, p1, Linet/ipaddr/d$c;->d:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$c;->c:Z

    iget-boolean v1, p1, Linet/ipaddr/d$c;->c:Z

    invoke-static {v0, v1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$c;->e:Z

    iget-boolean p1, p1, Linet/ipaddr/d$c;->e:Z

    invoke-static {v0, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result v0

    :cond_0
    return v0
.end method

.method public t()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/d$c;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$c;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Linet/ipaddr/d$c;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
