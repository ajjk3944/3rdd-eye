.class final LW/c$a;
.super LZg/d;
.source "SourceFile"

# interfaces
.implements LW/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:LW/c;

.field private final c:I

.field private final d:I

.field private e:I


# direct methods
.method public constructor <init>(LW/c;II)V
    .locals 0

    invoke-direct {p0}, LZg/d;-><init>()V

    iput-object p1, p0, LW/c$a;->b:LW/c;

    iput p2, p0, LW/c$a;->c:I

    iput p3, p0, LW/c$a;->d:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p2, p3, p1}, La0/d;->c(III)V

    sub-int/2addr p3, p2

    iput p3, p0, LW/c$a;->e:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LW/c$a;->e:I

    invoke-static {p1, v0}, La0/d;->a(II)V

    iget-object v0, p0, LW/c$a;->b:LW/c;

    iget v1, p0, LW/c$a;->c:I

    add-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j()I
    .locals 1

    iget v0, p0, LW/c$a;->e:I

    return v0
.end method

.method public subList(II)LW/c;
    .locals 3

    .line 2
    iget v0, p0, LW/c$a;->e:I

    invoke-static {p1, p2, v0}, La0/d;->c(III)V

    .line 3
    new-instance v0, LW/c$a;

    iget-object v1, p0, LW/c$a;->b:LW/c;

    iget v2, p0, LW/c$a;->c:I

    add-int/2addr p1, v2

    add-int/2addr v2, p2

    invoke-direct {v0, v1, p1, v2}, LW/c$a;-><init>(LW/c;II)V

    return-object v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LW/c$a;->subList(II)LW/c;

    move-result-object p1

    return-object p1
.end method
