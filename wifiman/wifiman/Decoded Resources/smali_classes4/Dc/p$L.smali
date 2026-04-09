.class final LDc/p$L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/p;-><init>(LZc/f;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LDc/p$L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LDc/p$L;

    invoke-direct {v0}, LDc/p$L;-><init>()V

    sput-object v0, LDc/p$L;->a:LDc/p$L;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LDc/p$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LDc/p$c;->a()LDc/k;

    move-result-object v0

    invoke-interface {v0}, LDc/k;->a()Lgg/i;

    move-result-object v0

    sget-object v1, LDc/p$L$c;->a:LDc/p$L$c;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    const-string v1, "just(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LDc/p$c;->b()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v2, LEc/t$c;->ICMP:LEc/t$c;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEc/t;

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    instance-of v2, p1, LKc/a;

    if-eqz v2, :cond_3

    move-object v1, p1

    check-cast v1, LKc/a;

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {v1}, LKc/a;->a()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    sget-object v1, LDc/p$L$a;->a:LDc/p$L$a;

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    sget-object p1, LDc/p$L$b;->a:LDc/p$L$b;

    invoke-virtual {v0, p1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LDc/p$L;->a(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
