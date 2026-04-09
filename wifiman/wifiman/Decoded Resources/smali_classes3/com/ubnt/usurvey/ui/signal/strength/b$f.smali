.class final Lcom/ubnt/usurvey/ui/signal/strength/b$f;
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
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/b$f;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/b$f;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$f;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly8/c;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ly8/c;->b()Lgg/i;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$f$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$f$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$f;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
