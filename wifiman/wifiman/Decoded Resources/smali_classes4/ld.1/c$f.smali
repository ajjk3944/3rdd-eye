.class final Lld/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lld/c;-><init>(LUb/a;Lmd/b;LP7/a;LQ7/a;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lld/c;


# direct methods
.method constructor <init>(Lld/c;)V
    .locals 0

    iput-object p1, p0, Lld/c$f;->a:Lld/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lld/a;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lld/c$f;->a:Lld/c;

    invoke-static {v0}, Lld/c;->e(Lld/c;)Lcom/ui/wifiman/model/support/a;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/support/a$a$c;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/support/a$a$c;-><init>(Lld/a;)V

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/support/a;->b(Lcom/ui/wifiman/model/support/a$a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lld/a;

    invoke-virtual {p0, p1}, Lld/c$f;->a(Lld/a;)V

    return-void
.end method
