.class public final Luj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/d;


# instance fields
.field private final a:Luj/d;

.field private final b:Luj/d;


# direct methods
.method public constructor <init>(Luj/d;Luj/d;)V
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dst"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj/c;->a:Luj/d;

    iput-object p2, p0, Luj/c;->b:Luj/d;

    return-void
.end method


# virtual methods
.method public a(Lrj/m2;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctx"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luj/c;->a:Luj/d;

    invoke-interface {v0, p1, p2}, Luj/d;->a(Lrj/m2;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p0, Luj/c;->b:Luj/d;

    invoke-interface {v0, p1, p2}, Luj/d;->a(Lrj/m2;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public b()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/c;->a:Luj/d;

    invoke-interface {v0}, Luj/d;->b()Lorg/kodein/type/q;

    move-result-object v0

    return-object v0
.end method

.method public c()Lorg/kodein/type/q;
    .locals 1

    iget-object v0, p0, Luj/c;->b:Luj/d;

    invoke-interface {v0}, Luj/d;->c()Lorg/kodein/type/q;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/c;->a:Luj/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Luj/c;->b:Luj/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
