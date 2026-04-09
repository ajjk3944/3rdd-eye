.class public final Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/ui/component/network/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/a$e$a$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ls9/c$a;

.field private final c:Ls9/d$c;

.field private final d:Ls9/d$c;


# direct methods
.method constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "1"

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->a:Ljava/lang/String;

    new-instance v0, Ls9/c$a;

    sget v1, Lm8/a;->l0:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->b:Ls9/c$a;

    new-instance v0, Ls9/d$c;

    const-string v1, "Device 1"

    invoke-direct {v0, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->c:Ls9/d$c;

    new-instance v0, Ls9/d$c;

    const-string v1, "10.0.0.1"

    invoke-direct {v0, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->d:Ls9/d$c;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ls9/a;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->c()Ls9/c$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ls9/d;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->d()Ls9/d$c;

    move-result-object v0

    return-object v0
.end method

.method public c()Ls9/c$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->b:Ls9/c$a;

    return-object v0
.end method

.method public d()Ls9/d$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->d:Ls9/d$c;

    return-object v0
.end method

.method public e()Ls9/d$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->c:Ls9/d$c;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic getTitle()Ls9/d;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;->e()Ls9/d$c;

    move-result-object v0

    return-object v0
.end method
