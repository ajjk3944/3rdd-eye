.class Lbg/b$a;
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
.field a:Z

.field final synthetic b:Z

.field final synthetic c:Linet/ipaddr/c$a;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:Ljava/lang/Integer;

.field final synthetic i:LZf/d;


# direct methods
.method constructor <init>(ZLinet/ipaddr/c$a;IIIILjava/lang/Integer;LZf/d;)V
    .locals 0

    iput-boolean p1, p0, Lbg/b$a;->b:Z

    iput-object p2, p0, Lbg/b$a;->c:Linet/ipaddr/c$a;

    iput p3, p0, Lbg/b$a;->d:I

    iput p4, p0, Lbg/b$a;->e:I

    iput p5, p0, Lbg/b$a;->f:I

    iput p6, p0, Lbg/b$a;->g:I

    iput-object p7, p0, Lbg/b$a;->h:Ljava/lang/Integer;

    iput-object p8, p0, Lbg/b$a;->i:LZf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LZf/d;
    .locals 4

    invoke-virtual {p0}, Lbg/b$a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbg/b$a;->a:Z

    iget-boolean v0, p0, Lbg/b$a;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbg/b$a;->c:Linet/ipaddr/c$a;

    iget v1, p0, Lbg/b$a;->d:I

    iget v2, p0, Lbg/b$a;->e:I

    and-int/2addr v1, v2

    iget v2, p0, Lbg/b$a;->f:I

    iget v3, p0, Lbg/b$a;->g:I

    or-int/2addr v2, v3

    iget-object v3, p0, Lbg/b$a;->h:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2, v3}, Linet/ipaddr/c$a;->c(IILjava/lang/Integer;)LZf/d;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lbg/b$a;->i:LZf/d;

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lbg/b$a;->a:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbg/b$a;->a()LZf/d;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
