.class final LD8/v$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/v;->b(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/v;


# direct methods
.method constructor <init>(LD8/v;)V
    .locals 0

    iput-object p1, p0, LD8/v$i;->a:LD8/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Linet/ipaddr/g;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/v$i;->a:LD8/v;

    invoke-static {v0}, LD8/v;->i(LD8/v;)Li8/a;

    move-result-object v0

    new-instance v1, Li8/a$b$B$c$d;

    new-instance v2, LCd/j$c;

    invoke-direct {v2, p1}, LCd/j$c;-><init>(Linet/ipaddr/g;)V

    invoke-direct {v1, v2}, Li8/a$b$B$c$d;-><init>(LCd/j$c;)V

    const/4 p1, 0x1

    new-array p1, p1, [Li8/a$b;

    const/4 v2, 0x0

    aput-object v1, p1, v2

    invoke-interface {v0, p1}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Linet/ipaddr/g;

    invoke-virtual {p0, p1}, LD8/v$i;->a(Linet/ipaddr/g;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
