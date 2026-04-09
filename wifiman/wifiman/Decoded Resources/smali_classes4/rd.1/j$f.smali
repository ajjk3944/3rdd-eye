.class final Lrd/j$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;-><init>(LZc/f;Lmc/a;Lld/b;Lvc/b;Lcom/ui/wifiman/model/discovery/engine/bonjour/RxBonjour;Ldc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrd/j$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/j$f;

    invoke-direct {v0}, Lrd/j$f;-><init>()V

    sput-object v0, Lrd/j$f;->a:Lrd/j$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)Lrd/j$b;
    .locals 3

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->f()LZc/e$b;

    move-result-object v0

    sget-object v1, LZc/e$b;->CONNECTED:LZc/e$b;

    if-ne v0, v1, :cond_1

    new-instance v0, Lrd/j$b$a;

    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v1

    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, LZc/e;->c()LZc/e$a;

    move-result-object v2

    :cond_0
    invoke-direct {v0, v1, v2}, Lrd/j$b$a;-><init>(Lb8/c;LZc/e$a;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lrd/j$b$b;->a:Lrd/j$b$b;

    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, Lrd/j$f;->a(LZc/e;)Lrd/j$b;

    move-result-object p1

    return-object p1
.end method
