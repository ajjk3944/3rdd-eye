.class final Lcom/ui/wifiman/model/wmw/j$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;->t(Lgg/i;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/j$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$i;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/j$i;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/j$i;->a:Lcom/ui/wifiman/model/wmw/j$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/j$a;Lcom/ui/wifiman/model/wmw/b$c;)Lcom/ui/wifiman/model/wmw/j$a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/j$a;->a()Lcom/ui/wifiman/model/wmw/b$c;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$a;

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$c$b;

    if-nez v1, :cond_3

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$c$a;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$c$d;

    if-nez v1, :cond_2

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/b$c$c;

    if-nez v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x1

    :goto_2
    invoke-direct {v0, p1, p2, v1}, Lcom/ui/wifiman/model/wmw/j$a;-><init>(Lcom/ui/wifiman/model/wmw/b$c;Lcom/ui/wifiman/model/wmw/b$c;Z)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/j$a;

    check-cast p2, Lcom/ui/wifiman/model/wmw/b$c;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/wmw/j$i;->a(Lcom/ui/wifiman/model/wmw/j$a;Lcom/ui/wifiman/model/wmw/b$c;)Lcom/ui/wifiman/model/wmw/j$a;

    move-result-object p1

    return-object p1
.end method
