.class final LD8/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/a$c;

    invoke-direct {v0}, LD8/a$c;-><init>()V

    sput-object v0, LD8/a$c;->a:LD8/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;LWc/b;)Ll9/a;
    .locals 8

    const-string/jumbo v0, "publicIPState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "uispInfoFetch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    sget-object v0, LL8/j;->a:LL8/j;

    invoke-virtual {v0, p2}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance p1, Ls9/c$b;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkd/e;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkd/e;->a()Ljava/net/URL;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Ls9/c$b;

    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v1

    const-string/jumbo p1, "toURI(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, p2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    new-instance p2, Ll9/a;

    invoke-direct {p2, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, LWc/b;

    invoke-virtual {p0, p1, p2}, LD8/a$c;->a(LWc/b;LWc/b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
