.class final Lcom/ui/wmw/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a;->h()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/a;


# direct methods
.method constructor <init>(Lcom/ui/wmw/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/a$d;->a:Lcom/ui/wmw/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT8/a$d;)Lcom/ui/btle/v2/a;
    .locals 14

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LT8/a$d$d;

    if-nez v0, :cond_4

    instance-of v0, p1, LT8/a$d$c;

    if-nez v0, :cond_3

    instance-of v0, p1, LT8/a$d$b;

    if-nez v0, :cond_2

    instance-of v0, p1, LT8/a$d$a;

    if-nez v0, :cond_1

    instance-of v0, p1, LT8/a$d$e;

    if-eqz v0, :cond_0

    check-cast p1, LT8/a$d$e;

    invoke-virtual {p1}, LT8/a$d$e;->a()LT8/b$a;

    move-result-object p1

    move-object v0, p1

    check-cast v0, LV8/e$a;

    iget-object p1, p0, Lcom/ui/wmw/a$d;->a:Lcom/ui/wmw/a;

    invoke-static {p1}, Lcom/ui/wmw/a;->b(Lcom/ui/wmw/a;)Lh9/a;

    move-result-object v1

    iget-object p1, p0, Lcom/ui/wmw/a$d;->a:Lcom/ui/wmw/a;

    invoke-static {p1}, Lcom/ui/wmw/a;->e(Lcom/ui/wmw/a;)Ljava/util/UUID;

    move-result-object v2

    iget-object p1, p0, Lcom/ui/wmw/a$d;->a:Lcom/ui/wmw/a;

    invoke-static {p1}, Lcom/ui/wmw/a;->d(Lcom/ui/wmw/a;)Ljava/util/UUID;

    move-result-object v3

    iget-object p1, p0, Lcom/ui/wmw/a$d;->a:Lcom/ui/wmw/a;

    invoke-static {p1}, Lcom/ui/wmw/a;->g(Lcom/ui/wmw/a;)Ljava/util/UUID;

    move-result-object v4

    iget-object p1, p0, Lcom/ui/wmw/a$d;->a:Lcom/ui/wmw/a;

    invoke-static {p1}, Lcom/ui/wmw/a;->f(Lcom/ui/wmw/a;)Ljava/util/UUID;

    move-result-object v5

    new-instance p1, LV8/e$b;

    sget-object v6, Lcom/ui/wmw/WMWizard;->a:Lcom/ui/wmw/WMWizard;

    invoke-virtual {v6}, Lcom/ui/wmw/WMWizard;->a()LZ8/a$a;

    move-result-object v7

    const/16 v12, 0x1e

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v6, p1

    invoke-direct/range {v6 .. v13}, LV8/e$b;-><init>(LZ8/a$a;LV8/e$b$b;LV8/e$b$a;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v0 .. v6}, LT8/b$a;->a(Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LT8/b$b;)LT8/b;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.ui.btle.v2.BTLEv2Connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/btle/v2/a;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterDisabled;->a:Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterDisabled;

    throw p1

    :cond_2
    sget-object p1, Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterUnavailable;->a:Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$BluetoothAdapterUnavailable;

    throw p1

    :cond_3
    sget-object p1, Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$InsufficientPermission;->a:Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$InsufficientPermission;

    throw p1

    :cond_4
    sget-object p1, Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$LocationDisabled;->a:Lcom/ui/wmw/WMWizard$Error$RequirementNotMet$LocationDisabled;

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT8/a$d;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$d;->a(LT8/a$d;)Lcom/ui/btle/v2/a;

    move-result-object p1

    return-object p1
.end method
