.class Lbg/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbg/b;->b2(LZf/d;IIILinet/ipaddr/c$a;Ljava/lang/Integer;ZZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Linet/ipaddr/c$a;

.field final synthetic g:Ljava/lang/Integer;


# direct methods
.method constructor <init>(IILinet/ipaddr/c$a;Ljava/lang/Integer;)V
    .locals 0

    iput p1, p0, Lbg/b$d;->d:I

    iput p2, p0, Lbg/b$d;->e:I

    iput-object p3, p0, Lbg/b$d;->f:Linet/ipaddr/c$a;

    iput-object p4, p0, Lbg/b$d;->g:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p3, 0x1

    iput-boolean p3, p0, Lbg/b$d;->a:Z

    iput p1, p0, Lbg/b$d;->b:I

    iput p2, p0, Lbg/b$d;->c:I

    return-void
.end method


# virtual methods
.method public a()LZf/d;
    .locals 4

    iget-boolean v0, p0, Lbg/b$d;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbg/b$d;->f:Linet/ipaddr/c$a;

    iget v1, p0, Lbg/b$d;->b:I

    iget-object v2, p0, Lbg/b$d;->g:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Linet/ipaddr/c$a;->g(ILjava/lang/Integer;)LZf/d;

    move-result-object v0

    iget v1, p0, Lbg/b$d;->b:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lbg/b$d;->b:I

    iget v3, p0, Lbg/b$d;->c:I

    if-gt v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lbg/b$d;->a:Z

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lbg/b$d;->a:Z

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbg/b$d;->a()LZf/d;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
