.class final LSd/e$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSd/e$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSd/e$p;

    invoke-direct {v0}, LSd/e$p;-><init>()V

    sput-object v0, LSd/e$p;->a:LSd/e$p;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, LYg/s;

    invoke-virtual {p0, p1, p2}, LSd/e$p;->b(LYg/s;LYg/s;)Z

    move-result p1

    return p1
.end method

.method public final b(LYg/s;LYg/s;)Z
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->n()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/ubiquiti/console/e$b;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->n()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {p2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_3

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v3

    goto :goto_2

    :cond_3
    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v1, v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    :goto_2
    if-nez v0, :cond_5

    return v3

    :cond_5
    if-eqz p2, :cond_6

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    move v2, v3

    :goto_3
    return v2
.end method
