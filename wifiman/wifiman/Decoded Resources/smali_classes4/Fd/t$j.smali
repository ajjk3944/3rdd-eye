.class final LFd/t$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFd/t;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LFd/t$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LFd/t$j;

    invoke-direct {v0}, LFd/t$j;-><init>()V

    sput-object v0, LFd/t$j;->a:LFd/t$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ll9/a;

    check-cast p5, Ll9/a;

    invoke-virtual/range {p0 .. p5}, LFd/t$j;->b(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ll9/a;Ll9/a;)LFd/s$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ll9/a;Ll9/a;)LFd/s$a;
    .locals 1

    const-string v0, "teleportCloudAvailable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hasNetworkConnection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ui/wifiman/model/ubiquiti/console/b$a;

    invoke-virtual {p5}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Boolean;

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    new-instance p1, LFd/s$a$a$a;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-direct {p1, p2}, LFd/s$a$a$a;-><init>(Z)V

    goto :goto_2

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p1, LFd/s$a$c$d;->a:LFd/s$a$c$d;

    goto :goto_2

    :cond_1
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p5, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    sget-object p1, LFd/s$a$c$b;->a:LFd/s$a$c$b;

    goto :goto_2

    :cond_2
    instance-of p2, p4, Lcom/ui/wifiman/model/ubiquiti/console/b$a$c;

    if-nez p2, :cond_7

    instance-of p2, p4, Lcom/ui/wifiman/model/ubiquiti/console/b$a$a;

    if-nez p2, :cond_7

    instance-of p2, p4, Lcom/ui/wifiman/model/ubiquiti/console/b$a$b;

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    instance-of p2, p4, Lcom/ui/wifiman/model/ubiquiti/console/b$a$d;

    if-nez p2, :cond_5

    if-nez p4, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    sget-object p1, LFd/s$a$c$a;->a:LFd/s$a$c$a;

    goto :goto_2

    :cond_6
    sget-object p1, LFd/s$a$c$c;->a:LFd/s$a$c$c;

    goto :goto_2

    :cond_7
    :goto_1
    sget-object p1, LFd/s$a$b;->a:LFd/s$a$b;

    :goto_2
    return-object p1
.end method
