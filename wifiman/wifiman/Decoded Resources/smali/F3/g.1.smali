.class final LF3/g;
.super LF3/h;
.source "SourceFile"


# instance fields
.field final transient d:I

.field final transient e:I

.field final synthetic f:LF3/h;


# direct methods
.method constructor <init>(LF3/h;II)V
    .locals 0

    iput-object p1, p0, LF3/g;->f:LF3/h;

    invoke-direct {p0}, LF3/h;-><init>()V

    iput p2, p0, LF3/g;->d:I

    iput p3, p0, LF3/g;->e:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LF3/g;->e:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LF3/x;->a(IILjava/lang/String;)I

    iget-object v0, p0, LF3/g;->f:LF3/h;

    iget v1, p0, LF3/g;->d:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final j()I
    .locals 2

    iget-object v0, p0, LF3/g;->f:LF3/h;

    invoke-virtual {v0}, LF3/d;->m()I

    move-result v0

    iget v1, p0, LF3/g;->d:I

    add-int/2addr v0, v1

    iget v1, p0, LF3/g;->e:I

    add-int/2addr v0, v1

    return v0
.end method

.method final m()I
    .locals 2

    iget-object v0, p0, LF3/g;->f:LF3/h;

    invoke-virtual {v0}, LF3/d;->m()I

    move-result v0

    iget v1, p0, LF3/g;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method final o()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF3/g;->f:LF3/h;

    invoke-virtual {v0}, LF3/d;->o()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final s(II)LF3/h;
    .locals 2

    iget v0, p0, LF3/g;->e:I

    invoke-static {p1, p2, v0}, LF3/x;->c(III)V

    iget v0, p0, LF3/g;->d:I

    iget-object v1, p0, LF3/g;->f:LF3/h;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, LF3/h;->s(II)LF3/h;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LF3/g;->e:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LF3/h;->s(II)LF3/h;

    move-result-object p1

    return-object p1
.end method
