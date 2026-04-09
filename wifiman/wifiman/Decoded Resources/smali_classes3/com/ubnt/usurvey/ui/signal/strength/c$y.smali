.class final Lcom/ubnt/usurvey/ui/signal/strength/c$y;
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
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/c$y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$y;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c$y;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$y;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$y;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Lcom/ubnt/usurvey/ui/signal/strength/a$a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lje/r$b$a;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$b;->a:Lcom/ubnt/usurvey/ui/signal/strength/a$a$a$b;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$y;->a(Lje/r;)Lcom/ubnt/usurvey/ui/signal/strength/a$a;

    move-result-object p1

    return-object p1
.end method
