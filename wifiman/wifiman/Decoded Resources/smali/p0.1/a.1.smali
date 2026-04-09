.class public final Lp0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lp0/c;

.field private b:Lp0/c;

.field private c:Lo/I;

.field private d:Lo/I;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lp0/a;)Lo/I;
    .locals 0

    iget-object p0, p0, Lp0/a;->c:Lo/I;

    return-object p0
.end method

.method public static final synthetic b(Lp0/a;)Lp0/c;
    .locals 0

    iget-object p0, p0, Lp0/a;->a:Lp0/c;

    return-object p0
.end method

.method public static final synthetic c(Lp0/a;)Lo/I;
    .locals 0

    iget-object p0, p0, Lp0/a;->d:Lo/I;

    return-object p0
.end method

.method public static final synthetic d(Lp0/a;)Lp0/c;
    .locals 0

    iget-object p0, p0, Lp0/a;->b:Lp0/c;

    return-object p0
.end method

.method public static final synthetic e(Lp0/a;Lp0/c;)V
    .locals 0

    iput-object p1, p0, Lp0/a;->a:Lp0/c;

    return-void
.end method

.method public static final synthetic f(Lp0/a;Lo/I;)V
    .locals 0

    iput-object p1, p0, Lp0/a;->d:Lo/I;

    return-void
.end method

.method public static final synthetic g(Lp0/a;Lp0/c;)V
    .locals 0

    iput-object p1, p0, Lp0/a;->b:Lp0/c;

    return-void
.end method

.method public static final synthetic h(Lp0/a;Z)V
    .locals 0

    iput-boolean p1, p0, Lp0/a;->e:Z

    return-void
.end method


# virtual methods
.method public final i(Lp0/c;)Z
    .locals 3

    iget-boolean v0, p0, Lp0/a;->e:Z

    if-nez v0, :cond_0

    const-string v0, "Only add dependencies during a tracking"

    invoke-static {v0}, Lm0/M0;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lp0/a;->c:Lo/I;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lo/I;->h(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lp0/a;->a:Lp0/c;

    if-eqz v0, :cond_2

    invoke-static {}, Lo/U;->a()Lo/I;

    move-result-object v0

    iget-object v2, p0, Lp0/a;->a:Lp0/c;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lo/I;->h(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1}, Lo/I;->h(Ljava/lang/Object;)Z

    iput-object v0, p0, Lp0/a;->c:Lo/I;

    iput-object v1, p0, Lp0/a;->a:Lp0/c;

    goto :goto_0

    :cond_2
    iput-object p1, p0, Lp0/a;->a:Lp0/c;

    :goto_0
    iget-object v0, p0, Lp0/a;->d:Lo/I;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lo/I;->x(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_3
    iget-object v0, p0, Lp0/a;->b:Lp0/c;

    if-eq v0, p1, :cond_4

    return v2

    :cond_4
    iput-object v1, p0, Lp0/a;->b:Lp0/c;

    const/4 p1, 0x0

    return p1
.end method
