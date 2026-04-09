.class final LA8/o$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LA8/o$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA8/o$g;

    invoke-direct {v0}, LA8/o$g;-><init>()V

    sput-object v0, LA8/o$g;->a:LA8/o$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    check-cast p2, Ljava/lang/Boolean;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Le7/f;

    invoke-virtual {p0, p1, p2, p3, p4}, LA8/o$g;->b(LWc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Le7/f;)LYe/d;

    move-result-object p1

    return-object p1
.end method

.method public final b(LWc/b;Ljava/lang/Boolean;Ljava/lang/Boolean;Le7/f;)LYe/d;
    .locals 1

    const-string/jumbo v0, "arCoreInitState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hasCamera"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hasCameraPermission"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "arSessionState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LWc/b$b;

    if-eqz v0, :cond_0

    sget-object p1, LYe/d$b$a;->a:LYe/d$b$a;

    goto :goto_1

    :cond_0
    instance-of v0, p1, LWc/b$a$b;

    if-nez v0, :cond_1

    sget-object p1, LYe/d$b$b$d;->a:LYe/d$b$b$d;

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_2

    sget-object p1, LYe/d$b$b$c;->a:LYe/d$b$b$c;

    goto :goto_1

    :cond_2
    check-cast p1, LWc/b$a$b;

    invoke-virtual {p1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Le7/b;->NOT_INSTALLED:Le7/b;

    if-ne p2, v0, :cond_3

    sget-object p1, LYe/d$b$b$a;->a:LYe/d$b$b$a;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Le7/b;->UNSUPPORTED:Le7/b;

    if-eq p2, v0, :cond_9

    invoke-virtual {p1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Le7/b;->ERROR:Le7/b;

    if-ne p1, p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, LYe/d$b$b$b;->a:LYe/d$b$b$b;

    goto :goto_1

    :cond_5
    instance-of p1, p4, Le7/f$a$c;

    if-eqz p1, :cond_6

    sget-object p1, LYe/d$b$b$c;->a:LYe/d$b$b$c;

    goto :goto_1

    :cond_6
    instance-of p1, p4, Le7/f$a$b;

    if-eqz p1, :cond_7

    sget-object p1, LYe/d$b$b$a;->a:LYe/d$b$b$a;

    goto :goto_1

    :cond_7
    instance-of p1, p4, Le7/f$a$a;

    if-eqz p1, :cond_8

    sget-object p1, LYe/d$b$b$d;->a:LYe/d$b$b$d;

    goto :goto_1

    :cond_8
    sget-object p1, LYe/d$a;->a:LYe/d$a;

    goto :goto_1

    :cond_9
    :goto_0
    sget-object p1, LYe/d$b$b$c;->a:LYe/d$b$b$c;

    :goto_1
    return-object p1
.end method
