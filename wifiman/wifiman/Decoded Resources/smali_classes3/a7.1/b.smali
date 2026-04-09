.class public final La7/b;
.super LY6/h;
.source "SourceFile"


# instance fields
.field private final a:LY6/h;


# direct methods
.method public constructor <init>(LY6/h;)V
    .locals 0

    invoke-direct {p0}, LY6/h;-><init>()V

    iput-object p1, p0, La7/b;->a:LY6/h;

    return-void
.end method


# virtual methods
.method public b(LY6/k;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, LY6/k;->d0()LY6/k$c;

    move-result-object v0

    sget-object v1, LY6/k$c;->NULL:LY6/k$c;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LY6/k;->T()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, La7/b;->a:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j(LY6/o;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p1}, LY6/o;->P()LY6/o;

    goto :goto_0

    :cond_0
    iget-object v0, p0, La7/b;->a:LY6/h;

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La7/b;->a:LY6/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".nullSafe()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
