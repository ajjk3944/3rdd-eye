.class final LD3/l;
.super LD3/e;
.source "SourceFile"


# instance fields
.field final synthetic d:LD3/m;


# direct methods
.method constructor <init>(LD3/m;)V
    .locals 0

    iput-object p1, p0, LD3/l;->d:LD3/m;

    invoke-direct {p0}, LD3/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LD3/l;->d:LD3/m;

    invoke-static {v0}, LD3/m;->y(LD3/m;)I

    move-result v0

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LD3/P;->a(IILjava/lang/String;)I

    iget-object v0, p0, LD3/l;->d:LD3/m;

    invoke-static {v0}, LD3/m;->C(LD3/m;)[Ljava/lang/Object;

    move-result-object v0

    add-int/2addr p1, p1

    aget-object v0, v0, p1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, LD3/l;->d:LD3/m;

    invoke-static {v1}, LD3/m;->C(LD3/m;)[Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v1, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v1, v0, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LD3/l;->d:LD3/m;

    invoke-static {v0}, LD3/m;->y(LD3/m;)I

    move-result v0

    return v0
.end method
