.class final LC3/E;
.super LC3/F;
.source "SourceFile"


# instance fields
.field final transient c:I

.field final transient d:I

.field final synthetic e:LC3/F;


# direct methods
.method constructor <init>(LC3/F;II)V
    .locals 0

    iput-object p1, p0, LC3/E;->e:LC3/F;

    invoke-direct {p0}, LC3/F;-><init>()V

    iput p2, p0, LC3/E;->c:I

    iput p3, p0, LC3/E;->d:I

    return-void
.end method


# virtual methods
.method final g()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC3/E;->e:LC3/F;

    invoke-virtual {v0}, LC3/C;->g()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LC3/E;->d:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, LC3/z;->a(IILjava/lang/String;)I

    iget-object v0, p0, LC3/E;->e:LC3/F;

    iget v1, p0, LC3/E;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method final j()I
    .locals 2

    iget-object v0, p0, LC3/E;->e:LC3/F;

    invoke-virtual {v0}, LC3/C;->j()I

    move-result v0

    iget v1, p0, LC3/E;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method final m()I
    .locals 2

    iget-object v0, p0, LC3/E;->e:LC3/F;

    invoke-virtual {v0}, LC3/C;->j()I

    move-result v0

    iget v1, p0, LC3/E;->c:I

    add-int/2addr v0, v1

    iget v1, p0, LC3/E;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method final s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LC3/E;->d:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LC3/F;->y(II)LC3/F;

    move-result-object p1

    return-object p1
.end method

.method public final y(II)LC3/F;
    .locals 2

    iget v0, p0, LC3/E;->d:I

    invoke-static {p1, p2, v0}, LC3/z;->c(III)V

    iget v0, p0, LC3/E;->c:I

    iget-object v1, p0, LC3/E;->e:LC3/F;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, LC3/F;->y(II)LC3/F;

    move-result-object p1

    return-object p1
.end method
