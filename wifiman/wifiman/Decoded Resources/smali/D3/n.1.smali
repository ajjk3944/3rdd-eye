.class final LD3/n;
.super LD3/i;
.source "SourceFile"


# instance fields
.field private final transient c:LD3/h;

.field private final transient d:LD3/e;


# direct methods
.method constructor <init>(LD3/h;LD3/e;)V
    .locals 0

    invoke-direct {p0}, LD3/i;-><init>()V

    iput-object p1, p0, LD3/n;->c:LD3/h;

    iput-object p2, p0, LD3/n;->d:LD3/e;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LD3/n;->c:LD3/h;

    invoke-virtual {v0, p1}, LD3/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final g([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, LD3/n;->d:LD3/e;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LD3/b;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LD3/n;->d:LD3/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LD3/e;->C(I)LD3/s;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LD3/n;->c:LD3/h;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
