.class final LG8/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG8/c$b;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LG8/c$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LG8/c$b$a;

    invoke-direct {v0}, LG8/c$b$a;-><init>()V

    sput-object v0, LG8/c$b$a;->a:LG8/c$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/sso/auth/a;

    new-instance v0, Ll9/a;

    instance-of v1, p1, Lcom/ui/sso/auth/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/ui/sso/auth/c;

    invoke-virtual {v1}, Lcom/ui/sso/auth/c;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/ui/sso/auth/d;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lcom/ui/sso/auth/d;

    invoke-virtual {v1}, Lcom/ui/sso/auth/d;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string/jumbo v1, "No Authentication available"

    const/4 v3, 0x6

    invoke-static {v1, v2, v2, v3, v2}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    move-object v1, v2

    :goto_0
    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    instance-of v3, p1, Lcom/ui/sso/auth/d;

    if-eqz v3, :cond_3

    check-cast p1, Lcom/ui/sso/auth/d;

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/ui/sso/auth/d;->c()Lcom/ui/sso/auth/d$b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/ui/sso/auth/d$b;->a()Ljava/lang/String;

    move-result-object v2

    :cond_4
    new-instance p1, Lqf/a$a;

    const-string/jumbo v3, "https://account.ui.com/?appview=true"

    invoke-direct {p1, v3, v1, v2}, Lqf/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LG8/c$b$a;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
