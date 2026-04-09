.class final LOa/b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOa/b;->a(Ljava/util/UUID;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/UUID;


# direct methods
.method constructor <init>(Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, LOa/b$b;->a:Ljava/util/UUID;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/sso/account/UIAccountManager$a;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LOa/b$b;->a:Ljava/util/UUID;

    invoke-interface {p1, v0}, Lcom/ui/sso/account/UIAccountManager$a;->b(Ljava/util/UUID;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/sso/account/UIAccountManager$a;

    invoke-virtual {p0, p1}, LOa/b$b;->a(Lcom/ui/sso/account/UIAccountManager$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
