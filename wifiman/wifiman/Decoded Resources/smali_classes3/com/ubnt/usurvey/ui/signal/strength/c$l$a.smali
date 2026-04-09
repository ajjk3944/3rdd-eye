.class final Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c$l;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldd/i;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p1}, Ldd/i;->e()Lb8/d;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldd/i;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$l$a;->a(Ldd/i;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
