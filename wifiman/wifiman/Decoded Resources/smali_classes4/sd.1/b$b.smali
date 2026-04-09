.class final Lsd/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b;-><init>(Ljd/b;LSd/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lsd/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsd/b$b;

    invoke-direct {v0}, Lsd/b$b;-><init>()V

    sput-object v0, Lsd/b$b;->a:Lsd/b$b;

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

    check-cast p1, Ll9/a;

    check-cast p2, Ll9/a;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lsd/b$b;->b(Ll9/a;Ll9/a;Ljava/lang/Boolean;)Lsd/a$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll9/a;Ll9/a;Ljava/lang/Boolean;)Lsd/a$a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internetSpeedTestSupported"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/g;

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lsd/b$a;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    if-eqz p1, :cond_1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lsd/b$a;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lsd/b$a;->b()LVd/a;

    move-result-object v0

    invoke-virtual {v0}, LVd/a;->b()Lxa/a$d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LCc/m;->a(Lxa/a$d;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    new-instance v0, Lsd/a$a$a;

    invoke-virtual {p2}, Lsd/b$a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2, p3}, Lsd/a$a$a;-><init>(Linet/ipaddr/g;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    sget-object v0, Lsd/a$a$b;->a:Lsd/a$a$b;

    :goto_1
    return-object v0
.end method
