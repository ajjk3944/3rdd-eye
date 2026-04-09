.class public final Lcom/ui/wifiman/ui/component/network/a$e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/ui/component/network/q$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/a$e$a;->a(Lz/f;LT/l;I)Lcom/ui/wifiman/ui/component/network/q$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lcom/ui/wifiman/ui/component/network/a$e$a$a$b;

.field private final b:Lmh/p;

.field private final c:Ljava/util/List;


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/a$e$a$a$b;-><init>()V

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a;->a:Lcom/ui/wifiman/ui/component/network/a$e$a$a$b;

    sget-object v0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$a;->a:Lcom/ui/wifiman/ui/component/network/a$e$a$a$a;

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a;->b:Lmh/p;

    new-instance v0, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/a$e$a$a$c;-><init>()V

    sget-object v1, Lcom/ui/wifiman/ui/component/network/q$a;->WIRED:Lcom/ui/wifiman/ui/component/network/q$a;

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/ui/component/network/a$e$a$a$d;

    invoke-direct {v1}, Lcom/ui/wifiman/ui/component/network/a$e$a$a$d;-><init>()V

    sget-object v2, Lcom/ui/wifiman/ui/component/network/q$a;->WIRELESS:Lcom/ui/wifiman/ui/component/network/q$a;

    invoke-static {v1, v2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v1

    filled-new-array {v0, v1}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic b()Lcom/ui/wifiman/ui/component/network/q$b;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/component/network/a$e$a$a;->d()Lcom/ui/wifiman/ui/component/network/a$e$a$a$b;

    move-result-object v0

    return-object v0
.end method

.method public c()Lmh/p;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a;->b:Lmh/p;

    return-object v0
.end method

.method public d()Lcom/ui/wifiman/ui/component/network/a$e$a$a$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/a$e$a$a;->a:Lcom/ui/wifiman/ui/component/network/a$e$a$a$b;

    return-object v0
.end method
