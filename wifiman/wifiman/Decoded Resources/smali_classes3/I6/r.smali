.class public final LI6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/Q;


# static fields
.field public static final d:LI6/r;

.field public static final e:LI6/r;

.field public static final f:LI6/r;

.field private static final g:Ljava/util/Set;


# instance fields
.field final a:Ljava/lang/String;

.field final b:I

.field final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LI6/r;

    const-string/jumbo v1, "PHY_1M"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LI6/r;-><init>(Ljava/lang/String;II)V

    sput-object v0, LI6/r;->d:LI6/r;

    new-instance v1, LI6/r;

    const-string/jumbo v2, "PHY_2M"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3, v3}, LI6/r;-><init>(Ljava/lang/String;II)V

    sput-object v1, LI6/r;->e:LI6/r;

    new-instance v2, LI6/r;

    const/4 v3, 0x4

    const/4 v4, 0x3

    const-string/jumbo v5, "PHY_CODED"

    invoke-direct {v2, v5, v3, v4}, LI6/r;-><init>(Ljava/lang/String;II)V

    sput-object v2, LI6/r;->f:LI6/r;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LI6/r;->g:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(II)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, LI6/r;->a:Ljava/lang/String;

    .line 7
    iput p1, p0, LI6/r;->b:I

    .line 8
    iput p2, p0, LI6/r;->c:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LI6/r;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, LI6/r;->b:I

    .line 4
    iput p3, p0, LI6/r;->c:I

    return-void
.end method

.method private static b(I)LG6/Q;
    .locals 3

    sget-object v0, LI6/r;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG6/Q;

    invoke-interface {v1}, LG6/Q;->getValue()I

    move-result v2

    if-ne v2, p0, :cond_0

    return-object v1

    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "Encountered an unexpected PHY value=%d. Please consider making a PR to the library."

    invoke-static {v1, v0}, LI6/q;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, LI6/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LI6/r;-><init>(II)V

    return-object v0
.end method

.method public static c(II)LG6/D;
    .locals 1

    invoke-static {p0}, LI6/r;->b(I)LG6/Q;

    move-result-object p0

    invoke-static {p1}, LI6/r;->b(I)LG6/Q;

    move-result-object p1

    new-instance v0, LI6/h;

    invoke-direct {v0, p0, p1}, LI6/h;-><init>(LG6/Q;LG6/Q;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LI6/r;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LG6/Q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LG6/Q;

    iget v1, p0, LI6/r;->b:I

    invoke-interface {p1}, LG6/Q;->a()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget v1, p0, LI6/r;->c:I

    invoke-interface {p1}, LG6/Q;->getValue()I

    move-result p1

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public getValue()I
    .locals 1

    iget v0, p0, LI6/r;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LI6/r;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, LI6/r;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LI6/r;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "RxBlePhy{[CUSTOM] mask="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LI6/r;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LI6/r;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
