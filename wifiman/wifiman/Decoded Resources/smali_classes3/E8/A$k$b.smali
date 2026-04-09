.class final LE8/A$k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A$k;->a(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/A;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method constructor <init>(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, LE8/A$k$b;->a:LE8/A;

    iput-object p2, p0, LE8/A$k$b;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, LE8/A$k$b;->c()V

    return-void
.end method

.method private static final c()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string/jumbo v2, "Speedtest result successfully reported to UISP"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LE8/A$k$b;->b(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "reportEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LE8/A$k$b;->a:LE8/A;

    invoke-static {p1}, LE8/A;->J0(LE8/A;)Lxd/g;

    move-result-object p1

    iget-object v0, p0, LE8/A$k$b;->b:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lxd/g;->e(Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    new-instance v0, LE8/B;

    invoke-direct {v0}, LE8/B;-><init>()V

    invoke-virtual {p1, v0}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method
