.class final LCi/c$b;
.super LZg/d;
.source "SourceFile"

# interfaces
.implements LCi/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCi/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final b:LCi/c;

.field private final c:I

.field private final d:I

.field private e:I


# direct methods
.method public constructor <init>(LCi/c;II)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LZg/d;-><init>()V

    iput-object p1, p0, LCi/c$b;->b:LCi/c;

    iput p2, p0, LCi/c$b;->c:I

    iput p3, p0, LCi/c$b;->d:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p2, p3, p1}, LHi/d;->c(III)V

    sub-int/2addr p3, p2

    iput p3, p0, LCi/c$b;->e:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LCi/c$b;->e:I

    invoke-static {p1, v0}, LHi/d;->a(II)V

    iget-object v0, p0, LCi/c$b;->b:LCi/c;

    iget v1, p0, LCi/c$b;->c:I

    add-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j()I
    .locals 1

    iget v0, p0, LCi/c$b;->e:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LCi/c$b;->v(II)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public v(II)LCi/c;
    .locals 3

    iget v0, p0, LCi/c$b;->e:I

    invoke-static {p1, p2, v0}, LHi/d;->c(III)V

    new-instance v0, LCi/c$b;

    iget-object v1, p0, LCi/c$b;->b:LCi/c;

    iget v2, p0, LCi/c$b;->c:I

    add-int/2addr p1, v2

    add-int/2addr v2, p2

    invoke-direct {v0, v1, p1, v2}, LCi/c$b;-><init>(LCi/c;II)V

    return-object v0
.end method
