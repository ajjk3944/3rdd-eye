.class final Luj/u$b$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/u$b$a;->a()Luj/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luj/u;

.field final synthetic b:Luj/b;


# direct methods
.method constructor <init>(Luj/u;Luj/b;)V
    .locals 0

    iput-object p1, p0, Luj/u$b$a$a;->a:Luj/u;

    iput-object p2, p0, Luj/u$b$a$a;->b:Luj/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Luj/u$b$a$a;->a:Luj/u;

    invoke-virtual {v0}, Luj/u;->o()Lmh/l;

    move-result-object v0

    new-instance v1, Luj/k;

    iget-object v2, p0, Luj/u$b$a$a;->b:Luj/b;

    invoke-direct {v1, v2}, Luj/k;-><init>(Luj/b;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
