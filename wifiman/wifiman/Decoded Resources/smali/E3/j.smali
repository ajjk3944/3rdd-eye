.class final LE3/j;
.super LE3/k;
.source "SourceFile"


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:LE3/k;


# direct methods
.method constructor <init>(LE3/k;II)V
    .locals 0

    iput-object p1, p0, LE3/j;->e:LE3/k;

    invoke-direct {p0}, LE3/k;-><init>()V

    iput p2, p0, LE3/j;->c:I

    iput p3, p0, LE3/j;->d:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LE3/j;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LE3/e;->a(IILjava/lang/String;)I

    iget-object v0, p0, LE3/j;->e:LE3/k;

    iget v1, p0, LE3/j;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final j()I
    .locals 2

    iget-object v0, p0, LE3/j;->e:LE3/k;

    invoke-virtual {v0}, LE3/h;->m()I

    move-result v0

    iget v1, p0, LE3/j;->c:I

    add-int/2addr v0, v1

    iget v1, p0, LE3/j;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method final m()I
    .locals 2

    iget-object v0, p0, LE3/j;->e:LE3/k;

    invoke-virtual {v0}, LE3/h;->m()I

    move-result v0

    iget v1, p0, LE3/j;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method final o()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LE3/j;->e:LE3/k;

    invoke-virtual {v0}, LE3/h;->o()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final s(II)LE3/k;
    .locals 2

    iget v0, p0, LE3/j;->d:I

    invoke-static {p1, p2, v0}, LE3/e;->c(III)V

    iget-object v0, p0, LE3/j;->e:LE3/k;

    iget v1, p0, LE3/j;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, LE3/k;->s(II)LE3/k;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LE3/j;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LE3/k;->s(II)LE3/k;

    move-result-object p1

    return-object p1
.end method
