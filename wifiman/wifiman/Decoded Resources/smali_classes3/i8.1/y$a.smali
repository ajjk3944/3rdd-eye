.class final Li8/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/y;-><init>(Landroid/content/Context;Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/y;


# direct methods
.method constructor <init>(Li8/y;)V
    .locals 0

    iput-object p1, p0, Li8/y$a;->a:Li8/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Li8/y;)V
    .locals 0

    invoke-static {p0}, Li8/y$a;->c(Li8/y;)V

    return-void
.end method

.method private static final c(Li8/y;)V
    .locals 2

    invoke-static {p0}, Li8/y;->j(Li8/y;)LFg/a;

    move-result-object p0

    new-instance v0, Ll9/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Li8/y$a;->b(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;)Lgg/f;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    if-eqz p1, :cond_0

    iget-object v0, p0, Li8/y$a;->a:Li8/y;

    invoke-static {v0, p1}, Li8/y;->k(Li8/y;Landroid/content/Intent;)Lgg/n;

    move-result-object p1

    new-instance v0, Li8/y$a$a;

    iget-object v1, p0, Li8/y$a;->a:Li8/y;

    invoke-direct {v0, v1}, Li8/y$a$a;-><init>(Li8/y;)V

    invoke-virtual {p1, v0}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, Li8/y$a;->a:Li8/y;

    new-instance v1, Li8/x;

    invoke-direct {v1, v0}, Li8/x;-><init>(Li8/y;)V

    invoke-virtual {p1, v1}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
