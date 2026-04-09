.class final LD8/a$d;
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
.field public static final a:LD8/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/a$d;

    invoke-direct {v0}, LD8/a$d;-><init>()V

    sput-object v0, LD8/a$d;->a:LD8/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;LWc/b;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "publicIPState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "uispInfoFetch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->d()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p1, Ls9/d$c;

    invoke-direct {p1, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LWc/b;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkd/e;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkd/e;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Ls9/d$c;

    invoke-direct {p2, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

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

    invoke-virtual {p0, p1, p2}, LD8/a$d;->a(LWc/b;LWc/b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
