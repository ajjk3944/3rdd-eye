.class final LD3/m;
.super LD3/i;
.source "SourceFile"


# instance fields
.field private final transient c:LD3/h;

.field private final transient d:[Ljava/lang/Object;

.field private final transient e:I


# direct methods
.method constructor <init>(LD3/h;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, LD3/i;-><init>()V

    iput-object p1, p0, LD3/m;->c:LD3/h;

    iput-object p2, p0, LD3/m;->d:[Ljava/lang/Object;

    iput p4, p0, LD3/m;->e:I

    return-void
.end method

.method static bridge synthetic C(LD3/m;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LD3/m;->d:[Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic y(LD3/m;)I
    .locals 0

    iget p0, p0, LD3/m;->e:I

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

    iget-object v2, p0, LD3/m;->c:LD3/h;

    invoke-virtual {v2, v0}, LD3/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0}, LD3/i;->s()LD3/e;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LD3/b;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, LD3/i;->s()LD3/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LD3/e;->C(I)LD3/s;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LD3/m;->e:I

    return v0
.end method

.method final v()LD3/e;
    .locals 1

    new-instance v0, LD3/l;

    invoke-direct {v0, p0}, LD3/l;-><init>(LD3/m;)V

    return-object v0
.end method
