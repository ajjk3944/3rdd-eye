.class final LM8/A$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$j;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ll9/a;

    check-cast p3, Lic/b;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, Ljava/lang/Boolean;

    check-cast p6, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p6}, LM8/A$j;->b(Ljava/lang/Boolean;Ll9/a;Lic/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;Ll9/a;Lic/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lgg/i;
    .locals 1

    const-string/jumbo v0, "networksInRange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "feature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "wifiEnabled"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hasLocationPermission"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "locationEnabled"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LS8/c;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    const-string/jumbo v0, "just(...)"

    if-nez p5, :cond_0

    new-instance p1, LM8/A$b$a;

    sget-object p2, LFf/d$a$a;->a:LFf/d$a$a;

    invoke-direct {p1, p2}, LM8/A$b$a;-><init>(LFf/d$a;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    if-nez p5, :cond_1

    new-instance p1, LM8/A$b$a;

    sget-object p2, LFf/d$a$b;->a:LFf/d$a$b;

    invoke-direct {p1, p2}, LM8/A$b$a;-><init>(LFf/d$a;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    const-wide/16 p5, 0x1388

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p5, p6, p1}, Lgg/i;->d2(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    new-instance p5, LM8/A$j$a;

    iget-object p6, p0, LM8/A$j;->a:LM8/A;

    invoke-direct {p5, p4, p6, p3, p2}, LM8/A$j$a;-><init>(Ljava/lang/Boolean;LM8/A;Lic/b;LS8/c;)V

    invoke-virtual {p1, p5}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, LM8/A$b$b;->a:LM8/A$b$b;

    invoke-virtual {p1, p2}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "startWithItem(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LM8/A$j;->a:LM8/A;

    invoke-static {p1, p3, p2}, LM8/A;->J0(LM8/A;Lic/b;LS8/c;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method
