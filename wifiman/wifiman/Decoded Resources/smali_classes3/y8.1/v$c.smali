.class final Ly8/v$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/v;-><init>(Ldd/g;LZc/c;Lad/i;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/v$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/v$c;

    invoke-direct {v0}, Ly8/v$c;-><init>()V

    sput-object v0, Ly8/v$c;->a:Ly8/v$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljd/a$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljd/a$b;->b()LCc/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p1}, LCc/a;->i()Linet/ipaddr/ipv6/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ly8/v$c;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
