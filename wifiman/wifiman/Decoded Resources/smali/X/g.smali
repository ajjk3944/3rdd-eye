.class public final LX/g;
.super LX/a;
.source "SourceFile"


# instance fields
.field private final c:[Ljava/lang/Object;

.field private final d:LX/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;III)V
    .locals 0

    invoke-direct {p0, p3, p4}, LX/a;-><init>(II)V

    iput-object p2, p0, LX/g;->c:[Ljava/lang/Object;

    invoke-static {p4}, LX/l;->d(I)I

    move-result p2

    invoke-static {p3, p2}, Lsh/m;->g(II)I

    move-result p3

    new-instance p4, LX/k;

    invoke-direct {p4, p1, p3, p2, p5}, LX/k;-><init>([Ljava/lang/Object;III)V

    iput-object p4, p0, LX/g;->d:LX/k;

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LX/a;->d()V

    iget-object v0, p0, LX/g;->d:LX/k;

    invoke-virtual {v0}, LX/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LX/a;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LX/a;->h(I)V

    iget-object v0, p0, LX/g;->d:LX/k;

    invoke-virtual {v0}, LX/k;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LX/g;->c:[Ljava/lang/Object;

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, LX/a;->h(I)V

    iget-object v2, p0, LX/g;->d:LX/k;

    invoke-virtual {v2}, LX/a;->g()I

    move-result v2

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LX/a;->e()V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v0

    iget-object v1, p0, LX/g;->d:LX/k;

    invoke-virtual {v1}, LX/a;->g()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, LX/g;->c:[Ljava/lang/Object;

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LX/a;->h(I)V

    invoke-virtual {p0}, LX/a;->f()I

    move-result v1

    iget-object v2, p0, LX/g;->d:LX/k;

    invoke-virtual {v2}, LX/a;->g()I

    move-result v2

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {p0}, LX/a;->f()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LX/a;->h(I)V

    iget-object v0, p0, LX/g;->d:LX/k;

    invoke-virtual {v0}, LX/k;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
