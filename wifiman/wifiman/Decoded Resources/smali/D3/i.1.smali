.class public abstract LD3/i;
.super LD3/b;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field private transient b:LD3/e;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LD3/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-eq p1, p0, :cond_2

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljava/util/Set;

    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v1, v3, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_2

    :catch_0
    :cond_1
    move v0, v2

    nop

    :cond_2
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, LD3/q;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public final s()LD3/e;
    .locals 1

    iget-object v0, p0, LD3/i;->b:LD3/e;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LD3/i;->v()LD3/e;

    move-result-object v0

    iput-object v0, p0, LD3/i;->b:LD3/e;

    :cond_0
    return-object v0
.end method

.method v()LD3/e;
    .locals 2

    invoke-virtual {p0}, LD3/b;->toArray()[Ljava/lang/Object;

    move-result-object v0

    sget v1, LD3/e;->c:I

    array-length v1, v0

    invoke-static {v0, v1}, LD3/e;->v([Ljava/lang/Object;I)LD3/e;

    move-result-object v0

    return-object v0
.end method
