.class final LP8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/c;


# direct methods
.method constructor <init>(LP8/c;)V
    .locals 0

    iput-object p1, p0, LP8/c$a;->a:LP8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LDj/a;
    .locals 2

    const-string/jumbo v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/c$a;->a:LP8/c;

    invoke-static {v0}, LP8/c;->o0(LP8/c;)Lxa/o;

    move-result-object v0

    invoke-interface {v0}, Lxa/o;->b()Lgg/i;

    move-result-object v0

    new-instance v1, LP8/c$a$a;

    invoke-direct {v1, p1}, LP8/c$a$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lua/a$a;

    invoke-virtual {p1}, Lua/a$a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LP8/c$a;->a(Ljava/lang/String;)LDj/a;

    move-result-object p1

    return-object p1
.end method
