.class public final Ly0/H$b;
.super Ly0/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/H;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private b:Ly0/H$a;

.field final synthetic c:Ly0/H;


# direct methods
.method constructor <init>(Ly0/H;)V
    .locals 0

    iput-object p1, p0, Ly0/H$b;->c:Ly0/H;

    invoke-direct {p0}, Ly0/E;-><init>()V

    sget-object p1, Ly0/H$a;->Unknown:Ly0/H$a;

    iput-object p1, p0, Ly0/H$b;->b:Ly0/H$a;

    return-void
.end method

.method public static final synthetic g(Ly0/H$b;Ly0/H$a;)V
    .locals 0

    iput-object p1, p0, Ly0/H$b;->b:Ly0/H$a;

    return-void
.end method

.method private final h(Ly0/n;)V
    .locals 6

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-string v4, "layoutCoordinates not set"

    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly0/y;

    invoke-virtual {v5}, Ly0/y;->p()Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v0, p0, Ly0/H$b;->b:Ly0/H$a;

    sget-object v1, Ly0/H$a;->Dispatching:Ly0/H$a;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Ly0/E;->b()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->c()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, LC0/r;->o0(J)J

    move-result-wide v0

    new-instance v2, Ly0/H$b$a;

    iget-object v3, p0, Ly0/H$b;->c:Ly0/H;

    invoke-direct {v2, v3}, Ly0/H$b$a;-><init>(Ly0/H;)V

    invoke-static {p1, v0, v1, v2}, Ly0/J;->b(Ly0/n;JLmh/l;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    sget-object p1, Ly0/H$a;->NotDispatching:Ly0/H$a;

    iput-object p1, p0, Ly0/H$b;->b:Ly0/H$a;

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ly0/E;->b()LC0/r;

    move-result-object v1

    if-eqz v1, :cond_7

    sget-object v3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v3}, Ll0/g$a;->c()J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, LC0/r;->o0(J)J

    move-result-wide v3

    new-instance v1, Ly0/H$b$b;

    iget-object v5, p0, Ly0/H$b;->c:Ly0/H;

    invoke-direct {v1, p0, v5}, Ly0/H$b$b;-><init>(Ly0/H$b;Ly0/H;)V

    invoke-static {p1, v3, v4, v1}, Ly0/J;->c(Ly0/n;JLmh/l;)V

    iget-object v1, p0, Ly0/H$b;->b:Ly0/H$a;

    sget-object v3, Ly0/H$a;->Dispatching:Ly0/H$a;

    if-ne v1, v3, :cond_6

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    :goto_2
    if-ge v2, v1, :cond_4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/y;

    invoke-virtual {v3}, Ly0/y;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Ly0/n;->d()Ly0/f;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, p0, Ly0/H$b;->c:Ly0/H;

    invoke-virtual {v0}, Ly0/H;->a()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ly0/f;->e(Z)V

    :cond_6
    :goto_3
    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final i()V
    .locals 2

    sget-object v0, Ly0/H$a;->Unknown:Ly0/H$a;

    iput-object v0, p0, Ly0/H$b;->b:Ly0/H$a;

    iget-object v0, p0, Ly0/H$b;->c:Ly0/H;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly0/H;->d(Z)V

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d()V
    .locals 4

    iget-object v0, p0, Ly0/H$b;->b:Ly0/H$a;

    sget-object v1, Ly0/H$a;->Dispatching:Ly0/H$a;

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    new-instance v2, Ly0/H$b$c;

    iget-object v3, p0, Ly0/H$b;->c:Ly0/H;

    invoke-direct {v2, v3}, Ly0/H$b$c;-><init>(Ly0/H;)V

    invoke-static {v0, v1, v2}, Ly0/J;->a(JLmh/l;)V

    invoke-direct {p0}, Ly0/H$b;->i()V

    :cond_0
    return-void
.end method

.method public e(Ly0/n;Ly0/p;J)V
    .locals 4

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object p3

    iget-object p4, p0, Ly0/H$b;->c:Ly0/H;

    invoke-virtual {p4}, Ly0/H;->a()Z

    move-result p4

    const/4 v0, 0x0

    if-nez p4, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_1

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly0/y;

    invoke-static {v2}, Ly0/o;->b(Ly0/y;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v2}, Ly0/o;->d(Ly0/y;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move p4, v0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p4, 0x1

    :goto_2
    iget-object v1, p0, Ly0/H$b;->b:Ly0/H$a;

    sget-object v2, Ly0/H$a;->NotDispatching:Ly0/H$a;

    if-eq v1, v2, :cond_4

    sget-object v1, Ly0/p;->Initial:Ly0/p;

    if-ne p2, v1, :cond_3

    if-eqz p4, :cond_3

    invoke-direct {p0, p1}, Ly0/H$b;->h(Ly0/n;)V

    :cond_3
    sget-object v1, Ly0/p;->Final:Ly0/p;

    if-ne p2, v1, :cond_4

    if-nez p4, :cond_4

    invoke-direct {p0, p1}, Ly0/H$b;->h(Ly0/n;)V

    :cond_4
    sget-object p1, Ly0/p;->Final:Ly0/p;

    if-ne p2, p1, :cond_7

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    :goto_3
    if-ge v0, p1, :cond_6

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly0/y;

    invoke-static {p2}, Ly0/o;->d(Ly0/y;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_6
    invoke-direct {p0}, Ly0/H$b;->i()V

    :cond_7
    :goto_4
    return-void
.end method
