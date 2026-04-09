.class final LA8/o$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;->A0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;


# direct methods
.method constructor <init>(LA8/o;)V
    .locals 0

    iput-object p1, p0, LA8/o$r;->a:LA8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYe/d;)Lgg/f;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "cntType"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, LYe/d$a;

    if-nez v2, :cond_5

    instance-of v2, p1, LYe/d$b$a;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    instance-of v2, p1, LYe/d$b$b$b;

    if-eqz v2, :cond_1

    iget-object p1, p0, LA8/o$r;->a:LA8/o;

    invoke-static {p1}, LA8/o;->Q0(LA8/o;)Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/android/permissions/a;->CAMERA:Lcom/ui/wifiman/model/android/permissions/a;

    filled-new-array {v0}, [Lcom/ui/wifiman/model/android/permissions/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/ui/wifiman/model/android/permissions/d;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of v2, p1, LYe/d$b$b$a;

    if-eqz v2, :cond_2

    iget-object p1, p0, LA8/o$r;->a:LA8/o;

    invoke-static {p1}, LA8/o;->U0(LA8/o;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$d$a;->a:Li8/a$b$d$a;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of v2, p1, LYe/d$b$b$c;

    if-eqz v2, :cond_3

    iget-object p1, p0, LA8/o$r;->a:LA8/o;

    invoke-static {p1}, LA8/o;->U0(LA8/o;)Li8/a;

    move-result-object p1

    new-array v1, v1, [Li8/a$b;

    sget-object v2, Li8/a$b$d$b;->a:Li8/a$b$d$b;

    aput-object v2, v1, v0

    invoke-interface {p1, v1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_3
    instance-of p1, p1, LYe/d$b$b$d;

    if-eqz p1, :cond_4

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYe/d;

    invoke-virtual {p0, p1}, LA8/o$r;->a(LYe/d;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
