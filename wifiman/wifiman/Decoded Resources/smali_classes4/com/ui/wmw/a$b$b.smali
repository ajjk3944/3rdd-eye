.class final Lcom/ui/wmw/a$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a$b;->a(Ljava/util/concurrent/atomic/AtomicInteger;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/a$b$b;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lcom/ui/wmw/a$b$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/WMWizard$a$a;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$a$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wmw/WMWizard$a$a$a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ui/wmw/a$b$b;->a:Lkotlin/jvm/internal/N;

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a$a$a;

    invoke-virtual {p1}, Lcom/ui/wmw/WMWizard$a$a$a$a;->a()Lcom/ui/wmw/g;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object p1, p0, Lcom/ui/wmw/a$b$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/wmw/WMWizard$a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$b$b;->a(Lcom/ui/wmw/WMWizard$a$a;)V

    return-void
.end method
