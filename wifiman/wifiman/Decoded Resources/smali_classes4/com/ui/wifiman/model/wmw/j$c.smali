.class final Lcom/ui/wifiman/model/wmw/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;-><init>(Landroid/content/Context;Lmc/a;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/b$d;LP7/a;LT8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$c;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/j$c;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/j$c;->a:Lcom/ui/wifiman/model/wmw/j$c;

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

    check-cast p1, Lcom/ui/wifiman/model/wmw/b;

    check-cast p2, Lcom/ui/wifiman/model/wmw/b;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/wmw/j$c;->b(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/b;)Z

    move-result p1

    return p1
.end method

.method public final b(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/b;)Z
    .locals 1

    const-string v0, "prev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/ui/wifiman/model/wmw/b$a;

    if-eqz v0, :cond_0

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/b$a;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/ui/wifiman/model/wmw/b$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/wmw/b$a;->a()Lh9/a;

    move-result-object p2

    check-cast p1, Lcom/ui/wifiman/model/wmw/b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/b$a;->a()Lh9/a;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method
