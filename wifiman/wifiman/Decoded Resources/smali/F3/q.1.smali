.class final LF3/q;
.super LF3/l;
.source "SourceFile"


# instance fields
.field private final transient c:LF3/k;

.field private final transient d:LF3/h;


# direct methods
.method constructor <init>(LF3/k;LF3/h;)V
    .locals 0

    invoke-direct {p0}, LF3/l;-><init>()V

    iput-object p1, p0, LF3/q;->c:LF3/k;

    iput-object p2, p0, LF3/q;->d:LF3/h;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LF3/q;->c:LF3/k;

    invoke-virtual {v0, p1}, LF3/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget-object p2, p0, LF3/q;->d:LF3/h;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, LF3/d;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, LF3/q;->d:LF3/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LF3/h;->y(I)LF3/v;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LF3/q;->c:LF3/k;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
