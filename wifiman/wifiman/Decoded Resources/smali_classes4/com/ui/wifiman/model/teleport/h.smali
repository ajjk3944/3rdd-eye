.class public abstract Lcom/ui/wifiman/model/teleport/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/teleport/h$a;,
        Lcom/ui/wifiman/model/teleport/h$b;,
        Lcom/ui/wifiman/model/teleport/h$c;,
        Lcom/ui/wifiman/model/teleport/h$d;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/h$b;

.field private static final b:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/h$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    new-instance v0, LFd/A;

    invoke-direct {v0}, LFd/A;-><init>()V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/model/teleport/h;->b:LYg/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wifiman/model/teleport/h;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/util/Comparator;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/model/teleport/h;->c()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()LYg/m;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/model/teleport/h;->b:LYg/m;

    return-object v0
.end method

.method private static final c()Ljava/util/Comparator;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/teleport/h$e;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/h$e;-><init>()V

    new-instance v1, Lcom/ui/wifiman/model/teleport/h$f;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/teleport/h$f;-><init>(Ljava/util/Comparator;)V

    new-instance v0, Lcom/ui/wifiman/model/teleport/h$g;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/h$g;-><init>(Ljava/util/Comparator;)V

    new-instance v1, Lcom/ui/wifiman/model/teleport/h$h;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/teleport/h$h;-><init>(Ljava/util/Comparator;)V

    new-instance v0, Lcom/ui/wifiman/model/teleport/h$i;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/teleport/h$i;-><init>(Ljava/util/Comparator;)V

    new-instance v1, Lcom/ui/wifiman/model/teleport/h$j;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/teleport/h$j;-><init>(Ljava/util/Comparator;)V

    return-object v1
.end method


# virtual methods
.method protected abstract B()LKd/a;
.end method

.method public abstract C()Z
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/h;->d(Lcom/ui/wifiman/model/teleport/h;)I

    move-result p1

    return p1
.end method

.method public d(Lcom/ui/wifiman/model/teleport/h;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method protected abstract g()Lcom/ui/wifiman/model/ubiquiti/console/e;
.end method

.method public final h()Z
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->B()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->k()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->B()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LKd/a$a;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final n()Lxa/a$d;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->m()Lxa/a$d;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->B()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LKd/a$a;->i()Lxa/a$d;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->B()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LKd/a$a;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final r()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->B()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LKd/a;->c()LKd/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LKd/a$a;->c()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final s()LFd/B;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->d()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->v()LFd/B;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->d()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->v()LFd/B;

    move-result-object v0

    sget-object v1, LFd/B;->REACHABLE:LFd/B;

    if-ne v0, v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->v()LFd/B;

    move-result-object v0

    sget-object v1, LFd/B;->UNSTABLE:LFd/B;

    if-ne v0, v1, :cond_3

    goto :goto_5

    :cond_3
    sget-object v1, LFd/B;->UNREACHABLE:LFd/B;

    goto :goto_5

    :cond_4
    :goto_2
    sget-object v1, LFd/B;->REACHABLE:LFd/B;

    goto :goto_5

    :cond_5
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->v()LFd/B;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->v()LFd/B;

    move-result-object v1

    goto :goto_5

    :cond_6
    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->d()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_3

    :cond_7
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->g()Lcom/ui/wifiman/model/ubiquiti/console/e;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e;->d()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, LFd/B;->REACHABLE:LFd/B;

    :goto_4
    move-object v1, v0

    goto :goto_5

    :cond_8
    sget-object v0, LFd/B;->UNREACHABLE:LFd/B;

    goto :goto_4

    :cond_9
    :goto_5
    return-object v1
.end method

.method public abstract t()LRd/a;
.end method

.method protected abstract v()LFd/B;
.end method

.method public abstract y()Lcom/ui/wifiman/model/teleport/n$b;
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/teleport/h;->B()LKd/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LKd/a;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
