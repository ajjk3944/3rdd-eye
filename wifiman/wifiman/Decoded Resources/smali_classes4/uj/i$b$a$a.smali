.class final Luj/i$b$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/i$b$a;->a()Luj/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luj/i;

.field final synthetic b:Luj/b;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Luj/i;Luj/b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Luj/i$b$a$a;->a:Luj/i;

    iput-object p2, p0, Luj/i$b$a$a;->b:Luj/b;

    iput-object p3, p0, Luj/i$b$a$a;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Luj/i$b$a$a;->a:Luj/i;

    invoke-static {v0}, Luj/i;->k(Luj/i;)Lmh/p;

    move-result-object v0

    iget-object v1, p0, Luj/i$b$a$a;->b:Luj/b;

    iget-object v2, p0, Luj/i$b$a$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
