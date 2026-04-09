.class final LH8/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/b$f;

    invoke-direct {v0}, LH8/b$f;-><init>()V

    sput-object v0, LH8/b$f;->a:LH8/b$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/n;)Ls9/d;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object p1

    invoke-virtual {p1}, LKd/a;->c()LKd/a$a;

    move-result-object p1

    invoke-virtual {p1}, LKd/a$a;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const v1, 0x7f1102eb

    invoke-direct {v0, v1, p1}, Ls9/d$b;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {p0, p1}, LH8/b$f;->a(Lcom/ui/wifiman/model/teleport/n;)Ls9/d;

    move-result-object p1

    return-object p1
.end method
