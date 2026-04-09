.class final LCd/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/g;-><init>(LDc/e;Ltd/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCd/g$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCd/g$g;

    invoke-direct {v0}, LCd/g$g;-><init>()V

    sput-object v0, LCd/g$g;->a:LCd/g$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCd/g$b;

    check-cast p2, Ll9/a;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, LCd/g$g;->b(LCd/g$b;Ll9/a;Ljava/lang/Boolean;)LCd/f$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(LCd/g$b;Ll9/a;Ljava/lang/Boolean;)LCd/f$a;
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestSpeed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "started"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LCd/g$b$a;

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    check-cast p1, LCd/g$b$a;

    invoke-virtual {p1}, LCd/g$b$a;->a()Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-virtual {p2}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    sget-object v0, LW7/a;->b:LW7/a$a;

    invoke-virtual {v0, p2, p3}, LW7/a$a;->b(J)LW7/a;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    new-instance p3, LCd/f$a$a$b;

    invoke-direct {p3, p1, p2}, LCd/f$a$a$b;-><init>(Linet/ipaddr/ipv4/b;LW7/a;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    new-instance p3, LCd/f$a$a$a;

    check-cast p1, LCd/g$b$a;

    invoke-virtual {p1}, LCd/g$b$a;->a()Linet/ipaddr/ipv4/b;

    move-result-object p1

    invoke-direct {p3, p1}, LCd/f$a$a$a;-><init>(Linet/ipaddr/ipv4/b;)V

    goto :goto_1

    :cond_2
    sget-object p3, LCd/f$a$b;->a:LCd/f$a$b;

    :goto_1
    return-object p3
.end method
