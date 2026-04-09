.class final Lcom/ubnt/usurvey/ui/signal/strength/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c;-><init>(Lje/u;Ly8/p;Ly8/d;Ly8/n;Ly8/m;LCd/f;Ly8/v;Lde/z;Lre/a;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$d;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c$d;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$d;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/a$b;)LDj/a;
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lre/a$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lre/a$b$a;

    invoke-virtual {p1}, Lre/a$b$a;->a()Lre/c;

    move-result-object p1

    invoke-interface {p1}, Lre/c;->b()Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$d$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$d$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lre/a$b$b;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lre/a$b;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$d;->a(Lre/a$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
