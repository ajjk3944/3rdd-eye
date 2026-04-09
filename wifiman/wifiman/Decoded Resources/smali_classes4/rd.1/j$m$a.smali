.class final Lrd/j$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j$m;->a(Lrd/j$c;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/j;

.field final synthetic b:Lrd/j$c;


# direct methods
.method constructor <init>(Lrd/j;Lrd/j$c;)V
    .locals 0

    iput-object p1, p0, Lrd/j$m$a;->a:Lrd/j;

    iput-object p2, p0, Lrd/j$m$a;->b:Lrd/j$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrd/j$m$a;->a:Lrd/j;

    iget-object v1, p0, Lrd/j$m$a;->b:Lrd/j$c;

    check-cast v1, Lrd/j$c$b;

    invoke-virtual {v1}, Lrd/j$c$b;->a()Linet/ipaddr/g;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lrd/j;->l(Lrd/j;Lgg/i;Linet/ipaddr/g;)Lgg/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    return-object p1
.end method
