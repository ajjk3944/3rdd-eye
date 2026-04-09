.class final Lp8/i$z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp8/i;


# direct methods
.method constructor <init>(Lp8/i;)V
    .locals 0

    iput-object p1, p0, Lp8/i$z;->a:Lp8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp8/i$b;)Lgg/f;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "content"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, Lp8/i$b$c;

    if-nez v2, :cond_9

    instance-of v2, p1, Lp8/i$b$b;

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v2, p1, Lp8/i$b$a;

    if-eqz v2, :cond_8

    check-cast p1, Lp8/i$b$a;

    invoke-virtual {p1}, Lp8/i$b$a;->a()LLe/a$a;

    move-result-object p1

    instance-of v2, p1, LLe/a$a$f;

    if-eqz v2, :cond_1

    iget-object p1, p0, Lp8/i$z;->a:Lp8/i;

    invoke-static {p1}, Lp8/i;->M0(Lp8/i;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$D$g;->a:Li8/a$b$D$g;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto/16 :goto_2

    :cond_1
    instance-of v2, p1, LLe/a$a$a;

    if-eqz v2, :cond_2

    iget-object p1, p0, Lp8/i$z;->a:Lp8/i;

    invoke-static {p1}, Lp8/i;->M0(Lp8/i;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$D$b;->a:Li8/a$b$D$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_2
    instance-of v2, p1, LLe/a$a$d;

    if-eqz v2, :cond_3

    iget-object p1, p0, Lp8/i$z;->a:Lp8/i;

    invoke-static {p1}, Lp8/i;->L0(Lp8/i;)Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->BLUETOOTH:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_3
    instance-of v2, p1, LLe/a$a$b;

    if-eqz v2, :cond_4

    iget-object p1, p0, Lp8/i$z;->a:Lp8/i;

    invoke-static {p1}, Lp8/i;->M0(Lp8/i;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$D$e;->a:Li8/a$b$D$e;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_4
    instance-of v0, p1, LLe/a$a$c;

    if-eqz v0, :cond_5

    iget-object p1, p0, Lp8/i$z;->a:Lp8/i;

    invoke-static {p1}, Lp8/i;->L0(Lp8/i;)Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->LOCATION_FINE:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    goto :goto_2

    :cond_5
    instance-of v0, p1, LLe/a$a$e;

    if-nez v0, :cond_7

    instance-of p1, p1, LLe/a$a$g;

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp8/i$b;

    invoke-virtual {p0, p1}, Lp8/i$z;->a(Lp8/i$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
