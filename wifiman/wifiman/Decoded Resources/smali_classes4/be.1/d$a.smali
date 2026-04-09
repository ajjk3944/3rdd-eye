.class public final Lbe/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbe/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/model/support/a;

.field private final b:Lfd/b;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/support/a;Lfd/b;)V
    .locals 1

    const-string v0, "supportFileDataCollector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedOkHttpClientHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/d$a;->a:Lcom/ui/wifiman/model/support/a;

    iput-object p2, p0, Lbe/d$a;->b:Lfd/b;

    return-void
.end method


# virtual methods
.method public a(Lbe/c$b;)Lbe/c;
    .locals 4

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbe/d$a;->a:Lcom/ui/wifiman/model/support/a;

    new-instance v1, Lcom/ui/wifiman/model/support/e;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/support/e;-><init>(Lbe/c$b;)V

    invoke-interface {v0, v1}, Lcom/ui/wifiman/model/support/a;->b(Lcom/ui/wifiman/model/support/a$a;)V

    new-instance v0, Lbe/d;

    invoke-virtual {p1}, Lbe/c$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lbe/c$b;->b()I

    move-result p1

    iget-object v2, p0, Lbe/d$a;->a:Lcom/ui/wifiman/model/support/a;

    iget-object v3, p0, Lbe/d$a;->b:Lfd/b;

    invoke-direct {v0, v1, p1, v2, v3}, Lbe/d;-><init>(Ljava/lang/String;ILcom/ui/wifiman/model/support/a;Lfd/b;)V

    return-object v0
.end method
