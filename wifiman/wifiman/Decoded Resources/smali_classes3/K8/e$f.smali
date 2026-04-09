.class final LK8/e$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LK8/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK8/e$f;

    invoke-direct {v0}, LK8/e$f;-><init>()V

    sput-object v0, LK8/e$f;->a:LK8/e$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/j;)Lrf/e;
    .locals 9

    const-string/jumbo v0, "myself"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object v5

    invoke-virtual {p1}, LCc/j;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Ls9/d$c;

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v6, v0

    goto :goto_0

    :cond_0
    new-instance p1, Ls9/d$b;

    const v0, 0x7f1100ae

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    move-object v6, p1

    :goto_0
    new-instance v7, Ls9/d$b;

    const p1, 0x7f110315

    invoke-direct {v7, p1}, Ls9/d$b;-><init>(I)V

    new-instance p1, Lrf/e;

    const-string/jumbo v4, "myself"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lrf/e;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/j;

    invoke-virtual {p0, p1}, LK8/e$f;->a(LCc/j;)Lrf/e;

    move-result-object p1

    return-object p1
.end method
