.class final LF3/p;
.super LF3/l;
.source "SourceFile"


# instance fields
.field private final transient c:LF3/k;

.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I


# direct methods
.method constructor <init>(LF3/k;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LF3/l;-><init>()V

    iput-object p1, p0, LF3/p;->c:LF3/k;

    iput-object p2, p0, LF3/p;->d:[Ljava/lang/Object;

    iput p4, p0, LF3/p;->e:I

    return-void
.end method

.method static bridge synthetic C(LF3/p;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LF3/p;->d:[Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic y(LF3/p;)I
    .locals 0

    iget p0, p0, LF3/p;->e:I

    return p0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, LF3/p;->c:LF3/k;

    invoke-virtual {v2, v0}, LF3/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method final g([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, LF3/l;->s()LF3/h;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LF3/d;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, LF3/l;->s()LF3/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LF3/h;->y(I)LF3/v;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LF3/p;->e:I

    return v0
.end method

.method final v()LF3/h;
    .locals 1

    new-instance v0, LF3/o;

    invoke-direct {v0, p0}, LF3/o;-><init>(LF3/p;)V

    return-object v0
.end method
