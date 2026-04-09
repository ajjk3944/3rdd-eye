.class final LCd/g$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/g$e;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCd/g$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCd/g$e$a;

    invoke-direct {v0}, LCd/g$e$a;-><init>()V

    sput-object v0, LCd/g$e$a;->a:LCd/g$e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)LCd/g$b;
    .locals 4

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LDc/j;

    invoke-virtual {v2}, LDc/j;->C()LIc/a$a;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, LDc/j;->J()LQc/a$b;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, LDc/j;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LDc/j;->J()LQc/a$b;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LEc/t$b;->d()Linet/ipaddr/ipv4/b;

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    new-instance p1, LCd/g$b$a;

    invoke-direct {p1, v1}, LCd/g$b$a;-><init>(Linet/ipaddr/ipv4/b;)V

    goto :goto_1

    :cond_3
    sget-object p1, LCd/g$b$b;->a:LCd/g$b$b;

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LCd/g$e$a;->a(Ljava/util/Map;)LCd/g$b;

    move-result-object p1

    return-object p1
.end method
