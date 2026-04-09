.class final LD3/d;
.super LD3/e;
.source "SourceFile"


# instance fields
.field final transient d:I

.field final transient e:I

.field final synthetic f:LD3/e;


# direct methods
.method constructor <init>(LD3/e;II)V
    .locals 0

    iput-object p1, p0, LD3/d;->f:LD3/e;

    invoke-direct {p0}, LD3/e;-><init>()V

    iput p2, p0, LD3/d;->d:I

    iput p3, p0, LD3/d;->e:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LD3/d;->e:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LD3/P;->a(IILjava/lang/String;)I

    iget-object v0, p0, LD3/d;->f:LD3/e;

    iget v1, p0, LD3/d;->d:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final j()I
    .locals 2

    iget-object v0, p0, LD3/d;->f:LD3/e;

    invoke-virtual {v0}, LD3/b;->m()I

    move-result v0

    iget v1, p0, LD3/d;->d:I

    add-int/2addr v0, v1

    iget v1, p0, LD3/d;->e:I

    add-int/2addr v0, v1

    return v0
.end method

.method final m()I
    .locals 2

    iget-object v0, p0, LD3/d;->f:LD3/e;

    invoke-virtual {v0}, LD3/b;->m()I

    move-result v0

    iget v1, p0, LD3/d;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method final o()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD3/d;->f:LD3/e;

    invoke-virtual {v0}, LD3/b;->o()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final s(II)LD3/e;
    .locals 2

    iget v0, p0, LD3/d;->e:I

    invoke-static {p1, p2, v0}, LD3/P;->c(III)V

    iget v0, p0, LD3/d;->d:I

    iget-object v1, p0, LD3/d;->f:LD3/e;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, LD3/e;->s(II)LD3/e;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LD3/d;->e:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LD3/e;->s(II)LD3/e;

    move-result-object p1

    return-object p1
.end method
