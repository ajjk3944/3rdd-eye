.class final Lcom/ubnt/usurvey/ui/signal/strength/b$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/b;-><init>(LBc/a;Lde/z;Lcom/ui/wifiman/model/android/permissions/d;Ly8/g;Ly8/k;Ly8/u;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/b$r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/b$r;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/b$r;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$r;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$r;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/a$b;)Lcom/ubnt/usurvey/ui/signal/strength/a$a;
    .locals 1

    const-string/jumbo v0, "simState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LBc/a$b$b$c;

    if-nez v0, :cond_4

    instance-of v0, p1, LBc/a$b$b$b;

    if-nez v0, :cond_4

    instance-of v0, p1, LBc/a$b$b$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LBc/a$b$a$b;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$a;

    goto :goto_2

    :cond_1
    instance-of v0, p1, LBc/a$b$b$e;

    if-nez v0, :cond_3

    instance-of v0, p1, LBc/a$b$b$d;

    if-nez v0, :cond_3

    instance-of v0, p1, LBc/a$b$a$a;

    if-nez v0, :cond_3

    instance-of p1, p1, LBc/a$b$a$c;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/a$a$b;->a:Lcom/ubnt/usurvey/ui/signal/strength/a$a$b;

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$b;->a:Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$b;

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$b;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$r;->a(LBc/a$b;)Lcom/ubnt/usurvey/ui/signal/strength/a$a;

    move-result-object p1

    return-object p1
.end method
